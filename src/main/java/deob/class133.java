package deob;

@ObfuscatedName("ek")
public class class133 extends class135 {

    @ObfuscatedName("ek.v")
    public long[] field1520 = new long[10];

    @ObfuscatedName("ek.n")
    public int field1516 = 256;

    @ObfuscatedName("ek.f")
    public int field1518 = 1;

    @ObfuscatedName("ek.y")
    public long field1517 = class380.method2744();

    @ObfuscatedName("ek.p")
    public int field1519 = 0;

    @ObfuscatedName("ek.j")
    public int field1515;

    public class133() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1520[var1] = this.field1517;
        }
    }

    @ObfuscatedName("ek.v(I)V")
    public void method2285() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1520[var1] = 0L;
        }
    }

    @ObfuscatedName("ek.n(III)I")
    public int method2286(int arg0, int arg1) {
        int var3 = this.field1516;
        int var4 = this.field1518;
        this.field1516 = 300;
        this.field1518 = 1;
        this.field1517 = class380.method2744();
        if (this.field1520[this.field1515] == 0L) {
            this.field1516 = var3;
            this.field1518 = var4;
        } else if (this.field1517 > this.field1520[this.field1515]) {
            this.field1516 = (int) ((long) (arg0 * 2560) / (this.field1517 - this.field1520[this.field1515]));
        }
        if (this.field1516 < 25) {
            this.field1516 = 25;
        }
        if (this.field1516 > 256) {
            this.field1516 = 256;
            this.field1518 = (int) ((long) arg0 - (this.field1517 - this.field1520[this.field1515]) / 10L);
        }
        if (this.field1518 > arg0) {
            this.field1518 = arg0;
        }
        this.field1520[this.field1515] = this.field1517;
        this.field1515 = (this.field1515 + 1) % 10;
        if (this.field1518 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1520[var5] != 0L) {
                    this.field1520[var5] += (long) this.field1518;
                }
            }
        }
        if (this.field1518 < arg1) {
            this.field1518 = arg1;
        }
        long var6 = (long) this.field1518;
        if (var6 > 0L) {
            if (var6 % 10L == 0L) {
                long var8 = var6 - 1L;
                try {
                    Thread.sleep(var8);
                } catch (InterruptedException var16) {
                }
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException var15) {
                }
            } else {
                try {
                    Thread.sleep(var6);
                } catch (InterruptedException var14) {
                }
            }
        }
        int var13 = 0;
        while (this.field1519 < 256) {
            var13++;
            this.field1519 += this.field1516;
        }
        this.field1519 &= 0xFF;
        return var13;
    }
}
