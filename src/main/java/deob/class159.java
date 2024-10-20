package deob;

@ObfuscatedName("fh")
public class class159 {

    @ObfuscatedName("fh.e")
    public class107 field2678 = new class107((byte[]) null);

    @ObfuscatedName("fh.p")
    public int field2675;

    @ObfuscatedName("fh.a")
    public int[] field2676;

    @ObfuscatedName("fh.g")
    public int[] field2677;

    @ObfuscatedName("fh.u")
    public int[] field2687;

    @ObfuscatedName("fh.k")
    public int[] field2679;

    @ObfuscatedName("fh.m")
    public int field2680;

    @ObfuscatedName("fh.l")
    public long field2682;

    @ObfuscatedName("fh.f")
    public static final byte[] field2683 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class159() {
    }

    public class159(byte[] arg0) {
        this.method2970(arg0);
    }

    @ObfuscatedName("fh.e([B)V")
    public void method2970(byte[] arg0) {
        this.field2678.field1845 = arg0;
        this.field2678.field1841 = 10;
        int var2 = this.field2678.method2182();
        this.field2675 = this.field2678.method2182();
        this.field2680 = 500000;
        this.field2676 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2678.method2146();
            int var5 = this.field2678.method2146();
            if (var4 == 1297379947) {
                this.field2676[var3] = this.field2678.field1841;
                var3++;
            }
            this.field2678.field1841 += var5;
        }
        this.field2682 = 0L;
        this.field2677 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2677[var6] = this.field2676[var6];
        }
        this.field2687 = new int[var2];
        this.field2679 = new int[var2];
    }

    @ObfuscatedName("fh.p()V")
    public void method2971() {
        this.field2678.field1845 = null;
        this.field2676 = null;
        this.field2677 = null;
        this.field2687 = null;
        this.field2679 = null;
    }

    @ObfuscatedName("fh.a()Z")
    public boolean method2972() {
        return this.field2678.field1845 != null;
    }

    @ObfuscatedName("fh.g()I")
    public int method2973() {
        return this.field2677.length;
    }

    @ObfuscatedName("fh.u(I)V")
    public void method2974(int arg0) {
        this.field2678.field1841 = this.field2677[arg0];
    }

    @ObfuscatedName("fh.k(I)V")
    public void method2975(int arg0) {
        this.field2677[arg0] = this.field2678.field1841;
    }

    @ObfuscatedName("fh.m()V")
    public void method2976() {
        this.field2678.field1841 = -1;
    }

    @ObfuscatedName("fh.t(I)V")
    public void method2986(int arg0) {
        int var2 = this.field2678.method2156();
        this.field2687[arg0] += var2;
    }

    @ObfuscatedName("fh.l(I)I")
    public int method2978(int arg0) {
        return this.method2969(arg0);
    }

    @ObfuscatedName("fh.f(I)I")
    public int method2969(int arg0) {
        byte var2 = this.field2678.field1845[this.field2678.field1841];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2679[arg0] = var3;
            this.field2678.field1841++;
        } else {
            var3 = this.field2679[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2980(arg0, var3);
        }
        int var4 = this.field2678.method2156();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2678.field1845[this.field2678.field1841] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2678.field1841++;
                this.field2679[arg0] = var5;
                return this.method2980(arg0, var5);
            }
        }
        this.field2678.field1841 += var4;
        return 0;
    }

    @ObfuscatedName("fh.c(II)I")
    public int method2980(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2683[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2678.method2125() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2678.method2125() << 16;
            }
            return var8;
        }
        int var3 = this.field2678.method2125();
        int var4 = this.field2678.method2156();
        if (var3 == 47) {
            this.field2678.field1841 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2678.method2145();
            var4 -= 3;
            int var6 = this.field2687[arg0];
            this.field2682 += (long) (this.field2680 - var5) * (long) var6;
            this.field2680 = var5;
            this.field2678.field1841 += var4;
            return 2;
        } else {
            this.field2678.field1841 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fh.i(I)J")
    public long method2998(int arg0) {
        return (long) this.field2680 * (long) arg0 + this.field2682;
    }

    @ObfuscatedName("fh.o()I")
    public int method2982() {
        int var1 = this.field2677.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2677[var4] >= 0 && this.field2687[var4] < var3) {
                var2 = var4;
                var3 = this.field2687[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fh.d()Z")
    public boolean method2983() {
        int var1 = this.field2677.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2677[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fh.b(J)V")
    public void method2997(long arg0) {
        this.field2682 = arg0;
        int var3 = this.field2677.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2687[var4] = 0;
            this.field2679[var4] = 0;
            this.field2678.field1841 = this.field2676[var4];
            this.method2986(var4);
            this.field2677[var4] = this.field2678.field1841;
        }
    }
}
