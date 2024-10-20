package deob;

@ObfuscatedName("be")
public class class64 implements Runnable {

    @ObfuscatedName("be.a")
    public boolean field577 = true;

    @ObfuscatedName("be.t")
    public Object field576 = new Object();

    @ObfuscatedName("be.n")
    public int field568 = 0;

    @ObfuscatedName("be.q")
    public int[] field569 = new int[500];

    @ObfuscatedName("be.v")
    public int[] field570 = new int[500];

    @ObfuscatedName("be.l")
    public long[] field571 = new long[500];

    public void run() {
        while (this.field577) {
            Object var1 = this.field576;
            synchronized (this.field576) {
                if (this.field568 < 500) {
                    this.field569[this.field568] = class55.field466;
                    this.field570[this.field568] = class55.field467;
                    this.field571[this.field568] = class55.field456;
                    this.field568++;
                }
            }
            Statics.method4888(50L);
        }
    }
}
