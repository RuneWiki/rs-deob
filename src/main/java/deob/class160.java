package deob;

@ObfuscatedName("ff")
public final class class160 extends class154 {

    @ObfuscatedName("ff.i")
    public class161 field2134;

    @ObfuscatedName("ff.o")
    public static final int[] field2130 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ff.m")
    public int field2132;

    public class160(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ff.hi([II)V")
    public void method2893(int[] arg0) {
        this.field2134 = new class161(arg0);
    }

    @ObfuscatedName("ff.hv(II)V")
    public void method2896(int arg0) {
        this.field2092[++this.field2091 - 1] = (byte) (arg0 + this.field2134.method2924());
    }

    @ObfuscatedName("ff.hh(I)I")
    public int method2892() {
        return this.field2092[++this.field2091 - 1] - this.field2134.method2924() & 0xFF;
    }

    @ObfuscatedName("ff.hl(B)V")
    public void method2895() {
        this.field2132 = this.field2091 * 8;
    }

    @ObfuscatedName("ff.hc(II)I")
    public int method2918(int arg0) {
        int var2 = this.field2132 >> 3;
        int var3 = 8 - (this.field2132 & 0x7);
        int var4 = 0;
        this.field2132 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2092[var2++] & field2130[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2092[var2] & field2130[var3]) + var4;
        } else {
            var5 = (this.field2092[var2] >> var3 - arg0 & field2130[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ff.hp(S)V")
    public void method2897() {
        this.field2091 = (this.field2132 + 7) / 8;
    }

    @ObfuscatedName("ff.hx(IS)I")
    public int method2898(int arg0) {
        return arg0 * 8 - this.field2132;
    }
}
