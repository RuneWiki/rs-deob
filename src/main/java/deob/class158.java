package deob;

@ObfuscatedName("fz")
public class class158 extends class168 {

    @ObfuscatedName("fz.n")
    public long[] field1997 = new long[10];

    @ObfuscatedName("fz.h")
    public int field1998 = 256;

    @ObfuscatedName("fz.l")
    public int field1999 = 1;

    @ObfuscatedName("fz.g")
    public long field2000 = class192.method81();

    @ObfuscatedName("fz.b")
    public int field2001 = 0;

    @ObfuscatedName("fz.a")
    public int field2002;

    public class158() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1997[var1] = this.field2000;
        }
    }

    @ObfuscatedName("fz.n(I)V")
    public void method3211() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1997[var1] = 0L;
        }
    }

    @ObfuscatedName("fz.h(IIB)I")
    public int method3210(int arg0, int arg1) {
        int var3 = this.field1998;
        int var4 = this.field1999;
        this.field1998 = 300;
        this.field1999 = 1;
        this.field2000 = class192.method81();
        if (this.field1997[this.field2002] == 0L) {
            this.field1998 = var3;
            this.field1999 = var4;
        } else if (this.field2000 > this.field1997[this.field2002]) {
            this.field1998 = (int) ((long) (arg0 * 2560) / (this.field2000 - this.field1997[this.field2002]));
        }
        if (this.field1998 < 25) {
            this.field1998 = 25;
        }
        if (this.field1998 > 256) {
            this.field1998 = 256;
            this.field1999 = (int) ((long) arg0 - (this.field2000 - this.field1997[this.field2002]) / 10L);
        }
        if (this.field1999 > arg0) {
            this.field1999 = arg0;
        }
        this.field1997[this.field2002] = this.field2000;
        this.field2002 = (this.field2002 + 1) % 10;
        if (this.field1999 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1997[var5] != 0L) {
                    this.field1997[var5] += (long) this.field1999;
                }
            }
        }
        if (this.field1999 < arg1) {
            this.field1999 = arg1;
        }
        class199.method3065((long) this.field1999);
        int var6 = 0;
        while (this.field2001 < 256) {
            var6++;
            this.field2001 += this.field1998;
        }
        this.field2001 &= 0xFF;
        return var6;
    }
}
