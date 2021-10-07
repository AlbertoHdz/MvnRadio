$(function(){
    var url = "portal/inicio";
    ajaxContent(url);
   
});

function ajaxContent(url){
    $.ajax({
        url: url,
        type: "GET",
        success: function(data){
            console.log(url);
            $("#ajax-content").html(data); 
        },
        error: function(e1,e2,e3){
            console.log(e2);
        }
    });
}

$(document).off("click",".menu-item a");
$(document).on("click",".menu-item a",function(){
    var url = $(this).attr("data-url");
    ajaxContent(url);
});

