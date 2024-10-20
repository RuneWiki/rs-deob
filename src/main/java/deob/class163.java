package deob;

@ObfuscatedName("fj")
public class class163 {

    @ObfuscatedName("fj.g")
    public class108 field2717 = new class108((byte[]) null);

    @ObfuscatedName("fj.j")
    public int field2706;

    @ObfuscatedName("fj.z")
    public int[] field2718;

    @ObfuscatedName("fj.b")
    public int[] field2705;

    @ObfuscatedName("fj.k")
    public int[] field2709;

    @ObfuscatedName("fj.c")
    public int[] field2710;

    @ObfuscatedName("fj.w")
    public int field2711;

    @ObfuscatedName("fj.n")
    public long field2713;

    @ObfuscatedName("fj.d")
    public static final byte[] field2714 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class163() {
    }

    public class163(byte[] arg0) {
        this.method2912(arg0);
    }

    @ObfuscatedName("fj.g([B)V")
    public void method2912(byte[] arg0) {
        this.field2717.field1828 = arg0;
        this.field2717.field1824 = 10;
        int var2 = this.field2717.method2263();
        this.field2706 = this.field2717.method2263();
        this.field2711 = 500000;
        this.field2718 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2717.method2117();
            int var5 = this.field2717.method2117();
            if (var4 == 1297379947) {
                this.field2718[var3] = this.field2717.field1824;
                var3++;
            }
            this.field2717.field1824 += var5;
        }
        this.field2713 = 0L;
        this.field2705 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2705[var6] = this.field2718[var6];
        }
        this.field2709 = new int[var2];
        this.field2710 = new int[var2];
    }

    @ObfuscatedName("fj.j()V")
    public void method2913() {
        this.field2717.field1828 = null;
        this.field2718 = null;
        this.field2705 = null;
        this.field2709 = null;
        this.field2710 = null;
    }

    @ObfuscatedName("fj.z()Z")
    public boolean method2953() {
        return this.field2717.field1828 != null;
    }

    @ObfuscatedName("fj.b()I")
    public int method2919() {
        return this.field2705.length;
    }

    @ObfuscatedName("fj.k(I)V")
    public void method2915(int arg0) {
        this.field2717.field1824 = this.field2705[arg0];
    }

    @ObfuscatedName("fj.c(I)V")
    public void method2914(int arg0) {
        this.field2705[arg0] = this.field2717.field1824;
    }

    @ObfuscatedName("fj.w()V")
    public void method2917() {
        this.field2717.field1824 = -1;
    }

    @ObfuscatedName("fj.l(I)V")
    public void method2918(int arg0) {
        int var2 = this.field2717.method2098();
        this.field2709[arg0] += var2;
    }

    @ObfuscatedName("fj.n(I)I")
    public int method2950(int arg0) {
        return this.method2920(arg0);
    }

    @ObfuscatedName("fj.d(I)I")
    public int method2920(int arg0) {
        byte var2 = this.field2717.field1828[this.field2717.field1824];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2710[arg0] = var3;
            this.field2717.field1824++;
        } else {
            var3 = this.field2710[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2921(arg0, var3);
        }
        int var4 = this.field2717.method2098();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2717.field1828[this.field2717.field1824] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2717.field1824++;
                this.field2710[arg0] = var5;
                return this.method2921(arg0, var5);
            }
        }
        this.field2717.field1824 += var4;
        return 0;
    }

    @ObfuscatedName("fj.h(II)I")
    public int method2921(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2714[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2717.method2083() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2717.method2083() << 16;
            }
            return var8;
        }
        int var3 = this.field2717.method2083();
        int var4 = this.field2717.method2098();
        if (var3 == 47) {
            this.field2717.field1824 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2717.method2260();
            var4 -= 3;
            int var6 = this.field2709[arg0];
            this.field2713 += (long) (this.field2711 - var5) * (long) var6;
            this.field2711 = var5;
            this.field2717.field1824 += var4;
            return 2;
        } else {
            this.field2717.field1824 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fj.y(I)J")
    public long method2910(int arg0) {
        return (long) this.field2711 * (long) arg0 + this.field2713;
    }

    @ObfuscatedName("fj.p()I")
    public int method2916() {
        int var1 = this.field2705.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2705[var4] >= 0 && this.field2709[var4] < var3) {
                var2 = var4;
                var3 = this.field2709[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fj.i()Z")
    public boolean method2924() {
        int var1 = this.field2705.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2705[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fj.s(J)V")
    public void method2925(long arg0) {
        this.field2713 = arg0;
        int var3 = this.field2705.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2709[var4] = 0;
            this.field2710[var4] = 0;
            this.field2717.field1824 = this.field2718[var4];
            this.method2918(var4);
            this.field2705[var4] = this.field2717.field1824;
        }
    }
}
