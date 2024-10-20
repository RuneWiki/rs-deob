package deob;

@ObfuscatedName("gm")
public class class201 {

    @ObfuscatedName("gm.q")
    public class301 field2471 = new class301((byte[]) null);

    @ObfuscatedName("gm.w")
    public int field2464;

    @ObfuscatedName("gm.e")
    public int[] field2462;

    @ObfuscatedName("gm.p")
    public int[] field2463;

    @ObfuscatedName("gm.k")
    public int[] field2466;

    @ObfuscatedName("gm.l")
    public int[] field2465;

    @ObfuscatedName("gm.b")
    public int field2461;

    @ObfuscatedName("gm.c")
    public long field2473;

    @ObfuscatedName("gm.f")
    public static final byte[] field2469 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class201() {
    }

    public class201(byte[] arg0) {
        this.method3534(arg0);
    }

    @ObfuscatedName("gm.q([B)V")
    public void method3534(byte[] arg0) {
        this.field2471.field3731 = arg0;
        this.field2471.field3733 = 10;
        int var2 = this.field2471.method5069();
        this.field2464 = this.field2471.method5069();
        this.field2461 = 500000;
        this.field2462 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2471.method5072();
            int var5 = this.field2471.method5072();
            if (var4 == 1297379947) {
                this.field2462[var3] = this.field2471.field3733;
                var3++;
            }
            this.field2471.field3733 += var5;
        }
        this.field2473 = 0L;
        this.field2463 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2463[var6] = this.field2462[var6];
        }
        this.field2466 = new int[var2];
        this.field2465 = new int[var2];
    }

    @ObfuscatedName("gm.w()V")
    public void method3488() {
        this.field2471.field3731 = null;
        this.field2462 = null;
        this.field2463 = null;
        this.field2466 = null;
        this.field2465 = null;
    }

    @ObfuscatedName("gm.e()Z")
    public boolean method3490() {
        return this.field2471.field3731 != null;
    }

    @ObfuscatedName("gm.p()I")
    public int method3506() {
        return this.field2463.length;
    }

    @ObfuscatedName("gm.k(I)V")
    public void method3492(int arg0) {
        this.field2471.field3733 = this.field2463[arg0];
    }

    @ObfuscatedName("gm.l(I)V")
    public void method3493(int arg0) {
        this.field2463[arg0] = this.field2471.field3733;
    }

    @ObfuscatedName("gm.b()V")
    public void method3504() {
        this.field2471.field3733 = -1;
    }

    @ObfuscatedName("gm.i(I)V")
    public void method3522(int arg0) {
        int var2 = this.field2471.method5230();
        this.field2466[arg0] += var2;
    }

    @ObfuscatedName("gm.c(I)I")
    public int method3526(int arg0) {
        return this.method3496(arg0);
    }

    @ObfuscatedName("gm.u(I)I")
    public int method3496(int arg0) {
        byte var2 = this.field2471.field3731[this.field2471.field3733];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2465[arg0] = var3;
            this.field2471.field3733++;
        } else {
            var3 = this.field2465[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3497(arg0, var3);
        }
        int var4 = this.field2471.method5230();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2471.field3731[this.field2471.field3733] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2471.field3733++;
                this.field2465[arg0] = var5;
                return this.method3497(arg0, var5);
            }
        }
        this.field2471.field3733 += var4;
        return 0;
    }

    @ObfuscatedName("gm.x(II)I")
    public int method3497(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2469[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2471.method5077() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2471.method5077() << 16;
            }
            return var8;
        }
        int var3 = this.field2471.method5077();
        int var4 = this.field2471.method5230();
        if (var3 == 47) {
            this.field2471.field3733 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2471.method5140();
            var4 -= 3;
            int var6 = this.field2466[arg0];
            this.field2473 += (long) (this.field2461 - var5) * (long) var6;
            this.field2461 = var5;
            this.field2471.field3733 += var4;
            return 2;
        } else {
            this.field2471.field3733 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gm.r(I)J")
    public long method3518(int arg0) {
        return (long) this.field2461 * (long) arg0 + this.field2473;
    }

    @ObfuscatedName("gm.v()I")
    public int method3499() {
        int var1 = this.field2463.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2463[var4] >= 0 && this.field2466[var4] < var3) {
                var2 = var4;
                var3 = this.field2466[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gm.y()Z")
    public boolean method3513() {
        int var1 = this.field2463.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2463[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gm.g(J)V")
    public void method3501(long arg0) {
        this.field2473 = arg0;
        int var3 = this.field2463.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2466[var4] = 0;
            this.field2465[var4] = 0;
            this.field2471.field3733 = this.field2462[var4];
            this.method3522(var4);
            this.field2463[var4] = this.field2471.field3733;
        }
    }
}
