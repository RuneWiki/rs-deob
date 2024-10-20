package deob;

@ObfuscatedName("gn")
public class class207 {

    @ObfuscatedName("gn.w")
    public class174 field2570 = new class174((byte[]) null);

    @ObfuscatedName("gn.s")
    public int field2558;

    @ObfuscatedName("gn.q")
    public int[] field2559;

    @ObfuscatedName("gn.o")
    public int[] field2560;

    @ObfuscatedName("gn.g")
    public int[] field2561;

    @ObfuscatedName("gn.v")
    public int[] field2566;

    @ObfuscatedName("gn.p")
    public int field2563;

    @ObfuscatedName("gn.d")
    public long field2557;

    @ObfuscatedName("gn.x")
    public static final byte[] field2569 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class207() {
    }

    public class207(byte[] arg0) {
        this.method3632(arg0);
    }

    @ObfuscatedName("gn.w([B)V")
    public void method3632(byte[] arg0) {
        this.field2570.field2389 = arg0;
        this.field2570.field2390 = 10;
        int var2 = this.field2570.method3178();
        this.field2558 = this.field2570.method3178();
        this.field2563 = 500000;
        this.field2559 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2570.method3131();
            int var5 = this.field2570.method3131();
            if (var4 == 1297379947) {
                this.field2559[var3] = this.field2570.field2390;
                var3++;
            }
            this.field2570.field2390 += var5;
        }
        this.field2557 = 0L;
        this.field2560 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2560[var6] = this.field2559[var6];
        }
        this.field2561 = new int[var2];
        this.field2566 = new int[var2];
    }

    @ObfuscatedName("gn.s()V")
    public void method3633() {
        this.field2570.field2389 = null;
        this.field2559 = null;
        this.field2560 = null;
        this.field2561 = null;
        this.field2566 = null;
    }

    @ObfuscatedName("gn.q()Z")
    public boolean method3634() {
        return this.field2570.field2389 != null;
    }

    @ObfuscatedName("gn.o()I")
    public int method3635() {
        return this.field2560.length;
    }

    @ObfuscatedName("gn.g(I)V")
    public void method3636(int arg0) {
        this.field2570.field2390 = this.field2560[arg0];
    }

    @ObfuscatedName("gn.v(I)V")
    public void method3630(int arg0) {
        this.field2560[arg0] = this.field2570.field2390;
    }

    @ObfuscatedName("gn.p()V")
    public void method3638() {
        this.field2570.field2390 = -1;
    }

    @ObfuscatedName("gn.e(I)V")
    public void method3639(int arg0) {
        int var2 = this.field2570.method2988();
        this.field2561[arg0] += var2;
    }

    @ObfuscatedName("gn.d(I)I")
    public int method3666(int arg0) {
        return this.method3676(arg0);
    }

    @ObfuscatedName("gn.x(I)I")
    public int method3676(int arg0) {
        byte var2 = this.field2570.field2389[this.field2570.field2390];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2566[arg0] = var3;
            this.field2570.field2390++;
        } else {
            var3 = this.field2566[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3641(arg0, var3);
        }
        int var4 = this.field2570.method2988();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2570.field2389[this.field2570.field2390] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2570.field2390++;
                this.field2566[arg0] = var5;
                return this.method3641(arg0, var5);
            }
        }
        this.field2570.field2390 += var4;
        return 0;
    }

    @ObfuscatedName("gn.u(II)I")
    public int method3641(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2569[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2570.method2971() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2570.method2971() << 16;
            }
            return var8;
        }
        int var3 = this.field2570.method2971();
        int var4 = this.field2570.method2988();
        if (var3 == 47) {
            this.field2570.field2390 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2570.method2975();
            var4 -= 3;
            int var6 = this.field2561[arg0];
            this.field2557 += (long) (this.field2563 - var5) * (long) var6;
            this.field2563 = var5;
            this.field2570.field2390 += var4;
            return 2;
        } else {
            this.field2570.field2390 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gn.i(I)J")
    public long method3642(int arg0) {
        return (long) this.field2563 * (long) arg0 + this.field2557;
    }

    @ObfuscatedName("gn.h()I")
    public int method3643() {
        int var1 = this.field2560.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2560[var4] >= 0 && this.field2561[var4] < var3) {
                var2 = var4;
                var3 = this.field2561[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gn.b()Z")
    public boolean method3644() {
        int var1 = this.field2560.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2560[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gn.j(J)V")
    public void method3645(long arg0) {
        this.field2557 = arg0;
        int var3 = this.field2560.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2561[var4] = 0;
            this.field2566[var4] = 0;
            this.field2570.field2390 = this.field2559[var4];
            this.method3639(var4);
            this.field2560[var4] = this.field2570.field2390;
        }
    }
}
