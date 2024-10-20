package deob;

@ObfuscatedName("uk")
public class class545 extends class546 {

    @ObfuscatedName("uk.ak")
    public class563 field5339;

    @ObfuscatedName("uk.al")
    public static final int[] field5337 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("uk.aj")
    public int field5338;

    public class545(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("uk.ak([II)V")
    public void method8739(int[] arg0) {
        this.field5339 = new class563(arg0);
    }

    @ObfuscatedName("uk.al(Lvr;I)V")
    public void method8750(class563 arg0) {
        this.field5339 = arg0;
    }

    @ObfuscatedName("uk.aj(II)V")
    public void method8733(int arg0) {
        this.field5346[++this.field5344 - 1] = (byte) (arg0 + this.field5339.method9360());
    }

    @ObfuscatedName("uk.az(I)I")
    public int method8734() {
        return this.field5346[++this.field5344 - 1] - this.field5339.method9360() & 0xFF;
    }

    @ObfuscatedName("uk.af(I)Z")
    public boolean method8740() {
        int var1 = this.field5346[this.field5344] - this.field5339.method9357() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("uk.aa(I)I")
    public int method8764() {
        int var1 = this.field5346[++this.field5344 - 1] - this.field5339.method9360() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field5346[++this.field5344 - 1] - this.field5339.method9360() & 0xFF);
    }

    @ObfuscatedName("uk.at([BIIB)V")
    public void method8732(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field5346[++this.field5344 - 1] - this.field5339.method9360());
        }
    }

    @ObfuscatedName("uk.ab(B)V")
    public void method8738() {
        this.field5338 = this.field5344 * 8;
    }

    @ObfuscatedName("uk.ac(II)I")
    public int method8743(int arg0) {
        int var2 = this.field5338 >> 3;
        int var3 = 8 - (this.field5338 & 0x7);
        int var4 = 0;
        this.field5338 += arg0;
        while (arg0 > var3) {
            var4 += (this.field5346[var2++] & field5337[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field5346[var2] & field5337[var3]) + var4;
        } else {
            var5 = (this.field5346[var2] >> var3 - arg0 & field5337[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("uk.ao(S)V")
    public void method8772() {
        this.field5344 = (this.field5338 + 7) / 8;
    }

    @ObfuscatedName("uk.ah(II)I")
    public int method8741(int arg0) {
        return arg0 * 8 - this.field5338;
    }

    @ObfuscatedName("uk.av(IB)I")
    public int method8742(int arg0) {
        return arg0 - this.field5344;
    }
}
