package deob;

@ObfuscatedName("gg")
public class class201 {

    @ObfuscatedName("gg.u")
    public class300 field2477 = new class300((byte[]) null);

    @ObfuscatedName("gg.f")
    public int field2471;

    @ObfuscatedName("gg.b")
    public int[] field2472;

    @ObfuscatedName("gg.g")
    public int[] field2473;

    @ObfuscatedName("gg.z")
    public int[] field2474;

    @ObfuscatedName("gg.p")
    public int[] field2475;

    @ObfuscatedName("gg.h")
    public int field2476;

    @ObfuscatedName("gg.w")
    public long field2483;

    @ObfuscatedName("gg.i")
    public static final byte[] field2479 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class201() {
    }

    public class201(byte[] arg0) {
        this.method3543(arg0);
    }

    @ObfuscatedName("gg.u([B)V")
    public void method3543(byte[] arg0) {
        this.field2477.field3708 = arg0;
        this.field2477.field3707 = 10;
        int var2 = this.field2477.method5337();
        this.field2471 = this.field2477.method5337();
        this.field2476 = 500000;
        this.field2472 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2477.method5277();
            int var5 = this.field2477.method5277();
            if (var4 == 1297379947) {
                this.field2472[var3] = this.field2477.field3707;
                var3++;
            }
            this.field2477.field3707 += var5;
        }
        this.field2483 = 0L;
        this.field2473 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2473[var6] = this.field2472[var6];
        }
        this.field2474 = new int[var2];
        this.field2475 = new int[var2];
    }

    @ObfuscatedName("gg.f()V")
    public void method3542() {
        this.field2477.field3708 = null;
        this.field2472 = null;
        this.field2473 = null;
        this.field2474 = null;
        this.field2475 = null;
    }

    @ObfuscatedName("gg.b()Z")
    public boolean method3588() {
        return this.field2477.field3708 != null;
    }

    @ObfuscatedName("gg.g()I")
    public int method3544() {
        return this.field2473.length;
    }

    @ObfuscatedName("gg.z(I)V")
    public void method3545(int arg0) {
        this.field2477.field3707 = this.field2473[arg0];
    }

    @ObfuscatedName("gg.p(I)V")
    public void method3540(int arg0) {
        this.field2473[arg0] = this.field2477.field3707;
    }

    @ObfuscatedName("gg.h()V")
    public void method3590() {
        this.field2477.field3707 = -1;
    }

    @ObfuscatedName("gg.y(I)V")
    public void method3548(int arg0) {
        int var2 = this.field2477.method5156();
        this.field2474[arg0] += var2;
    }

    @ObfuscatedName("gg.w(I)I")
    public int method3582(int arg0) {
        return this.method3593(arg0);
    }

    @ObfuscatedName("gg.i(I)I")
    public int method3593(int arg0) {
        byte var2 = this.field2477.field3708[this.field2477.field3707];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2475[arg0] = var3;
            this.field2477.field3707++;
        } else {
            var3 = this.field2475[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3541(arg0, var3);
        }
        int var4 = this.field2477.method5156();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2477.field3708[this.field2477.field3707] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2477.field3707++;
                this.field2475[arg0] = var5;
                return this.method3541(arg0, var5);
            }
        }
        this.field2477.field3707 += var4;
        return 0;
    }

    @ObfuscatedName("gg.k(II)I")
    public int method3541(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2479[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2477.method5138() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2477.method5138() << 16;
            }
            return var8;
        }
        int var3 = this.field2477.method5138();
        int var4 = this.field2477.method5156();
        if (var3 == 47) {
            this.field2477.field3707 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2477.method5287();
            var4 -= 3;
            int var6 = this.field2474[arg0];
            this.field2483 += (long) (this.field2476 - var5) * (long) var6;
            this.field2476 = var5;
            this.field2477.field3707 += var4;
            return 2;
        } else {
            this.field2477.field3707 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gg.x(I)J")
    public long method3552(int arg0) {
        return (long) this.field2476 * (long) arg0 + this.field2483;
    }

    @ObfuscatedName("gg.o()I")
    public int method3553() {
        int var1 = this.field2473.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2473[var4] >= 0 && this.field2474[var4] < var3) {
                var2 = var4;
                var3 = this.field2474[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gg.e()Z")
    public boolean method3586() {
        int var1 = this.field2473.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2473[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gg.n(J)V")
    public void method3583(long arg0) {
        this.field2483 = arg0;
        int var3 = this.field2473.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2474[var4] = 0;
            this.field2475[var4] = 0;
            this.field2477.field3707 = this.field2472[var4];
            this.method3548(var4);
            this.field2473[var4] = this.field2477.field3707;
        }
    }
}
