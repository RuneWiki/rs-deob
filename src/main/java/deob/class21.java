package deob;

@ObfuscatedName("t")
public class class21 implements Runnable {

    @ObfuscatedName("t.x")
    public boolean field250 = true;

    @ObfuscatedName("t.j")
    public Object field254 = new Object();

    @ObfuscatedName("t.c")
    public int field255 = 0;

    @ObfuscatedName("t.d")
    public int[] field248 = new int[500];

    @ObfuscatedName("t.w")
    public int[] field251 = new int[500];

    public void run() {
        while (this.field250) {
            Object var1 = this.field254;
            synchronized (this.field254) {
                if (this.field255 < 500) {
                    this.field248[this.field255] = class116.field1808;
                    this.field251[this.field255] = class116.field1802 * 1476935015;
                    this.field255++;
                }
            }
            class162.method2485(50L);
        }
    }
}
