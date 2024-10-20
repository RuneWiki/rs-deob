package deob;

@ObfuscatedName("f")
public class class15 implements Runnable {

    @ObfuscatedName("f.z")
    public boolean field243 = true;

    @ObfuscatedName("f.h")
    public Object field237 = new Object();

    @ObfuscatedName("f.c")
    public int field238 = 0;

    @ObfuscatedName("f.p")
    public int[] field239 = new int[500];

    @ObfuscatedName("f.i")
    public int[] field240 = new int[500];

    public void run() {
        while (this.field243) {
            Object var1 = this.field237;
            synchronized (this.field237) {
                if (this.field238 < 500) {
                    this.field239[this.field238] = class76.field1389;
                    this.field240[this.field238] = class76.field1390;
                    this.field238++;
                }
            }
            class125.method2379(50L);
        }
    }
}
