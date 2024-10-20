package deob;

@ObfuscatedName("my")
public class class337 {

    @ObfuscatedName("my.ac")
    public class551 field3672 = new class551((byte[]) null);

    @ObfuscatedName("my.ae")
    public int field3663;

    @ObfuscatedName("my.ag")
    public int[] field3664;

    @ObfuscatedName("my.am")
    public int[] field3665;

    @ObfuscatedName("my.ax")
    public int[] field3670;

    @ObfuscatedName("my.aq")
    public int[] field3667;

    @ObfuscatedName("my.af")
    public int field3668;

    @ObfuscatedName("my.au")
    public long field3669;

    @ObfuscatedName("my.ar")
    public static final byte[] field3671 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @ObfuscatedName("my.ac([B)V")
    public void method5997(byte[] arg0) {
        this.field3672.field5413 = arg0;
        this.field3672.field5415 = 10;
        int var2 = this.field3672.method9119();
        this.field3663 = this.field3672.method9119();
        this.field3668 = 500000;
        this.field3664 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3672.method9110();
            int var5 = this.field3672.method9110();
            if (var4 == 1297379947) {
                this.field3664[var3] = this.field3672.field5415;
                var3++;
            }
            this.field3672.field5415 += var5;
        }
        this.field3669 = 0L;
        this.field3665 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3665[var6] = this.field3664[var6];
        }
        this.field3670 = new int[var2];
        this.field3667 = new int[var2];
    }

    @ObfuscatedName("my.ae()V")
    public void method5966() {
        this.field3672.field5413 = null;
        this.field3664 = null;
        this.field3665 = null;
        this.field3670 = null;
        this.field3667 = null;
    }

    @ObfuscatedName("my.ag()Z")
    public boolean method5984() {
        return this.field3672.field5413 != null;
    }

    @ObfuscatedName("my.am()I")
    public int method5968() {
        return this.field3665.length;
    }

    @ObfuscatedName("my.ax(I)V")
    public void method5969(int arg0) {
        this.field3672.field5415 = this.field3665[arg0];
    }

    @ObfuscatedName("my.aq(I)V")
    public void method5970(int arg0) {
        this.field3665[arg0] = this.field3672.field5415;
    }

    @ObfuscatedName("my.af()V")
    public void method5971() {
        this.field3672.field5415 = -1;
    }

    @ObfuscatedName("my.at(I)V")
    public void method5972(int arg0) {
        int var2 = this.field3672.method8994();
        this.field3670[arg0] += var2;
    }

    @ObfuscatedName("my.au(I)I")
    public int method5973(int arg0) {
        return this.method5974(arg0);
    }

    @ObfuscatedName("my.ar(I)I")
    public int method5974(int arg0) {
        byte var2 = this.field3672.field5413[this.field3672.field5415];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3667[arg0] = var3;
            this.field3672.field5415++;
        } else {
            var3 = this.field3667[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5975(arg0, var3);
        }
        int var4 = this.field3672.method8994();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3672.field5413[this.field3672.field5415] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3672.field5415++;
                this.field3667[arg0] = var5;
                return this.method5975(arg0, var5);
            }
        }
        this.field3672.field5415 += var4;
        return 0;
    }

    @ObfuscatedName("my.al(II)I")
    public int method5975(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3671[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3672.method8955() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3672.method8955() << 16;
            }
            return var8;
        }
        int var3 = this.field3672.method8955();
        int var4 = this.field3672.method8994();
        if (var3 == 47) {
            this.field3672.field5415 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3672.method8978();
            var4 -= 3;
            int var6 = this.field3670[arg0];
            this.field3669 += (long) (this.field3668 - var5) * (long) var6;
            this.field3668 = var5;
            this.field3672.field5415 += var4;
            return 2;
        } else {
            this.field3672.field5415 += var4;
            return 3;
        }
    }

    @ObfuscatedName("my.ad(I)J")
    public long method5976(int arg0) {
        return (long) this.field3668 * (long) arg0 + this.field3669;
    }

    @ObfuscatedName("my.ah()I")
    public int method6000() {
        int var1 = this.field3665.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3665[var4] >= 0 && this.field3670[var4] < var3) {
                var2 = var4;
                var3 = this.field3670[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("my.ap()Z")
    public boolean method5978() {
        int var1 = this.field3665.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3665[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("my.ab(J)V")
    public void method5979(long arg0) {
        this.field3669 = arg0;
        int var3 = this.field3665.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3670[var4] = 0;
            this.field3667[var4] = 0;
            this.field3672.field5415 = this.field3664[var4];
            this.method5972(var4);
            this.field3665[var4] = this.field3672.field5415;
        }
    }
}
