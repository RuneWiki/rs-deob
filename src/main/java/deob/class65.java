package deob;

@ObfuscatedName("bo")
public class class65 extends class68 {

    @ObfuscatedName("bo.y")
    public long[] field1248 = new long[10];

    @ObfuscatedName("bo.m")
    public int field1244 = 256;

    @ObfuscatedName("bo.d")
    public int field1245 = 1;

    @ObfuscatedName("bo.k")
    public long field1243 = class121.method1389();

    @ObfuscatedName("bo.n")
    public int field1247 = 0;

    @ObfuscatedName("bo.s")
    public int field1250;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1248[var1] = this.field1243;
        }
    }

    @ObfuscatedName("bo.y(I)V")
    public void method1346() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1248[var1] = 0L;
        }
    }

    @ObfuscatedName("bo.m(III)I")
    public int method1350(int arg0, int arg1) {
        int var3 = this.field1244;
        int var4 = this.field1245;
        this.field1244 = 300;
        this.field1245 = 1;
        this.field1243 = class121.method1389();
        if (this.field1248[this.field1250] == 0L) {
            this.field1244 = var3;
            this.field1245 = var4;
        } else if (this.field1243 > this.field1248[this.field1250]) {
            this.field1244 = (int) ((long) (arg0 * 2560) / (this.field1243 - this.field1248[this.field1250]));
        }
        if (this.field1244 < 25) {
            this.field1244 = 25;
        }
        if (this.field1244 > 256) {
            this.field1244 = 256;
            this.field1245 = (int) ((long) arg0 - (this.field1243 - this.field1248[this.field1250]) / 10L);
        }
        if (this.field1245 > arg0) {
            this.field1245 = arg0;
        }
        this.field1248[this.field1250] = this.field1243;
        this.field1250 = (this.field1250 + 1) % 10;
        if (this.field1245 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1248[var5] != 0L) {
                    this.field1248[var5] += (long) this.field1245;
                }
            }
        }
        if (this.field1245 < arg1) {
            this.field1245 = arg1;
        }
        class126.method1326((long) this.field1245);
        int var6 = 0;
        while (this.field1247 < 256) {
            var6++;
            this.field1247 += this.field1244;
        }
        this.field1247 &= 0xFF;
        return var6;
    }
}
