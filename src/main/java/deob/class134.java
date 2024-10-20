package deob;

@ObfuscatedName("db")
public final class class134 extends class31 {

    @ObfuscatedName("db.o")
    public int field2004;

    @ObfuscatedName("db.j")
    public class27 field2012;

    @ObfuscatedName("db.p")
    public static final int[] field2008 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    public class134(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("db.p(IS)V")
    public void method2253(int arg0) {
        this.field168[++this.field172 - 1] = (byte) (arg0 + this.field2012.method288());
    }

    @ObfuscatedName("db.o(I)I")
    public int method2254() {
        return this.field168[++this.field172 - 1] - this.field2012.method288() & 0xFF;
    }

    @ObfuscatedName("db.j([II)V")
    public void method2256(int[] arg0) {
        this.field2012 = new class27(arg0);
    }

    @ObfuscatedName("db.n(IB)I")
    public int method2258(int arg0) {
        return arg0 * 8 - this.field2004;
    }

    @ObfuscatedName("db.r(I)V")
    public void method2266() {
        this.field172 = (this.field2004 + 7) / 8;
    }

    @ObfuscatedName("db.h(II)I")
    public int method2270(int arg0) {
        int var2 = this.field2004 >> 3;
        int var3 = 8 - (this.field2004 & 0x7);
        int var4 = 0;
        this.field2004 += arg0;
        while (arg0 > var3) {
            var4 += (this.field168[var2++] & field2008[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field168[var2] & field2008[var3]) + var4;
        } else {
            var5 = (this.field168[var2] >> var3 - arg0 & field2008[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("db.t(I)V")
    public void method2275() {
        this.field2004 = this.field172 * 8;
    }
}
