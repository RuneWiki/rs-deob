package deob;

@ObfuscatedName("ee")
public final class class136 extends class130 {

    @ObfuscatedName("ee.l")
    public class137 field1988;

    @ObfuscatedName("ee.v")
    public static final int[] field1987 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ee.g")
    public int field1989;

    public class136(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ee.ig([II)V")
    public void method2479(int[] arg0) {
        this.field1988 = new class137(arg0);
    }

    @ObfuscatedName("ee.iw(IB)V")
    public void method2480(int arg0) {
        this.field1955[++this.field1956 - 1] = (byte) (arg0 + this.field1988.method2497());
    }

    @ObfuscatedName("ee.im(I)I")
    public int method2484() {
        return this.field1955[++this.field1956 - 1] - this.field1988.method2497() & 0xFF;
    }

    @ObfuscatedName("ee.ih(B)V")
    public void method2482() {
        this.field1989 = this.field1956 * 8;
    }

    @ObfuscatedName("ee.ia(II)I")
    public int method2483(int arg0) {
        int var2 = this.field1989 >> 3;
        int var3 = 8 - (this.field1989 & 0x7);
        int var4 = 0;
        this.field1989 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1955[var2++] & field1987[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1955[var2] & field1987[var3]) + var4;
        } else {
            var5 = (this.field1955[var2] >> var3 - arg0 & field1987[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ee.iz(B)V")
    public void method2485() {
        this.field1956 = (this.field1989 + 7) / 8;
    }

    @ObfuscatedName("ee.is(II)I")
    public int method2495(int arg0) {
        return arg0 * 8 - this.field1989;
    }
}
