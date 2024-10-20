package deob;

@ObfuscatedName("vm")
public class class557 extends class558 {

    @ObfuscatedName("vm.ap")
    public class575 field5459;

    @ObfuscatedName("vm.aw")
    public static final int[] field5460 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("vm.ak")
    public int field5461;

    public class557(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("vm.ap([II)V")
    public void method9199(int[] arg0) {
        this.field5459 = new class575(arg0);
    }

    @ObfuscatedName("vm.aw(Lwh;I)V")
    public void method9215(class575 arg0) {
        this.field5459 = arg0;
    }

    @ObfuscatedName("vm.ak(II)V")
    public void method9201(int arg0) {
        this.field5463[++this.field5462 - 1] = (byte) (arg0 + this.field5459.method9889());
    }

    @ObfuscatedName("vm.aj(I)I")
    public int method9222() {
        return this.field5463[++this.field5462 - 1] - this.field5459.method9889() & 0xFF;
    }

    @ObfuscatedName("vm.ai(I)Z")
    public boolean method9203() {
        int var1 = this.field5463[this.field5462] - this.field5459.method9902() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("vm.ay(B)I")
    public int method9221() {
        int var1 = this.field5463[++this.field5462 - 1] - this.field5459.method9889() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field5463[++this.field5462 - 1] - this.field5459.method9889() & 0xFF);
    }

    @ObfuscatedName("vm.as([BIIB)V")
    public void method9205(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field5463[++this.field5462 - 1] - this.field5459.method9889());
        }
    }

    @ObfuscatedName("vm.ae(I)V")
    public void method9206() {
        this.field5461 = this.field5462 * 8;
    }

    @ObfuscatedName("vm.am(II)I")
    public int method9207(int arg0) {
        int var2 = this.field5461 >> 3;
        int var3 = 8 - (this.field5461 & 0x7);
        int var4 = 0;
        this.field5461 += arg0;
        while (arg0 > var3) {
            var4 += (this.field5463[var2++] & field5460[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field5463[var2] & field5460[var3]) + var4;
        } else {
            var5 = (this.field5463[var2] >> var3 - arg0 & field5460[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("vm.at(I)V")
    public void method9208() {
        this.field5462 = (this.field5461 + 7) / 8;
    }

    @ObfuscatedName("vm.au(II)I")
    public int method9209(int arg0) {
        return arg0 * 8 - this.field5461;
    }

    @ObfuscatedName("vm.an(II)I")
    public int method9198(int arg0) {
        return arg0 - this.field5462;
    }
}
