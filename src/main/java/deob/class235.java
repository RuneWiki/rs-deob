package deob;

@ObfuscatedName("ir")
public class class235 {

    @ObfuscatedName("ir.v")
    public class383 field2876 = new class383((byte[]) null);

    @ObfuscatedName("ir.n")
    public int field2864;

    @ObfuscatedName("ir.f")
    public int[] field2869;

    @ObfuscatedName("ir.y")
    public int[] field2866;

    @ObfuscatedName("ir.p")
    public int[] field2865;

    @ObfuscatedName("ir.j")
    public int[] field2863;

    @ObfuscatedName("ir.r")
    public int field2868;

    @ObfuscatedName("ir.d")
    public long field2871;

    @ObfuscatedName("ir.s")
    public static final byte[] field2872 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class235() {
    }

    public class235(byte[] arg0) {
        this.method4160(arg0);
    }

    @ObfuscatedName("ir.v([B)V")
    public void method4160(byte[] arg0) {
        this.field2876.field4155 = arg0;
        this.field2876.field4158 = 10;
        int var2 = this.field2876.method5967();
        this.field2864 = this.field2876.method5967();
        this.field2868 = 500000;
        this.field2869 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2876.method5970();
            int var5 = this.field2876.method5970();
            if (var4 == 1297379947) {
                this.field2869[var3] = this.field2876.field4158;
                var3++;
            }
            this.field2876.field4158 += var5;
        }
        this.field2871 = 0L;
        this.field2866 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2866[var6] = this.field2869[var6];
        }
        this.field2865 = new int[var2];
        this.field2863 = new int[var2];
    }

    @ObfuscatedName("ir.n()V")
    public void method4153() {
        this.field2876.field4155 = null;
        this.field2869 = null;
        this.field2866 = null;
        this.field2865 = null;
        this.field2863 = null;
    }

    @ObfuscatedName("ir.f()Z")
    public boolean method4124() {
        return this.field2876.field4155 != null;
    }

    @ObfuscatedName("ir.y()I")
    public int method4125() {
        return this.field2866.length;
    }

    @ObfuscatedName("ir.p(I)V")
    public void method4126(int arg0) {
        this.field2876.field4158 = this.field2866[arg0];
    }

    @ObfuscatedName("ir.j(I)V")
    public void method4151(int arg0) {
        this.field2866[arg0] = this.field2876.field4158;
    }

    @ObfuscatedName("ir.r()V")
    public void method4156() {
        this.field2876.field4158 = -1;
    }

    @ObfuscatedName("ir.b(I)V")
    public void method4139(int arg0) {
        int var2 = this.field2876.method5962();
        this.field2865[arg0] += var2;
    }

    @ObfuscatedName("ir.d(I)I")
    public int method4130(int arg0) {
        return this.method4131(arg0);
    }

    @ObfuscatedName("ir.s(I)I")
    public int method4131(int arg0) {
        byte var2 = this.field2876.field4155[this.field2876.field4158];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2863[arg0] = var3;
            this.field2876.field4158++;
        } else {
            var3 = this.field2863[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4132(arg0, var3);
        }
        int var4 = this.field2876.method5962();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2876.field4155[this.field2876.field4158] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2876.field4158++;
                this.field2863[arg0] = var5;
                return this.method4132(arg0, var5);
            }
        }
        this.field2876.field4158 += var4;
        return 0;
    }

    @ObfuscatedName("ir.u(II)I")
    public int method4132(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2872[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2876.method5965() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2876.method5965() << 16;
            }
            return var8;
        }
        int var3 = this.field2876.method5965();
        int var4 = this.field2876.method5962();
        if (var3 == 47) {
            this.field2876.field4158 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2876.method5969();
            var4 -= 3;
            int var6 = this.field2865[arg0];
            this.field2871 += (long) (this.field2868 - var5) * (long) var6;
            this.field2868 = var5;
            this.field2876.field4158 += var4;
            return 2;
        } else {
            this.field2876.field4158 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ir.l(I)J")
    public long method4143(int arg0) {
        return (long) this.field2868 * (long) arg0 + this.field2871;
    }

    @ObfuscatedName("ir.o()I")
    public int method4134() {
        int var1 = this.field2866.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2866[var4] >= 0 && this.field2865[var4] < var3) {
                var2 = var4;
                var3 = this.field2865[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ir.c()Z")
    public boolean method4147() {
        int var1 = this.field2866.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2866[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ir.e(J)V")
    public void method4136(long arg0) {
        this.field2871 = arg0;
        int var3 = this.field2866.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2865[var4] = 0;
            this.field2863[var4] = 0;
            this.field2876.field4158 = this.field2869[var4];
            this.method4139(var4);
            this.field2866[var4] = this.field2876.field4158;
        }
    }
}
