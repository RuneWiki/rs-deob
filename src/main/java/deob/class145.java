package deob;

@ObfuscatedName("ej")
public class class145 {

    @ObfuscatedName("ej.q")
    public class127 field2435 = new class127((byte[]) null);

    @ObfuscatedName("ej.c")
    public int field2432;

    @ObfuscatedName("ej.p")
    public int[] field2433;

    @ObfuscatedName("ej.z")
    public int[] field2434;

    @ObfuscatedName("ej.m")
    public int[] field2439;

    @ObfuscatedName("ej.k")
    public int[] field2431;

    @ObfuscatedName("ej.v")
    public int field2437;

    @ObfuscatedName("ej.d")
    public long field2441;

    @ObfuscatedName("ej.l")
    public static final byte[] field2440 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class145() {
    }

    public class145(byte[] arg0) {
        this.method2868(arg0);
    }

    @ObfuscatedName("ej.q([B)V")
    public void method2868(byte[] arg0) {
        this.field2435.field2042 = arg0;
        this.field2435.field2039 = 10;
        int var2 = this.field2435.method2427();
        this.field2432 = this.field2435.method2427();
        this.field2437 = 500000;
        this.field2433 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2435.method2430();
            int var5 = this.field2435.method2430();
            if (var4 == 1297379947) {
                this.field2433[var3] = this.field2435.field2039;
                var3++;
            }
            this.field2435.field2039 += var5;
        }
        this.field2441 = 0L;
        this.field2434 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2434[var6] = this.field2433[var6];
        }
        this.field2439 = new int[var2];
        this.field2431 = new int[var2];
    }

    @ObfuscatedName("ej.c()V")
    public void method2825() {
        this.field2435.field2042 = null;
        this.field2433 = null;
        this.field2434 = null;
        this.field2439 = null;
        this.field2431 = null;
    }

    @ObfuscatedName("ej.p()Z")
    public boolean method2826() {
        return this.field2435.field2042 != null;
    }

    @ObfuscatedName("ej.z()I")
    public int method2844() {
        return this.field2434.length;
    }

    @ObfuscatedName("ej.m(I)V")
    public void method2828(int arg0) {
        this.field2435.field2039 = this.field2434[arg0];
    }

    @ObfuscatedName("ej.k(I)V")
    public void method2829(int arg0) {
        this.field2434[arg0] = this.field2435.field2039;
    }

    @ObfuscatedName("ej.v()V")
    public void method2830() {
        this.field2435.field2039 = -1;
    }

    @ObfuscatedName("ej.y(I)V")
    public void method2824(int arg0) {
        int var2 = this.field2435.method2514();
        this.field2439[arg0] += var2;
    }

    @ObfuscatedName("ej.d(I)I")
    public int method2832(int arg0) {
        return this.method2839(arg0);
    }

    @ObfuscatedName("ej.l(I)I")
    public int method2839(int arg0) {
        byte var2 = this.field2435.field2042[this.field2435.field2039];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2431[arg0] = var3;
            this.field2435.field2039++;
        } else {
            var3 = this.field2431[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2834(arg0, var3);
        }
        int var4 = this.field2435.method2514();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2435.field2042[this.field2435.field2039] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2435.field2039++;
                this.field2431[arg0] = var5;
                return this.method2834(arg0, var5);
            }
        }
        this.field2435.field2039 += var4;
        return 0;
    }

    @ObfuscatedName("ej.h(II)I")
    public int method2834(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2440[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2435.method2534() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2435.method2534() << 16;
            }
            return var8;
        }
        int var3 = this.field2435.method2534();
        int var4 = this.field2435.method2514();
        if (var3 == 47) {
            this.field2435.field2039 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2435.method2429();
            var4 -= 3;
            int var6 = this.field2439[arg0];
            this.field2441 += (long) (this.field2437 - var5) * (long) var6;
            this.field2437 = var5;
            this.field2435.field2039 += var4;
            return 2;
        } else {
            this.field2435.field2039 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ej.b(I)J")
    public long method2835(int arg0) {
        return (long) this.field2437 * (long) arg0 + this.field2441;
    }

    @ObfuscatedName("ej.r()I")
    public int method2852() {
        int var1 = this.field2434.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2434[var4] >= 0 && this.field2439[var4] < var3) {
                var2 = var4;
                var3 = this.field2439[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ej.t()Z")
    public boolean method2849() {
        int var1 = this.field2434.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2434[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ej.u(J)V")
    public void method2838(long arg0) {
        this.field2441 = arg0;
        int var3 = this.field2434.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2439[var4] = 0;
            this.field2431[var4] = 0;
            this.field2435.field2039 = this.field2433[var4];
            this.method2824(var4);
            this.field2434[var4] = this.field2435.field2039;
        }
    }
}
