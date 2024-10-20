package deob;

@ObfuscatedName("ea")
public class class148 extends class150 {

    @ObfuscatedName("ea.n")
    public long[] field1582 = new long[10];

    @ObfuscatedName("ea.c")
    public int field1581 = 256;

    @ObfuscatedName("ea.m")
    public int field1583 = 1;

    @ObfuscatedName("ea.k")
    public long field1585 = class397.method3986();

    @ObfuscatedName("ea.o")
    public int field1584 = 0;

    @ObfuscatedName("ea.g")
    public int field1586;

    public class148() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1582[var1] = this.field1585;
        }
    }

    @ObfuscatedName("ea.n(I)V")
    public void method2502() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1582[var1] = 0L;
        }
    }

    @ObfuscatedName("ea.c(III)I")
    public int method2503(int arg0, int arg1) {
        int var3 = this.field1581;
        int var4 = this.field1583;
        this.field1581 = 300;
        this.field1583 = 1;
        this.field1585 = class397.method3986();
        if (this.field1582[this.field1586] == 0L) {
            this.field1581 = var3;
            this.field1583 = var4;
        } else if (this.field1585 > this.field1582[this.field1586]) {
            this.field1581 = (int) ((long) (arg0 * 2560) / (this.field1585 - this.field1582[this.field1586]));
        }
        if (this.field1581 < 25) {
            this.field1581 = 25;
        }
        if (this.field1581 > 256) {
            this.field1581 = 256;
            this.field1583 = (int) ((long) arg0 - (this.field1585 - this.field1582[this.field1586]) / 10L);
        }
        if (this.field1583 > arg0) {
            this.field1583 = arg0;
        }
        this.field1582[this.field1586] = this.field1585;
        this.field1586 = (this.field1586 + 1) % 10;
        if (this.field1583 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1582[var5] != 0L) {
                    this.field1582[var5] += (long) this.field1583;
                }
            }
        }
        if (this.field1583 < arg1) {
            this.field1583 = arg1;
        }
        class398.method4655((long) this.field1583);
        int var6 = 0;
        while (this.field1584 < 256) {
            var6++;
            this.field1584 += this.field1581;
        }
        this.field1584 &= 0xFF;
        return var6;
    }
}
