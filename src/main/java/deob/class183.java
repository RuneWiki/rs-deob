package deob;

@ObfuscatedName("gj")
public class class183 {

    @ObfuscatedName("gj.s")
    public class120 field2966 = new class120((byte[]) null);

    @ObfuscatedName("gj.j")
    public int field2958;

    @ObfuscatedName("gj.p")
    public int[] field2963;

    @ObfuscatedName("gj.x")
    public int[] field2960;

    @ObfuscatedName("gj.d")
    public int[] field2961;

    @ObfuscatedName("gj.u")
    public int[] field2962;

    @ObfuscatedName("gj.o")
    public int field2969;

    @ObfuscatedName("gj.k")
    public long field2965;

    @ObfuscatedName("gj.c")
    public static final byte[] field2959 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class183() {
    }

    public class183(byte[] arg0) {
        this.method3304(arg0);
    }

    @ObfuscatedName("gj.s([B)V")
    public void method3304(byte[] arg0) {
        this.field2966.field2008 = arg0;
        this.field2966.field2006 = 10;
        int var2 = this.field2966.method2430();
        this.field2958 = this.field2966.method2430();
        this.field2969 = 500000;
        this.field2963 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2966.method2343();
            int var5 = this.field2966.method2343();
            if (var4 == 1297379947) {
                this.field2963[var3] = this.field2966.field2006;
                var3++;
            }
            this.field2966.field2006 += var5;
        }
        this.field2965 = 0L;
        this.field2960 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2960[var6] = this.field2963[var6];
        }
        this.field2961 = new int[var2];
        this.field2962 = new int[var2];
    }

    @ObfuscatedName("gj.j()V")
    public void method3285() {
        this.field2966.field2008 = null;
        this.field2963 = null;
        this.field2960 = null;
        this.field2961 = null;
        this.field2962 = null;
    }

    @ObfuscatedName("gj.p()Z")
    public boolean method3286() {
        return this.field2966.field2008 != null;
    }

    @ObfuscatedName("gj.x()I")
    public int method3332() {
        return this.field2960.length;
    }

    @ObfuscatedName("gj.d(I)V")
    public void method3288(int arg0) {
        this.field2966.field2006 = this.field2960[arg0];
    }

    @ObfuscatedName("gj.u(I)V")
    public void method3328(int arg0) {
        this.field2960[arg0] = this.field2966.field2006;
    }

    @ObfuscatedName("gj.o()V")
    public void method3290() {
        this.field2966.field2006 = -1;
    }

    @ObfuscatedName("gj.b(I)V")
    public void method3291(int arg0) {
        int var2 = this.field2966.method2353();
        this.field2961[arg0] += var2;
    }

    @ObfuscatedName("gj.k(I)I")
    public int method3292(int arg0) {
        return this.method3293(arg0);
    }

    @ObfuscatedName("gj.c(I)I")
    public int method3293(int arg0) {
        byte var2 = this.field2966.field2008[this.field2966.field2006];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2962[arg0] = var3;
            this.field2966.field2006++;
        } else {
            var3 = this.field2962[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3294(arg0, var3);
        }
        int var4 = this.field2966.method2353();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2966.field2008[this.field2966.field2006] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2966.field2006++;
                this.field2962[arg0] = var5;
                return this.method3294(arg0, var5);
            }
        }
        this.field2966.field2006 += var4;
        return 0;
    }

    @ObfuscatedName("gj.l(II)I")
    public int method3294(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2959[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2966.method2338() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2966.method2338() << 16;
            }
            return var8;
        }
        int var3 = this.field2966.method2338();
        int var4 = this.field2966.method2353();
        if (var3 == 47) {
            this.field2966.field2006 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2966.method2359();
            var4 -= 3;
            int var6 = this.field2961[arg0];
            this.field2965 += (long) (this.field2969 - var5) * (long) var6;
            this.field2969 = var5;
            this.field2966.field2006 += var4;
            return 2;
        } else {
            this.field2966.field2006 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gj.t(I)J")
    public long method3295(int arg0) {
        return (long) this.field2969 * (long) arg0 + this.field2965;
    }

    @ObfuscatedName("gj.i()I")
    public int method3296() {
        int var1 = this.field2960.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2960[var4] >= 0 && this.field2961[var4] < var3) {
                var2 = var4;
                var3 = this.field2961[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gj.r()Z")
    public boolean method3297() {
        int var1 = this.field2960.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2960[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gj.m(J)V")
    public void method3298(long arg0) {
        this.field2965 = arg0;
        int var3 = this.field2960.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2961[var4] = 0;
            this.field2962[var4] = 0;
            this.field2966.field2006 = this.field2963[var4];
            this.method3291(var4);
            this.field2960[var4] = this.field2966.field2006;
        }
    }
}
