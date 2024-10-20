package deob;

@ObfuscatedName("ft")
public class class160 {

    @ObfuscatedName("ft.j")
    public class107 field2699 = new class107((byte[]) null);

    @ObfuscatedName("ft.z")
    public int field2708;

    @ObfuscatedName("ft.y")
    public int[] field2710;

    @ObfuscatedName("ft.h")
    public int[] field2701;

    @ObfuscatedName("ft.r")
    public int[] field2702;

    @ObfuscatedName("ft.e")
    public int[] field2703;

    @ObfuscatedName("ft.k")
    public int field2704;

    @ObfuscatedName("ft.n")
    public long field2706;

    @ObfuscatedName("ft.a")
    public static final byte[] field2709 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class160() {
    }

    public class160(byte[] arg0) {
        this.method2993(arg0);
    }

    @ObfuscatedName("ft.j([B)V")
    public void method2993(byte[] arg0) {
        this.field2699.field1849 = arg0;
        this.field2699.field1847 = 10;
        int var2 = this.field2699.method2132();
        this.field2708 = this.field2699.method2132();
        this.field2704 = 500000;
        this.field2710 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2699.method2135();
            int var5 = this.field2699.method2135();
            if (var4 == 1297379947) {
                this.field2710[var3] = this.field2699.field1847;
                var3++;
            }
            this.field2699.field1847 += var5;
        }
        this.field2706 = 0L;
        this.field2701 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2701[var6] = this.field2710[var6];
        }
        this.field2702 = new int[var2];
        this.field2703 = new int[var2];
    }

    @ObfuscatedName("ft.z()V")
    public void method2994() {
        this.field2699.field1849 = null;
        this.field2710 = null;
        this.field2701 = null;
        this.field2702 = null;
        this.field2703 = null;
    }

    @ObfuscatedName("ft.y()Z")
    public boolean method3010() {
        return this.field2699.field1849 != null;
    }

    @ObfuscatedName("ft.h()I")
    public int method3020() {
        return this.field2701.length;
    }

    @ObfuscatedName("ft.r(I)V")
    public void method2996(int arg0) {
        this.field2699.field1847 = this.field2701[arg0];
    }

    @ObfuscatedName("ft.e(I)V")
    public void method2997(int arg0) {
        this.field2701[arg0] = this.field2699.field1847;
    }

    @ObfuscatedName("ft.k()V")
    public void method3011() {
        this.field2699.field1847 = -1;
    }

    @ObfuscatedName("ft.b(I)V")
    public void method2999(int arg0) {
        int var2 = this.field2699.method2145();
        this.field2702[arg0] += var2;
    }

    @ObfuscatedName("ft.n(I)I")
    public int method3000(int arg0) {
        return this.method3001(arg0);
    }

    @ObfuscatedName("ft.a(I)I")
    public int method3001(int arg0) {
        byte var2 = this.field2699.field1849[this.field2699.field1847];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2703[arg0] = var3;
            this.field2699.field1847++;
        } else {
            var3 = this.field2703[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3002(arg0, var3);
        }
        int var4 = this.field2699.method2145();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2699.field1849[this.field2699.field1847] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2699.field1847++;
                this.field2703[arg0] = var5;
                return this.method3002(arg0, var5);
            }
        }
        this.field2699.field1847 += var4;
        return 0;
    }

    @ObfuscatedName("ft.q(II)I")
    public int method3002(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2709[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2699.method2130() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2699.method2130() << 16;
            }
            return var8;
        }
        int var3 = this.field2699.method2130();
        int var4 = this.field2699.method2145();
        if (var3 == 47) {
            this.field2699.field1847 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2699.method2252();
            var4 -= 3;
            int var6 = this.field2702[arg0];
            this.field2706 += (long) (this.field2704 - var5) * (long) var6;
            this.field2704 = var5;
            this.field2699.field1847 += var4;
            return 2;
        } else {
            this.field2699.field1847 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ft.i(I)J")
    public long method2998(int arg0) {
        return (long) this.field2704 * (long) arg0 + this.field2706;
    }

    @ObfuscatedName("ft.f()I")
    public int method3004() {
        int var1 = this.field2701.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2701[var4] >= 0 && this.field2702[var4] < var3) {
                var2 = var4;
                var3 = this.field2702[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ft.o()Z")
    public boolean method3015() {
        int var1 = this.field2701.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2701[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ft.t(J)V")
    public void method3006(long arg0) {
        this.field2706 = arg0;
        int var3 = this.field2701.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2702[var4] = 0;
            this.field2703[var4] = 0;
            this.field2699.field1847 = this.field2710[var4];
            this.method2999(var4);
            this.field2701[var4] = this.field2699.field1847;
        }
    }
}
