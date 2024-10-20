package deob;

@ObfuscatedName("bv")
public class class73 implements Runnable {

    @ObfuscatedName("bv.h")
    public boolean field587 = true;

    @ObfuscatedName("bv.v")
    public Object field589 = new Object();

    @ObfuscatedName("bv.x")
    public int field592 = 0;

    @ObfuscatedName("bv.w")
    public int[] field588 = new int[500];

    @ObfuscatedName("bv.t")
    public int[] field590 = new int[500];

    @ObfuscatedName("bv.j")
    public long[] field586 = new long[500];

    public void run() {
        while (this.field587) {
            Object var1 = this.field589;
            synchronized (this.field589) {
                if (this.field592 < 500) {
                    this.field588[this.field592] = class64.field493;
                    this.field590[this.field592] = class64.field500;
                    this.field586[this.field592] = class64.field502;
                    this.field592++;
                }
            }
            class309.method3812(50L);
        }
    }
}
