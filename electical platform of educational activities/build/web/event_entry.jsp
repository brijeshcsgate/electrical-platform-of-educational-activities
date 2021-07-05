<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Event Entry</title>
        <link rel="stylesheet" href="epeaCSS.css">
    </head>
    <body>
        
 <div class="header"><%@include file="header_admin.jsp"%>
     <marquee width="700px" direction="left"  behavior="sliding" >
         <h3 style="color:red;"> List of Scholarships      &nbsp;&nbsp;&nbsp;
          INDIAN Idol junior Auditions   &nbsp;&nbsp;&nbsp;    
          DID super Moms &nbsp;&nbsp;&nbsp;
          CBSE Neet(AIPMT) 2019
         </h3> 
        </marquee>   


</div>

<section >
   
  <nav> <%@include file="navbar_admin.jsp"%>
  </nav>
        <article>              
             <fieldset style="background-color: lemonchiffon">
            
                <legend><h2>Event Entry</h2>
                
                </legend>   
                 <a href="userEntry.jsp">
                <button class="btn1 user" >New user</button>
                </a>
                <a href="event_entry.jsp">
                <button class="btn1 event">New Event</button>
                </a>
                <form action="event_entry" method="post" border="10px">
                    <table>
                    <tr><td>
                    E_title
                    </td><td><input type="text" name="e_title" value="" /></td>
                    <tr>
                        <td>
                    E_type</td>
                    <td><input type="text" name="e_type"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                    E_date</td>
                      <td>      <input type="text" name="e_date" value="" /></td>
                      </tr>
                      <tr><td>
                    E_eligibility</td>
                      <td><input type="text" name="e_eligibility" value="" />
                          </td></tr>
                    <tr><td>
                        Detail</td>
                       <td> <textarea name="e_detail" rows="5" ></textarea>
                    </td></tr>
                    </table><br/>
                    
                    <input type="submit" name="submit" value="Submit" /><br/><br/>
                    
                </form>
            </fieldset>     
        
           </article>
         </section>
        
<div class="footer">
<%@include file="footer.jsp"%>
</div>

    </body>
</html>
