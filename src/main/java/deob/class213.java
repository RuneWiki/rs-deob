package deob;

@ObfuscatedName("hs")
public class class213 {

    @ObfuscatedName("hs.f")
    public class382 field2530 = new class382((byte[]) null);

    @ObfuscatedName("hs.o")
    public int field2527;

    @ObfuscatedName("hs.u")
    public int[] field2529;

    @ObfuscatedName("hs.p")
    public int[] field2521;

    @ObfuscatedName("hs.b")
    public int[] field2522;

    @ObfuscatedName("hs.e")
    public int[] field2523;

    @ObfuscatedName("hs.k")
    public int field2519;

    @ObfuscatedName("hs.h")
    public long field2526;

    @ObfuscatedName("hs.n")
    public static final byte[] field2520 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class213() {
    }

    public class213(byte[] arg0) {
        this.method3586(arg0);
    }

    @ObfuscatedName("hs.f([B)V")
    public void method3586(byte[] arg0) {
        this.field2530.field4153 = arg0;
        this.field2530.field4155 = 10;
        int var2 = this.field2530.method5858();
        this.field2527 = this.field2530.method5858();
        this.field2519 = 500000;
        this.field2529 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2530.method5861();
            int var5 = this.field2530.method5861();
            if (var4 == 1297379947) {
                this.field2529[var3] = this.field2530.field4155;
                var3++;
            }
            this.field2530.field4155 += var5;
        }
        this.field2526 = 0L;
        this.field2521 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2521[var6] = this.field2529[var6];
        }
        this.field2522 = new int[var2];
        this.field2523 = new int[var2];
    }

    @ObfuscatedName("hs.o()V")
    public void method3610() {
        this.field2530.field4153 = null;
        this.field2529 = null;
        this.field2521 = null;
        this.field2522 = null;
        this.field2523 = null;
    }

    @ObfuscatedName("hs.u()Z")
    public boolean method3607() {
        return this.field2530.field4153 != null;
    }

    @ObfuscatedName("hs.p()I")
    public int method3564() {
        return this.field2521.length;
    }

    @ObfuscatedName("hs.b(I)V")
    public void method3565(int arg0) {
        this.field2530.field4155 = this.field2521[arg0];
    }

    @ObfuscatedName("hs.e(I)V")
    public void method3566(int arg0) {
        this.field2521[arg0] = this.field2530.field4155;
    }

    @ObfuscatedName("hs.k()V")
    public void method3567() {
        this.field2530.field4155 = -1;
    }

    @ObfuscatedName("hs.g(I)V")
    public void method3568(int arg0) {
        int var2 = this.field2530.method5874();
        this.field2522[arg0] += var2;
    }

    @ObfuscatedName("hs.h(I)I")
    public int method3569(int arg0) {
        return this.method3570(arg0);
    }

    @ObfuscatedName("hs.n(I)I")
    public int method3570(int arg0) {
        byte var2 = this.field2530.field4153[this.field2530.field4155];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2523[arg0] = var3;
            this.field2530.field4155++;
        } else {
            var3 = this.field2523[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3576(arg0, var3);
        }
        int var4 = this.field2530.method5874();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2530.field4153[this.field2530.field4155] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2530.field4155++;
                this.field2523[arg0] = var5;
                return this.method3576(arg0, var5);
            }
        }
        this.field2530.field4155 += var4;
        return 0;
    }

    @ObfuscatedName("hs.l(II)I")
    public int method3576(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2520[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2530.method5856() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2530.method5856() << 16;
            }
            return var8;
        }
        int var3 = this.field2530.method5856();
        int var4 = this.field2530.method5874();
        if (var3 == 47) {
            this.field2530.field4155 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2530.method5875();
            var4 -= 3;
            int var6 = this.field2522[arg0];
            this.field2526 += (long) (this.field2519 - var5) * (long) var6;
            this.field2519 = var5;
            this.field2530.field4155 += var4;
            return 2;
        } else {
            this.field2530.field4155 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hs.m(I)J")
    public long method3572(int arg0) {
        return (long) this.field2519 * (long) arg0 + this.field2526;
    }

    @ObfuscatedName("hs.d()I")
    public int method3573() {
        int var1 = this.field2521.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2521[var4] >= 0 && this.field2522[var4] < var3) {
                var2 = var4;
                var3 = this.field2522[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hs.c()Z")
    public boolean method3574() {
        int var1 = this.field2521.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2521[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hs.j(J)V")
    public void method3595(long arg0) {
        this.field2526 = arg0;
        int var3 = this.field2521.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2522[var4] = 0;
            this.field2523[var4] = 0;
            this.field2530.field4155 = this.field2529[var4];
            this.method3568(var4);
            this.field2521[var4] = this.field2530.field4155;
        }
    }
}
