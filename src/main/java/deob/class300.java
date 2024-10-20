package deob;

@ObfuscatedName("kx")
public class class300 extends class301 {

    @ObfuscatedName("kx.q")
    public class329 field3726;

    @ObfuscatedName("kx.w")
    public static final int[] field3725 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("kx.e")
    public int field3727;

    public class300(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("kx.q([II)V")
    public void method5010(int[] arg0) {
        this.field3726 = new class329(arg0);
    }

    @ObfuscatedName("kx.w(Llv;B)V")
    public void method5015(class329 arg0) {
        this.field3726 = arg0;
    }

    @ObfuscatedName("kx.e(II)V")
    public void method5046(int arg0) {
        this.field3731[++this.field3733 - 1] = (byte) (arg0 + this.field3726.method5766());
    }

    @ObfuscatedName("kx.p(I)I")
    public int method5013() {
        return this.field3731[++this.field3733 - 1] - this.field3726.method5766() & 0xFF;
    }

    @ObfuscatedName("kx.k(I)Z")
    public boolean method5014() {
        int var1 = this.field3731[this.field3733] - this.field3726.method5774() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("kx.l(I)I")
    public int method5024() {
        int var1 = this.field3731[++this.field3733 - 1] - this.field3726.method5766() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field3731[++this.field3733 - 1] - this.field3726.method5766() & 0xFF);
    }

    @ObfuscatedName("kx.b([BIII)V")
    public void method5016(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field3731[++this.field3733 - 1] - this.field3726.method5766());
        }
    }

    @ObfuscatedName("kx.i(I)V")
    public void method5011() {
        this.field3727 = this.field3733 * 8;
    }

    @ObfuscatedName("kx.c(II)I")
    public int method5018(int arg0) {
        int var2 = this.field3727 >> 3;
        int var3 = 8 - (this.field3727 & 0x7);
        int var4 = 0;
        this.field3727 += arg0;
        while (arg0 > var3) {
            var4 += (this.field3731[var2++] & field3725[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field3731[var2] & field3725[var3]) + var4;
        } else {
            var5 = (this.field3731[var2] >> var3 - arg0 & field3725[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("kx.u(B)V")
    public void method5019() {
        this.field3733 = (this.field3727 + 7) / 8;
    }

    @ObfuscatedName("kx.x(IS)I")
    public int method5034(int arg0) {
        return arg0 * 8 - this.field3727;
    }
}
