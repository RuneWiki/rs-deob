package deob;

@ObfuscatedName("fj")
public class class165 extends class171 {

    @ObfuscatedName("fj.c")
    public long[] field2012 = new long[10];

    @ObfuscatedName("fj.t")
    public int field2010 = 256;

    @ObfuscatedName("fj.o")
    public int field2009 = 1;

    @ObfuscatedName("fj.e")
    public long field2014 = Statics.method184();

    @ObfuscatedName("fj.i")
    public int field2013 = 0;

    @ObfuscatedName("fj.g")
    public int field2015;

    public class165() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2012[var1] = this.field2014;
        }
    }

    @ObfuscatedName("fj.c(B)V")
    public void method3223() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2012[var1] = 0L;
        }
    }

    @ObfuscatedName("fj.t(III)I")
    public int method3222(int arg0, int arg1) {
        int var3 = this.field2010;
        int var4 = this.field2009;
        this.field2010 = 300;
        this.field2009 = 1;
        this.field2014 = Statics.method184();
        if (this.field2012[this.field2015] == 0L) {
            this.field2010 = var3;
            this.field2009 = var4;
        } else if (this.field2014 > this.field2012[this.field2015]) {
            this.field2010 = (int) ((long) (arg0 * 2560) / (this.field2014 - this.field2012[this.field2015]));
        }
        if (this.field2010 < 25) {
            this.field2010 = 25;
        }
        if (this.field2010 > 256) {
            this.field2010 = 256;
            this.field2009 = (int) ((long) arg0 - (this.field2014 - this.field2012[this.field2015]) / 10L);
        }
        if (this.field2009 > arg0) {
            this.field2009 = arg0;
        }
        this.field2012[this.field2015] = this.field2014;
        this.field2015 = (this.field2015 + 1) % 10;
        if (this.field2009 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2012[var5] != 0L) {
                    this.field2012[var5] += (long) this.field2009;
                }
            }
        }
        if (this.field2009 < arg1) {
            this.field2009 = arg1;
        }
        class299.method4884((long) this.field2009);
        int var6 = 0;
        while (this.field2013 < 256) {
            var6++;
            this.field2013 += this.field2010;
        }
        this.field2013 &= 0xFF;
        return var6;
    }
}
