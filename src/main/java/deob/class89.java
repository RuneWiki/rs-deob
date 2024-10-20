package deob;

@ObfuscatedName("db")
public class class89 implements Runnable {

    @ObfuscatedName("db.am")
    public boolean field1073 = true;

    @ObfuscatedName("db.ap")
    public Object field1071 = new Object();

    @ObfuscatedName("db.af")
    public int field1072 = 0;

    @ObfuscatedName("db.aj")
    public int[] field1076 = new int[500];

    @ObfuscatedName("db.aq")
    public int[] field1074 = new int[500];

    @ObfuscatedName("db.ar")
    public long[] field1075 = new long[500];

    public void run() {
        while (this.field1073) {
            Object var1 = this.field1071;
            synchronized (this.field1071) {
                if (this.field1072 < 500) {
                    this.field1076[this.field1072] = class36.field231;
                    this.field1074[this.field1072] = class36.field239;
                    this.field1075[this.field1072] = class36.field233;
                    this.field1072++;
                }
            }
            class317.method2871(50L);
        }
    }
}
