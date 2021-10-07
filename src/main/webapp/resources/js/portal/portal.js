//file to portal view


var navs = Vue.component('app-nav',{
    template: '#navArea',
    data: function(){
        return {accesos : [
            {name: "Inicio", url: '/portal/inicio'},
            {name: "Acerca de", url: '/portal/acerca'},
            {name: "Programas", url: '/portal/programas'},
            {name: "Eventos", url: '/portal/fiestas'},
            {name: "Galeria", url: '/portal/galeria'},
            {name: "Contacto", url: '/portal/contacto'}
        ]};
    },
    methods: {
        cargaRuta: function(url){
            //var url = $(this).attr("data-url");
            console.log(url);
//            Vue.component('app-view', function (resolve, reject) {
//                Vue.$http.get(url, function(data, status, request){
//                    var parser = new DOMParser();
//                    var doc = parser.parseFromString(data, "text/html");
//                    resolve({
//                        template: doc
//                    });
//                });
//            });
        }
    }
});


var view = Vue.component('app-view',function(){
    data: {
        mensaje: "Hola";
    }
});

const app = new Vue({
    el: '#app',
    data: {
        mensaje: 'hola mundo from vuejs!',
        imagen: "http://laravelacademy.org/wp-content/uploads/2016/08/00-featured-vuejs-logo-simple-256x128.jpg",
    },
    //template: '#navArea',
    components: {
        navBar: navs,
        vista: view
    }
//    methods: {
//        cargaRuta: function(url){
//            //var url = $(this).attr("data-url");
//            alert(url);
//        }
//    }
//    computed: {
//        
//    },
//    ready: function(){
//        
//    }
});