package deob;

@ObfuscatedName("ky")
public class class310 extends class311 {

    @ObfuscatedName("ky.h")
    public class339 field3749;

    @ObfuscatedName("ky.v")
    public static final int[] field3748 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ky.x")
    public int field3747;

    public class310(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ky.h([II)V")
    public void method5088(int[] arg0) {
        this.field3749 = new class339(arg0);
    }

    @ObfuscatedName("ky.v(Lmd;B)V")
    public void method5061(class339 arg0) {
        this.field3749 = arg0;
    }

    @ObfuscatedName("ky.x(II)V")
    public void method5092(int arg0) {
        this.field3753[++this.field3752 - 1] = (byte) (arg0 + this.field3749.method5837());
    }

    @ObfuscatedName("ky.w(I)I")
    public int method5063() {
        return this.field3753[++this.field3752 - 1] - this.field3749.method5837() & 0xFF;
    }

    @ObfuscatedName("ky.t(I)Z")
    public boolean method5064() {
        int var1 = this.field3753[this.field3752] - this.field3749.method5829() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("ky.j(B)I")
    public int method5080() {
        int var1 = this.field3753[++this.field3752 - 1] - this.field3749.method5837() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field3753[++this.field3752 - 1] - this.field3749.method5837() & 0xFF);
    }

    @ObfuscatedName("ky.n([BIII)V")
    public void method5066(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field3753[++this.field3752 - 1] - this.field3749.method5837());
        }
    }

    @ObfuscatedName("ky.p(I)V")
    public void method5067() {
        this.field3747 = this.field3752 * 8;
    }

    @ObfuscatedName("ky.l(IB)I")
    public int method5068(int arg0) {
        int var2 = this.field3747 >> 3;
        int var3 = 8 - (this.field3747 & 0x7);
        int var4 = 0;
        this.field3747 += arg0;
        while (arg0 > var3) {
            var4 += (this.field3753[var2++] & field3748[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field3753[var2] & field3748[var3]) + var4;
        } else {
            var5 = (this.field3753[var2] >> var3 - arg0 & field3748[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ky.z(I)V")
    public void method5090() {
        this.field3752 = (this.field3747 + 7) / 8;
    }

    @ObfuscatedName("ky.u(II)I")
    public int method5070(int arg0) {
        return arg0 * 8 - this.field3747;
    }
}
