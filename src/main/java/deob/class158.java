package deob;

@ObfuscatedName("ft")
public class class158 extends class160 {

    @ObfuscatedName("ft.c")
    public long[] field1719 = new long[10];

    @ObfuscatedName("ft.b")
    public int field1720 = 256;

    @ObfuscatedName("ft.p")
    public int field1717 = 1;

    @ObfuscatedName("ft.m")
    public long field1718 = class416.method5860();

    @ObfuscatedName("ft.t")
    public int field1715 = 0;

    @ObfuscatedName("ft.s")
    public int field1716;

    public class158() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1719[var1] = this.field1718;
        }
    }

    @ObfuscatedName("ft.c(B)V")
    public void method2770() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1719[var1] = 0L;
        }
    }

    @ObfuscatedName("ft.b(III)I")
    public int method2761(int arg0, int arg1) {
        int var3 = this.field1720;
        int var4 = this.field1717;
        this.field1720 = 300;
        this.field1717 = 1;
        this.field1718 = class416.method5860();
        if (this.field1719[this.field1716] == 0L) {
            this.field1720 = var3;
            this.field1717 = var4;
        } else if (this.field1718 > this.field1719[this.field1716]) {
            this.field1720 = (int) ((long) (arg0 * 2560) / (this.field1718 - this.field1719[this.field1716]));
        }
        if (this.field1720 < 25) {
            this.field1720 = 25;
        }
        if (this.field1720 > 256) {
            this.field1720 = 256;
            this.field1717 = (int) ((long) arg0 - (this.field1718 - this.field1719[this.field1716]) / 10L);
        }
        if (this.field1717 > arg0) {
            this.field1717 = arg0;
        }
        this.field1719[this.field1716] = this.field1718;
        this.field1716 = (this.field1716 + 1) % 10;
        if (this.field1717 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1719[var5] != 0L) {
                    this.field1719[var5] += (long) this.field1717;
                }
            }
        }
        if (this.field1717 < arg1) {
            this.field1717 = arg1;
        }
        class417.method5965((long) this.field1717);
        int var6 = 0;
        while (this.field1715 < 256) {
            var6++;
            this.field1715 += this.field1720;
        }
        this.field1715 &= 0xFF;
        return var6;
    }
}
