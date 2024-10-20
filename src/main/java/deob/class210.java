package deob;

@ObfuscatedName("hf")
public class class210 {

    @ObfuscatedName("hf.z")
    public class310 field2503 = new class310((byte[]) null);

    @ObfuscatedName("hf.k")
    public int field2493;

    @ObfuscatedName("hf.s")
    public int[] field2496;

    @ObfuscatedName("hf.t")
    public int[] field2498;

    @ObfuscatedName("hf.i")
    public int[] field2495;

    @ObfuscatedName("hf.o")
    public int[] field2494;

    @ObfuscatedName("hf.x")
    public int field2497;

    @ObfuscatedName("hf.g")
    public long field2500;

    @ObfuscatedName("hf.m")
    public static final byte[] field2501 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class210() {
    }

    public class210(byte[] arg0) {
        this.method3628(arg0);
    }

    @ObfuscatedName("hf.z([B)V")
    public void method3628(byte[] arg0) {
        this.field2503.field3731 = arg0;
        this.field2503.field3734 = 10;
        int var2 = this.field2503.method5195();
        this.field2493 = this.field2503.method5195();
        this.field2497 = 500000;
        this.field2496 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2503.method5270();
            int var5 = this.field2503.method5270();
            if (var4 == 1297379947) {
                this.field2496[var3] = this.field2503.field3734;
                var3++;
            }
            this.field2503.field3734 += var5;
        }
        this.field2500 = 0L;
        this.field2498 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2498[var6] = this.field2496[var6];
        }
        this.field2495 = new int[var2];
        this.field2494 = new int[var2];
    }

    @ObfuscatedName("hf.k()V")
    public void method3606() {
        this.field2503.field3731 = null;
        this.field2496 = null;
        this.field2498 = null;
        this.field2495 = null;
        this.field2494 = null;
    }

    @ObfuscatedName("hf.s()Z")
    public boolean method3615() {
        return this.field2503.field3731 != null;
    }

    @ObfuscatedName("hf.t()I")
    public int method3608() {
        return this.field2498.length;
    }

    @ObfuscatedName("hf.i(I)V")
    public void method3609(int arg0) {
        this.field2503.field3734 = this.field2498[arg0];
    }

    @ObfuscatedName("hf.o(I)V")
    public void method3610(int arg0) {
        this.field2498[arg0] = this.field2503.field3734;
    }

    @ObfuscatedName("hf.x()V")
    public void method3611() {
        this.field2503.field3734 = -1;
    }

    @ObfuscatedName("hf.w(I)V")
    public void method3632(int arg0) {
        int var2 = this.field2503.method5211();
        this.field2495[arg0] += var2;
    }

    @ObfuscatedName("hf.g(I)I")
    public int method3642(int arg0) {
        return this.method3614(arg0);
    }

    @ObfuscatedName("hf.m(I)I")
    public int method3614(int arg0) {
        byte var2 = this.field2503.field3731[this.field2503.field3734];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2494[arg0] = var3;
            this.field2503.field3734++;
        } else {
            var3 = this.field2494[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3644(arg0, var3);
        }
        int var4 = this.field2503.method5211();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2503.field3731[this.field2503.field3734] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2503.field3734++;
                this.field2494[arg0] = var5;
                return this.method3644(arg0, var5);
            }
        }
        this.field2503.field3734 += var4;
        return 0;
    }

    @ObfuscatedName("hf.n(II)I")
    public int method3644(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2501[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2503.method5193() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2503.method5193() << 16;
            }
            return var8;
        }
        int var3 = this.field2503.method5193();
        int var4 = this.field2503.method5211();
        if (var3 == 47) {
            this.field2503.field3734 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2503.method5197();
            var4 -= 3;
            int var6 = this.field2495[arg0];
            this.field2500 += (long) (this.field2497 - var5) * (long) var6;
            this.field2497 = var5;
            this.field2503.field3734 += var4;
            return 2;
        } else {
            this.field2503.field3734 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hf.d(I)J")
    public long method3616(int arg0) {
        return (long) this.field2497 * (long) arg0 + this.field2500;
    }

    @ObfuscatedName("hf.h()I")
    public int method3617() {
        int var1 = this.field2498.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2498[var4] >= 0 && this.field2495[var4] < var3) {
                var2 = var4;
                var3 = this.field2495[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hf.a()Z")
    public boolean method3618() {
        int var1 = this.field2498.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2498[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hf.q(J)V")
    public void method3604(long arg0) {
        this.field2500 = arg0;
        int var3 = this.field2498.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2495[var4] = 0;
            this.field2494[var4] = 0;
            this.field2503.field3734 = this.field2496[var4];
            this.method3632(var4);
            this.field2498[var4] = this.field2503.field3734;
        }
    }
}
