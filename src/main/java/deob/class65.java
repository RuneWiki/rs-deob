package deob;

@ObfuscatedName("bs")
public class class65 extends class68 {

    @ObfuscatedName("bs.d")
    public long[] field1256 = new long[10];

    @ObfuscatedName("bs.g")
    public int field1258 = 256;

    @ObfuscatedName("bs.a")
    public int field1250 = 1;

    @ObfuscatedName("bs.t")
    public long field1251 = class121.method1250();

    @ObfuscatedName("bs.f")
    public int field1252 = 0;

    @ObfuscatedName("bs.c")
    public int field1253;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1256[var1] = this.field1251;
        }
    }

    @ObfuscatedName("bs.d(B)V")
    public void method1311() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1256[var1] = 0L;
        }
    }

    @ObfuscatedName("bs.g(III)I")
    public int method1310(int arg0, int arg1) {
        int var3 = this.field1258;
        int var4 = this.field1250;
        this.field1258 = 300;
        this.field1250 = 1;
        this.field1251 = class121.method1250();
        if (this.field1256[this.field1253] == 0L) {
            this.field1258 = var3;
            this.field1250 = var4;
        } else if (this.field1251 > this.field1256[this.field1253]) {
            this.field1258 = (int) ((long) (arg0 * 2560) / (this.field1251 - this.field1256[this.field1253]));
        }
        if (this.field1258 < 25) {
            this.field1258 = 25;
        }
        if (this.field1258 > 256) {
            this.field1258 = 256;
            this.field1250 = (int) ((long) arg0 - (this.field1251 - this.field1256[this.field1253]) / 10L);
        }
        if (this.field1250 > arg0) {
            this.field1250 = arg0;
        }
        this.field1256[this.field1253] = this.field1251;
        this.field1253 = (this.field1253 + 1) % 10;
        if (this.field1250 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1256[var5] != 0L) {
                    this.field1256[var5] += (long) this.field1250;
                }
            }
        }
        if (this.field1250 < arg1) {
            this.field1250 = arg1;
        }
        class126.method112((long) this.field1250);
        int var6 = 0;
        while (this.field1252 < 256) {
            var6++;
            this.field1252 += this.field1258;
        }
        this.field1252 &= 0xFF;
        return var6;
    }
}
