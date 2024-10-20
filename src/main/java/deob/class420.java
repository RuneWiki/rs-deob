package deob;

@ObfuscatedName("pc")
public class class420 extends class421 {

    @ObfuscatedName("pc.c")
    public class437 field4508;

    @ObfuscatedName("pc.l")
    public static final int[] field4509 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("pc.s")
    public int field4507;

    public class420(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("pc.c([II)V")
    public void method6608(int[] arg0) {
        this.field4508 = new class437(arg0);
    }

    @ObfuscatedName("pc.l(Lpv;I)V")
    public void method6612(class437 arg0) {
        this.field4508 = arg0;
    }

    @ObfuscatedName("pc.s(II)V")
    public void method6610(int arg0) {
        this.field4511[++this.field4512 - 1] = (byte) (arg0 + this.field4508.method7202());
    }

    @ObfuscatedName("pc.e(I)I")
    public int method6611() {
        return this.field4511[++this.field4512 - 1] - this.field4508.method7202() & 0xFF;
    }

    @ObfuscatedName("pc.r(S)Z")
    public boolean method6618() {
        int var1 = this.field4511[this.field4512] - this.field4508.method7203() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("pc.o(I)I")
    public int method6609() {
        int var1 = this.field4511[++this.field4512 - 1] - this.field4508.method7202() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4511[++this.field4512 - 1] - this.field4508.method7202() & 0xFF);
    }

    @ObfuscatedName("pc.i([BIIB)V")
    public void method6614(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4511[++this.field4512 - 1] - this.field4508.method7202());
        }
    }

    @ObfuscatedName("pc.w(B)V")
    public void method6615() {
        this.field4507 = this.field4512 * 8;
    }

    @ObfuscatedName("pc.v(II)I")
    public int method6631(int arg0) {
        int var2 = this.field4507 >> 3;
        int var3 = 8 - (this.field4507 & 0x7);
        int var4 = 0;
        this.field4507 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4511[var2++] & field4509[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4511[var2] & field4509[var3]) + var4;
        } else {
            var5 = (this.field4511[var2] >> var3 - arg0 & field4509[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("pc.a(I)V")
    public void method6636() {
        this.field4512 = (this.field4507 + 7) / 8;
    }

    @ObfuscatedName("pc.y(IB)I")
    public int method6607(int arg0) {
        return arg0 * 8 - this.field4507;
    }
}
