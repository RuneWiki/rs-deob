package deob;

@ObfuscatedName("et")
public class class144 {

    @ObfuscatedName("et.d")
    public class127 field2424 = new class127((byte[]) null);

    @ObfuscatedName("et.g")
    public int field2423;

    @ObfuscatedName("et.a")
    public int[] field2415;

    @ObfuscatedName("et.t")
    public int[] field2416;

    @ObfuscatedName("et.f")
    public int[] field2417;

    @ObfuscatedName("et.c")
    public int[] field2418;

    @ObfuscatedName("et.p")
    public int field2419;

    @ObfuscatedName("et.k")
    public long field2421;

    @ObfuscatedName("et.m")
    public static final byte[] field2422 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class144() {
    }

    public class144(byte[] arg0) {
        this.method2796(arg0);
    }

    @ObfuscatedName("et.d([B)V")
    public void method2796(byte[] arg0) {
        this.field2424.field2035 = arg0;
        this.field2424.field2042 = 10;
        int var2 = this.field2424.method2512();
        this.field2423 = this.field2424.method2512();
        this.field2419 = 500000;
        this.field2415 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2424.method2405();
            int var5 = this.field2424.method2405();
            if (var4 == 1297379947) {
                this.field2415[var3] = this.field2424.field2042;
                var3++;
            }
            this.field2424.field2042 += var5;
        }
        this.field2421 = 0L;
        this.field2416 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2416[var6] = this.field2415[var6];
        }
        this.field2417 = new int[var2];
        this.field2418 = new int[var2];
    }

    @ObfuscatedName("et.g()V")
    public void method2797() {
        this.field2424.field2035 = null;
        this.field2415 = null;
        this.field2416 = null;
        this.field2417 = null;
        this.field2418 = null;
    }

    @ObfuscatedName("et.a()Z")
    public boolean method2819() {
        return this.field2424.field2035 != null;
    }

    @ObfuscatedName("et.t()I")
    public int method2799() {
        return this.field2416.length;
    }

    @ObfuscatedName("et.f(I)V")
    public void method2800(int arg0) {
        this.field2424.field2042 = this.field2416[arg0];
    }

    @ObfuscatedName("et.c(I)V")
    public void method2801(int arg0) {
        this.field2416[arg0] = this.field2424.field2042;
    }

    @ObfuscatedName("et.p()V")
    public void method2802() {
        this.field2424.field2042 = -1;
    }

    @ObfuscatedName("et.s(I)V")
    public void method2803(int arg0) {
        int var2 = this.field2424.method2415();
        this.field2417[arg0] += var2;
    }

    @ObfuscatedName("et.k(I)I")
    public int method2804(int arg0) {
        return this.method2805(arg0);
    }

    @ObfuscatedName("et.m(I)I")
    public int method2805(int arg0) {
        byte var2 = this.field2424.field2035[this.field2424.field2042];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2418[arg0] = var3;
            this.field2424.field2042++;
        } else {
            var3 = this.field2418[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2838(arg0, var3);
        }
        int var4 = this.field2424.method2415();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2424.field2035[this.field2424.field2042] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2424.field2042++;
                this.field2418[arg0] = var5;
                return this.method2838(arg0, var5);
            }
        }
        this.field2424.field2042 += var4;
        return 0;
    }

    @ObfuscatedName("et.y(II)I")
    public int method2838(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2422[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2424.method2509() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2424.method2509() << 16;
            }
            return var8;
        }
        int var3 = this.field2424.method2509();
        int var4 = this.field2424.method2415();
        if (var3 == 47) {
            this.field2424.field2042 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2424.method2404();
            var4 -= 3;
            int var6 = this.field2417[arg0];
            this.field2421 += (long) (this.field2419 - var5) * (long) var6;
            this.field2419 = var5;
            this.field2424.field2042 += var4;
            return 2;
        } else {
            this.field2424.field2042 += var4;
            return 3;
        }
    }

    @ObfuscatedName("et.b(I)J")
    public long method2812(int arg0) {
        return (long) this.field2419 * (long) arg0 + this.field2421;
    }

    @ObfuscatedName("et.l()I")
    public int method2808() {
        int var1 = this.field2416.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2416[var4] >= 0 && this.field2417[var4] < var3) {
                var2 = var4;
                var3 = this.field2417[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("et.x()Z")
    public boolean method2809() {
        int var1 = this.field2416.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2416[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("et.z(J)V")
    public void method2810(long arg0) {
        this.field2421 = arg0;
        int var3 = this.field2416.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2417[var4] = 0;
            this.field2418[var4] = 0;
            this.field2424.field2042 = this.field2415[var4];
            this.method2803(var4);
            this.field2416[var4] = this.field2424.field2042;
        }
    }
}
