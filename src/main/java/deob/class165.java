package deob;

@ObfuscatedName("fy")
public class class165 extends class171 {

    @ObfuscatedName("fy.f")
    public long[] field2006 = new long[10];

    @ObfuscatedName("fy.i")
    public int field2000 = 256;

    @ObfuscatedName("fy.y")
    public int field1999 = 1;

    @ObfuscatedName("fy.w")
    public long field1997 = class297.method481();

    @ObfuscatedName("fy.p")
    public int field1998 = 0;

    @ObfuscatedName("fy.b")
    public int field2002;

    public class165() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2006[var1] = this.field1997;
        }
    }

    @ObfuscatedName("fy.f(B)V")
    public void method3150() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2006[var1] = 0L;
        }
    }

    @ObfuscatedName("fy.i(III)I")
    public int method3151(int arg0, int arg1) {
        int var3 = this.field2000;
        int var4 = this.field1999;
        this.field2000 = 300;
        this.field1999 = 1;
        this.field1997 = class297.method481();
        if (this.field2006[this.field2002] == 0L) {
            this.field2000 = var3;
            this.field1999 = var4;
        } else if (this.field1997 > this.field2006[this.field2002]) {
            this.field2000 = (int) ((long) (arg0 * 2560) / (this.field1997 - this.field2006[this.field2002]));
        }
        if (this.field2000 < 25) {
            this.field2000 = 25;
        }
        if (this.field2000 > 256) {
            this.field2000 = 256;
            this.field1999 = (int) ((long) arg0 - (this.field1997 - this.field2006[this.field2002]) / 10L);
        }
        if (this.field1999 > arg0) {
            this.field1999 = arg0;
        }
        this.field2006[this.field2002] = this.field1997;
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
        class298.method3743((long) this.field1999);
        int var6 = 0;
        while (this.field1998 < 256) {
            var6++;
            this.field1998 += this.field2000;
        }
        this.field1998 &= 0xFF;
        return var6;
    }
}
