package deob;

@ObfuscatedName("eu")
public class class144 {

    @ObfuscatedName("eu.i")
    public class127 field2423 = new class127((byte[]) null);

    @ObfuscatedName("eu.p")
    public int field2413;

    @ObfuscatedName("eu.a")
    public int[] field2411;

    @ObfuscatedName("eu.l")
    public int[] field2414;

    @ObfuscatedName("eu.q")
    public int[] field2415;

    @ObfuscatedName("eu.b")
    public int[] field2417;

    @ObfuscatedName("eu.u")
    public int field2416;

    @ObfuscatedName("eu.m")
    public long field2419;

    @ObfuscatedName("eu.v")
    public static final byte[] field2420 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class144() {
    }

    public class144(byte[] arg0) {
        this.method2820(arg0);
    }

    @ObfuscatedName("eu.i([B)V")
    public void method2820(byte[] arg0) {
        this.field2423.field2039 = arg0;
        this.field2423.field2037 = 10;
        int var2 = this.field2423.method2413();
        this.field2413 = this.field2423.method2413();
        this.field2416 = 500000;
        this.field2411 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2423.method2416();
            int var5 = this.field2423.method2416();
            if (var4 == 1297379947) {
                this.field2411[var3] = this.field2423.field2037;
                var3++;
            }
            this.field2423.field2037 += var5;
        }
        this.field2419 = 0L;
        this.field2414 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2414[var6] = this.field2411[var6];
        }
        this.field2415 = new int[var2];
        this.field2417 = new int[var2];
    }

    @ObfuscatedName("eu.p()V")
    public void method2821() {
        this.field2423.field2039 = null;
        this.field2411 = null;
        this.field2414 = null;
        this.field2415 = null;
        this.field2417 = null;
    }

    @ObfuscatedName("eu.a()Z")
    public boolean method2822() {
        return this.field2423.field2039 != null;
    }

    @ObfuscatedName("eu.l()I")
    public int method2823() {
        return this.field2414.length;
    }

    @ObfuscatedName("eu.q(I)V")
    public void method2824(int arg0) {
        this.field2423.field2037 = this.field2414[arg0];
    }

    @ObfuscatedName("eu.b(I)V")
    public void method2850(int arg0) {
        this.field2414[arg0] = this.field2423.field2037;
    }

    @ObfuscatedName("eu.u()V")
    public void method2830() {
        this.field2423.field2037 = -1;
    }

    @ObfuscatedName("eu.d(I)V")
    public void method2826(int arg0) {
        int var2 = this.field2423.method2426();
        this.field2415[arg0] += var2;
    }

    @ObfuscatedName("eu.m(I)I")
    public int method2827(int arg0) {
        return this.method2828(arg0);
    }

    @ObfuscatedName("eu.v(I)I")
    public int method2828(int arg0) {
        byte var2 = this.field2423.field2039[this.field2423.field2037];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2417[arg0] = var3;
            this.field2423.field2037++;
        } else {
            var3 = this.field2417[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2829(arg0, var3);
        }
        int var4 = this.field2423.method2426();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2423.field2039[this.field2423.field2037] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2423.field2037++;
                this.field2417[arg0] = var5;
                return this.method2829(arg0, var5);
            }
        }
        this.field2423.field2037 += var4;
        return 0;
    }

    @ObfuscatedName("eu.j(II)I")
    public int method2829(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2420[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2423.method2411() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2423.method2411() << 16;
            }
            return var8;
        }
        int var3 = this.field2423.method2411();
        int var4 = this.field2423.method2426();
        if (var3 == 47) {
            this.field2423.field2037 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2423.method2415();
            var4 -= 3;
            int var6 = this.field2415[arg0];
            this.field2419 += (long) (this.field2416 - var5) * (long) var6;
            this.field2416 = var5;
            this.field2423.field2037 += var4;
            return 2;
        } else {
            this.field2423.field2037 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eu.f(I)J")
    public long method2860(int arg0) {
        return (long) this.field2416 * (long) arg0 + this.field2419;
    }

    @ObfuscatedName("eu.h()I")
    public int method2831() {
        int var1 = this.field2414.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2414[var4] >= 0 && this.field2415[var4] < var3) {
                var2 = var4;
                var3 = this.field2415[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eu.o()Z")
    public boolean method2832() {
        int var1 = this.field2414.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2414[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eu.z(J)V")
    public void method2833(long arg0) {
        this.field2419 = arg0;
        int var3 = this.field2414.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2415[var4] = 0;
            this.field2417[var4] = 0;
            this.field2423.field2037 = this.field2411[var4];
            this.method2826(var4);
            this.field2414[var4] = this.field2423.field2037;
        }
    }
}
