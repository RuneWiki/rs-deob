package deob;

@ObfuscatedName("k")
public class class16 implements Runnable {

    @ObfuscatedName("k.i")
    public boolean field262 = true;

    @ObfuscatedName("k.p")
    public Object field258 = new Object();

    @ObfuscatedName("k.a")
    public int field260 = 0;

    @ObfuscatedName("k.l")
    public int[] field261 = new int[500];

    @ObfuscatedName("k.q")
    public int[] field259 = new int[500];

    public void run() {
        while (this.field262) {
            Object var1 = this.field258;
            synchronized (this.field258) {
                if (this.field260 < 500) {
                    this.field261[this.field260] = class77.field1408;
                    this.field259[this.field260] = class77.field1409;
                    this.field260++;
                }
            }
            class126.method1489(50L);
        }
    }
}
