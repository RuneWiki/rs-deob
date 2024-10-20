package deob;

@ObfuscatedName("dl")
public class class85 implements Runnable {

    @ObfuscatedName("dl.af")
    public boolean field1062 = true;

    @ObfuscatedName("dl.an")
    public Object field1055 = new Object();

    @ObfuscatedName("dl.aw")
    public int field1056 = 0;

    @ObfuscatedName("dl.ac")
    public int[] field1057 = new int[500];

    @ObfuscatedName("dl.au")
    public int[] field1054 = new int[500];

    @ObfuscatedName("dl.ab")
    public long[] field1059 = new long[500];

    public void run() {
        while (this.field1062) {
            Object var1 = this.field1055;
            synchronized (this.field1055) {
                if (this.field1056 < 500) {
                    this.field1057[this.field1056] = class36.field242;
                    this.field1054[this.field1056] = class36.field243;
                    this.field1059[this.field1056] = class36.field246;
                    this.field1056++;
                }
            }
            class295.method5489(50L);
        }
    }
}
