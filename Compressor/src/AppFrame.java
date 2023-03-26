import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;


public class AppFrame extends JFrame implements ActionListener {

	JButton compress;
	JButton decompress;
	
	
	AppFrame(){

		this.setSize(1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		compress = new JButton("Click here to Compress");
		compress.setBounds(400,400,400,70);
		compress.addActionListener(this);
		
		
		decompress = new JButton("Click here to Decompress");
		decompress.setBounds(1000,400,400,70);
		decompress.addActionListener(this);
		

		this.add(compress);
		this.add(decompress);

		this.setTitle("Compressor");
		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(Color.darkGray);
		this.setVisible(true);

	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == compress){
			
			JFileChooser jfile = new JFileChooser();
			int response = jfile.showSaveDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION){
			
				File file = new File(jfile.getSelectedFile().getAbsolutePath());
				
				try{
					compressor.compress(file);
				}
				
				catch(Exception ee){
					JOptionPane.showMessageDialog(null, ee.toString());
				}
			}
			
			
		}
		

		if(e.getSource() == decompress){
			
			JFileChooser jfile = new JFileChooser();
			int response = jfile.showSaveDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION){
			
				File file = new File(jfile.getSelectedFile().getAbsolutePath());
				
				try{
					decompressor.decompress(file);
				}
				
				catch(Exception ee){
					JOptionPane.showMessageDialog(null, ee.toString());
				}
			}
			
			
		}
		
	}

}
