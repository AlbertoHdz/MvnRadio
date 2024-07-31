$(function(){
    var url = "portal/inicio";
    ajaxContent(url);
   
});

function ajaxContent(url){
    console.log(url);
    let host = window.location.hostname;
    let path = window.location.pathname;
    
    if(host.indexOf("local")>= 0){
        //if(path.indexOf("mvn") < 0 ){
            url = "/mvnRadio"+url;
        //}
    }
    console.log("url nueva: ");
    console.log(url);
    $.ajax({
        url: url,
        type: "GET",
        success: function(data){
            $("#ajax-content").html(data); 
        },
        error: function(e1,e2,e3){
            console.log(e2);
        }
    });
}

$(document).off("click","a");
$(document).on("click","a",function(e){
    e.preventDefault();
    var url = $(this).attr("data-url");
    ajaxContent(url);
});

