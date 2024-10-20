package deob;

@ObfuscatedName("pj")
public class class418 extends class419 {

    @ObfuscatedName("pj.c")
    public class435 field4469;

    @ObfuscatedName("pj.b")
    public static final int[] field4470 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("pj.p")
    public int field4471;

    public class418(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("pj.c([IB)V")
    public void method6617(int[] arg0) {
        this.field4469 = new class435(arg0);
    }

    @ObfuscatedName("pj.b(Lph;B)V")
    public void method6616(class435 arg0) {
        this.field4469 = arg0;
    }

    @ObfuscatedName("pj.p(II)V")
    public void method6618(int arg0) {
        this.field4477[++this.field4475 - 1] = (byte) (arg0 + this.field4469.method7161());
    }

    @ObfuscatedName("pj.m(I)I")
    public int method6629() {
        return this.field4477[++this.field4475 - 1] - this.field4469.method7161() & 0xFF;
    }

    @ObfuscatedName("pj.t(I)Z")
    public boolean method6619() {
        int var1 = this.field4477[this.field4475] - this.field4469.method7162() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("pj.s(I)I")
    public int method6623() {
        int var1 = this.field4477[++this.field4475 - 1] - this.field4469.method7161() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4477[++this.field4475 - 1] - this.field4469.method7161() & 0xFF);
    }

    @ObfuscatedName("pj.j([BIIB)V")
    public void method6620(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4477[++this.field4475 - 1] - this.field4469.method7161());
        }
    }

    @ObfuscatedName("pj.w(I)V")
    public void method6621() {
        this.field4471 = this.field4475 * 8;
    }

    @ObfuscatedName("pj.n(II)I")
    public int method6646(int arg0) {
        int var2 = this.field4471 >> 3;
        int var3 = 8 - (this.field4471 & 0x7);
        int var4 = 0;
        this.field4471 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4477[var2++] & field4470[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4477[var2] & field4470[var3]) + var4;
        } else {
            var5 = (this.field4477[var2] >> var3 - arg0 & field4470[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("pj.r(I)V")
    public void method6615() {
        this.field4475 = (this.field4471 + 7) / 8;
    }

    @ObfuscatedName("pj.o(II)I")
    public int method6643(int arg0) {
        return arg0 * 8 - this.field4471;
    }
}
