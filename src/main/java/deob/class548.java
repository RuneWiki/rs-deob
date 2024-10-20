package deob;

@ObfuscatedName("vs")
public class class548 extends class549 {

    @ObfuscatedName("vs.ab")
    public class566 field5377;

    @ObfuscatedName("vs.ay")
    public static final int[] field5375 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("vs.an")
    public int field5374;

    public class548(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("vs.ab([IS)V")
    public void method8753(int[] arg0) {
        this.field5377 = new class566(arg0);
    }

    @ObfuscatedName("vs.ay(Lvu;B)V")
    public void method8740(class566 arg0) {
        this.field5377 = arg0;
    }

    @ObfuscatedName("vs.an(IB)V")
    public void method8741(int arg0) {
        this.field5381[++this.field5378 - 1] = (byte) (arg0 + this.field5377.method9407());
    }

    @ObfuscatedName("vs.au(I)I")
    public int method8749() {
        return this.field5381[++this.field5378 - 1] - this.field5377.method9407() & 0xFF;
    }

    @ObfuscatedName("vs.ax(I)Z")
    public boolean method8743() {
        int var1 = this.field5381[this.field5378] - this.field5377.method9399() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("vs.ao(B)I")
    public int method8739() {
        int var1 = this.field5381[++this.field5378 - 1] - this.field5377.method9407() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field5381[++this.field5378 - 1] - this.field5377.method9407() & 0xFF);
    }

    @ObfuscatedName("vs.am([BIII)V")
    public void method8772(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field5381[++this.field5378 - 1] - this.field5377.method9407());
        }
    }

    @ObfuscatedName("vs.ac(I)V")
    public void method8748() {
        this.field5374 = this.field5378 * 8;
    }

    @ObfuscatedName("vs.ae(II)I")
    public int method8746(int arg0) {
        int var2 = this.field5374 >> 3;
        int var3 = 8 - (this.field5374 & 0x7);
        int var4 = 0;
        this.field5374 += arg0;
        while (arg0 > var3) {
            var4 += (this.field5381[var2++] & field5375[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field5381[var2] & field5375[var3]) + var4;
        } else {
            var5 = (this.field5381[var2] >> var3 - arg0 & field5375[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("vs.ad(I)V")
    public void method8747() {
        this.field5378 = (this.field5374 + 7) / 8;
    }

    @ObfuscatedName("vs.aq(II)I")
    public int method8763(int arg0) {
        return arg0 * 8 - this.field5374;
    }

    @ObfuscatedName("vs.al(II)I")
    public int method8768(int arg0) {
        return arg0 - this.field5378;
    }
}
