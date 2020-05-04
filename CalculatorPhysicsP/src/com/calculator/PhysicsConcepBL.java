package com.calculator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.conection.App;

public class PhysicsConcepBL {

	private App app = new App();
	private Statement stmt = null;

	public PhysicsConcepBL() throws SQLException {
		stmt = app.connect().createStatement();
	}

	public void selecetBuku() {
		try {
			String sql = "SELECT * FROM buku";
			
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("Judul: " + rs.getString("judul"));
				System.out.println("Pengarang: " + rs.getString("pengarang"));
			}

			app.connect().close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insertBuku() {
		try {
			String sql = "INSERT INTO buku (judul, pengarang) VALUES ('Ruby', 'Petani Kode')";
			stmt.execute(sql);
			app.connect().close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("sukses simpan ke data base");
	}
	
	public void deleteBuku() {
		try {
			String sql ="delete from buku where id = 4";
			stmt.execute(sql);
			app.connect().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("sukses delete dari data base");
	}
	
	public void updateBuku() {
		try {
			String sql = "update buku set judul='php developer beginner' where id =7";
			stmt.executeUpdate(sql);
			app.connect().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("sukses update dari data base");
	}
	
}
