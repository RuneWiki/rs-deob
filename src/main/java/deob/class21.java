package deob;

@ObfuscatedName("b")
public class class21 implements Runnable {

    @ObfuscatedName("b.n")
    public boolean field216 = true;

    @ObfuscatedName("b.d")
    public Object field223 = new Object();

    @ObfuscatedName("b.m")
    public int field215 = 0;

    @ObfuscatedName("b.h")
    public int[] field217 = new int[500];

    @ObfuscatedName("b.w")
    public int[] field218 = new int[500];

    public void run() {
        while (this.field216) {
            Object var1 = this.field223;
            synchronized (this.field223) {
                if (this.field215 < 500) {
                    this.field217[this.field215] = class116.field1812;
                    this.field218[this.field215] = class116.field1811 * 853340747;
                    this.field215++;
                }
            }
            Statics.method13(50L);
        }
    }
}
