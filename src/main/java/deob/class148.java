package deob;

@ObfuscatedName("eo")
public class class148 extends class150 {

    @ObfuscatedName("eo.i")
    public long[] field1582 = new long[10];

    @ObfuscatedName("eo.w")
    public int field1586 = 256;

    @ObfuscatedName("eo.s")
    public int field1584 = 1;

    @ObfuscatedName("eo.a")
    public long field1585 = class398.method2381();

    @ObfuscatedName("eo.o")
    public int field1583 = 0;

    @ObfuscatedName("eo.g")
    public int field1587;

    public class148() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1582[var1] = this.field1585;
        }
    }

    @ObfuscatedName("eo.i(I)V")
    public void method2560() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1582[var1] = 0L;
        }
    }

    @ObfuscatedName("eo.w(III)I")
    public int method2562(int arg0, int arg1) {
        int var3 = this.field1586;
        int var4 = this.field1584;
        this.field1586 = 300;
        this.field1584 = 1;
        this.field1585 = class398.method2381();
        if (this.field1582[this.field1587] == 0L) {
            this.field1586 = var3;
            this.field1584 = var4;
        } else if (this.field1585 > this.field1582[this.field1587]) {
            this.field1586 = (int) ((long) (arg0 * 2560) / (this.field1585 - this.field1582[this.field1587]));
        }
        if (this.field1586 < 25) {
            this.field1586 = 25;
        }
        if (this.field1586 > 256) {
            this.field1586 = 256;
            this.field1584 = (int) ((long) arg0 - (this.field1585 - this.field1582[this.field1587]) / 10L);
        }
        if (this.field1584 > arg0) {
            this.field1584 = arg0;
        }
        this.field1582[this.field1587] = this.field1585;
        this.field1587 = (this.field1587 + 1) % 10;
        if (this.field1584 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1582[var5] != 0L) {
                    this.field1582[var5] += (long) this.field1584;
                }
            }
        }
        if (this.field1584 < arg1) {
            this.field1584 = arg1;
        }
        class399.method2872((long) this.field1584);
        int var6 = 0;
        while (this.field1583 < 256) {
            var6++;
            this.field1583 += this.field1586;
        }
        this.field1583 &= 0xFF;
        return var6;
    }
}
