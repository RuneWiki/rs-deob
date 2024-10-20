package deob;

@ObfuscatedName("fn")
public class class165 extends class168 {

    @ObfuscatedName("fn.v")
    public long[] field1768 = new long[10];

    @ObfuscatedName("fn.c")
    public int field1770 = 256;

    @ObfuscatedName("fn.i")
    public int field1769 = 1;

    @ObfuscatedName("fn.f")
    public long field1767 = class270.method2724();

    @ObfuscatedName("fn.b")
    public int field1771 = 0;

    @ObfuscatedName("fn.n")
    public int field1772;

    public class165() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1768[var1] = this.field1767;
        }
    }

    @ObfuscatedName("fn.v(I)V")
    public void method2866() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1768[var1] = 0L;
        }
    }

    @ObfuscatedName("fn.c(III)I")
    public int method2869(int arg0, int arg1) {
        int var3 = this.field1770;
        int var4 = this.field1769;
        this.field1770 = 300;
        this.field1769 = 1;
        this.field1767 = class270.method2724();
        if (this.field1768[this.field1772] == 0L) {
            this.field1770 = var3;
            this.field1769 = var4;
        } else if (this.field1767 > this.field1768[this.field1772]) {
            this.field1770 = (int) ((long) (arg0 * 2560) / (this.field1767 - this.field1768[this.field1772]));
        }
        if (this.field1770 < 25) {
            this.field1770 = 25;
        }
        if (this.field1770 > 256) {
            this.field1770 = 256;
            this.field1769 = (int) ((long) arg0 - (this.field1767 - this.field1768[this.field1772]) / 10L);
        }
        if (this.field1769 > arg0) {
            this.field1769 = arg0;
        }
        this.field1768[this.field1772] = this.field1767;
        this.field1772 = (this.field1772 + 1) % 10;
        if (this.field1769 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1768[var5] != 0L) {
                    this.field1768[var5] += (long) this.field1769;
                }
            }
        }
        if (this.field1769 < arg1) {
            this.field1769 = arg1;
        }
        class271.method2274((long) this.field1769);
        int var6 = 0;
        while (this.field1771 < 256) {
            var6++;
            this.field1771 += this.field1770;
        }
        this.field1771 &= 0xFF;
        return var6;
    }
}
