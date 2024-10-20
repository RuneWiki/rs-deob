package deob;

@ObfuscatedName("ft")
public final class class160 extends class154 {

    @ObfuscatedName("ft.r")
    public class161 field2119;

    @ObfuscatedName("ft.t")
    public static final int[] field2117 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ft.k")
    public int field2120;

    public class160(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ft.id([II)V")
    public void method2913(int[] arg0) {
        this.field2119 = new class161(arg0);
    }

    @ObfuscatedName("ft.ij(IB)V")
    public void method2920(int arg0) {
        this.field2084[++this.field2079 - 1] = (byte) (arg0 + this.field2119.method2933());
    }

    @ObfuscatedName("ft.ix(I)I")
    public int method2914() {
        return this.field2084[++this.field2079 - 1] - this.field2119.method2933() & 0xFF;
    }

    @ObfuscatedName("ft.ia(B)V")
    public void method2915() {
        this.field2120 = this.field2079 * 8;
    }

    @ObfuscatedName("ft.ii(II)I")
    public int method2927(int arg0) {
        int var2 = this.field2120 >> 3;
        int var3 = 8 - (this.field2120 & 0x7);
        int var4 = 0;
        this.field2120 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2084[var2++] & field2117[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2084[var2] & field2117[var3]) + var4;
        } else {
            var5 = (this.field2084[var2] >> var3 - arg0 & field2117[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ft.ip(I)V")
    public void method2917() {
        this.field2079 = (this.field2120 + 7) / 8;
    }

    @ObfuscatedName("ft.it(IB)I")
    public int method2918(int arg0) {
        return arg0 * 8 - this.field2120;
    }
}
