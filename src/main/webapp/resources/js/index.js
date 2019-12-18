$(function(){
    $.ajax({
        url: "portal/inicio",
        type: "GET",
        success: function(data){
            console.log("inside sucess");
            $("#ajax-content").html(data); 
        },
        error: function(e1,e2,e3){
            console.log(e2);
        }
    });
   
});

