package deob;

@ObfuscatedName("bs")
public class class65 extends class68 {

    @ObfuscatedName("bs.q")
    public long[] field1248 = new long[10];

    @ObfuscatedName("bs.c")
    public int field1244 = 256;

    @ObfuscatedName("bs.p")
    public int field1245 = 1;

    @ObfuscatedName("bs.z")
    public long field1246 = class121.method533();

    @ObfuscatedName("bs.m")
    public int field1247 = 0;

    @ObfuscatedName("bs.k")
    public int field1251;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1248[var1] = this.field1246;
        }
    }

    @ObfuscatedName("bs.q(I)V")
    public void method1362() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1248[var1] = 0L;
        }
    }

    @ObfuscatedName("bs.c(III)I")
    public int method1363(int arg0, int arg1) {
        int var3 = this.field1244;
        int var4 = this.field1245;
        this.field1244 = 300;
        this.field1245 = 1;
        this.field1246 = class121.method533();
        if (this.field1248[this.field1251] == 0L) {
            this.field1244 = var3;
            this.field1245 = var4;
        } else if (this.field1246 > this.field1248[this.field1251]) {
            this.field1244 = (int) ((long) (arg0 * 2560) / (this.field1246 - this.field1248[this.field1251]));
        }
        if (this.field1244 < 25) {
            this.field1244 = 25;
        }
        if (this.field1244 > 256) {
            this.field1244 = 256;
            this.field1245 = (int) ((long) arg0 - (this.field1246 - this.field1248[this.field1251]) / 10L);
        }
        if (this.field1245 > arg0) {
            this.field1245 = arg0;
        }
        this.field1248[this.field1251] = this.field1246;
        this.field1251 = (this.field1251 + 1) % 10;
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
        class126.method210((long) this.field1245);
        int var6 = 0;
        while (this.field1247 < 256) {
            var6++;
            this.field1247 += this.field1244;
        }
        this.field1247 &= 0xFF;
        return var6;
    }
}
