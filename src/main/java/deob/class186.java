package deob;

@ObfuscatedName("gb")
public class class186 {

    @ObfuscatedName("gb.e")
    public class123 field2991 = new class123((byte[]) null);

    @ObfuscatedName("gb.l")
    public int field2980;

    @ObfuscatedName("gb.c")
    public int[] field2992;

    @ObfuscatedName("gb.h")
    public int[] field2983;

    @ObfuscatedName("gb.r")
    public int[] field2984;

    @ObfuscatedName("gb.a")
    public int[] field2985;

    @ObfuscatedName("gb.b")
    public int field2981;

    @ObfuscatedName("gb.o")
    public long field2988;

    @ObfuscatedName("gb.p")
    public static final byte[] field2989 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class186() {
    }

    public class186(byte[] arg0) {
        this.method3448(arg0);
    }

    @ObfuscatedName("gb.e([B)V")
    public void method3448(byte[] arg0) {
        this.field2991.field2055 = arg0;
        this.field2991.field2062 = 10;
        int var2 = this.field2991.method2466();
        this.field2980 = this.field2991.method2466();
        this.field2981 = 500000;
        this.field2992 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2991.method2468();
            int var5 = this.field2991.method2468();
            if (var4 == 1297379947) {
                this.field2992[var3] = this.field2991.field2062;
                var3++;
            }
            this.field2991.field2062 += var5;
        }
        this.field2988 = 0L;
        this.field2983 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2983[var6] = this.field2992[var6];
        }
        this.field2984 = new int[var2];
        this.field2985 = new int[var2];
    }

    @ObfuscatedName("gb.l()V")
    public void method3406() {
        this.field2991.field2055 = null;
        this.field2992 = null;
        this.field2983 = null;
        this.field2984 = null;
        this.field2985 = null;
    }

    @ObfuscatedName("gb.c()Z")
    public boolean method3403() {
        return this.field2991.field2055 != null;
    }

    @ObfuscatedName("gb.h()I")
    public int method3422() {
        return this.field2983.length;
    }

    @ObfuscatedName("gb.r(I)V")
    public void method3409(int arg0) {
        this.field2991.field2062 = this.field2983[arg0];
    }

    @ObfuscatedName("gb.a(I)V")
    public void method3410(int arg0) {
        this.field2983[arg0] = this.field2991.field2062;
    }

    @ObfuscatedName("gb.b()V")
    public void method3405() {
        this.field2991.field2062 = -1;
    }

    @ObfuscatedName("gb.u(I)V")
    public void method3411(int arg0) {
        int var2 = this.field2991.method2479();
        this.field2984[arg0] += var2;
    }

    @ObfuscatedName("gb.o(I)I")
    public int method3412(int arg0) {
        return this.method3414(arg0);
    }

    @ObfuscatedName("gb.p(I)I")
    public int method3414(int arg0) {
        byte var2 = this.field2991.field2055[this.field2991.field2062];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2985[arg0] = var3;
            this.field2991.field2062++;
        } else {
            var3 = this.field2985[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3429(arg0, var3);
        }
        int var4 = this.field2991.method2479();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2991.field2055[this.field2991.field2062] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2991.field2062++;
                this.field2985[arg0] = var5;
                return this.method3429(arg0, var5);
            }
        }
        this.field2991.field2062 += var4;
        return 0;
    }

    @ObfuscatedName("gb.i(II)I")
    public int method3429(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2989[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2991.method2464() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2991.method2464() << 16;
            }
            return var8;
        }
        int var3 = this.field2991.method2464();
        int var4 = this.field2991.method2479();
        if (var3 == 47) {
            this.field2991.field2062 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2991.method2557();
            var4 -= 3;
            int var6 = this.field2984[arg0];
            this.field2988 += (long) (this.field2981 - var5) * (long) var6;
            this.field2981 = var5;
            this.field2991.field2062 += var4;
            return 2;
        } else {
            this.field2991.field2062 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gb.q(I)J")
    public long method3415(int arg0) {
        return (long) this.field2981 * (long) arg0 + this.field2988;
    }

    @ObfuscatedName("gb.g()I")
    public int method3416() {
        int var1 = this.field2983.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2983[var4] >= 0 && this.field2984[var4] < var3) {
                var2 = var4;
                var3 = this.field2984[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gb.j()Z")
    public boolean method3417() {
        int var1 = this.field2983.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2983[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gb.w(J)V")
    public void method3418(long arg0) {
        this.field2988 = arg0;
        int var3 = this.field2983.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2984[var4] = 0;
            this.field2985[var4] = 0;
            this.field2991.field2062 = this.field2992[var4];
            this.method3411(var4);
            this.field2983[var4] = this.field2991.field2062;
        }
    }
}
