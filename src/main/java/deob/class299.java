package deob;

@ObfuscatedName("kf")
public class class299 extends class300 {

    @ObfuscatedName("kf.z")
    public class328 field3695;

    @ObfuscatedName("kf.n")
    public static final int[] field3696 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("kf.v")
    public int field3694;

    public class299(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("kf.z([II)V")
    public void method4939(int[] arg0) {
        this.field3695 = new class328(arg0);
    }

    @ObfuscatedName("kf.n(Llg;B)V")
    public void method4969(class328 arg0) {
        this.field3695 = arg0;
    }

    @ObfuscatedName("kf.v(II)V")
    public void method4941(int arg0) {
        this.field3699[++this.field3702 - 1] = (byte) (arg0 + this.field3695.method5706());
    }

    @ObfuscatedName("kf.u(I)I")
    public int method4942() {
        return this.field3699[++this.field3702 - 1] - this.field3695.method5706() & 0xFF;
    }

    @ObfuscatedName("kf.r(I)Z")
    public boolean method4943() {
        int var1 = this.field3699[this.field3702] - this.field3695.method5695() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("kf.p(I)I")
    public int method4968() {
        int var1 = this.field3699[++this.field3702 - 1] - this.field3695.method5706() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field3699[++this.field3702 - 1] - this.field3695.method5706() & 0xFF);
    }

    @ObfuscatedName("kf.q([BIII)V")
    public void method4948(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field3699[++this.field3702 - 1] - this.field3695.method5706());
        }
    }

    @ObfuscatedName("kf.m(I)V")
    public void method4959() {
        this.field3694 = this.field3702 * 8;
    }

    @ObfuscatedName("kf.y(II)I")
    public int method4947(int arg0) {
        int var2 = this.field3694 >> 3;
        int var3 = 8 - (this.field3694 & 0x7);
        int var4 = 0;
        this.field3694 += arg0;
        while (arg0 > var3) {
            var4 += (this.field3699[var2++] & field3696[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field3699[var2] & field3696[var3]) + var4;
        } else {
            var5 = (this.field3699[var2] >> var3 - arg0 & field3696[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("kf.i(B)V")
    public void method4945() {
        this.field3702 = (this.field3694 + 7) / 8;
    }

    @ObfuscatedName("kf.c(II)I")
    public int method4949(int arg0) {
        return arg0 * 8 - this.field3694;
    }
}
