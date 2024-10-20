package deob;

@ObfuscatedName("fx")
public final class class160 extends class154 {

    @ObfuscatedName("fx.w")
    public class161 field2129;

    @ObfuscatedName("fx.v")
    public static final int[] field2127 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fx.h")
    public int field2131;

    public class160(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fx.hi([IB)V")
    public void method2786(int[] arg0) {
        this.field2129 = new class161(arg0);
    }

    @ObfuscatedName("fx.hy(IB)V")
    public void method2783(int arg0) {
        this.field2094[++this.field2091 - 1] = (byte) (arg0 + this.field2129.method2804());
    }

    @ObfuscatedName("fx.hb(I)I")
    public int method2782() {
        return this.field2094[++this.field2091 - 1] - this.field2129.method2804() & 0xFF;
    }

    @ObfuscatedName("fx.hv(B)V")
    public void method2784() {
        this.field2131 = this.field2091 * 8;
    }

    @ObfuscatedName("fx.hn(II)I")
    public int method2785(int arg0) {
        int var2 = this.field2131 >> 3;
        int var3 = 8 - (this.field2131 & 0x7);
        int var4 = 0;
        this.field2131 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2094[var2++] & field2127[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2094[var2] & field2127[var3]) + var4;
        } else {
            var5 = (this.field2094[var2] >> var3 - arg0 & field2127[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fx.hl(B)V")
    public void method2789() {
        this.field2091 = (this.field2131 + 7) / 8;
    }

    @ObfuscatedName("fx.hs(II)I")
    public int method2795(int arg0) {
        return arg0 * 8 - this.field2131;
    }
}
