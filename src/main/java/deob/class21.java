package deob;

@ObfuscatedName("h")
public class class21 implements Runnable {

    @ObfuscatedName("h.u")
    public boolean field219 = true;

    @ObfuscatedName("h.x")
    public Object field214 = new Object();

    @ObfuscatedName("h.i")
    public int field215 = 0;

    @ObfuscatedName("h.a")
    public int[] field216 = new int[500];

    @ObfuscatedName("h.f")
    public int[] field217 = new int[500];

    public void run() {
        while (this.field219) {
            Object var1 = this.field214;
            synchronized (this.field214) {
                if (this.field215 < 500) {
                    this.field216[this.field215] = class116.field1789;
                    this.field217[this.field215] = class116.field1790 * -1088631201;
                    this.field215++;
                }
            }
            class162.method1528(50L);
        }
    }
}
