package deob;

@ObfuscatedName("fj")
public class class165 extends class168 {

    @ObfuscatedName("fj.c")
    public long[] field1805 = new long[10];

    @ObfuscatedName("fj.p")
    public int field1806 = 256;

    @ObfuscatedName("fj.f")
    public int field1804 = 1;

    @ObfuscatedName("fj.n")
    public long field1810 = class271.method5624();

    @ObfuscatedName("fj.k")
    public int field1802 = 0;

    @ObfuscatedName("fj.w")
    public int field1807;

    public class165() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1805[var1] = this.field1810;
        }
    }

    @ObfuscatedName("fj.c(I)V")
    public void method3000() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1805[var1] = 0L;
        }
    }

    @ObfuscatedName("fj.p(IIB)I")
    public int method2998(int arg0, int arg1) {
        int var3 = this.field1806;
        int var4 = this.field1804;
        this.field1806 = 300;
        this.field1804 = 1;
        this.field1810 = class271.method5624();
        if (this.field1805[this.field1807] == 0L) {
            this.field1806 = var3;
            this.field1804 = var4;
        } else if (this.field1810 > this.field1805[this.field1807]) {
            this.field1806 = (int) ((long) (arg0 * 2560) / (this.field1810 - this.field1805[this.field1807]));
        }
        if (this.field1806 < 25) {
            this.field1806 = 25;
        }
        if (this.field1806 > 256) {
            this.field1806 = 256;
            this.field1804 = (int) ((long) arg0 - (this.field1810 - this.field1805[this.field1807]) / 10L);
        }
        if (this.field1804 > arg0) {
            this.field1804 = arg0;
        }
        this.field1805[this.field1807] = this.field1810;
        this.field1807 = (this.field1807 + 1) % 10;
        if (this.field1804 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1805[var5] != 0L) {
                    this.field1805[var5] += (long) this.field1804;
                }
            }
        }
        if (this.field1804 < arg1) {
            this.field1804 = arg1;
        }
        class272.method406((long) this.field1804);
        int var6 = 0;
        while (this.field1802 < 256) {
            var6++;
            this.field1802 += this.field1806;
        }
        this.field1802 &= 0xFF;
        return var6;
    }
}
