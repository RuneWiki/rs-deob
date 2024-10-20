package deob;

@ObfuscatedName("hu")
public class class223 {

    @ObfuscatedName("hu.f")
    public class185 field2577 = new class185((byte[]) null);

    @ObfuscatedName("hu.h")
    public int field2583;

    @ObfuscatedName("hu.e")
    public int[] field2579;

    @ObfuscatedName("hu.b")
    public int[] field2580;

    @ObfuscatedName("hu.l")
    public int[] field2581;

    @ObfuscatedName("hu.w")
    public int[] field2582;

    @ObfuscatedName("hu.d")
    public int field2590;

    @ObfuscatedName("hu.s")
    public long field2584;

    @ObfuscatedName("hu.g")
    public static final byte[] field2586 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class223() {
    }

    public class223(byte[] arg0) {
        this.method4017(arg0);
    }

    @ObfuscatedName("hu.f([B)V")
    public void method4017(byte[] arg0) {
        this.field2577.field2399 = arg0;
        this.field2577.field2397 = 10;
        int var2 = this.field2577.method3325();
        this.field2583 = this.field2577.method3325();
        this.field2590 = 500000;
        this.field2579 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2577.method3328();
            int var5 = this.field2577.method3328();
            if (var4 == 1297379947) {
                this.field2579[var3] = this.field2577.field2397;
                var3++;
            }
            this.field2577.field2397 += var5;
        }
        this.field2584 = 0L;
        this.field2580 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2580[var6] = this.field2579[var6];
        }
        this.field2581 = new int[var2];
        this.field2582 = new int[var2];
    }

    @ObfuscatedName("hu.h()V")
    public void method4026() {
        this.field2577.field2399 = null;
        this.field2579 = null;
        this.field2580 = null;
        this.field2581 = null;
        this.field2582 = null;
    }

    @ObfuscatedName("hu.e()Z")
    public boolean method4018() {
        return this.field2577.field2399 != null;
    }

    @ObfuscatedName("hu.b()I")
    public int method4019() {
        return this.field2580.length;
    }

    @ObfuscatedName("hu.l(I)V")
    public void method4059(int arg0) {
        this.field2577.field2397 = this.field2580[arg0];
    }

    @ObfuscatedName("hu.w(I)V")
    public void method4016(int arg0) {
        this.field2580[arg0] = this.field2577.field2397;
    }

    @ObfuscatedName("hu.d()V")
    public void method4060() {
        this.field2577.field2397 = -1;
    }

    @ObfuscatedName("hu.n(I)V")
    public void method4023(int arg0) {
        int var2 = this.field2577.method3341();
        this.field2581[arg0] += var2;
    }

    @ObfuscatedName("hu.s(I)I")
    public int method4022(int arg0) {
        return this.method4045(arg0);
    }

    @ObfuscatedName("hu.g(I)I")
    public int method4045(int arg0) {
        byte var2 = this.field2577.field2399[this.field2577.field2397];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2582[arg0] = var3;
            this.field2577.field2397++;
        } else {
            var3 = this.field2582[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4049(arg0, var3);
        }
        int var4 = this.field2577.method3341();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2577.field2399[this.field2577.field2397] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2577.field2397++;
                this.field2582[arg0] = var5;
                return this.method4049(arg0, var5);
            }
        }
        this.field2577.field2397 += var4;
        return 0;
    }

    @ObfuscatedName("hu.k(II)I")
    public int method4049(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2586[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2577.method3323() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2577.method3323() << 16;
            }
            return var8;
        }
        int var3 = this.field2577.method3323();
        int var4 = this.field2577.method3341();
        if (var3 == 47) {
            this.field2577.field2397 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2577.method3327();
            var4 -= 3;
            int var6 = this.field2581[arg0];
            this.field2584 += (long) (this.field2590 - var5) * (long) var6;
            this.field2590 = var5;
            this.field2577.field2397 += var4;
            return 2;
        } else {
            this.field2577.field2397 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hu.m(I)J")
    public long method4025(int arg0) {
        return (long) this.field2590 * (long) arg0 + this.field2584;
    }

    @ObfuscatedName("hu.q()I")
    public int method4028() {
        int var1 = this.field2580.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2580[var4] >= 0 && this.field2581[var4] < var3) {
                var2 = var4;
                var3 = this.field2581[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hu.x()Z")
    public boolean method4043() {
        int var1 = this.field2580.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2580[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hu.u(J)V")
    public void method4030(long arg0) {
        this.field2584 = arg0;
        int var3 = this.field2580.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2581[var4] = 0;
            this.field2582[var4] = 0;
            this.field2577.field2397 = this.field2579[var4];
            this.method4023(var4);
            this.field2580[var4] = this.field2577.field2397;
        }
    }
}
