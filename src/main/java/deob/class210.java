package deob;

@ObfuscatedName("hl")
public class class210 {

    @ObfuscatedName("hl.m")
    public class310 field2513 = new class310((byte[]) null);

    @ObfuscatedName("hl.o")
    public int field2505;

    @ObfuscatedName("hl.q")
    public int[] field2503;

    @ObfuscatedName("hl.j")
    public int[] field2504;

    @ObfuscatedName("hl.p")
    public int[] field2502;

    @ObfuscatedName("hl.g")
    public int[] field2506;

    @ObfuscatedName("hl.n")
    public int field2507;

    @ObfuscatedName("hl.a")
    public long field2509;

    @ObfuscatedName("hl.z")
    public static final byte[] field2510 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class210() {
    }

    public class210(byte[] arg0) {
        this.method3595(arg0);
    }

    @ObfuscatedName("hl.m([B)V")
    public void method3595(byte[] arg0) {
        this.field2513.field3736 = arg0;
        this.field2513.field3734 = 10;
        int var2 = this.field2513.method5283();
        this.field2505 = this.field2513.method5283();
        this.field2507 = 500000;
        this.field2503 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2513.method5209();
            int var5 = this.field2513.method5209();
            if (var4 == 1297379947) {
                this.field2503[var3] = this.field2513.field3734;
                var3++;
            }
            this.field2513.field3734 += var5;
        }
        this.field2509 = 0L;
        this.field2504 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2504[var6] = this.field2503[var6];
        }
        this.field2502 = new int[var2];
        this.field2506 = new int[var2];
    }

    @ObfuscatedName("hl.o()V")
    public void method3596() {
        this.field2513.field3736 = null;
        this.field2503 = null;
        this.field2504 = null;
        this.field2502 = null;
        this.field2506 = null;
    }

    @ObfuscatedName("hl.q()Z")
    public boolean method3597() {
        return this.field2513.field3736 != null;
    }

    @ObfuscatedName("hl.j()I")
    public int method3598() {
        return this.field2504.length;
    }

    @ObfuscatedName("hl.p(I)V")
    public void method3594(int arg0) {
        this.field2513.field3734 = this.field2504[arg0];
    }

    @ObfuscatedName("hl.g(I)V")
    public void method3643(int arg0) {
        this.field2504[arg0] = this.field2513.field3734;
    }

    @ObfuscatedName("hl.n()V")
    public void method3600() {
        this.field2513.field3734 = -1;
    }

    @ObfuscatedName("hl.u(I)V")
    public void method3601(int arg0) {
        int var2 = this.field2513.method5245();
        this.field2502[arg0] += var2;
    }

    @ObfuscatedName("hl.a(I)I")
    public int method3593(int arg0) {
        return this.method3638(arg0);
    }

    @ObfuscatedName("hl.z(I)I")
    public int method3638(int arg0) {
        byte var2 = this.field2513.field3736[this.field2513.field3734];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2506[arg0] = var3;
            this.field2513.field3734++;
        } else {
            var3 = this.field2506[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3604(arg0, var3);
        }
        int var4 = this.field2513.method5245();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2513.field3736[this.field2513.field3734] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2513.field3734++;
                this.field2506[arg0] = var5;
                return this.method3604(arg0, var5);
            }
        }
        this.field2513.field3734 += var4;
        return 0;
    }

    @ObfuscatedName("hl.w(II)I")
    public int method3604(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2510[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2513.method5227() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2513.method5227() << 16;
            }
            return var8;
        }
        int var3 = this.field2513.method5227();
        int var4 = this.field2513.method5245();
        if (var3 == 47) {
            this.field2513.field3734 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2513.method5231();
            var4 -= 3;
            int var6 = this.field2502[arg0];
            this.field2509 += (long) (this.field2507 - var5) * (long) var6;
            this.field2507 = var5;
            this.field2513.field3734 += var4;
            return 2;
        } else {
            this.field2513.field3734 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hl.y(I)J")
    public long method3607(int arg0) {
        return (long) this.field2507 * (long) arg0 + this.field2509;
    }

    @ObfuscatedName("hl.c()I")
    public int method3613() {
        int var1 = this.field2504.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2504[var4] >= 0 && this.field2502[var4] < var3) {
                var2 = var4;
                var3 = this.field2502[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hl.h()Z")
    public boolean method3629() {
        int var1 = this.field2504.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2504[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hl.k(J)V")
    public void method3641(long arg0) {
        this.field2509 = arg0;
        int var3 = this.field2504.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2502[var4] = 0;
            this.field2506[var4] = 0;
            this.field2513.field3734 = this.field2503[var4];
            this.method3601(var4);
            this.field2504[var4] = this.field2513.field3734;
        }
    }
}
