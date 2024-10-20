package deob;

@ObfuscatedName("bi")
public class class59 implements Runnable {

    @ObfuscatedName("bi.y")
    public boolean field567 = true;

    @ObfuscatedName("bi.c")
    public Object field565 = new Object();

    @ObfuscatedName("bi.n")
    public int field566 = 0;

    @ObfuscatedName("bi.u")
    public int[] field568 = new int[500];

    @ObfuscatedName("bi.i")
    public int[] field564 = new int[500];

    @ObfuscatedName("bi.r")
    public long[] field569 = new long[500];

    public void run() {
        while (this.field567) {
            Object var1 = this.field565;
            synchronized (this.field565) {
                if (this.field566 < 500) {
                    this.field568[this.field566] = class49.field465;
                    this.field564[this.field566] = class49.field458;
                    this.field569[this.field566] = class49.field467;
                    this.field566++;
                }
            }
            class194.method1689(50L);
        }
    }
}
