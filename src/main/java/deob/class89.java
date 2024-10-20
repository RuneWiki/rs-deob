package deob;

@ObfuscatedName("db")
public class class89 implements Runnable {

    @ObfuscatedName("db.at")
    public boolean field1067 = true;

    @ObfuscatedName("db.ah")
    public Object field1070 = new Object();

    @ObfuscatedName("db.ar")
    public int field1066 = 0;

    @ObfuscatedName("db.ao")
    public int[] field1069 = new int[500];

    @ObfuscatedName("db.ab")
    public int[] field1068 = new int[500];

    @ObfuscatedName("db.au")
    public long[] field1071 = new long[500];

    public void run() {
        while (this.field1067) {
            Object var1 = this.field1070;
            synchronized (this.field1070) {
                if (this.field1066 < 500) {
                    this.field1069[this.field1066] = class36.field217;
                    this.field1068[this.field1066] = class36.field218;
                    this.field1071[this.field1066] = class36.field219;
                    this.field1066++;
                }
            }
            class314.method3920(50L);
        }
    }
}
