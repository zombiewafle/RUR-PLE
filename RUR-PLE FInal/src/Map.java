import com.sun.corba.se.impl.presentation.rmi.IDLTypeException;

import javax.swing.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IDException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Map {
    private int columns;
    private int rows;
    private List<Walls>walls;
    private List<CoinsStack> coinsStacks;
    private Robot robot;
    private List<String> map;

    public Map(){
        columns = 0;
        rows = 0;
        walls = new ArrayList<>();
        coinsStacks = new ArrayList<>();
        robot = new Robot();
        map = new ArrayList<>();
    }
    public void readMap(){
        String path = " ";
        try {
            JFileChooser filesChooser = new JFileChooser();
            int retValue = ((JFileChooser) filesChooser).showDialog(new JPanel());
            if(retValue == JFileChooser.APPROVE_OPTION);
            {
                path = filesChooser.getSelectedFile().getPath();
            }
            Stream<String> lines = Files.lines(Paths.get(path));
            lines.forEach(s -> map.add(s));

            rows = map.size();
            columns = map.get(0).length();

            for(int i = 0; i < map.size(); i++){
                String[] getWalls = map.get(i).split("0*");
        }catch (IDException exception){
            System.out.println(exception);
        }
    }
    public void CreateMap(){
    }
}
