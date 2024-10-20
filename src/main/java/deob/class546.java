package deob;

@ObfuscatedName("ug")
public class class546 extends class547 {

    @ObfuscatedName("ug.aq")
    public class564 field5358;

    @ObfuscatedName("ug.ad")
    public static final int[] field5359 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ug.ag")
    public int field5360;

    public class546(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ug.aq([IB)V")
    public void method8670(int[] arg0) {
        this.field5358 = new class564(arg0);
    }

    @ObfuscatedName("ug.ad(Lvs;B)V")
    public void method8671(class564 arg0) {
        this.field5358 = arg0;
    }

    @ObfuscatedName("ug.ag(II)V")
    public void method8699(int arg0) {
        this.field5364[++this.field5363 - 1] = (byte) (arg0 + this.field5358.method9305());
    }

    @ObfuscatedName("ug.ak(I)I")
    public int method8703() {
        return this.field5364[++this.field5363 - 1] - this.field5358.method9305() & 0xFF;
    }

    @ObfuscatedName("ug.ap(B)Z")
    public boolean method8675() {
        int var1 = this.field5364[this.field5363] - this.field5358.method9306() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("ug.an(I)I")
    public int method8692() {
        int var1 = this.field5364[++this.field5363 - 1] - this.field5358.method9305() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field5364[++this.field5363 - 1] - this.field5358.method9305() & 0xFF);
    }

    @ObfuscatedName("ug.aj([BIII)V")
    public void method8676(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field5364[++this.field5363 - 1] - this.field5358.method9305());
        }
    }

    @ObfuscatedName("ug.av(B)V")
    public void method8677() {
        this.field5360 = this.field5363 * 8;
    }

    @ObfuscatedName("ug.ab(II)I")
    public int method8678(int arg0) {
        int var2 = this.field5360 >> 3;
        int var3 = 8 - (this.field5360 & 0x7);
        int var4 = 0;
        this.field5360 += arg0;
        while (arg0 > var3) {
            var4 += (this.field5364[var2++] & field5359[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field5364[var2] & field5359[var3]) + var4;
        } else {
            var5 = (this.field5364[var2] >> var3 - arg0 & field5359[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ug.ai(I)V")
    public void method8679() {
        this.field5363 = (this.field5360 + 7) / 8;
    }

    @ObfuscatedName("ug.ae(II)I")
    public int method8673(int arg0) {
        return arg0 * 8 - this.field5360;
    }

    @ObfuscatedName("ug.au(II)I")
    public int method8681(int arg0) {
        return arg0 - this.field5363;
    }
}
