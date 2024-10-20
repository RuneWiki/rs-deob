package deob;

@ObfuscatedName("gl")
public final class class192 extends class185 {

    @ObfuscatedName("gl.r")
    public class193 field2445;

    @ObfuscatedName("gl.m")
    public static final int[] field2446 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gl.d")
    public int field2447;

    public class192(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gl.ib([II)V")
    public void method3593(int[] arg0) {
        this.field2445 = new class193(arg0);
    }

    @ObfuscatedName("gl.ia(Lgy;B)V")
    public void method3596(class193 arg0) {
        this.field2445 = arg0;
    }

    @ObfuscatedName("gl.is(II)V")
    public void method3594(int arg0) {
        this.field2415[++this.field2414 - 1] = (byte) (arg0 + this.field2445.method3631());
    }

    @ObfuscatedName("gl.io(I)I")
    public int method3603() {
        return this.field2415[++this.field2414 - 1] - this.field2445.method3631() & 0xFF;
    }

    @ObfuscatedName("gl.ih(I)Z")
    public boolean method3629() {
        int var1 = this.field2415[this.field2414] - this.field2445.method3630() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gl.iu(I)I")
    public int method3608() {
        int var1 = this.field2415[++this.field2414 - 1] - this.field2445.method3631() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2415[++this.field2414 - 1] - this.field2445.method3631() & 0xFF);
    }

    @ObfuscatedName("gl.iw([BIII)V")
    public void method3591(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field2415[++this.field2414 - 1] - this.field2445.method3631());
        }
    }

    @ObfuscatedName("gl.ik(I)V")
    public void method3598() {
        this.field2447 = this.field2414 * 8;
    }

    @ObfuscatedName("gl.ir(II)I")
    public int method3599(int arg0) {
        int var2 = this.field2447 >> 3;
        int var3 = 8 - (this.field2447 & 0x7);
        int var4 = 0;
        this.field2447 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2415[var2++] & field2446[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2415[var2] & field2446[var3]) + var4;
        } else {
            var5 = (this.field2415[var2] >> var3 - arg0 & field2446[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gl.im(B)V")
    public void method3597() {
        this.field2414 = (this.field2447 + 7) / 8;
    }

    @ObfuscatedName("gl.ij(II)I")
    public int method3601(int arg0) {
        return arg0 * 8 - this.field2447;
    }
}
