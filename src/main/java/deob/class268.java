package deob;

@ObfuscatedName("jl")
public class class268 {

    @ObfuscatedName("jl.c")
    public class421 field3151 = new class421((byte[]) null);

    @ObfuscatedName("jl.l")
    public int field3141;

    @ObfuscatedName("jl.s")
    public int[] field3146;

    @ObfuscatedName("jl.e")
    public int[] field3147;

    @ObfuscatedName("jl.r")
    public int[] field3144;

    @ObfuscatedName("jl.o")
    public int[] field3145;

    @ObfuscatedName("jl.i")
    public int field3149;

    @ObfuscatedName("jl.v")
    public long field3148;

    @ObfuscatedName("jl.a")
    public static final byte[] field3143 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class268() {
    }

    public class268(byte[] arg0) {
        this.method4679(arg0);
    }

    @ObfuscatedName("jl.c([B)V")
    public void method4679(byte[] arg0) {
        this.field3151.field4511 = arg0;
        this.field3151.field4512 = 10;
        int var2 = this.field3151.method6666();
        this.field3141 = this.field3151.method6666();
        this.field3149 = 500000;
        this.field3146 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3151.method6669();
            int var5 = this.field3151.method6669();
            if (var4 == 1297379947) {
                this.field3146[var3] = this.field3151.field4512;
                var3++;
            }
            this.field3151.field4512 += var5;
        }
        this.field3148 = 0L;
        this.field3147 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3147[var6] = this.field3146[var6];
        }
        this.field3144 = new int[var2];
        this.field3145 = new int[var2];
    }

    @ObfuscatedName("jl.l()V")
    public void method4660() {
        this.field3151.field4511 = null;
        this.field3146 = null;
        this.field3147 = null;
        this.field3144 = null;
        this.field3145 = null;
    }

    @ObfuscatedName("jl.s()Z")
    public boolean method4689() {
        return this.field3151.field4511 != null;
    }

    @ObfuscatedName("jl.e()I")
    public int method4662() {
        return this.field3147.length;
    }

    @ObfuscatedName("jl.r(I)V")
    public void method4697(int arg0) {
        this.field3151.field4512 = this.field3147[arg0];
    }

    @ObfuscatedName("jl.o(I)V")
    public void method4661(int arg0) {
        this.field3147[arg0] = this.field3151.field4512;
    }

    @ObfuscatedName("jl.i()V")
    public void method4665() {
        this.field3151.field4512 = -1;
    }

    @ObfuscatedName("jl.w(I)V")
    public void method4673(int arg0) {
        int var2 = this.field3151.method6717();
        this.field3144[arg0] += var2;
    }

    @ObfuscatedName("jl.v(I)I")
    public int method4666(int arg0) {
        return this.method4667(arg0);
    }

    @ObfuscatedName("jl.a(I)I")
    public int method4667(int arg0) {
        byte var2 = this.field3151.field4511[this.field3151.field4512];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3145[arg0] = var3;
            this.field3151.field4512++;
        } else {
            var3 = this.field3145[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4668(arg0, var3);
        }
        int var4 = this.field3151.method6717();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3151.field4511[this.field3151.field4512] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3151.field4512++;
                this.field3145[arg0] = var5;
                return this.method4668(arg0, var5);
            }
        }
        this.field3151.field4512 += var4;
        return 0;
    }

    @ObfuscatedName("jl.y(II)I")
    public int method4668(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3143[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3151.method6686() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3151.method6686() << 16;
            }
            return var8;
        }
        int var3 = this.field3151.method6686();
        int var4 = this.field3151.method6717();
        if (var3 == 47) {
            this.field3151.field4512 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3151.method6668();
            var4 -= 3;
            int var6 = this.field3144[arg0];
            this.field3148 += (long) (this.field3149 - var5) * (long) var6;
            this.field3149 = var5;
            this.field3151.field4512 += var4;
            return 2;
        } else {
            this.field3151.field4512 += var4;
            return 3;
        }
    }

    @ObfuscatedName("jl.u(I)J")
    public long method4682(int arg0) {
        return (long) this.field3149 * (long) arg0 + this.field3148;
    }

    @ObfuscatedName("jl.h()I")
    public int method4670() {
        int var1 = this.field3147.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3147[var4] >= 0 && this.field3144[var4] < var3) {
                var2 = var4;
                var3 = this.field3144[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("jl.q()Z")
    public boolean method4671() {
        int var1 = this.field3147.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3147[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("jl.x(J)V")
    public void method4672(long arg0) {
        this.field3148 = arg0;
        int var3 = this.field3147.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3144[var4] = 0;
            this.field3145[var4] = 0;
            this.field3151.field4512 = this.field3146[var4];
            this.method4673(var4);
            this.field3147[var4] = this.field3151.field4512;
        }
    }
}
