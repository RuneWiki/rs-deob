package deob;

@ObfuscatedName("er")
public final class class150 extends class135 {

    @ObfuscatedName("er.e")
    public class59 field2255;

    @ObfuscatedName("er.a")
    public static final int[] field2256 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("er.g")
    public int field2254;

    public class150(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("er.gc([II)V")
    public void method2287(int[] arg0) {
        this.field2255 = new class59(arg0);
    }

    @ObfuscatedName("er.gx(IB)V")
    public void method2288(int arg0) {
        this.field1723[++this.field1722 - 1] = (byte) (arg0 + this.field2255.method751());
    }

    @ObfuscatedName("er.gr(I)I")
    public int method2303() {
        return this.field1723[++this.field1722 - 1] - this.field2255.method751() & 0xFF;
    }

    @ObfuscatedName("er.gu(S)V")
    public void method2294() {
        this.field2254 = this.field1722 * 8;
    }

    @ObfuscatedName("er.gz(II)I")
    public int method2290(int arg0) {
        int var2 = this.field2254 >> 3;
        int var3 = 8 - (this.field2254 & 0x7);
        int var4 = 0;
        this.field2254 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1723[var2++] & field2256[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1723[var2] & field2256[var3]) + var4;
        } else {
            var5 = (this.field1723[var2] >> var3 - arg0 & field2256[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("er.gf(B)V")
    public void method2291() {
        this.field1722 = (this.field2254 + 7) / 8;
    }

    @ObfuscatedName("er.gk(II)I")
    public int method2292(int arg0) {
        return arg0 * 8 - this.field2254;
    }
}
