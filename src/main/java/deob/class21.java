package deob;

@ObfuscatedName("d")
public class class21 implements Runnable {

    @ObfuscatedName("d.s")
    public boolean field232 = true;

    @ObfuscatedName("d.c")
    public Object field236 = new Object();

    @ObfuscatedName("d.f")
    public int field231 = 0;

    @ObfuscatedName("d.h")
    public int[] field234 = new int[500];

    @ObfuscatedName("d.a")
    public int[] field233 = new int[500];

    public void run() {
        while (this.field232) {
            Object var1 = this.field236;
            synchronized (this.field236) {
                if (this.field231 < 500) {
                    this.field234[this.field231] = class116.field1811;
                    this.field233[this.field231] = class116.field1804;
                    this.field231++;
                }
            }
            class162.method746(50L);
        }
    }
}
