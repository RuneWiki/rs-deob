package deob;

@ObfuscatedName("un")
public class class533 extends class534 {

    @ObfuscatedName("un.aq")
    public class551 field5197;

    @ObfuscatedName("un.aw")
    public static final int[] field5196 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("un.al")
    public int field5195;

    public class533(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("un.aq([II)V")
    public void method8542(int[] arg0) {
        this.field5197 = new class551(arg0);
    }

    @ObfuscatedName("un.aw(Lvk;I)V")
    public void method8543(class551 arg0) {
        this.field5197 = arg0;
    }

    @ObfuscatedName("un.al(II)V")
    public void method8544(int arg0) {
        this.field5199[++this.field5200 - 1] = (byte) (arg0 + this.field5197.method9145());
    }

    @ObfuscatedName("un.ai(I)I")
    public int method8545() {
        return this.field5199[++this.field5200 - 1] - this.field5197.method9145() & 0xFF;
    }

    @ObfuscatedName("un.ar(B)Z")
    public boolean method8549() {
        int var1 = this.field5199[this.field5200] - this.field5197.method9146() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("un.as(I)I")
    public int method8547() {
        int var1 = this.field5199[++this.field5200 - 1] - this.field5197.method9145() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field5199[++this.field5200 - 1] - this.field5197.method9145() & 0xFF);
    }

    @ObfuscatedName("un.aa([BIII)V")
    public void method8558(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field5199[++this.field5200 - 1] - this.field5197.method9145());
        }
    }

    @ObfuscatedName("un.az(I)V")
    public void method8541() {
        this.field5195 = this.field5200 * 8;
    }

    @ObfuscatedName("un.ao(II)I")
    public int method8567(int arg0) {
        int var2 = this.field5195 >> 3;
        int var3 = 8 - (this.field5195 & 0x7);
        int var4 = 0;
        this.field5195 += arg0;
        while (arg0 > var3) {
            var4 += (this.field5199[var2++] & field5196[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field5199[var2] & field5196[var3]) + var4;
        } else {
            var5 = (this.field5199[var2] >> var3 - arg0 & field5196[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("un.au(B)V")
    public void method8551() {
        this.field5200 = (this.field5195 + 7) / 8;
    }

    @ObfuscatedName("un.ak(IB)I")
    public int method8550(int arg0) {
        return arg0 * 8 - this.field5195;
    }
}
