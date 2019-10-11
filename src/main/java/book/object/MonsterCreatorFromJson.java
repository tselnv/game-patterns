package book.object;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class MonsterCreatorFromJson {

    private String readLineByLineJava8(String filePath)
    {
        StringBuilder contentBuilder = new StringBuilder();
        try
        {
            Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8);
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

    private void createMonster(){
        String monsterJsonString = readLineByLineJava8("assets\\monsters.json");
        JSONObject obj = new JSONObject(monsterJsonString);

        ArrayList<Breed> monsters = new ArrayList<>();

        for (String k: obj.keySet()){
            JSONObject monster = obj.getJSONObject(k);
            int health =0;
            String attack = "";

            for (String mk: monster.keySet()){
                switch (mk){
                    case "health":
                        health = monster.getInt("health");
                        break;
                    case "attack":
                        attack = monster.getString("attack");
                        break;
                }
            }
            monsters.add(new Breed(null, health, attack));
        }
    }

    public static void main(String[] args) {
        MonsterCreatorFromJson monsterCreator = new MonsterCreatorFromJson();
        monsterCreator.createMonster();

    }
}
