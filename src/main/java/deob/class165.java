package deob;

@ObfuscatedName("fz")
public class class165 extends class168 {

    @ObfuscatedName("fz.o")
    public long[] field1818 = new long[10];

    @ObfuscatedName("fz.q")
    public int field1816 = 256;

    @ObfuscatedName("fz.l")
    public int field1817 = 1;

    @ObfuscatedName("fz.k")
    public long field1815 = class270.method2485();

    @ObfuscatedName("fz.a")
    public int field1819 = 0;

    @ObfuscatedName("fz.m")
    public int field1820;

    public class165() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1818[var1] = this.field1815;
        }
    }

    @ObfuscatedName("fz.o(I)V")
    public void method2789() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1818[var1] = 0L;
        }
    }

    @ObfuscatedName("fz.q(III)I")
    public int method2790(int arg0, int arg1) {
        int var3 = this.field1816;
        int var4 = this.field1817;
        this.field1816 = 300;
        this.field1817 = 1;
        this.field1815 = class270.method2485();
        if (this.field1818[this.field1820] == 0L) {
            this.field1816 = var3;
            this.field1817 = var4;
        } else if (this.field1815 > this.field1818[this.field1820]) {
            this.field1816 = (int) ((long) (arg0 * 2560) / (this.field1815 - this.field1818[this.field1820]));
        }
        if (this.field1816 < 25) {
            this.field1816 = 25;
        }
        if (this.field1816 > 256) {
            this.field1816 = 256;
            this.field1817 = (int) ((long) arg0 - (this.field1815 - this.field1818[this.field1820]) / 10L);
        }
        if (this.field1817 > arg0) {
            this.field1817 = arg0;
        }
        this.field1818[this.field1820] = this.field1815;
        this.field1820 = (this.field1820 + 1) % 10;
        if (this.field1817 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1818[var5] != 0L) {
                    this.field1818[var5] += (long) this.field1817;
                }
            }
        }
        if (this.field1817 < arg1) {
            this.field1817 = arg1;
        }
        class271.method4446((long) this.field1817);
        int var6 = 0;
        while (this.field1819 < 256) {
            var6++;
            this.field1819 += this.field1816;
        }
        this.field1819 &= 0xFF;
        return var6;
    }
}
