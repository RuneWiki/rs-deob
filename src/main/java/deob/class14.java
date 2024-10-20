package deob;

@ObfuscatedName("i")
public class class14 implements Runnable {

    @ObfuscatedName("i.e")
    public boolean field195 = true;

    @ObfuscatedName("i.w")
    public Object field196 = new Object();

    @ObfuscatedName("i.f")
    public int field197 = 0;

    @ObfuscatedName("i.s")
    public int[] field199 = new int[500];

    @ObfuscatedName("i.p")
    public int[] field203 = new int[500];

    public void run() {
        while (this.field195) {
            Object var1 = this.field196;
            synchronized (this.field196) {
                if (this.field197 < 500) {
                    this.field199[this.field197] = class141.field2141;
                    this.field203[this.field197] = class141.field2142 * 20354633;
                    this.field197++;
                }
            }
            class128.method2645(50L);
        }
    }
}
