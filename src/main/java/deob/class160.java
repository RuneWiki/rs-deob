package deob;

@ObfuscatedName("ff")
public final class class160 extends class154 {

    @ObfuscatedName("ff.a")
    public class161 field2120;

    @ObfuscatedName("ff.i")
    public static final int[] field2119 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ff.s")
    public int field2121;

    public class160(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ff.ii([II)V")
    public void method2947(int[] arg0) {
        this.field2120 = new class161(arg0);
    }

    @ObfuscatedName("ff.ie(II)V")
    public void method2948(int arg0) {
        this.field2086[++this.field2087 - 1] = (byte) (arg0 + this.field2120.method2978());
    }

    @ObfuscatedName("ff.il(I)I")
    public int method2962() {
        return this.field2086[++this.field2087 - 1] - this.field2120.method2978() & 0xFF;
    }

    @ObfuscatedName("ff.ir(I)V")
    public void method2969() {
        this.field2121 = this.field2087 * 8;
    }

    @ObfuscatedName("ff.ig(II)I")
    public int method2951(int arg0) {
        int var2 = this.field2121 >> 3;
        int var3 = 8 - (this.field2121 & 0x7);
        int var4 = 0;
        this.field2121 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2086[var2++] & field2119[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2086[var2] & field2119[var3]) + var4;
        } else {
            var5 = (this.field2086[var2] >> var3 - arg0 & field2119[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ff.iw(I)V")
    public void method2952() {
        this.field2087 = (this.field2121 + 7) / 8;
    }

    @ObfuscatedName("ff.ib(II)I")
    public int method2953(int arg0) {
        return arg0 * 8 - this.field2121;
    }
}
