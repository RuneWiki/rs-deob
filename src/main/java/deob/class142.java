package deob;

@ObfuscatedName("eq")
public class class142 {

    @ObfuscatedName("eq.i")
    public class154 field1979 = new class154((byte[]) null);

    @ObfuscatedName("eq.e")
    public int field1978;

    @ObfuscatedName("eq.f")
    public int[] field1984;

    @ObfuscatedName("eq.k")
    public int[] field1980;

    @ObfuscatedName("eq.g")
    public int[] field1981;

    @ObfuscatedName("eq.n")
    public int[] field1982;

    @ObfuscatedName("eq.a")
    public int field1983;

    @ObfuscatedName("eq.w")
    public long field1985;

    @ObfuscatedName("eq.v")
    public static final byte[] field1977 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class142() {
    }

    public class142(byte[] arg0) {
        this.method2430(arg0);
    }

    @ObfuscatedName("eq.i([B)V")
    public void method2430(byte[] arg0) {
        this.field1979.field2094 = arg0;
        this.field1979.field2091 = 10;
        int var2 = this.field1979.method2575();
        this.field1978 = this.field1979.method2575();
        this.field1983 = 500000;
        this.field1984 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1979.method2658();
            int var5 = this.field1979.method2658();
            if (var4 == 1297379947) {
                this.field1984[var3] = this.field1979.field2091;
                var3++;
            }
            this.field1979.field2091 += var5;
        }
        this.field1985 = 0L;
        this.field1980 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1980[var6] = this.field1984[var6];
        }
        this.field1981 = new int[var2];
        this.field1982 = new int[var2];
    }

    @ObfuscatedName("eq.e()V")
    public void method2431() {
        this.field1979.field2094 = null;
        this.field1984 = null;
        this.field1980 = null;
        this.field1981 = null;
        this.field1982 = null;
    }

    @ObfuscatedName("eq.f()Z")
    public boolean method2447() {
        return this.field1979.field2094 != null;
    }

    @ObfuscatedName("eq.k()I")
    public int method2433() {
        return this.field1980.length;
    }

    @ObfuscatedName("eq.a(I)V")
    public void method2434(int arg0) {
        this.field1979.field2091 = this.field1980[arg0];
    }

    @ObfuscatedName("eq.q(I)V")
    public void method2435(int arg0) {
        this.field1980[arg0] = this.field1979.field2091;
    }

    @ObfuscatedName("eq.w()V")
    public void method2429() {
        this.field1979.field2091 = -1;
    }

    @ObfuscatedName("eq.v(I)V")
    public void method2463(int arg0) {
        int var2 = this.field1979.method2683();
        this.field1981[arg0] += var2;
    }

    @ObfuscatedName("eq.h(I)I")
    public int method2437(int arg0) {
        return this.method2438(arg0);
    }

    @ObfuscatedName("eq.p(I)I")
    public int method2438(int arg0) {
        byte var2 = this.field1979.field2094[this.field1979.field2091];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1982[arg0] = var3;
            this.field1979.field2091++;
        } else {
            var3 = this.field1982[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2451(arg0, var3);
        }
        int var4 = this.field1979.method2683();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1979.field2094[this.field1979.field2091] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1979.field2091++;
                this.field1982[arg0] = var5;
                return this.method2451(arg0, var5);
            }
        }
        this.field1979.field2091 += var4;
        return 0;
    }

    @ObfuscatedName("eq.l(II)I")
    public int method2451(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1977[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1979.method2573() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1979.method2573() << 16;
            }
            return var8;
        }
        int var3 = this.field1979.method2573();
        int var4 = this.field1979.method2683();
        if (var3 == 47) {
            this.field1979.field2091 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1979.method2706();
            var4 -= 3;
            int var6 = this.field1981[arg0];
            this.field1985 += (long) (this.field1983 - var5) * (long) var6;
            this.field1983 = var5;
            this.field1979.field2091 += var4;
            return 2;
        } else {
            this.field1979.field2091 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eq.c(I)J")
    public long method2464(int arg0) {
        return (long) this.field1983 * (long) arg0 + this.field1985;
    }

    @ObfuscatedName("eq.m()I")
    public int method2441() {
        int var1 = this.field1980.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1980[var4] >= 0 && this.field1981[var4] < var3) {
                var2 = var4;
                var3 = this.field1981[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eq.r()Z")
    public boolean method2442() {
        int var1 = this.field1980.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1980[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eq.u(J)V")
    public void method2443(long arg0) {
        this.field1985 = arg0;
        int var3 = this.field1980.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1981[var4] = 0;
            this.field1982[var4] = 0;
            this.field1979.field2091 = this.field1984[var4];
            this.method2463(var4);
            this.field1980[var4] = this.field1979.field2091;
        }
    }
}
