package deob;

@ObfuscatedName("ec")
public class class134 extends class136 {

    @ObfuscatedName("ec.f")
    public long[] field1519 = new long[10];

    @ObfuscatedName("ec.e")
    public int field1520 = 256;

    @ObfuscatedName("ec.v")
    public int field1522 = 1;

    @ObfuscatedName("ec.y")
    public long field1521 = class381.method4000();

    @ObfuscatedName("ec.j")
    public int field1523 = 0;

    @ObfuscatedName("ec.o")
    public int field1526;

    public class134() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1519[var1] = this.field1521;
        }
    }

    @ObfuscatedName("ec.f(B)V")
    public void method2316() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1519[var1] = 0L;
        }
    }

    @ObfuscatedName("ec.e(IIB)I")
    public int method2318(int arg0, int arg1) {
        int var3 = this.field1520;
        int var4 = this.field1522;
        this.field1520 = 300;
        this.field1522 = 1;
        this.field1521 = class381.method4000();
        if (this.field1519[this.field1526] == 0L) {
            this.field1520 = var3;
            this.field1522 = var4;
        } else if (this.field1521 > this.field1519[this.field1526]) {
            this.field1520 = (int) ((long) (arg0 * 2560) / (this.field1521 - this.field1519[this.field1526]));
        }
        if (this.field1520 < 25) {
            this.field1520 = 25;
        }
        if (this.field1520 > 256) {
            this.field1520 = 256;
            this.field1522 = (int) ((long) arg0 - (this.field1521 - this.field1519[this.field1526]) / 10L);
        }
        if (this.field1522 > arg0) {
            this.field1522 = arg0;
        }
        this.field1519[this.field1526] = this.field1521;
        this.field1526 = (this.field1526 + 1) % 10;
        if (this.field1522 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1519[var5] != 0L) {
                    this.field1519[var5] += (long) this.field1522;
                }
            }
        }
        if (this.field1522 < arg1) {
            this.field1522 = arg1;
        }
        class382.method169((long) this.field1522);
        int var6 = 0;
        while (this.field1523 < 256) {
            var6++;
            this.field1523 += this.field1520;
        }
        this.field1523 &= 0xFF;
        return var6;
    }
}
