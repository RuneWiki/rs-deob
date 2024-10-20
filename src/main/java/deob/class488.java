package deob;

@ObfuscatedName("sq")
public class class488 extends class489 {

    @ObfuscatedName("sq.af")
    public class506 field4985;

    @ObfuscatedName("sq.an")
    public static final int[] field4986 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("sq.aw")
    public int field4988;

    public class488(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("sq.af([IB)V")
    public void method8196(int[] arg0) {
        this.field4985 = new class506(arg0);
    }

    @ObfuscatedName("sq.an(Ltp;I)V")
    public void method8190(class506 arg0) {
        this.field4985 = arg0;
    }

    @ObfuscatedName("sq.aw(IB)V")
    public void method8210(int arg0) {
        this.field4991[++this.field4989 - 1] = (byte) (arg0 + this.field4985.method8814());
    }

    @ObfuscatedName("sq.ac(I)I")
    public int method8192() {
        return this.field4991[++this.field4989 - 1] - this.field4985.method8814() & 0xFF;
    }

    @ObfuscatedName("sq.au(B)Z")
    public boolean method8213() {
        int var1 = this.field4991[this.field4989] - this.field4985.method8807() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("sq.ab(I)I")
    public int method8194() {
        int var1 = this.field4991[++this.field4989 - 1] - this.field4985.method8814() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4991[++this.field4989 - 1] - this.field4985.method8814() & 0xFF);
    }

    @ObfuscatedName("sq.aq([BIII)V")
    public void method8195(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4991[++this.field4989 - 1] - this.field4985.method8814());
        }
    }

    @ObfuscatedName("sq.al(B)V")
    public void method8226() {
        this.field4988 = this.field4989 * 8;
    }

    @ObfuscatedName("sq.at(II)I")
    public int method8197(int arg0) {
        int var2 = this.field4988 >> 3;
        int var3 = 8 - (this.field4988 & 0x7);
        int var4 = 0;
        this.field4988 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4991[var2++] & field4986[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4991[var2] & field4986[var3]) + var4;
        } else {
            var5 = (this.field4991[var2] >> var3 - arg0 & field4986[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("sq.aa(B)V")
    public void method8198() {
        this.field4989 = (this.field4988 + 7) / 8;
    }

    @ObfuscatedName("sq.ay(II)I")
    public int method8225(int arg0) {
        return arg0 * 8 - this.field4988;
    }
}
