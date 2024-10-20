package deob;

@ObfuscatedName("gy")
public class class183 {

    @ObfuscatedName("gy.a")
    public class120 field2962 = new class120((byte[]) null);

    @ObfuscatedName("gy.w")
    public int field2951;

    @ObfuscatedName("gy.d")
    public int[] field2952;

    @ObfuscatedName("gy.c")
    public int[] field2953;

    @ObfuscatedName("gy.y")
    public int[] field2956;

    @ObfuscatedName("gy.k")
    public int[] field2954;

    @ObfuscatedName("gy.r")
    public int field2961;

    @ObfuscatedName("gy.q")
    public long field2958;

    @ObfuscatedName("gy.m")
    public static final byte[] field2959 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class183() {
    }

    public class183(byte[] arg0) {
        this.method3386(arg0);
    }

    @ObfuscatedName("gy.a([B)V")
    public void method3386(byte[] arg0) {
        this.field2962.field1994 = arg0;
        this.field2962.field1993 = 10;
        int var2 = this.field2962.method2464();
        this.field2951 = this.field2962.method2464();
        this.field2961 = 500000;
        this.field2952 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2962.method2467();
            int var5 = this.field2962.method2467();
            if (var4 == 1297379947) {
                this.field2952[var3] = this.field2962.field1993;
                var3++;
            }
            this.field2962.field1993 += var5;
        }
        this.field2958 = 0L;
        this.field2953 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2953[var6] = this.field2952[var6];
        }
        this.field2956 = new int[var2];
        this.field2954 = new int[var2];
    }

    @ObfuscatedName("gy.w()V")
    public void method3392() {
        this.field2962.field1994 = null;
        this.field2952 = null;
        this.field2953 = null;
        this.field2956 = null;
        this.field2954 = null;
    }

    @ObfuscatedName("gy.d()Z")
    public boolean method3388() {
        return this.field2962.field1994 != null;
    }

    @ObfuscatedName("gy.c()I")
    public int method3389() {
        return this.field2953.length;
    }

    @ObfuscatedName("gy.y(I)V")
    public void method3426(int arg0) {
        this.field2962.field1993 = this.field2953[arg0];
    }

    @ObfuscatedName("gy.k(I)V")
    public void method3391(int arg0) {
        this.field2953[arg0] = this.field2962.field1993;
    }

    @ObfuscatedName("gy.r()V")
    public void method3396() {
        this.field2962.field1993 = -1;
    }

    @ObfuscatedName("gy.p(I)V")
    public void method3393(int arg0) {
        int var2 = this.field2962.method2477();
        this.field2956[arg0] += var2;
    }

    @ObfuscatedName("gy.q(I)I")
    public int method3422(int arg0) {
        return this.method3417(arg0);
    }

    @ObfuscatedName("gy.m(I)I")
    public int method3417(int arg0) {
        byte var2 = this.field2962.field1994[this.field2962.field1993];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2954[arg0] = var3;
            this.field2962.field1993++;
        } else {
            var3 = this.field2954[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3407(arg0, var3);
        }
        int var4 = this.field2962.method2477();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2962.field1994[this.field2962.field1993] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2962.field1993++;
                this.field2954[arg0] = var5;
                return this.method3407(arg0, var5);
            }
        }
        this.field2962.field1993 += var4;
        return 0;
    }

    @ObfuscatedName("gy.e(II)I")
    public int method3407(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2959[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2962.method2462() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2962.method2462() << 16;
            }
            return var8;
        }
        int var3 = this.field2962.method2462();
        int var4 = this.field2962.method2477();
        if (var3 == 47) {
            this.field2962.field1993 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2962.method2466();
            var4 -= 3;
            int var6 = this.field2956[arg0];
            this.field2958 += (long) (this.field2961 - var5) * (long) var6;
            this.field2961 = var5;
            this.field2962.field1993 += var4;
            return 2;
        } else {
            this.field2962.field1993 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gy.x(I)J")
    public long method3390(int arg0) {
        return (long) this.field2961 * (long) arg0 + this.field2958;
    }

    @ObfuscatedName("gy.z()I")
    public int method3398() {
        int var1 = this.field2953.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2953[var4] >= 0 && this.field2956[var4] < var3) {
                var2 = var4;
                var3 = this.field2956[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gy.i()Z")
    public boolean method3399() {
        int var1 = this.field2953.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2953[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gy.t(J)V")
    public void method3428(long arg0) {
        this.field2958 = arg0;
        int var3 = this.field2953.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2956[var4] = 0;
            this.field2954[var4] = 0;
            this.field2962.field1993 = this.field2952[var4];
            this.method3393(var4);
            this.field2953[var4] = this.field2962.field1993;
        }
    }
}
