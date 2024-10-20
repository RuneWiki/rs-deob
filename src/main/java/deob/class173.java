package deob;

@ObfuscatedName("fv")
public class class173 {

    @ObfuscatedName("fv.y")
    public class111 field2865 = new class111((byte[]) null);

    @ObfuscatedName("fv.k")
    public int field2857;

    @ObfuscatedName("fv.g")
    public int[] field2859;

    @ObfuscatedName("fv.n")
    public int[] field2869;

    @ObfuscatedName("fv.t")
    public int[] field2861;

    @ObfuscatedName("fv.e")
    public int[] field2862;

    @ObfuscatedName("fv.q")
    public int field2863;

    @ObfuscatedName("fv.v")
    public long field2860;

    @ObfuscatedName("fv.b")
    public static final byte[] field2866 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class173() {
    }

    public class173(byte[] arg0) {
        this.method3140(arg0);
    }

    @ObfuscatedName("fv.y([B)V")
    public void method3140(byte[] arg0) {
        this.field2865.field1897 = arg0;
        this.field2865.field1902 = 10;
        int var2 = this.field2865.method2339();
        this.field2857 = this.field2865.method2339();
        this.field2863 = 500000;
        this.field2859 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2865.method2165();
            int var5 = this.field2865.method2165();
            if (var4 == 1297379947) {
                this.field2859[var3] = this.field2865.field1902;
                var3++;
            }
            this.field2865.field1902 += var5;
        }
        this.field2860 = 0L;
        this.field2869 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2869[var6] = this.field2859[var6];
        }
        this.field2861 = new int[var2];
        this.field2862 = new int[var2];
    }

    @ObfuscatedName("fv.k()V")
    public void method3141() {
        this.field2865.field1897 = null;
        this.field2859 = null;
        this.field2869 = null;
        this.field2861 = null;
        this.field2862 = null;
    }

    @ObfuscatedName("fv.g()Z")
    public boolean method3177() {
        return this.field2865.field1897 != null;
    }

    @ObfuscatedName("fv.n()I")
    public int method3142() {
        return this.field2869.length;
    }

    @ObfuscatedName("fv.t(I)V")
    public void method3143(int arg0) {
        this.field2865.field1902 = this.field2869[arg0];
    }

    @ObfuscatedName("fv.e(I)V")
    public void method3144(int arg0) {
        this.field2869[arg0] = this.field2865.field1902;
    }

    @ObfuscatedName("fv.q()V")
    public void method3145() {
        this.field2865.field1902 = -1;
    }

    @ObfuscatedName("fv.z(I)V")
    public void method3146(int arg0) {
        int var2 = this.field2865.method2151();
        this.field2861[arg0] += var2;
    }

    @ObfuscatedName("fv.v(I)I")
    public int method3147(int arg0) {
        return this.method3148(arg0);
    }

    @ObfuscatedName("fv.b(I)I")
    public int method3148(int arg0) {
        byte var2 = this.field2865.field1897[this.field2865.field1902];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2862[arg0] = var3;
            this.field2865.field1902++;
        } else {
            var3 = this.field2862[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3149(arg0, var3);
        }
        int var4 = this.field2865.method2151();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2865.field1897[this.field2865.field1902] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2865.field1902++;
                this.field2862[arg0] = var5;
                return this.method3149(arg0, var5);
            }
        }
        this.field2865.field1902 += var4;
        return 0;
    }

    @ObfuscatedName("fv.f(II)I")
    public int method3149(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2866[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2865.method2205() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2865.method2205() << 16;
            }
            return var8;
        }
        int var3 = this.field2865.method2205();
        int var4 = this.field2865.method2151();
        if (var3 == 47) {
            this.field2865.field1902 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2865.method2164();
            var4 -= 3;
            int var6 = this.field2861[arg0];
            this.field2860 += (long) (this.field2863 - var5) * (long) var6;
            this.field2863 = var5;
            this.field2865.field1902 += var4;
            return 2;
        } else {
            this.field2865.field1902 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fv.i(I)J")
    public long method3150(int arg0) {
        return (long) this.field2863 * (long) arg0 + this.field2860;
    }

    @ObfuscatedName("fv.w()I")
    public int method3159() {
        int var1 = this.field2869.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2869[var4] >= 0 && this.field2861[var4] < var3) {
                var2 = var4;
                var3 = this.field2861[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fv.l()Z")
    public boolean method3139() {
        int var1 = this.field2869.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2869[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fv.j(J)V")
    public void method3153(long arg0) {
        this.field2860 = arg0;
        int var3 = this.field2869.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2861[var4] = 0;
            this.field2862[var4] = 0;
            this.field2865.field1902 = this.field2859[var4];
            this.method3146(var4);
            this.field2869[var4] = this.field2865.field1902;
        }
    }
}
