package deob;

@ObfuscatedName("ce")
public class class61 {

    @ObfuscatedName("ce.au")
    public byte[] field460 = null;

    @ObfuscatedName("ce.ae")
    public int field459 = 0;

    @ObfuscatedName("ce.ao")
    public int field464 = 0;

    @ObfuscatedName("ce.au(IB)I")
    public int method1101(int arg0) {
        int var2 = 0;
        int var3 = 0;
        while (arg0 >= 8 - this.field464) {
            int var4 = 8 - this.field464;
            int var5 = (0x1 << var4) - 1;
            var2 += (this.field460[this.field459] >> this.field464 & var5) << var3;
            this.field464 = 0;
            this.field459++;
            var3 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var6 = (0x1 << arg0) - 1;
            var2 += (this.field460[this.field459] >> this.field464 & var6) << var3;
            this.field464 += arg0;
        }
        return var2;
    }

    @ObfuscatedName("ce.ae(B)I")
    public int method1102() {
        int var1 = this.field460[this.field459] >> this.field464 & 0x1;
        this.field464++;
        this.field459 += this.field464 >> 3;
        this.field464 &= 0x7;
        return var1;
    }

    @ObfuscatedName("ce.ao([BII)V")
    public void method1103(byte[] arg0, int arg1) {
        this.field460 = arg0;
        this.field459 = arg1;
        this.field464 = 0;
    }
}
