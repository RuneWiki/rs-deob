package deob;

@ObfuscatedName("ij")
public class class250 {

    @ObfuscatedName("ij.l")
    public class401 field2957 = new class401((byte[]) null);

    @ObfuscatedName("ij.q")
    public int field2951;

    @ObfuscatedName("ij.f")
    public int[] field2952;

    @ObfuscatedName("ij.j")
    public int[] field2953;

    @ObfuscatedName("ij.m")
    public int[] field2954;

    @ObfuscatedName("ij.k")
    public int[] field2958;

    @ObfuscatedName("ij.t")
    public int field2963;

    @ObfuscatedName("ij.e")
    public long field2956;

    @ObfuscatedName("ij.i")
    public static final byte[] field2959 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class250() {
    }

    public class250(byte[] arg0) {
        this.method4408(arg0);
    }

    @ObfuscatedName("ij.l([B)V")
    public void method4408(byte[] arg0) {
        this.field2957.field4294 = arg0;
        this.field2957.field4292 = 10;
        int var2 = this.field2957.method6284();
        this.field2951 = this.field2957.method6284();
        this.field2963 = 500000;
        this.field2952 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2957.method6277();
            int var5 = this.field2957.method6277();
            if (var4 == 1297379947) {
                this.field2952[var3] = this.field2957.field4292;
                var3++;
            }
            this.field2957.field4292 += var5;
        }
        this.field2956 = 0L;
        this.field2953 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2953[var6] = this.field2952[var6];
        }
        this.field2954 = new int[var2];
        this.field2958 = new int[var2];
    }

    @ObfuscatedName("ij.q()V")
    public void method4397() {
        this.field2957.field4294 = null;
        this.field2952 = null;
        this.field2953 = null;
        this.field2954 = null;
        this.field2958 = null;
    }

    @ObfuscatedName("ij.f()Z")
    public boolean method4412() {
        return this.field2957.field4294 != null;
    }

    @ObfuscatedName("ij.j()I")
    public int method4406() {
        return this.field2953.length;
    }

    @ObfuscatedName("ij.m(I)V")
    public void method4400(int arg0) {
        this.field2957.field4292 = this.field2953[arg0];
    }

    @ObfuscatedName("ij.k(I)V")
    public void method4401(int arg0) {
        this.field2953[arg0] = this.field2957.field4292;
    }

    @ObfuscatedName("ij.t()V")
    public void method4402() {
        this.field2957.field4292 = -1;
    }

    @ObfuscatedName("ij.a(I)V")
    public void method4413(int arg0) {
        int var2 = this.field2957.method6360();
        this.field2954[arg0] += var2;
    }

    @ObfuscatedName("ij.e(I)I")
    public int method4404(int arg0) {
        return this.method4403(arg0);
    }

    @ObfuscatedName("ij.i(I)I")
    public int method4403(int arg0) {
        byte var2 = this.field2957.field4294[this.field2957.field4292];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2958[arg0] = var3;
            this.field2957.field4292++;
        } else {
            var3 = this.field2958[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4440(arg0, var3);
        }
        int var4 = this.field2957.method6360();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2957.field4294[this.field2957.field4292] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2957.field4292++;
                this.field2958[arg0] = var5;
                return this.method4440(arg0, var5);
            }
        }
        this.field2957.field4292 += var4;
        return 0;
    }

    @ObfuscatedName("ij.y(II)I")
    public int method4440(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2959[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2957.method6272() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2957.method6272() << 16;
            }
            return var8;
        }
        int var3 = this.field2957.method6272();
        int var4 = this.field2957.method6360();
        if (var3 == 47) {
            this.field2957.field4292 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2957.method6276();
            var4 -= 3;
            int var6 = this.field2954[arg0];
            this.field2956 += (long) (this.field2963 - var5) * (long) var6;
            this.field2963 = var5;
            this.field2957.field4292 += var4;
            return 2;
        } else {
            this.field2957.field4292 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ij.w(I)J")
    public long method4416(int arg0) {
        return (long) this.field2963 * (long) arg0 + this.field2956;
    }

    @ObfuscatedName("ij.g()I")
    public int method4405() {
        int var1 = this.field2953.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2953[var4] >= 0 && this.field2954[var4] < var3) {
                var2 = var4;
                var3 = this.field2954[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ij.v()Z")
    public boolean method4409() {
        int var1 = this.field2953.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2953[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ij.s(J)V")
    public void method4410(long arg0) {
        this.field2956 = arg0;
        int var3 = this.field2953.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2954[var4] = 0;
            this.field2958[var4] = 0;
            this.field2957.field4292 = this.field2952[var4];
            this.method4413(var4);
            this.field2953[var4] = this.field2957.field4292;
        }
    }
}
