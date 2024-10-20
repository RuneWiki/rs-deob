package deob;

@ObfuscatedName("fn")
public final class class181 extends class175 {

    @ObfuscatedName("fn.k")
    public class182 field2431;

    @ObfuscatedName("fn.s")
    public static final int[] field2427 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fn.d")
    public int field2429;

    public class181(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fn.hj([II)V")
    public void method3227(int[] arg0) {
        this.field2431 = new class182(arg0);
    }

    @ObfuscatedName("fn.hd(II)V")
    public void method3243(int arg0) {
        this.field2392[++this.field2395 - 1] = (byte) (arg0 + this.field2431.method3254());
    }

    @ObfuscatedName("fn.id(I)I")
    public int method3228() {
        return this.field2392[++this.field2395 - 1] - this.field2431.method3254() & 0xFF;
    }

    @ObfuscatedName("fn.if(I)V")
    public void method3226() {
        this.field2429 = this.field2395 * 8;
    }

    @ObfuscatedName("fn.ii(II)I")
    public int method3230(int arg0) {
        int var2 = this.field2429 >> 3;
        int var3 = 8 - (this.field2429 & 0x7);
        int var4 = 0;
        this.field2429 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2392[var2++] & field2427[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2392[var2] & field2427[var3]) + var4;
        } else {
            var5 = (this.field2392[var2] >> var3 - arg0 & field2427[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fn.ik(I)V")
    public void method3231() {
        this.field2395 = (this.field2429 + 7) / 8;
    }

    @ObfuscatedName("fn.ib(IB)I")
    public int method3244(int arg0) {
        return arg0 * 8 - this.field2429;
    }
}
