package deob;

@ObfuscatedName("fk")
public class class160 {

    @ObfuscatedName("fk.z")
    public class107 field2683 = new class107((byte[]) null);

    @ObfuscatedName("fk.j")
    public int field2689;

    @ObfuscatedName("fk.a")
    public int[] field2685;

    @ObfuscatedName("fk.y")
    public int[] field2684;

    @ObfuscatedName("fk.i")
    public int[] field2687;

    @ObfuscatedName("fk.b")
    public int[] field2688;

    @ObfuscatedName("fk.s")
    public int field2686;

    @ObfuscatedName("fk.p")
    public long field2692;

    @ObfuscatedName("fk.h")
    public static final byte[] field2690 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class160() {
    }

    public class160(byte[] arg0) {
        this.method2970(arg0);
    }

    @ObfuscatedName("fk.z([B)V")
    public void method2970(byte[] arg0) {
        this.field2683.field1823 = arg0;
        this.field2683.field1819 = 10;
        int var2 = this.field2683.method2239();
        this.field2689 = this.field2683.method2239();
        this.field2686 = 500000;
        this.field2685 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2683.method2127();
            int var5 = this.field2683.method2127();
            if (var4 == 1297379947) {
                this.field2685[var3] = this.field2683.field1819;
                var3++;
            }
            this.field2683.field1819 += var5;
        }
        this.field2692 = 0L;
        this.field2684 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2684[var6] = this.field2685[var6];
        }
        this.field2687 = new int[var2];
        this.field2688 = new int[var2];
    }

    @ObfuscatedName("fk.j()V")
    public void method2965() {
        this.field2683.field1823 = null;
        this.field2685 = null;
        this.field2684 = null;
        this.field2687 = null;
        this.field2688 = null;
    }

    @ObfuscatedName("fk.a()Z")
    public boolean method2966() {
        return this.field2683.field1823 != null;
    }

    @ObfuscatedName("fk.y()I")
    public int method2967() {
        return this.field2684.length;
    }

    @ObfuscatedName("fk.i(I)V")
    public void method2968(int arg0) {
        this.field2683.field1819 = this.field2684[arg0];
    }

    @ObfuscatedName("fk.b(I)V")
    public void method2980(int arg0) {
        this.field2684[arg0] = this.field2683.field1819;
    }

    @ObfuscatedName("fk.s()V")
    public void method2993() {
        this.field2683.field1819 = -1;
    }

    @ObfuscatedName("fk.q(I)V")
    public void method3003(int arg0) {
        int var2 = this.field2683.method2215();
        this.field2687[arg0] += var2;
    }

    @ObfuscatedName("fk.p(I)I")
    public int method2972(int arg0) {
        return this.method2973(arg0);
    }

    @ObfuscatedName("fk.h(I)I")
    public int method2973(int arg0) {
        byte var2 = this.field2683.field1823[this.field2683.field1819];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2688[arg0] = var3;
            this.field2683.field1819++;
        } else {
            var3 = this.field2688[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2979(arg0, var3);
        }
        int var4 = this.field2683.method2215();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2683.field1823[this.field2683.field1819] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2683.field1819++;
                this.field2688[arg0] = var5;
                return this.method2979(arg0, var5);
            }
        }
        this.field2683.field1819 += var4;
        return 0;
    }

    @ObfuscatedName("fk.r(II)I")
    public int method2979(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2690[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2683.method2122() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2683.method2122() << 16;
            }
            return var8;
        }
        int var3 = this.field2683.method2122();
        int var4 = this.field2683.method2215();
        if (var3 == 47) {
            this.field2683.field1819 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2683.method2212();
            var4 -= 3;
            int var6 = this.field2687[arg0];
            this.field2692 += (long) (this.field2686 - var5) * (long) var6;
            this.field2686 = var5;
            this.field2683.field1819 += var4;
            return 2;
        } else {
            this.field2683.field1819 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fk.o(I)J")
    public long method2975(int arg0) {
        return (long) this.field2686 * (long) arg0 + this.field2692;
    }

    @ObfuscatedName("fk.f()I")
    public int method2976() {
        int var1 = this.field2684.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2684[var4] >= 0 && this.field2687[var4] < var3) {
                var2 = var4;
                var3 = this.field2687[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fk.u()Z")
    public boolean method2977() {
        int var1 = this.field2684.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2684[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fk.c(J)V")
    public void method2978(long arg0) {
        this.field2692 = arg0;
        int var3 = this.field2684.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2687[var4] = 0;
            this.field2688[var4] = 0;
            this.field2683.field1819 = this.field2685[var4];
            this.method3003(var4);
            this.field2684[var4] = this.field2683.field1819;
        }
    }
}
