        import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.Statement;
		import java.sql.SQLException;
		
public class ResumeApp {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt =null;
		ResultSet rs=null;
		ResultSet rs2=null;
		ResultSet rs3=null;
		ResultSet rs4=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeDB?"+ "user=root&password=password" );
			stmt= con.createStatement();
			String sql = "Select * from PersonalInformation";					
			rs=stmt.executeQuery(sql);
			rs.next();
				System.out.print(rs.getString("FirstName")+"\t");
				System.out.print(rs.getString("LastName"));
				System.out.println(rs.getString("EmailAddress"));
				System.out.println();
				System.out.println();
		}catch(SQLException e){
			e.printStackTrace();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}	
		}
			try{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeDB?"+ "user=root&password=password" );
				stmt= con.createStatement();
				String sql1 = "Select * from EducationlBackground";
			  rs2=stmt.executeQuery(sql1);
			rs2.next();
				System.out.println("Education");
				System.out.print(rs2.getString("Degree")+" in"+("Major")+",");
				System.out.print(rs2.getString("UniversityGraduated")+","+("YearGraduated"));
				System.out.println();
				System.out.println();
			
			}catch(SQLException e){
				e.printStackTrace();
				
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}finally{
				try{
					
					rs2.close();
					stmt.close();
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			try{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeDB?"+ "user=root&password=password" );
				 stmt= con.createStatement();
				 String sql3 = "Select * from Experience";
				 rs3=stmt.executeQuery(sql3);
			rs3.next();
				System.out.println("Experience");
				System.out.println(rs3.getString("Title"));
				System.out.println(rs3.getString("CompanyName")+","+("StartDate")+"-"+("endDate"));
				System.out.println(rs3.getString("Duty"));
				System.out.println();
				System.out.println();
			
			}catch(SQLException e){
				e.printStackTrace();
				
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}finally{
				try{
					rs3.close();
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
				try{
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeDB?"+ "user=root&password=password" );
					stmt= con.createStatement();
					String sql4 = "Select * from Skills";						
					rs4=stmt.executeQuery(sql4);
					rs4.next();
				System.out.println("Skills");
				System.out.println(rs4.getString("SkilledFields")+","+("Rating"));
										
			//}
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{
				
				rs4.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
				
			}
		}
	
			
