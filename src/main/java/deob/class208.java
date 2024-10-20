package deob;

@ObfuscatedName("gm")
public class class208 {

    @ObfuscatedName("gm.e")
    public class175 field2558 = new class175((byte[]) null);

    @ObfuscatedName("gm.n")
    public int field2549;

    @ObfuscatedName("gm.g")
    public int[] field2550;

    @ObfuscatedName("gm.y")
    public int[] field2548;

    @ObfuscatedName("gm.w")
    public int[] field2553;

    @ObfuscatedName("gm.k")
    public int[] field2551;

    @ObfuscatedName("gm.v")
    public int field2554;

    @ObfuscatedName("gm.r")
    public long field2557;

    @ObfuscatedName("gm.u")
    public static final byte[] field2555 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class208() {
    }

    public class208(byte[] arg0) {
        this.method3552(arg0);
    }

    @ObfuscatedName("gm.e([B)V")
    public void method3552(byte[] arg0) {
        this.field2558.field2376 = arg0;
        this.field2558.field2381 = 10;
        int var2 = this.field2558.method3091();
        this.field2549 = this.field2558.method3091();
        this.field2554 = 500000;
        this.field2550 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2558.method2933();
            int var5 = this.field2558.method2933();
            if (var4 == 1297379947) {
                this.field2550[var3] = this.field2558.field2381;
                var3++;
            }
            this.field2558.field2381 += var5;
        }
        this.field2557 = 0L;
        this.field2548 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2548[var6] = this.field2550[var6];
        }
        this.field2553 = new int[var2];
        this.field2551 = new int[var2];
    }

    @ObfuscatedName("gm.n()V")
    public void method3561() {
        this.field2558.field2376 = null;
        this.field2550 = null;
        this.field2548 = null;
        this.field2553 = null;
        this.field2551 = null;
    }

    @ObfuscatedName("gm.g()Z")
    public boolean method3554() {
        return this.field2558.field2376 != null;
    }

    @ObfuscatedName("gm.y()I")
    public int method3555() {
        return this.field2548.length;
    }

    @ObfuscatedName("gm.w(I)V")
    public void method3556(int arg0) {
        this.field2558.field2381 = this.field2548[arg0];
    }

    @ObfuscatedName("gm.k(I)V")
    public void method3571(int arg0) {
        this.field2548[arg0] = this.field2558.field2381;
    }

    @ObfuscatedName("gm.v()V")
    public void method3558() {
        this.field2558.field2381 = -1;
    }

    @ObfuscatedName("gm.z(I)V")
    public void method3562(int arg0) {
        int var2 = this.field2558.method2944();
        this.field2553[arg0] += var2;
    }

    @ObfuscatedName("gm.r(I)I")
    public int method3560(int arg0) {
        return this.method3576(arg0);
    }

    @ObfuscatedName("gm.u(I)I")
    public int method3576(int arg0) {
        byte var2 = this.field2558.field2376[this.field2558.field2381];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2551[arg0] = var3;
            this.field2558.field2381++;
        } else {
            var3 = this.field2551[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3559(arg0, var3);
        }
        int var4 = this.field2558.method2944();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2558.field2376[this.field2558.field2381] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2558.field2381++;
                this.field2551[arg0] = var5;
                return this.method3559(arg0, var5);
            }
        }
        this.field2558.field2381 += var4;
        return 0;
    }

    @ObfuscatedName("gm.d(II)I")
    public int method3559(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2555[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2558.method2928() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2558.method2928() << 16;
            }
            return var8;
        }
        int var3 = this.field2558.method2928();
        int var4 = this.field2558.method2944();
        if (var3 == 47) {
            this.field2558.field2381 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2558.method2932();
            var4 -= 3;
            int var6 = this.field2553[arg0];
            this.field2557 += (long) (this.field2554 - var5) * (long) var6;
            this.field2554 = var5;
            this.field2558.field2381 += var4;
            return 2;
        } else {
            this.field2558.field2381 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gm.o(I)J")
    public long method3563(int arg0) {
        return (long) this.field2554 * (long) arg0 + this.field2557;
    }

    @ObfuscatedName("gm.s()I")
    public int method3564() {
        int var1 = this.field2548.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2548[var4] >= 0 && this.field2553[var4] < var3) {
                var2 = var4;
                var3 = this.field2553[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gm.c()Z")
    public boolean method3565() {
        int var1 = this.field2548.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2548[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gm.m(J)V")
    public void method3566(long arg0) {
        this.field2557 = arg0;
        int var3 = this.field2548.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2553[var4] = 0;
            this.field2551[var4] = 0;
            this.field2558.field2381 = this.field2550[var4];
            this.method3562(var4);
            this.field2548[var4] = this.field2558.field2381;
        }
    }
}
