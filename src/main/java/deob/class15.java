package deob;

@ObfuscatedName("m")
public class class15 implements Runnable {

    @ObfuscatedName("m.j")
    public boolean field241 = true;

    @ObfuscatedName("m.y")
    public Object field236 = new Object();

    @ObfuscatedName("m.x")
    public int field243 = 0;

    @ObfuscatedName("m.z")
    public int[] field238 = new int[500];

    @ObfuscatedName("m.c")
    public int[] field239 = new int[500];

    public void run() {
        while (this.field241) {
            Object var1 = this.field236;
            synchronized (this.field236) {
                if (this.field243 < 500) {
                    this.field238[this.field243] = class76.field1378;
                    this.field239[this.field243] = class76.field1379;
                    this.field243++;
                }
            }
            class125.method112(50L);
        }
    }
}
