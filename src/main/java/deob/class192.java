package deob;

@ObfuscatedName("gt")
public final class class192 extends class185 {

    @ObfuscatedName("gt.e")
    public class193 field2415;

    @ObfuscatedName("gt.s")
    public static final int[] field2413 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gt.v")
    public int field2414;

    public class192(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gt.ig([IS)V")
    public void method3535(int[] arg0) {
        this.field2415 = new class193(arg0);
    }

    @ObfuscatedName("gt.ia(Lgl;S)V")
    public void method3540(class193 arg0) {
        this.field2415 = arg0;
    }

    @ObfuscatedName("gt.ie(II)V")
    public void method3537(int arg0) {
        this.field2373[++this.field2374 - 1] = (byte) (arg0 + this.field2415.method3573());
    }

    @ObfuscatedName("gt.ir(I)I")
    public int method3538() {
        return this.field2373[++this.field2374 - 1] - this.field2415.method3573() & 0xFF;
    }

    @ObfuscatedName("gt.ip(I)Z")
    public boolean method3536() {
        int var1 = this.field2373[this.field2374] - this.field2415.method3584() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gt.ik(B)I")
    public int method3546() {
        int var1 = this.field2373[++this.field2374 - 1] - this.field2415.method3573() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2373[++this.field2374 - 1] - this.field2415.method3573() & 0xFF);
    }

    @ObfuscatedName("gt.io(B)V")
    public void method3539() {
        this.field2414 = this.field2374 * 8;
    }

    @ObfuscatedName("gt.ii(IS)I")
    public int method3542(int arg0) {
        int var2 = this.field2414 >> 3;
        int var3 = 8 - (this.field2414 & 0x7);
        int var4 = 0;
        this.field2414 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2373[var2++] & field2413[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2373[var2] & field2413[var3]) + var4;
        } else {
            var5 = (this.field2373[var2] >> var3 - arg0 & field2413[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gt.jm(B)V")
    public void method3543() {
        this.field2374 = (this.field2414 + 7) / 8;
    }

    @ObfuscatedName("gt.jg(II)I")
    public int method3544(int arg0) {
        return arg0 * 8 - this.field2414;
    }
}
