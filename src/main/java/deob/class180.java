package deob;

@ObfuscatedName("fs")
public final class class180 extends class174 {

    @ObfuscatedName("fs.l")
    public class181 field2412;

    @ObfuscatedName("fs.a")
    public static final int[] field2413 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fs.k")
    public int field2416;

    public class180(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fs.hq([II)V")
    public void method3191(int[] arg0) {
        this.field2412 = new class181(arg0);
    }

    @ObfuscatedName("fs.iz(II)V")
    public void method3179(int arg0) {
        this.field2387[++this.field2384 - 1] = (byte) (arg0 + this.field2412.method3202());
    }

    @ObfuscatedName("fs.iy(B)I")
    public int method3180() {
        return this.field2387[++this.field2384 - 1] - this.field2412.method3202() & 0xFF;
    }

    @ObfuscatedName("fs.ig(I)V")
    public void method3185() {
        this.field2416 = this.field2384 * 8;
    }

    @ObfuscatedName("fs.in(II)I")
    public int method3186(int arg0) {
        int var2 = this.field2416 >> 3;
        int var3 = 8 - (this.field2416 & 0x7);
        int var4 = 0;
        this.field2416 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2387[var2++] & field2413[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2387[var2] & field2413[var3]) + var4;
        } else {
            var5 = (this.field2387[var2] >> var3 - arg0 & field2413[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fs.il(I)V")
    public void method3182() {
        this.field2384 = (this.field2416 + 7) / 8;
    }

    @ObfuscatedName("fs.ic(IS)I")
    public int method3184(int arg0) {
        return arg0 * 8 - this.field2416;
    }
}
