package deob;

@ObfuscatedName("gu")
public final class class200 extends class194 {

    @ObfuscatedName("gu.g")
    public class201 field2570;

    @ObfuscatedName("gu.c")
    public static final int[] field2571 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gu.u")
    public int field2569;

    public class200(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gu.ji([II)V")
    public void method3519(int[] arg0) {
        this.field2570 = new class201(arg0);
    }

    @ObfuscatedName("gu.jl(Lgo;B)V")
    public void method3520(class201 arg0) {
        this.field2570 = arg0;
    }

    @ObfuscatedName("gu.jk(II)V")
    public void method3521(int arg0) {
        this.field2541[++this.field2538 - 1] = (byte) (arg0 + this.field2570.method3558());
    }

    @ObfuscatedName("gu.jp(I)I")
    public int method3522() {
        return this.field2541[++this.field2538 - 1] - this.field2570.method3558() & 0xFF;
    }

    @ObfuscatedName("gu.je(I)Z")
    public boolean method3551() {
        int var1 = this.field2541[this.field2538] - this.field2570.method3559() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gu.jn(I)I")
    public int method3524() {
        int var1 = this.field2541[++this.field2538 - 1] - this.field2570.method3558() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2541[++this.field2538 - 1] - this.field2570.method3558() & 0xFF);
    }

    @ObfuscatedName("gu.jf(B)V")
    public void method3518() {
        this.field2569 = this.field2538 * 8;
    }

    @ObfuscatedName("gu.jm(II)I")
    public int method3529(int arg0) {
        int var2 = this.field2569 >> 3;
        int var3 = 8 - (this.field2569 & 0x7);
        int var4 = 0;
        this.field2569 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2541[var2++] & field2571[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2541[var2] & field2571[var3]) + var4;
        } else {
            var5 = (this.field2541[var2] >> var3 - arg0 & field2571[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gu.jr(I)V")
    public void method3540() {
        this.field2538 = (this.field2569 + 7) / 8;
    }

    @ObfuscatedName("gu.jy(II)I")
    public int method3528(int arg0) {
        return arg0 * 8 - this.field2569;
    }
}
