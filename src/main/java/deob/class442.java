package deob;

@ObfuscatedName("pq")
public class class442 extends class443 {

    @ObfuscatedName("pq.c")
    public class459 field4694;

    @ObfuscatedName("pq.v")
    public static final int[] field4693 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("pq.q")
    public int field4695;

    public class442(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("pq.c([II)V")
    public void method7017(int[] arg0) {
        this.field4694 = new class459(arg0);
    }

    @ObfuscatedName("pq.v(Lqv;B)V")
    public void method7018(class459 arg0) {
        this.field4694 = arg0;
    }

    @ObfuscatedName("pq.q(IB)V")
    public void method6986(int arg0) {
        this.field4701[++this.field4700 - 1] = (byte) (arg0 + this.field4694.method7597());
    }

    @ObfuscatedName("pq.f(I)I")
    public int method6990() {
        return this.field4701[++this.field4700 - 1] - this.field4694.method7597() & 0xFF;
    }

    @ObfuscatedName("pq.j(I)Z")
    public boolean method6988() {
        int var1 = this.field4701[this.field4700] - this.field4694.method7598() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("pq.e(I)I")
    public int method6989() {
        int var1 = this.field4701[++this.field4700 - 1] - this.field4694.method7597() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4701[++this.field4700 - 1] - this.field4694.method7597() & 0xFF);
    }

    @ObfuscatedName("pq.g([BIII)V")
    public void method7025(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4701[++this.field4700 - 1] - this.field4694.method7597());
        }
    }

    @ObfuscatedName("pq.w(B)V")
    public void method6991() {
        this.field4695 = this.field4700 * 8;
    }

    @ObfuscatedName("pq.y(II)I")
    public int method6992(int arg0) {
        int var2 = this.field4695 >> 3;
        int var3 = 8 - (this.field4695 & 0x7);
        int var4 = 0;
        this.field4695 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4701[var2++] & field4693[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4701[var2] & field4693[var3]) + var4;
        } else {
            var5 = (this.field4701[var2] >> var3 - arg0 & field4693[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("pq.i(I)V")
    public void method6993() {
        this.field4700 = (this.field4695 + 7) / 8;
    }

    @ObfuscatedName("pq.s(IB)I")
    public int method6994(int arg0) {
        return arg0 * 8 - this.field4695;
    }
}
