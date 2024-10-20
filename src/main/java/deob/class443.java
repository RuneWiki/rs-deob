package deob;

@ObfuscatedName("qz")
public class class443 extends class444 {

    @ObfuscatedName("qz.s")
    public class460 field4703;

    @ObfuscatedName("qz.h")
    public static final int[] field4700 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("qz.w")
    public int field4702;

    public class443(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("qz.s([IB)V")
    public void method6869(int[] arg0) {
        this.field4703 = new class460(arg0);
    }

    @ObfuscatedName("qz.h(Lqb;B)V")
    public void method6882(class460 arg0) {
        this.field4703 = arg0;
    }

    @ObfuscatedName("qz.w(II)V")
    public void method6871(int arg0) {
        this.field4707[++this.field4708 - 1] = (byte) (arg0 + this.field4703.method7470());
    }

    @ObfuscatedName("qz.v(B)I")
    public int method6872() {
        return this.field4707[++this.field4708 - 1] - this.field4703.method7470() & 0xFF;
    }

    @ObfuscatedName("qz.c(I)Z")
    public boolean method6873() {
        int var1 = this.field4707[this.field4708] - this.field4703.method7472() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("qz.q(I)I")
    public int method6874() {
        int var1 = this.field4707[++this.field4708 - 1] - this.field4703.method7470() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4707[++this.field4708 - 1] - this.field4703.method7470() & 0xFF);
    }

    @ObfuscatedName("qz.i([BIII)V")
    public void method6875(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4707[++this.field4708 - 1] - this.field4703.method7470());
        }
    }

    @ObfuscatedName("qz.k(I)V")
    public void method6876() {
        this.field4702 = this.field4708 * 8;
    }

    @ObfuscatedName("qz.o(II)I")
    public int method6877(int arg0) {
        int var2 = this.field4702 >> 3;
        int var3 = 8 - (this.field4702 & 0x7);
        int var4 = 0;
        this.field4702 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4707[var2++] & field4700[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4707[var2] & field4700[var3]) + var4;
        } else {
            var5 = (this.field4707[var2] >> var3 - arg0 & field4700[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("qz.n(B)V")
    public void method6894() {
        this.field4708 = (this.field4702 + 7) / 8;
    }

    @ObfuscatedName("qz.d(IB)I")
    public int method6879(int arg0) {
        return arg0 * 8 - this.field4702;
    }
}
