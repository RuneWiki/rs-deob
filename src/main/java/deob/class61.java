package deob;

@ObfuscatedName("cw")
public class class61 {

    @ObfuscatedName("cw.at")
    public byte[] field416 = null;

    @ObfuscatedName("cw.ah")
    public int field417 = 0;

    @ObfuscatedName("cw.ar")
    public int field418 = 0;

    @ObfuscatedName("cw.at(II)I")
    public int method1106(int arg0) {
        int var2 = 0;
        int var3 = 0;
        while (arg0 >= 8 - this.field418) {
            int var4 = 8 - this.field418;
            int var5 = (0x1 << var4) - 1;
            var2 += (this.field416[this.field417] >> this.field418 & var5) << var3;
            this.field418 = 0;
            this.field417++;
            var3 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var6 = (0x1 << arg0) - 1;
            var2 += (this.field416[this.field417] >> this.field418 & var6) << var3;
            this.field418 += arg0;
        }
        return var2;
    }

    @ObfuscatedName("cw.ah(B)I")
    public int method1107() {
        int var1 = this.field416[this.field417] >> this.field418 & 0x1;
        this.field418++;
        this.field417 += this.field418 >> 3;
        this.field418 &= 0x7;
        return var1;
    }

    @ObfuscatedName("cw.ar([BIB)V")
    public void method1108(byte[] arg0, int arg1) {
        this.field416 = arg0;
        this.field417 = arg1;
        this.field418 = 0;
    }
}
