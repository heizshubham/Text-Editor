//By Shubham Pandey @heizshubham

package Scrollbar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class TextEditor extends JFrame implements ActionListener{
	JMenuBar mb;
	JMenu fm,em;
	JMenuItem omi,smi;
	JTextArea ta;
	JCheckBoxMenuItem wr;
	TextEditor(){
		setVisible(true);
		setSize(500,500);
		setTitle("Text Editor");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		mb=new JMenuBar();		
		setJMenuBar(mb);
		fm=new JMenu("File");
		fm.setMnemonic(KeyEvent.VK_F);
		em=new JMenu("Edit");
		mb.add(fm);mb.add(em);

		wr = new JCheckBoxMenuItem("Wrap");
		em.add(wr);
		// omi=new JMenuItem("Open");
		// smi=new JMenuItem("Save");
		

		omi=new JMenuItem("Open", KeyEvent.VK_F);
		omi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		smi=new JMenuItem("Save");
		
		ta=new JTextArea();
		add(new JScrollPane(ta),"Center");
		
		omi.addActionListener(this);
		smi.addActionListener(this);

		
		fm.add(omi); fm.add(smi);
		validate(); repaint();
	

	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==omi){
			JFileChooser jf=new JFileChooser();
			int opt=jf.showOpenDialog(this);
			if (opt==JFileChooser.APPROVE_OPTION){
				try{
				BufferedReader r=new BufferedReader(new FileReader(jf.getSelectedFile()));
				ta.read(r,null);
				}catch(Exception e){}
			}
		
		}

		if(ae.getSource()==smi){
			JFileChooser jf=new JFileChooser();
			int opt=jf.showSaveDialog(this);
			if (opt==JFileChooser.APPROVE_OPTION){
				try{
				BufferedWriter w=new BufferedWriter(new FileWriter(jf.getSelectedFile()));
				ta.write(w);
				}catch(Exception e){}
			}
		
		}
	}
	public static void main(String args[]){
		new TextEditor();
	}
}
