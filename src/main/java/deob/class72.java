package deob;

@ObfuscatedName("bq")
public class class72 implements Runnable {

    @ObfuscatedName("bq.a")
    public boolean field849 = true;

    @ObfuscatedName("bq.j")
    public Object field853 = new Object();

    @ObfuscatedName("bq.n")
    public int field850 = 0;

    @ObfuscatedName("bq.r")
    public int[] field851 = new int[500];

    @ObfuscatedName("bq.v")
    public int[] field852 = new int[500];

    public void run() {
        while (this.field849) {
            Object var1 = this.field853;
            synchronized (this.field853) {
                if (this.field850 < 500) {
                    this.field851[this.field850] = class60.field723;
                    this.field852[this.field850] = class60.field724 * -90084053;
                    this.field850++;
                }
            }
            class182.method318(50L);
        }
    }
}
