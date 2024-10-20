package deob;

@ObfuscatedName("ge")
public final class class197 extends class190 {

    @ObfuscatedName("ge.q")
    public class198 field2459;

    @ObfuscatedName("ge.b")
    public static final int[] field2457 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ge.n")
    public int field2458;

    public class197(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ge.jl([IB)V")
    public void method3725(int[] arg0) {
        this.field2459 = new class198(arg0);
    }

    @ObfuscatedName("ge.jh(Lgb;I)V")
    public void method3749(class198 arg0) {
        this.field2459 = arg0;
    }

    @ObfuscatedName("ge.jo(II)V")
    public void method3727(int arg0) {
        this.field2420[++this.field2419 - 1] = (byte) (arg0 + this.field2459.method3769());
    }

    @ObfuscatedName("ge.jx(I)I")
    public int method3728() {
        return this.field2420[++this.field2419 - 1] - this.field2459.method3769() & 0xFF;
    }

    @ObfuscatedName("ge.jp(I)Z")
    public boolean method3729() {
        int var1 = this.field2420[this.field2419] - this.field2459.method3760() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("ge.jr(I)I")
    public int method3748() {
        int var1 = this.field2420[++this.field2419 - 1] - this.field2459.method3769() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2420[++this.field2419 - 1] - this.field2459.method3769() & 0xFF);
    }

    @ObfuscatedName("ge.jt([BIII)V")
    public void method3731(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field2420[++this.field2419 - 1] - this.field2459.method3769());
        }
    }

    @ObfuscatedName("ge.jz(I)V")
    public void method3744() {
        this.field2458 = this.field2419 * 8;
    }

    @ObfuscatedName("ge.jq(II)I")
    public int method3733(int arg0) {
        int var2 = this.field2458 >> 3;
        int var3 = 8 - (this.field2458 & 0x7);
        int var4 = 0;
        this.field2458 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2420[var2++] & field2457[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2420[var2] & field2457[var3]) + var4;
        } else {
            var5 = (this.field2420[var2] >> var3 - arg0 & field2457[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ge.jf(I)V")
    public void method3752() {
        this.field2419 = (this.field2458 + 7) / 8;
    }

    @ObfuscatedName("ge.je(II)I")
    public int method3735(int arg0) {
        return arg0 * 8 - this.field2458;
    }
}
