package deob;

@ObfuscatedName("h")
public class class21 implements Runnable {

    @ObfuscatedName("h.d")
    public boolean field220 = true;

    @ObfuscatedName("h.c")
    public Object field216 = new Object();

    @ObfuscatedName("h.n")
    public int field218 = 0;

    @ObfuscatedName("h.q")
    public int[] field215 = new int[500];

    @ObfuscatedName("h.t")
    public int[] field219 = new int[500];

    public void run() {
        while (this.field220) {
            Object var1 = this.field216;
            synchronized (this.field216) {
                if (this.field218 < 500) {
                    this.field215[this.field218] = class116.field1806;
                    this.field219[this.field218] = class116.field1807;
                    this.field218++;
                }
            }
            class138.method15(50L);
        }
    }
}
