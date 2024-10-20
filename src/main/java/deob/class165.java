package deob;

@ObfuscatedName("fg")
public class class165 extends class171 {

    @ObfuscatedName("fg.a")
    public long[] field1999 = new long[10];

    @ObfuscatedName("fg.t")
    public int field1996 = 256;

    @ObfuscatedName("fg.n")
    public int field1997 = 1;

    @ObfuscatedName("fg.q")
    public long field1998 = class297.method3777();

    @ObfuscatedName("fg.v")
    public int field2000 = 0;

    @ObfuscatedName("fg.l")
    public int field2001;

    public class165() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1999[var1] = this.field1998;
        }
    }

    @ObfuscatedName("fg.a(I)V")
    public void method3253() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1999[var1] = 0L;
        }
    }

    @ObfuscatedName("fg.t(III)I")
    public int method3250(int arg0, int arg1) {
        int var3 = this.field1996;
        int var4 = this.field1997;
        this.field1996 = 300;
        this.field1997 = 1;
        this.field1998 = class297.method3777();
        if (this.field1999[this.field2001] == 0L) {
            this.field1996 = var3;
            this.field1997 = var4;
        } else if (this.field1998 > this.field1999[this.field2001]) {
            this.field1996 = (int) ((long) (arg0 * 2560) / (this.field1998 - this.field1999[this.field2001]));
        }
        if (this.field1996 < 25) {
            this.field1996 = 25;
        }
        if (this.field1996 > 256) {
            this.field1996 = 256;
            this.field1997 = (int) ((long) arg0 - (this.field1998 - this.field1999[this.field2001]) / 10L);
        }
        if (this.field1997 > arg0) {
            this.field1997 = arg0;
        }
        this.field1999[this.field2001] = this.field1998;
        this.field2001 = (this.field2001 + 1) % 10;
        if (this.field1997 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1999[var5] != 0L) {
                    this.field1999[var5] += (long) this.field1997;
                }
            }
        }
        if (this.field1997 < arg1) {
            this.field1997 = arg1;
        }
        Statics.method4888((long) this.field1997);
        int var6 = 0;
        while (this.field2000 < 256) {
            var6++;
            this.field2000 += this.field1996;
        }
        this.field2000 &= 0xFF;
        return var6;
    }
}
