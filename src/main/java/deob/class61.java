package deob;

@ObfuscatedName("cz")
public class class61 {

    @ObfuscatedName("cz.ac")
    public byte[] field459 = null;

    @ObfuscatedName("cz.al")
    public int field458 = 0;

    @ObfuscatedName("cz.ak")
    public int field457 = 0;

    @ObfuscatedName("cz.ac(II)I")
    public int method1098(int arg0) {
        int var2 = 0;
        int var3 = 0;
        while (arg0 >= 8 - this.field457) {
            int var4 = 8 - this.field457;
            int var5 = (0x1 << var4) - 1;
            var2 += (this.field459[this.field458] >> this.field457 & var5) << var3;
            this.field457 = 0;
            this.field458++;
            var3 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var6 = (0x1 << arg0) - 1;
            var2 += (this.field459[this.field458] >> this.field457 & var6) << var3;
            this.field457 += arg0;
        }
        return var2;
    }

    @ObfuscatedName("cz.al(I)I")
    public int method1099() {
        int var1 = this.field459[this.field458] >> this.field457 & 0x1;
        this.field457++;
        this.field458 += this.field457 >> 3;
        this.field457 &= 0x7;
        return var1;
    }

    @ObfuscatedName("cz.ak([BIS)V")
    public void method1101(byte[] arg0, int arg1) {
        this.field459 = arg0;
        this.field458 = arg1;
        this.field457 = 0;
    }
}
