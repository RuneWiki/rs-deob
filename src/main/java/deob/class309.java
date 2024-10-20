package deob;

@ObfuscatedName("kb")
public class class309 extends class310 {

    @ObfuscatedName("kb.m")
    public class338 field3731;

    @ObfuscatedName("kb.o")
    public static final int[] field3729 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("kb.q")
    public int field3730;

    public class309(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("kb.m([II)V")
    public void method5163(int[] arg0) {
        this.field3731 = new class338(arg0);
    }

    @ObfuscatedName("kb.o(Llb;I)V")
    public void method5164(class338 arg0) {
        this.field3731 = arg0;
    }

    @ObfuscatedName("kb.q(II)V")
    public void method5187(int arg0) {
        this.field3736[++this.field3734 - 1] = (byte) (arg0 + this.field3731.method5921());
    }

    @ObfuscatedName("kb.j(I)I")
    public int method5166() {
        return this.field3736[++this.field3734 - 1] - this.field3731.method5921() & 0xFF;
    }

    @ObfuscatedName("kb.p(I)Z")
    public boolean method5167() {
        int var1 = this.field3736[this.field3734] - this.field3731.method5918() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("kb.g(I)I")
    public int method5168() {
        int var1 = this.field3736[++this.field3734 - 1] - this.field3731.method5921() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field3736[++this.field3734 - 1] - this.field3731.method5921() & 0xFF);
    }

    @ObfuscatedName("kb.n([BIII)V")
    public void method5190(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field3736[++this.field3734 - 1] - this.field3731.method5921());
        }
    }

    @ObfuscatedName("kb.u(I)V")
    public void method5170() {
        this.field3730 = this.field3734 * 8;
    }

    @ObfuscatedName("kb.a(II)I")
    public int method5171(int arg0) {
        int var2 = this.field3730 >> 3;
        int var3 = 8 - (this.field3730 & 0x7);
        int var4 = 0;
        this.field3730 += arg0;
        while (arg0 > var3) {
            var4 += (this.field3736[var2++] & field3729[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field3736[var2] & field3729[var3]) + var4;
        } else {
            var5 = (this.field3736[var2] >> var3 - arg0 & field3729[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("kb.z(I)V")
    public void method5172() {
        this.field3734 = (this.field3730 + 7) / 8;
    }

    @ObfuscatedName("kb.w(II)I")
    public int method5195(int arg0) {
        return arg0 * 8 - this.field3730;
    }
}
