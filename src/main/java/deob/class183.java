package deob;

@ObfuscatedName("gd")
public class class183 {

    @ObfuscatedName("gd.f")
    public class120 field2952 = new class120((byte[]) null);

    @ObfuscatedName("gd.u")
    public int field2951;

    @ObfuscatedName("gd.x")
    public int[] field2941;

    @ObfuscatedName("gd.b")
    public int[] field2942;

    @ObfuscatedName("gd.l")
    public int[] field2950;

    @ObfuscatedName("gd.d")
    public int[] field2944;

    @ObfuscatedName("gd.n")
    public int field2945;

    @ObfuscatedName("gd.g")
    public long field2947;

    @ObfuscatedName("gd.s")
    public static final byte[] field2948 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class183() {
    }

    public class183(byte[] arg0) {
        this.method3337(arg0);
    }

    @ObfuscatedName("gd.f([B)V")
    public void method3337(byte[] arg0) {
        this.field2952.field2001 = arg0;
        this.field2952.field1999 = 10;
        int var2 = this.field2952.method2387();
        this.field2951 = this.field2952.method2387();
        this.field2945 = 500000;
        this.field2941 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2952.method2527();
            int var5 = this.field2952.method2527();
            if (var4 == 1297379947) {
                this.field2941[var3] = this.field2952.field1999;
                var3++;
            }
            this.field2952.field1999 += var5;
        }
        this.field2947 = 0L;
        this.field2942 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2942[var6] = this.field2941[var6];
        }
        this.field2950 = new int[var2];
        this.field2944 = new int[var2];
    }

    @ObfuscatedName("gd.u()V")
    public void method3363() {
        this.field2952.field2001 = null;
        this.field2941 = null;
        this.field2942 = null;
        this.field2950 = null;
        this.field2944 = null;
    }

    @ObfuscatedName("gd.x()Z")
    public boolean method3377() {
        return this.field2952.field2001 != null;
    }

    @ObfuscatedName("gd.b()I")
    public int method3345() {
        return this.field2942.length;
    }

    @ObfuscatedName("gd.l(I)V")
    public void method3351(int arg0) {
        this.field2952.field1999 = this.field2942[arg0];
    }

    @ObfuscatedName("gd.d(I)V")
    public void method3341(int arg0) {
        this.field2942[arg0] = this.field2952.field1999;
    }

    @ObfuscatedName("gd.n()V")
    public void method3342() {
        this.field2952.field1999 = -1;
    }

    @ObfuscatedName("gd.m(I)V")
    public void method3343(int arg0) {
        int var2 = this.field2952.method2400();
        this.field2950[arg0] += var2;
    }

    @ObfuscatedName("gd.g(I)I")
    public int method3344(int arg0) {
        return this.method3348(arg0);
    }

    @ObfuscatedName("gd.s(I)I")
    public int method3348(int arg0) {
        byte var2 = this.field2952.field2001[this.field2952.field1999];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2944[arg0] = var3;
            this.field2952.field1999++;
        } else {
            var3 = this.field2944[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3371(arg0, var3);
        }
        int var4 = this.field2952.method2400();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2952.field2001[this.field2952.field1999] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2952.field1999++;
                this.field2944[arg0] = var5;
                return this.method3371(arg0, var5);
            }
        }
        this.field2952.field1999 += var4;
        return 0;
    }

    @ObfuscatedName("gd.r(II)I")
    public int method3371(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2948[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2952.method2385() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2952.method2385() << 16;
            }
            return var8;
        }
        int var3 = this.field2952.method2385();
        int var4 = this.field2952.method2400();
        if (var3 == 47) {
            this.field2952.field1999 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2952.method2389();
            var4 -= 3;
            int var6 = this.field2950[arg0];
            this.field2947 += (long) (this.field2945 - var5) * (long) var6;
            this.field2945 = var5;
            this.field2952.field1999 += var4;
            return 2;
        } else {
            this.field2952.field1999 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gd.k(I)J")
    public long method3373(int arg0) {
        return (long) this.field2945 * (long) arg0 + this.field2947;
    }

    @ObfuscatedName("gd.o()I")
    public int method3375() {
        int var1 = this.field2942.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2942[var4] >= 0 && this.field2950[var4] < var3) {
                var2 = var4;
                var3 = this.field2950[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gd.q()Z")
    public boolean method3349() {
        int var1 = this.field2942.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2942[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gd.p(J)V")
    public void method3350(long arg0) {
        this.field2947 = arg0;
        int var3 = this.field2942.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2950[var4] = 0;
            this.field2944[var4] = 0;
            this.field2952.field1999 = this.field2941[var4];
            this.method3343(var4);
            this.field2942[var4] = this.field2952.field1999;
        }
    }
}
