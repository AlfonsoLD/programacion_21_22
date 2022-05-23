public class Office {
    private int codigo;
    private String ciudad;
    private String phone;

    public Office(int codigo, String ciudad, String phone) {
        this.codigo = codigo;
        this.ciudad = ciudad;
        this.phone = phone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Office{" +
                "codigo=" + codigo +
                ", ciudad='" + ciudad + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
