import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.net.URL;

public class Katalog {
    private static final Color boja = new Color(0, 0, 255);
    private final Map<String, ImageIcon> slikaMap;
    public Katalog() {
        String[] listaIminja = {"The Hobbit and the Lord of the Rings", "To Kill a Mockingbird", "TOSHIBA Encore WT8-A-102", "Versace",
            "Wayfarer Sunglasses", "Zodiac", "ACER VN7-791G", "ASUS G751JY-T7064D", "BlackBery Z10", "DELL Inspiron 5547", "Ebel",
            "Fifty Shades (Trilogy)", "Gucci", "Harry Potter (Complete)", "iPhone 6 PLUS 16GB Gold", "LENOVO IP Y50-70", "Men's Jacket",
            "Men's Pullover", "Men's Trousers", "Point of View", "Ray-Ban RB2132", "Samsung GALAXY Note", "Sony Xperia U",
            "Sony Xperia Z Ultra"};
        slikaMap = kreirajImageMap(listaIminja);
        JList l = new JList(listaIminja);
        l.setCellRenderer(new KatalogListRenderer());
        JScrollPane s = new JScrollPane(l);
        s.setPreferredSize(new Dimension(600, 440));
        JFrame ramka = new JFrame();
        ramka.add(s);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.pack();
        ramka.setLocationRelativeTo(null);
        ramka.setVisible(true);
    }
    public class KatalogListRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index,boolean isSelected, boolean cellHasFocus) {
            JLabel labela = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            labela.setIcon(slikaMap.get((String) value));
            labela.setHorizontalTextPosition(JLabel.RIGHT);
            labela.setFont(new Font("helvitica", Font.BOLD, 24));
            labela.setIconTextGap(12);
            labela.setOpaque(true);
            if(isSelected){
                setBackground(boja);
                setForeground(Color.WHITE);
            } else {
                setBackground(Color.WHITE);
                setForeground(Color.BLACK);
            }
            return labela;
        }
    }
    private Map<String, ImageIcon> kreirajImageMap(String[] lista) {
        Map<String, ImageIcon> map = new HashMap<>();
        try {
            map.put("The Hobbit and the Lord of the Rings", new ImageIcon(new URL("http://i.imgur.com/5Gsfyxb.jpg?1")));
            map.put("To Kill a Mockingbird", new ImageIcon(new URL("http://i.imgur.com/uhy8Vyg.jpg?1")));
            map.put("TOSHIBA Encore WT8-A-102", new ImageIcon(new URL("http://i.imgur.com/lerTt7D.jpg?1")));
            map.put("Versace", new ImageIcon(new URL("http://i.imgur.com/MHx0S5Q.jpg?1")));
            map.put("Wayfarer Sunglasses", new ImageIcon(new URL("http://i.imgur.com/BIOMXpz.jpg?1")));
            map.put("Zodiac", new ImageIcon(new URL("http://i.imgur.com/AzUY3KP.jpg?1")));
            map.put("ACER VN7-791G", new ImageIcon(new URL("http://i.imgur.com/yTXMpW5.jpg?1")));
            map.put("ASUS G751JY-T7064D", new ImageIcon(new URL("http://i.imgur.com/KM1SBAp.jpg?1")));
            map.put("BlackBery Z10", new ImageIcon(new URL("http://i.imgur.com/jNM9S2Y.png?1")));
            map.put("DELL Inspiron 5547", new ImageIcon(new URL("http://i.imgur.com/5eEbTku.jpg?1")));
            map.put("Ebel", new ImageIcon(new URL("http://i.imgur.com/wEx5m2O.jpg?1")));
            map.put("Fifty Shades (Trilogy)", new ImageIcon(new URL("http://i.imgur.com/Rhgo2xD.jpg?1")));
            map.put("Gucci", new ImageIcon(new URL("http://i.imgur.com/wBMU7xs.jpg?1")));
            map.put("Harry Potter (Complete)", new ImageIcon(new URL("http://i.imgur.com/RvQapRT.jpg?1")));
            map.put("iPhone 6 PLUS 16GB Gold", new ImageIcon(new URL("http://i.imgur.com/I60Qen0.png?1")));
            map.put("LENOVO IP Y50-70", new ImageIcon(new URL("http://i.imgur.com/BHO1vzb.jpg?1")));
            map.put("Men's Jacket", new ImageIcon(new URL("http://i.imgur.com/Mk7X6i1.jpg?1")));
            map.put("Men's Pullover", new ImageIcon(new URL("http://i.imgur.com/BHDPO3f.jpg?1")));
            map.put("Men's Trousers", new ImageIcon(new URL("http://i.imgur.com/7zJJJpL.jpg?1")));
            map.put("Point of View", new ImageIcon(new URL("http://i.imgur.com/ouMWaWx.jpg?1")));
            map.put("Ray-Ban RB2132", new ImageIcon(new URL("http://i.imgur.com/unSqqlU.jpg?1")));
            map.put("Samsung GALAXY Note", new ImageIcon(new URL("http://i.imgur.com/na6JE29.png?1")));
            map.put("Sony Xperia U", new ImageIcon(new URL("http://i.imgur.com/jbm47cL.png?1")));
            map.put("Sony Xperia Z Ultra", new ImageIcon(new URL("http://i.imgur.com/1eoAHHt.png?1")));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return map;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Katalog();
        });
    }
}