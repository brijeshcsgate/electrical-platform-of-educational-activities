<!DOCTYPE html>
<html lang="en">
<head>
<title>CSS Template</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="epeaCSS.css">
</head>
<body >

<div class="header"><%@include file="header.jsp"%><marquee width="700px" direction="left"  behavior="sliding" >
         <h3 style="color:red;"> List of Scholarships      &nbsp;&nbsp;&nbsp;
          INDIAN Idol junior Auditions   &nbsp;&nbsp;&nbsp;    
          DID super Moms &nbsp;&nbsp;&nbsp;
          CBSE Neet(AIPMT) 2019
         </h3> 
        </marquee>   


</div>

<section class="bg-img">
   
  <nav> <%@include file="navbar.jsp"%>
  </nav>
   
    <article>
        
        <table border="2px" style="background-color: dodgerblue;border-color:dodgerblue ">

        <tr style="background-color:dodgerblue"><th><h1> Auditions</h1></th><th></th></tr>   
  
            <tr>
                <!--th style="width:6%">No</th-->
                <th>Name</th>
                <th style="width:85%;">Conducted by</th>
               </tr>


            
                <tr>
                    <!--td></td-->
                    <td>
                 <img src="indian-idol-junior.jpg"  width="70px" height="70px">
                                
                        
                    </td>
                    <td><h4>Indian Idol Junior Auditions</h4>Indian idol junior Auditions 
                        will begin from April,2019 and will be held in Kolkata ,Delhi, Mumbai,
                        Chandigarh. The registration have opened on march 20,2019...<a href="Indian_idol.jsp">More Detail</a></td>
                   
                </tr>
                  <tr>
                    <!--td></td-->
                    <td>
                                                
                      <img src="master-chef-india-star-plus.jpg"  width="70px" height="70px">
   
                    </td>
                    <td><h4>MasterChef India Season 5 Auditions</h4>
                    MasterChef India Season 5 Registration are open ,get city wise audition details. It is a 
                    cooking show where anybody good at cooking can show their skill to everyday
                    in the country...<a href="master_chef.jsp">More Detail</a>
                    </td>
                   
                </tr>
                  <tr>
                    <!--td></td-->
                    <td>
                                                
                     <img src="did-supermoms.jpg"  width="70px" height="70px">
    
                    </td>
                    <td><h4>DID Super Moms </h4>
                    DID Super Moms will be telecasted on ZEE TV and entries are
                    invited from mothers in the age group and above i.e. born on or before 
                    15th march 1996....<a href="DID_superMoms.jsp">More Detail</a>
                    </td>
                   
                </tr>
                  <tr>
                    <!--td></td-->
                    <td>
                                                
                   <img src="Dance-on-Star-Plus.jpg"  width="70px" height="70px">
      
                    </td>
                    <td><h4>Remo D'Souza Dance Plus Auditions</h4>
                    Dance Plus Auditions is a dance reality show to be judged by 
                    Remo D'Souza. Audition in Mumbai and other cities.SMS Dance to S7827 to register 
                    for auditions...<a href="Danse_plus.jsp">More Detail</a>
                    </td>
                   
                </tr>
                  <tr>
                    <!--td></td-->
                    <td>
                                                
                <img src="dramebaaz.jpg"  width="70px" height="70px">
         
                    </td>
                    <td><h4>Indias Best Dramebaaz Season 3 Auditions-Hunt for the best actor</h4>
                    India's Best Dramebaaz is a talent hunt show puts children
                    in the age of 5-13 years through a series of task and 
                    challenges that will groom them as actor and test their creativity,
                    spotaneity and acting capabilities....<a href="I_Dramebaaz.jsp">More Detail</a>
                    </td>
                   
                </tr>
            
            
               
</table>
    </article>
     </section>

<div class="footer">
<%@include file="footer.jsp"%>
</div>

</body>
</html>
