package deob;

@ObfuscatedName("gn")
public class class208 {

    @ObfuscatedName("gn.j")
    public class175 field2568 = new class175((byte[]) null);

    @ObfuscatedName("gn.h")
    public int field2577;

    @ObfuscatedName("gn.f")
    public int[] field2566;

    @ObfuscatedName("gn.p")
    public int[] field2575;

    @ObfuscatedName("gn.x")
    public int[] field2573;

    @ObfuscatedName("gn.g")
    public int[] field2569;

    @ObfuscatedName("gn.c")
    public int field2570;

    @ObfuscatedName("gn.w")
    public long field2564;

    @ObfuscatedName("gn.b")
    public static final byte[] field2565 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class208() {
    }

    public class208(byte[] arg0) {
        this.method3519(arg0);
    }

    @ObfuscatedName("gn.j([B)V")
    public void method3519(byte[] arg0) {
        this.field2568.field2390 = arg0;
        this.field2568.field2394 = 10;
        int var2 = this.field2568.method3023();
        this.field2577 = this.field2568.method3023();
        this.field2570 = 500000;
        this.field2566 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2568.method2908();
            int var5 = this.field2568.method2908();
            if (var4 == 1297379947) {
                this.field2566[var3] = this.field2568.field2394;
                var3++;
            }
            this.field2568.field2394 += var5;
        }
        this.field2564 = 0L;
        this.field2575 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2575[var6] = this.field2566[var6];
        }
        this.field2573 = new int[var2];
        this.field2569 = new int[var2];
    }

    @ObfuscatedName("gn.h()V")
    public void method3525() {
        this.field2568.field2390 = null;
        this.field2566 = null;
        this.field2575 = null;
        this.field2573 = null;
        this.field2569 = null;
    }

    @ObfuscatedName("gn.f()Z")
    public boolean method3553() {
        return this.field2568.field2390 != null;
    }

    @ObfuscatedName("gn.p()I")
    public int method3550() {
        return this.field2575.length;
    }

    @ObfuscatedName("gn.x(I)V")
    public void method3523(int arg0) {
        this.field2568.field2394 = this.field2575[arg0];
    }

    @ObfuscatedName("gn.g(I)V")
    public void method3524(int arg0) {
        this.field2575[arg0] = this.field2568.field2394;
    }

    @ObfuscatedName("gn.c()V")
    public void method3546() {
        this.field2568.field2394 = -1;
    }

    @ObfuscatedName("gn.l(I)V")
    public void method3521(int arg0) {
        int var2 = this.field2568.method2919();
        this.field2573[arg0] += var2;
    }

    @ObfuscatedName("gn.w(I)I")
    public int method3568(int arg0) {
        return this.method3527(arg0);
    }

    @ObfuscatedName("gn.b(I)I")
    public int method3527(int arg0) {
        byte var2 = this.field2568.field2390[this.field2568.field2394];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2569[arg0] = var3;
            this.field2568.field2394++;
        } else {
            var3 = this.field2569[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3526(arg0, var3);
        }
        int var4 = this.field2568.method2919();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2568.field2390[this.field2568.field2394] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2568.field2394++;
                this.field2569[arg0] = var5;
                return this.method3526(arg0, var5);
            }
        }
        this.field2568.field2394 += var4;
        return 0;
    }

    @ObfuscatedName("gn.o(II)I")
    public int method3526(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2565[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2568.method2903() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2568.method2903() << 16;
            }
            return var8;
        }
        int var3 = this.field2568.method2903();
        int var4 = this.field2568.method2919();
        if (var3 == 47) {
            this.field2568.field2394 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2568.method3070();
            var4 -= 3;
            int var6 = this.field2573[arg0];
            this.field2564 += (long) (this.field2570 - var5) * (long) var6;
            this.field2570 = var5;
            this.field2568.field2394 += var4;
            return 2;
        } else {
            this.field2568.field2394 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gn.m(I)J")
    public long method3529(int arg0) {
        return (long) this.field2570 * (long) arg0 + this.field2564;
    }

    @ObfuscatedName("gn.e()I")
    public int method3530() {
        int var1 = this.field2575.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2575[var4] >= 0 && this.field2573[var4] < var3) {
                var2 = var4;
                var3 = this.field2573[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gn.a()Z")
    public boolean method3540() {
        int var1 = this.field2575.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2575[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gn.v(J)V")
    public void method3532(long arg0) {
        this.field2564 = arg0;
        int var3 = this.field2575.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2573[var4] = 0;
            this.field2569[var4] = 0;
            this.field2568.field2394 = this.field2566[var4];
            this.method3521(var4);
            this.field2575[var4] = this.field2568.field2394;
        }
    }
}
