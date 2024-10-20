package deob;

@ObfuscatedName("ei")
public class class133 extends class125 {

    @ObfuscatedName("ei.q")
    public long[] field2015 = new long[10];

    @ObfuscatedName("ei.s")
    public int field2014 = 256;

    @ObfuscatedName("ei.h")
    public int field2016 = 1;

    @ObfuscatedName("ei.e")
    public long field2017 = class107.method2434();

    @ObfuscatedName("ei.n")
    public int field2019 = 0;

    @ObfuscatedName("ei.t")
    public int field2018;

    public class133() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2015[var1] = this.field2017;
        }
    }

    @ObfuscatedName("ei.q(B)V")
    public void method2471() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2015[var1] = 0L;
        }
    }

    @ObfuscatedName("ei.s(III)I")
    public int method2475(int arg0, int arg1) {
        int var3 = this.field2014;
        int var4 = this.field2016;
        this.field2014 = 300;
        this.field2016 = 1;
        this.field2017 = class107.method2434();
        if (this.field2015[this.field2018] == 0L) {
            this.field2014 = var3;
            this.field2016 = var4;
        } else if (this.field2017 > this.field2015[this.field2018]) {
            this.field2014 = (int) ((long) (arg0 * 2560) / (this.field2017 - this.field2015[this.field2018]));
        }
        if (this.field2014 < 25) {
            this.field2014 = 25;
        }
        if (this.field2014 > 256) {
            this.field2014 = 256;
            this.field2016 = (int) ((long) arg0 - (this.field2017 - this.field2015[this.field2018]) / 10L);
        }
        if (this.field2016 > arg0) {
            this.field2016 = arg0;
        }
        this.field2015[this.field2018] = this.field2017;
        this.field2018 = (this.field2018 + 1) % 10;
        if (this.field2016 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2015[var5] != 0L) {
                    this.field2015[var5] += (long) this.field2016;
                }
            }
        }
        if (this.field2016 < arg1) {
            this.field2016 = arg1;
        }
        class119.method587((long) this.field2016);
        int var6 = 0;
        while (this.field2019 < 256) {
            var6++;
            this.field2019 += this.field2014;
        }
        this.field2019 &= 0xFF;
        return var6;
    }
}
