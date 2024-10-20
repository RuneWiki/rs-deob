package deob;

@ObfuscatedName("fs")
public class class182 {

    @ObfuscatedName("fs.h")
    public class119 field2912 = new class119((byte[]) null);

    @ObfuscatedName("fs.q")
    public int field2911;

    @ObfuscatedName("fs.v")
    public int[] field2923;

    @ObfuscatedName("fs.n")
    public int[] field2913;

    @ObfuscatedName("fs.f")
    public int[] field2914;

    @ObfuscatedName("fs.g")
    public int[] field2915;

    @ObfuscatedName("fs.o")
    public int field2910;

    @ObfuscatedName("fs.k")
    public long field2918;

    @ObfuscatedName("fs.b")
    public static final byte[] field2919 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3398(arg0);
    }

    @ObfuscatedName("fs.h([B)V")
    public void method3398(byte[] arg0) {
        this.field2912.field1978 = arg0;
        this.field2912.field1973 = 10;
        int var2 = this.field2912.method2385();
        this.field2911 = this.field2912.method2385();
        this.field2910 = 500000;
        this.field2923 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2912.method2388();
            int var5 = this.field2912.method2388();
            if (var4 == 1297379947) {
                this.field2923[var3] = this.field2912.field1973;
                var3++;
            }
            this.field2912.field1973 += var5;
        }
        this.field2918 = 0L;
        this.field2913 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2913[var6] = this.field2923[var6];
        }
        this.field2914 = new int[var2];
        this.field2915 = new int[var2];
    }

    @ObfuscatedName("fs.q()V")
    public void method3354() {
        this.field2912.field1978 = null;
        this.field2923 = null;
        this.field2913 = null;
        this.field2914 = null;
        this.field2915 = null;
    }

    @ObfuscatedName("fs.v()Z")
    public boolean method3391() {
        return this.field2912.field1978 != null;
    }

    @ObfuscatedName("fs.n()I")
    public int method3356() {
        return this.field2913.length;
    }

    @ObfuscatedName("fs.f(I)V")
    public void method3367(int arg0) {
        this.field2912.field1973 = this.field2913[arg0];
    }

    @ObfuscatedName("fs.g(I)V")
    public void method3358(int arg0) {
        this.field2913[arg0] = this.field2912.field1973;
    }

    @ObfuscatedName("fs.o()V")
    public void method3359() {
        this.field2912.field1973 = -1;
    }

    @ObfuscatedName("fs.s(I)V")
    public void method3374(int arg0) {
        int var2 = this.field2912.method2500();
        this.field2914[arg0] += var2;
    }

    @ObfuscatedName("fs.k(I)I")
    public int method3361(int arg0) {
        return this.method3362(arg0);
    }

    @ObfuscatedName("fs.b(I)I")
    public int method3362(int arg0) {
        byte var2 = this.field2912.field1978[this.field2912.field1973];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2915[arg0] = var3;
            this.field2912.field1973++;
        } else {
            var3 = this.field2915[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3382(arg0, var3);
        }
        int var4 = this.field2912.method2500();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2912.field1978[this.field2912.field1973] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2912.field1973++;
                this.field2915[arg0] = var5;
                return this.method3382(arg0, var5);
            }
        }
        this.field2912.field1973 += var4;
        return 0;
    }

    @ObfuscatedName("fs.c(II)I")
    public int method3382(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2919[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2912.method2383() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2912.method2383() << 16;
            }
            return var8;
        }
        int var3 = this.field2912.method2383();
        int var4 = this.field2912.method2500();
        if (var3 == 47) {
            this.field2912.field1973 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2912.method2387();
            var4 -= 3;
            int var6 = this.field2914[arg0];
            this.field2918 += (long) (this.field2910 - var5) * (long) var6;
            this.field2910 = var5;
            this.field2912.field1973 += var4;
            return 2;
        } else {
            this.field2912.field1973 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fs.l(I)J")
    public long method3364(int arg0) {
        return (long) this.field2910 * (long) arg0 + this.field2918;
    }

    @ObfuscatedName("fs.p()I")
    public int method3371() {
        int var1 = this.field2913.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2913[var4] >= 0 && this.field2914[var4] < var3) {
                var2 = var4;
                var3 = this.field2914[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fs.d()Z")
    public boolean method3365() {
        int var1 = this.field2913.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2913[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fs.i(J)V")
    public void method3353(long arg0) {
        this.field2918 = arg0;
        int var3 = this.field2913.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2914[var4] = 0;
            this.field2915[var4] = 0;
            this.field2912.field1973 = this.field2923[var4];
            this.method3374(var4);
            this.field2913[var4] = this.field2912.field1973;
        }
    }
}
