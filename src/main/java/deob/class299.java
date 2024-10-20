package deob;

@ObfuscatedName("kx")
public class class299 extends class300 {

    @ObfuscatedName("kx.s")
    public class328 field3699;

    @ObfuscatedName("kx.j")
    public static final int[] field3698 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("kx.i")
    public int field3697;

    public class299(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("kx.s([II)V")
    public void method4993(int[] arg0) {
        this.field3699 = new class328(arg0);
    }

    @ObfuscatedName("kx.j(Lle;B)V")
    public void method5021(class328 arg0) {
        this.field3699 = arg0;
    }

    @ObfuscatedName("kx.i(IB)V")
    public void method4999(int arg0) {
        this.field3701[++this.field3704 - 1] = (byte) (arg0 + this.field3699.method5725());
    }

    @ObfuscatedName("kx.k(B)I")
    public int method5024() {
        return this.field3701[++this.field3704 - 1] - this.field3699.method5725() & 0xFF;
    }

    @ObfuscatedName("kx.u(S)Z")
    public boolean method4997() {
        int var1 = this.field3701[this.field3704] - this.field3699.method5727() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("kx.n(I)I")
    public int method4998() {
        int var1 = this.field3701[++this.field3704 - 1] - this.field3699.method5725() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field3701[++this.field3704 - 1] - this.field3699.method5725() & 0xFF);
    }

    @ObfuscatedName("kx.t([BIII)V")
    public void method5028(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field3701[++this.field3704 - 1] - this.field3699.method5725());
        }
    }

    @ObfuscatedName("kx.q(I)V")
    public void method5000() {
        this.field3697 = this.field3704 * 8;
    }

    @ObfuscatedName("kx.x(II)I")
    public int method5001(int arg0) {
        int var2 = this.field3697 >> 3;
        int var3 = 8 - (this.field3697 & 0x7);
        int var4 = 0;
        this.field3697 += arg0;
        while (arg0 > var3) {
            var4 += (this.field3701[var2++] & field3698[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field3701[var2] & field3698[var3]) + var4;
        } else {
            var5 = (this.field3701[var2] >> var3 - arg0 & field3698[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("kx.d(I)V")
    public void method5002() {
        this.field3704 = (this.field3697 + 7) / 8;
    }

    @ObfuscatedName("kx.f(IS)I")
    public int method5003(int arg0) {
        return arg0 * 8 - this.field3697;
    }
}
