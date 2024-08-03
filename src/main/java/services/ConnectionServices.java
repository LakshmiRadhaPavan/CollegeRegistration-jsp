package services;
import models.ConnectionModels;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class ConnectionServices {
	private Connection conn;

	public ConnectionServices (Connection conn) {
		super();
		this.conn = conn;
	}
	public boolean addStudent(ConnectionModels s) {
		boolean f=false;
		
		try {
			String insert="insert into Students(id,name,email,ph_no,branch) values(?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(insert);
			ps.setInt(1,s.getId());
			ps.setString(2,s.getName());
			ps.setString(3, s.getEmail());
			ps.setLong(4, s.getPhoneNum());
			ps.setString(5, s.getBranch());
			int i=ps.executeUpdate();
			if(i>0) {
				f=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	}