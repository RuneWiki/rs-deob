package deob;

@ObfuscatedName("dt")
public class class89 implements Runnable {

    @ObfuscatedName("dt.au")
    public boolean field1105 = true;

    @ObfuscatedName("dt.ae")
    public Object field1098 = new Object();

    @ObfuscatedName("dt.ao")
    public int field1099 = 0;

    @ObfuscatedName("dt.at")
    public int[] field1100 = new int[500];

    @ObfuscatedName("dt.ac")
    public int[] field1101 = new int[500];

    @ObfuscatedName("dt.ai")
    public long[] field1102 = new long[500];

    public void run() {
        while (this.field1105) {
            Object var1 = this.field1098;
            synchronized (this.field1098) {
                if (this.field1099 < 500) {
                    this.field1100[this.field1099] = class36.field255;
                    this.field1101[this.field1099] = class36.field233;
                    this.field1102[this.field1099] = class36.field242;
                    this.field1099++;
                }
            }
            class303.method2265(50L);
        }
    }
}
