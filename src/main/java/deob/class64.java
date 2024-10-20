package deob;

@ObfuscatedName("bo")
public class class64 implements Runnable {

    @ObfuscatedName("bo.n")
    public boolean field576 = true;

    @ObfuscatedName("bo.h")
    public Object field572 = new Object();

    @ObfuscatedName("bo.l")
    public int field571 = 0;

    @ObfuscatedName("bo.g")
    public int[] field573 = new int[500];

    @ObfuscatedName("bo.b")
    public int[] field570 = new int[500];

    @ObfuscatedName("bo.a")
    public long[] field575 = new long[500];

    public void run() {
        while (this.field576) {
            Object var1 = this.field572;
            synchronized (this.field572) {
                if (this.field571 < 500) {
                    this.field573[this.field571] = class54.field468;
                    this.field570[this.field571] = class54.field475 * 30622073;
                    this.field575[this.field571] = class54.field472;
                    this.field571++;
                }
            }
            class199.method3065(50L);
        }
    }
}
