package deob;

@ObfuscatedName("to")
public class class514 extends class515 {

    @ObfuscatedName("to.au")
    public class532 field5105;

    @ObfuscatedName("to.ae")
    public static final int[] field5106 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("to.ao")
    public int field5107;

    public class514(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("to.au([IB)V")
    public void method8239(int[] arg0) {
        this.field5105 = new class532(arg0);
    }

    @ObfuscatedName("to.ae(Lux;I)V")
    public void method8240(class532 arg0) {
        this.field5105 = arg0;
    }

    @ObfuscatedName("to.ao(II)V")
    public void method8242(int arg0) {
        this.field5108[++this.field5111 - 1] = (byte) (arg0 + this.field5105.method8878());
    }

    @ObfuscatedName("to.at(I)I")
    public int method8241() {
        return this.field5108[++this.field5111 - 1] - this.field5105.method8878() & 0xFF;
    }

    @ObfuscatedName("to.ac(B)Z")
    public boolean method8243() {
        int var1 = this.field5108[this.field5111] - this.field5105.method8879() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("to.ai(I)I")
    public int method8246() {
        int var1 = this.field5108[++this.field5111 - 1] - this.field5105.method8878() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field5108[++this.field5111 - 1] - this.field5105.method8878() & 0xFF);
    }

    @ObfuscatedName("to.az([BIII)V")
    public void method8244(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field5108[++this.field5111 - 1] - this.field5105.method8878());
        }
    }

    @ObfuscatedName("to.ap(I)V")
    public void method8250() {
        this.field5107 = this.field5111 * 8;
    }

    @ObfuscatedName("to.aa(IB)I")
    public int method8247(int arg0) {
        int var2 = this.field5107 >> 3;
        int var3 = 8 - (this.field5107 & 0x7);
        int var4 = 0;
        this.field5107 += arg0;
        while (arg0 > var3) {
            var4 += (this.field5108[var2++] & field5106[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field5108[var2] & field5106[var3]) + var4;
        } else {
            var5 = (this.field5108[var2] >> var3 - arg0 & field5106[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("to.af(I)V")
    public void method8264() {
        this.field5111 = (this.field5107 + 7) / 8;
    }

    @ObfuscatedName("to.ad(II)I")
    public int method8249(int arg0) {
        return arg0 * 8 - this.field5107;
    }
}
