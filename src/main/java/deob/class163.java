package deob;

@ObfuscatedName("fg")
public class class163 {

    @ObfuscatedName("fg.x")
    public class108 field2718 = new class108((byte[]) null);

    @ObfuscatedName("fg.v")
    public int field2708;

    @ObfuscatedName("fg.m")
    public int[] field2709;

    @ObfuscatedName("fg.e")
    public int[] field2710;

    @ObfuscatedName("fg.h")
    public int[] field2717;

    @ObfuscatedName("fg.p")
    public int[] field2707;

    @ObfuscatedName("fg.j")
    public int field2713;

    @ObfuscatedName("fg.u")
    public long field2715;

    @ObfuscatedName("fg.l")
    public static final byte[] field2716 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class163() {
    }

    public class163(byte[] arg0) {
        this.method3009(arg0);
    }

    @ObfuscatedName("fg.x([B)V")
    public void method3009(byte[] arg0) {
        this.field2718.field1839 = arg0;
        this.field2718.field1841 = 10;
        int var2 = this.field2718.method2129();
        this.field2708 = this.field2718.method2129();
        this.field2713 = 500000;
        this.field2709 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2718.method2132();
            int var5 = this.field2718.method2132();
            if (var4 == 1297379947) {
                this.field2709[var3] = this.field2718.field1841;
                var3++;
            }
            this.field2718.field1841 += var5;
        }
        this.field2715 = 0L;
        this.field2710 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2710[var6] = this.field2709[var6];
        }
        this.field2717 = new int[var2];
        this.field2707 = new int[var2];
    }

    @ObfuscatedName("fg.v()V")
    public void method2988() {
        this.field2718.field1839 = null;
        this.field2709 = null;
        this.field2710 = null;
        this.field2717 = null;
        this.field2707 = null;
    }

    @ObfuscatedName("fg.m()Z")
    public boolean method2989() {
        return this.field2718.field1839 != null;
    }

    @ObfuscatedName("fg.e()I")
    public int method2990() {
        return this.field2710.length;
    }

    @ObfuscatedName("fg.h(I)V")
    public void method2991(int arg0) {
        this.field2718.field1841 = this.field2710[arg0];
    }

    @ObfuscatedName("fg.p(I)V")
    public void method2992(int arg0) {
        this.field2710[arg0] = this.field2718.field1841;
    }

    @ObfuscatedName("fg.j()V")
    public void method2997() {
        this.field2718.field1841 = -1;
    }

    @ObfuscatedName("fg.i(I)V")
    public void method2999(int arg0) {
        int var2 = this.field2718.method2142();
        this.field2717[arg0] += var2;
    }

    @ObfuscatedName("fg.u(I)I")
    public int method2995(int arg0) {
        return this.method2996(arg0);
    }

    @ObfuscatedName("fg.l(I)I")
    public int method2996(int arg0) {
        byte var2 = this.field2718.field1839[this.field2718.field1841];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2707[arg0] = var3;
            this.field2718.field1841++;
        } else {
            var3 = this.field2707[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3007(arg0, var3);
        }
        int var4 = this.field2718.method2142();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2718.field1839[this.field2718.field1841] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2718.field1841++;
                this.field2707[arg0] = var5;
                return this.method3007(arg0, var5);
            }
        }
        this.field2718.field1841 += var4;
        return 0;
    }

    @ObfuscatedName("fg.k(II)I")
    public int method3007(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2716[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2718.method2299() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2718.method2299() << 16;
            }
            return var8;
        }
        int var3 = this.field2718.method2299();
        int var4 = this.field2718.method2142();
        if (var3 == 47) {
            this.field2718.field1841 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2718.method2131();
            var4 -= 3;
            int var6 = this.field2717[arg0];
            this.field2715 += (long) (this.field2713 - var5) * (long) var6;
            this.field2713 = var5;
            this.field2718.field1841 += var4;
            return 2;
        } else {
            this.field2718.field1841 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fg.q(I)J")
    public long method2998(int arg0) {
        return (long) this.field2713 * (long) arg0 + this.field2715;
    }

    @ObfuscatedName("fg.b()I")
    public int method3008() {
        int var1 = this.field2710.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2710[var4] >= 0 && this.field2717[var4] < var3) {
                var2 = var4;
                var3 = this.field2717[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fg.w()Z")
    public boolean method3000() {
        int var1 = this.field2710.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2710[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fg.g(J)V")
    public void method3023(long arg0) {
        this.field2715 = arg0;
        int var3 = this.field2710.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2717[var4] = 0;
            this.field2707[var4] = 0;
            this.field2718.field1841 = this.field2709[var4];
            this.method2999(var4);
            this.field2710[var4] = this.field2718.field1841;
        }
    }
}
