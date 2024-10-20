package deob;

@ObfuscatedName("ce")
public class class61 {

    @ObfuscatedName("ce.aw")
    public byte[] field460 = null;

    @ObfuscatedName("ce.ay")
    public int field457 = 0;

    @ObfuscatedName("ce.ar")
    public int field458 = 0;

    @ObfuscatedName("ce.aw(II)I")
    public int method1114(int arg0) {
        int var2 = 0;
        int var3 = 0;
        while (arg0 >= 8 - this.field458) {
            int var4 = 8 - this.field458;
            int var5 = (0x1 << var4) - 1;
            var2 += (this.field460[this.field457] >> this.field458 & var5) << var3;
            this.field458 = 0;
            this.field457++;
            var3 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var6 = (0x1 << arg0) - 1;
            var2 += (this.field460[this.field457] >> this.field458 & var6) << var3;
            this.field458 += arg0;
        }
        return var2;
    }

    @ObfuscatedName("ce.ay(B)I")
    public int method1115() {
        int var1 = this.field460[this.field457] >> this.field458 & 0x1;
        this.field458++;
        this.field457 += this.field458 >> 3;
        this.field458 &= 0x7;
        return var1;
    }

    @ObfuscatedName("ce.ar([BII)V")
    public void method1116(byte[] arg0, int arg1) {
        this.field460 = arg0;
        this.field457 = arg1;
        this.field458 = 0;
    }
}
