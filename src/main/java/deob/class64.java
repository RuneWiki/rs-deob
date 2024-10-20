package deob;

@ObfuscatedName("bs")
public class class64 implements Runnable {

    @ObfuscatedName("bs.s")
    public boolean field562 = true;

    @ObfuscatedName("bs.j")
    public Object field564 = new Object();

    @ObfuscatedName("bs.i")
    public int field572 = 0;

    @ObfuscatedName("bs.k")
    public int[] field565 = new int[500];

    @ObfuscatedName("bs.u")
    public int[] field566 = new int[500];

    @ObfuscatedName("bs.n")
    public long[] field567 = new long[500];

    public void run() {
        while (this.field562) {
            Object var1 = this.field564;
            synchronized (this.field564) {
                if (this.field572 < 500) {
                    this.field565[this.field572] = class55.field464;
                    this.field566[this.field572] = class55.field461;
                    this.field567[this.field572] = class55.field463;
                    this.field572++;
                }
            }
            class298.method4739(50L);
        }
    }
}
