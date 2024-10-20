package deob;

@ObfuscatedName("ec")
public class class146 {

    @ObfuscatedName("ec.l")
    public class127 field2434 = new class127((byte[]) null);

    @ObfuscatedName("ec.b")
    public int field2423;

    @ObfuscatedName("ec.o")
    public int[] field2430;

    @ObfuscatedName("ec.w")
    public int[] field2425;

    @ObfuscatedName("ec.r")
    public int[] field2426;

    @ObfuscatedName("ec.k")
    public int[] field2427;

    @ObfuscatedName("ec.z")
    public int field2428;

    @ObfuscatedName("ec.n")
    public long field2432;

    @ObfuscatedName("ec.j")
    public static final byte[] field2431 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class146() {
    }

    public class146(byte[] arg0) {
        this.method2919(arg0);
    }

    @ObfuscatedName("ec.l([B)V")
    public void method2919(byte[] arg0) {
        this.field2434.field2024 = arg0;
        this.field2434.field2022 = 10;
        int var2 = this.field2434.method2442();
        this.field2423 = this.field2434.method2442();
        this.field2428 = 500000;
        this.field2430 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2434.method2586();
            int var5 = this.field2434.method2586();
            if (var4 == 1297379947) {
                this.field2430[var3] = this.field2434.field2022;
                var3++;
            }
            this.field2434.field2022 += var5;
        }
        this.field2432 = 0L;
        this.field2425 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2425[var6] = this.field2430[var6];
        }
        this.field2426 = new int[var2];
        this.field2427 = new int[var2];
    }

    @ObfuscatedName("ec.b()V")
    public void method2936() {
        this.field2434.field2024 = null;
        this.field2430 = null;
        this.field2425 = null;
        this.field2426 = null;
        this.field2427 = null;
    }

    @ObfuscatedName("ec.o()Z")
    public boolean method2918() {
        return this.field2434.field2024 != null;
    }

    @ObfuscatedName("ec.w()I")
    public int method2904() {
        return this.field2425.length;
    }

    @ObfuscatedName("ec.r(I)V")
    public void method2905(int arg0) {
        this.field2434.field2022 = this.field2425[arg0];
    }

    @ObfuscatedName("ec.k(I)V")
    public void method2907(int arg0) {
        this.field2425[arg0] = this.field2434.field2022;
    }

    @ObfuscatedName("ec.z()V")
    public void method2900() {
        this.field2434.field2022 = -1;
    }

    @ObfuscatedName("ec.g(I)V")
    public void method2908(int arg0) {
        int var2 = this.field2434.method2575();
        this.field2426[arg0] += var2;
    }

    @ObfuscatedName("ec.n(I)I")
    public int method2910(int arg0) {
        return this.method2932(arg0);
    }

    @ObfuscatedName("ec.j(I)I")
    public int method2932(int arg0) {
        byte var2 = this.field2434.field2024[this.field2434.field2022];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2427[arg0] = var3;
            this.field2434.field2022++;
        } else {
            var3 = this.field2427[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2911(arg0, var3);
        }
        int var4 = this.field2434.method2575();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2434.field2024[this.field2434.field2022] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2434.field2022++;
                this.field2427[arg0] = var5;
                return this.method2911(arg0, var5);
            }
        }
        this.field2434.field2022 += var4;
        return 0;
    }

    @ObfuscatedName("ec.c(II)I")
    public int method2911(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2431[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2434.method2440() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2434.method2440() << 16;
            }
            return var8;
        }
        int var3 = this.field2434.method2440();
        int var4 = this.field2434.method2575();
        if (var3 == 47) {
            this.field2434.field2022 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2434.method2441();
            var4 -= 3;
            int var6 = this.field2426[arg0];
            this.field2432 += (long) (this.field2428 - var5) * (long) var6;
            this.field2428 = var5;
            this.field2434.field2022 += var4;
            return 2;
        } else {
            this.field2434.field2022 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ec.m(I)J")
    public long method2912(int arg0) {
        return (long) this.field2428 * (long) arg0 + this.field2432;
    }

    @ObfuscatedName("ec.a()I")
    public int method2913() {
        int var1 = this.field2425.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2425[var4] >= 0 && this.field2426[var4] < var3) {
                var2 = var4;
                var3 = this.field2426[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ec.e()Z")
    public boolean method2909() {
        int var1 = this.field2425.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2425[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ec.q(J)V")
    public void method2915(long arg0) {
        this.field2432 = arg0;
        int var3 = this.field2425.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2426[var4] = 0;
            this.field2427[var4] = 0;
            this.field2434.field2022 = this.field2430[var4];
            this.method2908(var4);
            this.field2425[var4] = this.field2434.field2022;
        }
    }
}
