package deob;

@ObfuscatedName("hc")
public class class210 {

    @ObfuscatedName("hc.x")
    public class310 field2482 = new class310((byte[]) null);

    @ObfuscatedName("hc.m")
    public int field2476;

    @ObfuscatedName("hc.k")
    public int[] field2470;

    @ObfuscatedName("hc.d")
    public int[] field2473;

    @ObfuscatedName("hc.w")
    public int[] field2477;

    @ObfuscatedName("hc.v")
    public int[] field2475;

    @ObfuscatedName("hc.q")
    public int field2472;

    @ObfuscatedName("hc.t")
    public long field2478;

    @ObfuscatedName("hc.e")
    public static final byte[] field2479 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class210() {
    }

    public class210(byte[] arg0) {
        this.method3589(arg0);
    }

    @ObfuscatedName("hc.x([B)V")
    public void method3589(byte[] arg0) {
        this.field2482.field3710 = arg0;
        this.field2482.field3711 = 10;
        int var2 = this.field2482.method5139();
        this.field2476 = this.field2482.method5139();
        this.field2472 = 500000;
        this.field2470 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2482.method5142();
            int var5 = this.field2482.method5142();
            if (var4 == 1297379947) {
                this.field2470[var3] = this.field2482.field3711;
                var3++;
            }
            this.field2482.field3711 += var5;
        }
        this.field2478 = 0L;
        this.field2473 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2473[var6] = this.field2470[var6];
        }
        this.field2477 = new int[var2];
        this.field2475 = new int[var2];
    }

    @ObfuscatedName("hc.m()V")
    public void method3594() {
        this.field2482.field3710 = null;
        this.field2470 = null;
        this.field2473 = null;
        this.field2477 = null;
        this.field2475 = null;
    }

    @ObfuscatedName("hc.k()Z")
    public boolean method3579() {
        return this.field2482.field3710 != null;
    }

    @ObfuscatedName("hc.d()I")
    public int method3580() {
        return this.field2473.length;
    }

    @ObfuscatedName("hc.w(I)V")
    public void method3581(int arg0) {
        this.field2482.field3711 = this.field2473[arg0];
    }

    @ObfuscatedName("hc.v(I)V")
    public void method3618(int arg0) {
        this.field2473[arg0] = this.field2482.field3711;
    }

    @ObfuscatedName("hc.q()V")
    public void method3583() {
        this.field2482.field3711 = -1;
    }

    @ObfuscatedName("hc.z(I)V")
    public void method3584(int arg0) {
        int var2 = this.field2482.method5161();
        this.field2477[arg0] += var2;
    }

    @ObfuscatedName("hc.t(I)I")
    public int method3585(int arg0) {
        return this.method3582(arg0);
    }

    @ObfuscatedName("hc.e(I)I")
    public int method3582(int arg0) {
        byte var2 = this.field2482.field3710[this.field2482.field3711];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2475[arg0] = var3;
            this.field2482.field3711++;
        } else {
            var3 = this.field2475[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3587(arg0, var3);
        }
        int var4 = this.field2482.method5161();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2482.field3710[this.field2482.field3711] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2482.field3711++;
                this.field2475[arg0] = var5;
                return this.method3587(arg0, var5);
            }
        }
        this.field2482.field3711 += var4;
        return 0;
    }

    @ObfuscatedName("hc.s(II)I")
    public int method3587(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2479[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2482.method5137() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2482.method5137() << 16;
            }
            return var8;
        }
        int var3 = this.field2482.method5137();
        int var4 = this.field2482.method5161();
        if (var3 == 47) {
            this.field2482.field3711 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2482.method5264();
            var4 -= 3;
            int var6 = this.field2477[arg0];
            this.field2478 += (long) (this.field2472 - var5) * (long) var6;
            this.field2472 = var5;
            this.field2482.field3711 += var4;
            return 2;
        } else {
            this.field2482.field3711 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hc.p(I)J")
    public long method3588(int arg0) {
        return (long) this.field2472 * (long) arg0 + this.field2478;
    }

    @ObfuscatedName("hc.n()I")
    public int method3576() {
        int var1 = this.field2473.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2473[var4] >= 0 && this.field2477[var4] < var3) {
                var2 = var4;
                var3 = this.field2477[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hc.u()Z")
    public boolean method3590() {
        int var1 = this.field2473.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2473[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hc.h(J)V")
    public void method3591(long arg0) {
        this.field2478 = arg0;
        int var3 = this.field2473.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2477[var4] = 0;
            this.field2475[var4] = 0;
            this.field2482.field3711 = this.field2470[var4];
            this.method3584(var4);
            this.field2473[var4] = this.field2482.field3711;
        }
    }
}
