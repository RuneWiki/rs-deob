package deob;

@ObfuscatedName("fc")
public class class165 extends class171 {

    @ObfuscatedName("fc.z")
    public long[] field1994 = new long[10];

    @ObfuscatedName("fc.n")
    public int field1993 = 256;

    @ObfuscatedName("fc.v")
    public int field1995 = 1;

    @ObfuscatedName("fc.u")
    public long field1998 = class297.method502();

    @ObfuscatedName("fc.r")
    public int field1997 = 0;

    @ObfuscatedName("fc.p")
    public int field1996;

    public class165() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1994[var1] = this.field1998;
        }
    }

    @ObfuscatedName("fc.z(B)V")
    public void method3114() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1994[var1] = 0L;
        }
    }

    @ObfuscatedName("fc.n(III)I")
    public int method3115(int arg0, int arg1) {
        int var3 = this.field1993;
        int var4 = this.field1995;
        this.field1993 = 300;
        this.field1995 = 1;
        this.field1998 = class297.method502();
        if (this.field1994[this.field1996] == 0L) {
            this.field1993 = var3;
            this.field1995 = var4;
        } else if (this.field1998 > this.field1994[this.field1996]) {
            this.field1993 = (int) ((long) (arg0 * 2560) / (this.field1998 - this.field1994[this.field1996]));
        }
        if (this.field1993 < 25) {
            this.field1993 = 25;
        }
        if (this.field1993 > 256) {
            this.field1993 = 256;
            this.field1995 = (int) ((long) arg0 - (this.field1998 - this.field1994[this.field1996]) / 10L);
        }
        if (this.field1995 > arg0) {
            this.field1995 = arg0;
        }
        this.field1994[this.field1996] = this.field1998;
        this.field1996 = (this.field1996 + 1) % 10;
        if (this.field1995 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1994[var5] != 0L) {
                    this.field1994[var5] += (long) this.field1995;
                }
            }
        }
        if (this.field1995 < arg1) {
            this.field1995 = arg1;
        }
        long var6 = (long) this.field1995;
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
        while (this.field1997 < 256) {
            var13++;
            this.field1997 += this.field1993;
        }
        this.field1997 &= 0xFF;
        return var13;
    }
}
