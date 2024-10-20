package deob;

@ObfuscatedName("cl")
public class class61 {

    @ObfuscatedName("cl.aq")
    public byte[] field432 = null;

    @ObfuscatedName("cl.aw")
    public int field431 = 0;

    @ObfuscatedName("cl.al")
    public int field435 = 0;

    @ObfuscatedName("cl.aq(II)I")
    public int method1068(int arg0) {
        int var2 = 0;
        int var3 = 0;
        while (arg0 >= 8 - this.field435) {
            int var4 = 8 - this.field435;
            int var5 = (0x1 << var4) - 1;
            var2 += (this.field432[this.field431] >> this.field435 & var5) << var3;
            this.field435 = 0;
            this.field431++;
            var3 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var6 = (0x1 << arg0) - 1;
            var2 += (this.field432[this.field431] >> this.field435 & var6) << var3;
            this.field435 += arg0;
        }
        return var2;
    }

    @ObfuscatedName("cl.aw(I)I")
    public int method1069() {
        int var1 = this.field432[this.field431] >> this.field435 & 0x1;
        this.field435++;
        this.field431 += this.field435 >> 3;
        this.field435 &= 0x7;
        return var1;
    }

    @ObfuscatedName("cl.al([BIB)V")
    public void method1071(byte[] arg0, int arg1) {
        this.field432 = arg0;
        this.field431 = arg1;
        this.field435 = 0;
    }
}
