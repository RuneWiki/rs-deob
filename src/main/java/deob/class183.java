package deob;

@ObfuscatedName("gr")
public class class183 {

    @ObfuscatedName("gr.b")
    public class120 field2944 = new class120((byte[]) null);

    @ObfuscatedName("gr.g")
    public int field2937;

    @ObfuscatedName("gr.j")
    public int[] field2938;

    @ObfuscatedName("gr.d")
    public int[] field2939;

    @ObfuscatedName("gr.x")
    public int[] field2940;

    @ObfuscatedName("gr.y")
    public int[] field2941;

    @ObfuscatedName("gr.r")
    public int field2942;

    @ObfuscatedName("gr.l")
    public long field2947;

    @ObfuscatedName("gr.u")
    public static final byte[] field2945 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class183() {
    }

    public class183(byte[] arg0) {
        this.method3304(arg0);
    }

    @ObfuscatedName("gr.b([B)V")
    public void method3304(byte[] arg0) {
        this.field2944.field1983 = arg0;
        this.field2944.field1977 = 10;
        int var2 = this.field2944.method2346();
        this.field2937 = this.field2944.method2346();
        this.field2942 = 500000;
        this.field2938 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2944.method2349();
            int var5 = this.field2944.method2349();
            if (var4 == 1297379947) {
                this.field2938[var3] = this.field2944.field1977;
                var3++;
            }
            this.field2944.field1977 += var5;
        }
        this.field2947 = 0L;
        this.field2939 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2939[var6] = this.field2938[var6];
        }
        this.field2940 = new int[var2];
        this.field2941 = new int[var2];
    }

    @ObfuscatedName("gr.g()V")
    public void method3305() {
        this.field2944.field1983 = null;
        this.field2938 = null;
        this.field2939 = null;
        this.field2940 = null;
        this.field2941 = null;
    }

    @ObfuscatedName("gr.j()Z")
    public boolean method3306() {
        return this.field2944.field1983 != null;
    }

    @ObfuscatedName("gr.d()I")
    public int method3307() {
        return this.field2939.length;
    }

    @ObfuscatedName("gr.x(I)V")
    public void method3308(int arg0) {
        this.field2944.field1977 = this.field2939[arg0];
    }

    @ObfuscatedName("gr.y(I)V")
    public void method3309(int arg0) {
        this.field2939[arg0] = this.field2944.field1977;
    }

    @ObfuscatedName("gr.r()V")
    public void method3317() {
        this.field2944.field1977 = -1;
    }

    @ObfuscatedName("gr.c(I)V")
    public void method3310(int arg0) {
        int var2 = this.field2944.method2359();
        this.field2940[arg0] += var2;
    }

    @ObfuscatedName("gr.l(I)I")
    public int method3311(int arg0) {
        return this.method3312(arg0);
    }

    @ObfuscatedName("gr.u(I)I")
    public int method3312(int arg0) {
        byte var2 = this.field2944.field1983[this.field2944.field1977];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2941[arg0] = var3;
            this.field2944.field1977++;
        } else {
            var3 = this.field2941[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3336(arg0, var3);
        }
        int var4 = this.field2944.method2359();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2944.field1983[this.field2944.field1977] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2944.field1977++;
                this.field2941[arg0] = var5;
                return this.method3336(arg0, var5);
            }
        }
        this.field2944.field1977 += var4;
        return 0;
    }

    @ObfuscatedName("gr.p(II)I")
    public int method3336(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2945[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2944.method2344() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2944.method2344() << 16;
            }
            return var8;
        }
        int var3 = this.field2944.method2344();
        int var4 = this.field2944.method2359();
        if (var3 == 47) {
            this.field2944.field1977 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2944.method2348();
            var4 -= 3;
            int var6 = this.field2940[arg0];
            this.field2947 += (long) (this.field2942 - var5) * (long) var6;
            this.field2942 = var5;
            this.field2944.field1977 += var4;
            return 2;
        } else {
            this.field2944.field1977 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gr.n(I)J")
    public long method3314(int arg0) {
        return (long) this.field2942 * (long) arg0 + this.field2947;
    }

    @ObfuscatedName("gr.w()I")
    public int method3315() {
        int var1 = this.field2939.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2939[var4] >= 0 && this.field2940[var4] < var3) {
                var2 = var4;
                var3 = this.field2940[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gr.z()Z")
    public boolean method3316() {
        int var1 = this.field2939.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2939[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gr.k(J)V")
    public void method3358(long arg0) {
        this.field2947 = arg0;
        int var3 = this.field2939.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2940[var4] = 0;
            this.field2941[var4] = 0;
            this.field2944.field1977 = this.field2938[var4];
            this.method3310(var4);
            this.field2939[var4] = this.field2944.field1977;
        }
    }
}
