package deob;

@ObfuscatedName("pz")
public class class437 extends class438 {

    @ObfuscatedName("pz.v")
    public class454 field4614;

    @ObfuscatedName("pz.c")
    public static final int[] field4615 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("pz.i")
    public int field4613;

    public class437(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("pz.v([II)V")
    public void method6918(int[] arg0) {
        this.field4614 = new class454(arg0);
    }

    @ObfuscatedName("pz.c(Lqv;I)V")
    public void method6916(class454 arg0) {
        this.field4614 = arg0;
    }

    @ObfuscatedName("pz.i(II)V")
    public void method6917(int arg0) {
        this.field4618[++this.field4621 - 1] = (byte) (arg0 + this.field4614.method7513());
    }

    @ObfuscatedName("pz.f(I)I")
    public int method6926() {
        return this.field4618[++this.field4621 - 1] - this.field4614.method7513() & 0xFF;
    }

    @ObfuscatedName("pz.b(I)Z")
    public boolean method6919() {
        int var1 = this.field4618[this.field4621] - this.field4614.method7506() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("pz.n(I)I")
    public int method6920() {
        int var1 = this.field4618[++this.field4621 - 1] - this.field4614.method7513() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4618[++this.field4621 - 1] - this.field4614.method7513() & 0xFF);
    }

    @ObfuscatedName("pz.s([BIIB)V")
    public void method6921(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4618[++this.field4621 - 1] - this.field4614.method7513());
        }
    }

    @ObfuscatedName("pz.l(I)V")
    public void method6922() {
        this.field4613 = this.field4621 * 8;
    }

    @ObfuscatedName("pz.q(IB)I")
    public int method6923(int arg0) {
        int var2 = this.field4613 >> 3;
        int var3 = 8 - (this.field4613 & 0x7);
        int var4 = 0;
        this.field4613 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4618[var2++] & field4615[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4618[var2] & field4615[var3]) + var4;
        } else {
            var5 = (this.field4618[var2] >> var3 - arg0 & field4615[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("pz.o(I)V")
    public void method6914() {
        this.field4621 = (this.field4613 + 7) / 8;
    }

    @ObfuscatedName("pz.r(II)I")
    public int method6925(int arg0) {
        return arg0 * 8 - this.field4613;
    }
}
