package deob;

@ObfuscatedName("bn")
public class class64 implements Runnable {

    @ObfuscatedName("bn.a")
    public boolean field590 = true;

    @ObfuscatedName("bn.s")
    public Object field587 = new Object();

    @ObfuscatedName("bn.g")
    public int field592 = 0;

    @ObfuscatedName("bn.x")
    public int[] field589 = new int[500];

    @ObfuscatedName("bn.h")
    public int[] field586 = new int[500];

    @ObfuscatedName("bn.f")
    public long[] field591 = new long[500];

    public void run() {
        while (this.field590) {
            Object var1 = this.field587;
            synchronized (this.field587) {
                if (this.field592 < 500) {
                    this.field589[this.field592] = class54.field488;
                    this.field586[this.field592] = class54.field489;
                    this.field591[this.field592] = class54.field493;
                    this.field592++;
                }
            }
            class199.method3774(50L);
        }
    }
}
