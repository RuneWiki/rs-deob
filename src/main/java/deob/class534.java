package deob;

@ObfuscatedName("un")
public class class534 extends class535 {

    @ObfuscatedName("un.az")
    public class552 field5229;

    @ObfuscatedName("un.ah")
    public static final int[] field5228 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("un.af")
    public int field5230;

    public class534(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("un.az([IS)V")
    public void method8436(int[] arg0) {
        this.field5229 = new class552(arg0);
    }

    @ObfuscatedName("un.ah(Lvb;B)V")
    public void method8441(class552 arg0) {
        this.field5229 = arg0;
    }

    @ObfuscatedName("un.af(II)V")
    public void method8408(int arg0) {
        this.field5231[++this.field5233 - 1] = (byte) (arg0 + this.field5229.method9043());
    }

    @ObfuscatedName("un.at(I)I")
    public int method8409() {
        return this.field5231[++this.field5233 - 1] - this.field5229.method9043() & 0xFF;
    }

    @ObfuscatedName("un.an(I)Z")
    public boolean method8410() {
        int var1 = this.field5231[this.field5233] - this.field5229.method9046() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("un.ao(I)I")
    public int method8411() {
        int var1 = this.field5231[++this.field5233 - 1] - this.field5229.method9043() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field5231[++this.field5233 - 1] - this.field5229.method9043() & 0xFF);
    }

    @ObfuscatedName("un.ab([BIII)V")
    public void method8439(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field5231[++this.field5233 - 1] - this.field5229.method9043());
        }
    }

    @ObfuscatedName("un.aw(B)V")
    public void method8435() {
        this.field5230 = this.field5233 * 8;
    }

    @ObfuscatedName("un.ad(IB)I")
    public int method8421(int arg0) {
        int var2 = this.field5230 >> 3;
        int var3 = 8 - (this.field5230 & 0x7);
        int var4 = 0;
        this.field5230 += arg0;
        while (arg0 > var3) {
            var4 += (this.field5231[var2++] & field5228[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field5231[var2] & field5228[var3]) + var4;
        } else {
            var5 = (this.field5231[var2] >> var3 - arg0 & field5228[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("un.al(B)V")
    public void method8407() {
        this.field5233 = (this.field5230 + 7) / 8;
    }

    @ObfuscatedName("un.as(IB)I")
    public int method8416(int arg0) {
        return arg0 * 8 - this.field5230;
    }
}
