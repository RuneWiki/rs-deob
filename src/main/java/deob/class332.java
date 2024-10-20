package deob;

@ObfuscatedName("mx")
public class class332 {

    @ObfuscatedName("mx.ak")
    public class546 field3629 = new class546((byte[]) null);

    @ObfuscatedName("mx.al")
    public int field3623;

    @ObfuscatedName("mx.aj")
    public int[] field3624;

    @ObfuscatedName("mx.az")
    public int[] field3634;

    @ObfuscatedName("mx.af")
    public int[] field3626;

    @ObfuscatedName("mx.aa")
    public int[] field3627;

    @ObfuscatedName("mx.at")
    public int field3628;

    @ObfuscatedName("mx.ac")
    public long field3630;

    @ObfuscatedName("mx.ao")
    public static final byte[] field3631 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @ObfuscatedName("mx.ak([B)V")
    public void method5800(byte[] arg0) {
        this.field3629.field5346 = arg0;
        this.field3629.field5344 = 10;
        int var2 = this.field3629.method8798();
        this.field3623 = this.field3629.method8798();
        this.field3628 = 500000;
        this.field3624 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3629.method8801();
            int var5 = this.field3629.method8801();
            if (var4 == 1297379947) {
                this.field3624[var3] = this.field3629.field5344;
                var3++;
            }
            this.field3629.field5344 += var5;
        }
        this.field3630 = 0L;
        this.field3634 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3634[var6] = this.field3624[var6];
        }
        this.field3626 = new int[var2];
        this.field3627 = new int[var2];
    }

    @ObfuscatedName("mx.al()V")
    public void method5794() {
        this.field3629.field5346 = null;
        this.field3624 = null;
        this.field3634 = null;
        this.field3626 = null;
        this.field3627 = null;
    }

    @ObfuscatedName("mx.aj()Z")
    public boolean method5783() {
        return this.field3629.field5346 != null;
    }

    @ObfuscatedName("mx.az()I")
    public int method5784() {
        return this.field3634.length;
    }

    @ObfuscatedName("mx.af(I)V")
    public void method5785(int arg0) {
        this.field3629.field5344 = this.field3634[arg0];
    }

    @ObfuscatedName("mx.aa(I)V")
    public void method5786(int arg0) {
        this.field3634[arg0] = this.field3629.field5344;
    }

    @ObfuscatedName("mx.at()V")
    public void method5808() {
        this.field3629.field5344 = -1;
    }

    @ObfuscatedName("mx.ab(I)V")
    public void method5782(int arg0) {
        int var2 = this.field3629.method8815();
        this.field3626[arg0] += var2;
    }

    @ObfuscatedName("mx.ac(I)I")
    public int method5788(int arg0) {
        return this.method5789(arg0);
    }

    @ObfuscatedName("mx.ao(I)I")
    public int method5789(int arg0) {
        byte var2 = this.field3629.field5346[this.field3629.field5344];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3627[arg0] = var3;
            this.field3629.field5344++;
        } else {
            var3 = this.field3627[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5807(arg0, var3);
        }
        int var4 = this.field3629.method8815();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3629.field5346[this.field3629.field5344] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3629.field5344++;
                this.field3627[arg0] = var5;
                return this.method5807(arg0, var5);
            }
        }
        this.field3629.field5344 += var4;
        return 0;
    }

    @ObfuscatedName("mx.ah(II)I")
    public int method5807(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3631[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3629.method8796() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3629.method8796() << 16;
            }
            return var8;
        }
        int var3 = this.field3629.method8796();
        int var4 = this.field3629.method8815();
        if (var3 == 47) {
            this.field3629.field5344 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3629.method8790();
            var4 -= 3;
            int var6 = this.field3626[arg0];
            this.field3630 += (long) (this.field3628 - var5) * (long) var6;
            this.field3628 = var5;
            this.field3629.field5344 += var4;
            return 2;
        } else {
            this.field3629.field5344 += var4;
            return 3;
        }
    }

    @ObfuscatedName("mx.av(I)J")
    public long method5781(int arg0) {
        return (long) this.field3628 * (long) arg0 + this.field3630;
    }

    @ObfuscatedName("mx.aq()I")
    public int method5792() {
        int var1 = this.field3634.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3634[var4] >= 0 && this.field3626[var4] < var3) {
                var2 = var4;
                var3 = this.field3626[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("mx.ap()Z")
    public boolean method5816() {
        int var1 = this.field3634.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3634[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("mx.ae(J)V")
    public void method5809(long arg0) {
        this.field3630 = arg0;
        int var3 = this.field3634.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3626[var4] = 0;
            this.field3627[var4] = 0;
            this.field3629.field5344 = this.field3624[var4];
            this.method5782(var4);
            this.field3634[var4] = this.field3629.field5344;
        }
    }
}
