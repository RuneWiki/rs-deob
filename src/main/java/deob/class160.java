package deob;

@ObfuscatedName("fm")
public final class class160 extends class154 {

    @ObfuscatedName("fm.m")
    public class161 field2144;

    @ObfuscatedName("fm.w")
    public static final int[] field2143 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fm.j")
    public int field2148;

    public class160(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fm.hv([IB)V")
    public void method2888(int[] arg0) {
        this.field2144 = new class161(arg0);
    }

    @ObfuscatedName("fm.he(II)V")
    public void method2889(int arg0) {
        this.field2114[++this.field2111 - 1] = (byte) (arg0 + this.field2144.method2912());
    }

    @ObfuscatedName("fm.hu(I)I")
    public int method2894() {
        return this.field2114[++this.field2111 - 1] - this.field2144.method2912() & 0xFF;
    }

    @ObfuscatedName("fm.hp(I)V")
    public void method2891() {
        this.field2148 = this.field2111 * 8;
    }

    @ObfuscatedName("fm.ho(II)I")
    public int method2900(int arg0) {
        int var2 = this.field2148 >> 3;
        int var3 = 8 - (this.field2148 & 0x7);
        int var4 = 0;
        this.field2148 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2114[var2++] & field2143[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2114[var2] & field2143[var3]) + var4;
        } else {
            var5 = (this.field2114[var2] >> var3 - arg0 & field2143[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fm.hc(I)V")
    public void method2892() {
        this.field2111 = (this.field2148 + 7) / 8;
    }

    @ObfuscatedName("fm.hf(IB)I")
    public int method2887(int arg0) {
        return arg0 * 8 - this.field2148;
    }
}
