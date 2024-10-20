package deob;

@ObfuscatedName("l")
public class class7 implements Runnable {

    @ObfuscatedName("l.t")
    public boolean field118 = true;

    @ObfuscatedName("l.n")
    public Object field114 = new Object();

    @ObfuscatedName("l.q")
    public int field115 = 0;

    @ObfuscatedName("l.h")
    public int[] field117 = new int[500];

    @ObfuscatedName("l.k")
    public int[] field116 = new int[500];

    public void run() {
        while (this.field118) {
            Object var1 = this.field114;
            synchronized (this.field114) {
                if (this.field115 < 500) {
                    this.field117[this.field115] = class36.field486;
                    this.field116[this.field115] = class36.field487;
                    this.field115++;
                }
            }
            Statics.method101(50L);
        }
    }
}
