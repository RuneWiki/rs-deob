package deob;

@ObfuscatedName("nb")
public class class382 extends class383 {

    @ObfuscatedName("nb.v")
    public class399 field4153;

    @ObfuscatedName("nb.n")
    public static final int[] field4154 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("nb.f")
    public int field4152;

    public class382(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("nb.v([II)V")
    public void method5915(int[] arg0) {
        this.field4153 = new class399(arg0);
    }

    @ObfuscatedName("nb.n(Loy;B)V")
    public void method5914(class399 arg0) {
        this.field4153 = arg0;
    }

    @ObfuscatedName("nb.f(II)V")
    public void method5917(int arg0) {
        this.field4155[++this.field4158 - 1] = (byte) (arg0 + this.field4153.method6477());
    }

    @ObfuscatedName("nb.y(B)I")
    public int method5939() {
        return this.field4155[++this.field4158 - 1] - this.field4153.method6477() & 0xFF;
    }

    @ObfuscatedName("nb.p(I)Z")
    public boolean method5928() {
        int var1 = this.field4155[this.field4158] - this.field4153.method6478() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("nb.j(I)I")
    public int method5937() {
        int var1 = this.field4155[++this.field4158 - 1] - this.field4153.method6477() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4155[++this.field4158 - 1] - this.field4153.method6477() & 0xFF);
    }

    @ObfuscatedName("nb.r([BIIS)V")
    public void method5920(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4155[++this.field4158 - 1] - this.field4153.method6477());
        }
    }

    @ObfuscatedName("nb.b(I)V")
    public void method5918() {
        this.field4152 = this.field4158 * 8;
    }

    @ObfuscatedName("nb.d(IB)I")
    public int method5921(int arg0) {
        int var2 = this.field4152 >> 3;
        int var3 = 8 - (this.field4152 & 0x7);
        int var4 = 0;
        this.field4152 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4155[var2++] & field4154[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4155[var2] & field4154[var3]) + var4;
        } else {
            var5 = (this.field4155[var2] >> var3 - arg0 & field4154[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("nb.s(B)V")
    public void method5922() {
        this.field4158 = (this.field4152 + 7) / 8;
    }

    @ObfuscatedName("nb.u(IB)I")
    public int method5923(int arg0) {
        return arg0 * 8 - this.field4152;
    }
}
