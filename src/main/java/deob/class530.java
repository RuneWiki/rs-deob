package deob;

@ObfuscatedName("uo")
public class class530 extends class531 {

    @ObfuscatedName("uo.am")
    public class548 field5174;

    @ObfuscatedName("uo.ap")
    public static final int[] field5173 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("uo.af")
    public int field5175;

    public class530(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("uo.am([IB)V")
    public void method8522(int[] arg0) {
        this.field5174 = new class548(arg0);
    }

    @ObfuscatedName("uo.ap(Lvd;I)V")
    public void method8497(class548 arg0) {
        this.field5174 = arg0;
    }

    @ObfuscatedName("uo.af(II)V")
    public void method8498(int arg0) {
        this.field5178[++this.field5181 - 1] = (byte) (arg0 + this.field5174.method9124());
    }

    @ObfuscatedName("uo.aj(B)I")
    public int method8499() {
        return this.field5178[++this.field5181 - 1] - this.field5174.method9124() & 0xFF;
    }

    @ObfuscatedName("uo.aq(I)Z")
    public boolean method8500() {
        int var1 = this.field5178[this.field5181] - this.field5174.method9125() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("uo.ar(I)I")
    public int method8501() {
        int var1 = this.field5178[++this.field5181 - 1] - this.field5174.method9124() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field5178[++this.field5181 - 1] - this.field5174.method9124() & 0xFF);
    }

    @ObfuscatedName("uo.ag([BIII)V")
    public void method8531(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field5178[++this.field5181 - 1] - this.field5174.method9124());
        }
    }

    @ObfuscatedName("uo.ao(I)V")
    public void method8525() {
        this.field5175 = this.field5181 * 8;
    }

    @ObfuscatedName("uo.ae(IB)I")
    public int method8509(int arg0) {
        int var2 = this.field5175 >> 3;
        int var3 = 8 - (this.field5175 & 0x7);
        int var4 = 0;
        this.field5175 += arg0;
        while (arg0 > var3) {
            var4 += (this.field5178[var2++] & field5173[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field5178[var2] & field5173[var3]) + var4;
        } else {
            var5 = (this.field5178[var2] >> var3 - arg0 & field5173[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("uo.aa(B)V")
    public void method8505() {
        this.field5181 = (this.field5175 + 7) / 8;
    }

    @ObfuscatedName("uo.au(II)I")
    public int method8506(int arg0) {
        return arg0 * 8 - this.field5175;
    }
}
