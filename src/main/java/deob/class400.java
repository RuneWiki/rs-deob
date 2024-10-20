package deob;

@ObfuscatedName("oy")
public class class400 extends class401 {

    @ObfuscatedName("oy.l")
    public class417 field4285;

    @ObfuscatedName("oy.q")
    public static final int[] field4286 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("oy.f")
    public int field4287;

    public class400(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("oy.l([II)V")
    public void method6218(int[] arg0) {
        this.field4285 = new class417(arg0);
    }

    @ObfuscatedName("oy.q(Lpv;S)V")
    public void method6219(class417 arg0) {
        this.field4285 = arg0;
    }

    @ObfuscatedName("oy.f(IB)V")
    public void method6236(int arg0) {
        this.field4294[++this.field4292 - 1] = (byte) (arg0 + this.field4285.method6789());
    }

    @ObfuscatedName("oy.j(I)I")
    public int method6223() {
        return this.field4294[++this.field4292 - 1] - this.field4285.method6789() & 0xFF;
    }

    @ObfuscatedName("oy.m(S)Z")
    public boolean method6224() {
        int var1 = this.field4294[this.field4292] - this.field4285.method6797() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("oy.k(B)I")
    public int method6217() {
        int var1 = this.field4294[++this.field4292 - 1] - this.field4285.method6789() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4294[++this.field4292 - 1] - this.field4285.method6789() & 0xFF);
    }

    @ObfuscatedName("oy.t([BIII)V")
    public void method6229(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4294[++this.field4292 - 1] - this.field4285.method6789());
        }
    }

    @ObfuscatedName("oy.a(I)V")
    public void method6225() {
        this.field4287 = this.field4292 * 8;
    }

    @ObfuscatedName("oy.e(II)I")
    public int method6226(int arg0) {
        int var2 = this.field4287 >> 3;
        int var3 = 8 - (this.field4287 & 0x7);
        int var4 = 0;
        this.field4287 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4294[var2++] & field4286[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4294[var2] & field4286[var3]) + var4;
        } else {
            var5 = (this.field4294[var2] >> var3 - arg0 & field4286[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("oy.i(I)V")
    public void method6239() {
        this.field4292 = (this.field4287 + 7) / 8;
    }

    @ObfuscatedName("oy.y(II)I")
    public int method6227(int arg0) {
        return arg0 * 8 - this.field4287;
    }
}
