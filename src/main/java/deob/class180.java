package deob;

@ObfuscatedName("gn")
public class class180 extends class183 {

    @ObfuscatedName("gn.aw")
    public long[] field1868 = new long[10];

    @ObfuscatedName("gn.ay")
    public int field1871 = 256;

    @ObfuscatedName("gn.ar")
    public int field1869 = 1;

    @ObfuscatedName("gn.am")
    public long field1870 = class303.method2705();

    @ObfuscatedName("gn.as")
    public int field1867 = 0;

    @ObfuscatedName("gn.aj")
    public int field1872;

    public class180() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1868[var1] = this.field1870;
        }
    }

    @ObfuscatedName("gn.aw(I)V")
    public void method3120() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1868[var1] = 0L;
        }
    }

    @ObfuscatedName("gn.ay(IIB)I")
    public int method3121(int arg0, int arg1) {
        int var3 = this.field1871;
        int var4 = this.field1869;
        this.field1871 = 300;
        this.field1869 = 1;
        this.field1870 = class303.method2705();
        if (this.field1868[this.field1872] == 0L) {
            this.field1871 = var3;
            this.field1869 = var4;
        } else if (this.field1870 > this.field1868[this.field1872]) {
            this.field1871 = (int) ((long) (arg0 * 2560) / (this.field1870 - this.field1868[this.field1872]));
        }
        if (this.field1871 < 25) {
            this.field1871 = 25;
        }
        if (this.field1871 > 256) {
            this.field1871 = 256;
            this.field1869 = (int) ((long) arg0 - (this.field1870 - this.field1868[this.field1872]) / 10L);
        }
        if (this.field1869 > arg0) {
            this.field1869 = arg0;
        }
        this.field1868[this.field1872] = this.field1870;
        this.field1872 = (this.field1872 + 1) % 10;
        if (this.field1869 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1868[var5] != 0L) {
                    this.field1868[var5] += (long) this.field1869;
                }
            }
        }
        if (this.field1869 < arg1) {
            this.field1869 = arg1;
        }
        class304.method173((long) this.field1869);
        int var6 = 0;
        while (this.field1867 < 256) {
            var6++;
            this.field1867 += this.field1871;
        }
        this.field1867 &= 0xFF;
        return var6;
    }
}
