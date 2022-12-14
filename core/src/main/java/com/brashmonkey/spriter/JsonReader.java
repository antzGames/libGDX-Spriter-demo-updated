package com.brashmonkey.spriter;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/** Lightweight JSON parser. Uses org.json library.
 * @author mrdlink */
public class JsonReader {

    private JsonReader(){}

    public static JSONObject parse (String json) {
        return new JSONObject(json);
    }

    public static JSONObject parse (InputStream input) throws IOException{
        StringBuilder textBuilder = new StringBuilder();
        Reader reader = new BufferedReader(new InputStreamReader(input));
        int c = 0;
        while ((c = reader.read()) != -1) {
            textBuilder.append((char) c);
        }
        reader.close();

        return new JSONObject(textBuilder.toString());
    }
}
