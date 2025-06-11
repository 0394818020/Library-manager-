/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author Dat Huy
 */
public class NhanVien {
    private String maNV;
    private String name;
    private String email;
    private int yearOfBirth;
    private String number_phone;

    public NhanVien() {
    }

    public NhanVien(String maNV, String name, String email, int yearOfBirth, String number_phone) {
        this.maNV = maNV;
        this.name = name;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
        this.number_phone = number_phone;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getNumber_phone() {
        return number_phone;
    }

    public void setNumber_phone(String number_phone) {
        this.number_phone = number_phone;
    }
    
    
}
