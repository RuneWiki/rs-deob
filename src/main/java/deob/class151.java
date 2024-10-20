package deob;

@ObfuscatedName("ec")
public final class class151 extends class136 {

    @ObfuscatedName("ec.k")
    public class60 field2256;

    @ObfuscatedName("ec.u")
    public static final int[] field2257 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ec.v")
    public int field2258;

    public class151(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ec.gg([II)V")
    public void method2306(int[] arg0) {
        this.field2256 = new class60(arg0);
    }

    @ObfuscatedName("ec.ge(II)V")
    public void method2308(int arg0) {
        this.field1725[++this.field1722 - 1] = (byte) (arg0 + this.field2256.method754());
    }

    @ObfuscatedName("ec.ga(I)I")
    public int method2326() {
        return this.field1725[++this.field1722 - 1] - this.field2256.method754() & 0xFF;
    }

    @ObfuscatedName("ec.gl(I)V")
    public void method2311() {
        this.field2258 = this.field1722 * 8;
    }

    @ObfuscatedName("ec.gq(II)I")
    public int method2316(int arg0) {
        int var2 = this.field2258 >> 3;
        int var3 = 8 - (this.field2258 & 0x7);
        int var4 = 0;
        this.field2258 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1725[var2++] & field2257[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1725[var2] & field2257[var3]) + var4;
        } else {
            var5 = (this.field1725[var2] >> var3 - arg0 & field2257[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ec.gh(B)V")
    public void method2312() {
        this.field1722 = (this.field2258 + 7) / 8;
    }

    @ObfuscatedName("ec.gk(II)I")
    public int method2313(int arg0) {
        return arg0 * 8 - this.field2258;
    }
}
