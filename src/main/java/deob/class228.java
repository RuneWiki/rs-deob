package deob;

@ObfuscatedName("hc")
public class class228 {

    @ObfuscatedName("hc.n")
    public class190 field2601 = new class190((byte[]) null);

    @ObfuscatedName("hc.h")
    public int field2593;

    @ObfuscatedName("hc.l")
    public int[] field2594;

    @ObfuscatedName("hc.g")
    public int[] field2595;

    @ObfuscatedName("hc.b")
    public int[] field2599;

    @ObfuscatedName("hc.a")
    public int[] field2597;

    @ObfuscatedName("hc.c")
    public int field2592;

    @ObfuscatedName("hc.j")
    public long field2600;

    @ObfuscatedName("hc.d")
    public static final byte[] field2596 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class228() {
    }

    public class228(byte[] arg0) {
        this.method4219(arg0);
    }

    @ObfuscatedName("hc.n([B)V")
    public void method4219(byte[] arg0) {
        this.field2601.field2424 = arg0;
        this.field2601.field2423 = 10;
        int var2 = this.field2601.method3513();
        this.field2593 = this.field2601.method3513();
        this.field2592 = 500000;
        this.field2594 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2601.method3562();
            int var5 = this.field2601.method3562();
            if (var4 == 1297379947) {
                this.field2594[var3] = this.field2601.field2423;
                var3++;
            }
            this.field2601.field2423 += var5;
        }
        this.field2600 = 0L;
        this.field2595 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2595[var6] = this.field2594[var6];
        }
        this.field2599 = new int[var2];
        this.field2597 = new int[var2];
    }

    @ObfuscatedName("hc.h()V")
    public void method4220() {
        this.field2601.field2424 = null;
        this.field2594 = null;
        this.field2595 = null;
        this.field2599 = null;
        this.field2597 = null;
    }

    @ObfuscatedName("hc.l()Z")
    public boolean method4225() {
        return this.field2601.field2424 != null;
    }

    @ObfuscatedName("hc.g()I")
    public int method4248() {
        return this.field2595.length;
    }

    @ObfuscatedName("hc.b(I)V")
    public void method4223(int arg0) {
        this.field2601.field2423 = this.field2595[arg0];
    }

    @ObfuscatedName("hc.a(I)V")
    public void method4224(int arg0) {
        this.field2595[arg0] = this.field2601.field2423;
    }

    @ObfuscatedName("hc.c()V")
    public void method4237() {
        this.field2601.field2423 = -1;
    }

    @ObfuscatedName("hc.z(I)V")
    public void method4226(int arg0) {
        int var2 = this.field2601.method3529();
        this.field2599[arg0] += var2;
    }

    @ObfuscatedName("hc.j(I)I")
    public int method4227(int arg0) {
        return this.method4228(arg0);
    }

    @ObfuscatedName("hc.d(I)I")
    public int method4228(int arg0) {
        byte var2 = this.field2601.field2424[this.field2601.field2423];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2597[arg0] = var3;
            this.field2601.field2423++;
        } else {
            var3 = this.field2597[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4261(arg0, var3);
        }
        int var4 = this.field2601.method3529();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2601.field2424[this.field2601.field2423] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2601.field2423++;
                this.field2597[arg0] = var5;
                return this.method4261(arg0, var5);
            }
        }
        this.field2601.field2423 += var4;
        return 0;
    }

    @ObfuscatedName("hc.i(II)I")
    public int method4261(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2596[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2601.method3511() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2601.method3511() << 16;
            }
            return var8;
        }
        int var3 = this.field2601.method3511();
        int var4 = this.field2601.method3529();
        if (var3 == 47) {
            this.field2601.field2423 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2601.method3515();
            var4 -= 3;
            int var6 = this.field2599[arg0];
            this.field2600 += (long) (this.field2592 - var5) * (long) var6;
            this.field2592 = var5;
            this.field2601.field2423 += var4;
            return 2;
        } else {
            this.field2601.field2423 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hc.m(I)J")
    public long method4266(int arg0) {
        return (long) this.field2592 * (long) arg0 + this.field2600;
    }

    @ObfuscatedName("hc.v()I")
    public int method4221() {
        int var1 = this.field2595.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2595[var4] >= 0 && this.field2599[var4] < var3) {
                var2 = var4;
                var3 = this.field2599[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hc.r()Z")
    public boolean method4231() {
        int var1 = this.field2595.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2595[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hc.x(J)V")
    public void method4232(long arg0) {
        this.field2600 = arg0;
        int var3 = this.field2595.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2599[var4] = 0;
            this.field2597[var4] = 0;
            this.field2601.field2423 = this.field2594[var4];
            this.method4226(var4);
            this.field2595[var4] = this.field2601.field2423;
        }
    }
}
