package deob;

@ObfuscatedName("nk")
public class class381 extends class382 {

    @ObfuscatedName("nk.f")
    public class398 field4151;

    @ObfuscatedName("nk.o")
    public static final int[] field4150 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("nk.u")
    public int field4149;

    public class381(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("nk.f([IB)V")
    public void method5800(int[] arg0) {
        this.field4151 = new class398(arg0);
    }

    @ObfuscatedName("nk.o(Loy;B)V")
    public void method5810(class398 arg0) {
        this.field4151 = arg0;
    }

    @ObfuscatedName("nk.u(IB)V")
    public void method5802(int arg0) {
        this.field4153[++this.field4155 - 1] = (byte) (arg0 + this.field4151.method6357());
    }

    @ObfuscatedName("nk.p(B)I")
    public int method5803() {
        return this.field4153[++this.field4155 - 1] - this.field4151.method6357() & 0xFF;
    }

    @ObfuscatedName("nk.b(I)Z")
    public boolean method5805() {
        int var1 = this.field4153[this.field4155] - this.field4151.method6358() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("nk.e(B)I")
    public int method5826() {
        int var1 = this.field4153[++this.field4155 - 1] - this.field4151.method6357() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4153[++this.field4155 - 1] - this.field4151.method6357() & 0xFF);
    }

    @ObfuscatedName("nk.k([BIII)V")
    public void method5806(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4153[++this.field4155 - 1] - this.field4151.method6357());
        }
    }

    @ObfuscatedName("nk.g(I)V")
    public void method5807() {
        this.field4149 = this.field4155 * 8;
    }

    @ObfuscatedName("nk.h(II)I")
    public int method5801(int arg0) {
        int var2 = this.field4149 >> 3;
        int var3 = 8 - (this.field4149 & 0x7);
        int var4 = 0;
        this.field4149 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4153[var2++] & field4150[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4153[var2] & field4150[var3]) + var4;
        } else {
            var5 = (this.field4153[var2] >> var3 - arg0 & field4150[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("nk.n(I)V")
    public void method5804() {
        this.field4155 = (this.field4149 + 7) / 8;
    }

    @ObfuscatedName("nk.l(II)I")
    public int method5830(int arg0) {
        return arg0 * 8 - this.field4149;
    }
}
