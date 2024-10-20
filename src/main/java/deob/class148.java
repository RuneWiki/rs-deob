package deob;

@ObfuscatedName("eh")
public class class148 extends class150 {

    @ObfuscatedName("eh.l")
    public long[] field1593 = new long[10];

    @ObfuscatedName("eh.q")
    public int field1588 = 256;

    @ObfuscatedName("eh.f")
    public int field1590 = 1;

    @ObfuscatedName("eh.j")
    public long field1587 = class398.method2299();

    @ObfuscatedName("eh.m")
    public int field1591 = 0;

    @ObfuscatedName("eh.k")
    public int field1592;

    public class148() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1593[var1] = this.field1587;
        }
    }

    @ObfuscatedName("eh.l(I)V")
    public void method2542() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1593[var1] = 0L;
        }
    }

    @ObfuscatedName("eh.q(III)I")
    public int method2543(int arg0, int arg1) {
        int var3 = this.field1588;
        int var4 = this.field1590;
        this.field1588 = 300;
        this.field1590 = 1;
        this.field1587 = class398.method2299();
        if (this.field1593[this.field1592] == 0L) {
            this.field1588 = var3;
            this.field1590 = var4;
        } else if (this.field1587 > this.field1593[this.field1592]) {
            this.field1588 = (int) ((long) (arg0 * 2560) / (this.field1587 - this.field1593[this.field1592]));
        }
        if (this.field1588 < 25) {
            this.field1588 = 25;
        }
        if (this.field1588 > 256) {
            this.field1588 = 256;
            this.field1590 = (int) ((long) arg0 - (this.field1587 - this.field1593[this.field1592]) / 10L);
        }
        if (this.field1590 > arg0) {
            this.field1590 = arg0;
        }
        this.field1593[this.field1592] = this.field1587;
        this.field1592 = (this.field1592 + 1) % 10;
        if (this.field1590 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1593[var5] != 0L) {
                    this.field1593[var5] += (long) this.field1590;
                }
            }
        }
        if (this.field1590 < arg1) {
            this.field1590 = arg1;
        }
        class399.method2395((long) this.field1590);
        int var6 = 0;
        while (this.field1591 < 256) {
            var6++;
            this.field1591 += this.field1588;
        }
        this.field1591 &= 0xFF;
        return var6;
    }
}
