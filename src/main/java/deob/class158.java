package deob;

@ObfuscatedName("fi")
public class class158 extends class160 {

    @ObfuscatedName("fi.c")
    public long[] field1726 = new long[10];

    @ObfuscatedName("fi.l")
    public int field1724 = 256;

    @ObfuscatedName("fi.s")
    public int field1723 = 1;

    @ObfuscatedName("fi.e")
    public long field1729 = class262.method4787();

    @ObfuscatedName("fi.r")
    public int field1727 = 0;

    @ObfuscatedName("fi.o")
    public int field1728;

    public class158() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1726[var1] = this.field1729;
        }
    }

    @ObfuscatedName("fi.c(I)V")
    public void method2737() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1726[var1] = 0L;
        }
    }

    @ObfuscatedName("fi.l(IIB)I")
    public int method2738(int arg0, int arg1) {
        int var3 = this.field1724;
        int var4 = this.field1723;
        this.field1724 = 300;
        this.field1723 = 1;
        this.field1729 = class262.method4787();
        if (this.field1726[this.field1728] == 0L) {
            this.field1724 = var3;
            this.field1723 = var4;
        } else if (this.field1729 > this.field1726[this.field1728]) {
            this.field1724 = (int) ((long) (arg0 * 2560) / (this.field1729 - this.field1726[this.field1728]));
        }
        if (this.field1724 < 25) {
            this.field1724 = 25;
        }
        if (this.field1724 > 256) {
            this.field1724 = 256;
            this.field1723 = (int) ((long) arg0 - (this.field1729 - this.field1726[this.field1728]) / 10L);
        }
        if (this.field1723 > arg0) {
            this.field1723 = arg0;
        }
        this.field1726[this.field1728] = this.field1729;
        this.field1728 = (this.field1728 + 1) % 10;
        if (this.field1723 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1726[var5] != 0L) {
                    this.field1726[var5] += (long) this.field1723;
                }
            }
        }
        if (this.field1723 < arg1) {
            this.field1723 = arg1;
        }
        class263.method5249((long) this.field1723);
        int var6 = 0;
        while (this.field1727 < 256) {
            var6++;
            this.field1727 += this.field1724;
        }
        this.field1727 &= 0xFF;
        return var6;
    }
}
