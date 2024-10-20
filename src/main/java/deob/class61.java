package deob;

@ObfuscatedName("cy")
public class class61 {

    @ObfuscatedName("cy.ac")
    public byte[] field428 = null;

    @ObfuscatedName("cy.ae")
    public int field424 = 0;

    @ObfuscatedName("cy.ag")
    public int field425 = 0;

    @ObfuscatedName("cy.ac(II)I")
    public int method1117(int arg0) {
        int var2 = 0;
        int var3 = 0;
        while (arg0 >= 8 - this.field425) {
            int var4 = 8 - this.field425;
            int var5 = (0x1 << var4) - 1;
            var2 += (this.field428[this.field424] >> this.field425 & var5) << var3;
            this.field425 = 0;
            this.field424++;
            var3 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var6 = (0x1 << arg0) - 1;
            var2 += (this.field428[this.field424] >> this.field425 & var6) << var3;
            this.field425 += arg0;
        }
        return var2;
    }

    @ObfuscatedName("cy.ae(I)I")
    public int method1118() {
        int var1 = this.field428[this.field424] >> this.field425 & 0x1;
        this.field425++;
        this.field424 += this.field425 >> 3;
        this.field425 &= 0x7;
        return var1;
    }

    @ObfuscatedName("cy.ag([BIB)V")
    public void method1124(byte[] arg0, int arg1) {
        this.field428 = arg0;
        this.field424 = arg1;
        this.field425 = 0;
    }
}
