package deob;

@ObfuscatedName("fu")
public class class172 {

    @ObfuscatedName("fu.q")
    public class111 field2787 = new class111((byte[]) null);

    @ObfuscatedName("fu.s")
    public int field2785;

    @ObfuscatedName("fu.h")
    public int[] field2783;

    @ObfuscatedName("fu.e")
    public int[] field2788;

    @ObfuscatedName("fu.n")
    public int[] field2782;

    @ObfuscatedName("fu.t")
    public int[] field2781;

    @ObfuscatedName("fu.l")
    public int field2784;

    @ObfuscatedName("fu.o")
    public long field2786;

    @ObfuscatedName("fu.k")
    public static final byte[] field2780 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class172() {
    }

    public class172(byte[] arg0) {
        this.method3064(arg0);
    }

    @ObfuscatedName("fu.q([B)V")
    public void method3064(byte[] arg0) {
        this.field2787.field1859 = arg0;
        this.field2787.field1852 = 10;
        int var2 = this.field2787.method2307();
        this.field2785 = this.field2787.method2307();
        this.field2784 = 500000;
        this.field2783 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2787.method2153();
            int var5 = this.field2787.method2153();
            if (var4 == 1297379947) {
                this.field2783[var3] = this.field2787.field1852;
                var3++;
            }
            this.field2787.field1852 += var5;
        }
        this.field2786 = 0L;
        this.field2788 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2788[var6] = this.field2783[var6];
        }
        this.field2782 = new int[var2];
        this.field2781 = new int[var2];
    }

    @ObfuscatedName("fu.s()V")
    public void method3095() {
        this.field2787.field1859 = null;
        this.field2783 = null;
        this.field2788 = null;
        this.field2782 = null;
        this.field2781 = null;
    }

    @ObfuscatedName("fu.h()Z")
    public boolean method3101() {
        return this.field2787.field1859 != null;
    }

    @ObfuscatedName("fu.e()I")
    public int method3067() {
        return this.field2788.length;
    }

    @ObfuscatedName("fu.n(I)V")
    public void method3068(int arg0) {
        this.field2787.field1852 = this.field2788[arg0];
    }

    @ObfuscatedName("fu.t(I)V")
    public void method3069(int arg0) {
        this.field2788[arg0] = this.field2787.field1852;
    }

    @ObfuscatedName("fu.l()V")
    public void method3073() {
        this.field2787.field1852 = -1;
    }

    @ObfuscatedName("fu.m(I)V")
    public void method3070(int arg0) {
        int var2 = this.field2787.method2152();
        this.field2782[arg0] += var2;
    }

    @ObfuscatedName("fu.o(I)I")
    public int method3065(int arg0) {
        return this.method3063(arg0);
    }

    @ObfuscatedName("fu.k(I)I")
    public int method3063(int arg0) {
        byte var2 = this.field2787.field1859[this.field2787.field1852];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2781[arg0] = var3;
            this.field2787.field1852++;
        } else {
            var3 = this.field2781[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3071(arg0, var3);
        }
        int var4 = this.field2787.method2152();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2787.field1859[this.field2787.field1852] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2787.field1852++;
                this.field2781[arg0] = var5;
                return this.method3071(arg0, var5);
            }
        }
        this.field2787.field1852 += var4;
        return 0;
    }

    @ObfuscatedName("fu.p(II)I")
    public int method3071(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2780[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2787.method2231() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2787.method2231() << 16;
            }
            return var8;
        }
        int var3 = this.field2787.method2231();
        int var4 = this.field2787.method2152();
        if (var3 == 47) {
            this.field2787.field1852 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2787.method2150();
            var4 -= 3;
            int var6 = this.field2782[arg0];
            this.field2786 += (long) (this.field2784 - var5) * (long) var6;
            this.field2784 = var5;
            this.field2787.field1852 += var4;
            return 2;
        } else {
            this.field2787.field1852 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fu.u(I)J")
    public long method3074(int arg0) {
        return (long) this.field2784 * (long) arg0 + this.field2786;
    }

    @ObfuscatedName("fu.g()I")
    public int method3075() {
        int var1 = this.field2788.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2788[var4] >= 0 && this.field2782[var4] < var3) {
                var2 = var4;
                var3 = this.field2782[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fu.a()Z")
    public boolean method3076() {
        int var1 = this.field2788.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2788[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fu.y(J)V")
    public void method3077(long arg0) {
        this.field2786 = arg0;
        int var3 = this.field2788.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2782[var4] = 0;
            this.field2781[var4] = 0;
            this.field2787.field1852 = this.field2783[var4];
            this.method3070(var4);
            this.field2788[var4] = this.field2787.field1852;
        }
    }
}
