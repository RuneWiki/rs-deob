package deob;

@ObfuscatedName("ks")
public class class310 extends class311 {

    @ObfuscatedName("ks.f")
    public class339 field3738;

    @ObfuscatedName("ks.b")
    public static final int[] field3737 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ks.l")
    public int field3736;

    public class310(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ks.f([II)V")
    public void method5152(int[] arg0) {
        this.field3738 = new class339(arg0);
    }

    @ObfuscatedName("ks.b(Lmh;I)V")
    public void method5121(class339 arg0) {
        this.field3738 = arg0;
    }

    @ObfuscatedName("ks.l(II)V")
    public void method5142(int arg0) {
        this.field3742[++this.field3741 - 1] = (byte) (arg0 + this.field3738.method5888());
    }

    @ObfuscatedName("ks.m(B)I")
    public int method5124() {
        return this.field3742[++this.field3741 - 1] - this.field3738.method5888() & 0xFF;
    }

    @ObfuscatedName("ks.z(B)Z")
    public boolean method5125() {
        int var1 = this.field3742[this.field3741] - this.field3738.method5895() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("ks.q(I)I")
    public int method5134() {
        int var1 = this.field3742[++this.field3741 - 1] - this.field3738.method5888() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field3742[++this.field3741 - 1] - this.field3738.method5888() & 0xFF);
    }

    @ObfuscatedName("ks.k([BIII)V")
    public void method5127(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field3742[++this.field3741 - 1] - this.field3738.method5888());
        }
    }

    @ObfuscatedName("ks.c(B)V")
    public void method5128() {
        this.field3736 = this.field3741 * 8;
    }

    @ObfuscatedName("ks.u(IB)I")
    public int method5129(int arg0) {
        int var2 = this.field3736 >> 3;
        int var3 = 8 - (this.field3736 & 0x7);
        int var4 = 0;
        this.field3736 += arg0;
        while (arg0 > var3) {
            var4 += (this.field3742[var2++] & field3737[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field3742[var2] & field3737[var3]) + var4;
        } else {
            var5 = (this.field3742[var2] >> var3 - arg0 & field3737[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ks.t(I)V")
    public void method5153() {
        this.field3741 = (this.field3736 + 7) / 8;
    }

    @ObfuscatedName("ks.e(II)I")
    public int method5131(int arg0) {
        return arg0 * 8 - this.field3736;
    }
}
