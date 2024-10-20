package deob;

@ObfuscatedName("fq")
public class class165 {

    @ObfuscatedName("fq.p")
    public class110 field2721 = new class110((byte[]) null);

    @ObfuscatedName("fq.y")
    public int field2722;

    @ObfuscatedName("fq.d")
    public int[] field2723;

    @ObfuscatedName("fq.c")
    public int[] field2734;

    @ObfuscatedName("fq.r")
    public int[] field2725;

    @ObfuscatedName("fq.f")
    public int[] field2726;

    @ObfuscatedName("fq.z")
    public int field2730;

    @ObfuscatedName("fq.k")
    public long field2729;

    @ObfuscatedName("fq.s")
    public static final byte[] field2731 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class165() {
    }

    public class165(byte[] arg0) {
        this.method3006(arg0);
    }

    @ObfuscatedName("fq.p([B)V")
    public void method3006(byte[] arg0) {
        this.field2721.field1844 = arg0;
        this.field2721.field1842 = 10;
        int var2 = this.field2721.method2243();
        this.field2722 = this.field2721.method2243();
        this.field2730 = 500000;
        this.field2723 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2721.method2164();
            int var5 = this.field2721.method2164();
            if (var4 == 1297379947) {
                this.field2723[var3] = this.field2721.field1842;
                var3++;
            }
            this.field2721.field1842 += var5;
        }
        this.field2729 = 0L;
        this.field2734 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2734[var6] = this.field2723[var6];
        }
        this.field2725 = new int[var2];
        this.field2726 = new int[var2];
    }

    @ObfuscatedName("fq.y()V")
    public void method3007() {
        this.field2721.field1844 = null;
        this.field2723 = null;
        this.field2734 = null;
        this.field2725 = null;
        this.field2726 = null;
    }

    @ObfuscatedName("fq.d()Z")
    public boolean method2998() {
        return this.field2721.field1844 != null;
    }

    @ObfuscatedName("fq.c()I")
    public int method3021() {
        return this.field2734.length;
    }

    @ObfuscatedName("fq.r(I)V")
    public void method3023(int arg0) {
        this.field2721.field1842 = this.field2734[arg0];
    }

    @ObfuscatedName("fq.f(I)V")
    public void method2999(int arg0) {
        this.field2734[arg0] = this.field2721.field1842;
    }

    @ObfuscatedName("fq.z()V")
    public void method3001() {
        this.field2721.field1842 = -1;
    }

    @ObfuscatedName("fq.o(I)V")
    public void method3002(int arg0) {
        int var2 = this.field2721.method2320();
        this.field2725[arg0] += var2;
    }

    @ObfuscatedName("fq.k(I)I")
    public int method3003(int arg0) {
        return this.method2996(arg0);
    }

    @ObfuscatedName("fq.s(I)I")
    public int method2996(int arg0) {
        byte var2 = this.field2721.field1844[this.field2721.field1842];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2726[arg0] = var3;
            this.field2721.field1842++;
        } else {
            var3 = this.field2726[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3005(arg0, var3);
        }
        int var4 = this.field2721.method2320();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2721.field1844[this.field2721.field1842] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2721.field1842++;
                this.field2726[arg0] = var5;
                return this.method3005(arg0, var5);
            }
        }
        this.field2721.field1842 += var4;
        return 0;
    }

    @ObfuscatedName("fq.h(II)I")
    public int method3005(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2731[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2721.method2309() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2721.method2309() << 16;
            }
            return var8;
        }
        int var3 = this.field2721.method2309();
        int var4 = this.field2721.method2320();
        if (var3 == 47) {
            this.field2721.field1842 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2721.method2128();
            var4 -= 3;
            int var6 = this.field2725[arg0];
            this.field2729 += (long) (this.field2730 - var5) * (long) var6;
            this.field2730 = var5;
            this.field2721.field1842 += var4;
            return 2;
        } else {
            this.field2721.field1842 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fq.m(I)J")
    public long method3041(int arg0) {
        return (long) this.field2730 * (long) arg0 + this.field2729;
    }

    @ObfuscatedName("fq.w()I")
    public int method2997() {
        int var1 = this.field2734.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2734[var4] >= 0 && this.field2725[var4] < var3) {
                var2 = var4;
                var3 = this.field2725[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fq.q()Z")
    public boolean method3008() {
        int var1 = this.field2734.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2734[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fq.u(J)V")
    public void method3009(long arg0) {
        this.field2729 = arg0;
        int var3 = this.field2734.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2725[var4] = 0;
            this.field2726[var4] = 0;
            this.field2721.field1842 = this.field2723[var4];
            this.method3002(var4);
            this.field2734[var4] = this.field2721.field1842;
        }
    }
}
