package deob;

@ObfuscatedName("eb")
public class class147 {

    @ObfuscatedName("eb.e")
    public class128 field2452 = new class128((byte[]) null);

    @ObfuscatedName("eb.i")
    public int field2457;

    @ObfuscatedName("eb.k")
    public int[] field2453;

    @ObfuscatedName("eb.q")
    public int[] field2454;

    @ObfuscatedName("eb.j")
    public int[] field2455;

    @ObfuscatedName("eb.z")
    public int[] field2456;

    @ObfuscatedName("eb.m")
    public int field2463;

    @ObfuscatedName("eb.a")
    public long field2461;

    @ObfuscatedName("eb.d")
    public static final byte[] field2460 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class147() {
    }

    public class147(byte[] arg0) {
        this.method2903(arg0);
    }

    @ObfuscatedName("eb.e([B)V")
    public void method2903(byte[] arg0) {
        this.field2452.field2043 = arg0;
        this.field2452.field2045 = 10;
        int var2 = this.field2452.method2456();
        this.field2457 = this.field2452.method2456();
        this.field2463 = 500000;
        this.field2453 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2452.method2592();
            int var5 = this.field2452.method2592();
            if (var4 == 1297379947) {
                this.field2453[var3] = this.field2452.field2045;
                var3++;
            }
            this.field2452.field2045 += var5;
        }
        this.field2461 = 0L;
        this.field2454 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2454[var6] = this.field2453[var6];
        }
        this.field2455 = new int[var2];
        this.field2456 = new int[var2];
    }

    @ObfuscatedName("eb.i()V")
    public void method2942() {
        this.field2452.field2043 = null;
        this.field2453 = null;
        this.field2454 = null;
        this.field2455 = null;
        this.field2456 = null;
    }

    @ObfuscatedName("eb.k()Z")
    public boolean method2905() {
        return this.field2452.field2043 != null;
    }

    @ObfuscatedName("eb.q()I")
    public int method2904() {
        return this.field2454.length;
    }

    @ObfuscatedName("eb.j(I)V")
    public void method2906(int arg0) {
        this.field2452.field2045 = this.field2454[arg0];
    }

    @ObfuscatedName("eb.z(I)V")
    public void method2934(int arg0) {
        this.field2454[arg0] = this.field2452.field2045;
    }

    @ObfuscatedName("eb.m()V")
    public void method2908() {
        this.field2452.field2045 = -1;
    }

    @ObfuscatedName("eb.w(I)V")
    public void method2909(int arg0) {
        int var2 = this.field2452.method2469();
        this.field2455[arg0] += var2;
    }

    @ObfuscatedName("eb.a(I)I")
    public int method2910(int arg0) {
        return this.method2911(arg0);
    }

    @ObfuscatedName("eb.d(I)I")
    public int method2911(int arg0) {
        byte var2 = this.field2452.field2043[this.field2452.field2045];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2456[arg0] = var3;
            this.field2452.field2045++;
        } else {
            var3 = this.field2456[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2907(arg0, var3);
        }
        int var4 = this.field2452.method2469();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2452.field2043[this.field2452.field2045] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2452.field2045++;
                this.field2456[arg0] = var5;
                return this.method2907(arg0, var5);
            }
        }
        this.field2452.field2045 += var4;
        return 0;
    }

    @ObfuscatedName("eb.u(II)I")
    public int method2907(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2460[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2452.method2548() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2452.method2548() << 16;
            }
            return var8;
        }
        int var3 = this.field2452.method2548();
        int var4 = this.field2452.method2469();
        if (var3 == 47) {
            this.field2452.field2045 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2452.method2558();
            var4 -= 3;
            int var6 = this.field2455[arg0];
            this.field2461 += (long) (this.field2463 - var5) * (long) var6;
            this.field2463 = var5;
            this.field2452.field2045 += var4;
            return 2;
        } else {
            this.field2452.field2045 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eb.p(I)J")
    public long method2913(int arg0) {
        return (long) this.field2463 * (long) arg0 + this.field2461;
    }

    @ObfuscatedName("eb.t()I")
    public int method2914() {
        int var1 = this.field2454.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2454[var4] >= 0 && this.field2455[var4] < var3) {
                var2 = var4;
                var3 = this.field2455[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eb.g()Z")
    public boolean method2915() {
        int var1 = this.field2454.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2454[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eb.o(J)V")
    public void method2916(long arg0) {
        this.field2461 = arg0;
        int var3 = this.field2454.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2455[var4] = 0;
            this.field2456[var4] = 0;
            this.field2452.field2045 = this.field2453[var4];
            this.method2909(var4);
            this.field2454[var4] = this.field2452.field2045;
        }
    }
}
