package changingfont;
import java.awt.Frame;
import java.awt.Checkbox;
import java.awt.TextField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;

class CheckBoxFrame extends Frame{
    TextField tft;
    Checkbox chk1,chk2,chk3;
    int mode=0;
    CheckBoxFrame(){
        chk();
        setTitle("Change font Style");
        setSize(400,200);
        setLayout(null);
        setVisible(true);
        
    }
    public void chk(){
        tft = new TextField("Check for font Style");
        tft.setFont(new Font("Times New Roman",Font.PLAIN,16));
        chk1= new Checkbox("bold");
        chk2= new Checkbox("italic");
        chk3= new Checkbox("plain");
        
        tft.setBounds(50,40,220,30);
        chk1.setBounds(50,100,40,30);
        chk2.setBounds(110,100,40,30);
        chk3.setBounds(170,100,50,30);
        
        add(tft);
        add(chk1);
        add(chk2);
        add(chk3);
        
        chk1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                if(ie.getStateChange()==1){
                    mode +=Font.BOLD;
                    tft.setFont(new Font("Times New Roman",mode,16));
                }else{
                    mode -= Font.BOLD;
                    tft.setFont(new Font("Times New Roman",Font.PLAIN,16));
                }
            }
        });

        chk2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                if(ie.getStateChange()==1){
                    mode +=Font.ITALIC;
                    tft.setFont(new Font("Times New Roman",mode,16));
                }else{
                    mode -= Font.ITALIC;
                    tft.setFont(new Font("Times New Roman",mode,16));
                }
            }
        });

        chk3.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                if(ie.getStateChange()==1){
                    tft.setFont(new Font("Times New Roman",Font.PLAIN,16));
                }else{
                    mode -= Font.PLAIN;
                    tft.setFont(new Font("Times New Roman",mode,16));
                }
            }
        });
    }
}

public class ChangingFont {
    public static void main(String[] args) {
        new CheckBoxFrame();
    }
    
}
