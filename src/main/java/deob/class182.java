package deob;

@ObfuscatedName("fr")
public class class182 {

    @ObfuscatedName("fr.n")
    public class119 field2933 = new class119((byte[]) null);

    @ObfuscatedName("fr.d")
    public int field2929;

    @ObfuscatedName("fr.s")
    public int[] field2922;

    @ObfuscatedName("fr.q")
    public int[] field2925;

    @ObfuscatedName("fr.j")
    public int[] field2928;

    @ObfuscatedName("fr.k")
    public int[] field2927;

    @ObfuscatedName("fr.i")
    public int field2923;

    @ObfuscatedName("fr.p")
    public long field2930;

    @ObfuscatedName("fr.h")
    public static final byte[] field2926 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3293(arg0);
    }

    @ObfuscatedName("fr.n([B)V")
    public void method3293(byte[] arg0) {
        this.field2933.field1981 = arg0;
        this.field2933.field1977 = 10;
        int var2 = this.field2933.method2377();
        this.field2929 = this.field2933.method2377();
        this.field2923 = 500000;
        this.field2922 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2933.method2343();
            int var5 = this.field2933.method2343();
            if (var4 == 1297379947) {
                this.field2922[var3] = this.field2933.field1977;
                var3++;
            }
            this.field2933.field1977 += var5;
        }
        this.field2930 = 0L;
        this.field2925 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2925[var6] = this.field2922[var6];
        }
        this.field2928 = new int[var2];
        this.field2927 = new int[var2];
    }

    @ObfuscatedName("fr.d()V")
    public void method3319() {
        this.field2933.field1981 = null;
        this.field2922 = null;
        this.field2925 = null;
        this.field2928 = null;
        this.field2927 = null;
    }

    @ObfuscatedName("fr.s()Z")
    public boolean method3333() {
        return this.field2933.field1981 != null;
    }

    @ObfuscatedName("fr.q()I")
    public int method3296() {
        return this.field2925.length;
    }

    @ObfuscatedName("fr.j(I)V")
    public void method3334(int arg0) {
        this.field2933.field1977 = this.field2925[arg0];
    }

    @ObfuscatedName("fr.k(I)V")
    public void method3298(int arg0) {
        this.field2925[arg0] = this.field2933.field1977;
    }

    @ObfuscatedName("fr.i()V")
    public void method3320() {
        this.field2933.field1977 = -1;
    }

    @ObfuscatedName("fr.m(I)V")
    public void method3300(int arg0) {
        int var2 = this.field2933.method2353();
        this.field2928[arg0] += var2;
    }

    @ObfuscatedName("fr.p(I)I")
    public int method3301(int arg0) {
        return this.method3323(arg0);
    }

    @ObfuscatedName("fr.h(I)I")
    public int method3323(int arg0) {
        byte var2 = this.field2933.field1981[this.field2933.field1977];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2927[arg0] = var3;
            this.field2933.field1977++;
        } else {
            var3 = this.field2927[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3303(arg0, var3);
        }
        int var4 = this.field2933.method2353();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2933.field1981[this.field2933.field1977] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2933.field1977++;
                this.field2927[arg0] = var5;
                return this.method3303(arg0, var5);
            }
        }
        this.field2933.field1977 += var4;
        return 0;
    }

    @ObfuscatedName("fr.e(II)I")
    public int method3303(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2926[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2933.method2338() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2933.method2338() << 16;
            }
            return var8;
        }
        int var3 = this.field2933.method2338();
        int var4 = this.field2933.method2353();
        if (var3 == 47) {
            this.field2933.field1977 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2933.method2342();
            var4 -= 3;
            int var6 = this.field2928[arg0];
            this.field2930 += (long) (this.field2923 - var5) * (long) var6;
            this.field2923 = var5;
            this.field2933.field1977 += var4;
            return 2;
        } else {
            this.field2933.field1977 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fr.g(I)J")
    public long method3324(int arg0) {
        return (long) this.field2923 * (long) arg0 + this.field2930;
    }

    @ObfuscatedName("fr.b()I")
    public int method3305() {
        int var1 = this.field2925.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2925[var4] >= 0 && this.field2928[var4] < var3) {
                var2 = var4;
                var3 = this.field2928[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fr.f()Z")
    public boolean method3316() {
        int var1 = this.field2925.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2925[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fr.y(J)V")
    public void method3307(long arg0) {
        this.field2930 = arg0;
        int var3 = this.field2925.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2928[var4] = 0;
            this.field2927[var4] = 0;
            this.field2933.field1977 = this.field2922[var4];
            this.method3300(var4);
            this.field2925[var4] = this.field2933.field1977;
        }
    }
}
