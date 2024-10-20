package deob;

@ObfuscatedName("kt")
public class class299 extends class300 {

    @ObfuscatedName("kt.c")
    public class328 field3692;

    @ObfuscatedName("kt.x")
    public static final int[] field3691 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("kt.t")
    public int field3690;

    public class299(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("kt.c([II)V")
    public void method5051(int[] arg0) {
        this.field3692 = new class328(arg0);
    }

    @ObfuscatedName("kt.x(Lld;I)V")
    public void method5052(class328 arg0) {
        this.field3692 = arg0;
    }

    @ObfuscatedName("kt.t(IB)V")
    public void method5053(int arg0) {
        this.field3694[++this.field3696 - 1] = (byte) (arg0 + this.field3692.method5783());
    }

    @ObfuscatedName("kt.g(B)I")
    public int method5054() {
        return this.field3694[++this.field3696 - 1] - this.field3692.method5783() & 0xFF;
    }

    @ObfuscatedName("kt.l(I)Z")
    public boolean method5055() {
        int var1 = this.field3694[this.field3696] - this.field3692.method5793() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("kt.u(B)I")
    public int method5056() {
        int var1 = this.field3694[++this.field3696 - 1] - this.field3692.method5783() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field3694[++this.field3696 - 1] - this.field3692.method5783() & 0xFF);
    }

    @ObfuscatedName("kt.j([BIII)V")
    public void method5057(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field3694[++this.field3696 - 1] - this.field3692.method5783());
        }
    }

    @ObfuscatedName("kt.v(I)V")
    public void method5060() {
        this.field3690 = this.field3696 * 8;
    }

    @ObfuscatedName("kt.d(IS)I")
    public int method5059(int arg0) {
        int var2 = this.field3690 >> 3;
        int var3 = 8 - (this.field3690 & 0x7);
        int var4 = 0;
        this.field3690 += arg0;
        while (arg0 > var3) {
            var4 += (this.field3694[var2++] & field3691[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field3694[var2] & field3691[var3]) + var4;
        } else {
            var5 = (this.field3694[var2] >> var3 - arg0 & field3691[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("kt.z(I)V")
    public void method5081() {
        this.field3696 = (this.field3690 + 7) / 8;
    }

    @ObfuscatedName("kt.s(II)I")
    public int method5061(int arg0) {
        return arg0 * 8 - this.field3690;
    }
}
