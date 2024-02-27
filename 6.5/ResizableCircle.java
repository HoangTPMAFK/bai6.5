public class ResizableCircle extends Circle implements Resizeable {
    ResizableCircle (double radius) {
        this.radius = radius;
    }
    @Override
    public void resizeable(int percent) {
        this.radius = this.radius*percent/100;
    }
    public String toString() {
        return "ResizableCircle [Circle [radius=" + radius + "]]";
    }
}
