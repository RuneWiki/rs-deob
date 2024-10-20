package deob;

@ObfuscatedName("ht")
public class class223 {

    @ObfuscatedName("ht.g")
    public class185 field2598 = new class185((byte[]) null);

    @ObfuscatedName("ht.r")
    public int field2589;

    @ObfuscatedName("ht.e")
    public int[] field2590;

    @ObfuscatedName("ht.q")
    public int[] field2591;

    @ObfuscatedName("ht.c")
    public int[] field2592;

    @ObfuscatedName("ht.l")
    public int[] field2593;

    @ObfuscatedName("ht.b")
    public int field2594;

    @ObfuscatedName("ht.n")
    public long field2596;

    @ObfuscatedName("ht.i")
    public static final byte[] field2595 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class223() {
    }

    public class223(byte[] arg0) {
        this.method4182(arg0);
    }

    @ObfuscatedName("ht.g([B)V")
    public void method4182(byte[] arg0) {
        this.field2598.field2405 = arg0;
        this.field2598.field2406 = 10;
        int var2 = this.field2598.method3467();
        this.field2589 = this.field2598.method3467();
        this.field2594 = 500000;
        this.field2590 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2598.method3588();
            int var5 = this.field2598.method3588();
            if (var4 == 1297379947) {
                this.field2590[var3] = this.field2598.field2406;
                var3++;
            }
            this.field2598.field2406 += var5;
        }
        this.field2596 = 0L;
        this.field2591 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2591[var6] = this.field2590[var6];
        }
        this.field2592 = new int[var2];
        this.field2593 = new int[var2];
    }

    @ObfuscatedName("ht.r()V")
    public void method4233() {
        this.field2598.field2405 = null;
        this.field2590 = null;
        this.field2591 = null;
        this.field2592 = null;
        this.field2593 = null;
    }

    @ObfuscatedName("ht.e()Z")
    public boolean method4180() {
        return this.field2598.field2405 != null;
    }

    @ObfuscatedName("ht.q()I")
    public int method4223() {
        return this.field2591.length;
    }

    @ObfuscatedName("ht.c(I)V")
    public void method4219(int arg0) {
        this.field2598.field2406 = this.field2591[arg0];
    }

    @ObfuscatedName("ht.i(I)V")
    public void method4186(int arg0) {
        this.field2591[arg0] = this.field2598.field2406;
    }

    @ObfuscatedName("ht.p()V")
    public void method4187() {
        this.field2598.field2406 = -1;
    }

    @ObfuscatedName("ht.m(I)V")
    public void method4188(int arg0) {
        int var2 = this.field2598.method3483();
        this.field2592[arg0] += var2;
    }

    @ObfuscatedName("ht.d(I)I")
    public int method4189(int arg0) {
        return this.method4190(arg0);
    }

    @ObfuscatedName("ht.j(I)I")
    public int method4190(int arg0) {
        byte var2 = this.field2598.field2405[this.field2598.field2406];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2593[arg0] = var3;
            this.field2598.field2406++;
        } else {
            var3 = this.field2593[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4191(arg0, var3);
        }
        int var4 = this.field2598.method3483();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2598.field2405[this.field2598.field2406] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2598.field2406++;
                this.field2593[arg0] = var5;
                return this.method4191(arg0, var5);
            }
        }
        this.field2598.field2406 += var4;
        return 0;
    }

    @ObfuscatedName("ht.x(II)I")
    public int method4191(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2595[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2598.method3679() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2598.method3679() << 16;
            }
            return var8;
        }
        int var3 = this.field2598.method3679();
        int var4 = this.field2598.method3483();
        if (var3 == 47) {
            this.field2598.field2406 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2598.method3469();
            var4 -= 3;
            int var6 = this.field2592[arg0];
            this.field2596 += (long) (this.field2594 - var5) * (long) var6;
            this.field2594 = var5;
            this.field2598.field2406 += var4;
            return 2;
        } else {
            this.field2598.field2406 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ht.v(I)J")
    public long method4192(int arg0) {
        return (long) this.field2594 * (long) arg0 + this.field2596;
    }

    @ObfuscatedName("ht.h()I")
    public int method4224() {
        int var1 = this.field2591.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2591[var4] >= 0 && this.field2592[var4] < var3) {
                var2 = var4;
                var3 = this.field2592[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ht.f()Z")
    public boolean method4194() {
        int var1 = this.field2591.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2591[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ht.a(J)V")
    public void method4185(long arg0) {
        this.field2596 = arg0;
        int var3 = this.field2591.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2592[var4] = 0;
            this.field2593[var4] = 0;
            this.field2598.field2406 = this.field2590[var4];
            this.method4188(var4);
            this.field2591[var4] = this.field2598.field2406;
        }
    }
}
