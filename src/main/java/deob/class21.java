package deob;

@ObfuscatedName("v")
public class class21 implements Runnable {

    @ObfuscatedName("v.p")
    public boolean field214 = true;

    @ObfuscatedName("v.g")
    public Object field215 = new Object();

    @ObfuscatedName("v.x")
    public int field211 = 0;

    @ObfuscatedName("v.q")
    public int[] field212 = new int[500];

    @ObfuscatedName("v.d")
    public int[] field213 = new int[500];

    public void run() {
        while (this.field214) {
            Object var1 = this.field215;
            synchronized (this.field215) {
                if (this.field211 < 500) {
                    this.field212[this.field211] = class116.field1806;
                    this.field213[this.field211] = class116.field1815 * -693183961;
                    this.field211++;
                }
            }
            class162.method1858(50L);
        }
    }
}
