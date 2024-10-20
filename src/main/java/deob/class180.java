package deob;

@ObfuscatedName("ff")
public final class class180 extends class174 {

    @ObfuscatedName("ff.f")
    public class181 field2437;

    @ObfuscatedName("ff.c")
    public static final int[] field2436 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ff.o")
    public int field2438;

    public class180(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ff.ic([II)V")
    public void method3053(int[] arg0) {
        this.field2437 = new class181(arg0);
    }

    @ObfuscatedName("ff.iw(IB)V")
    public void method3054(int arg0) {
        this.field2415[++this.field2408 - 1] = (byte) (arg0 + this.field2437.method3076());
    }

    @ObfuscatedName("ff.io(B)I")
    public int method3074() {
        return this.field2415[++this.field2408 - 1] - this.field2437.method3076() & 0xFF;
    }

    @ObfuscatedName("ff.if(I)V")
    public void method3056() {
        this.field2438 = this.field2408 * 8;
    }

    @ObfuscatedName("ff.it(II)I")
    public int method3055(int arg0) {
        int var2 = this.field2438 >> 3;
        int var3 = 8 - (this.field2438 & 0x7);
        int var4 = 0;
        this.field2438 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2415[var2++] & field2436[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2415[var2] & field2436[var3]) + var4;
        } else {
            var5 = (this.field2415[var2] >> var3 - arg0 & field2436[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ff.iu(I)V")
    public void method3057() {
        this.field2408 = (this.field2438 + 7) / 8;
    }

    @ObfuscatedName("ff.ip(IB)I")
    public int method3059(int arg0) {
        return arg0 * 8 - this.field2438;
    }
}
