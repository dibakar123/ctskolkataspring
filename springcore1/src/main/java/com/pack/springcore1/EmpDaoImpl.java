package com.pack.springcore1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class EmpDaoImpl implements EmpDao {
	@Autowired(required=true) 
	private JdbcTemplate jdbcTemplateObject;  
	
	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {  
		  this.jdbcTemplateObject = jdbcTemplateObject;  
	 }  
	
	public void create(Emp emp){
		String sql = "INSERT INTO emp  VALUES (?, ?, ?)";
		int result= jdbcTemplateObject.update(sql, new Object[]{emp.getEid(), emp.getEname(), emp.getEsal()} );  
		 if(result>0)
			 System.out.println("Created Record Name = " + emp.getEname());
		 else
			 System.out.println("Record is not inserted with Name = " +  emp.getEname());
	}
	
	public Emp getEmp(int empid){
		String sql = "SELECT * FROM emp WHERE eid = ?";
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Object object=  jdbcTemplateObject.query(sql,new Object[]{empid}, new ResultSetExtractor() {
				
				public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
					 if (rs.next()) {
						 Emp emp = new Emp();
						 emp.setEid(rs.getInt(1));
						 emp.setEname(rs.getString(2));
						 emp.setEsal(rs.getInt(3));
			             return emp;
			            }
			 
			            return null;
				}
			});
		   return (Emp)object;
	}
	
	public List<Emp> listEmployees() {
		   String sql = "SELECT * FROM emp"; 
		   List<Emp> emps = (List<Emp>) jdbcTemplateObject.query(sql, new EmpMapper());
		   return emps;
	}
}

class EmpMapper implements RowMapper<Emp> {  
	public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {  
		 Emp emp = new Emp(rs.getInt(1), rs.getString(2), rs.getInt(3));
      return emp;
	 }  
}	
	