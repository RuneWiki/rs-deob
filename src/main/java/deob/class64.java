package deob;

@ObfuscatedName("bn")
public class class64 implements Runnable {

    @ObfuscatedName("bn.z")
    public boolean field581 = true;

    @ObfuscatedName("bn.n")
    public Object field574 = new Object();

    @ObfuscatedName("bn.v")
    public int field575 = 0;

    @ObfuscatedName("bn.u")
    public int[] field576 = new int[500];

    @ObfuscatedName("bn.r")
    public int[] field577 = new int[500];

    @ObfuscatedName("bn.p")
    public long[] field578 = new long[500];

    public void run() {
        while (this.field581) {
            Object var1 = this.field574;
            synchronized (this.field574) {
                if (this.field575 < 500) {
                    this.field576[this.field575] = class55.field466;
                    this.field577[this.field575] = class55.field467;
                    this.field578[this.field575] = class55.field468;
                    this.field575++;
                }
            }
            long var3 = 49L;
            try {
                Thread.sleep(var3);
            } catch (InterruptedException var8) {
            }
            try {
                Thread.sleep(1L);
            } catch (InterruptedException var7) {
            }
        }
    }
}
