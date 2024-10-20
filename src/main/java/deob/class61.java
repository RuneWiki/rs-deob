package deob;

@ObfuscatedName("cs")
public class class61 {

    @ObfuscatedName("cs.am")
    public byte[] field431 = null;

    @ObfuscatedName("cs.ap")
    public int field434 = 0;

    @ObfuscatedName("cs.af")
    public int field433 = 0;

    @ObfuscatedName("cs.am(II)I")
    public int method1129(int arg0) {
        int var2 = 0;
        int var3 = 0;
        while (arg0 >= 8 - this.field433) {
            int var4 = 8 - this.field433;
            int var5 = (0x1 << var4) - 1;
            var2 += (this.field431[this.field434] >> this.field433 & var5) << var3;
            this.field433 = 0;
            this.field434++;
            var3 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var6 = (0x1 << arg0) - 1;
            var2 += (this.field431[this.field434] >> this.field433 & var6) << var3;
            this.field433 += arg0;
        }
        return var2;
    }

    @ObfuscatedName("cs.ap(I)I")
    public int method1130() {
        int var1 = this.field431[this.field434] >> this.field433 & 0x1;
        this.field433++;
        this.field434 += this.field433 >> 3;
        this.field433 &= 0x7;
        return var1;
    }

    @ObfuscatedName("cs.af([BII)V")
    public void method1128(byte[] arg0, int arg1) {
        this.field431 = arg0;
        this.field434 = arg1;
        this.field433 = 0;
    }
}
