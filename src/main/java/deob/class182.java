package deob;

@ObfuscatedName("fl")
public class class182 {

    @ObfuscatedName("fl.j")
    public class119 field2945 = new class119((byte[]) null);

    @ObfuscatedName("fl.l")
    public int field2939;

    @ObfuscatedName("fl.a")
    public int[] field2940;

    @ObfuscatedName("fl.i")
    public int[] field2938;

    @ObfuscatedName("fl.f")
    public int[] field2942;

    @ObfuscatedName("fl.m")
    public int[] field2943;

    @ObfuscatedName("fl.o")
    public int field2947;

    @ObfuscatedName("fl.n")
    public long field2946;

    @ObfuscatedName("fl.k")
    public static final byte[] field2944 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3276(arg0);
    }

    @ObfuscatedName("fl.j([B)V")
    public void method3276(byte[] arg0) {
        this.field2945.field1996 = arg0;
        this.field2945.field1999 = 10;
        int var2 = this.field2945.method2318();
        this.field2939 = this.field2945.method2318();
        this.field2947 = 500000;
        this.field2940 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2945.method2321();
            int var5 = this.field2945.method2321();
            if (var4 == 1297379947) {
                this.field2940[var3] = this.field2945.field1999;
                var3++;
            }
            this.field2945.field1999 += var5;
        }
        this.field2946 = 0L;
        this.field2938 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2938[var6] = this.field2940[var6];
        }
        this.field2942 = new int[var2];
        this.field2943 = new int[var2];
    }

    @ObfuscatedName("fl.l()V")
    public void method3263() {
        this.field2945.field1996 = null;
        this.field2940 = null;
        this.field2938 = null;
        this.field2942 = null;
        this.field2943 = null;
    }

    @ObfuscatedName("fl.a()Z")
    public boolean method3264() {
        return this.field2945.field1996 != null;
    }

    @ObfuscatedName("fl.i()I")
    public int method3265() {
        return this.field2938.length;
    }

    @ObfuscatedName("fl.f(I)V")
    public void method3266(int arg0) {
        this.field2945.field1999 = this.field2938[arg0];
    }

    @ObfuscatedName("fl.m(I)V")
    public void method3267(int arg0) {
        this.field2938[arg0] = this.field2945.field1999;
    }

    @ObfuscatedName("fl.o()V")
    public void method3268() {
        this.field2945.field1999 = -1;
    }

    @ObfuscatedName("fl.h(I)V")
    public void method3269(int arg0) {
        int var2 = this.field2945.method2331();
        this.field2942[arg0] += var2;
    }

    @ObfuscatedName("fl.n(I)I")
    public int method3309(int arg0) {
        return this.method3271(arg0);
    }

    @ObfuscatedName("fl.k(I)I")
    public int method3271(int arg0) {
        byte var2 = this.field2945.field1996[this.field2945.field1999];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2943[arg0] = var3;
            this.field2945.field1999++;
        } else {
            var3 = this.field2943[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3272(arg0, var3);
        }
        int var4 = this.field2945.method2331();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2945.field1996[this.field2945.field1999] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2945.field1999++;
                this.field2943[arg0] = var5;
                return this.method3272(arg0, var5);
            }
        }
        this.field2945.field1999 += var4;
        return 0;
    }

    @ObfuscatedName("fl.r(II)I")
    public int method3272(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2944[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2945.method2316() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2945.method2316() << 16;
            }
            return var8;
        }
        int var3 = this.field2945.method2316();
        int var4 = this.field2945.method2331();
        if (var3 == 47) {
            this.field2945.field1999 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2945.method2416();
            var4 -= 3;
            int var6 = this.field2942[arg0];
            this.field2946 += (long) (this.field2947 - var5) * (long) var6;
            this.field2947 = var5;
            this.field2945.field1999 += var4;
            return 2;
        } else {
            this.field2945.field1999 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fl.b(I)J")
    public long method3273(int arg0) {
        return (long) this.field2947 * (long) arg0 + this.field2946;
    }

    @ObfuscatedName("fl.q()I")
    public int method3274() {
        int var1 = this.field2938.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2938[var4] >= 0 && this.field2942[var4] < var3) {
                var2 = var4;
                var3 = this.field2942[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fl.u()Z")
    public boolean method3262() {
        int var1 = this.field2938.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2938[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fl.g(J)V")
    public void method3275(long arg0) {
        this.field2946 = arg0;
        int var3 = this.field2938.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2942[var4] = 0;
            this.field2943[var4] = 0;
            this.field2945.field1999 = this.field2940[var4];
            this.method3269(var4);
            this.field2938[var4] = this.field2945.field1999;
        }
    }
}
