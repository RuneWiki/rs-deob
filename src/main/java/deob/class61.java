package deob;

@ObfuscatedName("cp")
public class class61 {

    @ObfuscatedName("cp.ap")
    public byte[] field412 = null;

    @ObfuscatedName("cp.aw")
    public int field410 = 0;

    @ObfuscatedName("cp.ak")
    public int field414 = 0;

    @ObfuscatedName("cp.ap(IB)I")
    public int method1145(int arg0) {
        int var2 = 0;
        int var3 = 0;
        while (arg0 >= 8 - this.field414) {
            int var4 = 8 - this.field414;
            int var5 = (0x1 << var4) - 1;
            var2 += (this.field412[this.field410] >> this.field414 & var5) << var3;
            this.field414 = 0;
            this.field410++;
            var3 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var6 = (0x1 << arg0) - 1;
            var2 += (this.field412[this.field410] >> this.field414 & var6) << var3;
            this.field414 += arg0;
        }
        return var2;
    }

    @ObfuscatedName("cp.aw(I)I")
    public int method1135() {
        int var1 = this.field412[this.field410] >> this.field414 & 0x1;
        this.field414++;
        this.field410 += this.field414 >> 3;
        this.field414 &= 0x7;
        return var1;
    }

    @ObfuscatedName("cp.ak([BII)V")
    public void method1147(byte[] arg0, int arg1) {
        this.field412 = arg0;
        this.field410 = arg1;
        this.field414 = 0;
    }
}
