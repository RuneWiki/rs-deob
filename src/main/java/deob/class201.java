package deob;

@ObfuscatedName("gg")
public class class201 {

    @ObfuscatedName("gg.c")
    public class301 field2472 = new class301((byte[]) null);

    @ObfuscatedName("gg.t")
    public int field2470;

    @ObfuscatedName("gg.o")
    public int[] field2471;

    @ObfuscatedName("gg.e")
    public int[] field2476;

    @ObfuscatedName("gg.i")
    public int[] field2473;

    @ObfuscatedName("gg.g")
    public int[] field2474;

    @ObfuscatedName("gg.d")
    public int field2475;

    @ObfuscatedName("gg.j")
    public long field2477;

    @ObfuscatedName("gg.m")
    public static final byte[] field2478 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class201() {
    }

    public class201(byte[] arg0) {
        this.method3555(arg0);
    }

    @ObfuscatedName("gg.c([B)V")
    public void method3555(byte[] arg0) {
        this.field2472.field3708 = arg0;
        this.field2472.field3707 = 10;
        int var2 = this.field2472.method5124();
        this.field2470 = this.field2472.method5124();
        this.field2475 = 500000;
        this.field2471 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2472.method5134();
            int var5 = this.field2472.method5134();
            if (var4 == 1297379947) {
                this.field2471[var3] = this.field2472.field3707;
                var3++;
            }
            this.field2472.field3707 += var5;
        }
        this.field2477 = 0L;
        this.field2476 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2476[var6] = this.field2471[var6];
        }
        this.field2473 = new int[var2];
        this.field2474 = new int[var2];
    }

    @ObfuscatedName("gg.t()V")
    public void method3556() {
        this.field2472.field3708 = null;
        this.field2471 = null;
        this.field2476 = null;
        this.field2473 = null;
        this.field2474 = null;
    }

    @ObfuscatedName("gg.o()Z")
    public boolean method3569() {
        return this.field2472.field3708 != null;
    }

    @ObfuscatedName("gg.e()I")
    public int method3557() {
        return this.field2476.length;
    }

    @ObfuscatedName("gg.i(I)V")
    public void method3558(int arg0) {
        this.field2472.field3707 = this.field2476[arg0];
    }

    @ObfuscatedName("gg.g(I)V")
    public void method3585(int arg0) {
        this.field2476[arg0] = this.field2472.field3707;
    }

    @ObfuscatedName("gg.d()V")
    public void method3560() {
        this.field2472.field3707 = -1;
    }

    @ObfuscatedName("gg.l(I)V")
    public void method3561(int arg0) {
        int var2 = this.field2472.method5205();
        this.field2473[arg0] += var2;
    }

    @ObfuscatedName("gg.j(I)I")
    public int method3559(int arg0) {
        return this.method3583(arg0);
    }

    @ObfuscatedName("gg.m(I)I")
    public int method3583(int arg0) {
        byte var2 = this.field2472.field3708[this.field2472.field3707];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2474[arg0] = var3;
            this.field2472.field3707++;
        } else {
            var3 = this.field2474[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3564(arg0, var3);
        }
        int var4 = this.field2472.method5205();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2472.field3708[this.field2472.field3707] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2472.field3707++;
                this.field2474[arg0] = var5;
                return this.method3564(arg0, var5);
            }
        }
        this.field2472.field3707 += var4;
        return 0;
    }

    @ObfuscatedName("gg.p(II)I")
    public int method3564(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2478[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2472.method5129() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2472.method5129() << 16;
            }
            return var8;
        }
        int var3 = this.field2472.method5129();
        int var4 = this.field2472.method5205();
        if (var3 == 47) {
            this.field2472.field3707 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2472.method5133();
            var4 -= 3;
            int var6 = this.field2473[arg0];
            this.field2477 += (long) (this.field2475 - var5) * (long) var6;
            this.field2475 = var5;
            this.field2472.field3707 += var4;
            return 2;
        } else {
            this.field2472.field3707 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gg.h(I)J")
    public long method3567(int arg0) {
        return (long) this.field2475 * (long) arg0 + this.field2477;
    }

    @ObfuscatedName("gg.v()I")
    public int method3566() {
        int var1 = this.field2476.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2476[var4] >= 0 && this.field2473[var4] < var3) {
                var2 = var4;
                var3 = this.field2473[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gg.n()Z")
    public boolean method3563() {
        int var1 = this.field2476.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2476[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gg.x(J)V")
    public void method3568(long arg0) {
        this.field2477 = arg0;
        int var3 = this.field2476.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2473[var4] = 0;
            this.field2474[var4] = 0;
            this.field2472.field3707 = this.field2471[var4];
            this.method3561(var4);
            this.field2476[var4] = this.field2472.field3707;
        }
    }
}
