package deob;

@ObfuscatedName("ct")
public class class61 {

    @ObfuscatedName("ct.az")
    public byte[] field429 = null;

    @ObfuscatedName("ct.ah")
    public int field423 = 0;

    @ObfuscatedName("ct.af")
    public int field428 = 0;

    @ObfuscatedName("ct.az(IB)I")
    public int method1058(int arg0) {
        int var2 = 0;
        int var3 = 0;
        while (arg0 >= 8 - this.field428) {
            int var4 = 8 - this.field428;
            int var5 = (0x1 << var4) - 1;
            var2 += (this.field429[this.field423] >> this.field428 & var5) << var3;
            this.field428 = 0;
            this.field423++;
            var3 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var6 = (0x1 << arg0) - 1;
            var2 += (this.field429[this.field423] >> this.field428 & var6) << var3;
            this.field428 += arg0;
        }
        return var2;
    }

    @ObfuscatedName("ct.ah(I)I")
    public int method1059() {
        int var1 = this.field429[this.field423] >> this.field428 & 0x1;
        this.field428++;
        this.field423 += this.field428 >> 3;
        this.field428 &= 0x7;
        return var1;
    }

    @ObfuscatedName("ct.af([BII)V")
    public void method1069(byte[] arg0, int arg1) {
        this.field429 = arg0;
        this.field423 = arg1;
        this.field428 = 0;
    }
}
