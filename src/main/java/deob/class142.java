package deob;

@ObfuscatedName("eo")
public class class142 {

    @ObfuscatedName("eo.u")
    public class154 field1963 = new class154((byte[]) null);

    @ObfuscatedName("eo.x")
    public int field1964;

    @ObfuscatedName("eo.i")
    public int[] field1965;

    @ObfuscatedName("eo.a")
    public int[] field1966;

    @ObfuscatedName("eo.f")
    public int[] field1967;

    @ObfuscatedName("eo.c")
    public int[] field1972;

    @ObfuscatedName("eo.d")
    public int field1969;

    @ObfuscatedName("eo.g")
    public long field1971;

    @ObfuscatedName("eo.z")
    public static final byte[] field1976 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class142() {
    }

    public class142(byte[] arg0) {
        this.method2442(arg0);
    }

    @ObfuscatedName("eo.u([B)V")
    public void method2442(byte[] arg0) {
        this.field1963.field2078 = arg0;
        this.field1963.field2073 = 10;
        int var2 = this.field1963.method2581();
        this.field1964 = this.field1963.method2581();
        this.field1969 = 500000;
        this.field1965 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1963.method2593();
            int var5 = this.field1963.method2593();
            if (var4 == 1297379947) {
                this.field1965[var3] = this.field1963.field2073;
                var3++;
            }
            this.field1963.field2073 += var5;
        }
        this.field1971 = 0L;
        this.field1966 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1966[var6] = this.field1965[var6];
        }
        this.field1967 = new int[var2];
        this.field1972 = new int[var2];
    }

    @ObfuscatedName("eo.x()V")
    public void method2443() {
        this.field1963.field2078 = null;
        this.field1965 = null;
        this.field1966 = null;
        this.field1967 = null;
        this.field1972 = null;
    }

    @ObfuscatedName("eo.i()Z")
    public boolean method2444() {
        return this.field1963.field2078 != null;
    }

    @ObfuscatedName("eo.a()I")
    public int method2445() {
        return this.field1966.length;
    }

    @ObfuscatedName("eo.c(I)V")
    public void method2446(int arg0) {
        this.field1963.field2073 = this.field1966[arg0];
    }

    @ObfuscatedName("eo.g(I)V")
    public void method2447(int arg0) {
        this.field1966[arg0] = this.field1963.field2073;
    }

    @ObfuscatedName("eo.z()V")
    public void method2468() {
        this.field1963.field2073 = -1;
    }

    @ObfuscatedName("eo.t(I)V")
    public void method2449(int arg0) {
        int var2 = this.field1963.method2675();
        this.field1967[arg0] += var2;
    }

    @ObfuscatedName("eo.m(I)I")
    public int method2482(int arg0) {
        return this.method2464(arg0);
    }

    @ObfuscatedName("eo.q(I)I")
    public int method2464(int arg0) {
        byte var2 = this.field1963.field2078[this.field1963.field2073];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1972[arg0] = var3;
            this.field1963.field2073++;
        } else {
            var3 = this.field1972[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2452(arg0, var3);
        }
        int var4 = this.field1963.method2675();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1963.field2078[this.field1963.field2073] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1963.field2073++;
                this.field1972[arg0] = var5;
                return this.method2452(arg0, var5);
            }
        }
        this.field1963.field2073 += var4;
        return 0;
    }

    @ObfuscatedName("eo.e(II)I")
    public int method2452(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1976[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1963.method2708() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1963.method2708() << 16;
            }
            return var8;
        }
        int var3 = this.field1963.method2708();
        int var4 = this.field1963.method2675();
        if (var3 == 47) {
            this.field1963.field2073 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1963.method2599();
            var4 -= 3;
            int var6 = this.field1967[arg0];
            this.field1971 += (long) (this.field1969 - var5) * (long) var6;
            this.field1969 = var5;
            this.field1963.field2073 += var4;
            return 2;
        } else {
            this.field1963.field2073 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eo.v(I)J")
    public long method2453(int arg0) {
        return (long) this.field1969 * (long) arg0 + this.field1971;
    }

    @ObfuscatedName("eo.j()I")
    public int method2454() {
        int var1 = this.field1966.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1966[var4] >= 0 && this.field1967[var4] < var3) {
                var2 = var4;
                var3 = this.field1967[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eo.p()Z")
    public boolean method2473() {
        int var1 = this.field1966.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1966[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eo.k(J)V")
    public void method2491(long arg0) {
        this.field1971 = arg0;
        int var3 = this.field1966.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1967[var4] = 0;
            this.field1972[var4] = 0;
            this.field1963.field2073 = this.field1965[var4];
            this.method2449(var4);
            this.field1966[var4] = this.field1963.field2073;
        }
    }
}
