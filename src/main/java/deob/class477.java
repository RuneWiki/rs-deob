package deob;

@ObfuscatedName("sq")
public class class477 extends class478 {

    @ObfuscatedName("sq.aj")
    public class495 field4899;

    @ObfuscatedName("sq.al")
    public static final int[] field4901 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("sq.ac")
    public int field4900;

    public class477(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("sq.aj([II)V")
    public void method7881(int[] arg0) {
        this.field4899 = new class495(arg0);
    }

    @ObfuscatedName("sq.al(Ltk;I)V")
    public void method7846(class495 arg0) {
        this.field4899 = arg0;
    }

    @ObfuscatedName("sq.ac(II)V")
    public void method7868(int arg0) {
        this.field4906[++this.field4904 - 1] = (byte) (arg0 + this.field4899.method8462());
    }

    @ObfuscatedName("sq.ab(B)I")
    public int method7869() {
        return this.field4906[++this.field4904 - 1] - this.field4899.method8462() & 0xFF;
    }

    @ObfuscatedName("sq.an(I)Z")
    public boolean method7849() {
        int var1 = this.field4906[this.field4904] - this.field4899.method8457() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("sq.ao(I)I")
    public int method7850() {
        int var1 = this.field4906[++this.field4904 - 1] - this.field4899.method8462() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4906[++this.field4904 - 1] - this.field4899.method8462() & 0xFF);
    }

    @ObfuscatedName("sq.av([BIIB)V")
    public void method7851(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4906[++this.field4904 - 1] - this.field4899.method8462());
        }
    }

    @ObfuscatedName("sq.aq(I)V")
    public void method7847() {
        this.field4900 = this.field4904 * 8;
    }

    @ObfuscatedName("sq.ap(II)I")
    public int method7853(int arg0) {
        int var2 = this.field4900 >> 3;
        int var3 = 8 - (this.field4900 & 0x7);
        int var4 = 0;
        this.field4900 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4906[var2++] & field4901[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4906[var2] & field4901[var3]) + var4;
        } else {
            var5 = (this.field4906[var2] >> var3 - arg0 & field4901[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("sq.ar(I)V")
    public void method7866() {
        this.field4904 = (this.field4900 + 7) / 8;
    }

    @ObfuscatedName("sq.ak(IB)I")
    public int method7855(int arg0) {
        return arg0 * 8 - this.field4900;
    }
}
