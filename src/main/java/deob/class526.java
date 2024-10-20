package deob;

@ObfuscatedName("uo")
public class class526 extends class527 {

    @ObfuscatedName("uo.at")
    public class544 field5134;

    @ObfuscatedName("uo.ah")
    public static final int[] field5135 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("uo.ar")
    public int field5136;

    public class526(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("uo.at([II)V")
    public void method8352(int[] arg0) {
        this.field5134 = new class544(arg0);
    }

    @ObfuscatedName("uo.ah(Luy;I)V")
    public void method8353(class544 arg0) {
        this.field5134 = arg0;
    }

    @ObfuscatedName("uo.ar(II)V")
    public void method8364(int arg0) {
        this.field5140[++this.field5137 - 1] = (byte) (arg0 + this.field5134.method9035());
    }

    @ObfuscatedName("uo.ao(I)I")
    public int method8355() {
        return this.field5140[++this.field5137 - 1] - this.field5134.method9035() & 0xFF;
    }

    @ObfuscatedName("uo.ab(B)Z")
    public boolean method8356() {
        int var1 = this.field5140[this.field5137] - this.field5134.method9036() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("uo.au(B)I")
    public int method8357() {
        int var1 = this.field5140[++this.field5137 - 1] - this.field5134.method9035() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field5140[++this.field5137 - 1] - this.field5134.method9035() & 0xFF);
    }

    @ObfuscatedName("uo.aa([BIII)V")
    public void method8358(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field5140[++this.field5137 - 1] - this.field5134.method9035());
        }
    }

    @ObfuscatedName("uo.ac(B)V")
    public void method8359() {
        this.field5136 = this.field5137 * 8;
    }

    @ObfuscatedName("uo.al(II)I")
    public int method8360(int arg0) {
        int var2 = this.field5136 >> 3;
        int var3 = 8 - (this.field5136 & 0x7);
        int var4 = 0;
        this.field5136 += arg0;
        while (arg0 > var3) {
            var4 += (this.field5140[var2++] & field5135[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field5140[var2] & field5135[var3]) + var4;
        } else {
            var5 = (this.field5140[var2] >> var3 - arg0 & field5135[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("uo.az(S)V")
    public void method8351() {
        this.field5137 = (this.field5136 + 7) / 8;
    }

    @ObfuscatedName("uo.ap(II)I")
    public int method8385(int arg0) {
        return arg0 * 8 - this.field5136;
    }
}
