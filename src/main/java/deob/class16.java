package deob;

@ObfuscatedName("x")
public class class16 implements Runnable {

    @ObfuscatedName("x.e")
    public boolean field254 = true;

    @ObfuscatedName("x.i")
    public Object field252 = new Object();

    @ObfuscatedName("x.k")
    public int field256 = 0;

    @ObfuscatedName("x.q")
    public int[] field251 = new int[500];

    @ObfuscatedName("x.j")
    public int[] field255 = new int[500];

    public void run() {
        while (this.field254) {
            Object var1 = this.field252;
            synchronized (this.field252) {
                if (this.field256 < 500) {
                    this.field251[this.field256] = class78.field1397;
                    this.field255[this.field256] = class78.field1398 * -58530351;
                    this.field256++;
                }
            }
            class127.method2200(50L);
        }
    }
}
