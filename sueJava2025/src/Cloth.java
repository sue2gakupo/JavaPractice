public class Cloth {
    // ❶ 把屬性封裝起來，用 private 關鍵字保護
    private String logo;
    private String color;
    private String size;

    // ❷ 建構子：讓你一開始就能設定衣服資訊
    public Cloth(String inputLogo, String inputColor, String inputSize) {
        this.logo = inputLogo;
        this.color = inputColor;
        this.size = inputSize;
    }

    // ❸ Getter 方法：用來讀取資訊
    public String getLogo() {
        return logo;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    // ❹ Setter 方法：用來修改資訊
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // 顯示衣服資訊
    public void showInfo() {
        System.out.println("Logo：" + this.logo + ", Color：" + this.color + ", Size：" + this.size);
    }
}
