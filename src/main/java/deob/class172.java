package deob;

@ObfuscatedName("fy")
public class class172 extends class175 {

    @ObfuscatedName("fy.h")
    public long[] field1886 = new long[10];

    @ObfuscatedName("fy.e")
    public int field1887 = 256;

    @ObfuscatedName("fy.v")
    public int field1891 = 1;

    @ObfuscatedName("fy.x")
    public long field1889 = Statics.method1118();

    @ObfuscatedName("fy.m")
    public int field1890 = 0;

    @ObfuscatedName("fy.q")
    public int field1888;

    public class172() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1886[var1] = this.field1889;
        }
    }

    @ObfuscatedName("fy.h(I)V")
    public void method3043() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1886[var1] = 0L;
        }
    }

    @ObfuscatedName("fy.e(III)I")
    public int method3044(int arg0, int arg1) {
        int var3 = this.field1887;
        int var4 = this.field1891;
        this.field1887 = 300;
        this.field1891 = 1;
        this.field1889 = Statics.method1118();
        if (this.field1886[this.field1888] == 0L) {
            this.field1887 = var3;
            this.field1891 = var4;
        } else if (this.field1889 > this.field1886[this.field1888]) {
            this.field1887 = (int) ((long) (arg0 * 2560) / (this.field1889 - this.field1886[this.field1888]));
        }
        if (this.field1887 < 25) {
            this.field1887 = 25;
        }
        if (this.field1887 > 256) {
            this.field1887 = 256;
            this.field1891 = (int) ((long) arg0 - (this.field1889 - this.field1886[this.field1888]) / 10L);
        }
        if (this.field1891 > arg0) {
            this.field1891 = arg0;
        }
        this.field1886[this.field1888] = this.field1889;
        this.field1888 = (this.field1888 + 1) % 10;
        if (this.field1891 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1886[var5] != 0L) {
                    this.field1886[var5] += (long) this.field1891;
                }
            }
        }
        if (this.field1891 < arg1) {
            this.field1891 = arg1;
        }
        class284.method148((long) this.field1891);
        int var6 = 0;
        while (this.field1890 < 256) {
            var6++;
            this.field1890 += this.field1887;
        }
        this.field1890 &= 0xFF;
        return var6;
    }
}
