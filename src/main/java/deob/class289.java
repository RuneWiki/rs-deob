package deob;

@ObfuscatedName("km")
public class class289 {

    @ObfuscatedName("km.h")
    public class467 field3393 = new class467((byte[]) null);

    @ObfuscatedName("km.e")
    public int field3385;

    @ObfuscatedName("km.v")
    public int[] field3388;

    @ObfuscatedName("km.x")
    public int[] field3394;

    @ObfuscatedName("km.m")
    public int[] field3392;

    @ObfuscatedName("km.q")
    public int[] field3389;

    @ObfuscatedName("km.f")
    public int field3384;

    @ObfuscatedName("km.u")
    public long field3390;

    @ObfuscatedName("km.b")
    public static final byte[] field3386 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class289() {
    }

    public class289(byte[] arg0) {
        this.method5123(arg0);
    }

    @ObfuscatedName("km.h([B)V")
    public void method5123(byte[] arg0) {
        this.field3393.field4917 = arg0;
        this.field3393.field4915 = 10;
        int var2 = this.field3393.method7794();
        this.field3385 = this.field3393.method7794();
        this.field3384 = 500000;
        this.field3388 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3393.method7946();
            int var5 = this.field3393.method7946();
            if (var4 == 1297379947) {
                this.field3388[var3] = this.field3393.field4915;
                var3++;
            }
            this.field3393.field4915 += var5;
        }
        this.field3390 = 0L;
        this.field3394 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3394[var6] = this.field3388[var6];
        }
        this.field3392 = new int[var2];
        this.field3389 = new int[var2];
    }

    @ObfuscatedName("km.e()V")
    public void method5124() {
        this.field3393.field4917 = null;
        this.field3388 = null;
        this.field3394 = null;
        this.field3392 = null;
        this.field3389 = null;
    }

    @ObfuscatedName("km.v()Z")
    public boolean method5125() {
        return this.field3393.field4917 != null;
    }

    @ObfuscatedName("km.x()I")
    public int method5126() {
        return this.field3394.length;
    }

    @ObfuscatedName("km.m(I)V")
    public void method5127(int arg0) {
        this.field3393.field4915 = this.field3394[arg0];
    }

    @ObfuscatedName("km.q(I)V")
    public void method5128(int arg0) {
        this.field3394[arg0] = this.field3393.field4915;
    }

    @ObfuscatedName("km.f()V")
    public void method5129() {
        this.field3393.field4915 = -1;
    }

    @ObfuscatedName("km.r(I)V")
    public void method5148(int arg0) {
        int var2 = this.field3393.method7882();
        this.field3392[arg0] += var2;
    }

    @ObfuscatedName("km.u(I)I")
    public int method5131(int arg0) {
        return this.method5132(arg0);
    }

    @ObfuscatedName("km.b(I)I")
    public int method5132(int arg0) {
        byte var2 = this.field3393.field4917[this.field3393.field4915];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3389[arg0] = var3;
            this.field3393.field4915++;
        } else {
            var3 = this.field3389[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5156(arg0, var3);
        }
        int var4 = this.field3393.method7882();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3393.field4917[this.field3393.field4915] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3393.field4915++;
                this.field3389[arg0] = var5;
                return this.method5156(arg0, var5);
            }
        }
        this.field3393.field4915 += var4;
        return 0;
    }

    @ObfuscatedName("km.j(II)I")
    public int method5156(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3386[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3393.method7792() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3393.method7792() << 16;
            }
            return var8;
        }
        int var3 = this.field3393.method7792();
        int var4 = this.field3393.method7882();
        if (var3 == 47) {
            this.field3393.field4915 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3393.method7796();
            var4 -= 3;
            int var6 = this.field3392[arg0];
            this.field3390 += (long) (this.field3384 - var5) * (long) var6;
            this.field3384 = var5;
            this.field3393.field4915 += var4;
            return 2;
        } else {
            this.field3393.field4915 += var4;
            return 3;
        }
    }

    @ObfuscatedName("km.g(I)J")
    public long method5151(int arg0) {
        return (long) this.field3384 * (long) arg0 + this.field3390;
    }

    @ObfuscatedName("km.i()I")
    public int method5135() {
        int var1 = this.field3394.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3394[var4] >= 0 && this.field3392[var4] < var3) {
                var2 = var4;
                var3 = this.field3392[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("km.o()Z")
    public boolean method5161() {
        int var1 = this.field3394.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3394[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("km.n(J)V")
    public void method5137(long arg0) {
        this.field3390 = arg0;
        int var3 = this.field3394.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3392[var4] = 0;
            this.field3389[var4] = 0;
            this.field3393.field4915 = this.field3388[var4];
            this.method5148(var4);
            this.field3394[var4] = this.field3393.field4915;
        }
    }
}
