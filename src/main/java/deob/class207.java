package deob;

@ObfuscatedName("gr")
public class class207 {

    @ObfuscatedName("gr.d")
    public class174 field2550 = new class174((byte[]) null);

    @ObfuscatedName("gr.q")
    public int field2539;

    @ObfuscatedName("gr.x")
    public int[] field2540;

    @ObfuscatedName("gr.y")
    public int[] field2541;

    @ObfuscatedName("gr.e")
    public int[] field2551;

    @ObfuscatedName("gr.f")
    public int[] field2549;

    @ObfuscatedName("gr.v")
    public int field2544;

    @ObfuscatedName("gr.i")
    public long field2546;

    @ObfuscatedName("gr.r")
    public static final byte[] field2543 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class207() {
    }

    public class207(byte[] arg0) {
        this.method3516(arg0);
    }

    @ObfuscatedName("gr.d([B)V")
    public void method3516(byte[] arg0) {
        this.field2550.field2367 = arg0;
        this.field2550.field2364 = 10;
        int var2 = this.field2550.method2916();
        this.field2539 = this.field2550.method2916();
        this.field2544 = 500000;
        this.field2540 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2550.method2935();
            int var5 = this.field2550.method2935();
            if (var4 == 1297379947) {
                this.field2540[var3] = this.field2550.field2364;
                var3++;
            }
            this.field2550.field2364 += var5;
        }
        this.field2546 = 0L;
        this.field2541 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2541[var6] = this.field2540[var6];
        }
        this.field2551 = new int[var2];
        this.field2549 = new int[var2];
    }

    @ObfuscatedName("gr.q()V")
    public void method3551() {
        this.field2550.field2367 = null;
        this.field2540 = null;
        this.field2541 = null;
        this.field2551 = null;
        this.field2549 = null;
    }

    @ObfuscatedName("gr.x()Z")
    public boolean method3549() {
        return this.field2550.field2367 != null;
    }

    @ObfuscatedName("gr.y()I")
    public int method3519() {
        return this.field2541.length;
    }

    @ObfuscatedName("gr.e(I)V")
    public void method3520(int arg0) {
        this.field2550.field2364 = this.field2541[arg0];
    }

    @ObfuscatedName("gr.f(I)V")
    public void method3521(int arg0) {
        this.field2541[arg0] = this.field2550.field2364;
    }

    @ObfuscatedName("gr.v()V")
    public void method3522() {
        this.field2550.field2364 = -1;
    }

    @ObfuscatedName("gr.t(I)V")
    public void method3539(int arg0) {
        int var2 = this.field2550.method2915();
        this.field2551[arg0] += var2;
    }

    @ObfuscatedName("gr.i(I)I")
    public int method3515(int arg0) {
        return this.method3547(arg0);
    }

    @ObfuscatedName("gr.r(I)I")
    public int method3547(int arg0) {
        byte var2 = this.field2550.field2367[this.field2550.field2364];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2549[arg0] = var3;
            this.field2550.field2364++;
        } else {
            var3 = this.field2549[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3526(arg0, var3);
        }
        int var4 = this.field2550.method2915();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2550.field2367[this.field2550.field2364] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2550.field2364++;
                this.field2549[arg0] = var5;
                return this.method3526(arg0, var5);
            }
        }
        this.field2550.field2364 += var4;
        return 0;
    }

    @ObfuscatedName("gr.g(II)I")
    public int method3526(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2543[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2550.method2921() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2550.method2921() << 16;
            }
            return var8;
        }
        int var3 = this.field2550.method2921();
        int var4 = this.field2550.method2915();
        if (var3 == 47) {
            this.field2550.field2364 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2550.method2918();
            var4 -= 3;
            int var6 = this.field2551[arg0];
            this.field2546 += (long) (this.field2544 - var5) * (long) var6;
            this.field2544 = var5;
            this.field2550.field2364 += var4;
            return 2;
        } else {
            this.field2550.field2364 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gr.s(I)J")
    public long method3527(int arg0) {
        return (long) this.field2544 * (long) arg0 + this.field2546;
    }

    @ObfuscatedName("gr.o()I")
    public int method3528() {
        int var1 = this.field2541.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2541[var4] >= 0 && this.field2551[var4] < var3) {
                var2 = var4;
                var3 = this.field2551[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gr.p()Z")
    public boolean method3529() {
        int var1 = this.field2541.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2541[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gr.u(J)V")
    public void method3530(long arg0) {
        this.field2546 = arg0;
        int var3 = this.field2541.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2551[var4] = 0;
            this.field2549[var4] = 0;
            this.field2550.field2364 = this.field2540[var4];
            this.method3539(var4);
            this.field2541[var4] = this.field2550.field2364;
        }
    }
}
