package deob;

@ObfuscatedName("z")
public class class16 implements Runnable {

    @ObfuscatedName("z.i")
    public boolean field243 = true;

    @ObfuscatedName("z.b")
    public Object field240 = new Object();

    @ObfuscatedName("z.r")
    public int field245 = 0;

    @ObfuscatedName("z.l")
    public int[] field242 = new int[500];

    @ObfuscatedName("z.s")
    public int[] field241 = new int[500];

    public void run() {
        while (this.field243) {
            Object var1 = this.field240;
            synchronized (this.field240) {
                if (this.field245 < 500) {
                    this.field242[this.field245] = class78.field1410;
                    this.field241[this.field245] = class78.field1411;
                    this.field245++;
                }
            }
            class127.method1642(50L);
        }
    }
}
