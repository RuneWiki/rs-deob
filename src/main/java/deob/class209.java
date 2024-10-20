package deob;

@ObfuscatedName("hx")
public final class class209 extends class202 {

    @ObfuscatedName("hx.e")
    public class210 field2470;

    @ObfuscatedName("hx.x")
    public static final int[] field2468 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("hx.d")
    public int field2469;

    public class209(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("hx.io([II)V")
    public void method3697(int[] arg0) {
        this.field2470 = new class210(arg0);
    }

    @ObfuscatedName("hx.ih(Lhn;B)V")
    public void method3684(class210 arg0) {
        this.field2470 = arg0;
    }

    @ObfuscatedName("hx.im(IS)V")
    public void method3685(int arg0) {
        this.field2440[++this.field2439 - 1] = (byte) (arg0 + this.field2470.method3725());
    }

    @ObfuscatedName("hx.ii(I)I")
    public int method3686() {
        return this.field2440[++this.field2439 - 1] - this.field2470.method3725() & 0xFF;
    }

    @ObfuscatedName("hx.ig(B)Z")
    public boolean method3687() {
        int var1 = this.field2440[this.field2439] - this.field2470.method3733() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("hx.ia(I)I")
    public int method3688() {
        int var1 = this.field2440[++this.field2439 - 1] - this.field2470.method3725() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2440[++this.field2439 - 1] - this.field2470.method3725() & 0xFF);
    }

    @ObfuscatedName("hx.jb([BIII)V")
    public void method3695(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field2440[++this.field2439 - 1] - this.field2470.method3725());
        }
    }

    @ObfuscatedName("hx.jq(I)V")
    public void method3690() {
        this.field2469 = this.field2439 * 8;
    }

    @ObfuscatedName("hx.jw(II)I")
    public int method3692(int arg0) {
        int var2 = this.field2469 >> 3;
        int var3 = 8 - (this.field2469 & 0x7);
        int var4 = 0;
        this.field2469 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2440[var2++] & field2468[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2440[var2] & field2468[var3]) + var4;
        } else {
            var5 = (this.field2440[var2] >> var3 - arg0 & field2468[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("hx.jm(I)V")
    public void method3713() {
        this.field2439 = (this.field2469 + 7) / 8;
    }

    @ObfuscatedName("hx.jr(II)I")
    public int method3693(int arg0) {
        return arg0 * 8 - this.field2469;
    }
}
