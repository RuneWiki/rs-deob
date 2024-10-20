package deob;

@ObfuscatedName("fe")
public class class182 {

    @ObfuscatedName("fe.k")
    public class119 field2929 = new class119((byte[]) null);

    @ObfuscatedName("fe.h")
    public int field2928;

    @ObfuscatedName("fe.o")
    public int[] field2934;

    @ObfuscatedName("fe.z")
    public int[] field2933;

    @ObfuscatedName("fe.c")
    public int[] field2936;

    @ObfuscatedName("fe.d")
    public int[] field2932;

    @ObfuscatedName("fe.l")
    public int field2931;

    @ObfuscatedName("fe.j")
    public long field2935;

    @ObfuscatedName("fe.f")
    public static final byte[] field2930 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3346(arg0);
    }

    @ObfuscatedName("fe.k([B)V")
    public void method3346(byte[] arg0) {
        this.field2929.field1960 = arg0;
        this.field2929.field1949 = 10;
        int var2 = this.field2929.method2332();
        this.field2928 = this.field2929.method2332();
        this.field2931 = 500000;
        this.field2934 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2929.method2415();
            int var5 = this.field2929.method2415();
            if (var4 == 1297379947) {
                this.field2934[var3] = this.field2929.field1949;
                var3++;
            }
            this.field2929.field1949 += var5;
        }
        this.field2935 = 0L;
        this.field2933 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2933[var6] = this.field2934[var6];
        }
        this.field2936 = new int[var2];
        this.field2932 = new int[var2];
    }

    @ObfuscatedName("fe.h()V")
    public void method3323() {
        this.field2929.field1960 = null;
        this.field2934 = null;
        this.field2933 = null;
        this.field2936 = null;
        this.field2932 = null;
    }

    @ObfuscatedName("fe.o()Z")
    public boolean method3321() {
        return this.field2929.field1960 != null;
    }

    @ObfuscatedName("fe.z()I")
    public int method3325() {
        return this.field2933.length;
    }

    @ObfuscatedName("fe.c(I)V")
    public void method3333(int arg0) {
        this.field2929.field1949 = this.field2933[arg0];
    }

    @ObfuscatedName("fe.d(I)V")
    public void method3327(int arg0) {
        this.field2933[arg0] = this.field2929.field1949;
    }

    @ObfuscatedName("fe.l()V")
    public void method3328() {
        this.field2929.field1949 = -1;
    }

    @ObfuscatedName("fe.b(I)V")
    public void method3329(int arg0) {
        int var2 = this.field2929.method2344();
        this.field2936[arg0] += var2;
    }

    @ObfuscatedName("fe.j(I)I")
    public int method3360(int arg0) {
        return this.method3331(arg0);
    }

    @ObfuscatedName("fe.f(I)I")
    public int method3331(int arg0) {
        byte var2 = this.field2929.field1960[this.field2929.field1949];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2932[arg0] = var3;
            this.field2929.field1949++;
        } else {
            var3 = this.field2932[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3332(arg0, var3);
        }
        int var4 = this.field2929.method2344();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2929.field1960[this.field2929.field1949] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2929.field1949++;
                this.field2932[arg0] = var5;
                return this.method3332(arg0, var5);
            }
        }
        this.field2929.field1949 += var4;
        return 0;
    }

    @ObfuscatedName("fe.i(II)I")
    public int method3332(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2930[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2929.method2330() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2929.method2330() << 16;
            }
            return var8;
        }
        int var3 = this.field2929.method2330();
        int var4 = this.field2929.method2344();
        if (var3 == 47) {
            this.field2929.field1949 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2929.method2420();
            var4 -= 3;
            int var6 = this.field2936[arg0];
            this.field2935 += (long) (this.field2931 - var5) * (long) var6;
            this.field2931 = var5;
            this.field2929.field1949 += var4;
            return 2;
        } else {
            this.field2929.field1949 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fe.g(I)J")
    public long method3363(int arg0) {
        return (long) this.field2931 * (long) arg0 + this.field2935;
    }

    @ObfuscatedName("fe.t()I")
    public int method3334() {
        int var1 = this.field2933.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2933[var4] >= 0 && this.field2936[var4] < var3) {
                var2 = var4;
                var3 = this.field2936[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fe.e()Z")
    public boolean method3335() {
        int var1 = this.field2933.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2933[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fe.q(J)V")
    public void method3336(long arg0) {
        this.field2935 = arg0;
        int var3 = this.field2933.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2936[var4] = 0;
            this.field2932[var4] = 0;
            this.field2929.field1949 = this.field2934[var4];
            this.method3329(var4);
            this.field2933[var4] = this.field2929.field1949;
        }
    }
}
