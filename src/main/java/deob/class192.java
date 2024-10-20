package deob;

@ObfuscatedName("ge")
public final class class192 extends class185 {

    @ObfuscatedName("ge.n")
    public class193 field2447;

    @ObfuscatedName("ge.i")
    public static final int[] field2446 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ge.p")
    public int field2448;

    public class192(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ge.ih([IB)V")
    public void method3731(int[] arg0) {
        this.field2447 = new class193(arg0);
    }

    @ObfuscatedName("ge.id(Lgt;S)V")
    public void method3727(class193 arg0) {
        this.field2447 = arg0;
    }

    @ObfuscatedName("ge.is(IB)V")
    public void method3728(int arg0) {
        this.field2405[++this.field2406 - 1] = (byte) (arg0 + this.field2447.method3766());
    }

    @ObfuscatedName("ge.ix(B)I")
    public int method3725() {
        return this.field2405[++this.field2406 - 1] - this.field2447.method3766() & 0xFF;
    }

    @ObfuscatedName("ge.ic(B)Z")
    public boolean method3729() {
        int var1 = this.field2405[this.field2406] - this.field2447.method3765() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("ge.im(I)I")
    public int method3730() {
        int var1 = this.field2405[++this.field2406 - 1] - this.field2447.method3766() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2405[++this.field2406 - 1] - this.field2447.method3766() & 0xFF);
    }

    @ObfuscatedName("ge.ii([BIII)V")
    public void method3739(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field2405[++this.field2406 - 1] - this.field2447.method3766());
        }
    }

    @ObfuscatedName("ge.ia(I)V")
    public void method3737() {
        this.field2448 = this.field2406 * 8;
    }

    @ObfuscatedName("ge.ik(II)I")
    public int method3733(int arg0) {
        int var2 = this.field2448 >> 3;
        int var3 = 8 - (this.field2448 & 0x7);
        int var4 = 0;
        this.field2448 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2405[var2++] & field2446[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2405[var2] & field2446[var3]) + var4;
        } else {
            var5 = (this.field2405[var2] >> var3 - arg0 & field2446[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ge.jx(I)V")
    public void method3734() {
        this.field2406 = (this.field2448 + 7) / 8;
    }

    @ObfuscatedName("ge.ju(II)I")
    public int method3735(int arg0) {
        return arg0 * 8 - this.field2448;
    }
}
