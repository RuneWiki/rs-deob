package deob;

@ObfuscatedName("bs")
public class class64 implements Runnable {

    @ObfuscatedName("bs.q")
    public boolean field591 = true;

    @ObfuscatedName("bs.w")
    public Object field590 = new Object();

    @ObfuscatedName("bs.e")
    public int field593 = 0;

    @ObfuscatedName("bs.p")
    public int[] field592 = new int[500];

    @ObfuscatedName("bs.k")
    public int[] field589 = new int[500];

    @ObfuscatedName("bs.l")
    public long[] field594 = new long[500];

    public void run() {
        while (this.field591) {
            Object var1 = this.field590;
            synchronized (this.field590) {
                if (this.field593 < 500) {
                    this.field592[this.field593] = class55.field493;
                    this.field589[this.field593] = class55.field488;
                    this.field594[this.field593] = class55.field483;
                    this.field593++;
                }
            }
            class299.method4167(50L);
        }
    }
}
