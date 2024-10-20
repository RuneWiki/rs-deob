package deob;

@ObfuscatedName("gb")
public final class class183 extends class177 {

    @ObfuscatedName("gb.u")
    public class184 field2451;

    @ObfuscatedName("gb.r")
    public static final int[] field2450 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gb.v")
    public int field2449;

    public class183(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gb.hy([IB)V")
    public void method3121(int[] arg0) {
        this.field2451 = new class184(arg0);
    }

    @ObfuscatedName("gb.ho(II)V")
    public void method3115(int arg0) {
        this.field2419[++this.field2412 - 1] = (byte) (arg0 + this.field2451.method3142());
    }

    @ObfuscatedName("gb.hl(I)I")
    public int method3116() {
        return this.field2419[++this.field2412 - 1] - this.field2451.method3142() & 0xFF;
    }

    @ObfuscatedName("gb.hv(B)V")
    public void method3128() {
        this.field2449 = this.field2412 * 8;
    }

    @ObfuscatedName("gb.hd(IB)I")
    public int method3118(int arg0) {
        int var2 = this.field2449 >> 3;
        int var3 = 8 - (this.field2449 & 0x7);
        int var4 = 0;
        this.field2449 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2419[var2++] & field2450[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2419[var2] & field2450[var3]) + var4;
        } else {
            var5 = (this.field2419[var2] >> var3 - arg0 & field2450[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gb.hb(I)V")
    public void method3124() {
        this.field2412 = (this.field2449 + 7) / 8;
    }

    @ObfuscatedName("gb.hs(IB)I")
    public int method3120(int arg0) {
        return arg0 * 8 - this.field2449;
    }
}
