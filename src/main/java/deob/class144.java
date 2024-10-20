package deob;

@ObfuscatedName("et")
public class class144 {

    @ObfuscatedName("et.i")
    public class127 field2416 = new class127((byte[]) null);

    @ObfuscatedName("et.v")
    public int field2404;

    @ObfuscatedName("et.m")
    public int[] field2405;

    @ObfuscatedName("et.j")
    public int[] field2406;

    @ObfuscatedName("et.o")
    public int[] field2407;

    @ObfuscatedName("et.l")
    public int[] field2408;

    @ObfuscatedName("et.g")
    public int field2403;

    @ObfuscatedName("et.c")
    public long field2411;

    @ObfuscatedName("et.z")
    public static final byte[] field2412 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class144() {
    }

    public class144(byte[] arg0) {
        this.method2908(arg0);
    }

    @ObfuscatedName("et.i([B)V")
    public void method2908(byte[] arg0) {
        this.field2416.field2041 = arg0;
        this.field2416.field2039 = 10;
        int var2 = this.field2416.method2493();
        this.field2404 = this.field2416.method2493();
        this.field2403 = 500000;
        this.field2405 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2416.method2668();
            int var5 = this.field2416.method2668();
            if (var4 == 1297379947) {
                this.field2405[var3] = this.field2416.field2039;
                var3++;
            }
            this.field2416.field2039 += var5;
        }
        this.field2411 = 0L;
        this.field2406 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2406[var6] = this.field2405[var6];
        }
        this.field2407 = new int[var2];
        this.field2408 = new int[var2];
    }

    @ObfuscatedName("et.v()V")
    public void method2934() {
        this.field2416.field2041 = null;
        this.field2405 = null;
        this.field2406 = null;
        this.field2407 = null;
        this.field2408 = null;
    }

    @ObfuscatedName("et.m()Z")
    public boolean method2910() {
        return this.field2416.field2041 != null;
    }

    @ObfuscatedName("et.j()I")
    public int method2949() {
        return this.field2406.length;
    }

    @ObfuscatedName("et.o(I)V")
    public void method2912(int arg0) {
        this.field2416.field2039 = this.field2406[arg0];
    }

    @ObfuscatedName("et.l(I)V")
    public void method2913(int arg0) {
        this.field2406[arg0] = this.field2416.field2039;
    }

    @ObfuscatedName("et.g()V")
    public void method2933() {
        this.field2416.field2039 = -1;
    }

    @ObfuscatedName("et.w(I)V")
    public void method2915(int arg0) {
        int var2 = this.field2416.method2505();
        this.field2407[arg0] += var2;
    }

    @ObfuscatedName("et.c(I)I")
    public int method2916(int arg0) {
        return this.method2917(arg0);
    }

    @ObfuscatedName("et.z(I)I")
    public int method2917(int arg0) {
        byte var2 = this.field2416.field2041[this.field2416.field2039];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2408[arg0] = var3;
            this.field2416.field2039++;
        } else {
            var3 = this.field2408[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2914(arg0, var3);
        }
        int var4 = this.field2416.method2505();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2416.field2041[this.field2416.field2039] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2416.field2039++;
                this.field2408[arg0] = var5;
                return this.method2914(arg0, var5);
            }
        }
        this.field2416.field2039 += var4;
        return 0;
    }

    @ObfuscatedName("et.f(II)I")
    public int method2914(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2412[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2416.method2491() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2416.method2491() << 16;
            }
            return var8;
        }
        int var3 = this.field2416.method2491();
        int var4 = this.field2416.method2505();
        if (var3 == 47) {
            this.field2416.field2039 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2416.method2494();
            var4 -= 3;
            int var6 = this.field2407[arg0];
            this.field2411 += (long) (this.field2403 - var5) * (long) var6;
            this.field2403 = var5;
            this.field2416.field2039 += var4;
            return 2;
        } else {
            this.field2416.field2039 += var4;
            return 3;
        }
    }

    @ObfuscatedName("et.a(I)J")
    public long method2924(int arg0) {
        return (long) this.field2403 * (long) arg0 + this.field2411;
    }

    @ObfuscatedName("et.d()I")
    public int method2920() {
        int var1 = this.field2406.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2406[var4] >= 0 && this.field2407[var4] < var3) {
                var2 = var4;
                var3 = this.field2407[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("et.e()Z")
    public boolean method2921() {
        int var1 = this.field2406.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2406[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("et.y(J)V")
    public void method2922(long arg0) {
        this.field2411 = arg0;
        int var3 = this.field2406.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2407[var4] = 0;
            this.field2408[var4] = 0;
            this.field2416.field2039 = this.field2405[var4];
            this.method2915(var4);
            this.field2406[var4] = this.field2416.field2039;
        }
    }
}
