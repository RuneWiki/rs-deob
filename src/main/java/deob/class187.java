package deob;

@ObfuscatedName("gd")
public final class class187 extends class181 {

    @ObfuscatedName("gd.k")
    public class188 field2515;

    @ObfuscatedName("gd.n")
    public static final int[] field2516 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gd.d")
    public int field2517;

    public class187(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gd.iz([II)V")
    public void method3228(int[] arg0) {
        this.field2515 = new class188(arg0);
    }

    @ObfuscatedName("gd.iu(Lgi;I)V")
    public void method3202(class188 arg0) {
        this.field2515 = arg0;
    }

    @ObfuscatedName("gd.is(II)V")
    public void method3203(int arg0) {
        this.field2495[++this.field2488 - 1] = (byte) (arg0 + this.field2515.method3242());
    }

    @ObfuscatedName("gd.it(I)I")
    public int method3204() {
        return this.field2495[++this.field2488 - 1] - this.field2515.method3242() & 0xFF;
    }

    @ObfuscatedName("gd.ih(B)Z")
    public boolean method3230() {
        int var1 = this.field2495[this.field2488] - this.field2515.method3247() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gd.ip(I)I")
    public int method3206() {
        int var1 = this.field2495[++this.field2488 - 1] - this.field2515.method3242() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2495[++this.field2488 - 1] - this.field2515.method3242() & 0xFF);
    }

    @ObfuscatedName("gd.ib(I)V")
    public void method3214() {
        this.field2517 = this.field2488 * 8;
    }

    @ObfuscatedName("gd.ia(II)I")
    public int method3208(int arg0) {
        int var2 = this.field2517 >> 3;
        int var3 = 8 - (this.field2517 & 0x7);
        int var4 = 0;
        this.field2517 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2495[var2++] & field2516[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2495[var2] & field2516[var3]) + var4;
        } else {
            var5 = (this.field2495[var2] >> var3 - arg0 & field2516[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gd.im(I)V")
    public void method3233() {
        this.field2488 = (this.field2517 + 7) / 8;
    }

    @ObfuscatedName("gd.ix(IB)I")
    public int method3209(int arg0) {
        return arg0 * 8 - this.field2517;
    }
}
