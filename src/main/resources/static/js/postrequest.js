$(document).ready(function () {
        $('#form').on('submit', function(e) {
            e.preventDefault();
           $.ajax({
               //returns action attribute name  || returns pathname
                url : $(this).attr('action') || window.location.pathname,
                type: "POST",
               //creates a URL encoded text string by serializing this forms values
                data: $(this).serialize(),

                success: function (res) {

                    $('#id').empty();
                    $('#name_in_list').empty();
                    $('#fav_pok').empty();

                    $.each(JSON.parse(res),function(key, val) {

                        $('#tr_data').append(
                            $('#id').append(val.id+ '<br/>') ,
                            $('#name_in_list').append(val.name+ '<br/>') ,
                            $('#fav_pok').append(val.favoritePokemon+'<br/>')
                        );
                    });
                },
                error: function (jXHR, textStatus, errorThrown) {
                    alert(errorThrown);
                }
            });
        });

    $('#email_form').on('submit', function(e) {
        e.preventDefault();
        $.ajax({
            //returns action attribute name  || returns pathname
            url : $(this).attr('action') || window.location.pathname,
            type: "POST",
            //creates a URL encoded text string by serializing this forms values
            data: $(this).serialize(),

            success: function (res) {

                $('#name').val("");
                $('#email').val("");
                $('#message').val("");

              $('#emailModal').modal('show')
            },
            error: function (jXHR, textStatus, errorThrown) {
                alert("Error");
            }
        });
    });
});






