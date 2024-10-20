package deob;

@ObfuscatedName("fd")
public final class class180 extends class174 {

    @ObfuscatedName("fd.v")
    public class181 field2435;

    @ObfuscatedName("fd.t")
    public static final int[] field2436 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fd.y")
    public int field2437;

    public class180(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fd.ik([II)V")
    public void method3230(int[] arg0) {
        this.field2435 = new class181(arg0);
    }

    @ObfuscatedName("fd.ix(II)V")
    public void method3210(int arg0) {
        this.field2409[++this.field2405 - 1] = (byte) (arg0 + this.field2435.method3240());
    }

    @ObfuscatedName("fd.iu(I)I")
    public int method3235() {
        return this.field2409[++this.field2405 - 1] - this.field2435.method3240() & 0xFF;
    }

    @ObfuscatedName("fd.im(I)V")
    public void method3212() {
        this.field2437 = this.field2405 * 8;
    }

    @ObfuscatedName("fd.in(II)I")
    public int method3213(int arg0) {
        int var2 = this.field2437 >> 3;
        int var3 = 8 - (this.field2437 & 0x7);
        int var4 = 0;
        this.field2437 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2409[var2++] & field2436[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2409[var2] & field2436[var3]) + var4;
        } else {
            var5 = (this.field2409[var2] >> var3 - arg0 & field2436[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fd.ic(B)V")
    public void method3208() {
        this.field2405 = (this.field2437 + 7) / 8;
    }

    @ObfuscatedName("fd.io(II)I")
    public int method3215(int arg0) {
        return arg0 * 8 - this.field2437;
    }
}
