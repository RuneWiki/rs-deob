package deob;

@ObfuscatedName("ds")
public class class91 implements Runnable {

    @ObfuscatedName("ds.ab")
    public boolean field1083 = true;

    @ObfuscatedName("ds.ay")
    public Object field1078 = new Object();

    @ObfuscatedName("ds.an")
    public int field1079 = 0;

    @ObfuscatedName("ds.au")
    public int[] field1077 = new int[500];

    @ObfuscatedName("ds.ax")
    public int[] field1081 = new int[500];

    @ObfuscatedName("ds.ao")
    public long[] field1082 = new long[500];

    public void run() {
        while (this.field1083) {
            Object var1 = this.field1078;
            synchronized (this.field1078) {
                if (this.field1079 < 500) {
                    this.field1077[this.field1079] = class36.field204;
                    this.field1081[this.field1079] = class36.field205;
                    this.field1082[this.field1079] = class36.field206;
                    this.field1079++;
                }
            }
            class330.method3326(50L);
        }
    }
}
