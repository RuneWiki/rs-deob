package deob;

@ObfuscatedName("ba")
public class class59 implements Runnable {

    @ObfuscatedName("ba.f")
    public boolean field582 = true;

    @ObfuscatedName("ba.l")
    public Object field581 = new Object();

    @ObfuscatedName("ba.w")
    public int field579 = 0;

    @ObfuscatedName("ba.s")
    public int[] field580 = new int[500];

    @ObfuscatedName("ba.e")
    public int[] field577 = new int[500];

    @ObfuscatedName("ba.a")
    public long[] field578 = new long[500];

    public void run() {
        while (this.field582) {
            Object var1 = this.field581;
            synchronized (this.field581) {
                if (this.field579 < 500) {
                    this.field580[this.field579] = class49.field461;
                    this.field577[this.field579] = class49.field462;
                    this.field578[this.field579] = class49.field460;
                    this.field579++;
                }
            }
            class194.method1752(50L);
        }
    }
}
