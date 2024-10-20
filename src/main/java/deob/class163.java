package deob;

@ObfuscatedName("fp")
public class class163 {

    @ObfuscatedName("fp.e")
    public class108 field2714 = new class108((byte[]) null);

    @ObfuscatedName("fp.v")
    public int field2715;

    @ObfuscatedName("fp.k")
    public int[] field2716;

    @ObfuscatedName("fp.g")
    public int[] field2717;

    @ObfuscatedName("fp.q")
    public int[] field2720;

    @ObfuscatedName("fp.l")
    public int[] field2719;

    @ObfuscatedName("fp.a")
    public int field2725;

    @ObfuscatedName("fp.z")
    public long field2722;

    @ObfuscatedName("fp.w")
    public static final byte[] field2723 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class163() {
    }

    public class163(byte[] arg0) {
        this.method3011(arg0);
    }

    @ObfuscatedName("fp.e([B)V")
    public void method3011(byte[] arg0) {
        this.field2714.field1842 = arg0;
        this.field2714.field1841 = 10;
        int var2 = this.field2714.method2124();
        this.field2715 = this.field2714.method2124();
        this.field2725 = 500000;
        this.field2716 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2714.method2127();
            int var5 = this.field2714.method2127();
            if (var4 == 1297379947) {
                this.field2716[var3] = this.field2714.field1841;
                var3++;
            }
            this.field2714.field1841 += var5;
        }
        this.field2722 = 0L;
        this.field2717 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2717[var6] = this.field2716[var6];
        }
        this.field2720 = new int[var2];
        this.field2719 = new int[var2];
    }

    @ObfuscatedName("fp.v()V")
    public void method3008() {
        this.field2714.field1842 = null;
        this.field2716 = null;
        this.field2717 = null;
        this.field2720 = null;
        this.field2719 = null;
    }

    @ObfuscatedName("fp.k()Z")
    public boolean method2966() {
        return this.field2714.field1842 != null;
    }

    @ObfuscatedName("fp.g()I")
    public int method2967() {
        return this.field2717.length;
    }

    @ObfuscatedName("fp.q(I)V")
    public void method2995(int arg0) {
        this.field2714.field1841 = this.field2717[arg0];
    }

    @ObfuscatedName("fp.l(I)V")
    public void method2965(int arg0) {
        this.field2717[arg0] = this.field2714.field1841;
    }

    @ObfuscatedName("fp.a()V")
    public void method2970() {
        this.field2714.field1841 = -1;
    }

    @ObfuscatedName("fp.b(I)V")
    public void method2971(int arg0) {
        int var2 = this.field2714.method2137();
        this.field2720[arg0] += var2;
    }

    @ObfuscatedName("fp.z(I)I")
    public int method2999(int arg0) {
        return this.method2973(arg0);
    }

    @ObfuscatedName("fp.w(I)I")
    public int method2973(int arg0) {
        byte var2 = this.field2714.field1842[this.field2714.field1841];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2719[arg0] = var3;
            this.field2714.field1841++;
        } else {
            var3 = this.field2719[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2974(arg0, var3);
        }
        int var4 = this.field2714.method2137();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2714.field1842[this.field2714.field1841] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2714.field1841++;
                this.field2719[arg0] = var5;
                return this.method2974(arg0, var5);
            }
        }
        this.field2714.field1841 += var4;
        return 0;
    }

    @ObfuscatedName("fp.j(II)I")
    public int method2974(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2723[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2714.method2122() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2714.method2122() << 16;
            }
            return var8;
        }
        int var3 = this.field2714.method2122();
        int var4 = this.field2714.method2137();
        if (var3 == 47) {
            this.field2714.field1841 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2714.method2126();
            var4 -= 3;
            int var6 = this.field2720[arg0];
            this.field2722 += (long) (this.field2725 - var5) * (long) var6;
            this.field2725 = var5;
            this.field2714.field1841 += var4;
            return 2;
        } else {
            this.field2714.field1841 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fp.p(I)J")
    public long method3004(int arg0) {
        return (long) this.field2725 * (long) arg0 + this.field2722;
    }

    @ObfuscatedName("fp.n()I")
    public int method2975() {
        int var1 = this.field2717.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2717[var4] >= 0 && this.field2720[var4] < var3) {
                var2 = var4;
                var3 = this.field2720[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fp.r()Z")
    public boolean method2976() {
        int var1 = this.field2717.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2717[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fp.s(J)V")
    public void method2977(long arg0) {
        this.field2722 = arg0;
        int var3 = this.field2717.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2720[var4] = 0;
            this.field2719[var4] = 0;
            this.field2714.field1841 = this.field2716[var4];
            this.method2971(var4);
            this.field2717[var4] = this.field2714.field1841;
        }
    }
}
