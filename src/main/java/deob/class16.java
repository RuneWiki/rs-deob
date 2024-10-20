package deob;

@ObfuscatedName("g")
public class class16 implements Runnable {

    @ObfuscatedName("g.i")
    public boolean field262 = true;

    @ObfuscatedName("g.w")
    public Object field255 = new Object();

    @ObfuscatedName("g.f")
    public int field256 = 0;

    @ObfuscatedName("g.e")
    public int[] field257 = new int[500];

    @ObfuscatedName("g.t")
    public int[] field258 = new int[500];

    public void run() {
        while (this.field262) {
            Object var1 = this.field255;
            synchronized (this.field255) {
                if (this.field256 < 500) {
                    this.field257[this.field256] = class77.field1391;
                    this.field258[this.field256] = class77.field1396;
                    this.field256++;
                }
            }
            class126.method738(50L);
        }
    }
}
