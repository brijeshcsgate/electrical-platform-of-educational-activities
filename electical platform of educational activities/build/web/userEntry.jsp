
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User information</title><link rel="stylesheet" href="epeaCSS.css">
        
        

    </head>
    <body>
<div class="header"><%@include file="header_admin.jsp"%>
</div>

<section >
   
   

  <nav> <%@include file="navbar_admin.jsp"%>
  </nav>
  
    <article class="bg-img">       
            <fieldset style="background-color: lemonchiffon">
                <legend>User Information</legend><br/><br/>
               
                <a href="userEntry.jsp">
                <button class="btn1 user" >New user</button>
                </a>
                <a href="event_entry.jsp">
                <button class="btn1 event">New Event</button>
                </a>
         <form action="user_entry" method="post">
      <table>
          <tr> 
              <td> Name</td>
              <td><input type="text" name="uname" value="" size="100" /></td>
              </tr>
         <tr>   <td> event id</td>
          <td><input type="text" name="eid" value="" size="100"/></td>
          <tr>
              <td>
           email</td> 
              <td><input type="text" name="email" value="" size="100"/></td>
              </tr>
            
            <tr>
                <td>contact Num.</td>
            <td><input type="text" name="uphone" value="" pattern="[6789]{1}[0-9]{9}" /></td>
          </tr>
          <tr>
              <td>
            Address
            </td>
          <td><input type="text" name="uaddress" value="" size="100"/>
              </td></tr>
          
          <tr><td> query</td>
      <td><input type="text" name="uquery" value="" size="100"/></td>
</tr>          
         </table>   
            <br/><br/>
            <input type="submit" name="submit" value="Submit" />
            <input type="reset" name="reset" value="Reset" />
        </form></article>>
     </section>

<div class="footer">
<%@include file="footer.jsp"%>
</div>


    </body>
</html>
