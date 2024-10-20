package deob;

@ObfuscatedName("fd")
public class class164 extends class174 {

    @ObfuscatedName("fd.m")
    public long[] field2001 = new long[10];

    @ObfuscatedName("fd.f")
    public int field1995 = 256;

    @ObfuscatedName("fd.q")
    public int field1996 = 1;

    @ObfuscatedName("fd.w")
    public long field1994 = class204.method3658();

    @ObfuscatedName("fd.o")
    public int field2002 = 0;

    @ObfuscatedName("fd.u")
    public int field1999;

    public class164() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2001[var1] = this.field1994;
        }
    }

    @ObfuscatedName("fd.m(B)V")
    public void method3112() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2001[var1] = 0L;
        }
    }

    @ObfuscatedName("fd.f(III)I")
    public int method3111(int arg0, int arg1) {
        int var3 = this.field1995;
        int var4 = this.field1996;
        this.field1995 = 300;
        this.field1996 = 1;
        this.field1994 = class204.method3658();
        if (this.field2001[this.field1999] == 0L) {
            this.field1995 = var3;
            this.field1996 = var4;
        } else if (this.field1994 > this.field2001[this.field1999]) {
            this.field1995 = (int) ((long) (arg0 * 2560) / (this.field1994 - this.field2001[this.field1999]));
        }
        if (this.field1995 < 25) {
            this.field1995 = 25;
        }
        if (this.field1995 > 256) {
            this.field1995 = 256;
            this.field1996 = (int) ((long) arg0 - (this.field1994 - this.field2001[this.field1999]) / 10L);
        }
        if (this.field1996 > arg0) {
            this.field1996 = arg0;
        }
        this.field2001[this.field1999] = this.field1994;
        this.field1999 = (this.field1999 + 1) % 10;
        if (this.field1996 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2001[var5] != 0L) {
                    this.field2001[var5] += (long) this.field1996;
                }
            }
        }
        if (this.field1996 < arg1) {
            this.field1996 = arg1;
        }
        class211.method3659((long) this.field1996);
        int var6 = 0;
        while (this.field2002 < 256) {
            var6++;
            this.field2002 += this.field1995;
        }
        this.field2002 &= 0xFF;
        return var6;
    }
}
