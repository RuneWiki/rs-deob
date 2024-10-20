package deob;

@ObfuscatedName("eb")
public class class144 {

    @ObfuscatedName("eb.j")
    public class127 field2399 = new class127((byte[]) null);

    @ObfuscatedName("eb.r")
    public int field2390;

    @ObfuscatedName("eb.v")
    public int[] field2391;

    @ObfuscatedName("eb.p")
    public int[] field2397;

    @ObfuscatedName("eb.e")
    public int[] field2393;

    @ObfuscatedName("eb.d")
    public int[] field2395;

    @ObfuscatedName("eb.y")
    public int field2394;

    @ObfuscatedName("eb.t")
    public long field2398;

    @ObfuscatedName("eb.i")
    public static final byte[] field2389 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class144() {
    }

    public class144(byte[] arg0) {
        this.method2834(arg0);
    }

    @ObfuscatedName("eb.j([B)V")
    public void method2834(byte[] arg0) {
        this.field2399.field2025 = arg0;
        this.field2399.field2022 = 10;
        int var2 = this.field2399.method2609();
        this.field2390 = this.field2399.method2609();
        this.field2394 = 500000;
        this.field2391 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2399.method2446();
            int var5 = this.field2399.method2446();
            if (var4 == 1297379947) {
                this.field2391[var3] = this.field2399.field2022;
                var3++;
            }
            this.field2399.field2022 += var5;
        }
        this.field2398 = 0L;
        this.field2397 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2397[var6] = this.field2391[var6];
        }
        this.field2393 = new int[var2];
        this.field2395 = new int[var2];
    }

    @ObfuscatedName("eb.r()V")
    public void method2835() {
        this.field2399.field2025 = null;
        this.field2391 = null;
        this.field2397 = null;
        this.field2393 = null;
        this.field2395 = null;
    }

    @ObfuscatedName("eb.v()Z")
    public boolean method2853() {
        return this.field2399.field2025 != null;
    }

    @ObfuscatedName("eb.p()I")
    public int method2837() {
        return this.field2397.length;
    }

    @ObfuscatedName("eb.e(I)V")
    public void method2838(int arg0) {
        this.field2399.field2022 = this.field2397[arg0];
    }

    @ObfuscatedName("eb.d(I)V")
    public void method2839(int arg0) {
        this.field2397[arg0] = this.field2399.field2022;
    }

    @ObfuscatedName("eb.y()V")
    public void method2840() {
        this.field2399.field2022 = -1;
    }

    @ObfuscatedName("eb.x(I)V")
    public void method2846(int arg0) {
        int var2 = this.field2399.method2456();
        this.field2393[arg0] += var2;
    }

    @ObfuscatedName("eb.t(I)I")
    public int method2844(int arg0) {
        return this.method2843(arg0);
    }

    @ObfuscatedName("eb.i(I)I")
    public int method2843(int arg0) {
        byte var2 = this.field2399.field2025[this.field2399.field2022];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2395[arg0] = var3;
            this.field2399.field2022++;
        } else {
            var3 = this.field2395[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2832(arg0, var3);
        }
        int var4 = this.field2399.method2456();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2399.field2025[this.field2399.field2022] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2399.field2022++;
                this.field2395[arg0] = var5;
                return this.method2832(arg0, var5);
            }
        }
        this.field2399.field2022 += var4;
        return 0;
    }

    @ObfuscatedName("eb.z(II)I")
    public int method2832(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2389[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2399.method2441() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2399.method2441() << 16;
            }
            return var8;
        }
        int var3 = this.field2399.method2441();
        int var4 = this.field2399.method2456();
        if (var3 == 47) {
            this.field2399.field2022 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2399.method2461();
            var4 -= 3;
            int var6 = this.field2393[arg0];
            this.field2398 += (long) (this.field2394 - var5) * (long) var6;
            this.field2394 = var5;
            this.field2399.field2022 += var4;
            return 2;
        } else {
            this.field2399.field2022 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eb.o(I)J")
    public long method2845(int arg0) {
        return (long) this.field2394 * (long) arg0 + this.field2398;
    }

    @ObfuscatedName("eb.u()I")
    public int method2852() {
        int var1 = this.field2397.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2397[var4] >= 0 && this.field2393[var4] < var3) {
                var2 = var4;
                var3 = this.field2393[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eb.f()Z")
    public boolean method2847() {
        int var1 = this.field2397.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2397[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eb.k(J)V")
    public void method2848(long arg0) {
        this.field2398 = arg0;
        int var3 = this.field2397.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2393[var4] = 0;
            this.field2395[var4] = 0;
            this.field2399.field2022 = this.field2391[var4];
            this.method2846(var4);
            this.field2397[var4] = this.field2399.field2022;
        }
    }
}
