package deob;

@ObfuscatedName("eg")
public class class145 {

    @ObfuscatedName("eg.g")
    public class127 field2434 = new class127((byte[]) null);

    @ObfuscatedName("eg.h")
    public int field2428;

    @ObfuscatedName("eg.s")
    public int[] field2432;

    @ObfuscatedName("eg.o")
    public int[] field2429;

    @ObfuscatedName("eg.p")
    public int[] field2427;

    @ObfuscatedName("eg.x")
    public int[] field2436;

    @ObfuscatedName("eg.k")
    public int field2438;

    @ObfuscatedName("eg.z")
    public long field2431;

    @ObfuscatedName("eg.n")
    public static final byte[] field2435 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class145() {
    }

    public class145(byte[] arg0) {
        this.method2983(arg0);
    }

    @ObfuscatedName("eg.g([B)V")
    public void method2983(byte[] arg0) {
        this.field2434.field2030 = arg0;
        this.field2434.field2027 = 10;
        int var2 = this.field2434.method2501();
        this.field2428 = this.field2434.method2501();
        this.field2438 = 500000;
        this.field2432 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2434.method2548();
            int var5 = this.field2434.method2548();
            if (var4 == 1297379947) {
                this.field2432[var3] = this.field2434.field2027;
                var3++;
            }
            this.field2434.field2027 += var5;
        }
        this.field2431 = 0L;
        this.field2429 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2429[var6] = this.field2432[var6];
        }
        this.field2427 = new int[var2];
        this.field2436 = new int[var2];
    }

    @ObfuscatedName("eg.h()V")
    public void method2984() {
        this.field2434.field2030 = null;
        this.field2432 = null;
        this.field2429 = null;
        this.field2427 = null;
        this.field2436 = null;
    }

    @ObfuscatedName("eg.s()Z")
    public boolean method2925() {
        return this.field2434.field2030 != null;
    }

    @ObfuscatedName("eg.o()I")
    public int method2929() {
        return this.field2429.length;
    }

    @ObfuscatedName("eg.p(I)V")
    public void method2930(int arg0) {
        this.field2434.field2027 = this.field2429[arg0];
    }

    @ObfuscatedName("eg.x(I)V")
    public void method2931(int arg0) {
        this.field2429[arg0] = this.field2434.field2027;
    }

    @ObfuscatedName("eg.k()V")
    public void method2932() {
        this.field2434.field2027 = -1;
    }

    @ObfuscatedName("eg.r(I)V")
    public void method2933(int arg0) {
        int var2 = this.field2434.method2514();
        this.field2427[arg0] += var2;
    }

    @ObfuscatedName("eg.z(I)I")
    public int method2940(int arg0) {
        return this.method2935(arg0);
    }

    @ObfuscatedName("eg.n(I)I")
    public int method2935(int arg0) {
        byte var2 = this.field2434.field2030[this.field2434.field2027];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2436[arg0] = var3;
            this.field2434.field2027++;
        } else {
            var3 = this.field2436[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2936(arg0, var3);
        }
        int var4 = this.field2434.method2514();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2434.field2030[this.field2434.field2027] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2434.field2027++;
                this.field2436[arg0] = var5;
                return this.method2936(arg0, var5);
            }
        }
        this.field2434.field2027 += var4;
        return 0;
    }

    @ObfuscatedName("eg.j(II)I")
    public int method2936(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2435[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2434.method2499() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2434.method2499() << 16;
            }
            return var8;
        }
        int var3 = this.field2434.method2499();
        int var4 = this.field2434.method2514();
        if (var3 == 47) {
            this.field2434.field2027 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2434.method2503();
            var4 -= 3;
            int var6 = this.field2427[arg0];
            this.field2431 += (long) (this.field2438 - var5) * (long) var6;
            this.field2438 = var5;
            this.field2434.field2027 += var4;
            return 2;
        } else {
            this.field2434.field2027 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eg.b(I)J")
    public long method2937(int arg0) {
        return (long) this.field2438 * (long) arg0 + this.field2431;
    }

    @ObfuscatedName("eg.t()I")
    public int method2979() {
        int var1 = this.field2429.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2429[var4] >= 0 && this.field2427[var4] < var3) {
                var2 = var4;
                var3 = this.field2427[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eg.q()Z")
    public boolean method2926() {
        int var1 = this.field2429.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2429[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eg.e(J)V")
    public void method2954(long arg0) {
        this.field2431 = arg0;
        int var3 = this.field2429.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2427[var4] = 0;
            this.field2436[var4] = 0;
            this.field2434.field2027 = this.field2432[var4];
            this.method2933(var4);
            this.field2429[var4] = this.field2434.field2027;
        }
    }
}
