package deob;

@ObfuscatedName("fq")
public class class163 {

    @ObfuscatedName("fq.f")
    public class108 field2724 = new class108((byte[]) null);

    @ObfuscatedName("fq.k")
    public int field2718;

    @ObfuscatedName("fq.y")
    public int[] field2717;

    @ObfuscatedName("fq.e")
    public int[] field2720;

    @ObfuscatedName("fq.r")
    public int[] field2719;

    @ObfuscatedName("fq.a")
    public int[] field2716;

    @ObfuscatedName("fq.n")
    public int field2721;

    @ObfuscatedName("fq.g")
    public long field2723;

    @ObfuscatedName("fq.o")
    public static final byte[] field2715 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class163() {
    }

    public class163(byte[] arg0) {
        this.method3061(arg0);
    }

    @ObfuscatedName("fq.f([B)V")
    public void method3061(byte[] arg0) {
        this.field2724.field1854 = arg0;
        this.field2724.field1859 = 10;
        int var2 = this.field2724.method2160();
        this.field2718 = this.field2724.method2160();
        this.field2721 = 500000;
        this.field2717 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2724.method2256();
            int var5 = this.field2724.method2256();
            if (var4 == 1297379947) {
                this.field2717[var3] = this.field2724.field1859;
                var3++;
            }
            this.field2724.field1859 += var5;
        }
        this.field2723 = 0L;
        this.field2720 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2720[var6] = this.field2717[var6];
        }
        this.field2719 = new int[var2];
        this.field2716 = new int[var2];
    }

    @ObfuscatedName("fq.k()V")
    public void method3021() {
        this.field2724.field1854 = null;
        this.field2717 = null;
        this.field2720 = null;
        this.field2719 = null;
        this.field2716 = null;
    }

    @ObfuscatedName("fq.y()Z")
    public boolean method3022() {
        return this.field2724.field1854 != null;
    }

    @ObfuscatedName("fq.e()I")
    public int method3019() {
        return this.field2720.length;
    }

    @ObfuscatedName("fq.r(I)V")
    public void method3024(int arg0) {
        this.field2724.field1859 = this.field2720[arg0];
    }

    @ObfuscatedName("fq.a(I)V")
    public void method3025(int arg0) {
        this.field2720[arg0] = this.field2724.field1859;
    }

    @ObfuscatedName("fq.n()V")
    public void method3026() {
        this.field2724.field1859 = -1;
    }

    @ObfuscatedName("fq.x(I)V")
    public void method3027(int arg0) {
        int var2 = this.field2724.method2356();
        this.field2719[arg0] += var2;
    }

    @ObfuscatedName("fq.g(I)I")
    public int method3037(int arg0) {
        return this.method3029(arg0);
    }

    @ObfuscatedName("fq.o(I)I")
    public int method3029(int arg0) {
        byte var2 = this.field2724.field1854[this.field2724.field1859];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2716[arg0] = var3;
            this.field2724.field1859++;
        } else {
            var3 = this.field2716[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3030(arg0, var3);
        }
        int var4 = this.field2724.method2356();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2724.field1854[this.field2724.field1859] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2724.field1859++;
                this.field2716[arg0] = var5;
                return this.method3030(arg0, var5);
            }
        }
        this.field2724.field1859 += var4;
        return 0;
    }

    @ObfuscatedName("fq.p(II)I")
    public int method3030(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2715[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2724.method2158() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2724.method2158() << 16;
            }
            return var8;
        }
        int var3 = this.field2724.method2158();
        int var4 = this.field2724.method2356();
        if (var3 == 47) {
            this.field2724.field1859 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2724.method2314();
            var4 -= 3;
            int var6 = this.field2719[arg0];
            this.field2723 += (long) (this.field2721 - var5) * (long) var6;
            this.field2721 = var5;
            this.field2724.field1859 += var4;
            return 2;
        } else {
            this.field2724.field1859 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fq.v(I)J")
    public long method3020(int arg0) {
        return (long) this.field2721 * (long) arg0 + this.field2723;
    }

    @ObfuscatedName("fq.w()I")
    public int method3032() {
        int var1 = this.field2720.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2720[var4] >= 0 && this.field2719[var4] < var3) {
                var2 = var4;
                var3 = this.field2719[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fq.t()Z")
    public boolean method3035() {
        int var1 = this.field2720.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2720[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fq.s(J)V")
    public void method3034(long arg0) {
        this.field2723 = arg0;
        int var3 = this.field2720.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2719[var4] = 0;
            this.field2716[var4] = 0;
            this.field2724.field1859 = this.field2717[var4];
            this.method3027(var4);
            this.field2720[var4] = this.field2724.field1859;
        }
    }
}
