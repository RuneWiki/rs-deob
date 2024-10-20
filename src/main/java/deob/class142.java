package deob;

@ObfuscatedName("eo")
public class class142 {

    @ObfuscatedName("eo.b")
    public class154 field1968 = new class154((byte[]) null);

    @ObfuscatedName("eo.e")
    public int field1975;

    @ObfuscatedName("eo.c")
    public int[] field1970;

    @ObfuscatedName("eo.l")
    public int[] field1980;

    @ObfuscatedName("eo.y")
    public int[] field1971;

    @ObfuscatedName("eo.j")
    public int[] field1973;

    @ObfuscatedName("eo.g")
    public int field1974;

    @ObfuscatedName("eo.r")
    public long field1976;

    @ObfuscatedName("eo.t")
    public static final byte[] field1977 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class142() {
    }

    public class142(byte[] arg0) {
        this.method2516(arg0);
    }

    @ObfuscatedName("eo.b([B)V")
    public void method2516(byte[] arg0) {
        this.field1968.field2084 = arg0;
        this.field1968.field2079 = 10;
        int var2 = this.field1968.method2671();
        this.field1975 = this.field1968.method2671();
        this.field1974 = 500000;
        this.field1970 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1968.method2815();
            int var5 = this.field1968.method2815();
            if (var4 == 1297379947) {
                this.field1970[var3] = this.field1968.field2079;
                var3++;
            }
            this.field1968.field2079 += var5;
        }
        this.field1976 = 0L;
        this.field1980 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1980[var6] = this.field1970[var6];
        }
        this.field1971 = new int[var2];
        this.field1973 = new int[var2];
    }

    @ObfuscatedName("eo.e()V")
    public void method2562() {
        this.field1968.field2084 = null;
        this.field1970 = null;
        this.field1980 = null;
        this.field1971 = null;
        this.field1973 = null;
    }

    @ObfuscatedName("eo.c()Z")
    public boolean method2524() {
        return this.field1968.field2084 != null;
    }

    @ObfuscatedName("eo.l()I")
    public int method2519() {
        return this.field1980.length;
    }

    @ObfuscatedName("eo.y(I)V")
    public void method2520(int arg0) {
        this.field1968.field2079 = this.field1980[arg0];
    }

    @ObfuscatedName("eo.j(I)V")
    public void method2552(int arg0) {
        this.field1980[arg0] = this.field1968.field2079;
    }

    @ObfuscatedName("eo.t()V")
    public void method2522() {
        this.field1968.field2079 = -1;
    }

    @ObfuscatedName("eo.k(I)V")
    public void method2523(int arg0) {
        int var2 = this.field1968.method2685();
        this.field1971[arg0] += var2;
    }

    @ObfuscatedName("eo.f(I)I")
    public int method2515(int arg0) {
        return this.method2514(arg0);
    }

    @ObfuscatedName("eo.a(I)I")
    public int method2514(int arg0) {
        byte var2 = this.field1968.field2084[this.field1968.field2079];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1973[arg0] = var3;
            this.field1968.field2079++;
        } else {
            var3 = this.field1973[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2556(arg0, var3);
        }
        int var4 = this.field1968.method2685();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1968.field2084[this.field1968.field2079] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1968.field2079++;
                this.field1973[arg0] = var5;
                return this.method2556(arg0, var5);
            }
        }
        this.field1968.field2079 += var4;
        return 0;
    }

    @ObfuscatedName("eo.v(II)I")
    public int method2556(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1977[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1968.method2669() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1968.method2669() << 16;
            }
            return var8;
        }
        int var3 = this.field1968.method2669();
        int var4 = this.field1968.method2685();
        if (var3 == 47) {
            this.field1968.field2079 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1968.method2689();
            var4 -= 3;
            int var6 = this.field1971[arg0];
            this.field1976 += (long) (this.field1974 - var5) * (long) var6;
            this.field1974 = var5;
            this.field1968.field2079 += var4;
            return 2;
        } else {
            this.field1968.field2079 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eo.d(I)J")
    public long method2527(int arg0) {
        return (long) this.field1974 * (long) arg0 + this.field1976;
    }

    @ObfuscatedName("eo.o()I")
    public int method2528() {
        int var1 = this.field1980.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1980[var4] >= 0 && this.field1971[var4] < var3) {
                var2 = var4;
                var3 = this.field1971[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eo.q()Z")
    public boolean method2529() {
        int var1 = this.field1980.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1980[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eo.i(J)V")
    public void method2530(long arg0) {
        this.field1976 = arg0;
        int var3 = this.field1980.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1971[var4] = 0;
            this.field1973[var4] = 0;
            this.field1968.field2079 = this.field1970[var4];
            this.method2523(var4);
            this.field1980[var4] = this.field1968.field2079;
        }
    }
}
