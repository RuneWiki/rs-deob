package deob;

@ObfuscatedName("ep")
public class class143 {

    @ObfuscatedName("ep.j")
    public class126 field2388 = new class126((byte[]) null);

    @ObfuscatedName("ep.y")
    public int field2380;

    @ObfuscatedName("ep.x")
    public int[] field2381;

    @ObfuscatedName("ep.z")
    public int[] field2386;

    @ObfuscatedName("ep.c")
    public int[] field2383;

    @ObfuscatedName("ep.e")
    public int[] field2379;

    @ObfuscatedName("ep.s")
    public int field2391;

    @ObfuscatedName("ep.g")
    public long field2387;

    @ObfuscatedName("ep.q")
    public static final byte[] field2382 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class143() {
    }

    public class143(byte[] arg0) {
        this.method2791(arg0);
    }

    @ObfuscatedName("ep.j([B)V")
    public void method2791(byte[] arg0) {
        this.field2388.field2025 = arg0;
        this.field2388.field2020 = 10;
        int var2 = this.field2388.method2405();
        this.field2380 = this.field2388.method2405();
        this.field2391 = 500000;
        this.field2381 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2388.method2387();
            int var5 = this.field2388.method2387();
            if (var4 == 1297379947) {
                this.field2381[var3] = this.field2388.field2020;
                var3++;
            }
            this.field2388.field2020 += var5;
        }
        this.field2387 = 0L;
        this.field2386 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2386[var6] = this.field2381[var6];
        }
        this.field2383 = new int[var2];
        this.field2379 = new int[var2];
    }

    @ObfuscatedName("ep.y()V")
    public void method2792() {
        this.field2388.field2025 = null;
        this.field2381 = null;
        this.field2386 = null;
        this.field2383 = null;
        this.field2379 = null;
    }

    @ObfuscatedName("ep.x()Z")
    public boolean method2798() {
        return this.field2388.field2025 != null;
    }

    @ObfuscatedName("ep.z()I")
    public int method2794() {
        return this.field2386.length;
    }

    @ObfuscatedName("ep.c(I)V")
    public void method2795(int arg0) {
        this.field2388.field2020 = this.field2386[arg0];
    }

    @ObfuscatedName("ep.e(I)V")
    public void method2796(int arg0) {
        this.field2386[arg0] = this.field2388.field2020;
    }

    @ObfuscatedName("ep.s()V")
    public void method2797() {
        this.field2388.field2020 = -1;
    }

    @ObfuscatedName("ep.i(I)V")
    public void method2825(int arg0) {
        int var2 = this.field2388.method2397();
        this.field2383[arg0] += var2;
    }

    @ObfuscatedName("ep.g(I)I")
    public int method2799(int arg0) {
        return this.method2800(arg0);
    }

    @ObfuscatedName("ep.q(I)I")
    public int method2800(int arg0) {
        byte var2 = this.field2388.field2025[this.field2388.field2020];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2379[arg0] = var3;
            this.field2388.field2020++;
        } else {
            var3 = this.field2379[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2801(arg0, var3);
        }
        int var4 = this.field2388.method2397();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2388.field2025[this.field2388.field2020] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2388.field2020++;
                this.field2379[arg0] = var5;
                return this.method2801(arg0, var5);
            }
        }
        this.field2388.field2020 += var4;
        return 0;
    }

    @ObfuscatedName("ep.w(II)I")
    public int method2801(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2382[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2388.method2399() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2388.method2399() << 16;
            }
            return var8;
        }
        int var3 = this.field2388.method2399();
        int var4 = this.field2388.method2397();
        if (var3 == 47) {
            this.field2388.field2020 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2388.method2386();
            var4 -= 3;
            int var6 = this.field2383[arg0];
            this.field2387 += (long) (this.field2391 - var5) * (long) var6;
            this.field2391 = var5;
            this.field2388.field2020 += var4;
            return 2;
        } else {
            this.field2388.field2020 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ep.k(I)J")
    public long method2813(int arg0) {
        return (long) this.field2391 * (long) arg0 + this.field2387;
    }

    @ObfuscatedName("ep.v()I")
    public int method2802() {
        int var1 = this.field2386.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2386[var4] >= 0 && this.field2383[var4] < var3) {
                var2 = var4;
                var3 = this.field2383[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ep.o()Z")
    public boolean method2803() {
        int var1 = this.field2386.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2386[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ep.m(J)V")
    public void method2790(long arg0) {
        this.field2387 = arg0;
        int var3 = this.field2386.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2383[var4] = 0;
            this.field2379[var4] = 0;
            this.field2388.field2020 = this.field2381[var4];
            this.method2825(var4);
            this.field2386[var4] = this.field2388.field2020;
        }
    }
}
