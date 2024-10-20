package deob;

@ObfuscatedName("ge")
public final class class190 extends class183 {

    @ObfuscatedName("ge.j")
    public class191 field2400;

    @ObfuscatedName("ge.a")
    public static final int[] field2398 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ge.l")
    public int field2397;

    public class190(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ge.jm([II)V")
    public void method3566(int[] arg0) {
        this.field2400 = new class191(arg0);
    }

    @ObfuscatedName("ge.ja(Lgh;B)V")
    public void method3550(class191 arg0) {
        this.field2400 = arg0;
    }

    @ObfuscatedName("ge.jj(IB)V")
    public void method3570(int arg0) {
        this.field2366[++this.field2360 - 1] = (byte) (arg0 + this.field2400.method3588());
    }

    @ObfuscatedName("ge.jf(I)I")
    public int method3552() {
        return this.field2366[++this.field2360 - 1] - this.field2400.method3588() & 0xFF;
    }

    @ObfuscatedName("ge.jh(B)Z")
    public boolean method3553() {
        int var1 = this.field2366[this.field2360] - this.field2400.method3589() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("ge.ju(I)I")
    public int method3567() {
        int var1 = this.field2366[++this.field2360 - 1] - this.field2400.method3588() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2366[++this.field2360 - 1] - this.field2400.method3588() & 0xFF);
    }

    @ObfuscatedName("ge.jr(I)V")
    public void method3582() {
        this.field2397 = this.field2360 * 8;
    }

    @ObfuscatedName("ge.jt(II)I")
    public int method3555(int arg0) {
        int var2 = this.field2397 >> 3;
        int var3 = 8 - (this.field2397 & 0x7);
        int var4 = 0;
        this.field2397 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2366[var2++] & field2398[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2366[var2] & field2398[var3]) + var4;
        } else {
            var5 = (this.field2366[var2] >> var3 - arg0 & field2398[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ge.jo(B)V")
    public void method3556() {
        this.field2360 = (this.field2397 + 7) / 8;
    }

    @ObfuscatedName("ge.jd(II)I")
    public int method3557(int arg0) {
        return arg0 * 8 - this.field2397;
    }
}
