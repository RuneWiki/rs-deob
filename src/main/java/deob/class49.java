package deob;

@ObfuscatedName("dq")
public final class class49 extends class50 {

    @ObfuscatedName("dq.b")
    public class31 field535;

    @ObfuscatedName("dq.k")
    public int field532;

    @ObfuscatedName("dq.h")
    public static final int[] field530 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    public class49(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dq.k(I)I")
    public int method644() {
        return this.field541[++this.field540 - 1] - this.field535.method477() & 0xFF;
    }

    @ObfuscatedName("dq.b([IS)V")
    public void method646(int[] arg0) {
        this.field535 = new class31(arg0);
    }

    @ObfuscatedName("dq.d(I)V")
    public void method649() {
        this.field540 = (this.field532 + 7) / 8;
    }

    @ObfuscatedName("dq.l(II)I")
    public int method650(int arg0) {
        return arg0 * 8 - this.field532;
    }

    @ObfuscatedName("dq.h(IS)V")
    public void method653(int arg0) {
        this.field541[++this.field540 - 1] = (byte) (arg0 + this.field535.method477());
    }

    @ObfuscatedName("dq.w(B)V")
    public void method655() {
        this.field532 = this.field540 * 8;
    }

    @ObfuscatedName("dq.t(IB)I")
    public int method656(int arg0) {
        int var2 = this.field532 >> 3;
        int var3 = 8 - (this.field532 & 0x7);
        int var4 = 0;
        this.field532 += arg0;
        while (arg0 > var3) {
            var4 += (this.field541[var2++] & field530[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field541[var2] & field530[var3]) + var4;
        } else {
            var5 = (this.field541[var2] >> var3 - arg0 & field530[arg0]) + var4;
        }
        return var5;
    }
}
