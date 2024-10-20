package deob;

@ObfuscatedName("cj")
public class class61 {

    @ObfuscatedName("cj.ab")
    public byte[] field416 = null;

    @ObfuscatedName("cj.ay")
    public int field410 = 0;

    @ObfuscatedName("cj.an")
    public int field414 = 0;

    @ObfuscatedName("cj.ab(IS)I")
    public int method1091(int arg0) {
        int var2 = 0;
        int var3 = 0;
        while (arg0 >= 8 - this.field414) {
            int var4 = 8 - this.field414;
            int var5 = (0x1 << var4) - 1;
            var2 += (this.field416[this.field410] >> this.field414 & var5) << var3;
            this.field414 = 0;
            this.field410++;
            var3 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var6 = (0x1 << arg0) - 1;
            var2 += (this.field416[this.field410] >> this.field414 & var6) << var3;
            this.field414 += arg0;
        }
        return var2;
    }

    @ObfuscatedName("cj.ay(I)I")
    public int method1083() {
        int var1 = this.field416[this.field410] >> this.field414 & 0x1;
        this.field414++;
        this.field410 += this.field414 >> 3;
        this.field414 &= 0x7;
        return var1;
    }

    @ObfuscatedName("cj.an([BII)V")
    public void method1084(byte[] arg0, int arg1) {
        this.field416 = arg0;
        this.field410 = arg1;
        this.field414 = 0;
    }
}
