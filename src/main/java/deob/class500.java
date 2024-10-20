package deob;

@ObfuscatedName("tl")
public class class500 extends class501 {

    @ObfuscatedName("tl.at")
    public class518 field5015;

    @ObfuscatedName("tl.an")
    public static final int[] field5014 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("tl.av")
    public int field5013;

    public class500(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("tl.at([II)V")
    public void method8079(int[] arg0) {
        this.field5015 = new class518(arg0);
    }

    @ObfuscatedName("tl.an(Ltq;I)V")
    public void method8073(class518 arg0) {
        this.field5015 = arg0;
    }

    @ObfuscatedName("tl.av(II)V")
    public void method8075(int arg0) {
        this.field5016[++this.field5017 - 1] = (byte) (arg0 + this.field5015.method8722());
    }

    @ObfuscatedName("tl.as(I)I")
    public int method8076() {
        return this.field5016[++this.field5017 - 1] - this.field5015.method8722() & 0xFF;
    }

    @ObfuscatedName("tl.ax(B)Z")
    public boolean method8101() {
        int var1 = this.field5016[this.field5017] - this.field5015.method8721() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("tl.ap(B)I")
    public int method8078() {
        int var1 = this.field5016[++this.field5017 - 1] - this.field5015.method8722() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field5016[++this.field5017 - 1] - this.field5015.method8722() & 0xFF);
    }

    @ObfuscatedName("tl.ab([BIII)V")
    public void method8096(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field5016[++this.field5017 - 1] - this.field5015.method8722());
        }
    }

    @ObfuscatedName("tl.ak(I)V")
    public void method8080() {
        this.field5013 = this.field5017 * 8;
    }

    @ObfuscatedName("tl.ae(IB)I")
    public int method8104(int arg0) {
        int var2 = this.field5013 >> 3;
        int var3 = 8 - (this.field5013 & 0x7);
        int var4 = 0;
        this.field5013 += arg0;
        while (arg0 > var3) {
            var4 += (this.field5016[var2++] & field5014[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field5016[var2] & field5014[var3]) + var4;
        } else {
            var5 = (this.field5016[var2] >> var3 - arg0 & field5014[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("tl.af(I)V")
    public void method8082() {
        this.field5017 = (this.field5013 + 7) / 8;
    }

    @ObfuscatedName("tl.ao(II)I")
    public int method8108(int arg0) {
        return arg0 * 8 - this.field5013;
    }
}
