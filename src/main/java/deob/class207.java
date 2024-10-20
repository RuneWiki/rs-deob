package deob;

@ObfuscatedName("gx")
public class class207 {

    @ObfuscatedName("gx.i")
    public class174 field2581 = new class174((byte[]) null);

    @ObfuscatedName("gx.c")
    public int field2579;

    @ObfuscatedName("gx.e")
    public int[] field2576;

    @ObfuscatedName("gx.v")
    public int[] field2571;

    @ObfuscatedName("gx.b")
    public int[] field2570;

    @ObfuscatedName("gx.y")
    public int[] field2573;

    @ObfuscatedName("gx.h")
    public int field2574;

    @ObfuscatedName("gx.f")
    public long field2568;

    @ObfuscatedName("gx.n")
    public static final byte[] field2572 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class207() {
    }

    public class207(byte[] arg0) {
        this.method3489(arg0);
    }

    @ObfuscatedName("gx.i([B)V")
    public void method3489(byte[] arg0) {
        this.field2581.field2415 = arg0;
        this.field2581.field2407 = 10;
        int var2 = this.field2581.method2872();
        this.field2579 = this.field2581.method2872();
        this.field2574 = 500000;
        this.field2576 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2581.method2875();
            int var5 = this.field2581.method2875();
            if (var4 == 1297379947) {
                this.field2576[var3] = this.field2581.field2407;
                var3++;
            }
            this.field2581.field2407 += var5;
        }
        this.field2568 = 0L;
        this.field2571 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2571[var6] = this.field2576[var6];
        }
        this.field2570 = new int[var2];
        this.field2573 = new int[var2];
    }

    @ObfuscatedName("gx.c()V")
    public void method3529() {
        this.field2581.field2415 = null;
        this.field2576 = null;
        this.field2571 = null;
        this.field2570 = null;
        this.field2573 = null;
    }

    @ObfuscatedName("gx.e()Z")
    public boolean method3532() {
        return this.field2581.field2415 != null;
    }

    @ObfuscatedName("gx.v()I")
    public int method3490() {
        return this.field2571.length;
    }

    @ObfuscatedName("gx.b(I)V")
    public void method3528(int arg0) {
        this.field2581.field2407 = this.field2571[arg0];
    }

    @ObfuscatedName("gx.y(I)V")
    public void method3511(int arg0) {
        this.field2571[arg0] = this.field2581.field2407;
    }

    @ObfuscatedName("gx.h()V")
    public void method3493() {
        this.field2581.field2407 = -1;
    }

    @ObfuscatedName("gx.x(I)V")
    public void method3494(int arg0) {
        int var2 = this.field2581.method2857();
        this.field2570[arg0] += var2;
    }

    @ObfuscatedName("gx.f(I)I")
    public int method3495(int arg0) {
        return this.method3491(arg0);
    }

    @ObfuscatedName("gx.n(I)I")
    public int method3491(int arg0) {
        byte var2 = this.field2581.field2415[this.field2581.field2407];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2573[arg0] = var3;
            this.field2581.field2407++;
        } else {
            var3 = this.field2573[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3497(arg0, var3);
        }
        int var4 = this.field2581.method2857();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2581.field2415[this.field2581.field2407] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2581.field2407++;
                this.field2573[arg0] = var5;
                return this.method3497(arg0, var5);
            }
        }
        this.field2581.field2407 += var4;
        return 0;
    }

    @ObfuscatedName("gx.a(II)I")
    public int method3497(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2572[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2581.method2870() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2581.method2870() << 16;
            }
            return var8;
        }
        int var3 = this.field2581.method2870();
        int var4 = this.field2581.method2857();
        if (var3 == 47) {
            this.field2581.field2407 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2581.method2874();
            var4 -= 3;
            int var6 = this.field2570[arg0];
            this.field2568 += (long) (this.field2574 - var5) * (long) var6;
            this.field2574 = var5;
            this.field2581.field2407 += var4;
            return 2;
        } else {
            this.field2581.field2407 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gx.o(I)J")
    public long method3498(int arg0) {
        return (long) this.field2574 * (long) arg0 + this.field2568;
    }

    @ObfuscatedName("gx.z()I")
    public int method3499() {
        int var1 = this.field2571.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2571[var4] >= 0 && this.field2570[var4] < var3) {
                var2 = var4;
                var3 = this.field2570[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gx.q()Z")
    public boolean method3500() {
        int var1 = this.field2571.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2571[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gx.j(J)V")
    public void method3518(long arg0) {
        this.field2568 = arg0;
        int var3 = this.field2571.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2570[var4] = 0;
            this.field2573[var4] = 0;
            this.field2581.field2407 = this.field2576[var4];
            this.method3494(var4);
            this.field2571[var4] = this.field2581.field2407;
        }
    }
}
