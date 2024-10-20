package deob;

@ObfuscatedName("kj")
public class class309 extends class310 {

    @ObfuscatedName("kj.x")
    public class338 field3707;

    @ObfuscatedName("kj.m")
    public static final int[] field3708 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("kj.k")
    public int field3706;

    public class309(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("kj.x([II)V")
    public void method5115(int[] arg0) {
        this.field3707 = new class338(arg0);
    }

    @ObfuscatedName("kj.m(Llp;I)V")
    public void method5080(class338 arg0) {
        this.field3707 = arg0;
    }

    @ObfuscatedName("kj.k(II)V")
    public void method5081(int arg0) {
        this.field3710[++this.field3711 - 1] = (byte) (arg0 + this.field3707.method5869());
    }

    @ObfuscatedName("kj.d(I)I")
    public int method5101() {
        return this.field3710[++this.field3711 - 1] - this.field3707.method5869() & 0xFF;
    }

    @ObfuscatedName("kj.w(B)Z")
    public boolean method5087() {
        int var1 = this.field3710[this.field3711] - this.field3707.method5871() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("kj.v(I)I")
    public int method5084() {
        int var1 = this.field3710[++this.field3711 - 1] - this.field3707.method5869() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field3710[++this.field3711 - 1] - this.field3707.method5869() & 0xFF);
    }

    @ObfuscatedName("kj.q([BIII)V")
    public void method5079(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field3710[++this.field3711 - 1] - this.field3707.method5869());
        }
    }

    @ObfuscatedName("kj.z(B)V")
    public void method5086() {
        this.field3706 = this.field3711 * 8;
    }

    @ObfuscatedName("kj.t(IB)I")
    public int method5085(int arg0) {
        int var2 = this.field3706 >> 3;
        int var3 = 8 - (this.field3706 & 0x7);
        int var4 = 0;
        this.field3706 += arg0;
        while (arg0 > var3) {
            var4 += (this.field3710[var2++] & field3708[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field3710[var2] & field3708[var3]) + var4;
        } else {
            var5 = (this.field3710[var2] >> var3 - arg0 & field3708[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("kj.e(I)V")
    public void method5088() {
        this.field3711 = (this.field3706 + 7) / 8;
    }

    @ObfuscatedName("kj.s(IB)I")
    public int method5078(int arg0) {
        return arg0 * 8 - this.field3706;
    }
}
