package deob;

@ObfuscatedName("fp")
public final class class160 extends class154 {

    @ObfuscatedName("fp.u")
    public class161 field2138;

    @ObfuscatedName("fp.k")
    public static final int[] field2139 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fp.z")
    public int field2142;

    public class160(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fp.hr([II)V")
    public void method2790(int[] arg0) {
        this.field2138 = new class161(arg0);
    }

    @ObfuscatedName("fp.hx(IB)V")
    public void method2782(int arg0) {
        this.field2108[++this.field2105 - 1] = (byte) (arg0 + this.field2138.method2809());
    }

    @ObfuscatedName("fp.hc(I)I")
    public int method2783() {
        return this.field2108[++this.field2105 - 1] - this.field2138.method2809() & 0xFF;
    }

    @ObfuscatedName("fp.hb(I)V")
    public void method2784() {
        this.field2142 = this.field2105 * 8;
    }

    @ObfuscatedName("fp.hs(II)I")
    public int method2801(int arg0) {
        int var2 = this.field2142 >> 3;
        int var3 = 8 - (this.field2142 & 0x7);
        int var4 = 0;
        this.field2142 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2108[var2++] & field2139[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2108[var2] & field2139[var3]) + var4;
        } else {
            var5 = (this.field2108[var2] >> var3 - arg0 & field2139[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fp.hl(I)V")
    public void method2807() {
        this.field2105 = (this.field2142 + 7) / 8;
    }

    @ObfuscatedName("fp.il(II)I")
    public int method2786(int arg0) {
        return arg0 * 8 - this.field2142;
    }
}
