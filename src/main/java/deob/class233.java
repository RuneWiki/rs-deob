package deob;

@ObfuscatedName("ho")
public class class233 {

    @ObfuscatedName("ho.o")
    public class195 field2755 = new class195((byte[]) null);

    @ObfuscatedName("ho.k")
    public int field2744;

    @ObfuscatedName("ho.t")
    public int[] field2745;

    @ObfuscatedName("ho.d")
    public int[] field2746;

    @ObfuscatedName("ho.h")
    public int[] field2754;

    @ObfuscatedName("ho.m")
    public int[] field2743;

    @ObfuscatedName("ho.z")
    public int field2748;

    @ObfuscatedName("ho.u")
    public long field2751;

    @ObfuscatedName("ho.x")
    public static final byte[] field2752 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class233() {
    }

    public class233(byte[] arg0) {
        this.method3951(arg0);
    }

    @ObfuscatedName("ho.o([B)V")
    public void method3951(byte[] arg0) {
        this.field2755.field2574 = arg0;
        this.field2755.field2575 = 10;
        int var2 = this.field2755.method3207();
        this.field2744 = this.field2755.method3207();
        this.field2748 = 500000;
        this.field2745 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2755.method3254();
            int var5 = this.field2755.method3254();
            if (var4 == 1297379947) {
                this.field2745[var3] = this.field2755.field2575;
                var3++;
            }
            this.field2755.field2575 += var5;
        }
        this.field2751 = 0L;
        this.field2746 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2746[var6] = this.field2745[var6];
        }
        this.field2754 = new int[var2];
        this.field2743 = new int[var2];
    }

    @ObfuscatedName("ho.k()V")
    public void method3921() {
        this.field2755.field2574 = null;
        this.field2745 = null;
        this.field2746 = null;
        this.field2754 = null;
        this.field2743 = null;
    }

    @ObfuscatedName("ho.t()Z")
    public boolean method3922() {
        return this.field2755.field2574 != null;
    }

    @ObfuscatedName("ho.d()I")
    public int method3923() {
        return this.field2746.length;
    }

    @ObfuscatedName("ho.h(I)V")
    public void method3924(int arg0) {
        this.field2755.field2575 = this.field2746[arg0];
    }

    @ObfuscatedName("ho.m(I)V")
    public void method3925(int arg0) {
        this.field2746[arg0] = this.field2755.field2575;
    }

    @ObfuscatedName("ho.z()V")
    public void method3926() {
        this.field2755.field2575 = -1;
    }

    @ObfuscatedName("ho.i(I)V")
    public void method3927(int arg0) {
        int var2 = this.field2755.method3354();
        this.field2754[arg0] += var2;
    }

    @ObfuscatedName("ho.u(I)I")
    public int method3928(int arg0) {
        return this.method3929(arg0);
    }

    @ObfuscatedName("ho.x(I)I")
    public int method3929(int arg0) {
        byte var2 = this.field2755.field2574[this.field2755.field2575];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2743[arg0] = var3;
            this.field2755.field2575++;
        } else {
            var3 = this.field2743[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3934(arg0, var3);
        }
        int var4 = this.field2755.method3354();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2755.field2574[this.field2755.field2575] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2755.field2575++;
                this.field2743[arg0] = var5;
                return this.method3934(arg0, var5);
            }
        }
        this.field2755.field2575 += var4;
        return 0;
    }

    @ObfuscatedName("ho.y(II)I")
    public int method3934(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2752[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2755.method3205() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2755.method3205() << 16;
            }
            return var8;
        }
        int var3 = this.field2755.method3205();
        int var4 = this.field2755.method3354();
        if (var3 == 47) {
            this.field2755.field2575 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2755.method3233();
            var4 -= 3;
            int var6 = this.field2754[arg0];
            this.field2751 += (long) (this.field2748 - var5) * (long) var6;
            this.field2748 = var5;
            this.field2755.field2575 += var4;
            return 2;
        } else {
            this.field2755.field2575 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ho.a(I)J")
    public long method3949(int arg0) {
        return (long) this.field2748 * (long) arg0 + this.field2751;
    }

    @ObfuscatedName("ho.v()I")
    public int method3932() {
        int var1 = this.field2746.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2746[var4] >= 0 && this.field2754[var4] < var3) {
                var2 = var4;
                var3 = this.field2754[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ho.q()Z")
    public boolean method3933() {
        int var1 = this.field2746.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2746[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ho.r(J)V")
    public void method3938(long arg0) {
        this.field2751 = arg0;
        int var3 = this.field2746.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2754[var4] = 0;
            this.field2743[var4] = 0;
            this.field2755.field2575 = this.field2745[var4];
            this.method3927(var4);
            this.field2746[var4] = this.field2755.field2575;
        }
    }
}
