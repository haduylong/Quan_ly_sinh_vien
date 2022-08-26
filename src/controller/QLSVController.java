package controller;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.ThiSinh;
import model.TinhThanh;
import view.QLSVview;

public class QLSVController implements ActionListener{
	QLSVview view;
	
	
	public QLSVController(QLSVview view){
		super();
		this.view = view;
	}
/*
 * nút thêm: xóa trắng dữ liệu trong các ô dữ liệu trống để điền thông tin
 * nút cập nhật: đưa dữ liệu từ table vào các ô dữ liệu thích hợp để sửa thông tin (chọn một hàng trong table rồi lấy dữ liệu)
 * nút lưu: đưa dữ liệu từ các ô dữ liệu vào table
 * nút xóa: chọn một hàng trong table rồi xóa dữ liệu của hàng đó
 * nút tìm: 
 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// các sự kiện xảy ra
		try {
			String actionCommand = e.getActionCommand();
			
			if(actionCommand.equals("Thêm mới")) 
			{
				this.view.xoaForm();
				this.view.model.setLuaChon("Thêm mới");
			}
			else if(actionCommand.equals("Lưu")) 
			{	// chức năng lưu đưa dữ liệu lên table
				ThiSinh ts = this.view.taoThiSinhTuTextFiled();
				// nếu chọn thêm mới sau đó lưu
				if(this.view.model.getLuaChon().equals("Thêm mới")||this.view.model.getLuaChon().equals("")) 
				{
					this.view.themSinhVien(ts);
					this.view.xoaForm();
				}
				else if(this.view.model.getLuaChon().equals("Cập nhật"))
				{	// cập nhật sau đó lưu
					int indexOfRow = this.view.table.getSelectedRow();
					this.view.setValueByIndexRow(indexOfRow);
					this.view.xoaForm();
					this.view.model.setLuaChon("");
				}
				else 
				{
					JOptionPane.showMessageDialog(view, "Kiểm tra cú pháp","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(actionCommand.equals("Cập nhật")) 
			{	//đưa dữ liệu từ bảng xuống
				this.view.model.setLuaChon("Cập nhật");
				this.view.fromTabletoTextField();
			}
			else if(actionCommand.equals("Xóa"))
			{	
				int indexOfRow = this.view.table.getSelectedRow();
				this.view.deleteRow(indexOfRow);		
			}
			else if(actionCommand.equals("Tìm"))
			{	// trước khi tìm phải thêm đầy đủ thông tin vào bảng
				this.view.timSinhVien();
			}
			else if(actionCommand.equals("Hủy Tìm")) 
			{
				this.view.huyTim();
			}
			else if(actionCommand.equals("About Me")) 
			{
				JOptionPane.showMessageDialog(view, "Đây là chương trình quản lý sinh viên");
			}
			else if(actionCommand.equals("Exit")) 
			{
				int option = JOptionPane.showConfirmDialog(view, "Bạn có muốn thoát không","Exit", JOptionPane.YES_NO_CANCEL_OPTION);
				if(option==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
			else if(actionCommand.equals("Open")) 
			{
				this.view.OpenFile();
			}
			else if(actionCommand.equals("Save")) 
			{
				this.view.saveFile();
			}
			else 
			{
				JOptionPane.showMessageDialog(view, "Kiểm tra cú pháp","Error",JOptionPane.ERROR_MESSAGE);
			}
		} catch (HeadlessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
