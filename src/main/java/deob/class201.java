package deob;

@ObfuscatedName("gr")
public class class201 {

    @ObfuscatedName("gr.f")
    public class300 field2451 = new class300((byte[]) null);

    @ObfuscatedName("gr.i")
    public int field2450;

    @ObfuscatedName("gr.y")
    public int[] field2459;

    @ObfuscatedName("gr.w")
    public int[] field2456;

    @ObfuscatedName("gr.p")
    public int[] field2457;

    @ObfuscatedName("gr.b")
    public int[] field2454;

    @ObfuscatedName("gr.e")
    public int field2452;

    @ObfuscatedName("gr.a")
    public long field2460;

    @ObfuscatedName("gr.d")
    public static final byte[] field2458 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class201() {
    }

    public class201(byte[] arg0) {
        this.method3483(arg0);
    }

    @ObfuscatedName("gr.f([B)V")
    public void method3483(byte[] arg0) {
        this.field2451.field3704 = arg0;
        this.field2451.field3703 = 10;
        int var2 = this.field2451.method5112();
        this.field2450 = this.field2451.method5112();
        this.field2452 = 500000;
        this.field2459 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2451.method5192();
            int var5 = this.field2451.method5192();
            if (var4 == 1297379947) {
                this.field2459[var3] = this.field2451.field3703;
                var3++;
            }
            this.field2451.field3703 += var5;
        }
        this.field2460 = 0L;
        this.field2456 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2456[var6] = this.field2459[var6];
        }
        this.field2457 = new int[var2];
        this.field2454 = new int[var2];
    }

    @ObfuscatedName("gr.i()V")
    public void method3516() {
        this.field2451.field3704 = null;
        this.field2459 = null;
        this.field2456 = null;
        this.field2457 = null;
        this.field2454 = null;
    }

    @ObfuscatedName("gr.y()Z")
    public boolean method3484() {
        return this.field2451.field3704 != null;
    }

    @ObfuscatedName("gr.w()I")
    public int method3485() {
        return this.field2456.length;
    }

    @ObfuscatedName("gr.p(I)V")
    public void method3486(int arg0) {
        this.field2451.field3703 = this.field2456[arg0];
    }

    @ObfuscatedName("gr.b(I)V")
    public void method3487(int arg0) {
        this.field2456[arg0] = this.field2451.field3703;
    }

    @ObfuscatedName("gr.e()V")
    public void method3519() {
        this.field2451.field3703 = -1;
    }

    @ObfuscatedName("gr.x(I)V")
    public void method3489(int arg0) {
        int var2 = this.field2451.method5128();
        this.field2457[arg0] += var2;
    }

    @ObfuscatedName("gr.a(I)I")
    public int method3503(int arg0) {
        return this.method3491(arg0);
    }

    @ObfuscatedName("gr.d(I)I")
    public int method3491(int arg0) {
        byte var2 = this.field2451.field3704[this.field2451.field3703];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2454[arg0] = var3;
            this.field2451.field3703++;
        } else {
            var3 = this.field2454[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3492(arg0, var3);
        }
        int var4 = this.field2451.method5128();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2451.field3704[this.field2451.field3703] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2451.field3703++;
                this.field2454[arg0] = var5;
                return this.method3492(arg0, var5);
            }
        }
        this.field2451.field3703 += var4;
        return 0;
    }

    @ObfuscatedName("gr.c(II)I")
    public int method3492(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2458[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2451.method5110() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2451.method5110() << 16;
            }
            return var8;
        }
        int var3 = this.field2451.method5110();
        int var4 = this.field2451.method5128();
        if (var3 == 47) {
            this.field2451.field3703 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2451.method5226();
            var4 -= 3;
            int var6 = this.field2457[arg0];
            this.field2460 += (long) (this.field2452 - var5) * (long) var6;
            this.field2452 = var5;
            this.field2451.field3703 += var4;
            return 2;
        } else {
            this.field2451.field3703 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gr.o(I)J")
    public long method3493(int arg0) {
        return (long) this.field2452 * (long) arg0 + this.field2460;
    }

    @ObfuscatedName("gr.l()I")
    public int method3494() {
        int var1 = this.field2456.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2456[var4] >= 0 && this.field2457[var4] < var3) {
                var2 = var4;
                var3 = this.field2457[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gr.t()Z")
    public boolean method3495() {
        int var1 = this.field2456.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2456[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gr.j(J)V")
    public void method3480(long arg0) {
        this.field2460 = arg0;
        int var3 = this.field2456.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2457[var4] = 0;
            this.field2454[var4] = 0;
            this.field2451.field3703 = this.field2459[var4];
            this.method3489(var4);
            this.field2456[var4] = this.field2451.field3703;
        }
    }
}
