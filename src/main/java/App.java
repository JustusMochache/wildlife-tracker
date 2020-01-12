import models.Animal;
import models.Sighting;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Connection conn;
        staticFileLocation("/public");

        get("/", (req,res)->{
            Map<String, Object> model = new HashMap<>();
            model.put("allEndangered", EndangeredAnimal.getAllAnimals());
            model.put("allAnimals", Animal.getAllAnimals());
            model.put("allSightings", Sighting.allSightings());
            return new ModelAndView(model,"index.hbs");
        }, new HandlebarsTemplateEngine());
}
