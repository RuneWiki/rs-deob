package deob;

@ObfuscatedName("co")
public class class61 {

    @ObfuscatedName("co.aq")
    public byte[] field414 = null;

    @ObfuscatedName("co.ad")
    public int field411 = 0;

    @ObfuscatedName("co.ag")
    public int field413 = 0;

    @ObfuscatedName("co.aq(IB)I")
    public int method1104(int arg0) {
        int var2 = 0;
        int var3 = 0;
        while (arg0 >= 8 - this.field413) {
            int var4 = 8 - this.field413;
            int var5 = (0x1 << var4) - 1;
            var2 += (this.field414[this.field411] >> this.field413 & var5) << var3;
            this.field413 = 0;
            this.field411++;
            var3 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var6 = (0x1 << arg0) - 1;
            var2 += (this.field414[this.field411] >> this.field413 & var6) << var3;
            this.field413 += arg0;
        }
        return var2;
    }

    @ObfuscatedName("co.ad(I)I")
    public int method1092() {
        int var1 = this.field414[this.field411] >> this.field413 & 0x1;
        this.field413++;
        this.field411 += this.field413 >> 3;
        this.field413 &= 0x7;
        return var1;
    }

    @ObfuscatedName("co.ag([BII)V")
    public void method1094(byte[] arg0, int arg1) {
        this.field414 = arg0;
        this.field411 = arg1;
        this.field413 = 0;
    }
}
