package deob;

@ObfuscatedName("gf")
public final class class192 extends class185 {

    @ObfuscatedName("gf.d")
    public class193 field2412;

    @ObfuscatedName("gf.o")
    public static final int[] field2413 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gf.s")
    public int field2414;

    public class192(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gf.ir([II)V")
    public void method3532(int[] arg0) {
        this.field2412 = new class193(arg0);
    }

    @ObfuscatedName("gf.iw(Lge;B)V")
    public void method3503(class193 arg0) {
        this.field2412 = arg0;
    }

    @ObfuscatedName("gf.ik(II)V")
    public void method3504(int arg0) {
        this.field2388[++this.field2386 - 1] = (byte) (arg0 + this.field2412.method3536());
    }

    @ObfuscatedName("gf.ip(B)I")
    public int method3505() {
        return this.field2388[++this.field2386 - 1] - this.field2412.method3536() & 0xFF;
    }

    @ObfuscatedName("gf.ix(I)Z")
    public boolean method3518() {
        int var1 = this.field2388[this.field2386] - this.field2412.method3539() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gf.iy(B)I")
    public int method3507() {
        int var1 = this.field2388[++this.field2386 - 1] - this.field2412.method3536() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2388[++this.field2386 - 1] - this.field2412.method3536() & 0xFF);
    }

    @ObfuscatedName("gf.io(I)V")
    public void method3508() {
        this.field2414 = this.field2386 * 8;
    }

    @ObfuscatedName("gf.ih(II)I")
    public int method3509(int arg0) {
        int var2 = this.field2414 >> 3;
        int var3 = 8 - (this.field2414 & 0x7);
        int var4 = 0;
        this.field2414 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2388[var2++] & field2413[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2388[var2] & field2413[var3]) + var4;
        } else {
            var5 = (this.field2388[var2] >> var3 - arg0 & field2413[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gf.ic(I)V")
    public void method3521() {
        this.field2386 = (this.field2414 + 7) / 8;
    }

    @ObfuscatedName("gf.iz(II)I")
    public int method3534(int arg0) {
        return arg0 * 8 - this.field2414;
    }
}
