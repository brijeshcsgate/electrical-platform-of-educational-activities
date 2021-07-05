<%@page import="DBConfig.JDBCFile"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ResultSet rs=null;
    try{
    rs=JDBCFile.executeQuery("select * from user_info");
    }
    
    catch(Exception ex){
        ex.printStackTrace();
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User_list</title>
        <link rel="stylesheet" href="epeaCSS.css">

    </head>
    <body>
        
<div class="header"><%@include file="header_admin.jsp"%>
</div>

<section >
   
   

  <nav> <%@include file="navbar_admin.jsp"%>
  </nav>
 
    <article style=" background-color: lightblue;"> <fieldset>
            <legend><h2>USER INFORMATION
                <a href="userEntry.jsp">
                <button class="btn1 user" >New user</button>
                </a>
              
                <a href="event_entry.jsp">
                <button class="btn1 event">New Event</button>
                </a>
 
                </h2>
            
            </legend><table border="0px">
            
            <tr>
                <th>User ID</th>
                <th>Event ID</th>
                <th>Name</th>
                <th>Contact Num.</th>
                <th>Email</th>
                <th>Address</th>
                <th>Query</th>
                
            </tr>
            <%while(rs.next()){%>
            
            <tr>
                <td><% out.print(rs.getString(1)); %></td>
                <td><% out.print(rs.getString(2)); %></td>
                <td><% out.print(rs.getString(3)); %></td>
                <td><% out.print(rs.getString(4)); %></td>
                  <td><% out.print(rs.getString(5)); %></td>
                    <td><% out.print(rs.getString(6)); %></td>
                <td><% out.print(rs.getString(7)); %></td>
                
                </tr>
            <% }rs.close();JDBCFile.closeAll(); %>
        </table>
        </fieldset>
        </article>>
     </section>

<div class="footer">
<%@include file="footer.jsp"%>
</div>
    </body>
</html>
