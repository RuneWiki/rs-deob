package deob;

@ObfuscatedName("fz")
public class class174 extends class180 {

    @ObfuscatedName("fz.n")
    public long[] field2030 = new long[10];

    @ObfuscatedName("fz.v")
    public int field2028 = 256;

    @ObfuscatedName("fz.d")
    public int field2027 = 1;

    @ObfuscatedName("fz.c")
    public long field2029 = class308.method1082();

    @ObfuscatedName("fz.y")
    public int field2031 = 0;

    @ObfuscatedName("fz.h")
    public int field2032;

    public class174() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2030[var1] = this.field2029;
        }
    }

    @ObfuscatedName("fz.n(B)V")
    public void method3365() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2030[var1] = 0L;
        }
    }

    @ObfuscatedName("fz.v(III)I")
    public int method3360(int arg0, int arg1) {
        int var3 = this.field2028;
        int var4 = this.field2027;
        this.field2028 = 300;
        this.field2027 = 1;
        this.field2029 = class308.method1082();
        if (this.field2030[this.field2032] == 0L) {
            this.field2028 = var3;
            this.field2027 = var4;
        } else if (this.field2029 > this.field2030[this.field2032]) {
            this.field2028 = (int) ((long) (arg0 * 2560) / (this.field2029 - this.field2030[this.field2032]));
        }
        if (this.field2028 < 25) {
            this.field2028 = 25;
        }
        if (this.field2028 > 256) {
            this.field2028 = 256;
            this.field2027 = (int) ((long) arg0 - (this.field2029 - this.field2030[this.field2032]) / 10L);
        }
        if (this.field2027 > arg0) {
            this.field2027 = arg0;
        }
        this.field2030[this.field2032] = this.field2029;
        this.field2032 = (this.field2032 + 1) % 10;
        if (this.field2027 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2030[var5] != 0L) {
                    this.field2030[var5] += (long) this.field2027;
                }
            }
        }
        if (this.field2027 < arg1) {
            this.field2027 = arg1;
        }
        class309.method1173((long) this.field2027);
        int var6 = 0;
        while (this.field2031 < 256) {
            var6++;
            this.field2031 += this.field2028;
        }
        this.field2031 &= 0xFF;
        return var6;
    }
}
