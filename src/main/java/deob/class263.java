package deob;

@ObfuscatedName("jl")
public class class263 {

    @ObfuscatedName("jl.c")
    public class419 field3103 = new class419((byte[]) null);

    @ObfuscatedName("jl.b")
    public int field3100;

    @ObfuscatedName("jl.p")
    public int[] field3098;

    @ObfuscatedName("jl.m")
    public int[] field3111;

    @ObfuscatedName("jl.t")
    public int[] field3102;

    @ObfuscatedName("jl.s")
    public int[] field3101;

    @ObfuscatedName("jl.j")
    public int field3104;

    @ObfuscatedName("jl.n")
    public long field3099;

    @ObfuscatedName("jl.r")
    public static final byte[] field3107 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class263() {
    }

    public class263(byte[] arg0) {
        this.method4735(arg0);
    }

    @ObfuscatedName("jl.c([B)V")
    public void method4735(byte[] arg0) {
        this.field3103.field4477 = arg0;
        this.field3103.field4475 = 10;
        int var2 = this.field3103.method6672();
        this.field3100 = this.field3103.method6672();
        this.field3104 = 500000;
        this.field3098 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3103.method6675();
            int var5 = this.field3103.method6675();
            if (var4 == 1297379947) {
                this.field3098[var3] = this.field3103.field4475;
                var3++;
            }
            this.field3103.field4475 += var5;
        }
        this.field3099 = 0L;
        this.field3111 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3111[var6] = this.field3098[var6];
        }
        this.field3102 = new int[var2];
        this.field3101 = new int[var2];
    }

    @ObfuscatedName("jl.b()V")
    public void method4708() {
        this.field3103.field4477 = null;
        this.field3098 = null;
        this.field3111 = null;
        this.field3102 = null;
        this.field3101 = null;
    }

    @ObfuscatedName("jl.p()Z")
    public boolean method4709() {
        return this.field3103.field4477 != null;
    }

    @ObfuscatedName("jl.m()I")
    public int method4738() {
        return this.field3111.length;
    }

    @ObfuscatedName("jl.t(I)V")
    public void method4722(int arg0) {
        this.field3103.field4475 = this.field3111[arg0];
    }

    @ObfuscatedName("jl.s(I)V")
    public void method4756(int arg0) {
        this.field3111[arg0] = this.field3103.field4475;
    }

    @ObfuscatedName("jl.j()V")
    public void method4731() {
        this.field3103.field4475 = -1;
    }

    @ObfuscatedName("jl.w(I)V")
    public void method4713(int arg0) {
        int var2 = this.field3103.method6689();
        this.field3102[arg0] += var2;
    }

    @ObfuscatedName("jl.n(I)I")
    public int method4714(int arg0) {
        return this.method4715(arg0);
    }

    @ObfuscatedName("jl.r(I)I")
    public int method4715(int arg0) {
        byte var2 = this.field3103.field4477[this.field3103.field4475];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3101[arg0] = var3;
            this.field3103.field4475++;
        } else {
            var3 = this.field3101[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4716(arg0, var3);
        }
        int var4 = this.field3103.method6689();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3103.field4477[this.field3103.field4475] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3103.field4475++;
                this.field3101[arg0] = var5;
                return this.method4716(arg0, var5);
            }
        }
        this.field3103.field4475 += var4;
        return 0;
    }

    @ObfuscatedName("jl.o(II)I")
    public int method4716(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3107[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3103.method6781() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3103.method6781() << 16;
            }
            return var8;
        }
        int var3 = this.field3103.method6781();
        int var4 = this.field3103.method6689();
        if (var3 == 47) {
            this.field3103.field4475 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3103.method6674();
            var4 -= 3;
            int var6 = this.field3102[arg0];
            this.field3099 += (long) (this.field3104 - var5) * (long) var6;
            this.field3104 = var5;
            this.field3103.field4475 += var4;
            return 2;
        } else {
            this.field3103.field4475 += var4;
            return 3;
        }
    }

    @ObfuscatedName("jl.v(I)J")
    public long method4710(int arg0) {
        return (long) this.field3104 * (long) arg0 + this.field3099;
    }

    @ObfuscatedName("jl.d()I")
    public int method4717() {
        int var1 = this.field3111.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3111[var4] >= 0 && this.field3102[var4] < var3) {
                var2 = var4;
                var3 = this.field3102[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("jl.h()Z")
    public boolean method4718() {
        int var1 = this.field3111.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3111[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("jl.g(J)V")
    public void method4720(long arg0) {
        this.field3099 = arg0;
        int var3 = this.field3111.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3102[var4] = 0;
            this.field3101[var4] = 0;
            this.field3103.field4475 = this.field3098[var4];
            this.method4713(var4);
            this.field3111[var4] = this.field3103.field4475;
        }
    }
}
