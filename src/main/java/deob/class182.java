package deob;

@ObfuscatedName("fu")
public class class182 {

    @ObfuscatedName("fu.z")
    public class119 field2935 = new class119((byte[]) null);

    @ObfuscatedName("fu.q")
    public int field2927;

    @ObfuscatedName("fu.k")
    public int[] field2928;

    @ObfuscatedName("fu.f")
    public int[] field2929;

    @ObfuscatedName("fu.d")
    public int[] field2930;

    @ObfuscatedName("fu.l")
    public int[] field2932;

    @ObfuscatedName("fu.r")
    public int field2931;

    @ObfuscatedName("fu.h")
    public long field2926;

    @ObfuscatedName("fu.n")
    public static final byte[] field2934 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3231(arg0);
    }

    @ObfuscatedName("fu.z([B)V")
    public void method3231(byte[] arg0) {
        this.field2935.field1987 = arg0;
        this.field2935.field1986 = 10;
        int var2 = this.field2935.method2415();
        this.field2927 = this.field2935.method2415();
        this.field2931 = 500000;
        this.field2928 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2935.method2306();
            int var5 = this.field2935.method2306();
            if (var4 == 1297379947) {
                this.field2928[var3] = this.field2935.field1986;
                var3++;
            }
            this.field2935.field1986 += var5;
        }
        this.field2926 = 0L;
        this.field2929 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2929[var6] = this.field2928[var6];
        }
        this.field2930 = new int[var2];
        this.field2932 = new int[var2];
    }

    @ObfuscatedName("fu.q()V")
    public void method3256() {
        this.field2935.field1987 = null;
        this.field2928 = null;
        this.field2929 = null;
        this.field2930 = null;
        this.field2932 = null;
    }

    @ObfuscatedName("fu.k()Z")
    public boolean method3251() {
        return this.field2935.field1987 != null;
    }

    @ObfuscatedName("fu.f()I")
    public int method3234() {
        return this.field2929.length;
    }

    @ObfuscatedName("fu.d(I)V")
    public void method3260(int arg0) {
        this.field2935.field1986 = this.field2929[arg0];
    }

    @ObfuscatedName("fu.l(I)V")
    public void method3236(int arg0) {
        this.field2929[arg0] = this.field2935.field1986;
    }

    @ObfuscatedName("fu.r()V")
    public void method3250() {
        this.field2935.field1986 = -1;
    }

    @ObfuscatedName("fu.g(I)V")
    public void method3252(int arg0) {
        int var2 = this.field2935.method2499();
        this.field2930[arg0] += var2;
    }

    @ObfuscatedName("fu.h(I)I")
    public int method3238(int arg0) {
        return this.method3239(arg0);
    }

    @ObfuscatedName("fu.n(I)I")
    public int method3239(int arg0) {
        byte var2 = this.field2935.field1987[this.field2935.field1986];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2932[arg0] = var3;
            this.field2935.field1986++;
        } else {
            var3 = this.field2932[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3264(arg0, var3);
        }
        int var4 = this.field2935.method2499();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2935.field1987[this.field2935.field1986] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2935.field1986++;
                this.field2932[arg0] = var5;
                return this.method3264(arg0, var5);
            }
        }
        this.field2935.field1986 += var4;
        return 0;
    }

    @ObfuscatedName("fu.j(II)I")
    public int method3264(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2934[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2935.method2457() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2935.method2457() << 16;
            }
            return var8;
        }
        int var3 = this.field2935.method2457();
        int var4 = this.field2935.method2499();
        if (var3 == 47) {
            this.field2935.field1986 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2935.method2305();
            var4 -= 3;
            int var6 = this.field2930[arg0];
            this.field2926 += (long) (this.field2931 - var5) * (long) var6;
            this.field2931 = var5;
            this.field2935.field1986 += var4;
            return 2;
        } else {
            this.field2935.field1986 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fu.a(I)J")
    public long method3241(int arg0) {
        return (long) this.field2931 * (long) arg0 + this.field2926;
    }

    @ObfuscatedName("fu.b()I")
    public int method3242() {
        int var1 = this.field2929.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2929[var4] >= 0 && this.field2930[var4] < var3) {
                var2 = var4;
                var3 = this.field2930[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fu.c()Z")
    public boolean method3243() {
        int var1 = this.field2929.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2929[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fu.v(J)V")
    public void method3244(long arg0) {
        this.field2926 = arg0;
        int var3 = this.field2929.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2930[var4] = 0;
            this.field2932[var4] = 0;
            this.field2935.field1986 = this.field2928[var4];
            this.method3252(var4);
            this.field2929[var4] = this.field2935.field1986;
        }
    }
}
