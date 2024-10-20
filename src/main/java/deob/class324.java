package deob;

@ObfuscatedName("md")
public class class324 {

    @ObfuscatedName("md.az")
    public class535 field3538 = new class535((byte[]) null);

    @ObfuscatedName("md.ah")
    public int field3540;

    @ObfuscatedName("md.af")
    public int[] field3539;

    @ObfuscatedName("md.at")
    public int[] field3550;

    @ObfuscatedName("md.an")
    public int[] field3543;

    @ObfuscatedName("md.ao")
    public int[] field3537;

    @ObfuscatedName("md.ab")
    public int field3545;

    @ObfuscatedName("md.ad")
    public long field3542;

    @ObfuscatedName("md.al")
    public static final byte[] field3546 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @ObfuscatedName("md.az([B)V")
    public void method5555(byte[] arg0) {
        this.field3538.field5231 = arg0;
        this.field3538.field5233 = 10;
        int var2 = this.field3538.method8670();
        this.field3540 = this.field3538.method8670();
        this.field3545 = 500000;
        this.field3539 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3538.method8682();
            int var5 = this.field3538.method8682();
            if (var4 == 1297379947) {
                this.field3539[var3] = this.field3538.field5233;
                var3++;
            }
            this.field3538.field5233 += var5;
        }
        this.field3542 = 0L;
        this.field3550 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3550[var6] = this.field3539[var6];
        }
        this.field3543 = new int[var2];
        this.field3537 = new int[var2];
    }

    @ObfuscatedName("md.ah()V")
    public void method5556() {
        this.field3538.field5231 = null;
        this.field3539 = null;
        this.field3550 = null;
        this.field3543 = null;
        this.field3537 = null;
    }

    @ObfuscatedName("md.af()Z")
    public boolean method5596() {
        return this.field3538.field5231 != null;
    }

    @ObfuscatedName("md.at()I")
    public int method5558() {
        return this.field3550.length;
    }

    @ObfuscatedName("md.an(I)V")
    public void method5554(int arg0) {
        this.field3538.field5233 = this.field3550[arg0];
    }

    @ObfuscatedName("md.ao(I)V")
    public void method5576(int arg0) {
        this.field3550[arg0] = this.field3538.field5233;
    }

    @ObfuscatedName("md.ab()V")
    public void method5561() {
        this.field3538.field5233 = -1;
    }

    @ObfuscatedName("md.aw(I)V")
    public void method5564(int arg0) {
        int var2 = this.field3538.method8483();
        this.field3543[arg0] += var2;
    }

    @ObfuscatedName("md.ad(I)I")
    public int method5586(int arg0) {
        return this.method5559(arg0);
    }

    @ObfuscatedName("md.al(I)I")
    public int method5559(int arg0) {
        byte var2 = this.field3538.field5231[this.field3538.field5233];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3537[arg0] = var3;
            this.field3538.field5233++;
        } else {
            var3 = this.field3537[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5565(arg0, var3);
        }
        int var4 = this.field3538.method8483();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3538.field5231[this.field3538.field5233] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3538.field5233++;
                this.field3537[arg0] = var5;
                return this.method5565(arg0, var5);
            }
        }
        this.field3538.field5233 += var4;
        return 0;
    }

    @ObfuscatedName("md.as(II)I")
    public int method5565(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3546[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3538.method8462() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3538.method8462() << 16;
            }
            return var8;
        }
        int var3 = this.field3538.method8462();
        int var4 = this.field3538.method8483();
        if (var3 == 47) {
            this.field3538.field5233 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3538.method8466();
            var4 -= 3;
            int var6 = this.field3543[arg0];
            this.field3542 += (long) (this.field3545 - var5) * (long) var6;
            this.field3545 = var5;
            this.field3538.field5233 += var4;
            return 2;
        } else {
            this.field3538.field5233 += var4;
            return 3;
        }
    }

    @ObfuscatedName("md.ag(I)J")
    public long method5566(int arg0) {
        return (long) this.field3545 * (long) arg0 + this.field3542;
    }

    @ObfuscatedName("md.ai()I")
    public int method5567() {
        int var1 = this.field3550.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3550[var4] >= 0 && this.field3543[var4] < var3) {
                var2 = var4;
                var3 = this.field3543[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("md.ax()Z")
    public boolean method5568() {
        int var1 = this.field3550.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3550[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("md.ar(J)V")
    public void method5569(long arg0) {
        this.field3542 = arg0;
        int var3 = this.field3550.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3543[var4] = 0;
            this.field3537[var4] = 0;
            this.field3538.field5233 = this.field3539[var4];
            this.method5564(var4);
            this.field3550[var4] = this.field3538.field5233;
        }
    }
}
