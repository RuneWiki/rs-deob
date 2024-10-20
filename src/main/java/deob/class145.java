package deob;

@ObfuscatedName("ex")
public class class145 {

    @ObfuscatedName("ex.b")
    public class126 field2434 = new class126((byte[]) null);

    @ObfuscatedName("ex.e")
    public int field2422;

    @ObfuscatedName("ex.g")
    public int[] field2432;

    @ObfuscatedName("ex.o")
    public int[] field2424;

    @ObfuscatedName("ex.a")
    public int[] field2425;

    @ObfuscatedName("ex.h")
    public int[] field2426;

    @ObfuscatedName("ex.j")
    public int field2427;

    @ObfuscatedName("ex.q")
    public long field2421;

    @ObfuscatedName("ex.l")
    public static final byte[] field2430 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class145() {
    }

    public class145(byte[] arg0) {
        this.method2863(arg0);
    }

    @ObfuscatedName("ex.b([B)V")
    public void method2863(byte[] arg0) {
        this.field2434.field2026 = arg0;
        this.field2434.field2027 = 10;
        int var2 = this.field2434.method2572();
        this.field2422 = this.field2434.method2572();
        this.field2427 = 500000;
        this.field2432 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2434.method2439();
            int var5 = this.field2434.method2439();
            if (var4 == 1297379947) {
                this.field2432[var3] = this.field2434.field2027;
                var3++;
            }
            this.field2434.field2027 += var5;
        }
        this.field2421 = 0L;
        this.field2424 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2424[var6] = this.field2432[var6];
        }
        this.field2425 = new int[var2];
        this.field2426 = new int[var2];
    }

    @ObfuscatedName("ex.e()V")
    public void method2906() {
        this.field2434.field2026 = null;
        this.field2432 = null;
        this.field2424 = null;
        this.field2425 = null;
        this.field2426 = null;
    }

    @ObfuscatedName("ex.g()Z")
    public boolean method2865() {
        return this.field2434.field2026 != null;
    }

    @ObfuscatedName("ex.o()I")
    public int method2866() {
        return this.field2424.length;
    }

    @ObfuscatedName("ex.a(I)V")
    public void method2907(int arg0) {
        this.field2434.field2027 = this.field2424[arg0];
    }

    @ObfuscatedName("ex.h(I)V")
    public void method2882(int arg0) {
        this.field2424[arg0] = this.field2434.field2027;
    }

    @ObfuscatedName("ex.j()V")
    public void method2869() {
        this.field2434.field2027 = -1;
    }

    @ObfuscatedName("ex.f(I)V")
    public void method2889(int arg0) {
        int var2 = this.field2434.method2530();
        this.field2425[arg0] += var2;
    }

    @ObfuscatedName("ex.q(I)I")
    public int method2871(int arg0) {
        return this.method2872(arg0);
    }

    @ObfuscatedName("ex.l(I)I")
    public int method2872(int arg0) {
        byte var2 = this.field2434.field2026[this.field2434.field2027];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2426[arg0] = var3;
            this.field2434.field2027++;
        } else {
            var3 = this.field2426[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2873(arg0, var3);
        }
        int var4 = this.field2434.method2530();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2434.field2026[this.field2434.field2027] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2434.field2027++;
                this.field2426[arg0] = var5;
                return this.method2873(arg0, var5);
            }
        }
        this.field2434.field2027 += var4;
        return 0;
    }

    @ObfuscatedName("ex.d(II)I")
    public int method2873(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2430[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2434.method2436() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2434.method2436() << 16;
            }
            return var8;
        }
        int var3 = this.field2434.method2436();
        int var4 = this.field2434.method2530();
        if (var3 == 47) {
            this.field2434.field2027 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2434.method2440();
            var4 -= 3;
            int var6 = this.field2425[arg0];
            this.field2421 += (long) (this.field2427 - var5) * (long) var6;
            this.field2427 = var5;
            this.field2434.field2027 += var4;
            return 2;
        } else {
            this.field2434.field2027 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ex.z(I)J")
    public long method2867(int arg0) {
        return (long) this.field2427 * (long) arg0 + this.field2421;
    }

    @ObfuscatedName("ex.n()I")
    public int method2888() {
        int var1 = this.field2424.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2424[var4] >= 0 && this.field2425[var4] < var3) {
                var2 = var4;
                var3 = this.field2425[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ex.t()Z")
    public boolean method2876() {
        int var1 = this.field2424.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2424[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ex.w(J)V")
    public void method2877(long arg0) {
        this.field2421 = arg0;
        int var3 = this.field2424.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2425[var4] = 0;
            this.field2426[var4] = 0;
            this.field2434.field2027 = this.field2432[var4];
            this.method2889(var4);
            this.field2424[var4] = this.field2434.field2027;
        }
    }
}
