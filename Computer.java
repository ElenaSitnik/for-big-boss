public class Computer {
    private SystemUnit systemUnit;
    private Monitor monitor;
    private Mouse mouse;
    private Keyboard keyboard;
    private Loudspeakers loudspeakers;
    public Computer(SystemUnit systemUnit, Monitor monitor, Mouse mouse, Keyboard keyboard,
                    Loudspeakers loudspeakers) {
        this.systemUnit = systemUnit;
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.loudspeakers = loudspeakers;
        Room.count += 5;
    }

}
