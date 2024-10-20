package deob;

@ObfuscatedName("ky")
public class class309 extends class310 {

    @ObfuscatedName("ky.z")
    public class338 field3728;

    @ObfuscatedName("ky.k")
    public static final int[] field3730 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ky.s")
    public int field3727;

    public class309(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ky.z([II)V")
    public void method5136(int[] arg0) {
        this.field3728 = new class338(arg0);
    }

    @ObfuscatedName("ky.k(Llh;I)V")
    public void method5148(class338 arg0) {
        this.field3728 = arg0;
    }

    @ObfuscatedName("ky.s(II)V")
    public void method5137(int arg0) {
        this.field3731[++this.field3734 - 1] = (byte) (arg0 + this.field3728.method5901());
    }

    @ObfuscatedName("ky.t(B)I")
    public int method5149() {
        return this.field3731[++this.field3734 - 1] - this.field3728.method5901() & 0xFF;
    }

    @ObfuscatedName("ky.i(I)Z")
    public boolean method5140() {
        int var1 = this.field3731[this.field3734] - this.field3728.method5913() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("ky.o(B)I")
    public int method5156() {
        int var1 = this.field3731[++this.field3734 - 1] - this.field3728.method5901() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field3731[++this.field3734 - 1] - this.field3728.method5901() & 0xFF);
    }

    @ObfuscatedName("ky.x([BIII)V")
    public void method5142(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field3731[++this.field3734 - 1] - this.field3728.method5901());
        }
    }

    @ObfuscatedName("ky.w(I)V")
    public void method5154() {
        this.field3727 = this.field3734 * 8;
    }

    @ObfuscatedName("ky.g(II)I")
    public int method5135(int arg0) {
        int var2 = this.field3727 >> 3;
        int var3 = 8 - (this.field3727 & 0x7);
        int var4 = 0;
        this.field3727 += arg0;
        while (arg0 > var3) {
            var4 += (this.field3731[var2++] & field3730[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field3731[var2] & field3730[var3]) + var4;
        } else {
            var5 = (this.field3731[var2] >> var3 - arg0 & field3730[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ky.m(I)V")
    public void method5145() {
        this.field3734 = (this.field3727 + 7) / 8;
    }

    @ObfuscatedName("ky.n(IS)I")
    public int method5141(int arg0) {
        return arg0 * 8 - this.field3727;
    }
}
