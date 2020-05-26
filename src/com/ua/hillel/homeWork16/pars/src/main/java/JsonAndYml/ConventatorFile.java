package JsonAndYml;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Stream;

public class ConventatorFile {
    static Map<String, Object> jsonMap;
    static Map<String, Object> yamlMap;

    public static void main(String[] args) throws IOException {
        conventatorFile("/Users/maksim/Документы/Hillel/ClasWork/src/com/ua/hillel/homeWork16/pars/src/main/resources/Example.json");
        conventatorFile("/Users/maksim/Документы/Hillel/ClasWork/src/com/ua/hillel/homeWork16/pars/src/main/resources/Example.yaml");
    }

    public static void conventatorFile(String fileWay) throws IOException {

        if (getExtension(fileWay).equals("yaml")) {

            Yaml yaml = new Yaml();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String yamlStr = readToFile(fileWay);
            yamlMap = yaml.load(yamlStr);
            String finalTextYaml = gson.toJson(yamlMap);
            writeNewToFile(getInformationOfFile(fileWay) + "NewFormatFile.json", finalTextYaml);

        } else if (getExtension(fileWay).equals("json")) {

            Yaml yaml = new Yaml();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            StringWriter writer = new StringWriter();
            String json = readToFile(fileWay);
            jsonMap = gson.fromJson(json, Map.class);
            yaml.dump(jsonMap, writer);
            String finalTextJson = writer.toString();
            writeNewToFile(getInformationOfFile(fileWay) + "NewFormatFile.yaml", finalTextJson);

        } else {
            System.err.println("Wrong extension,Pleas use correct  extension  fileName.yaml or fileName.json ");
        }
        System.out.println("Conversion completed correctly ");
    }

    public static String getInformationOfFile(String filename) {
        String root = "";

        int i = filename.lastIndexOf('/');
        if (i > 0) {
            root = filename.substring(0, i + 1);
        }

        return root;
    }

    public static String getExtension(String filename) {
        String extension = "";

        int i = filename.lastIndexOf('.');
        if (i > 0) {
            extension = filename.substring(i + 1);
        }
        return extension;
    }

    public static String readToFile(String path) {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(path), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }

    public static void writeNewToFile(String fileWay, String text) {
        BufferedWriter writer = null;
        try {

            writer = new BufferedWriter(new FileWriter(fileWay));
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.flush();
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
