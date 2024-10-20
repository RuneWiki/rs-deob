package deob;

@ObfuscatedName("ff")
public class class164 extends class167 {

    @ObfuscatedName("ff.c")
    public long[] field1789 = new long[10];

    @ObfuscatedName("ff.v")
    public int field1788 = 256;

    @ObfuscatedName("ff.q")
    public int field1790 = 1;

    @ObfuscatedName("ff.f")
    public long field1795 = class269.method2567();

    @ObfuscatedName("ff.j")
    public int field1792 = 0;

    @ObfuscatedName("ff.e")
    public int field1793;

    public class164() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1789[var1] = this.field1795;
        }
    }

    @ObfuscatedName("ff.c(I)V")
    public void method2871() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1789[var1] = 0L;
        }
    }

    @ObfuscatedName("ff.v(IIB)I")
    public int method2872(int arg0, int arg1) {
        int var3 = this.field1788;
        int var4 = this.field1790;
        this.field1788 = 300;
        this.field1790 = 1;
        this.field1795 = class269.method2567();
        if (this.field1789[this.field1793] == 0L) {
            this.field1788 = var3;
            this.field1790 = var4;
        } else if (this.field1795 > this.field1789[this.field1793]) {
            this.field1788 = (int) ((long) (arg0 * 2560) / (this.field1795 - this.field1789[this.field1793]));
        }
        if (this.field1788 < 25) {
            this.field1788 = 25;
        }
        if (this.field1788 > 256) {
            this.field1788 = 256;
            this.field1790 = (int) ((long) arg0 - (this.field1795 - this.field1789[this.field1793]) / 10L);
        }
        if (this.field1790 > arg0) {
            this.field1790 = arg0;
        }
        this.field1789[this.field1793] = this.field1795;
        this.field1793 = (this.field1793 + 1) % 10;
        if (this.field1790 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1789[var5] != 0L) {
                    this.field1789[var5] += (long) this.field1790;
                }
            }
        }
        if (this.field1790 < arg1) {
            this.field1790 = arg1;
        }
        class270.method1896((long) this.field1790);
        int var6 = 0;
        while (this.field1792 < 256) {
            var6++;
            this.field1792 += this.field1788;
        }
        this.field1792 &= 0xFF;
        return var6;
    }
}
