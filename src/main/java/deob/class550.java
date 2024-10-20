package deob;

@ObfuscatedName("va")
public class class550 extends class551 {

    @ObfuscatedName("va.ac")
    public class568 field5410;

    @ObfuscatedName("va.ae")
    public static final int[] field5411 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("va.ag")
    public int field5412;

    public class550(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("va.ac([II)V")
    public void method8915(int[] arg0) {
        this.field5410 = new class568(arg0);
    }

    @ObfuscatedName("va.ae(Lvd;I)V")
    public void method8916(class568 arg0) {
        this.field5410 = arg0;
    }

    @ObfuscatedName("va.ag(IB)V")
    public void method8917(int arg0) {
        this.field5413[++this.field5415 - 1] = (byte) (arg0 + this.field5410.method9544());
    }

    @ObfuscatedName("va.am(I)I")
    public int method8918() {
        return this.field5413[++this.field5415 - 1] - this.field5410.method9544() & 0xFF;
    }

    @ObfuscatedName("va.ax(I)Z")
    public boolean method8942() {
        int var1 = this.field5413[this.field5415] - this.field5410.method9543() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("va.aq(I)I")
    public int method8914() {
        int var1 = this.field5413[++this.field5415 - 1] - this.field5410.method9544() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field5413[++this.field5415 - 1] - this.field5410.method9544() & 0xFF);
    }

    @ObfuscatedName("va.af([BIII)V")
    public void method8921(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field5413[++this.field5415 - 1] - this.field5410.method9544());
        }
    }

    @ObfuscatedName("va.at(I)V")
    public void method8922() {
        this.field5412 = this.field5415 * 8;
    }

    @ObfuscatedName("va.au(IB)I")
    public int method8923(int arg0) {
        int var2 = this.field5412 >> 3;
        int var3 = 8 - (this.field5412 & 0x7);
        int var4 = 0;
        this.field5412 += arg0;
        while (arg0 > var3) {
            var4 += (this.field5413[var2++] & field5411[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field5413[var2] & field5411[var3]) + var4;
        } else {
            var5 = (this.field5413[var2] >> var3 - arg0 & field5411[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("va.ar(I)V")
    public void method8924() {
        this.field5415 = (this.field5412 + 7) / 8;
    }

    @ObfuscatedName("va.al(II)I")
    public int method8940(int arg0) {
        return arg0 * 8 - this.field5412;
    }

    @ObfuscatedName("va.ad(II)I")
    public int method8926(int arg0) {
        return arg0 - this.field5415;
    }
}
