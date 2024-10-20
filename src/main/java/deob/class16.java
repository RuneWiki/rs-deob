package deob;

@ObfuscatedName("k")
public class class16 implements Runnable {

    @ObfuscatedName("k.t")
    public boolean field259 = true;

    @ObfuscatedName("k.l")
    public Object field261 = new Object();

    @ObfuscatedName("k.c")
    public int field265 = 0;

    @ObfuscatedName("k.d")
    public int[] field260 = new int[500];

    @ObfuscatedName("k.b")
    public int[] field258 = new int[500];

    public void run() {
        while (this.field259) {
            Object var1 = this.field261;
            synchronized (this.field261) {
                if (this.field265 < 500) {
                    this.field260[this.field265] = class77.field1419;
                    this.field258[this.field265] = class77.field1422;
                    this.field265++;
                }
            }
            class126.method3086(50L);
        }
    }
}
