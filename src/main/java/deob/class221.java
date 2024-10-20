package deob;

@ObfuscatedName("hk")
public class class221 {

    @ObfuscatedName("hk.w")
    public class183 field2549 = new class183((byte[]) null);

    @ObfuscatedName("hk.m")
    public int field2541;

    @ObfuscatedName("hk.q")
    public int[] field2540;

    @ObfuscatedName("hk.b")
    public int[] field2543;

    @ObfuscatedName("hk.f")
    public int[] field2542;

    @ObfuscatedName("hk.n")
    public int[] field2546;

    @ObfuscatedName("hk.h")
    public int field2545;

    @ObfuscatedName("hk.j")
    public long field2548;

    @ObfuscatedName("hk.a")
    public static final byte[] field2544 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class221() {
    }

    public class221(byte[] arg0) {
        this.method4014(arg0);
    }

    @ObfuscatedName("hk.w([B)V")
    public void method4014(byte[] arg0) {
        this.field2549.field2366 = arg0;
        this.field2549.field2360 = 10;
        int var2 = this.field2549.method3268();
        this.field2541 = this.field2549.method3268();
        this.field2545 = 500000;
        this.field2540 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2549.method3267();
            int var5 = this.field2549.method3267();
            if (var4 == 1297379947) {
                this.field2540[var3] = this.field2549.field2360;
                var3++;
            }
            this.field2549.field2360 += var5;
        }
        this.field2548 = 0L;
        this.field2543 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2543[var6] = this.field2540[var6];
        }
        this.field2542 = new int[var2];
        this.field2546 = new int[var2];
    }

    @ObfuscatedName("hk.m()V")
    public void method4015() {
        this.field2549.field2366 = null;
        this.field2540 = null;
        this.field2543 = null;
        this.field2542 = null;
        this.field2546 = null;
    }

    @ObfuscatedName("hk.q()Z")
    public boolean method4056() {
        return this.field2549.field2366 != null;
    }

    @ObfuscatedName("hk.x()I")
    public int method4017() {
        return this.field2543.length;
    }

    @ObfuscatedName("hk.j(I)V")
    public void method4061(int arg0) {
        this.field2549.field2360 = this.field2543[arg0];
    }

    @ObfuscatedName("hk.a(I)V")
    public void method4052(int arg0) {
        this.field2543[arg0] = this.field2549.field2360;
    }

    @ObfuscatedName("hk.l()V")
    public void method4020() {
        this.field2549.field2360 = -1;
    }

    @ObfuscatedName("hk.d(I)V")
    public void method4021(int arg0) {
        int var2 = this.field2549.method3280();
        this.field2542[arg0] += var2;
    }

    @ObfuscatedName("hk.s(I)I")
    public int method4022(int arg0) {
        return this.method4023(arg0);
    }

    @ObfuscatedName("hk.p(I)I")
    public int method4023(int arg0) {
        byte var2 = this.field2549.field2366[this.field2549.field2360];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2546[arg0] = var3;
            this.field2549.field2360++;
        } else {
            var3 = this.field2546[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4024(arg0, var3);
        }
        int var4 = this.field2549.method3280();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2549.field2366[this.field2549.field2360] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2549.field2360++;
                this.field2546[arg0] = var5;
                return this.method4024(arg0, var5);
            }
        }
        this.field2549.field2360 += var4;
        return 0;
    }

    @ObfuscatedName("hk.g(II)I")
    public int method4024(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2544[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2549.method3436() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2549.method3436() << 16;
            }
            return var8;
        }
        int var3 = this.field2549.method3436();
        int var4 = this.field2549.method3280();
        if (var3 == 47) {
            this.field2549.field2360 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2549.method3266();
            var4 -= 3;
            int var6 = this.field2542[arg0];
            this.field2548 += (long) (this.field2545 - var5) * (long) var6;
            this.field2545 = var5;
            this.field2549.field2360 += var4;
            return 2;
        } else {
            this.field2549.field2360 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hk.y(I)J")
    public long method4025(int arg0) {
        return (long) this.field2545 * (long) arg0 + this.field2548;
    }

    @ObfuscatedName("hk.c()I")
    public int method4059() {
        int var1 = this.field2543.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2543[var4] >= 0 && this.field2542[var4] < var3) {
                var2 = var4;
                var3 = this.field2542[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hk.e()Z")
    public boolean method4040() {
        int var1 = this.field2543.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2543[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hk.t(J)V")
    public void method4028(long arg0) {
        this.field2548 = arg0;
        int var3 = this.field2543.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2542[var4] = 0;
            this.field2546[var4] = 0;
            this.field2549.field2360 = this.field2540[var4];
            this.method4021(var4);
            this.field2543[var4] = this.field2549.field2360;
        }
    }
}
