package adapter;

public class UsbAdapter extends USB {
    private MemoryCard memoryCard;

    public UsbAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
        System.out.println("Adapter created.");
    }

    @Override
    public void read() {
        memoryCard.read();
    }
}
