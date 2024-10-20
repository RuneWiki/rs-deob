package deob;

@ObfuscatedName("kj")
public class class299 extends class300 {

    @ObfuscatedName("kj.u")
    public class328 field3703;

    @ObfuscatedName("kj.f")
    public static final int[] field3702 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("kj.b")
    public int field3701;

    public class299(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("kj.u([II)V")
    public void method5105(int[] arg0) {
        this.field3703 = new class328(arg0);
    }

    @ObfuscatedName("kj.f(Lld;I)V")
    public void method5083(class328 arg0) {
        this.field3703 = arg0;
    }

    @ObfuscatedName("kj.b(II)V")
    public void method5084(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 + this.field3703.method5814());
    }

    @ObfuscatedName("kj.g(I)I")
    public int method5085() {
        return this.field3708[++this.field3707 - 1] - this.field3703.method5814() & 0xFF;
    }

    @ObfuscatedName("kj.z(I)Z")
    public boolean method5118() {
        int var1 = this.field3708[this.field3707] - this.field3703.method5815() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("kj.p(S)I")
    public int method5082() {
        int var1 = this.field3708[++this.field3707 - 1] - this.field3703.method5814() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field3708[++this.field3707 - 1] - this.field3703.method5814() & 0xFF);
    }

    @ObfuscatedName("kj.h([BIII)V")
    public void method5088(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field3708[++this.field3707 - 1] - this.field3703.method5814());
        }
    }

    @ObfuscatedName("kj.y(I)V")
    public void method5089() {
        this.field3701 = this.field3707 * 8;
    }

    @ObfuscatedName("kj.w(II)I")
    public int method5090(int arg0) {
        int var2 = this.field3701 >> 3;
        int var3 = 8 - (this.field3701 & 0x7);
        int var4 = 0;
        this.field3701 += arg0;
        while (arg0 > var3) {
            var4 += (this.field3708[var2++] & field3702[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field3708[var2] & field3702[var3]) + var4;
        } else {
            var5 = (this.field3708[var2] >> var3 - arg0 & field3702[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("kj.i(I)V")
    public void method5091() {
        this.field3707 = (this.field3701 + 7) / 8;
    }

    @ObfuscatedName("kj.k(II)I")
    public int method5092(int arg0) {
        return arg0 * 8 - this.field3701;
    }
}
