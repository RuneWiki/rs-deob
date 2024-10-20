package deob;

@ObfuscatedName("gy")
public final class class191 extends class185 {

    @ObfuscatedName("gy.g")
    public class192 field2543;

    @ObfuscatedName("gy.j")
    public static final int[] field2544 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gy.x")
    public int field2545;

    public class191(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gy.jt([IB)V")
    public void method3236(int[] arg0) {
        this.field2543 = new class192(arg0);
    }

    @ObfuscatedName("gy.jg(Lgj;I)V")
    public void method3266(class192 arg0) {
        this.field2543 = arg0;
    }

    @ObfuscatedName("gy.je(IB)V")
    public void method3238(int arg0) {
        this.field2512[++this.field2509 - 1] = (byte) (arg0 + this.field2543.method3273());
    }

    @ObfuscatedName("gy.jf(I)I")
    public int method3239() {
        return this.field2512[++this.field2509 - 1] - this.field2543.method3273() & 0xFF;
    }

    @ObfuscatedName("gy.jq(I)Z")
    public boolean method3258() {
        int var1 = this.field2512[this.field2509] - this.field2543.method3274() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gy.jr(I)I")
    public int method3241() {
        int var1 = this.field2512[++this.field2509 - 1] - this.field2543.method3273() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2512[++this.field2509 - 1] - this.field2543.method3273() & 0xFF);
    }

    @ObfuscatedName("gy.jn(B)V")
    public void method3244() {
        this.field2545 = this.field2509 * 8;
    }

    @ObfuscatedName("gy.jh(II)I")
    public int method3243(int arg0) {
        int var2 = this.field2545 >> 3;
        int var3 = 8 - (this.field2545 & 0x7);
        int var4 = 0;
        this.field2545 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2512[var2++] & field2544[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2512[var2] & field2544[var3]) + var4;
        } else {
            var5 = (this.field2512[var2] >> var3 - arg0 & field2544[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gy.jj(I)V")
    public void method3263() {
        this.field2509 = (this.field2545 + 7) / 8;
    }

    @ObfuscatedName("gy.jl(IS)I")
    public int method3245(int arg0) {
        return arg0 * 8 - this.field2545;
    }
}
