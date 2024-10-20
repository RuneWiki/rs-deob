package deob;

@ObfuscatedName("cd")
public class class61 {

    @ObfuscatedName("cd.at")
    public byte[] field441 = null;

    @ObfuscatedName("cd.an")
    public int field440 = 0;

    @ObfuscatedName("cd.av")
    public int field446 = 0;

    @ObfuscatedName("cd.at(II)I")
    public int method1050(int arg0) {
        int var2 = 0;
        int var3 = 0;
        while (arg0 >= 8 - this.field446) {
            int var4 = 8 - this.field446;
            int var5 = (0x1 << var4) - 1;
            var2 += (this.field441[this.field440] >> this.field446 & var5) << var3;
            this.field446 = 0;
            this.field440++;
            var3 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var6 = (0x1 << arg0) - 1;
            var2 += (this.field441[this.field440] >> this.field446 & var6) << var3;
            this.field446 += arg0;
        }
        return var2;
    }

    @ObfuscatedName("cd.an(I)I")
    public int method1049() {
        int var1 = this.field441[this.field440] >> this.field446 & 0x1;
        this.field446++;
        this.field440 += this.field446 >> 3;
        this.field446 &= 0x7;
        return var1;
    }

    @ObfuscatedName("cd.av([BII)V")
    public void method1068(byte[] arg0, int arg1) {
        this.field441 = arg0;
        this.field440 = arg1;
        this.field446 = 0;
    }
}
