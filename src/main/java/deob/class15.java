package deob;

@ObfuscatedName("d")
public class class15 implements Runnable {

    @ObfuscatedName("d.v")
    public boolean field252 = true;

    @ObfuscatedName("d.f")
    public Object field247 = new Object();

    @ObfuscatedName("d.n")
    public int field243 = 0;

    @ObfuscatedName("d.c")
    public int[] field242 = new int[500];

    @ObfuscatedName("d.r")
    public int[] field246 = new int[500];

    public void run() {
        while (this.field252) {
            Object var1 = this.field247;
            synchronized (this.field247) {
                if (this.field243 < 500) {
                    this.field242[this.field243] = class76.field1376;
                    this.field246[this.field243] = class76.field1370;
                    this.field243++;
                }
            }
            class125.method2683(50L);
        }
    }
}
