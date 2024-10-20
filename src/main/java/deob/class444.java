package deob;

@ObfuscatedName("qf")
public class class444 extends class445 {

    @ObfuscatedName("qf.c")
    public class461 field4731;

    @ObfuscatedName("qf.p")
    public static final int[] field4732 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("qf.f")
    public int field4730;

    public class444(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("qf.c([II)V")
    public void method7151(int[] arg0) {
        this.field4731 = new class461(arg0);
    }

    @ObfuscatedName("qf.p(Lqv;I)V")
    public void method7139(class461 arg0) {
        this.field4731 = arg0;
    }

    @ObfuscatedName("qf.f(IB)V")
    public void method7140(int arg0) {
        this.field4733[++this.field4735 - 1] = (byte) (arg0 + this.field4731.method7749());
    }

    @ObfuscatedName("qf.n(I)I")
    public int method7141() {
        return this.field4733[++this.field4735 - 1] - this.field4731.method7749() & 0xFF;
    }

    @ObfuscatedName("qf.k(B)Z")
    public boolean method7142() {
        int var1 = this.field4733[this.field4735] - this.field4731.method7750() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("qf.w(I)I")
    public int method7174() {
        int var1 = this.field4733[++this.field4735 - 1] - this.field4731.method7749() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4733[++this.field4735 - 1] - this.field4731.method7749() & 0xFF);
    }

    @ObfuscatedName("qf.s([BIII)V")
    public void method7144(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4733[++this.field4735 - 1] - this.field4731.method7749());
        }
    }

    @ObfuscatedName("qf.q(B)V")
    public void method7145() {
        this.field4730 = this.field4735 * 8;
    }

    @ObfuscatedName("qf.m(II)I")
    public int method7146(int arg0) {
        int var2 = this.field4730 >> 3;
        int var3 = 8 - (this.field4730 & 0x7);
        int var4 = 0;
        this.field4730 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4733[var2++] & field4732[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4733[var2] & field4732[var3]) + var4;
        } else {
            var5 = (this.field4733[var2] >> var3 - arg0 & field4732[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("qf.x(I)V")
    public void method7147() {
        this.field4735 = (this.field4730 + 7) / 8;
    }

    @ObfuscatedName("qf.j(II)I")
    public int method7148(int arg0) {
        return arg0 * 8 - this.field4730;
    }
}
