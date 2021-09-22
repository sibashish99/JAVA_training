package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

import com.demo.utils.DbConnection;

public class UsingTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Connection cn= DbConnection.getOracleConnection();
        
        try {
			cn.setAutoCommit(false);
			
			 String sql="insert into student(rollNo,studentName,markScored)"+"values(2098,'tom',56)";
			 PreparedStatement pstmt = cn.prepareStatement(sql);
			 int row=pstmt.executeUpdate();
			 System.out.println(row+" added..");
			 
			 Savepoint sp1=cn.setSavepoint("sp1");
			
			 String sql1="insert into student(rollNo,studentName,markScored)"+"values(838,'tom1',06)";
			 PreparedStatement pstmt1 = cn.prepareStatement(sql1);
			 int row2=pstmt1.executeUpdate();
			 System.out.println(row2+" added..");
			 
			 Savepoint sp2=cn.setSavepoint("sp2");
			
			 String sql2="insert into student(rollNo,studentName,markScored)"+"values(33,'tom2',66)";
			 PreparedStatement pstmt2 = cn.prepareStatement(sql2);
			 int row3=pstmt2.executeUpdate();
			 System.out.println(row3+" added..");
			
			 Savepoint sp3=cn.setSavepoint("sp3");
			
			 cn.rollback(sp3);
			
			 cn.commit();
			 
			 pstmt.close();
			 pstmt1.close();
			 pstmt2.close();
			 cn.close();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
       
	}

}
