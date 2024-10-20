package deob;

@ObfuscatedName("gy")
public class class183 {

    @ObfuscatedName("gy.w")
    public class120 field2953 = new class120((byte[]) null);

    @ObfuscatedName("gy.x")
    public int field2952;

    @ObfuscatedName("gy.t")
    public int[] field2955;

    @ObfuscatedName("gy.p")
    public int[] field2954;

    @ObfuscatedName("gy.e")
    public int[] field2963;

    @ObfuscatedName("gy.y")
    public int[] field2956;

    @ObfuscatedName("gy.m")
    public int field2958;

    @ObfuscatedName("gy.v")
    public long field2951;

    @ObfuscatedName("gy.l")
    public static final byte[] field2960 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class183() {
    }

    public class183(byte[] arg0) {
        this.method3340(arg0);
    }

    @ObfuscatedName("gy.w([B)V")
    public void method3340(byte[] arg0) {
        this.field2953.field2013 = arg0;
        this.field2953.field2012 = 10;
        int var2 = this.field2953.method2365();
        this.field2952 = this.field2953.method2365();
        this.field2958 = 500000;
        this.field2955 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2953.method2368();
            int var5 = this.field2953.method2368();
            if (var4 == 1297379947) {
                this.field2955[var3] = this.field2953.field2012;
                var3++;
            }
            this.field2953.field2012 += var5;
        }
        this.field2951 = 0L;
        this.field2954 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2954[var6] = this.field2955[var6];
        }
        this.field2963 = new int[var2];
        this.field2956 = new int[var2];
    }

    @ObfuscatedName("gy.x()V")
    public void method3365() {
        this.field2953.field2013 = null;
        this.field2955 = null;
        this.field2954 = null;
        this.field2963 = null;
        this.field2956 = null;
    }

    @ObfuscatedName("gy.t()Z")
    public boolean method3342() {
        return this.field2953.field2013 != null;
    }

    @ObfuscatedName("gy.p()I")
    public int method3343() {
        return this.field2954.length;
    }

    @ObfuscatedName("gy.e(I)V")
    public void method3344(int arg0) {
        this.field2953.field2012 = this.field2954[arg0];
    }

    @ObfuscatedName("gy.y(I)V")
    public void method3341(int arg0) {
        this.field2954[arg0] = this.field2953.field2012;
    }

    @ObfuscatedName("gy.m()V")
    public void method3346() {
        this.field2953.field2012 = -1;
    }

    @ObfuscatedName("gy.c(I)V")
    public void method3347(int arg0) {
        int var2 = this.field2953.method2378();
        this.field2963[arg0] += var2;
    }

    @ObfuscatedName("gy.v(I)I")
    public int method3348(int arg0) {
        return this.method3362(arg0);
    }

    @ObfuscatedName("gy.l(I)I")
    public int method3362(int arg0) {
        byte var2 = this.field2953.field2013[this.field2953.field2012];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2956[arg0] = var3;
            this.field2953.field2012++;
        } else {
            var3 = this.field2956[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3350(arg0, var3);
        }
        int var4 = this.field2953.method2378();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2953.field2013[this.field2953.field2012] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2953.field2012++;
                this.field2956[arg0] = var5;
                return this.method3350(arg0, var5);
            }
        }
        this.field2953.field2012 += var4;
        return 0;
    }

    @ObfuscatedName("gy.z(II)I")
    public int method3350(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2960[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2953.method2363() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2953.method2363() << 16;
            }
            return var8;
        }
        int var3 = this.field2953.method2363();
        int var4 = this.field2953.method2378();
        if (var3 == 47) {
            this.field2953.field2012 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2953.method2367();
            var4 -= 3;
            int var6 = this.field2963[arg0];
            this.field2951 += (long) (this.field2958 - var5) * (long) var6;
            this.field2958 = var5;
            this.field2953.field2012 += var4;
            return 2;
        } else {
            this.field2953.field2012 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gy.s(I)J")
    public long method3371(int arg0) {
        return (long) this.field2958 * (long) arg0 + this.field2951;
    }

    @ObfuscatedName("gy.j()I")
    public int method3339() {
        int var1 = this.field2954.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2954[var4] >= 0 && this.field2963[var4] < var3) {
                var2 = var4;
                var3 = this.field2963[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gy.q()Z")
    public boolean method3355() {
        int var1 = this.field2954.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2954[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gy.a(J)V")
    public void method3354(long arg0) {
        this.field2951 = arg0;
        int var3 = this.field2954.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2963[var4] = 0;
            this.field2956[var4] = 0;
            this.field2953.field2012 = this.field2955[var4];
            this.method3347(var4);
            this.field2954[var4] = this.field2953.field2012;
        }
    }
}
