package deob;

@ObfuscatedName("bq")
public class class59 implements Runnable {

    @ObfuscatedName("bq.g")
    public boolean field587 = true;

    @ObfuscatedName("bq.r")
    public Object field582 = new Object();

    @ObfuscatedName("bq.e")
    public int field581 = 0;

    @ObfuscatedName("bq.q")
    public int[] field586 = new int[500];

    @ObfuscatedName("bq.c")
    public int[] field585 = new int[500];

    @ObfuscatedName("bq.l")
    public long[] field583 = new long[500];

    public void run() {
        while (this.field587) {
            Object var1 = this.field582;
            synchronized (this.field582) {
                if (this.field581 < 500) {
                    this.field586[this.field581] = class49.field474;
                    this.field585[this.field581] = class49.field465 * -976212263;
                    this.field583[this.field581] = class49.field473;
                    this.field581++;
                }
            }
            class194.method4976(50L);
        }
    }
}
