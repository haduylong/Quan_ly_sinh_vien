package test;

import javax.swing.UIManager;

import view.QLSVview;

public class Test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new QLSVview();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
