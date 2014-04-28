
import java.awt.FlowLayout; 
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 
import javax.swing.table.DefaultTableModel;
import java.awt.Choice;
import javax.swing.JButton;
public class ResponseTable extends JFrame   {
    
    
    
    DefaultTableModel model; 
    JTable table; 
    String column[] = {"Providers","Platforms","Access Codes", };


    

    
    
    
    
    public void start(){
       
    //choice panel
    Choice pan = new Choice();     
      pan.add("Green yellow blue orange ");
      pan.add("Yellow");
      pan.add("Blue");
      
      JButton but = new JButton("Get");
     
      
        // model object passes the columns that will show in table 50 rows to be displayed 
    model = new DefaultTableModel(column,50);
    
    //JTable table  gets the value of model 
    table = new JTable(model)
    {@Override //ovrides the method isCellEditable, false states that no value in table is editable 
    public boolean isCellEditable (int arg0, int arg1){
        return false;}};
    
    
    
    
    // scroll pane with the value of table added this will give the user a scroll device
    JScrollPane pane = new JScrollPane(table);
   
    
    
    
    //set value method used so that any value can be placed at any particular row
    //sets row and column number and the string gives the name `both row and column start a 0
    table.setValueAt("TableTop", 0, 0);
    TestClass get = new TestClass();
   
   
    //pane added to frame, and values set for frame  
    add(pan); 
    add(but);
    
    add(pane);
     
     setVisible(true);
    setSize(600,700);
    setLayout(new FlowLayout( FlowLayout.CENTER,50,10));
    setResizable( false );
    setDefaultCloseOperation(EXIT_ON_CLOSE);


    }//end of method start

 



 
    
}//end of the class 


