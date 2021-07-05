<%@page import="DBConfig.JDBCFile"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ResultSet rs=null;
    try{
    rs=JDBCFile.executeQuery("select * from ev_info");
    }
    
    catch(Exception ex){
        ex.printStackTrace();
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Event_list</title>
        <link rel="stylesheet" href="epeaCSS.css">

    </head>
    <body>
 <div class="header"><%@include file="header_admin.jsp"%>
</div>

<section >
   
   

  <nav> <%@include file="navbar_admin.jsp"%>
  </nav>
  
    <article style=" background-color: lightblue;"> 
        <fieldset>
            <a href="userEntry.jsp">
                <button class="btn1 user" >New user</button>
                </a>
                <a href="event_entry.jsp">
                <button class="btn1 event">New Event</button>
                </a>
 
            <legend>EVENT INFORMATION</legend>   <table>
            <tr>
                <th>E_id</th>
                <th>Title</th>
                <th>Type</th>
                <th>Date</th>
                <th>Eligibility</th>
                <th>Detail</th>
            </tr>
            <%while(rs.next()){%>
            
            <tr>
                <td><% out.print(rs.getString(1)); %></td>
                <td><% out.print(rs.getString(2)); %></td>
                <td><% out.print(rs.getString(3)); %></td>
                <td><% out.print(rs.getString(4)); %></td>
                  <td><% out.print(rs.getString(5)); %></td>
                    <td><% out.print(rs.getString(6)); %></td>
                
                </tr>
            <% }rs.close();JDBCFile.closeAll(); %>
            </table></fieldset>
            
       </article>>
     </section>

<div class="footer">
<%@include file="footer.jsp"%>
</div> 
    </body>
</html>
