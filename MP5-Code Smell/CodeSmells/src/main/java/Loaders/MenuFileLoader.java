package Loaders;

import Entities.MenuItem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MenuFileLoader {

    private final static String[] HEADERS = {"MenuItem Name", "Type" ,"Price", "Calorie"};
    private String fileName;
    public MenuFileLoader(String fileName){
        this.fileName = fileName;
    }

    public File getDefaultFile() {
        return new File("./menu.txt");
    }
    static final int THREE=3;
    static final int TWO=2;
    public List<MenuItem> forLoop(List<List<String>> result){
        List<MenuItem> menuItems = new ArrayList<MenuItem>();
        for(List<String> line : result ){
            String dishName = line.get(0).trim();
            String dishType = line.get(1).toUpperCase().trim();
            double dishPrice = Double.parseDouble(line.get(TWO).trim());
            double dishCalorie = Double.parseDouble(line.get(THREE).trim());
            MenuItem menuItem = new MenuItem(dishName,dishType,dishPrice,dishCalorie);
            menuItems.add(menuItem);
        }
        return menuItems;
    }

    public List<MenuItem> load(){
        List<MenuItem> menuItems = new ArrayList<MenuItem>();
        int numberOfColumns = HEADERS.length;
        boolean useDefault = true;
        BufferedReader breader = null;
        File file;
        List<List<String>> result = new ArrayList<List<String>>();
        try {
            file = new File(fileName);
            if (!file.exists() && useDefault){
                file = getDefaultFile();
            }
            breader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            String line = breader.readLine();
            while(line != null){
                String[] entries = line.split(",");
                List<String> lineEntry = new ArrayList<String>();
                if(entries.length != numberOfColumns){
                    throw new IllegalArgumentException("The specified Columns are incorrect.");
                }
                for(String entry : entries){lineEntry.add(entry);}
                result.add(lineEntry);
                line = breader.readLine();
            }
        } catch (IOException e) {
            throw new IllegalArgumentException
                    ("The specified Components.Menu File does not exist.");
        } finally {
            try { if (breader != null) {breader.close();}
            } catch (IOException ex){ex.printStackTrace();
            }
        }
        return forLoop(result);
    }
}
