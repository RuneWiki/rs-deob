package deob;

@ObfuscatedName("oq")
public class class399 extends class400 {

    @ObfuscatedName("oq.n")
    public class416 field4268;

    @ObfuscatedName("oq.c")
    public static final int[] field4267 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("oq.m")
    public int field4266;

    public class399(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("oq.n([IS)V")
    public void method6161(int[] arg0) {
        this.field4268 = new class416(arg0);
    }

    @ObfuscatedName("oq.c(Loe;I)V")
    public void method6189(class416 arg0) {
        this.field4268 = arg0;
    }

    @ObfuscatedName("oq.m(II)V")
    public void method6163(int arg0) {
        this.field4271[++this.field4272 - 1] = (byte) (arg0 + this.field4268.method6761());
    }

    @ObfuscatedName("oq.k(I)I")
    public int method6186() {
        return this.field4271[++this.field4272 - 1] - this.field4268.method6761() & 0xFF;
    }

    @ObfuscatedName("oq.o(I)Z")
    public boolean method6165() {
        int var1 = this.field4271[this.field4272] - this.field4268.method6760() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("oq.g(B)I")
    public int method6180() {
        int var1 = this.field4271[++this.field4272 - 1] - this.field4268.method6761() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4271[++this.field4272 - 1] - this.field4268.method6761() & 0xFF);
    }

    @ObfuscatedName("oq.z([BIIB)V")
    public void method6169(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4271[++this.field4272 - 1] - this.field4268.method6761());
        }
    }

    @ObfuscatedName("oq.a(I)V")
    public void method6168() {
        this.field4266 = this.field4272 * 8;
    }

    @ObfuscatedName("oq.u(II)I")
    public int method6184(int arg0) {
        int var2 = this.field4266 >> 3;
        int var3 = 8 - (this.field4266 & 0x7);
        int var4 = 0;
        this.field4266 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4271[var2++] & field4267[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4271[var2] & field4267[var3]) + var4;
        } else {
            var5 = (this.field4271[var2] >> var3 - arg0 & field4267[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("oq.e(I)V")
    public void method6170() {
        this.field4272 = (this.field4266 + 7) / 8;
    }

    @ObfuscatedName("oq.l(II)I")
    public int method6171(int arg0) {
        return arg0 * 8 - this.field4266;
    }
}
