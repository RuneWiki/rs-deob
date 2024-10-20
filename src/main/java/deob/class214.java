package deob;

@ObfuscatedName("hi")
public class class214 {

    @ObfuscatedName("hi.m")
    public class181 field2654 = new class181((byte[]) null);

    @ObfuscatedName("hi.p")
    public int field2655;

    @ObfuscatedName("hi.i")
    public int[] field2656;

    @ObfuscatedName("hi.j")
    public int[] field2657;

    @ObfuscatedName("hi.v")
    public int[] field2658;

    @ObfuscatedName("hi.x")
    public int[] field2659;

    @ObfuscatedName("hi.e")
    public int field2660;

    @ObfuscatedName("hi.b")
    public long field2662;

    @ObfuscatedName("hi.n")
    public static final byte[] field2663 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class214() {
    }

    public class214(byte[] arg0) {
        this.method3725(arg0);
    }

    @ObfuscatedName("hi.m([B)V")
    public void method3725(byte[] arg0) {
        this.field2654.field2499 = arg0;
        this.field2654.field2498 = 10;
        int var2 = this.field2654.method3009();
        this.field2655 = this.field2654.method3009();
        this.field2660 = 500000;
        this.field2656 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2654.method3017();
            int var5 = this.field2654.method3017();
            if (var4 == 1297379947) {
                this.field2656[var3] = this.field2654.field2498;
                var3++;
            }
            this.field2654.field2498 += var5;
        }
        this.field2662 = 0L;
        this.field2657 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2657[var6] = this.field2656[var6];
        }
        this.field2658 = new int[var2];
        this.field2659 = new int[var2];
    }

    @ObfuscatedName("hi.p()V")
    public void method3678() {
        this.field2654.field2499 = null;
        this.field2656 = null;
        this.field2657 = null;
        this.field2658 = null;
        this.field2659 = null;
    }

    @ObfuscatedName("hi.i()Z")
    public boolean method3679() {
        return this.field2654.field2499 != null;
    }

    @ObfuscatedName("hi.j()I")
    public int method3680() {
        return this.field2657.length;
    }

    @ObfuscatedName("hi.v(I)V")
    public void method3681(int arg0) {
        this.field2654.field2498 = this.field2657[arg0];
    }

    @ObfuscatedName("hi.x(I)V")
    public void method3682(int arg0) {
        this.field2657[arg0] = this.field2654.field2498;
    }

    @ObfuscatedName("hi.e()V")
    public void method3683() {
        this.field2654.field2498 = -1;
    }

    @ObfuscatedName("hi.l(I)V")
    public void method3684(int arg0) {
        int var2 = this.field2654.method3200();
        this.field2658[arg0] += var2;
    }

    @ObfuscatedName("hi.b(I)I")
    public int method3706(int arg0) {
        return this.method3686(arg0);
    }

    @ObfuscatedName("hi.n(I)I")
    public int method3686(int arg0) {
        byte var2 = this.field2654.field2499[this.field2654.field2498];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2659[arg0] = var3;
            this.field2654.field2498++;
        } else {
            var3 = this.field2659[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3687(arg0, var3);
        }
        int var4 = this.field2654.method3200();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2654.field2499[this.field2654.field2498] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2654.field2498++;
                this.field2659[arg0] = var5;
                return this.method3687(arg0, var5);
            }
        }
        this.field2654.field2498 += var4;
        return 0;
    }

    @ObfuscatedName("hi.c(II)I")
    public int method3687(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2663[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2654.method3012() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2654.method3012() << 16;
            }
            return var8;
        }
        int var3 = this.field2654.method3012();
        int var4 = this.field2654.method3200();
        if (var3 == 47) {
            this.field2654.field2498 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2654.method3075();
            var4 -= 3;
            int var6 = this.field2658[arg0];
            this.field2662 += (long) (this.field2660 - var5) * (long) var6;
            this.field2660 = var5;
            this.field2654.field2498 += var4;
            return 2;
        } else {
            this.field2654.field2498 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hi.a(I)J")
    public long method3688(int arg0) {
        return (long) this.field2660 * (long) arg0 + this.field2662;
    }

    @ObfuscatedName("hi.y()I")
    public int method3689() {
        int var1 = this.field2657.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2657[var4] >= 0 && this.field2658[var4] < var3) {
                var2 = var4;
                var3 = this.field2658[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hi.w()Z")
    public boolean method3690() {
        int var1 = this.field2657.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2657[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hi.k(J)V")
    public void method3691(long arg0) {
        this.field2662 = arg0;
        int var3 = this.field2657.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2658[var4] = 0;
            this.field2659[var4] = 0;
            this.field2654.field2498 = this.field2656[var4];
            this.method3684(var4);
            this.field2657[var4] = this.field2654.field2498;
        }
    }
}
