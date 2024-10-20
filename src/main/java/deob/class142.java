package deob;

@ObfuscatedName("eq")
public class class142 {

    @ObfuscatedName("eq.k")
    public class161 field1985 = new class161((byte[]) null);

    @ObfuscatedName("eq.y")
    public int field1979;

    @ObfuscatedName("eq.o")
    public int[] field1974;

    @ObfuscatedName("eq.r")
    public int[] field1972;

    @ObfuscatedName("eq.w")
    public int[] field1975;

    @ObfuscatedName("eq.j")
    public int[] field1973;

    @ObfuscatedName("eq.q")
    public int field1983;

    @ObfuscatedName("eq.n")
    public long field1980;

    @ObfuscatedName("eq.c")
    public static final byte[] field1981 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class142() {
    }

    public class142(byte[] arg0) {
        this.method2438(arg0);
    }

    @ObfuscatedName("eq.k([B)V")
    public void method2438(byte[] arg0) {
        this.field1985.field2258 = arg0;
        this.field1985.field2267 = 10;
        int var2 = this.field1985.method2735();
        this.field1979 = this.field1985.method2735();
        this.field1983 = 500000;
        this.field1974 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1985.method2868();
            int var5 = this.field1985.method2868();
            if (var4 == 1297379947) {
                this.field1974[var3] = this.field1985.field2267;
                var3++;
            }
            this.field1985.field2267 += var5;
        }
        this.field1980 = 0L;
        this.field1972 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1972[var6] = this.field1974[var6];
        }
        this.field1975 = new int[var2];
        this.field1973 = new int[var2];
    }

    @ObfuscatedName("eq.y()V")
    public void method2439() {
        this.field1985.field2258 = null;
        this.field1974 = null;
        this.field1972 = null;
        this.field1975 = null;
        this.field1973 = null;
    }

    @ObfuscatedName("eq.o()Z")
    public boolean method2440() {
        return this.field1985.field2258 != null;
    }

    @ObfuscatedName("eq.r()I")
    public int method2441() {
        return this.field1972.length;
    }

    @ObfuscatedName("eq.w(I)V")
    public void method2442(int arg0) {
        this.field1985.field2267 = this.field1972[arg0];
    }

    @ObfuscatedName("eq.j(I)V")
    public void method2443(int arg0) {
        this.field1972[arg0] = this.field1985.field2267;
    }

    @ObfuscatedName("eq.c()V")
    public void method2444() {
        this.field1985.field2267 = -1;
    }

    @ObfuscatedName("eq.g(I)V")
    public void method2458(int arg0) {
        int var2 = this.field1985.method2748();
        this.field1975[arg0] += var2;
    }

    @ObfuscatedName("eq.i(I)I")
    public int method2468(int arg0) {
        return this.method2448(arg0);
    }

    @ObfuscatedName("eq.v(I)I")
    public int method2448(int arg0) {
        byte var2 = this.field1985.field2258[this.field1985.field2267];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1973[arg0] = var3;
            this.field1985.field2267++;
        } else {
            var3 = this.field1973[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2474(arg0, var3);
        }
        int var4 = this.field1985.method2748();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1985.field2258[this.field1985.field2267] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1985.field2267++;
                this.field1973[arg0] = var5;
                return this.method2474(arg0, var5);
            }
        }
        this.field1985.field2267 += var4;
        return 0;
    }

    @ObfuscatedName("eq.a(II)I")
    public int method2474(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1981[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1985.method2733() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1985.method2733() << 16;
            }
            return var8;
        }
        int var3 = this.field1985.method2733();
        int var4 = this.field1985.method2748();
        if (var3 == 47) {
            this.field1985.field2267 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1985.method2876();
            var4 -= 3;
            int var6 = this.field1975[arg0];
            this.field1980 += (long) (this.field1983 - var5) * (long) var6;
            this.field1983 = var5;
            this.field1985.field2267 += var4;
            return 2;
        } else {
            this.field1985.field2267 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eq.h(I)J")
    public long method2449(int arg0) {
        return (long) this.field1983 * (long) arg0 + this.field1980;
    }

    @ObfuscatedName("eq.p()I")
    public int method2482() {
        int var1 = this.field1972.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1972[var4] >= 0 && this.field1975[var4] < var3) {
                var2 = var4;
                var3 = this.field1975[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eq.t()Z")
    public boolean method2451() {
        int var1 = this.field1972.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1972[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eq.f(J)V")
    public void method2465(long arg0) {
        this.field1980 = arg0;
        int var3 = this.field1972.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1975[var4] = 0;
            this.field1973[var4] = 0;
            this.field1985.field2267 = this.field1974[var4];
            this.method2458(var4);
            this.field1972[var4] = this.field1985.field2267;
        }
    }
}
