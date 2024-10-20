package deob;

@ObfuscatedName("ex")
public class class55 {

    @ObfuscatedName("ex.d")
    public int[] field571;

    @ObfuscatedName("ex.b")
    public class50 field566 = new class50((byte[]) null);

    @ObfuscatedName("ex.l")
    public int field572;

    @ObfuscatedName("ex.j")
    public static final byte[] field569 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @ObfuscatedName("ex.k")
    public int[] field568;

    @ObfuscatedName("ex.h")
    public int field567;

    @ObfuscatedName("ex.w")
    public int[] field573;

    @ObfuscatedName("ex.t")
    public int[] field570;

    @ObfuscatedName("ex.s")
    public long field574;

    @ObfuscatedName("ex.t(I)V")
    public void method901(int arg0) {
        this.field566.field540 = this.field573[arg0];
    }

    @ObfuscatedName("ex.h()V")
    public void method902() {
        this.field566.field541 = null;
        this.field568 = null;
        this.field573 = null;
        this.field570 = null;
        this.field571 = null;
    }

    public class55(byte[] arg0) {
        this.method922(arg0);
    }

    @ObfuscatedName("ex.w()I")
    public int method903() {
        return this.field573.length;
    }

    @ObfuscatedName("ex.f(I)V")
    public void method905(int arg0) {
        int var2 = this.field566.method695();
        this.field570[arg0] += var2;
    }

    @ObfuscatedName("ex.l()V")
    public void method906() {
        this.field566.field540 = -1;
    }

    @ObfuscatedName("ex.g(I)J")
    public long method908(int arg0) {
        return (long) this.field572 * (long) arg0 + this.field574;
    }

    @ObfuscatedName("ex.o()I")
    public int method909() {
        int var1 = this.field573.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field573[var4] >= 0 && this.field570[var4] < var3) {
                var2 = var4;
                var3 = this.field570[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ex.x(II)I")
    public int method910(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field569[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field566.method726() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field566.method726() << 16;
            }
            return var8;
        }
        int var3 = this.field566.method726();
        int var4 = this.field566.method695();
        if (var3 == 47) {
            this.field566.field540 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field566.method728();
            var4 -= 3;
            int var6 = this.field570[arg0];
            this.field574 += (long) (this.field572 - var5) * (long) var6;
            this.field572 = var5;
            this.field566.field540 += var4;
            return 2;
        } else {
            this.field566.field540 += var4;
            return 3;
        }
    }

    public class55() {
    }

    @ObfuscatedName("ex.e()Z")
    public boolean method912() {
        int var1 = this.field573.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field573[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ex.q(J)V")
    public void method913(long arg0) {
        this.field574 = arg0;
        int var3 = this.field573.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field570[var4] = 0;
            this.field571[var4] = 0;
            this.field566.field540 = this.field568[var4];
            this.method905(var4);
            this.field573[var4] = this.field566.field540;
        }
    }

    @ObfuscatedName("ex.j(I)I")
    public int method914(int arg0) {
        byte var2 = this.field566.field541[this.field566.field540];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field571[arg0] = var3;
            this.field566.field540++;
        } else {
            var3 = this.field571[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method910(arg0, var3);
        }
        int var4 = this.field566.method695();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field566.field541[this.field566.field540] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field566.field540++;
                this.field571[arg0] = var5;
                return this.method910(arg0, var5);
            }
        }
        this.field566.field540 += var4;
        return 0;
    }

    @ObfuscatedName("ex.d(I)V")
    public void method919(int arg0) {
        this.field573[arg0] = this.field566.field540;
    }

    @ObfuscatedName("ex.b([B)V")
    public void method922(byte[] arg0) {
        this.field566.field541 = arg0;
        this.field566.field540 = 10;
        int var2 = this.field566.method720();
        this.field567 = this.field566.method720();
        this.field572 = 500000;
        this.field568 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field566.method685();
            int var5 = this.field566.method685();
            if (var4 == 1297379947) {
                this.field568[var3] = this.field566.field540;
                var3++;
            }
            this.field566.field540 += var5;
        }
        this.field574 = 0L;
        this.field573 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field573[var6] = this.field568[var6];
        }
        this.field570 = new int[var2];
        this.field571 = new int[var2];
    }

    @ObfuscatedName("ex.k()Z")
    public boolean method935() {
        return this.field566.field541 != null;
    }

    @ObfuscatedName("ex.s(I)I")
    public int method936(int arg0) {
        return this.method914(arg0);
    }
}
