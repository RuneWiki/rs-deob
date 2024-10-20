package deob;

@ObfuscatedName("fr")
public class class182 {

    @ObfuscatedName("fr.h")
    public class119 field2929 = new class119((byte[]) null);

    @ObfuscatedName("fr.m")
    public int field2926;

    @ObfuscatedName("fr.i")
    public int[] field2927;

    @ObfuscatedName("fr.q")
    public int[] field2928;

    @ObfuscatedName("fr.p")
    public int[] field2932;

    @ObfuscatedName("fr.c")
    public int[] field2930;

    @ObfuscatedName("fr.f")
    public int field2931;

    @ObfuscatedName("fr.w")
    public long field2933;

    @ObfuscatedName("fr.l")
    public static final byte[] field2934 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3274(arg0);
    }

    @ObfuscatedName("fr.h([B)V")
    public void method3274(byte[] arg0) {
        this.field2929.field1989 = arg0;
        this.field2929.field1988 = 10;
        int var2 = this.field2929.method2322();
        this.field2926 = this.field2929.method2322();
        this.field2931 = 500000;
        this.field2927 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2929.method2324();
            int var5 = this.field2929.method2324();
            if (var4 == 1297379947) {
                this.field2927[var3] = this.field2929.field1988;
                var3++;
            }
            this.field2929.field1988 += var5;
        }
        this.field2933 = 0L;
        this.field2928 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2928[var6] = this.field2927[var6];
        }
        this.field2932 = new int[var2];
        this.field2930 = new int[var2];
    }

    @ObfuscatedName("fr.m()V")
    public void method3275() {
        this.field2929.field1989 = null;
        this.field2927 = null;
        this.field2928 = null;
        this.field2932 = null;
        this.field2930 = null;
    }

    @ObfuscatedName("fr.i()Z")
    public boolean method3303() {
        return this.field2929.field1989 != null;
    }

    @ObfuscatedName("fr.q()I")
    public int method3277() {
        return this.field2928.length;
    }

    @ObfuscatedName("fr.p(I)V")
    public void method3278(int arg0) {
        this.field2929.field1988 = this.field2928[arg0];
    }

    @ObfuscatedName("fr.c(I)V")
    public void method3294(int arg0) {
        this.field2928[arg0] = this.field2929.field1988;
    }

    @ObfuscatedName("fr.f()V")
    public void method3280() {
        this.field2929.field1988 = -1;
    }

    @ObfuscatedName("fr.y(I)V")
    public void method3279(int arg0) {
        int var2 = this.field2929.method2373();
        this.field2932[arg0] += var2;
    }

    @ObfuscatedName("fr.w(I)I")
    public int method3281(int arg0) {
        return this.method3282(arg0);
    }

    @ObfuscatedName("fr.l(I)I")
    public int method3282(int arg0) {
        byte var2 = this.field2929.field1989[this.field2929.field1988];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2930[arg0] = var3;
            this.field2929.field1988++;
        } else {
            var3 = this.field2930[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3314(arg0, var3);
        }
        int var4 = this.field2929.method2373();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2929.field1989[this.field2929.field1988] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2929.field1988++;
                this.field2930[arg0] = var5;
                return this.method3314(arg0, var5);
            }
        }
        this.field2929.field1988 += var4;
        return 0;
    }

    @ObfuscatedName("fr.v(II)I")
    public int method3314(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2934[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2929.method2320() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2929.method2320() << 16;
            }
            return var8;
        }
        int var3 = this.field2929.method2320();
        int var4 = this.field2929.method2373();
        if (var3 == 47) {
            this.field2929.field1988 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2929.method2487();
            var4 -= 3;
            int var6 = this.field2932[arg0];
            this.field2933 += (long) (this.field2931 - var5) * (long) var6;
            this.field2931 = var5;
            this.field2929.field1988 += var4;
            return 2;
        } else {
            this.field2929.field1988 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fr.k(I)J")
    public long method3284(int arg0) {
        return (long) this.field2931 * (long) arg0 + this.field2933;
    }

    @ObfuscatedName("fr.o()I")
    public int method3326() {
        int var1 = this.field2928.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2928[var4] >= 0 && this.field2932[var4] < var3) {
                var2 = var4;
                var3 = this.field2932[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fr.u()Z")
    public boolean method3286() {
        int var1 = this.field2928.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2928[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fr.s(J)V")
    public void method3287(long arg0) {
        this.field2933 = arg0;
        int var3 = this.field2928.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2932[var4] = 0;
            this.field2930[var4] = 0;
            this.field2929.field1988 = this.field2927[var4];
            this.method3279(var4);
            this.field2928[var4] = this.field2929.field1988;
        }
    }
}
