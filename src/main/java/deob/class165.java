package deob;

@ObfuscatedName("fg")
public class class165 extends class171 {

    @ObfuscatedName("fg.s")
    public long[] field2003 = new long[10];

    @ObfuscatedName("fg.j")
    public int field2000 = 256;

    @ObfuscatedName("fg.i")
    public int field2001 = 1;

    @ObfuscatedName("fg.k")
    public long field2004 = class297.method4369();

    @ObfuscatedName("fg.u")
    public int field2002 = 0;

    @ObfuscatedName("fg.n")
    public int field1999;

    public class165() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2003[var1] = this.field2004;
        }
    }

    @ObfuscatedName("fg.s(I)V")
    public void method3170() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2003[var1] = 0L;
        }
    }

    @ObfuscatedName("fg.j(III)I")
    public int method3173(int arg0, int arg1) {
        int var3 = this.field2000;
        int var4 = this.field2001;
        this.field2000 = 300;
        this.field2001 = 1;
        this.field2004 = class297.method4369();
        if (this.field2003[this.field1999] == 0L) {
            this.field2000 = var3;
            this.field2001 = var4;
        } else if (this.field2004 > this.field2003[this.field1999]) {
            this.field2000 = (int) ((long) (arg0 * 2560) / (this.field2004 - this.field2003[this.field1999]));
        }
        if (this.field2000 < 25) {
            this.field2000 = 25;
        }
        if (this.field2000 > 256) {
            this.field2000 = 256;
            this.field2001 = (int) ((long) arg0 - (this.field2004 - this.field2003[this.field1999]) / 10L);
        }
        if (this.field2001 > arg0) {
            this.field2001 = arg0;
        }
        this.field2003[this.field1999] = this.field2004;
        this.field1999 = (this.field1999 + 1) % 10;
        if (this.field2001 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2003[var5] != 0L) {
                    this.field2003[var5] += (long) this.field2001;
                }
            }
        }
        if (this.field2001 < arg1) {
            this.field2001 = arg1;
        }
        class298.method4739((long) this.field2001);
        int var6 = 0;
        while (this.field2002 < 256) {
            var6++;
            this.field2002 += this.field2000;
        }
        this.field2002 &= 0xFF;
        return var6;
    }
}
