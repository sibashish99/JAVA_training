package com.demo.daos;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.time.LocalDate;

import com.demo.entity.Student;
import com.demo.ifaces.CrudRepository;

public class StudentDaolmpl implements CrudRepository<Student,Integer> {

	private Connection cn;
	
	
	public StudentDaolmpl(Connection cn) {
		super();
		this.cn = cn;
	}

	@Override
	public boolean add(Student t) {
		// TODO Auto-generated method stub
		String sql = "insert into student values(?,?,?,?)";
		int rowAdded=0;
		try(PreparedStatement pstmt = cn.prepareStatement(sql);) {
			pstmt.setInt(1, t.getRollNo());
			pstmt.setString(2, t.getStudentName());
			pstmt.setDate(3, Date.valueOf( t.getDateOfBirth()));
			pstmt.setDouble(4, t.getMarkScored());
			
			rowAdded = pstmt.executeUpdate();
				
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rowAdded==1?true:false;
	}

	@Override
	public List<Student> findAll()  {

		List<Student> sList = new ArrayList<>();
		
		String sql = "select * from  student";
		
	    try(PreparedStatement pstmt = cn.prepareStatement(sql);) {
	    	
	    	ResultSet rs = pstmt.executeQuery();
	    	while(rs.next()) {
	    		int rollNumber=rs.getInt("rollNo");
	    		String studentName=rs.getString("studentName");
	    	   	LocalDate dateOfBirth=rs.getDate("dateOfBirth").toLocalDate();
	    		double markScored=rs.getDouble("markScored");
	    		
	    		Student student= new Student(rollNumber,studentName,dateOfBirth,markScored);
	    		sList.add(student);
	    	}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return sList;
	}

	@Override
	public int update(Student t) {
		// TODO Auto-generated method stub
		int r=0;
		String sql="update student set studentName=?, markScored=?, where rollNo=?";
		try(PreparedStatement pstmt = cn.prepareStatement(sql);) {
			pstmt.setString(1,"Sibashish");
			pstmt.setDouble(2, 200);
			pstmt.setInt(3,t.getRollNo());
			
			r=pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return r;
	}

	@Override
	public boolean remove(Student t) {
		// TODO Auto-generated method stub
		
		String sql= "delete from student where rollno = ?";
		int rowDelete=0;
		try(PreparedStatement pstmt = cn.prepareStatement(sql);) {
			pstmt.setInt(1,t.getRollNo());
			rowDelete= pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return (rowDelete==1)?true:false;
	}

	@Override
	public Student findBtId(Integer e) {
		// TODO Auto-generated method stub
		String sql="select * from student where rollNo = ?";
		Student obj=null;
		try (PreparedStatement pstmt = cn.prepareStatement(sql);){
			pstmt.setInt(1, e);
			ResultSet rs = pstmt.executeQuery();
	    	if(rs.next()) {
	    		int rollNumber=rs.getInt("rollNo");
	    		String studentName=rs.getString("studentName");
	    	   	LocalDate dateOfBirth=rs.getDate("dateOfBirth").toLocalDate();
	    		double markScored=rs.getDouble("markScored");
	    		
	    		obj= new Student(rollNumber,studentName,dateOfBirth,markScored);
	    		
	    	}
			
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		return obj;
	}
     
}
