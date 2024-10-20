package deob;

@ObfuscatedName("hq")
public class class210 {

    @ObfuscatedName("hq.h")
    public class311 field2479 = new class311((byte[]) null);

    @ObfuscatedName("hq.v")
    public int field2488;

    @ObfuscatedName("hq.x")
    public int[] field2480;

    @ObfuscatedName("hq.w")
    public int[] field2482;

    @ObfuscatedName("hq.t")
    public int[] field2483;

    @ObfuscatedName("hq.j")
    public int[] field2484;

    @ObfuscatedName("hq.n")
    public int field2481;

    @ObfuscatedName("hq.l")
    public long field2487;

    @ObfuscatedName("hq.z")
    public static final byte[] field2485 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class210() {
    }

    public class210(byte[] arg0) {
        this.method3593(arg0);
    }

    @ObfuscatedName("hq.h([B)V")
    public void method3593(byte[] arg0) {
        this.field2479.field3753 = arg0;
        this.field2479.field3752 = 10;
        int var2 = this.field2479.method5342();
        this.field2488 = this.field2479.method5342();
        this.field2481 = 500000;
        this.field2480 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2479.method5120();
            int var5 = this.field2479.method5120();
            if (var4 == 1297379947) {
                this.field2480[var3] = this.field2479.field3752;
                var3++;
            }
            this.field2479.field3752 += var5;
        }
        this.field2487 = 0L;
        this.field2482 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2482[var6] = this.field2480[var6];
        }
        this.field2483 = new int[var2];
        this.field2484 = new int[var2];
    }

    @ObfuscatedName("hq.v()V")
    public void method3543() {
        this.field2479.field3753 = null;
        this.field2480 = null;
        this.field2482 = null;
        this.field2483 = null;
        this.field2484 = null;
    }

    @ObfuscatedName("hq.x()Z")
    public boolean method3544() {
        return this.field2479.field3753 != null;
    }

    @ObfuscatedName("hq.w()I")
    public int method3545() {
        return this.field2482.length;
    }

    @ObfuscatedName("hq.t(I)V")
    public void method3546(int arg0) {
        this.field2479.field3752 = this.field2482[arg0];
    }

    @ObfuscatedName("hq.j(I)V")
    public void method3547(int arg0) {
        this.field2482[arg0] = this.field2479.field3752;
    }

    @ObfuscatedName("hq.n()V")
    public void method3548() {
        this.field2479.field3752 = -1;
    }

    @ObfuscatedName("hq.p(I)V")
    public void method3549(int arg0) {
        int var2 = this.field2479.method5133();
        this.field2483[arg0] += var2;
    }

    @ObfuscatedName("hq.l(I)I")
    public int method3550(int arg0) {
        return this.method3551(arg0);
    }

    @ObfuscatedName("hq.z(I)I")
    public int method3551(int arg0) {
        byte var2 = this.field2479.field3753[this.field2479.field3752];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2484[arg0] = var3;
            this.field2479.field3752++;
        } else {
            var3 = this.field2484[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3552(arg0, var3);
        }
        int var4 = this.field2479.method5133();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2479.field3753[this.field2479.field3752] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2479.field3752++;
                this.field2484[arg0] = var5;
                return this.method3552(arg0, var5);
            }
        }
        this.field2479.field3752 += var4;
        return 0;
    }

    @ObfuscatedName("hq.u(II)I")
    public int method3552(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2485[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2479.method5274() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2479.method5274() << 16;
            }
            return var8;
        }
        int var3 = this.field2479.method5274();
        int var4 = this.field2479.method5133();
        if (var3 == 47) {
            this.field2479.field3752 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2479.method5119();
            var4 -= 3;
            int var6 = this.field2483[arg0];
            this.field2487 += (long) (this.field2481 - var5) * (long) var6;
            this.field2481 = var5;
            this.field2479.field3752 += var4;
            return 2;
        } else {
            this.field2479.field3752 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hq.e(I)J")
    public long method3553(int arg0) {
        return (long) this.field2481 * (long) arg0 + this.field2487;
    }

    @ObfuscatedName("hq.m()I")
    public int method3554() {
        int var1 = this.field2482.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2482[var4] >= 0 && this.field2483[var4] < var3) {
                var2 = var4;
                var3 = this.field2483[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hq.c()Z")
    public boolean method3566() {
        int var1 = this.field2482.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2482[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hq.i(J)V")
    public void method3556(long arg0) {
        this.field2487 = arg0;
        int var3 = this.field2482.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2483[var4] = 0;
            this.field2484[var4] = 0;
            this.field2479.field3752 = this.field2480[var4];
            this.method3549(var4);
            this.field2482[var4] = this.field2479.field3752;
        }
    }
}
