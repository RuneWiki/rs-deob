package deob;

@ObfuscatedName("fu")
public final class class160 extends class154 {

    @ObfuscatedName("fu.g")
    public class161 field2116;

    @ObfuscatedName("fu.y")
    public static final int[] field2112 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fu.e")
    public int field2114;

    public class160(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fu.hw([IB)V")
    public void method2888(int[] arg0) {
        this.field2116 = new class161(arg0);
    }

    @ObfuscatedName("fu.hy(IB)V")
    public void method2874(int arg0) {
        this.field2091[++this.field2086 - 1] = (byte) (arg0 + this.field2116.method2897());
    }

    @ObfuscatedName("fu.hx(B)I")
    public int method2877() {
        return this.field2091[++this.field2086 - 1] - this.field2116.method2897() & 0xFF;
    }

    @ObfuscatedName("fu.hp(I)V")
    public void method2883() {
        this.field2114 = this.field2086 * 8;
    }

    @ObfuscatedName("fu.il(II)I")
    public int method2895(int arg0) {
        int var2 = this.field2114 >> 3;
        int var3 = 8 - (this.field2114 & 0x7);
        int var4 = 0;
        this.field2114 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2091[var2++] & field2112[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2091[var2] & field2112[var3]) + var4;
        } else {
            var5 = (this.field2091[var2] >> var3 - arg0 & field2112[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fu.ic(I)V")
    public void method2880() {
        this.field2086 = (this.field2114 + 7) / 8;
    }

    @ObfuscatedName("fu.ih(II)I")
    public int method2878(int arg0) {
        return arg0 * 8 - this.field2114;
    }
}
