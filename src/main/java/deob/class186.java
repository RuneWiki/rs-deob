package deob;

@ObfuscatedName("gq")
public class class186 {

    @ObfuscatedName("gq.i")
    public class123 field3001 = new class123((byte[]) null);

    @ObfuscatedName("gq.h")
    public int field2998;

    @ObfuscatedName("gq.e")
    public int[] field2999;

    @ObfuscatedName("gq.g")
    public int[] field3000;

    @ObfuscatedName("gq.n")
    public int[] field3010;

    @ObfuscatedName("gq.u")
    public int[] field3009;

    @ObfuscatedName("gq.d")
    public int field2997;

    @ObfuscatedName("gq.m")
    public long field3005;

    @ObfuscatedName("gq.j")
    public static final byte[] field3006 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class186() {
    }

    public class186(byte[] arg0) {
        this.method3351(arg0);
    }

    @ObfuscatedName("gq.i([B)V")
    public void method3351(byte[] arg0) {
        this.field3001.field2049 = arg0;
        this.field3001.field2046 = 10;
        int var2 = this.field3001.method2406();
        this.field2998 = this.field3001.method2406();
        this.field2997 = 500000;
        this.field2999 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3001.method2409();
            int var5 = this.field3001.method2409();
            if (var4 == 1297379947) {
                this.field2999[var3] = this.field3001.field2046;
                var3++;
            }
            this.field3001.field2046 += var5;
        }
        this.field3005 = 0L;
        this.field3000 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3000[var6] = this.field2999[var6];
        }
        this.field3010 = new int[var2];
        this.field3009 = new int[var2];
    }

    @ObfuscatedName("gq.h()V")
    public void method3349() {
        this.field3001.field2049 = null;
        this.field2999 = null;
        this.field3000 = null;
        this.field3010 = null;
        this.field3009 = null;
    }

    @ObfuscatedName("gq.e()Z")
    public boolean method3384() {
        return this.field3001.field2049 != null;
    }

    @ObfuscatedName("gq.g()I")
    public int method3353() {
        return this.field3000.length;
    }

    @ObfuscatedName("gq.n(I)V")
    public void method3400(int arg0) {
        this.field3001.field2046 = this.field3000[arg0];
    }

    @ObfuscatedName("gq.u(I)V")
    public void method3355(int arg0) {
        this.field3000[arg0] = this.field3001.field2046;
    }

    @ObfuscatedName("gq.d()V")
    public void method3356() {
        this.field3001.field2046 = -1;
    }

    @ObfuscatedName("gq.l(I)V")
    public void method3357(int arg0) {
        int var2 = this.field3001.method2476();
        this.field3010[arg0] += var2;
    }

    @ObfuscatedName("gq.m(I)I")
    public int method3358(int arg0) {
        return this.method3359(arg0);
    }

    @ObfuscatedName("gq.j(I)I")
    public int method3359(int arg0) {
        byte var2 = this.field3001.field2049[this.field3001.field2046];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3009[arg0] = var3;
            this.field3001.field2046++;
        } else {
            var3 = this.field3009[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3360(arg0, var3);
        }
        int var4 = this.field3001.method2476();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3001.field2049[this.field3001.field2046] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3001.field2046++;
                this.field3009[arg0] = var5;
                return this.method3360(arg0, var5);
            }
        }
        this.field3001.field2046 += var4;
        return 0;
    }

    @ObfuscatedName("gq.y(II)I")
    public int method3360(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3006[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3001.method2404() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3001.method2404() << 16;
            }
            return var8;
        }
        int var3 = this.field3001.method2404();
        int var4 = this.field3001.method2476();
        if (var3 == 47) {
            this.field3001.field2046 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3001.method2408();
            var4 -= 3;
            int var6 = this.field3010[arg0];
            this.field3005 += (long) (this.field2997 - var5) * (long) var6;
            this.field2997 = var5;
            this.field3001.field2046 += var4;
            return 2;
        } else {
            this.field3001.field2046 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gq.s(I)J")
    public long method3383(int arg0) {
        return (long) this.field2997 * (long) arg0 + this.field3005;
    }

    @ObfuscatedName("gq.p()I")
    public int method3362() {
        int var1 = this.field3000.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3000[var4] >= 0 && this.field3010[var4] < var3) {
                var2 = var4;
                var3 = this.field3010[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gq.v()Z")
    public boolean method3354() {
        int var1 = this.field3000.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3000[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gq.r(J)V")
    public void method3363(long arg0) {
        this.field3005 = arg0;
        int var3 = this.field3000.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3010[var4] = 0;
            this.field3009[var4] = 0;
            this.field3001.field2046 = this.field2999[var4];
            this.method3357(var4);
            this.field3000[var4] = this.field3001.field2046;
        }
    }
}
