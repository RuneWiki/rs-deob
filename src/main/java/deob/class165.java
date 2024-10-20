package deob;

@ObfuscatedName("fe")
public class class165 extends class171 {

    @ObfuscatedName("fe.q")
    public long[] field2012 = new long[10];

    @ObfuscatedName("fe.w")
    public int field2015 = 256;

    @ObfuscatedName("fe.e")
    public int field2014 = 1;

    @ObfuscatedName("fe.p")
    public long field2013 = class298.method3576();

    @ObfuscatedName("fe.k")
    public int field2016 = 0;

    @ObfuscatedName("fe.l")
    public int field2017;

    public class165() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2012[var1] = this.field2013;
        }
    }

    @ObfuscatedName("fe.q(I)V")
    public void method3163() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2012[var1] = 0L;
        }
    }

    @ObfuscatedName("fe.w(III)I")
    public int method3165(int arg0, int arg1) {
        int var3 = this.field2015;
        int var4 = this.field2014;
        this.field2015 = 300;
        this.field2014 = 1;
        this.field2013 = class298.method3576();
        if (this.field2012[this.field2017] == 0L) {
            this.field2015 = var3;
            this.field2014 = var4;
        } else if (this.field2013 > this.field2012[this.field2017]) {
            this.field2015 = (int) ((long) (arg0 * 2560) / (this.field2013 - this.field2012[this.field2017]));
        }
        if (this.field2015 < 25) {
            this.field2015 = 25;
        }
        if (this.field2015 > 256) {
            this.field2015 = 256;
            this.field2014 = (int) ((long) arg0 - (this.field2013 - this.field2012[this.field2017]) / 10L);
        }
        if (this.field2014 > arg0) {
            this.field2014 = arg0;
        }
        this.field2012[this.field2017] = this.field2013;
        this.field2017 = (this.field2017 + 1) % 10;
        if (this.field2014 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2012[var5] != 0L) {
                    this.field2012[var5] += (long) this.field2014;
                }
            }
        }
        if (this.field2014 < arg1) {
            this.field2014 = arg1;
        }
        class299.method4167((long) this.field2014);
        int var6 = 0;
        while (this.field2016 < 256) {
            var6++;
            this.field2016 += this.field2015;
        }
        this.field2016 &= 0xFF;
        return var6;
    }
}
