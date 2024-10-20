package deob;

@ObfuscatedName("fb")
public class class160 {

    @ObfuscatedName("fb.t")
    public class107 field2692 = new class107((byte[]) null);

    @ObfuscatedName("fb.o")
    public int field2687;

    @ObfuscatedName("fb.i")
    public int[] field2688;

    @ObfuscatedName("fb.p")
    public int[] field2697;

    @ObfuscatedName("fb.c")
    public int[] field2690;

    @ObfuscatedName("fb.y")
    public int[] field2691;

    @ObfuscatedName("fb.g")
    public int field2689;

    @ObfuscatedName("fb.h")
    public long field2694;

    @ObfuscatedName("fb.n")
    public static final byte[] field2695 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class160() {
    }

    public class160(byte[] arg0) {
        this.method2942(arg0);
    }

    @ObfuscatedName("fb.t([B)V")
    public void method2942(byte[] arg0) {
        this.field2692.field1826 = arg0;
        this.field2692.field1827 = 10;
        int var2 = this.field2692.method2120();
        this.field2687 = this.field2692.method2120();
        this.field2689 = 500000;
        this.field2688 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2692.method2152();
            int var5 = this.field2692.method2152();
            if (var4 == 1297379947) {
                this.field2688[var3] = this.field2692.field1827;
                var3++;
            }
            this.field2692.field1827 += var5;
        }
        this.field2694 = 0L;
        this.field2697 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2697[var6] = this.field2688[var6];
        }
        this.field2690 = new int[var2];
        this.field2691 = new int[var2];
    }

    @ObfuscatedName("fb.o()V")
    public void method2923() {
        this.field2692.field1826 = null;
        this.field2688 = null;
        this.field2697 = null;
        this.field2690 = null;
        this.field2691 = null;
    }

    @ObfuscatedName("fb.i()Z")
    public boolean method2962() {
        return this.field2692.field1826 != null;
    }

    @ObfuscatedName("fb.p()I")
    public int method2925() {
        return this.field2697.length;
    }

    @ObfuscatedName("fb.c(I)V")
    public void method2926(int arg0) {
        this.field2692.field1827 = this.field2697[arg0];
    }

    @ObfuscatedName("fb.y(I)V")
    public void method2927(int arg0) {
        this.field2697[arg0] = this.field2692.field1827;
    }

    @ObfuscatedName("fb.g()V")
    public void method2928() {
        this.field2692.field1827 = -1;
    }

    @ObfuscatedName("fb.l(I)V")
    public void method2929(int arg0) {
        int var2 = this.field2692.method2133();
        this.field2690[arg0] += var2;
    }

    @ObfuscatedName("fb.h(I)I")
    public int method2930(int arg0) {
        return this.method2931(arg0);
    }

    @ObfuscatedName("fb.n(I)I")
    public int method2931(int arg0) {
        byte var2 = this.field2692.field1826[this.field2692.field1827];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2691[arg0] = var3;
            this.field2692.field1827++;
        } else {
            var3 = this.field2691[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2932(arg0, var3);
        }
        int var4 = this.field2692.method2133();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2692.field1826[this.field2692.field1827] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2692.field1827++;
                this.field2691[arg0] = var5;
                return this.method2932(arg0, var5);
            }
        }
        this.field2692.field1827 += var4;
        return 0;
    }

    @ObfuscatedName("fb.w(II)I")
    public int method2932(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2695[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2692.method2118() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2692.method2118() << 16;
            }
            return var8;
        }
        int var3 = this.field2692.method2118();
        int var4 = this.field2692.method2133();
        if (var3 == 47) {
            this.field2692.field1827 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2692.method2122();
            var4 -= 3;
            int var6 = this.field2690[arg0];
            this.field2694 += (long) (this.field2689 - var5) * (long) var6;
            this.field2689 = var5;
            this.field2692.field1827 += var4;
            return 2;
        } else {
            this.field2692.field1827 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fb.m(I)J")
    public long method2933(int arg0) {
        return (long) this.field2689 * (long) arg0 + this.field2694;
    }

    @ObfuscatedName("fb.x()I")
    public int method2934() {
        int var1 = this.field2697.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2697[var4] >= 0 && this.field2690[var4] < var3) {
                var2 = var4;
                var3 = this.field2690[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fb.b()Z")
    public boolean method2935() {
        int var1 = this.field2697.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2697[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fb.u(J)V")
    public void method2937(long arg0) {
        this.field2694 = arg0;
        int var3 = this.field2697.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2690[var4] = 0;
            this.field2691[var4] = 0;
            this.field2692.field1827 = this.field2688[var4];
            this.method2929(var4);
            this.field2697[var4] = this.field2692.field1827;
        }
    }
}
