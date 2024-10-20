package deob;

@ObfuscatedName("bt")
public class class64 implements Runnable {

    @ObfuscatedName("bt.c")
    public boolean field560 = true;

    @ObfuscatedName("bt.x")
    public Object field557 = new Object();

    @ObfuscatedName("bt.t")
    public int field558 = 0;

    @ObfuscatedName("bt.g")
    public int[] field559 = new int[500];

    @ObfuscatedName("bt.l")
    public int[] field563 = new int[500];

    @ObfuscatedName("bt.u")
    public long[] field561 = new long[500];

    public void run() {
        while (this.field560) {
            Object var1 = this.field557;
            synchronized (this.field557) {
                if (this.field558 < 500) {
                    this.field559[this.field558] = class55.field462;
                    this.field563[this.field558] = class55.field463;
                    this.field561[this.field558] = class55.field464;
                    this.field558++;
                }
            }
            class298.method4811(50L);
        }
    }
}
