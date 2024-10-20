package deob;

@ObfuscatedName("lr")
public class class309 {

    @ObfuscatedName("lr.at")
    public class501 field3443 = new class501((byte[]) null);

    @ObfuscatedName("lr.an")
    public int field3439;

    @ObfuscatedName("lr.av")
    public int[] field3444;

    @ObfuscatedName("lr.as")
    public int[] field3441;

    @ObfuscatedName("lr.ax")
    public int[] field3442;

    @ObfuscatedName("lr.ap")
    public int[] field3447;

    @ObfuscatedName("lr.ab")
    public int field3438;

    @ObfuscatedName("lr.ae")
    public long field3440;

    @ObfuscatedName("lr.af")
    public static final byte[] field3446 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @ObfuscatedName("lr.at([B)V")
    public void method5331(byte[] arg0) {
        this.field3443.field5016 = arg0;
        this.field3443.field5017 = 10;
        int var2 = this.field3443.method8195();
        this.field3439 = this.field3443.method8195();
        this.field3438 = 500000;
        this.field3444 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3443.method8134();
            int var5 = this.field3443.method8134();
            if (var4 == 1297379947) {
                this.field3444[var3] = this.field3443.field5017;
                var3++;
            }
            this.field3443.field5017 += var5;
        }
        this.field3440 = 0L;
        this.field3441 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3441[var6] = this.field3444[var6];
        }
        this.field3442 = new int[var2];
        this.field3447 = new int[var2];
    }

    @ObfuscatedName("lr.an()V")
    public void method5301() {
        this.field3443.field5016 = null;
        this.field3444 = null;
        this.field3441 = null;
        this.field3442 = null;
        this.field3447 = null;
    }

    @ObfuscatedName("lr.av()Z")
    public boolean method5302() {
        return this.field3443.field5016 != null;
    }

    @ObfuscatedName("lr.as()I")
    public int method5303() {
        return this.field3441.length;
    }

    @ObfuscatedName("lr.ax(I)V")
    public void method5310(int arg0) {
        this.field3443.field5017 = this.field3441[arg0];
    }

    @ObfuscatedName("lr.ap(I)V")
    public void method5305(int arg0) {
        this.field3441[arg0] = this.field3443.field5017;
    }

    @ObfuscatedName("lr.ab()V")
    public void method5347() {
        this.field3443.field5017 = -1;
    }

    @ObfuscatedName("lr.ak(I)V")
    public void method5342(int arg0) {
        int var2 = this.field3443.method8149();
        this.field3442[arg0] += var2;
    }

    @ObfuscatedName("lr.ae(I)I")
    public int method5308(int arg0) {
        return this.method5324(arg0);
    }

    @ObfuscatedName("lr.af(I)I")
    public int method5324(int arg0) {
        byte var2 = this.field3443.field5016[this.field3443.field5017];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3447[arg0] = var3;
            this.field3443.field5017++;
        } else {
            var3 = this.field3447[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5306(arg0, var3);
        }
        int var4 = this.field3443.method8149();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3443.field5016[this.field3443.field5017] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3443.field5017++;
                this.field3447[arg0] = var5;
                return this.method5306(arg0, var5);
            }
        }
        this.field3443.field5017 += var4;
        return 0;
    }

    @ObfuscatedName("lr.ao(II)I")
    public int method5306(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3446[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3443.method8129() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3443.method8129() << 16;
            }
            return var8;
        }
        int var3 = this.field3443.method8129();
        int var4 = this.field3443.method8149();
        if (var3 == 47) {
            this.field3443.field5017 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3443.method8133();
            var4 -= 3;
            int var6 = this.field3442[arg0];
            this.field3440 += (long) (this.field3438 - var5) * (long) var6;
            this.field3438 = var5;
            this.field3443.field5017 += var4;
            return 2;
        } else {
            this.field3443.field5017 += var4;
            return 3;
        }
    }

    @ObfuscatedName("lr.aa(I)J")
    public long method5327(int arg0) {
        return (long) this.field3438 * (long) arg0 + this.field3440;
    }

    @ObfuscatedName("lr.aj()I")
    public int method5300() {
        int var1 = this.field3441.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3441[var4] >= 0 && this.field3442[var4] < var3) {
                var2 = var4;
                var3 = this.field3442[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("lr.ad()Z")
    public boolean method5339() {
        int var1 = this.field3441.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3441[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("lr.ac(J)V")
    public void method5314(long arg0) {
        this.field3440 = arg0;
        int var3 = this.field3441.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3442[var4] = 0;
            this.field3447[var4] = 0;
            this.field3443.field5017 = this.field3444[var4];
            this.method5342(var4);
            this.field3441[var4] = this.field3443.field5017;
        }
    }
}
