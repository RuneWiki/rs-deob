package deob;

@ObfuscatedName("u")
public class class14 implements Runnable {

    @ObfuscatedName("u.f")
    public boolean field193 = true;

    @ObfuscatedName("u.e")
    public Object field200 = new Object();

    @ObfuscatedName("u.n")
    public int field192 = 0;

    @ObfuscatedName("u.t")
    public int[] field195 = new int[500];

    @ObfuscatedName("u.v")
    public int[] field190 = new int[500];

    public void run() {
        while (this.field193) {
            Object var1 = this.field200;
            synchronized (this.field200) {
                if (this.field192 < 500) {
                    this.field195[this.field192] = class144.field2193;
                    this.field190[this.field192] = class144.field2200;
                    this.field192++;
                }
            }
            class131.method2276(50L);
        }
    }
}
