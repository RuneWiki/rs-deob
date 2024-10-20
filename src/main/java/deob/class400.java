package deob;

@ObfuscatedName("oj")
public class class400 extends class401 {

    @ObfuscatedName("oj.i")
    public class417 field4294;

    @ObfuscatedName("oj.w")
    public static final int[] field4293 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("oj.s")
    public int field4292;

    public class400(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("oj.i([II)V")
    public void method6182(int[] arg0) {
        this.field4294 = new class417(arg0);
    }

    @ObfuscatedName("oj.w(Lpw;I)V")
    public void method6183(class417 arg0) {
        this.field4294 = arg0;
    }

    @ObfuscatedName("oj.s(II)V")
    public void method6181(int arg0) {
        this.field4302[++this.field4300 - 1] = (byte) (arg0 + this.field4294.method6790());
    }

    @ObfuscatedName("oj.a(B)I")
    public int method6185() {
        return this.field4302[++this.field4300 - 1] - this.field4294.method6790() & 0xFF;
    }

    @ObfuscatedName("oj.o(S)Z")
    public boolean method6186() {
        int var1 = this.field4302[this.field4300] - this.field4294.method6791() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("oj.g(I)I")
    public int method6184() {
        int var1 = this.field4302[++this.field4300 - 1] - this.field4294.method6790() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4302[++this.field4300 - 1] - this.field4294.method6790() & 0xFF);
    }

    @ObfuscatedName("oj.e([BIII)V")
    public void method6213(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4302[++this.field4300 - 1] - this.field4294.method6790());
        }
    }

    @ObfuscatedName("oj.p(I)V")
    public void method6188() {
        this.field4292 = this.field4300 * 8;
    }

    @ObfuscatedName("oj.j(II)I")
    public int method6194(int arg0) {
        int var2 = this.field4292 >> 3;
        int var3 = 8 - (this.field4292 & 0x7);
        int var4 = 0;
        this.field4292 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4302[var2++] & field4293[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4302[var2] & field4293[var3]) + var4;
        } else {
            var5 = (this.field4302[var2] >> var3 - arg0 & field4293[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("oj.b(S)V")
    public void method6190() {
        this.field4300 = (this.field4292 + 7) / 8;
    }

    @ObfuscatedName("oj.x(IB)I")
    public int method6191(int arg0) {
        return arg0 * 8 - this.field4292;
    }
}
