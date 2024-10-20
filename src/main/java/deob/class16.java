package deob;

@ObfuscatedName("w")
public class class16 implements Runnable {

    @ObfuscatedName("w.p")
    public boolean field244 = true;

    @ObfuscatedName("w.i")
    public Object field235 = new Object();

    @ObfuscatedName("w.o")
    public int field236 = 0;

    @ObfuscatedName("w.n")
    public int[] field237 = new int[500];

    @ObfuscatedName("w.l")
    public int[] field238 = new int[500];

    public void run() {
        while (this.field244) {
            Object var1 = this.field235;
            synchronized (this.field235) {
                if (this.field236 < 500) {
                    this.field237[this.field236] = class77.field1397;
                    this.field238[this.field236] = class77.field1391;
                    this.field236++;
                }
            }
            class126.method2420(50L);
        }
    }
}
