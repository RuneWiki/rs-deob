package deob;

@ObfuscatedName("fn")
public class class163 {

    @ObfuscatedName("fn.l")
    public class108 field2692 = new class108((byte[]) null);

    @ObfuscatedName("fn.y")
    public int field2688;

    @ObfuscatedName("fn.g")
    public int[] field2698;

    @ObfuscatedName("fn.j")
    public int[] field2699;

    @ObfuscatedName("fn.w")
    public int[] field2691;

    @ObfuscatedName("fn.c")
    public int[] field2694;

    @ObfuscatedName("fn.x")
    public int field2693;

    @ObfuscatedName("fn.t")
    public long field2695;

    @ObfuscatedName("fn.n")
    public static final byte[] field2689 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class163() {
    }

    public class163(byte[] arg0) {
        this.method3047(arg0);
    }

    @ObfuscatedName("fn.l([B)V")
    public void method3047(byte[] arg0) {
        this.field2692.field1828 = arg0;
        this.field2692.field1823 = 10;
        int var2 = this.field2692.method2163();
        this.field2688 = this.field2692.method2163();
        this.field2693 = 500000;
        this.field2698 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2692.method2297();
            int var5 = this.field2692.method2297();
            if (var4 == 1297379947) {
                this.field2698[var3] = this.field2692.field1823;
                var3++;
            }
            this.field2692.field1823 += var5;
        }
        this.field2695 = 0L;
        this.field2699 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2699[var6] = this.field2698[var6];
        }
        this.field2691 = new int[var2];
        this.field2694 = new int[var2];
    }

    @ObfuscatedName("fn.y()V")
    public void method3050() {
        this.field2692.field1828 = null;
        this.field2698 = null;
        this.field2699 = null;
        this.field2691 = null;
        this.field2694 = null;
    }

    @ObfuscatedName("fn.g()Z")
    public boolean method3024() {
        return this.field2692.field1828 != null;
    }

    @ObfuscatedName("fn.j()I")
    public int method3021() {
        return this.field2699.length;
    }

    @ObfuscatedName("fn.w(I)V")
    public void method3023(int arg0) {
        this.field2692.field1823 = this.field2699[arg0];
    }

    @ObfuscatedName("fn.c(I)V")
    public void method3054(int arg0) {
        this.field2699[arg0] = this.field2692.field1823;
    }

    @ObfuscatedName("fn.x()V")
    public void method3025() {
        this.field2692.field1823 = -1;
    }

    @ObfuscatedName("fn.f(I)V")
    public void method3026(int arg0) {
        int var2 = this.field2692.method2162();
        this.field2691[arg0] += var2;
    }

    @ObfuscatedName("fn.t(I)I")
    public int method3027(int arg0) {
        return this.method3028(arg0);
    }

    @ObfuscatedName("fn.n(I)I")
    public int method3028(int arg0) {
        byte var2 = this.field2692.field1828[this.field2692.field1823];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2694[arg0] = var3;
            this.field2692.field1823++;
        } else {
            var3 = this.field2694[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3029(arg0, var3);
        }
        int var4 = this.field2692.method2162();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2692.field1828[this.field2692.field1823] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2692.field1823++;
                this.field2694[arg0] = var5;
                return this.method3029(arg0, var5);
            }
        }
        this.field2692.field1823 += var4;
        return 0;
    }

    @ObfuscatedName("fn.p(II)I")
    public int method3029(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2689[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2692.method2291() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2692.method2291() << 16;
            }
            return var8;
        }
        int var3 = this.field2692.method2291();
        int var4 = this.field2692.method2162();
        if (var3 == 47) {
            this.field2692.field1823 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2692.method2214();
            var4 -= 3;
            int var6 = this.field2691[arg0];
            this.field2695 += (long) (this.field2693 - var5) * (long) var6;
            this.field2693 = var5;
            this.field2692.field1823 += var4;
            return 2;
        } else {
            this.field2692.field1823 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fn.a(I)J")
    public long method3030(int arg0) {
        return (long) this.field2693 * (long) arg0 + this.field2695;
    }

    @ObfuscatedName("fn.o()I")
    public int method3048() {
        int var1 = this.field2699.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2699[var4] >= 0 && this.field2691[var4] < var3) {
                var2 = var4;
                var3 = this.field2691[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fn.b()Z")
    public boolean method3043() {
        int var1 = this.field2699.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2699[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fn.r(J)V")
    public void method3033(long arg0) {
        this.field2695 = arg0;
        int var3 = this.field2699.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2691[var4] = 0;
            this.field2694[var4] = 0;
            this.field2692.field1823 = this.field2698[var4];
            this.method3026(var4);
            this.field2699[var4] = this.field2692.field1823;
        }
    }
}
