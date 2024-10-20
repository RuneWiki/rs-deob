package deob;

@ObfuscatedName("fg")
public final class class160 extends class154 {

    @ObfuscatedName("fg.g")
    public class161 field2108;

    @ObfuscatedName("fg.z")
    public static final int[] field2113 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fg.t")
    public int field2110;

    public class160(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fg.iy([II)V")
    public void method2831(int[] arg0) {
        this.field2108 = new class161(arg0);
    }

    @ObfuscatedName("fg.in(II)V")
    public void method2832(int arg0) {
        this.field2078[++this.field2073 - 1] = (byte) (arg0 + this.field2108.method2866());
    }

    @ObfuscatedName("fg.iu(B)I")
    public int method2833() {
        return this.field2078[++this.field2073 - 1] - this.field2108.method2866() & 0xFF;
    }

    @ObfuscatedName("fg.iq(I)V")
    public void method2834() {
        this.field2110 = this.field2073 * 8;
    }

    @ObfuscatedName("fg.iw(IB)I")
    public int method2835(int arg0) {
        int var2 = this.field2110 >> 3;
        int var3 = 8 - (this.field2110 & 0x7);
        int var4 = 0;
        this.field2110 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2078[var2++] & field2113[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2078[var2] & field2113[var3]) + var4;
        } else {
            var5 = (this.field2078[var2] >> var3 - arg0 & field2113[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fg.ip(I)V")
    public void method2843() {
        this.field2073 = (this.field2110 + 7) / 8;
    }

    @ObfuscatedName("fg.ix(II)I")
    public int method2836(int arg0) {
        return arg0 * 8 - this.field2110;
    }
}
