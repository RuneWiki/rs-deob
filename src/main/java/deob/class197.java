package deob;

@ObfuscatedName("gh")
public final class class197 extends class190 {

    @ObfuscatedName("gh.j")
    public class198 field2451;

    @ObfuscatedName("gh.d")
    public static final int[] field2450 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gh.t")
    public int field2452;

    public class197(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gh.hw([II)V")
    public void method3764(int[] arg0) {
        this.field2451 = new class198(arg0);
    }

    @ObfuscatedName("gh.hn(Lgb;I)V")
    public void method3767(class198 arg0) {
        this.field2451 = arg0;
    }

    @ObfuscatedName("gh.hz(II)V")
    public void method3739(int arg0) {
        this.field2424[++this.field2423 - 1] = (byte) (arg0 + this.field2451.method3776());
    }

    @ObfuscatedName("gh.he(I)I")
    public int method3750() {
        return this.field2424[++this.field2423 - 1] - this.field2451.method3776() & 0xFF;
    }

    @ObfuscatedName("gh.hm(I)Z")
    public boolean method3741() {
        int var1 = this.field2424[this.field2423] - this.field2451.method3786() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gh.ho(I)I")
    public int method3742() {
        int var1 = this.field2424[++this.field2423 - 1] - this.field2451.method3776() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2424[++this.field2423 - 1] - this.field2451.method3776() & 0xFF);
    }

    @ObfuscatedName("gh.is([BIII)V")
    public void method3743(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field2424[++this.field2423 - 1] - this.field2451.method3776());
        }
    }

    @ObfuscatedName("gh.ii(I)V")
    public void method3744() {
        this.field2452 = this.field2423 * 8;
    }

    @ObfuscatedName("gh.id(IS)I")
    public int method3745(int arg0) {
        int var2 = this.field2452 >> 3;
        int var3 = 8 - (this.field2452 & 0x7);
        int var4 = 0;
        this.field2452 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2424[var2++] & field2450[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2424[var2] & field2450[var3]) + var4;
        } else {
            var5 = (this.field2424[var2] >> var3 - arg0 & field2450[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gh.iq(I)V")
    public void method3746() {
        this.field2423 = (this.field2452 + 7) / 8;
    }

    @ObfuscatedName("gh.im(II)I")
    public int method3747(int arg0) {
        return arg0 * 8 - this.field2452;
    }
}
