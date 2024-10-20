package deob;

@ObfuscatedName("bm")
public class class71 implements Runnable {

    @ObfuscatedName("bm.b")
    public boolean field804 = true;

    @ObfuscatedName("bm.s")
    public Object field798 = new Object();

    @ObfuscatedName("bm.r")
    public int field796 = 0;

    @ObfuscatedName("bm.g")
    public int[] field800 = new int[500];

    @ObfuscatedName("bm.x")
    public int[] field795 = new int[500];

    public void run() {
        while (this.field804) {
            Object var1 = this.field798;
            synchronized (this.field798) {
                if (this.field796 < 500) {
                    this.field800[this.field796] = class60.field682;
                    this.field795[this.field796] = class60.field677;
                    this.field796++;
                }
            }
            class189.method2888(50L);
        }
    }
}
