package deob;

@ObfuscatedName("kd")
public class class310 extends class311 {

    @ObfuscatedName("kd.n")
    public class339 field3741;

    @ObfuscatedName("kd.v")
    public static final int[] field3739 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("kd.d")
    public int field3742;

    public class310(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("kd.n([II)V")
    public void method5186(int[] arg0) {
        this.field3741 = new class339(arg0);
    }

    @ObfuscatedName("kd.v(Lmw;B)V")
    public void method5191(class339 arg0) {
        this.field3741 = arg0;
    }

    @ObfuscatedName("kd.d(IS)V")
    public void method5200(int arg0) {
        this.field3746[++this.field3747 - 1] = (byte) (arg0 + this.field3741.method5965());
    }

    @ObfuscatedName("kd.c(I)I")
    public int method5189() {
        return this.field3746[++this.field3747 - 1] - this.field3741.method5965() & 0xFF;
    }

    @ObfuscatedName("kd.y(I)Z")
    public boolean method5190() {
        int var1 = this.field3746[this.field3747] - this.field3741.method5976() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("kd.h(I)I")
    public int method5201() {
        int var1 = this.field3746[++this.field3747 - 1] - this.field3741.method5965() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field3746[++this.field3747 - 1] - this.field3741.method5965() & 0xFF);
    }

    @ObfuscatedName("kd.z([BIIS)V")
    public void method5198(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field3746[++this.field3747 - 1] - this.field3741.method5965());
        }
    }

    @ObfuscatedName("kd.e(I)V")
    public void method5193() {
        this.field3742 = this.field3747 * 8;
    }

    @ObfuscatedName("kd.q(IB)I")
    public int method5194(int arg0) {
        int var2 = this.field3742 >> 3;
        int var3 = 8 - (this.field3742 & 0x7);
        int var4 = 0;
        this.field3742 += arg0;
        while (arg0 > var3) {
            var4 += (this.field3746[var2++] & field3739[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field3746[var2] & field3739[var3]) + var4;
        } else {
            var5 = (this.field3746[var2] >> var3 - arg0 & field3739[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("kd.l(I)V")
    public void method5195() {
        this.field3747 = (this.field3742 + 7) / 8;
    }

    @ObfuscatedName("kd.s(II)I")
    public int method5218(int arg0) {
        return arg0 * 8 - this.field3742;
    }
}
