package deob;

@ObfuscatedName("fv")
public class class182 {

    @ObfuscatedName("fv.v")
    public class119 field2948 = new class119((byte[]) null);

    @ObfuscatedName("fv.f")
    public int field2941;

    @ObfuscatedName("fv.i")
    public int[] field2942;

    @ObfuscatedName("fv.d")
    public int[] field2943;

    @ObfuscatedName("fv.o")
    public int[] field2940;

    @ObfuscatedName("fv.c")
    public int[] field2950;

    @ObfuscatedName("fv.p")
    public int field2946;

    @ObfuscatedName("fv.a")
    public long field2945;

    @ObfuscatedName("fv.y")
    public static final byte[] field2949 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3300(arg0);
    }

    @ObfuscatedName("fv.v([B)V")
    public void method3300(byte[] arg0) {
        this.field2948.field1988 = arg0;
        this.field2948.field1984 = 10;
        int var2 = this.field2948.method2334();
        this.field2941 = this.field2948.method2334();
        this.field2946 = 500000;
        this.field2942 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2948.method2354();
            int var5 = this.field2948.method2354();
            if (var4 == 1297379947) {
                this.field2942[var3] = this.field2948.field1984;
                var3++;
            }
            this.field2948.field1984 += var5;
        }
        this.field2945 = 0L;
        this.field2943 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2943[var6] = this.field2942[var6];
        }
        this.field2940 = new int[var2];
        this.field2950 = new int[var2];
    }

    @ObfuscatedName("fv.f()V")
    public void method3318() {
        this.field2948.field1988 = null;
        this.field2942 = null;
        this.field2943 = null;
        this.field2940 = null;
        this.field2950 = null;
    }

    @ObfuscatedName("fv.i()Z")
    public boolean method3302() {
        return this.field2948.field1988 != null;
    }

    @ObfuscatedName("fv.d()I")
    public int method3303() {
        return this.field2943.length;
    }

    @ObfuscatedName("fv.o(I)V")
    public void method3311(int arg0) {
        this.field2948.field1984 = this.field2943[arg0];
    }

    @ObfuscatedName("fv.c(I)V")
    public void method3305(int arg0) {
        this.field2943[arg0] = this.field2948.field1984;
    }

    @ObfuscatedName("fv.p()V")
    public void method3306() {
        this.field2948.field1984 = -1;
    }

    @ObfuscatedName("fv.j(I)V")
    public void method3307(int arg0) {
        int var2 = this.field2948.method2418();
        this.field2940[arg0] += var2;
    }

    @ObfuscatedName("fv.a(I)I")
    public int method3323(int arg0) {
        return this.method3309(arg0);
    }

    @ObfuscatedName("fv.y(I)I")
    public int method3309(int arg0) {
        byte var2 = this.field2948.field1988[this.field2948.field1984];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2950[arg0] = var3;
            this.field2948.field1984++;
        } else {
            var3 = this.field2950[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3310(arg0, var3);
        }
        int var4 = this.field2948.method2418();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2948.field1988[this.field2948.field1984] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2948.field1984++;
                this.field2950[arg0] = var5;
                return this.method3310(arg0, var5);
            }
        }
        this.field2948.field1984 += var4;
        return 0;
    }

    @ObfuscatedName("fv.h(II)I")
    public int method3310(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2949[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2948.method2400() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2948.method2400() << 16;
            }
            return var8;
        }
        int var3 = this.field2948.method2400();
        int var4 = this.field2948.method2418();
        if (var3 == 47) {
            this.field2948.field1984 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2948.method2353();
            var4 -= 3;
            int var6 = this.field2940[arg0];
            this.field2945 += (long) (this.field2946 - var5) * (long) var6;
            this.field2946 = var5;
            this.field2948.field1984 += var4;
            return 2;
        } else {
            this.field2948.field1984 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fv.z(I)J")
    public long method3328(int arg0) {
        return (long) this.field2946 * (long) arg0 + this.field2945;
    }

    @ObfuscatedName("fv.w()I")
    public int method3347() {
        int var1 = this.field2943.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2943[var4] >= 0 && this.field2940[var4] < var3) {
                var2 = var4;
                var3 = this.field2940[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fv.l()Z")
    public boolean method3313() {
        int var1 = this.field2943.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2943[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fv.q(J)V")
    public void method3314(long arg0) {
        this.field2945 = arg0;
        int var3 = this.field2943.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2940[var4] = 0;
            this.field2950[var4] = 0;
            this.field2948.field1984 = this.field2942[var4];
            this.method3307(var4);
            this.field2943[var4] = this.field2948.field1984;
        }
    }
}
