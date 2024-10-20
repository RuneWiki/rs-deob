package deob;

@ObfuscatedName("d")
public class class15 implements Runnable {

    @ObfuscatedName("d.g")
    public boolean field237 = true;

    @ObfuscatedName("d.e")
    public Object field233 = new Object();

    @ObfuscatedName("d.n")
    public int field232 = 0;

    @ObfuscatedName("d.j")
    public int[] field236 = new int[500];

    @ObfuscatedName("d.i")
    public int[] field235 = new int[500];

    public void run() {
        while (this.field237) {
            Object var1 = this.field233;
            synchronized (this.field233) {
                if (this.field232 < 500) {
                    this.field236[this.field232] = class76.field1380;
                    this.field235[this.field232] = class76.field1384;
                    this.field232++;
                }
            }
            class125.method2058(50L);
        }
    }
}
