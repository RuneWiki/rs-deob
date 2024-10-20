package deob;

@ObfuscatedName("uy")
public class class529 extends class530 {

    @ObfuscatedName("uy.ac")
    public class547 field5134;

    @ObfuscatedName("uy.al")
    public static final int[] field5135 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("uy.ak")
    public int field5136;

    public class529(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("uy.ac([II)V")
    public void method8306(int[] arg0) {
        this.field5134 = new class547(arg0);
    }

    @ObfuscatedName("uy.al(Lvd;I)V")
    public void method8334(class547 arg0) {
        this.field5134 = arg0;
    }

    @ObfuscatedName("uy.ak(II)V")
    public void method8330(int arg0) {
        this.field5139[++this.field5140 - 1] = (byte) (arg0 + this.field5134.method8954());
    }

    @ObfuscatedName("uy.ax(B)I")
    public int method8341() {
        return this.field5139[++this.field5140 - 1] - this.field5134.method8954() & 0xFF;
    }

    @ObfuscatedName("uy.ao(I)Z")
    public boolean method8325() {
        int var1 = this.field5139[this.field5140] - this.field5134.method8964() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("uy.ah(B)I")
    public int method8313() {
        int var1 = this.field5139[++this.field5140 - 1] - this.field5134.method8954() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field5139[++this.field5140 - 1] - this.field5134.method8954() & 0xFF);
    }

    @ObfuscatedName("uy.ar([BIII)V")
    public void method8311(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field5139[++this.field5140 - 1] - this.field5134.method8954());
        }
    }

    @ObfuscatedName("uy.ab(I)V")
    public void method8312() {
        this.field5136 = this.field5140 * 8;
    }

    @ObfuscatedName("uy.am(II)I")
    public int method8327(int arg0) {
        int var2 = this.field5136 >> 3;
        int var3 = 8 - (this.field5136 & 0x7);
        int var4 = 0;
        this.field5136 += arg0;
        while (arg0 > var3) {
            var4 += (this.field5139[var2++] & field5135[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field5139[var2] & field5135[var3]) + var4;
        } else {
            var5 = (this.field5139[var2] >> var3 - arg0 & field5135[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("uy.av(B)V")
    public void method8338() {
        this.field5140 = (this.field5136 + 7) / 8;
    }

    @ObfuscatedName("uy.ag(II)I")
    public int method8315(int arg0) {
        return arg0 * 8 - this.field5136;
    }
}
