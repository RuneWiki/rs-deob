package deob;

@ObfuscatedName("ei")
public class class133 extends class135 {

    @ObfuscatedName("ei.f")
    public long[] field1510 = new long[10];

    @ObfuscatedName("ei.o")
    public int field1503 = 256;

    @ObfuscatedName("ei.u")
    public int field1505 = 1;

    @ObfuscatedName("ei.p")
    public long field1506 = class379.method1540();

    @ObfuscatedName("ei.b")
    public int field1504 = 0;

    @ObfuscatedName("ei.e")
    public int field1507;

    public class133() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1510[var1] = this.field1506;
        }
    }

    @ObfuscatedName("ei.f(S)V")
    public void method2208() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1510[var1] = 0L;
        }
    }

    @ObfuscatedName("ei.o(III)I")
    public int method2209(int arg0, int arg1) {
        int var3 = this.field1503;
        int var4 = this.field1505;
        this.field1503 = 300;
        this.field1505 = 1;
        this.field1506 = class379.method1540();
        if (this.field1510[this.field1507] == 0L) {
            this.field1503 = var3;
            this.field1505 = var4;
        } else if (this.field1506 > this.field1510[this.field1507]) {
            this.field1503 = (int) ((long) (arg0 * 2560) / (this.field1506 - this.field1510[this.field1507]));
        }
        if (this.field1503 < 25) {
            this.field1503 = 25;
        }
        if (this.field1503 > 256) {
            this.field1503 = 256;
            this.field1505 = (int) ((long) arg0 - (this.field1506 - this.field1510[this.field1507]) / 10L);
        }
        if (this.field1505 > arg0) {
            this.field1505 = arg0;
        }
        this.field1510[this.field1507] = this.field1506;
        this.field1507 = (this.field1507 + 1) % 10;
        if (this.field1505 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1510[var5] != 0L) {
                    this.field1510[var5] += (long) this.field1505;
                }
            }
        }
        if (this.field1505 < arg1) {
            this.field1505 = arg1;
        }
        class380.method4072((long) this.field1505);
        int var6 = 0;
        while (this.field1504 < 256) {
            var6++;
            this.field1504 += this.field1503;
        }
        this.field1504 &= 0xFF;
        return var6;
    }
}
