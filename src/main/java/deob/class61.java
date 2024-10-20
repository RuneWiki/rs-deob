package deob;

@ObfuscatedName("ci")
public class class61 {

    @ObfuscatedName("ci.ak")
    public byte[] field437 = null;

    @ObfuscatedName("ci.al")
    public int field436 = 0;

    @ObfuscatedName("ci.aj")
    public int field439 = 0;

    @ObfuscatedName("ci.ak(II)I")
    public int method1088(int arg0) {
        int var2 = 0;
        int var3 = 0;
        while (arg0 >= 8 - this.field439) {
            int var4 = 8 - this.field439;
            int var5 = (0x1 << var4) - 1;
            var2 += (this.field437[this.field436] >> this.field439 & var5) << var3;
            this.field439 = 0;
            this.field436++;
            var3 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var6 = (0x1 << arg0) - 1;
            var2 += (this.field437[this.field436] >> this.field439 & var6) << var3;
            this.field439 += arg0;
        }
        return var2;
    }

    @ObfuscatedName("ci.al(I)I")
    public int method1083() {
        int var1 = this.field437[this.field436] >> this.field439 & 0x1;
        this.field439++;
        this.field436 += this.field439 >> 3;
        this.field439 &= 0x7;
        return var1;
    }

    @ObfuscatedName("ci.aj([BII)V")
    public void method1081(byte[] arg0, int arg1) {
        this.field437 = arg0;
        this.field436 = arg1;
        this.field439 = 0;
    }
}
