package deob;

@ObfuscatedName("nu")
public class class384 extends class385 {

    @ObfuscatedName("nu.s")
    public class401 field4177;

    @ObfuscatedName("nu.t")
    public static final int[] field4178 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("nu.v")
    public int field4179;

    public class384(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("nu.s([II)V")
    public void method5895(int[] arg0) {
        this.field4177 = new class401(arg0);
    }

    @ObfuscatedName("nu.t(Log;I)V")
    public void method5896(class401 arg0) {
        this.field4177 = arg0;
    }

    @ObfuscatedName("nu.v(II)V")
    public void method5897(int arg0) {
        this.field4184[++this.field4182 - 1] = (byte) (arg0 + this.field4177.method6499());
    }

    @ObfuscatedName("nu.j(I)I")
    public int method5898() {
        return this.field4184[++this.field4182 - 1] - this.field4177.method6499() & 0xFF;
    }

    @ObfuscatedName("nu.l(B)Z")
    public boolean method5899() {
        int var1 = this.field4184[this.field4182] - this.field4177.method6498() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("nu.n(I)I")
    public int method5900() {
        int var1 = this.field4184[++this.field4182 - 1] - this.field4177.method6499() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4184[++this.field4182 - 1] - this.field4177.method6499() & 0xFF);
    }

    @ObfuscatedName("nu.w([BIIB)V")
    public void method5901(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4184[++this.field4182 - 1] - this.field4177.method6499());
        }
    }

    @ObfuscatedName("nu.f(I)V")
    public void method5902() {
        this.field4179 = this.field4182 * 8;
    }

    @ObfuscatedName("nu.o(IB)I")
    public int method5903(int arg0) {
        int var2 = this.field4179 >> 3;
        int var3 = 8 - (this.field4179 & 0x7);
        int var4 = 0;
        this.field4179 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4184[var2++] & field4178[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4184[var2] & field4178[var3]) + var4;
        } else {
            var5 = (this.field4184[var2] >> var3 - arg0 & field4178[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("nu.x(I)V")
    public void method5923() {
        this.field4182 = (this.field4179 + 7) / 8;
    }

    @ObfuscatedName("nu.r(II)I")
    public int method5911(int arg0) {
        return arg0 * 8 - this.field4179;
    }
}
