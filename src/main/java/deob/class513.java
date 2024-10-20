package deob;

@ObfuscatedName("tc")
public class class513 extends class514 {

    @ObfuscatedName("tc.aw")
    public class531 field5067;

    @ObfuscatedName("tc.ay")
    public static final int[] field5066 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("tc.ar")
    public int field5068;

    public class513(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("tc.aw([IB)V")
    public void method8188(int[] arg0) {
        this.field5067 = new class531(arg0);
    }

    @ObfuscatedName("tc.ay(Luy;I)V")
    public void method8187(class531 arg0) {
        this.field5067 = arg0;
    }

    @ObfuscatedName("tc.ar(II)V")
    public void method8190(int arg0) {
        this.field5070[++this.field5072 - 1] = (byte) (arg0 + this.field5067.method8841());
    }

    @ObfuscatedName("tc.am(B)I")
    public int method8191() {
        return this.field5070[++this.field5072 - 1] - this.field5067.method8841() & 0xFF;
    }

    @ObfuscatedName("tc.as(I)Z")
    public boolean method8192() {
        int var1 = this.field5070[this.field5072] - this.field5067.method8843() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("tc.aj(I)I")
    public int method8193() {
        int var1 = this.field5070[++this.field5072 - 1] - this.field5067.method8841() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field5070[++this.field5072 - 1] - this.field5067.method8841() & 0xFF);
    }

    @ObfuscatedName("tc.ag([BIII)V")
    public void method8218(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field5070[++this.field5072 - 1] - this.field5067.method8841());
        }
    }

    @ObfuscatedName("tc.az(B)V")
    public void method8189() {
        this.field5068 = this.field5072 * 8;
    }

    @ObfuscatedName("tc.av(II)I")
    public int method8196(int arg0) {
        int var2 = this.field5068 >> 3;
        int var3 = 8 - (this.field5068 & 0x7);
        int var4 = 0;
        this.field5068 += arg0;
        while (arg0 > var3) {
            var4 += (this.field5070[var2++] & field5066[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field5070[var2] & field5066[var3]) + var4;
        } else {
            var5 = (this.field5070[var2] >> var3 - arg0 & field5066[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("tc.ap(I)V")
    public void method8195() {
        this.field5072 = (this.field5068 + 7) / 8;
    }

    @ObfuscatedName("tc.aq(II)I")
    public int method8198(int arg0) {
        return arg0 * 8 - this.field5068;
    }
}
