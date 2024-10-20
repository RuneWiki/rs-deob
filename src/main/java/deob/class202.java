package deob;

@ObfuscatedName("gl")
public final class class202 extends class195 {

    @ObfuscatedName("gl.c")
    public class203 field2609;

    @ObfuscatedName("gl.h")
    public static final int[] field2608 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gl.i")
    public int field2607;

    public class202(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gl.hg([II)V")
    public void method3553(int[] arg0) {
        this.field2609 = new class203(arg0);
    }

    @ObfuscatedName("gl.ie(Lgo;I)V")
    public void method3554(class203 arg0) {
        this.field2609 = arg0;
    }

    @ObfuscatedName("gl.if(IB)V")
    public void method3555(int arg0) {
        this.field2563[++this.field2562 - 1] = (byte) (arg0 + this.field2609.method3594());
    }

    @ObfuscatedName("gl.in(I)I")
    public int method3572() {
        return this.field2563[++this.field2562 - 1] - this.field2609.method3594() & 0xFF;
    }

    @ObfuscatedName("gl.im(I)Z")
    public boolean method3552() {
        int var1 = this.field2563[this.field2562] - this.field2609.method3595() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gl.io(I)I")
    public int method3558() {
        int var1 = this.field2563[++this.field2562 - 1] - this.field2609.method3594() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2563[++this.field2562 - 1] - this.field2609.method3594() & 0xFF);
    }

    @ObfuscatedName("gl.ig(B)V")
    public void method3559() {
        this.field2607 = this.field2562 * 8;
    }

    @ObfuscatedName("gl.ib(IB)I")
    public int method3562(int arg0) {
        int var2 = this.field2607 >> 3;
        int var3 = 8 - (this.field2607 & 0x7);
        int var4 = 0;
        this.field2607 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2563[var2++] & field2608[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2563[var2] & field2608[var3]) + var4;
        } else {
            var5 = (this.field2563[var2] >> var3 - arg0 & field2608[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gl.iu(B)V")
    public void method3556() {
        this.field2562 = (this.field2607 + 7) / 8;
    }

    @ObfuscatedName("gl.iz(IS)I")
    public int method3590(int arg0) {
        return arg0 * 8 - this.field2607;
    }
}
