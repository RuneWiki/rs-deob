package deob;

@ObfuscatedName("bn")
public class class73 implements Runnable {

    @ObfuscatedName("bn.x")
    public boolean field620 = true;

    @ObfuscatedName("bn.m")
    public Object field615 = new Object();

    @ObfuscatedName("bn.k")
    public int field621 = 0;

    @ObfuscatedName("bn.d")
    public int[] field622 = new int[500];

    @ObfuscatedName("bn.w")
    public int[] field618 = new int[500];

    @ObfuscatedName("bn.v")
    public long[] field619 = new long[500];

    public void run() {
        while (this.field620) {
            Object var1 = this.field615;
            synchronized (this.field615) {
                if (this.field621 < 500) {
                    this.field622[this.field621] = class64.field518;
                    this.field618[this.field621] = class64.field519;
                    this.field619[this.field621] = class64.field516;
                    this.field621++;
                }
            }
            class308.method3243(50L);
        }
    }
}
