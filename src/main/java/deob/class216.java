package deob;

@ObfuscatedName("is")
public class class216 extends class224 {

    @ObfuscatedName("is.am")
    public long[] field2319 = new long[10];

    @ObfuscatedName("is.ap")
    public int field2321 = 256;

    @ObfuscatedName("is.af")
    public int field2320 = 1;

    @ObfuscatedName("is.aj")
    public long field2324 = Statics.method2852();

    @ObfuscatedName("is.aq")
    public int field2322 = 0;

    @ObfuscatedName("is.ar")
    public int field2323;

    public class216() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2319[var1] = this.field2324;
        }
    }

    @ObfuscatedName("is.am(I)V")
    public void method3802() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2319[var1] = 0L;
        }
    }

    @ObfuscatedName("is.ap(III)I")
    public int method3804(int arg0, int arg1) {
        int var3 = this.field2321;
        int var4 = this.field2320;
        this.field2321 = 300;
        this.field2320 = 1;
        this.field2324 = Statics.method2852();
        if (this.field2319[this.field2323] == 0L) {
            this.field2321 = var3;
            this.field2320 = var4;
        } else if (this.field2324 > this.field2319[this.field2323]) {
            this.field2321 = (int) ((long) (arg0 * 2560) / (this.field2324 - this.field2319[this.field2323]));
        }
        if (this.field2321 < 25) {
            this.field2321 = 25;
        }
        if (this.field2321 > 256) {
            this.field2321 = 256;
            this.field2320 = (int) ((long) arg0 - (this.field2324 - this.field2319[this.field2323]) / 10L);
        }
        if (this.field2320 > arg0) {
            this.field2320 = arg0;
        }
        this.field2319[this.field2323] = this.field2324;
        this.field2323 = (this.field2323 + 1) % 10;
        if (this.field2320 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2319[var5] != 0L) {
                    this.field2319[var5] += (long) this.field2320;
                }
            }
        }
        if (this.field2320 < arg1) {
            this.field2320 = arg1;
        }
        class317.method2871((long) this.field2320);
        int var6 = 0;
        while (this.field2322 < 256) {
            var6++;
            this.field2322 += this.field2321;
        }
        this.field2322 &= 0xFF;
        return var6;
    }
}
