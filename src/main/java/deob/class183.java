package deob;

@ObfuscatedName("gd")
public final class class183 extends class177 {

    @ObfuscatedName("gd.n")
    public class184 field2436;

    @ObfuscatedName("gd.z")
    public static final int[] field2434 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gd.o")
    public int field2435;

    public class183(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gd.hr([II)V")
    public void method3194(int[] arg0) {
        this.field2436 = new class184(arg0);
    }

    @ObfuscatedName("gd.hi(II)V")
    public void method3195(int arg0) {
        this.field2403[++this.field2402 - 1] = (byte) (arg0 + this.field2436.method3223());
    }

    @ObfuscatedName("gd.ho(I)I")
    public int method3196() {
        return this.field2403[++this.field2402 - 1] - this.field2436.method3223() & 0xFF;
    }

    @ObfuscatedName("gd.hh(I)V")
    public void method3197() {
        this.field2435 = this.field2402 * 8;
    }

    @ObfuscatedName("gd.hl(IB)I")
    public int method3198(int arg0) {
        int var2 = this.field2435 >> 3;
        int var3 = 8 - (this.field2435 & 0x7);
        int var4 = 0;
        this.field2435 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2403[var2++] & field2434[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2403[var2] & field2434[var3]) + var4;
        } else {
            var5 = (this.field2403[var2] >> var3 - arg0 & field2434[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gd.ht(I)V")
    public void method3199() {
        this.field2402 = (this.field2435 + 7) / 8;
    }

    @ObfuscatedName("gd.io(II)I")
    public int method3200(int arg0) {
        return arg0 * 8 - this.field2435;
    }
}
