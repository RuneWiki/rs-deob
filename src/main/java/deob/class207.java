package deob;

@ObfuscatedName("gk")
public class class207 {

    @ObfuscatedName("gk.a")
    public class174 field2565 = new class174((byte[]) null);

    @ObfuscatedName("gk.j")
    public int field2566;

    @ObfuscatedName("gk.n")
    public int[] field2567;

    @ObfuscatedName("gk.r")
    public int[] field2568;

    @ObfuscatedName("gk.v")
    public int[] field2570;

    @ObfuscatedName("gk.e")
    public int[] field2575;

    @ObfuscatedName("gk.l")
    public int field2571;

    @ObfuscatedName("gk.w")
    public long field2573;

    @ObfuscatedName("gk.p")
    public static final byte[] field2574 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class207() {
    }

    public class207(byte[] arg0) {
        this.method3514(arg0);
    }

    @ObfuscatedName("gk.a([B)V")
    public void method3514(byte[] arg0) {
        this.field2565.field2391 = arg0;
        this.field2565.field2394 = 10;
        int var2 = this.field2565.method2873();
        this.field2566 = this.field2565.method2873();
        this.field2571 = 500000;
        this.field2567 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2565.method2876();
            int var5 = this.field2565.method2876();
            if (var4 == 1297379947) {
                this.field2567[var3] = this.field2565.field2394;
                var3++;
            }
            this.field2565.field2394 += var5;
        }
        this.field2573 = 0L;
        this.field2568 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2568[var6] = this.field2567[var6];
        }
        this.field2570 = new int[var2];
        this.field2575 = new int[var2];
    }

    @ObfuscatedName("gk.j()V")
    public void method3546() {
        this.field2565.field2391 = null;
        this.field2567 = null;
        this.field2568 = null;
        this.field2570 = null;
        this.field2575 = null;
    }

    @ObfuscatedName("gk.n()Z")
    public boolean method3523() {
        return this.field2565.field2391 != null;
    }

    @ObfuscatedName("gk.r()I")
    public int method3517() {
        return this.field2568.length;
    }

    @ObfuscatedName("gk.v(I)V")
    public void method3518(int arg0) {
        this.field2565.field2394 = this.field2568[arg0];
    }

    @ObfuscatedName("gk.e(I)V")
    public void method3519(int arg0) {
        this.field2568[arg0] = this.field2565.field2394;
    }

    @ObfuscatedName("gk.l()V")
    public void method3520() {
        this.field2565.field2394 = -1;
    }

    @ObfuscatedName("gk.s(I)V")
    public void method3521(int arg0) {
        int var2 = this.field2565.method2887();
        this.field2570[arg0] += var2;
    }

    @ObfuscatedName("gk.w(I)I")
    public int method3556(int arg0) {
        return this.method3524(arg0);
    }

    @ObfuscatedName("gk.p(I)I")
    public int method3524(int arg0) {
        byte var2 = this.field2565.field2391[this.field2565.field2394];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2575[arg0] = var3;
            this.field2565.field2394++;
        } else {
            var3 = this.field2575[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3537(arg0, var3);
        }
        int var4 = this.field2565.method2887();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2565.field2391[this.field2565.field2394] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2565.field2394++;
                this.field2575[arg0] = var5;
                return this.method3537(arg0, var5);
            }
        }
        this.field2565.field2394 += var4;
        return 0;
    }

    @ObfuscatedName("gk.m(II)I")
    public int method3537(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2574[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2565.method2871() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2565.method2871() << 16;
            }
            return var8;
        }
        int var3 = this.field2565.method2871();
        int var4 = this.field2565.method2887();
        if (var3 == 47) {
            this.field2565.field2394 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2565.method2875();
            var4 -= 3;
            int var6 = this.field2570[arg0];
            this.field2573 += (long) (this.field2571 - var5) * (long) var6;
            this.field2571 = var5;
            this.field2565.field2394 += var4;
            return 2;
        } else {
            this.field2565.field2394 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gk.u(I)J")
    public long method3539(int arg0) {
        return (long) this.field2571 * (long) arg0 + this.field2573;
    }

    @ObfuscatedName("gk.g()I")
    public int method3538() {
        int var1 = this.field2568.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2568[var4] >= 0 && this.field2570[var4] < var3) {
                var2 = var4;
                var3 = this.field2570[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gk.k()Z")
    public boolean method3526() {
        int var1 = this.field2568.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2568[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gk.c(J)V")
    public void method3527(long arg0) {
        this.field2573 = arg0;
        int var3 = this.field2568.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2570[var4] = 0;
            this.field2575[var4] = 0;
            this.field2565.field2394 = this.field2567[var4];
            this.method3521(var4);
            this.field2568[var4] = this.field2565.field2394;
        }
    }
}
