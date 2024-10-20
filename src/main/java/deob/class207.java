package deob;

@ObfuscatedName("go")
public class class207 {

    @ObfuscatedName("go.d")
    public class174 field2589 = new class174((byte[]) null);

    @ObfuscatedName("go.k")
    public int field2580;

    @ObfuscatedName("go.e")
    public int[] field2581;

    @ObfuscatedName("go.p")
    public int[] field2582;

    @ObfuscatedName("go.q")
    public int[] field2587;

    @ObfuscatedName("go.s")
    public int[] field2592;

    @ObfuscatedName("go.r")
    public int field2585;

    @ObfuscatedName("go.v")
    public long field2584;

    @ObfuscatedName("go.t")
    public static final byte[] field2588 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class207() {
    }

    public class207(byte[] arg0) {
        this.method3656(arg0);
    }

    @ObfuscatedName("go.d([B)V")
    public void method3656(byte[] arg0) {
        this.field2589.field2409 = arg0;
        this.field2589.field2405 = 10;
        int var2 = this.field2589.method3035();
        this.field2580 = this.field2589.method3035();
        this.field2585 = 500000;
        this.field2581 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2589.method2960();
            int var5 = this.field2589.method2960();
            if (var4 == 1297379947) {
                this.field2581[var3] = this.field2589.field2405;
                var3++;
            }
            this.field2589.field2405 += var5;
        }
        this.field2584 = 0L;
        this.field2582 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2582[var6] = this.field2581[var6];
        }
        this.field2587 = new int[var2];
        this.field2592 = new int[var2];
    }

    @ObfuscatedName("go.k()V")
    public void method3622() {
        this.field2589.field2409 = null;
        this.field2581 = null;
        this.field2582 = null;
        this.field2587 = null;
        this.field2592 = null;
    }

    @ObfuscatedName("go.e()Z")
    public boolean method3637() {
        return this.field2589.field2409 != null;
    }

    @ObfuscatedName("go.p()I")
    public int method3636() {
        return this.field2582.length;
    }

    @ObfuscatedName("go.q(I)V")
    public void method3659(int arg0) {
        this.field2589.field2405 = this.field2582[arg0];
    }

    @ObfuscatedName("go.s(I)V")
    public void method3626(int arg0) {
        this.field2582[arg0] = this.field2589.field2405;
    }

    @ObfuscatedName("go.r()V")
    public void method3627() {
        this.field2589.field2405 = -1;
    }

    @ObfuscatedName("go.g(I)V")
    public void method3649(int arg0) {
        int var2 = this.field2589.method2990();
        this.field2587[arg0] += var2;
    }

    @ObfuscatedName("go.v(I)I")
    public int method3629(int arg0) {
        return this.method3663(arg0);
    }

    @ObfuscatedName("go.t(I)I")
    public int method3663(int arg0) {
        byte var2 = this.field2589.field2409[this.field2589.field2405];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2592[arg0] = var3;
            this.field2589.field2405++;
        } else {
            var3 = this.field2592[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3631(arg0, var3);
        }
        int var4 = this.field2589.method2990();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2589.field2409[this.field2589.field2405] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2589.field2405++;
                this.field2592[arg0] = var5;
                return this.method3631(arg0, var5);
            }
        }
        this.field2589.field2405 += var4;
        return 0;
    }

    @ObfuscatedName("go.y(II)I")
    public int method3631(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2588[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2589.method2955() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2589.method2955() << 16;
            }
            return var8;
        }
        int var3 = this.field2589.method2955();
        int var4 = this.field2589.method2990();
        if (var3 == 47) {
            this.field2589.field2405 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2589.method3059();
            var4 -= 3;
            int var6 = this.field2587[arg0];
            this.field2584 += (long) (this.field2585 - var5) * (long) var6;
            this.field2585 = var5;
            this.field2589.field2405 += var4;
            return 2;
        } else {
            this.field2589.field2405 += var4;
            return 3;
        }
    }

    @ObfuscatedName("go.o(I)J")
    public long method3632(int arg0) {
        return (long) this.field2585 * (long) arg0 + this.field2584;
    }

    @ObfuscatedName("go.i()I")
    public int method3633() {
        int var1 = this.field2582.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2582[var4] >= 0 && this.field2587[var4] < var3) {
                var2 = var4;
                var3 = this.field2587[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("go.u()Z")
    public boolean method3634() {
        int var1 = this.field2582.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2582[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("go.x(J)V")
    public void method3635(long arg0) {
        this.field2584 = arg0;
        int var3 = this.field2582.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2587[var4] = 0;
            this.field2592[var4] = 0;
            this.field2589.field2405 = this.field2581[var4];
            this.method3649(var4);
            this.field2582[var4] = this.field2589.field2405;
        }
    }
}
