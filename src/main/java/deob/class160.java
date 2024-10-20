package deob;

@ObfuscatedName("fx")
public final class class160 extends class154 {

    @ObfuscatedName("fx.a")
    public class161 field2125;

    @ObfuscatedName("fx.r")
    public static final int[] field2121 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fx.x")
    public int field2124;

    public class160(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fx.ig([II)V")
    public void method2932(int[] arg0) {
        this.field2125 = new class161(arg0);
    }

    @ObfuscatedName("fx.io(II)V")
    public void method2936(int arg0) {
        this.field2083[++this.field2085 - 1] = (byte) (arg0 + this.field2125.method2969());
    }

    @ObfuscatedName("fx.ia(I)I")
    public int method2934() {
        return this.field2083[++this.field2085 - 1] - this.field2125.method2969() & 0xFF;
    }

    @ObfuscatedName("fx.ik(I)V")
    public void method2953() {
        this.field2124 = this.field2085 * 8;
    }

    @ObfuscatedName("fx.iy(IB)I")
    public int method2931(int arg0) {
        int var2 = this.field2124 >> 3;
        int var3 = 8 - (this.field2124 & 0x7);
        int var4 = 0;
        this.field2124 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2083[var2++] & field2121[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2083[var2] & field2121[var3]) + var4;
        } else {
            var5 = (this.field2083[var2] >> var3 - arg0 & field2121[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fx.if(B)V")
    public void method2937() {
        this.field2085 = (this.field2124 + 7) / 8;
    }

    @ObfuscatedName("fx.iu(II)I")
    public int method2938(int arg0) {
        return arg0 * 8 - this.field2124;
    }
}
