package deob;

@ObfuscatedName("ev")
public class class135 extends class137 {

    @ObfuscatedName("ev.s")
    public long[] field1502 = new long[10];

    @ObfuscatedName("ev.t")
    public int field1500 = 256;

    @ObfuscatedName("ev.v")
    public int field1501 = 1;

    @ObfuscatedName("ev.j")
    public long field1503 = class382.method2013();

    @ObfuscatedName("ev.l")
    public int field1505 = 0;

    @ObfuscatedName("ev.n")
    public int field1504;

    public class135() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1502[var1] = this.field1503;
        }
    }

    @ObfuscatedName("ev.s(I)V")
    public void method2281() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1502[var1] = 0L;
        }
    }

    @ObfuscatedName("ev.t(III)I")
    public int method2283(int arg0, int arg1) {
        int var3 = this.field1500;
        int var4 = this.field1501;
        this.field1500 = 300;
        this.field1501 = 1;
        this.field1503 = class382.method2013();
        if (this.field1502[this.field1504] == 0L) {
            this.field1500 = var3;
            this.field1501 = var4;
        } else if (this.field1503 > this.field1502[this.field1504]) {
            this.field1500 = (int) ((long) (arg0 * 2560) / (this.field1503 - this.field1502[this.field1504]));
        }
        if (this.field1500 < 25) {
            this.field1500 = 25;
        }
        if (this.field1500 > 256) {
            this.field1500 = 256;
            this.field1501 = (int) ((long) arg0 - (this.field1503 - this.field1502[this.field1504]) / 10L);
        }
        if (this.field1501 > arg0) {
            this.field1501 = arg0;
        }
        this.field1502[this.field1504] = this.field1503;
        this.field1504 = (this.field1504 + 1) % 10;
        if (this.field1501 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1502[var5] != 0L) {
                    this.field1502[var5] += (long) this.field1501;
                }
            }
        }
        if (this.field1501 < arg1) {
            this.field1501 = arg1;
        }
        class383.method3882((long) this.field1501);
        int var6 = 0;
        while (this.field1505 < 256) {
            var6++;
            this.field1505 += this.field1500;
        }
        this.field1505 &= 0xFF;
        return var6;
    }
}
