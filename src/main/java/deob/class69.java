package deob;

@ObfuscatedName("bz")
public class class69 implements Runnable {

    @ObfuscatedName("bz.s")
    public boolean field793 = true;

    @ObfuscatedName("bz.g")
    public Object field789 = new Object();

    @ObfuscatedName("bz.m")
    public int field788 = 0;

    @ObfuscatedName("bz.h")
    public int[] field795 = new int[500];

    @ObfuscatedName("bz.i")
    public int[] field792 = new int[500];

    public void run() {
        while (this.field793) {
            Object var1 = this.field789;
            synchronized (this.field789) {
                if (this.field788 < 500) {
                    this.field795[this.field788] = class60.field691;
                    this.field792[this.field788] = class60.field692;
                    this.field788++;
                }
            }
            class193.method2520(50L);
        }
    }
}
