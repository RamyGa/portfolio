

let modal = document.getElementById("myModal");

let css = document.getElementById("css");

// Get the image and insert it inside the modal
let modalImg = document.getElementById("img01");
let captionText = document.getElementById("caption");
let image = document.querySelectorAll(".myImg");

image.forEach( Element => {
    Element.addEventListener('click', (e) => {

        const target = e.target;
        modal.style.display = "block";
        modalImg.src = target.src;
        captionText.innerHTML = target.alt;
    })
});

// Get the <span> element that closes the modal
let span2 = document.getElementsByClassName("close")[0];
span2.onclick = function() {
    modal.style.display = "none";

}

//----------------------projects modal----------------------
let projects = document.querySelectorAll(".projects");
let swapme_par_id = document.getElementById("swapme_par_id");
let swapme_button = document.getElementById("swapme_button");

let google_api_par_id = document.getElementById("google_api_par_id");
let google_api_button = document.getElementById("google_api_button");

let portfolio_par_id = document.getElementById("portfolio_par_id");


projects.forEach(Element =>{


    Element.addEventListener('click', (e) => {


        if(Element.id === 'swapme_project_button_id'){
            swapme_par_id.style.display = "inline-block";
            swapme_button.style.display = "inline-block";
        }

        if(Element.id === 'googlemaps_project_button_id'){
            google_api_par_id.style.display = "inline-block";
            google_api_button.style.display = "inline-block";
        }
        if(Element.id === 'portfolio_project_button_id'){
            portfolio_par_id.style.display = "inline-block";
        }

    });


});

let project_modal_close = document.getElementsByClassName("btn-close")[0];
project_modal_close.onclick = function() {
    swapme_par_id.style.display = "none";
    swapme_button.style.display = "none";
    google_api_par_id.style.display = "none";
    google_api_button.style.display = "none";
    portfolio_par_id.style.display = "none";



}
//-------------------------------------------------------------------------------------
let green_hover = document.querySelectorAll(".green_hover"); //test class placed in ramy's portfolio, and certificate image

let css_subtitle = document.getElementById("css");
let html_subtitle = document.getElementById("html");
let javascript_subtitle = document.getElementById("javascript");
let ajax_subtitle = document.getElementById("ajax");
let jquery_subtitle = document.getElementById("jquery");

let java_subtitle = document.getElementById("java");
let sql_subtitle = document.getElementById("sql");

let springboot_subtitle = document.getElementById("spring");
let thymeleaf_subtitle = document.getElementById("thymeleaf");
let bootstrap_subtitle = document.getElementById("bootstrap");
green_hover.forEach( Element => {

    Element.addEventListener('mouseover', (e) => {

        css_subtitle.style.color = "green";
        html_subtitle.style.color = "green";
        bootstrap_subtitle.style.color = "green";
        if(Element.id === 'certificate'){
            javascript_subtitle.style.color = "green";
        }
        if(Element.id === 'send_post_request_id'){
            css_subtitle.style.color = "green";
            html_subtitle.style.color = "green";
            bootstrap_subtitle.style.color = "green";
            springboot_subtitle.style.color = "green";
            java_subtitle.style.color = "green";
        }
        if(Element.id === 'send_to_database_id' || Element.id === 'enter_name_id'|| Element.id === 'enter_pokemon_id'){
            springboot_subtitle.style.color = "green";
            bootstrap_subtitle.style.color = "green";
            java_subtitle.style.color="green";
            sql_subtitle.style.color="green";
            jquery_subtitle.style.color="green";
            ajax_subtitle.style.color="green";
            javascript_subtitle.style.color = "green";
        }

    })

    Element.addEventListener('mouseout', (e) => {

        css_subtitle.style.color = "white";
        html_subtitle.style.color = "white";
        bootstrap_subtitle.style.color = "white";
        javascript_subtitle.style.color = "white";
        springboot_subtitle.style.color = "white";
        thymeleaf_subtitle.style.color = "white";
        java_subtitle.style.color="white";
        jquery_subtitle.style.color="white";
        ajax_subtitle.style.color="white";
        sql_subtitle.style.color="white";
    })
});





let send_button = document.querySelectorAll(".send_button");
let whathappened = document.getElementById("whathappened_json_id");
let whathappened_mysql_id = document.getElementById("whathappened_mysql_id");
let send_post_request_id = document.getElementById("send_post_request_id");
let enter_name_id = document.getElementById("enter_name_id");
let enter_pokemon_id = document.getElementById("enter_pokemon_id");

whathappened.style.display = "none";
whathappened_mysql_id.style.display = "none";

send_button.forEach( Element => {
    function updateDiv()
    {
        $( "#table-to-refresh" ).load(window.document.location);
    }
    Element.addEventListener('click', (e) => {


        if(Element.id === 'sendpost' ){
            if(send_post_request_id.value.length !== 0) {
                whathappened.style.display = "inline-block";
                updateDiv();
            }

        }
        if(Element.id === 'send_to_database_id'){

            if(enter_name_id.value.length !== 0 && enter_pokemon_id.value.length !== 0){
                whathappened_mysql_id.style.display = "inline-block";

            }

        }
    })


});


//----------------------------------------------------------------------------------


let click_here = document.querySelectorAll(".click_here");//all "click here" images contain the "click_here" class

let header_par_id = document.getElementById("header_par_id");//gets the first paragraph element
let certificate_par_id = document.getElementById("certificate_par_id");//gets the second paragraph element
let whathappened_json_par_id = document.getElementById("whathappened_json_par_id");//gets the second paragraph element
let whathappened_mysql_par_id = document.getElementById("whathappened_mysql_par_id");



click_here.forEach( Element => {//loop through all the elements that contain "click_here" class

    Element.addEventListener('click', (e) => {//if any of these elements are clicked...
        if (Element.id === 'ramys_port_click') {// if the elements id that's clicked equals 'ramys_port_click' then...
            header_par_id.style.display = "inline-block";//make that paragraph element appear
        }
        if (Element.id === 'certificate_click') {
            certificate_par_id.style.display = "inline-block";
        }
        if(Element.id === 'whathappened_json_id'){
            whathappened_json_par_id.style.display = "inline-block";
        }
        if(Element.id === 'whathappened_mysql_id'){
            whathappened_mysql_par_id.style.display = "inline-block";
        }



    })
});


let span = document.getElementsByClassName("btn-close")[0];
// When the user clicks on <span> (x), all elements display none
span.onclick = function() {

    header_par_id.style.display = "none";
    certificate_par_id.style.display = "none";
    whathappened_json_par_id.style.display = "none";
    whathappened_mysql_par_id.style.display = "none";
}











