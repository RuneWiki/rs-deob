package deob;

@ObfuscatedName("fb")
public class class164 extends class167 {

    @ObfuscatedName("fb.s")
    public long[] field1774 = new long[10];

    @ObfuscatedName("fb.h")
    public int field1766 = 256;

    @ObfuscatedName("fb.w")
    public int field1767 = 1;

    @ObfuscatedName("fb.v")
    public long field1770 = class270.method3146();

    @ObfuscatedName("fb.c")
    public int field1769 = 0;

    @ObfuscatedName("fb.q")
    public int field1768;

    public class164() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1774[var1] = this.field1770;
        }
    }

    @ObfuscatedName("fb.s(I)V")
    public void method2790() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1774[var1] = 0L;
        }
    }

    @ObfuscatedName("fb.h(IIB)I")
    public int method2788(int arg0, int arg1) {
        int var3 = this.field1766;
        int var4 = this.field1767;
        this.field1766 = 300;
        this.field1767 = 1;
        this.field1770 = class270.method3146();
        if (this.field1774[this.field1768] == 0L) {
            this.field1766 = var3;
            this.field1767 = var4;
        } else if (this.field1770 > this.field1774[this.field1768]) {
            this.field1766 = (int) ((long) (arg0 * 2560) / (this.field1770 - this.field1774[this.field1768]));
        }
        if (this.field1766 < 25) {
            this.field1766 = 25;
        }
        if (this.field1766 > 256) {
            this.field1766 = 256;
            this.field1767 = (int) ((long) arg0 - (this.field1770 - this.field1774[this.field1768]) / 10L);
        }
        if (this.field1767 > arg0) {
            this.field1767 = arg0;
        }
        this.field1774[this.field1768] = this.field1770;
        this.field1768 = (this.field1768 + 1) % 10;
        if (this.field1767 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1774[var5] != 0L) {
                    this.field1774[var5] += (long) this.field1767;
                }
            }
        }
        if (this.field1767 < arg1) {
            this.field1767 = arg1;
        }
        class271.method2748((long) this.field1767);
        int var6 = 0;
        while (this.field1769 < 256) {
            var6++;
            this.field1769 += this.field1766;
        }
        this.field1769 &= 0xFF;
        return var6;
    }
}
