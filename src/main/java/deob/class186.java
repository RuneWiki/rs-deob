package deob;

@ObfuscatedName("gu")
public class class186 {

    @ObfuscatedName("gu.f")
    public class123 field2984 = new class123((byte[]) null);

    @ObfuscatedName("gu.e")
    public int field2985;

    @ObfuscatedName("gu.n")
    public int[] field2981;

    @ObfuscatedName("gu.t")
    public int[] field2982;

    @ObfuscatedName("gu.v")
    public int[] field2983;

    @ObfuscatedName("gu.b")
    public int[] field2988;

    @ObfuscatedName("gu.m")
    public int field2992;

    @ObfuscatedName("gu.c")
    public long field2980;

    @ObfuscatedName("gu.w")
    public static final byte[] field2989 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class186() {
    }

    public class186(byte[] arg0) {
        this.method3384(arg0);
    }

    @ObfuscatedName("gu.f([B)V")
    public void method3384(byte[] arg0) {
        this.field2984.field2053 = arg0;
        this.field2984.field2052 = 10;
        int var2 = this.field2984.method2401();
        this.field2985 = this.field2984.method2401();
        this.field2992 = 500000;
        this.field2981 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2984.method2404();
            int var5 = this.field2984.method2404();
            if (var4 == 1297379947) {
                this.field2981[var3] = this.field2984.field2052;
                var3++;
            }
            this.field2984.field2052 += var5;
        }
        this.field2980 = 0L;
        this.field2982 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2982[var6] = this.field2981[var6];
        }
        this.field2983 = new int[var2];
        this.field2988 = new int[var2];
    }

    @ObfuscatedName("gu.e()V")
    public void method3385() {
        this.field2984.field2053 = null;
        this.field2981 = null;
        this.field2982 = null;
        this.field2983 = null;
        this.field2988 = null;
    }

    @ObfuscatedName("gu.n()Z")
    public boolean method3386() {
        return this.field2984.field2053 != null;
    }

    @ObfuscatedName("gu.t()I")
    public int method3391() {
        return this.field2982.length;
    }

    @ObfuscatedName("gu.v(I)V")
    public void method3387(int arg0) {
        this.field2984.field2052 = this.field2982[arg0];
    }

    @ObfuscatedName("gu.b(I)V")
    public void method3388(int arg0) {
        this.field2982[arg0] = this.field2984.field2052;
    }

    @ObfuscatedName("gu.m()V")
    public void method3395() {
        this.field2984.field2052 = -1;
    }

    @ObfuscatedName("gu.k(I)V")
    public void method3390(int arg0) {
        int var2 = this.field2984.method2562();
        this.field2983[arg0] += var2;
    }

    @ObfuscatedName("gu.c(I)I")
    public int method3406(int arg0) {
        return this.method3402(arg0);
    }

    @ObfuscatedName("gu.w(I)I")
    public int method3402(int arg0) {
        byte var2 = this.field2984.field2053[this.field2984.field2052];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2988[arg0] = var3;
            this.field2984.field2052++;
        } else {
            var3 = this.field2988[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3393(arg0, var3);
        }
        int var4 = this.field2984.method2562();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2984.field2053[this.field2984.field2052] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2984.field2052++;
                this.field2988[arg0] = var5;
                return this.method3393(arg0, var5);
            }
        }
        this.field2984.field2052 += var4;
        return 0;
    }

    @ObfuscatedName("gu.l(II)I")
    public int method3393(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2989[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2984.method2522() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2984.method2522() << 16;
            }
            return var8;
        }
        int var3 = this.field2984.method2522();
        int var4 = this.field2984.method2562();
        if (var3 == 47) {
            this.field2984.field2052 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2984.method2403();
            var4 -= 3;
            int var6 = this.field2983[arg0];
            this.field2980 += (long) (this.field2992 - var5) * (long) var6;
            this.field2992 = var5;
            this.field2984.field2052 += var4;
            return 2;
        } else {
            this.field2984.field2052 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gu.h(I)J")
    public long method3394(int arg0) {
        return (long) this.field2992 * (long) arg0 + this.field2980;
    }

    @ObfuscatedName("gu.i()I")
    public int method3421() {
        int var1 = this.field2982.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2982[var4] >= 0 && this.field2983[var4] < var3) {
                var2 = var4;
                var3 = this.field2983[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gu.u()Z")
    public boolean method3399() {
        int var1 = this.field2982.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2982[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gu.x(J)V")
    public void method3397(long arg0) {
        this.field2980 = arg0;
        int var3 = this.field2982.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2983[var4] = 0;
            this.field2988[var4] = 0;
            this.field2984.field2052 = this.field2981[var4];
            this.method3390(var4);
            this.field2982[var4] = this.field2984.field2052;
        }
    }
}
