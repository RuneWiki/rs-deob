package deob;

@ObfuscatedName("mx")
public class class319 {

    @ObfuscatedName("mx.at")
    public class527 field3462 = new class527((byte[]) null);

    @ObfuscatedName("mx.ah")
    public int field3459;

    @ObfuscatedName("mx.ar")
    public int[] field3460;

    @ObfuscatedName("mx.ao")
    public int[] field3461;

    @ObfuscatedName("mx.ab")
    public int[] field3471;

    @ObfuscatedName("mx.au")
    public int[] field3463;

    @ObfuscatedName("mx.aa")
    public int field3465;

    @ObfuscatedName("mx.al")
    public long field3464;

    @ObfuscatedName("mx.az")
    public static final byte[] field3467 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @ObfuscatedName("mx.at([B)V")
    public void method5558(byte[] arg0) {
        this.field3462.field5140 = arg0;
        this.field3462.field5137 = 10;
        int var2 = this.field3462.method8412();
        this.field3459 = this.field3462.method8412();
        this.field3465 = 500000;
        this.field3460 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3462.method8416();
            int var5 = this.field3462.method8416();
            if (var4 == 1297379947) {
                this.field3460[var3] = this.field3462.field5137;
                var3++;
            }
            this.field3462.field5137 += var5;
        }
        this.field3464 = 0L;
        this.field3461 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3461[var6] = this.field3460[var6];
        }
        this.field3471 = new int[var2];
        this.field3463 = new int[var2];
    }

    @ObfuscatedName("mx.ah()V")
    public void method5522() {
        this.field3462.field5140 = null;
        this.field3460 = null;
        this.field3461 = null;
        this.field3471 = null;
        this.field3463 = null;
    }

    @ObfuscatedName("mx.ar()Z")
    public boolean method5516() {
        return this.field3462.field5140 != null;
    }

    @ObfuscatedName("mx.ao()I")
    public int method5536() {
        return this.field3461.length;
    }

    @ObfuscatedName("mx.ab(I)V")
    public void method5538(int arg0) {
        this.field3462.field5137 = this.field3461[arg0];
    }

    @ObfuscatedName("mx.au(I)V")
    public void method5514(int arg0) {
        this.field3461[arg0] = this.field3462.field5137;
    }

    @ObfuscatedName("mx.aa()V")
    public void method5519() {
        this.field3462.field5137 = -1;
    }

    @ObfuscatedName("mx.ac(I)V")
    public void method5520(int arg0) {
        int var2 = this.field3462.method8431();
        this.field3471[arg0] += var2;
    }

    @ObfuscatedName("mx.al(I)I")
    public int method5513(int arg0) {
        return this.method5539(arg0);
    }

    @ObfuscatedName("mx.az(I)I")
    public int method5539(int arg0) {
        byte var2 = this.field3462.field5140[this.field3462.field5137];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3463[arg0] = var3;
            this.field3462.field5137++;
        } else {
            var3 = this.field3463[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5523(arg0, var3);
        }
        int var4 = this.field3462.method8431();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3462.field5140[this.field3462.field5137] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3462.field5137++;
                this.field3463[arg0] = var5;
                return this.method5523(arg0, var5);
            }
        }
        this.field3462.field5137 += var4;
        return 0;
    }

    @ObfuscatedName("mx.ap(II)I")
    public int method5523(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3467[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3462.method8410() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3462.method8410() << 16;
            }
            return var8;
        }
        int var3 = this.field3462.method8410();
        int var4 = this.field3462.method8431();
        if (var3 == 47) {
            this.field3462.field5137 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3462.method8414();
            var4 -= 3;
            int var6 = this.field3471[arg0];
            this.field3464 += (long) (this.field3465 - var5) * (long) var6;
            this.field3465 = var5;
            this.field3462.field5137 += var4;
            return 2;
        } else {
            this.field3462.field5137 += var4;
            return 3;
        }
    }

    @ObfuscatedName("mx.av(I)J")
    public long method5524(int arg0) {
        return (long) this.field3465 * (long) arg0 + this.field3464;
    }

    @ObfuscatedName("mx.ax()I")
    public int method5521() {
        int var1 = this.field3461.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3461[var4] >= 0 && this.field3471[var4] < var3) {
                var2 = var4;
                var3 = this.field3471[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("mx.as()Z")
    public boolean method5526() {
        int var1 = this.field3461.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3461[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("mx.ay(J)V")
    public void method5527(long arg0) {
        this.field3464 = arg0;
        int var3 = this.field3461.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3471[var4] = 0;
            this.field3463[var4] = 0;
            this.field3462.field5137 = this.field3460[var4];
            this.method5520(var4);
            this.field3461[var4] = this.field3462.field5137;
        }
    }
}
