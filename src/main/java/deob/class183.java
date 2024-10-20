package deob;

@ObfuscatedName("gl")
public class class183 {

    @ObfuscatedName("gl.t")
    public class120 field2963 = new class120((byte[]) null);

    @ObfuscatedName("gl.i")
    public int field2962;

    @ObfuscatedName("gl.g")
    public int[] field2968;

    @ObfuscatedName("gl.h")
    public int[] field2964;

    @ObfuscatedName("gl.z")
    public int[] field2965;

    @ObfuscatedName("gl.r")
    public int[] field2966;

    @ObfuscatedName("gl.f")
    public int field2967;

    @ObfuscatedName("gl.d")
    public long field2969;

    @ObfuscatedName("gl.l")
    public static final byte[] field2974 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class183() {
    }

    public class183(byte[] arg0) {
        this.method3251(arg0);
    }

    @ObfuscatedName("gl.t([B)V")
    public void method3251(byte[] arg0) {
        this.field2963.field2002 = arg0;
        this.field2963.field2001 = 10;
        int var2 = this.field2963.method2310();
        this.field2962 = this.field2963.method2310();
        this.field2967 = 500000;
        this.field2968 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2963.method2345();
            int var5 = this.field2963.method2345();
            if (var4 == 1297379947) {
                this.field2968[var3] = this.field2963.field2001;
                var3++;
            }
            this.field2963.field2001 += var5;
        }
        this.field2969 = 0L;
        this.field2964 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2964[var6] = this.field2968[var6];
        }
        this.field2965 = new int[var2];
        this.field2966 = new int[var2];
    }

    @ObfuscatedName("gl.i()V")
    public void method3252() {
        this.field2963.field2002 = null;
        this.field2968 = null;
        this.field2964 = null;
        this.field2965 = null;
        this.field2966 = null;
    }

    @ObfuscatedName("gl.g()Z")
    public boolean method3253() {
        return this.field2963.field2002 != null;
    }

    @ObfuscatedName("gl.h()I")
    public int method3254() {
        return this.field2964.length;
    }

    @ObfuscatedName("gl.z(I)V")
    public void method3279(int arg0) {
        this.field2963.field2001 = this.field2964[arg0];
    }

    @ObfuscatedName("gl.r(I)V")
    public void method3259(int arg0) {
        this.field2964[arg0] = this.field2963.field2001;
    }

    @ObfuscatedName("gl.f()V")
    public void method3257() {
        this.field2963.field2001 = -1;
    }

    @ObfuscatedName("gl.s(I)V")
    public void method3258(int arg0) {
        int var2 = this.field2963.method2292();
        this.field2965[arg0] += var2;
    }

    @ObfuscatedName("gl.d(I)I")
    public int method3261(int arg0) {
        return this.method3260(arg0);
    }

    @ObfuscatedName("gl.l(I)I")
    public int method3260(int arg0) {
        byte var2 = this.field2963.field2002[this.field2963.field2001];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2966[arg0] = var3;
            this.field2963.field2001++;
        } else {
            var3 = this.field2966[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3284(arg0, var3);
        }
        int var4 = this.field2963.method2292();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2963.field2002[this.field2963.field2001] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2963.field2001++;
                this.field2966[arg0] = var5;
                return this.method3284(arg0, var5);
            }
        }
        this.field2963.field2001 += var4;
        return 0;
    }

    @ObfuscatedName("gl.y(II)I")
    public int method3284(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2974[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2963.method2334() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2963.method2334() << 16;
            }
            return var8;
        }
        int var3 = this.field2963.method2334();
        int var4 = this.field2963.method2292();
        if (var3 == 47) {
            this.field2963.field2001 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2963.method2312();
            var4 -= 3;
            int var6 = this.field2965[arg0];
            this.field2969 += (long) (this.field2967 - var5) * (long) var6;
            this.field2967 = var5;
            this.field2963.field2001 += var4;
            return 2;
        } else {
            this.field2963.field2001 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gl.p(I)J")
    public long method3262(int arg0) {
        return (long) this.field2967 * (long) arg0 + this.field2969;
    }

    @ObfuscatedName("gl.k()I")
    public int method3263() {
        int var1 = this.field2964.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2964[var4] >= 0 && this.field2965[var4] < var3) {
                var2 = var4;
                var3 = this.field2965[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gl.o()Z")
    public boolean method3264() {
        int var1 = this.field2964.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2964[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gl.b(J)V")
    public void method3286(long arg0) {
        this.field2969 = arg0;
        int var3 = this.field2964.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2965[var4] = 0;
            this.field2966[var4] = 0;
            this.field2963.field2001 = this.field2968[var4];
            this.method3258(var4);
            this.field2964[var4] = this.field2963.field2001;
        }
    }
}
