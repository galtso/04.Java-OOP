package TrafficLights;

public class Light {
    private Color color;

    public Light(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    //метод за смяна на цвета
    public void changeColor(){
        if (this.color == Color.RED){
            this.color = Color.GREEN;
        }else if (this.color == Color.GREEN){
            this.color = Color.YELLOW;
        }else {
            this.color = Color.RED;
        }
    }
}
