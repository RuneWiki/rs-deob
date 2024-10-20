package deob;

@ObfuscatedName("bd")
public class class69 implements Runnable {

    @ObfuscatedName("bd.p")
    public boolean field761 = true;

    @ObfuscatedName("bd.i")
    public Object field759 = new Object();

    @ObfuscatedName("bd.w")
    public int field767 = 0;

    @ObfuscatedName("bd.s")
    public int[] field760 = new int[500];

    @ObfuscatedName("bd.j")
    public int[] field763 = new int[500];

    public void run() {
        while (this.field761) {
            Object var1 = this.field759;
            synchronized (this.field759) {
                if (this.field767 < 500) {
                    this.field760[this.field767] = class60.field662;
                    this.field763[this.field767] = class60.field672;
                    this.field767++;
                }
            }
            class193.method4(50L);
        }
    }
}
