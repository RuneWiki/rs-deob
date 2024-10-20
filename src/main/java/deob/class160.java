package deob;

@ObfuscatedName("fr")
public class class160 {

    @ObfuscatedName("fr.b")
    public class107 field2699 = new class107((byte[]) null);

    @ObfuscatedName("fr.u")
    public int field2693;

    @ObfuscatedName("fr.x")
    public int[] field2691;

    @ObfuscatedName("fr.j")
    public int[] field2694;

    @ObfuscatedName("fr.o")
    public int[] field2703;

    @ObfuscatedName("fr.n")
    public int[] field2696;

    @ObfuscatedName("fr.y")
    public int field2697;

    @ObfuscatedName("fr.p")
    public long field2695;

    @ObfuscatedName("fr.l")
    public static final byte[] field2700 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class160() {
    }

    public class160(byte[] arg0) {
        this.method2970(arg0);
    }

    @ObfuscatedName("fr.b([B)V")
    public void method2970(byte[] arg0) {
        this.field2699.field1844 = arg0;
        this.field2699.field1845 = 10;
        int var2 = this.field2699.method2136();
        this.field2693 = this.field2699.method2136();
        this.field2697 = 500000;
        this.field2691 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2699.method2139();
            int var5 = this.field2699.method2139();
            if (var4 == 1297379947) {
                this.field2691[var3] = this.field2699.field1845;
                var3++;
            }
            this.field2699.field1845 += var5;
        }
        this.field2695 = 0L;
        this.field2694 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2694[var6] = this.field2691[var6];
        }
        this.field2703 = new int[var2];
        this.field2696 = new int[var2];
    }

    @ObfuscatedName("fr.u()V")
    public void method2933() {
        this.field2699.field1844 = null;
        this.field2691 = null;
        this.field2694 = null;
        this.field2703 = null;
        this.field2696 = null;
    }

    @ObfuscatedName("fr.x()Z")
    public boolean method2934() {
        return this.field2699.field1844 != null;
    }

    @ObfuscatedName("fr.j()I")
    public int method2935() {
        return this.field2694.length;
    }

    @ObfuscatedName("fr.o(I)V")
    public void method2936(int arg0) {
        this.field2699.field1845 = this.field2694[arg0];
    }

    @ObfuscatedName("fr.n(I)V")
    public void method2937(int arg0) {
        this.field2694[arg0] = this.field2699.field1845;
    }

    @ObfuscatedName("fr.y()V")
    public void method2958() {
        this.field2699.field1845 = -1;
    }

    @ObfuscatedName("fr.f(I)V")
    public void method2939(int arg0) {
        int var2 = this.field2699.method2287();
        this.field2703[arg0] += var2;
    }

    @ObfuscatedName("fr.p(I)I")
    public int method2932(int arg0) {
        return this.method2956(arg0);
    }

    @ObfuscatedName("fr.l(I)I")
    public int method2956(int arg0) {
        byte var2 = this.field2699.field1844[this.field2699.field1845];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2696[arg0] = var3;
            this.field2699.field1845++;
        } else {
            var3 = this.field2696[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2972(arg0, var3);
        }
        int var4 = this.field2699.method2287();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2699.field1844[this.field2699.field1845] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2699.field1845++;
                this.field2696[arg0] = var5;
                return this.method2972(arg0, var5);
            }
        }
        this.field2699.field1845 += var4;
        return 0;
    }

    @ObfuscatedName("fr.k(II)I")
    public int method2972(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2700[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2699.method2134() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2699.method2134() << 16;
            }
            return var8;
        }
        int var3 = this.field2699.method2134();
        int var4 = this.field2699.method2287();
        if (var3 == 47) {
            this.field2699.field1845 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2699.method2138();
            var4 -= 3;
            int var6 = this.field2703[arg0];
            this.field2695 += (long) (this.field2697 - var5) * (long) var6;
            this.field2697 = var5;
            this.field2699.field1845 += var4;
            return 2;
        } else {
            this.field2699.field1845 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fr.q(I)J")
    public long method2945(int arg0) {
        return (long) this.field2697 * (long) arg0 + this.field2695;
    }

    @ObfuscatedName("fr.e()I")
    public int method2944() {
        int var1 = this.field2694.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2694[var4] >= 0 && this.field2703[var4] < var3) {
                var2 = var4;
                var3 = this.field2703[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fr.t()Z")
    public boolean method2955() {
        int var1 = this.field2694.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2694[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fr.g(J)V")
    public void method2946(long arg0) {
        this.field2695 = arg0;
        int var3 = this.field2694.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2703[var4] = 0;
            this.field2696[var4] = 0;
            this.field2699.field1845 = this.field2691[var4];
            this.method2939(var4);
            this.field2694[var4] = this.field2699.field1845;
        }
    }
}
