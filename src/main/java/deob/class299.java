package deob;

@ObfuscatedName("kl")
public class class299 extends class300 {

    @ObfuscatedName("kl.f")
    public class328 field3699;

    @ObfuscatedName("kl.i")
    public static final int[] field3700 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("kl.y")
    public int field3698;

    public class299(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("kl.f([II)V")
    public void method5072(int[] arg0) {
        this.field3699 = new class328(arg0);
    }

    @ObfuscatedName("kl.i(Llr;I)V")
    public void method5083(class328 arg0) {
        this.field3699 = arg0;
    }

    @ObfuscatedName("kl.y(II)V")
    public void method5057(int arg0) {
        this.field3704[++this.field3703 - 1] = (byte) (arg0 + this.field3699.method5806());
    }

    @ObfuscatedName("kl.w(I)I")
    public int method5058() {
        return this.field3704[++this.field3703 - 1] - this.field3699.method5806() & 0xFF;
    }

    @ObfuscatedName("kl.p(B)Z")
    public boolean method5059() {
        int var1 = this.field3704[this.field3703] - this.field3699.method5807() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("kl.b(B)I")
    public int method5087() {
        int var1 = this.field3704[++this.field3703 - 1] - this.field3699.method5806() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field3704[++this.field3703 - 1] - this.field3699.method5806() & 0xFF);
    }

    @ObfuscatedName("kl.e([BIII)V")
    public void method5061(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field3704[++this.field3703 - 1] - this.field3699.method5806());
        }
    }

    @ObfuscatedName("kl.x(I)V")
    public void method5062() {
        this.field3698 = this.field3703 * 8;
    }

    @ObfuscatedName("kl.a(II)I")
    public int method5063(int arg0) {
        int var2 = this.field3698 >> 3;
        int var3 = 8 - (this.field3698 & 0x7);
        int var4 = 0;
        this.field3698 += arg0;
        while (arg0 > var3) {
            var4 += (this.field3704[var2++] & field3700[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field3704[var2] & field3700[var3]) + var4;
        } else {
            var5 = (this.field3704[var2] >> var3 - arg0 & field3700[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("kl.d(I)V")
    public void method5064() {
        this.field3703 = (this.field3698 + 7) / 8;
    }

    @ObfuscatedName("kl.c(IB)I")
    public int method5065(int arg0) {
        return arg0 * 8 - this.field3698;
    }
}
