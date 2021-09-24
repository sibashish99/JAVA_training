package com.training;
import java.lang.reflect.*;

import com.training.annotation.Column;
import com.training.annotation.Table;
import com.training.entiry.*;
public class Applicaton {
    public static void main(String[] args) {
		Student std= new Student();
		Class<?> cls= std.getClass();
		Table tableRef= cls.getAnnotation(Table.class);
		String tableName=tableRef.tableName();
		String sql= "select * from "+tableName ;
		System.out.println(sql);
		
		try {
			Field idField = cls.getDeclaredField("id");
			Column idCol =idField.getAnnotation(Column.class);
			
			String colName = idCol.name();
			String sql2= "select * from "+tableName+" where "+ colName+ " =?";
			System.out.println(sql2);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}
