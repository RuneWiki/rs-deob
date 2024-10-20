package deob;

@ObfuscatedName("fg")
public class class158 extends class168 {

    @ObfuscatedName("fg.a")
    public long[] field2006 = new long[10];

    @ObfuscatedName("fg.s")
    public int field1998 = 256;

    @ObfuscatedName("fg.g")
    public int field1999 = 1;

    @ObfuscatedName("fg.x")
    public long field2000 = class192.method183();

    @ObfuscatedName("fg.h")
    public int field2007 = 0;

    @ObfuscatedName("fg.f")
    public int field2002;

    public class158() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2006[var1] = this.field2000;
        }
    }

    @ObfuscatedName("fg.a(B)V")
    public void method3180() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2006[var1] = 0L;
        }
    }

    @ObfuscatedName("fg.s(III)I")
    public int method3183(int arg0, int arg1) {
        int var3 = this.field1998;
        int var4 = this.field1999;
        this.field1998 = 300;
        this.field1999 = 1;
        this.field2000 = class192.method183();
        if (this.field2006[this.field2002] == 0L) {
            this.field1998 = var3;
            this.field1999 = var4;
        } else if (this.field2000 > this.field2006[this.field2002]) {
            this.field1998 = (int) ((long) (arg0 * 2560) / (this.field2000 - this.field2006[this.field2002]));
        }
        if (this.field1998 < 25) {
            this.field1998 = 25;
        }
        if (this.field1998 > 256) {
            this.field1998 = 256;
            this.field1999 = (int) ((long) arg0 - (this.field2000 - this.field2006[this.field2002]) / 10L);
        }
        if (this.field1999 > arg0) {
            this.field1999 = arg0;
        }
        this.field2006[this.field2002] = this.field2000;
        this.field2002 = (this.field2002 + 1) % 10;
        if (this.field1999 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2006[var5] != 0L) {
                    this.field2006[var5] += (long) this.field1999;
                }
            }
        }
        if (this.field1999 < arg1) {
            this.field1999 = arg1;
        }
        class199.method3774((long) this.field1999);
        int var6 = 0;
        while (this.field2007 < 256) {
            var6++;
            this.field2007 += this.field1998;
        }
        this.field2007 &= 0xFF;
        return var6;
    }
}
