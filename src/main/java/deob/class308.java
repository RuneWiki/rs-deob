package deob;

@ObfuscatedName("lq")
public class class308 {

    @ObfuscatedName("lq.au")
    public class515 field3451 = new class515((byte[]) null);

    @ObfuscatedName("lq.ae")
    public int field3447;

    @ObfuscatedName("lq.ao")
    public int[] field3452;

    @ObfuscatedName("lq.at")
    public int[] field3449;

    @ObfuscatedName("lq.ac")
    public int[] field3450;

    @ObfuscatedName("lq.ai")
    public int[] field3448;

    @ObfuscatedName("lq.az")
    public int field3455;

    @ObfuscatedName("lq.aa")
    public long field3446;

    @ObfuscatedName("lq.af")
    public static final byte[] field3454 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @ObfuscatedName("lq.au([B)V")
    public void method5404(byte[] arg0) {
        this.field3451.field5108 = arg0;
        this.field3451.field5111 = 10;
        int var2 = this.field3451.method8448();
        this.field3447 = this.field3451.method8448();
        this.field3455 = 500000;
        this.field3452 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3451.method8306();
            int var5 = this.field3451.method8306();
            if (var4 == 1297379947) {
                this.field3452[var3] = this.field3451.field5111;
                var3++;
            }
            this.field3451.field5111 += var5;
        }
        this.field3446 = 0L;
        this.field3449 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3449[var6] = this.field3452[var6];
        }
        this.field3450 = new int[var2];
        this.field3448 = new int[var2];
    }

    @ObfuscatedName("lq.ae()V")
    public void method5380() {
        this.field3451.field5108 = null;
        this.field3452 = null;
        this.field3449 = null;
        this.field3450 = null;
        this.field3448 = null;
    }

    @ObfuscatedName("lq.ao()Z")
    public boolean method5415() {
        return this.field3451.field5108 != null;
    }

    @ObfuscatedName("lq.at()I")
    public int method5383() {
        return this.field3449.length;
    }

    @ObfuscatedName("lq.ac(I)V")
    public void method5384(int arg0) {
        this.field3451.field5111 = this.field3449[arg0];
    }

    @ObfuscatedName("lq.ai(I)V")
    public void method5385(int arg0) {
        this.field3449[arg0] = this.field3451.field5111;
    }

    @ObfuscatedName("lq.az()V")
    public void method5386() {
        this.field3451.field5111 = -1;
    }

    @ObfuscatedName("lq.ap(I)V")
    public void method5387(int arg0) {
        int var2 = this.field3451.method8281();
        this.field3450[arg0] += var2;
    }

    @ObfuscatedName("lq.aa(I)I")
    public int method5388(int arg0) {
        return this.method5389(arg0);
    }

    @ObfuscatedName("lq.af(I)I")
    public int method5389(int arg0) {
        byte var2 = this.field3451.field5108[this.field3451.field5111];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3448[arg0] = var3;
            this.field3451.field5111++;
        } else {
            var3 = this.field3448[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5390(arg0, var3);
        }
        int var4 = this.field3451.method8281();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3451.field5108[this.field3451.field5111] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3451.field5111++;
                this.field3448[arg0] = var5;
                return this.method5390(arg0, var5);
            }
        }
        this.field3451.field5111 += var4;
        return 0;
    }

    @ObfuscatedName("lq.ad(II)I")
    public int method5390(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3454[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3451.method8300() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3451.method8300() << 16;
            }
            return var8;
        }
        int var3 = this.field3451.method8300();
        int var4 = this.field3451.method8281();
        if (var3 == 47) {
            this.field3451.field5111 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3451.method8466();
            var4 -= 3;
            int var6 = this.field3450[arg0];
            this.field3446 += (long) (this.field3455 - var5) * (long) var6;
            this.field3455 = var5;
            this.field3451.field5111 += var4;
            return 2;
        } else {
            this.field3451.field5111 += var4;
            return 3;
        }
    }

    @ObfuscatedName("lq.aq(I)J")
    public long method5402(int arg0) {
        return (long) this.field3455 * (long) arg0 + this.field3446;
    }

    @ObfuscatedName("lq.al()I")
    public int method5392() {
        int var1 = this.field3449.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3449[var4] >= 0 && this.field3450[var4] < var3) {
                var2 = var4;
                var3 = this.field3450[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("lq.an()Z")
    public boolean method5393() {
        int var1 = this.field3449.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3449[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("lq.ar(J)V")
    public void method5394(long arg0) {
        this.field3446 = arg0;
        int var3 = this.field3449.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3450[var4] = 0;
            this.field3448[var4] = 0;
            this.field3451.field5111 = this.field3452[var4];
            this.method5387(var4);
            this.field3449[var4] = this.field3451.field5111;
        }
    }
}
