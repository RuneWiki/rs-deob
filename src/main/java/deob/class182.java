package deob;

@ObfuscatedName("fa")
public class class182 {

    @ObfuscatedName("fa.i")
    public class119 field2921 = new class119((byte[]) null);

    @ObfuscatedName("fa.v")
    public int field2924;

    @ObfuscatedName("fa.r")
    public int[] field2919;

    @ObfuscatedName("fa.n")
    public int[] field2920;

    @ObfuscatedName("fa.x")
    public int[] field2922;

    @ObfuscatedName("fa.q")
    public int[] field2918;

    @ObfuscatedName("fa.h")
    public int field2930;

    @ObfuscatedName("fa.c")
    public long field2926;

    @ObfuscatedName("fa.y")
    public static final byte[] field2927 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3291(arg0);
    }

    @ObfuscatedName("fa.i([B)V")
    public void method3291(byte[] arg0) {
        this.field2921.field1982 = arg0;
        this.field2921.field1980 = 10;
        int var2 = this.field2921.method2347();
        this.field2924 = this.field2921.method2347();
        this.field2930 = 500000;
        this.field2919 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2921.method2350();
            int var5 = this.field2921.method2350();
            if (var4 == 1297379947) {
                this.field2919[var3] = this.field2921.field1980;
                var3++;
            }
            this.field2921.field1980 += var5;
        }
        this.field2926 = 0L;
        this.field2920 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2920[var6] = this.field2919[var6];
        }
        this.field2922 = new int[var2];
        this.field2918 = new int[var2];
    }

    @ObfuscatedName("fa.v()V")
    public void method3292() {
        this.field2921.field1982 = null;
        this.field2919 = null;
        this.field2920 = null;
        this.field2922 = null;
        this.field2918 = null;
    }

    @ObfuscatedName("fa.r()Z")
    public boolean method3290() {
        return this.field2921.field1982 != null;
    }

    @ObfuscatedName("fa.n()I")
    public int method3329() {
        return this.field2920.length;
    }

    @ObfuscatedName("fa.x(I)V")
    public void method3308(int arg0) {
        this.field2921.field1980 = this.field2920[arg0];
    }

    @ObfuscatedName("fa.q(I)V")
    public void method3328(int arg0) {
        this.field2920[arg0] = this.field2921.field1980;
    }

    @ObfuscatedName("fa.h()V")
    public void method3297() {
        this.field2921.field1980 = -1;
    }

    @ObfuscatedName("fa.d(I)V")
    public void method3298(int arg0) {
        int var2 = this.field2921.method2360();
        this.field2922[arg0] += var2;
    }

    @ObfuscatedName("fa.c(I)I")
    public int method3315(int arg0) {
        return this.method3300(arg0);
    }

    @ObfuscatedName("fa.y(I)I")
    public int method3300(int arg0) {
        byte var2 = this.field2921.field1982[this.field2921.field1980];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2918[arg0] = var3;
            this.field2921.field1980++;
        } else {
            var3 = this.field2918[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3301(arg0, var3);
        }
        int var4 = this.field2921.method2360();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2921.field1982[this.field2921.field1980] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2921.field1980++;
                this.field2918[arg0] = var5;
                return this.method3301(arg0, var5);
            }
        }
        this.field2921.field1980 += var4;
        return 0;
    }

    @ObfuscatedName("fa.m(II)I")
    public int method3301(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2927[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2921.method2380() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2921.method2380() << 16;
            }
            return var8;
        }
        int var3 = this.field2921.method2380();
        int var4 = this.field2921.method2360();
        if (var3 == 47) {
            this.field2921.field1980 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2921.method2349();
            var4 -= 3;
            int var6 = this.field2922[arg0];
            this.field2926 += (long) (this.field2930 - var5) * (long) var6;
            this.field2930 = var5;
            this.field2921.field1980 += var4;
            return 2;
        } else {
            this.field2921.field1980 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fa.e(I)J")
    public long method3302(int arg0) {
        return (long) this.field2930 * (long) arg0 + this.field2926;
    }

    @ObfuscatedName("fa.z()I")
    public int method3303() {
        int var1 = this.field2920.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2920[var4] >= 0 && this.field2922[var4] < var3) {
                var2 = var4;
                var3 = this.field2922[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fa.t()Z")
    public boolean method3309() {
        int var1 = this.field2920.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2920[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fa.b(J)V")
    public void method3305(long arg0) {
        this.field2926 = arg0;
        int var3 = this.field2920.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2922[var4] = 0;
            this.field2918[var4] = 0;
            this.field2921.field1980 = this.field2919[var4];
            this.method3298(var4);
            this.field2920[var4] = this.field2921.field1980;
        }
    }
}
