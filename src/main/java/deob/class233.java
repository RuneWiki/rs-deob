package deob;

@ObfuscatedName("hy")
public class class233 {

    @ObfuscatedName("hy.t")
    public class195 field2738 = new class195((byte[]) null);

    @ObfuscatedName("hy.q")
    public int field2735;

    @ObfuscatedName("hy.i")
    public int[] field2746;

    @ObfuscatedName("hy.a")
    public int[] field2736;

    @ObfuscatedName("hy.l")
    public int[] field2737;

    @ObfuscatedName("hy.b")
    public int[] field2733;

    @ObfuscatedName("hy.e")
    public int field2734;

    @ObfuscatedName("hy.p")
    public long field2741;

    @ObfuscatedName("hy.g")
    public static final byte[] field2742 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class233() {
    }

    public class233(byte[] arg0) {
        this.method3953(arg0);
    }

    @ObfuscatedName("hy.t([B)V")
    public void method3953(byte[] arg0) {
        this.field2738.field2544 = arg0;
        this.field2738.field2545 = 10;
        int var2 = this.field2738.method3238();
        this.field2735 = this.field2738.method3238();
        this.field2734 = 500000;
        this.field2746 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2738.method3241();
            int var5 = this.field2738.method3241();
            if (var4 == 1297379947) {
                this.field2746[var3] = this.field2738.field2545;
                var3++;
            }
            this.field2738.field2545 += var5;
        }
        this.field2741 = 0L;
        this.field2736 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2736[var6] = this.field2746[var6];
        }
        this.field2737 = new int[var2];
        this.field2733 = new int[var2];
    }

    @ObfuscatedName("hy.q()V")
    public void method3965() {
        this.field2738.field2544 = null;
        this.field2746 = null;
        this.field2736 = null;
        this.field2737 = null;
        this.field2733 = null;
    }

    @ObfuscatedName("hy.i()Z")
    public boolean method3955() {
        return this.field2738.field2544 != null;
    }

    @ObfuscatedName("hy.a()I")
    public int method3983() {
        return this.field2736.length;
    }

    @ObfuscatedName("hy.l(I)V")
    public void method3957(int arg0) {
        this.field2738.field2545 = this.field2736[arg0];
    }

    @ObfuscatedName("hy.b(I)V")
    public void method3956(int arg0) {
        this.field2736[arg0] = this.field2738.field2545;
    }

    @ObfuscatedName("hy.e()V")
    public void method3959() {
        this.field2738.field2545 = -1;
    }

    @ObfuscatedName("hy.x(I)V")
    public void method3960(int arg0) {
        int var2 = this.field2738.method3253();
        this.field2737[arg0] += var2;
    }

    @ObfuscatedName("hy.p(I)I")
    public int method4000(int arg0) {
        return this.method3962(arg0);
    }

    @ObfuscatedName("hy.o(I)I")
    public int method3962(int arg0) {
        byte var2 = this.field2738.field2544[this.field2738.field2545];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2733[arg0] = var3;
            this.field2738.field2545++;
        } else {
            var3 = this.field2733[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3995(arg0, var3);
        }
        int var4 = this.field2738.method3253();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2738.field2544[this.field2738.field2545] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2738.field2545++;
                this.field2733[arg0] = var5;
                return this.method3995(arg0, var5);
            }
        }
        this.field2738.field2545 += var4;
        return 0;
    }

    @ObfuscatedName("hy.c(II)I")
    public int method3995(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2742[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2738.method3236() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2738.method3236() << 16;
            }
            return var8;
        }
        int var3 = this.field2738.method3236();
        int var4 = this.field2738.method3253();
        if (var3 == 47) {
            this.field2738.field2545 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2738.method3399();
            var4 -= 3;
            int var6 = this.field2737[arg0];
            this.field2741 += (long) (this.field2734 - var5) * (long) var6;
            this.field2734 = var5;
            this.field2738.field2545 += var4;
            return 2;
        } else {
            this.field2738.field2545 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hy.u(I)J")
    public long method3974(int arg0) {
        return (long) this.field2734 * (long) arg0 + this.field2741;
    }

    @ObfuscatedName("hy.k()I")
    public int method3963() {
        int var1 = this.field2736.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2736[var4] >= 0 && this.field2737[var4] < var3) {
                var2 = var4;
                var3 = this.field2737[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hy.z()Z")
    public boolean method3966() {
        int var1 = this.field2736.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2736[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hy.w(J)V")
    public void method3967(long arg0) {
        this.field2741 = arg0;
        int var3 = this.field2736.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2737[var4] = 0;
            this.field2733[var4] = 0;
            this.field2738.field2545 = this.field2746[var4];
            this.method3960(var4);
            this.field2736[var4] = this.field2738.field2545;
        }
    }
}
