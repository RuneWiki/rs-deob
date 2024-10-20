package deob;

@ObfuscatedName("gp")
public class class183 {

    @ObfuscatedName("gp.j")
    public class120 field2945 = new class120((byte[]) null);

    @ObfuscatedName("gp.h")
    public int field2955;

    @ObfuscatedName("gp.m")
    public int[] field2944;

    @ObfuscatedName("gp.z")
    public int[] field2949;

    @ObfuscatedName("gp.x")
    public int[] field2946;

    @ObfuscatedName("gp.e")
    public int[] field2943;

    @ObfuscatedName("gp.i")
    public int field2948;

    @ObfuscatedName("gp.n")
    public long field2950;

    @ObfuscatedName("gp.l")
    public static final byte[] field2952 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class183() {
    }

    public class183(byte[] arg0) {
        this.method3273(arg0);
    }

    @ObfuscatedName("gp.j([B)V")
    public void method3273(byte[] arg0) {
        this.field2945.field1974 = arg0;
        this.field2945.field1972 = 10;
        int var2 = this.field2945.method2363();
        this.field2955 = this.field2945.method2363();
        this.field2948 = 500000;
        this.field2944 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2945.method2366();
            int var5 = this.field2945.method2366();
            if (var4 == 1297379947) {
                this.field2944[var3] = this.field2945.field1972;
                var3++;
            }
            this.field2945.field1972 += var5;
        }
        this.field2950 = 0L;
        this.field2949 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2949[var6] = this.field2944[var6];
        }
        this.field2946 = new int[var2];
        this.field2943 = new int[var2];
    }

    @ObfuscatedName("gp.h()V")
    public void method3313() {
        this.field2945.field1974 = null;
        this.field2944 = null;
        this.field2949 = null;
        this.field2946 = null;
        this.field2943 = null;
    }

    @ObfuscatedName("gp.m()Z")
    public boolean method3282() {
        return this.field2945.field1974 != null;
    }

    @ObfuscatedName("gp.z()I")
    public int method3276() {
        return this.field2949.length;
    }

    @ObfuscatedName("gp.x(I)V")
    public void method3275(int arg0) {
        this.field2945.field1972 = this.field2949[arg0];
    }

    @ObfuscatedName("gp.e(I)V")
    public void method3278(int arg0) {
        this.field2949[arg0] = this.field2945.field1972;
    }

    @ObfuscatedName("gp.i()V")
    public void method3272() {
        this.field2945.field1972 = -1;
    }

    @ObfuscatedName("gp.c(I)V")
    public void method3280(int arg0) {
        int var2 = this.field2945.method2463();
        this.field2946[arg0] += var2;
    }

    @ObfuscatedName("gp.n(I)I")
    public int method3320(int arg0) {
        return this.method3301(arg0);
    }

    @ObfuscatedName("gp.l(I)I")
    public int method3301(int arg0) {
        byte var2 = this.field2945.field1974[this.field2945.field1972];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2943[arg0] = var3;
            this.field2945.field1972++;
        } else {
            var3 = this.field2943[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3283(arg0, var3);
        }
        int var4 = this.field2945.method2463();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2945.field1974[this.field2945.field1972] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2945.field1972++;
                this.field2943[arg0] = var5;
                return this.method3283(arg0, var5);
            }
        }
        this.field2945.field1972 += var4;
        return 0;
    }

    @ObfuscatedName("gp.u(II)I")
    public int method3283(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2952[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2945.method2361() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2945.method2361() << 16;
            }
            return var8;
        }
        int var3 = this.field2945.method2361();
        int var4 = this.field2945.method2463();
        if (var3 == 47) {
            this.field2945.field1972 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2945.method2523();
            var4 -= 3;
            int var6 = this.field2946[arg0];
            this.field2950 += (long) (this.field2948 - var5) * (long) var6;
            this.field2948 = var5;
            this.field2945.field1972 += var4;
            return 2;
        } else {
            this.field2945.field1972 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gp.r(I)J")
    public long method3279(int arg0) {
        return (long) this.field2948 * (long) arg0 + this.field2950;
    }

    @ObfuscatedName("gp.a()I")
    public int method3296() {
        int var1 = this.field2949.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2949[var4] >= 0 && this.field2946[var4] < var3) {
                var2 = var4;
                var3 = this.field2946[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gp.d()Z")
    public boolean method3285() {
        int var1 = this.field2949.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2949[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gp.p(J)V")
    public void method3300(long arg0) {
        this.field2950 = arg0;
        int var3 = this.field2949.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2946[var4] = 0;
            this.field2943[var4] = 0;
            this.field2945.field1972 = this.field2944[var4];
            this.method3280(var4);
            this.field2949[var4] = this.field2945.field1972;
        }
    }
}
