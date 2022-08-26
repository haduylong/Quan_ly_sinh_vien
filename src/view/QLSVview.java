package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVmodel;
import model.ThiSinh;
import model.TinhThanh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.JRadioButton;

public class QLSVview extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel contentPane;
	public QLSVmodel model;
	public JTextField textFieldMaThiSinhTim;
	public JTable table;
	public JTextField textField_MaThiSinh;
	public JTextField textField_HoTen;
	public JTextField textField_NgaySinh;
	public JTextField textField_Mon1;
	public JTextField textField_Mon2;
	public JTextField textField_Mon3;
	public JComboBox comboBox_1;
	public ButtonGroup bg_gioiTinh;
	public JRadioButton Radio_nam;
	public JRadioButton Radio_nu;
	public JComboBox comboBox;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					QLSVview frame = new QLSVview();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public QLSVview() {
		this.model = new QLSVmodel();
		ActionListener ac = new QLSVController(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 1081, 813);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(5, 5, 1057, 33);
		contentPane.add(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Dialog", Font.PLAIN, 20));
		menuBar.add(menuFile);
		
		JMenuItem itemOpen = new JMenuItem("Open");
		itemOpen.addActionListener(ac);
		itemOpen.setFont(new Font("Dialog", Font.PLAIN, 16));
		menuFile.add(itemOpen);
		
		JMenuItem itemClose = new JMenuItem("Close");
		itemClose.addActionListener(ac);
		itemClose.setFont(new Font("Dialog", Font.PLAIN, 16));
		menuFile.add(itemClose);
		
		JMenuItem itemSave = new JMenuItem("Save");
		itemSave.addActionListener(ac);
		itemSave.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		menuFile.add(itemSave);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem itemExit = new JMenuItem("Exit");
		itemExit.addActionListener(ac);
		itemExit.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuFile.add(itemExit);
		
		JMenu menuAboutMe = new JMenu("About me");
		menuAboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuAboutMe);
		
		JMenuItem itemAboutMe = new JMenuItem("About Me");
		itemAboutMe.addActionListener(ac);
		itemAboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuAboutMe.add(itemAboutMe);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 114, 1052, 2);
		contentPane.add(separator_1);
		
		JLabel lbQueQuan = new JLabel("Qu\u00EA qu\u00E1n");
		lbQueQuan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbQueQuan.setBounds(15, 48, 109, 43);
		contentPane.add(lbQueQuan);
		
		
		comboBox = new JComboBox();
		comboBox.setBounds(119, 52, 153, 43);
		comboBox.addItem("");
		for(TinhThanh th : TinhThanh.dsTinh()) {
			comboBox.addItem(th.getTenTinh());
		}
		contentPane.add(comboBox);
		
		JLabel lbMaThiSinh = new JLabel("M\u00E3 th\u00ED sinh");
		lbMaThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbMaThiSinh.setBounds(317, 48, 109, 43);
		contentPane.add(lbMaThiSinh);
		
		textFieldMaThiSinhTim = new JTextField();
		textFieldMaThiSinhTim.setBounds(424, 48, 153, 43);
		contentPane.add(textFieldMaThiSinhTim);
		textFieldMaThiSinhTim.setColumns(10);
		
		JButton btnTim = new JButton("T\u00ECm");
		btnTim.addActionListener(ac);
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTim.setBounds(607, 48, 103, 43);
		contentPane.add(btnTim);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(5, 420, 1052, 2);
		contentPane.add(separator_1_1);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 th\u00ED sinh", "H\u1ECD t\u00EAn", "Qu\u00EA qu\u00E1n", "Ng\u00E0y sinh", "Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(0).setMinWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setPreferredWidth(88);
		table.getColumnModel().getColumn(3).setPreferredWidth(83);
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		table.setRowHeight(25);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(5, 165, 1052, 245);
		contentPane.add(scrollPane);
		
		
		
		
		JLabel lblDanhSchTh = new JLabel("Danh s\u00E1ch th\u00ED sinh");
		lblDanhSchTh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDanhSchTh.setBounds(20, 114, 164, 43);
		contentPane.add(lblDanhSchTh);
		
		JLabel lblDanhSchTh_1 = new JLabel("Thông tin thí sinh");
		lblDanhSchTh_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDanhSchTh_1.setBounds(5, 420, 189, 43);
		contentPane.add(lblDanhSchTh_1);
		
		JLabel lblDanhSchTh_1_1 = new JLabel("Mã thí sinh");
		lblDanhSchTh_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDanhSchTh_1_1.setBounds(5, 461, 164, 43);
		contentPane.add(lblDanhSchTh_1_1);
		
		JLabel lblDanhSchTh_1_1_1 = new JLabel("Họ tên");
		lblDanhSchTh_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDanhSchTh_1_1_1.setBounds(5, 514, 164, 43);
		contentPane.add(lblDanhSchTh_1_1_1);
		
		JLabel lblDanhSchTh_1_1_1_1 = new JLabel("Quê quán");
		lblDanhSchTh_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDanhSchTh_1_1_1_1.setBounds(5, 567, 164, 43);
		contentPane.add(lblDanhSchTh_1_1_1_1);
		
		JLabel lblDanhSchTh_1_1_1_2 = new JLabel("Ngày sinh");
		lblDanhSchTh_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDanhSchTh_1_1_1_2.setBounds(5, 620, 164, 43);
		contentPane.add(lblDanhSchTh_1_1_1_2);
		
		textField_MaThiSinh = new JTextField();
		textField_MaThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_MaThiSinh.setColumns(10);
		textField_MaThiSinh.setBounds(140, 465, 153, 43);
		contentPane.add(textField_MaThiSinh);
		
		textField_HoTen = new JTextField();
		textField_HoTen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_HoTen.setColumns(10);
		textField_HoTen.setBounds(140, 514, 153, 43);
		contentPane.add(textField_HoTen);
		
		textField_NgaySinh = new JTextField();
		textField_NgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_NgaySinh.setColumns(10);
		textField_NgaySinh.setBounds(140, 618, 153, 43);
		contentPane.add(textField_NgaySinh);
		
		JLabel lblDanhSchTh_1_1_1_3 = new JLabel("Môn 1");
		lblDanhSchTh_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDanhSchTh_1_1_1_3.setBounds(472, 518, 164, 43);
		contentPane.add(lblDanhSchTh_1_1_1_3);
		
		JLabel lblDanhSchTh_1_1_1_4 = new JLabel("Môn 2");
		lblDanhSchTh_1_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDanhSchTh_1_1_1_4.setBounds(472, 571, 164, 43);
		contentPane.add(lblDanhSchTh_1_1_1_4);
		
		JLabel lblDanhSchTh_1_1_1_5 = new JLabel("Môn 3");
		lblDanhSchTh_1_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDanhSchTh_1_1_1_5.setBounds(472, 620, 164, 43);
		contentPane.add(lblDanhSchTh_1_1_1_5);
		
		textField_Mon1 = new JTextField();
		textField_Mon1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_Mon1.setColumns(10);
		textField_Mon1.setBounds(594, 514, 153, 43);
		contentPane.add(textField_Mon1);
		
		textField_Mon2 = new JTextField();
		textField_Mon2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_Mon2.setColumns(10);
		textField_Mon2.setBounds(594, 565, 153, 43);
		contentPane.add(textField_Mon2);
		
		textField_Mon3 = new JTextField();
		textField_Mon3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_Mon3.setColumns(10);
		textField_Mon3.setBounds(594, 618, 153, 43);
		contentPane.add(textField_Mon3);
		
		JLabel lblDanhSchTh_1_1_2 = new JLabel("Giới tính");
		lblDanhSchTh_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDanhSchTh_1_1_2.setBounds(472, 465, 164, 43);
		contentPane.add(lblDanhSchTh_1_1_2);
		
		Radio_nam = new JRadioButton("Nam");
		Radio_nam.setFont(new Font("Tahoma", Font.BOLD, 20));
		Radio_nam.setBounds(592, 465, 103, 36);
		contentPane.add(Radio_nam);
		
		Radio_nu = new JRadioButton("Nữ");
		Radio_nu.setFont(new Font("Tahoma", Font.BOLD, 20));
		Radio_nu.setBounds(719, 465, 103, 36);
		contentPane.add(Radio_nu);
		
		bg_gioiTinh = new ButtonGroup();
		bg_gioiTinh.add(Radio_nam);
		bg_gioiTinh.add(Radio_nu);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1.setBounds(5, 673, 1052, 2);
		contentPane.add(separator_1_1_1);
		
		JButton btnThem = new JButton("Thêm mới");
		btnThem.addActionListener(ac);
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnThem.setBounds(30, 693, 123, 43);
		contentPane.add(btnThem);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(ac);
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXoa.setBounds(174, 693, 114, 43);
		contentPane.add(btnXoa);
		
		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.addActionListener(ac);
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCapNhat.setBounds(339, 693, 137, 43);
		contentPane.add(btnCapNhat);
		
		JButton btnLuu = new JButton("Lưu");
		btnLuu.addActionListener(ac);
		btnLuu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLuu.setBounds(529, 693, 103, 43);
		contentPane.add(btnLuu);
		
		JButton btnHuyBo = new JButton("Hủy bỏ");
		btnHuyBo.addActionListener(ac);
		btnHuyBo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHuyBo.setBounds(689, 693, 123, 43);
		contentPane.add(btnHuyBo);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_1.setBounds(140, 567, 153, 43);
		comboBox_1.addItem("");
		for(TinhThanh th : TinhThanh.dsTinh()) {
			comboBox_1.addItem(th.getTenTinh());
		}
		contentPane.add(comboBox_1);
		
		JButton btnHuyTim = new JButton("Hủy Tìm");
		btnHuyTim.addActionListener(ac);
		btnHuyTim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHuyTim.setBounds(739, 48, 109, 43);
		contentPane.add(btnHuyTim);
		this.setVisible(true);
	}
	
	public void xoaForm() {
		this.textField_HoTen.setText("");
		this.textField_MaThiSinh.setText("");
		this.textField_NgaySinh.setText("");
		this.textField_Mon1.setText("");
		this.textField_Mon2.setText("");
		this.textField_Mon3.setText("");
		this.bg_gioiTinh.clearSelection();
		this.comboBox_1.setSelectedIndex(-1);
	}
	
	public void themSinhVien(ThiSinh thiSinh) {
		this.model.themThiSinh(thiSinh);
		String[] data = {
				this.textField_MaThiSinh.getText(),
				this.textField_HoTen.getText(),
				this.comboBox_1.getSelectedItem().toString(),
				this.textField_NgaySinh.getText(),
				thiSinh.isGioiTinh()?"Nam":"Nữ",
				this.textField_Mon1.getText(),
				this.textField_Mon2.getText(),
				this.textField_Mon3.getText(),
		};
		DefaultTableModel tbmodel = (DefaultTableModel) table.getModel();
		tbmodel.addRow(data);
	}

	public TinhThanh getTinhById(int id) {
		// TODO Auto-generated method stub
		return TinhThanh.dsTinh().get(id);
	}
	
	public TinhThanh getTinhByTen(String ten) {
		int id = -1;
		for(int i=0;i<63;i++) {
			if(this.model.getDsThiSinh().get(i).getQueQuan().getTenTinh().equals(ten)) 
			{
				id = i;
				break;
			}
		}
		return this.model.getDsThiSinh().get(id).getQueQuan();
	}

	public void fromTabletoTextField() {
		// đưa dữ liệu từ bảng xuống
		DefaultTableModel tbmodel = (DefaultTableModel) table.getModel();
		int indexOfRow = this.table.getSelectedRow();
		this.textField_MaThiSinh.setText(tbmodel.getValueAt(indexOfRow, 0)+"");
		this.textField_HoTen.setText(tbmodel.getValueAt(indexOfRow, 1)+"");
		this.comboBox_1.setSelectedItem(tbmodel.getValueAt(indexOfRow, 2)+"");
		this.textField_NgaySinh.setText(tbmodel.getValueAt(indexOfRow, 3)+"");
		if(tbmodel.getValueAt(indexOfRow, 4).equals("Nam")) 
		{
			this.Radio_nam.doClick();
		}else 
		{
			this.Radio_nu.doClick();
		}
		this.textField_Mon1.setText(tbmodel.getValueAt(indexOfRow, 5)+"");
		this.textField_Mon2.setText(tbmodel.getValueAt(indexOfRow, 6)+"");
		this.textField_Mon3.setText(tbmodel.getValueAt(indexOfRow, 7)+"");
	}
	
	public ThiSinh fromTabletoThiSinh(int indexOfRow) {
		// đưa dữ liệu từ bảng xuống thành một thí sinh
		DefaultTableModel tbmodel = (DefaultTableModel) table.getModel();
		// tạo thí sinh từ table
		int id = Integer.valueOf(tbmodel.getValueAt(indexOfRow, 0)+"");
		String hoTen = tbmodel.getValueAt(indexOfRow, 1)+"";
		TinhThanh tt = this.getTinhByTen(tbmodel.getValueAt(indexOfRow, 2)+"");
		Date date = new Date(tbmodel.getValueAt(indexOfRow, 3)+"");
		boolean gioiTinh;
		if(tbmodel.getValueAt(indexOfRow, 4).equals("Nam")) 
		{
			gioiTinh = true;
		}else 
		{
			gioiTinh = false;
		}
		double diem1 = Double.valueOf(tbmodel.getValueAt(indexOfRow, 5)+"");
		
		double diem2 = Double.valueOf(tbmodel.getValueAt(indexOfRow, 6)+"");
		
		double diem3 = Double.valueOf(tbmodel.getValueAt(indexOfRow, 7)+"");
		
		ThiSinh ts = new ThiSinh(id, hoTen, tt, date, gioiTinh, diem1, diem2, diem3);
		return ts;
	}
	
	public void setValueByIndexRow(int index) {
		/*
		 * thêm sinh viên thông qua chỉ số của cột được chọn
		 * và cập nhật lại arraylist
		 */
		DefaultTableModel tbmodel = (DefaultTableModel) table.getModel();
		// mã số sv
		tbmodel.setValueAt(this.textField_MaThiSinh.getText(), index, 0);
		this.model.getDsThiSinh().get(index).setMaThiSinh(Integer.valueOf(this.textField_MaThiSinh.getText()));
		// ho tên sv
		tbmodel.setValueAt(this.textField_HoTen.getText(), index, 1);
		this.model.getDsThiSinh().get(index).setTenThiSinh(this.textField_HoTen.getText());
		// tỉnh thành
		tbmodel.setValueAt(this.comboBox_1.getSelectedItem(), index, 2);
		int id_Tinh = this.comboBox_1.getSelectedIndex();
		String ten_Tinh = this.comboBox_1.getSelectedItem()+"";
		TinhThanh tt = new TinhThanh(id_Tinh, ten_Tinh);
		this.model.getDsThiSinh().get(index).setQueQuan(tt);
		// ngày sinh
		tbmodel.setValueAt(this.textField_NgaySinh.getText(), index, 3);
		String str = this.textField_NgaySinh.getText()+"";
		Date date = new Date(str);
		this.model.getDsThiSinh().get(index).setNgaySinh(date);
		// giới tính
		String gt = null;
		if(Radio_nam.isSelected()) {
			gt = "Nam";
			this.model.getDsThiSinh().get(index).setGioiTinh(true);
		}else {
			gt = "Nữ";
			this.model.getDsThiSinh().get(index).setGioiTinh(false);
		}
		tbmodel.setValueAt(gt, index, 4);
		// điểm 3 môn
		tbmodel.setValueAt(this.textField_Mon1.getText(), index, 5);
		this.model.getDsThiSinh().get(index).setDiemMon1(Double.valueOf(this.textField_Mon1.getText()));
		tbmodel.setValueAt(this.textField_Mon2.getText(), index, 6);
		this.model.getDsThiSinh().get(index).setDiemMon2(Double.valueOf(this.textField_Mon2.getText()));
		tbmodel.setValueAt(this.textField_Mon3.getText(), index, 7);
		this.model.getDsThiSinh().get(index).setDiemMon3(Double.valueOf(this.textField_Mon3.getText()));
	}

	public ThiSinh taoThiSinhTuTextFiled() {
		// TODO Auto-generated method stub
		int id = Integer.valueOf(this.textField_MaThiSinh.getText());
		String hoTen = this.textField_HoTen.getText();
		int queQuan = this.comboBox_1.getSelectedIndex()-1;
		// lấy tỉnh thành trong Arralist bằng stt id
		TinhThanh tt = this.getTinhById(queQuan);
		Date ngaySinh = new Date(this.textField_NgaySinh.getText());
		String chonGioiTinh = this.bg_gioiTinh.getSelection()+"";
		boolean gioiTinh;
		if(this.Radio_nam.isSelected()) {
			gioiTinh = true;
		}else {
			gioiTinh = false;
		}
		double diem1 = Double.valueOf(this.textField_Mon1.getText());
		double diem2 = Double.valueOf(this.textField_Mon2.getText());
		double diem3 = Double.valueOf(this.textField_Mon3.getText());
		
		ThiSinh ts = new ThiSinh(id, hoTen, tt, ngaySinh, gioiTinh, diem1, diem2, diem3);
		return ts;
	}

	public void deleteRow(int index) {
		// xóa trong table
		// xóa trong arraylist
		DefaultTableModel tbmodel = (DefaultTableModel) table.getModel();
		int indexOfRow = this.table.getSelectedRow();
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa thí sinh này không?");
		if(luaChon==JOptionPane.YES_OPTION) 
		{
			this.model.getDsThiSinh().remove(this.fromTabletoThiSinh(indexOfRow));
			tbmodel.removeRow(index);		
		}
				
	}

	public void timSinhVien() {
		// TODO Auto-generated method stub
		DefaultTableModel tbmodel = (DefaultTableModel) table.getModel();
		while(true) {
			int soLuongRow = tbmodel.getRowCount();
			if(soLuongRow==0) 
			{
				break;
			}
			else 
			{
				try {
					tbmodel.removeRow(0);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		for(int i=0;i<this.model.getDsThiSinh().size();i++) {
			ThiSinh ts = this.model.getDsThiSinh().get(i);
			if(ts.getQueQuan().getTenTinh().equals(this.comboBox.getSelectedItem()+"")) {
				String[] data = {
						ts.getMaThiSinh()+"",
						ts.getTenThiSinh()+"",
						ts.getQueQuan().getTenTinh()+"",
						this.fromDateToString(ts.getNgaySinh()),
						ts.isGioiTinh()?"Nam":"Nữ",
						ts.getDiemMon1()+"",
						ts.getDiemMon2()+"",
						ts.getDiemMon3()+"",
				};
				tbmodel.addRow(data);
			}
		}
	}

	public void huyTim() {
		// thêm tất cả các sinh viên từ arraylist vào table
		DefaultTableModel tbmodel = (DefaultTableModel) table.getModel();
		
		while(true) {
			int soLuongRow = tbmodel.getRowCount();
			if(soLuongRow==0) 
			{
				break;
			}
			else 
			{
				try {
					tbmodel.removeRow(0);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
//		
//		for(int i=0;i<this.model.getDsThiSinh().size();i++) {
//			ThiSinh ts = this.model.getDsThiSinh().get(i);
//			String[] data = {
//					ts.getMaThiSinh()+"",
//					ts.getTenThiSinh()+"",
//					ts.getQueQuan().getTenTinh()+"",
//					this.fromDateToString(ts.getNgaySinh()),
//					ts.isGioiTinh()?"Nam":"Nữ",
//					ts.getDiemMon1()+"",
//					ts.getDiemMon2()+"",
//					ts.getDiemMon3()+"",
//			};
//			tbmodel.addRow(data);
//		}
		this.fromArrayListToTable();			
	}

	public void fromArrayListToTable() {
		// thêm tất cả các sinh viên từ arraylist vào table
		DefaultTableModel tbmodel = (DefaultTableModel) table.getModel();
		for(int i=0;i<this.model.getDsThiSinh().size();i++) {
			ThiSinh ts = this.model.getDsThiSinh().get(i);
			String[] data = {
					ts.getMaThiSinh()+"",
					ts.getTenThiSinh()+"",
					ts.getQueQuan().getTenTinh()+"",
					this.fromDateToString(ts.getNgaySinh()),
					ts.isGioiTinh()?"Nam":"Nữ",
					ts.getDiemMon1()+"",
					ts.getDiemMon2()+"",
					ts.getDiemMon3()+"",
			};
			tbmodel.addRow(data);
		}
		
	}
	
	public String fromDateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
	}

	public void OpenFile() {
		//Create a file chooser
		JFileChooser fc = new JFileChooser();
		//In response to a button click:
		int returnVal = fc.showOpenDialog(this);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            // lấy đường dẫn của file
            this.model.setTenFile(file.getAbsolutePath());
            // tải dữ liệu từ file vào Arrlist
            this.fromFileToArrayList(file);
            // đưa dữ liệu từ arraylist lên bảng
            this.huyTim();
        } 
	}

	private void fromFileToArrayList(File file) {
		// tải dữ liệu từ file vào arraylist
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object ds = ois.readObject();
			this.model.setDsThiSinh((ArrayList<ThiSinh>)ds);
			ois.close();
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public void saveFile() {
		// lưu file
		// nếu file chưa tồn tại <=> tenFile = "" thì chọn file
		if(this.model.getTenFile().length()>0) 
		{
			this.fromArrayListToFile(this.model.getTenFile());
		}
		else 
		{
			//Create a file chooser
			JFileChooser fc = new JFileChooser();
			//In response to a button click:
			int returnVal = fc.showOpenDialog(this);
			if(returnVal==JFileChooser.APPROVE_OPTION) 
			{	
				// tạo đối tượng file thaio tác vs file đã chọn
				File file = fc.getSelectedFile();
				this.model.setTenFile(file.getAbsolutePath());
				// ghi dữ liệu vào file
				this.fromArrayListToFile(file.getAbsolutePath());
			}			
		}
		
	}

	private void fromArrayListToFile(String tenFile) {
		// Đưa dữ liệu từ arraylist vào file
		try {
			
			FileOutputStream fos = new FileOutputStream(tenFile);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.model.getDsThiSinh());
			oos.close();
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
