import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        get("/hello", (request, response) ->

                "<p><a href='/favorite_photos' >P.S. Check out my favorite travel photos here.</a></p>"

        );


        get("/favorite_photos", (request, response) ->
                "Here are my photos"
        );
    }
}