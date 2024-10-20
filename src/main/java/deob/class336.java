package deob;

@ObfuscatedName("mc")
public class class336 {

    @ObfuscatedName("mc.ap")
    public class558 field3682 = new class558((byte[]) null);

    @ObfuscatedName("mc.aw")
    public int field3674;

    @ObfuscatedName("mc.ak")
    public int[] field3676;

    @ObfuscatedName("mc.aj")
    public int[] field3684;

    @ObfuscatedName("mc.ai")
    public int[] field3678;

    @ObfuscatedName("mc.ay")
    public int[] field3679;

    @ObfuscatedName("mc.as")
    public int field3680;

    @ObfuscatedName("mc.am")
    public long field3686;

    @ObfuscatedName("mc.at")
    public static final byte[] field3683 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @ObfuscatedName("mc.ap([B)V")
    public void method6151(byte[] arg0) {
        this.field3682.field5463 = arg0;
        this.field3682.field5462 = 10;
        int var2 = this.field3682.method9260();
        this.field3674 = this.field3682.method9260();
        this.field3680 = 500000;
        this.field3676 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3682.method9264();
            int var5 = this.field3682.method9264();
            if (var4 == 1297379947) {
                this.field3676[var3] = this.field3682.field5462;
                var3++;
            }
            this.field3682.field5462 += var5;
        }
        this.field3686 = 0L;
        this.field3684 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3684[var6] = this.field3676[var6];
        }
        this.field3678 = new int[var2];
        this.field3679 = new int[var2];
    }

    @ObfuscatedName("mc.aw()V")
    public void method6152() {
        this.field3682.field5463 = null;
        this.field3676 = null;
        this.field3684 = null;
        this.field3678 = null;
        this.field3679 = null;
    }

    @ObfuscatedName("mc.ak()Z")
    public boolean method6153() {
        return this.field3682.field5463 != null;
    }

    @ObfuscatedName("mc.aj()I")
    public int method6163() {
        return this.field3684.length;
    }

    @ObfuscatedName("mc.ai(I)V")
    public void method6175(int arg0) {
        this.field3682.field5462 = this.field3684[arg0];
    }

    @ObfuscatedName("mc.ay(I)V")
    public void method6156(int arg0) {
        this.field3684[arg0] = this.field3682.field5462;
    }

    @ObfuscatedName("mc.as()V")
    public void method6157() {
        this.field3682.field5462 = -1;
    }

    @ObfuscatedName("mc.ae(I)V")
    public void method6158(int arg0) {
        int var2 = this.field3682.method9279();
        this.field3678[arg0] += var2;
    }

    @ObfuscatedName("mc.am(I)I")
    public int method6159(int arg0) {
        return this.method6184(arg0);
    }

    @ObfuscatedName("mc.at(I)I")
    public int method6184(int arg0) {
        byte var2 = this.field3682.field5463[this.field3682.field5462];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3679[arg0] = var3;
            this.field3682.field5462++;
        } else {
            var3 = this.field3679[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method6168(arg0, var3);
        }
        int var4 = this.field3682.method9279();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3682.field5463[this.field3682.field5462] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3682.field5462++;
                this.field3679[arg0] = var5;
                return this.method6168(arg0, var5);
            }
        }
        this.field3682.field5462 += var4;
        return 0;
    }

    @ObfuscatedName("mc.au(II)I")
    public int method6168(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3683[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3682.method9258() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3682.method9258() << 16;
            }
            return var8;
        }
        int var3 = this.field3682.method9258();
        int var4 = this.field3682.method9279();
        if (var3 == 47) {
            this.field3682.field5462 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3682.method9380();
            var4 -= 3;
            int var6 = this.field3678[arg0];
            this.field3686 += (long) (this.field3680 - var5) * (long) var6;
            this.field3680 = var5;
            this.field3682.field5462 += var4;
            return 2;
        } else {
            this.field3682.field5462 += var4;
            return 3;
        }
    }

    @ObfuscatedName("mc.an(I)J")
    public long method6150(int arg0) {
        return (long) this.field3680 * (long) arg0 + this.field3686;
    }

    @ObfuscatedName("mc.ao()I")
    public int method6162() {
        int var1 = this.field3684.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3684[var4] >= 0 && this.field3678[var4] < var3) {
                var2 = var4;
                var3 = this.field3678[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("mc.af()Z")
    public boolean method6164() {
        int var1 = this.field3684.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3684[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("mc.ar(J)V")
    public void method6190(long arg0) {
        this.field3686 = arg0;
        int var3 = this.field3684.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3678[var4] = 0;
            this.field3679[var4] = 0;
            this.field3682.field5462 = this.field3676[var4];
            this.method6158(var4);
            this.field3684[var4] = this.field3682.field5462;
        }
    }
}
