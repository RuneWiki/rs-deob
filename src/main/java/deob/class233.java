package deob;

@ObfuscatedName("ho")
public class class233 {

    @ObfuscatedName("ho.c")
    public class195 field2744 = new class195((byte[]) null);

    @ObfuscatedName("ho.i")
    public int field2737;

    @ObfuscatedName("ho.o")
    public int[] field2738;

    @ObfuscatedName("ho.j")
    public int[] field2739;

    @ObfuscatedName("ho.k")
    public int[] field2740;

    @ObfuscatedName("ho.x")
    public int[] field2736;

    @ObfuscatedName("ho.z")
    public int field2742;

    @ObfuscatedName("ho.w")
    public long field2745;

    @ObfuscatedName("ho.r")
    public static final byte[] field2743 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class233() {
    }

    public class233(byte[] arg0) {
        this.method3934(arg0);
    }

    @ObfuscatedName("ho.c([B)V")
    public void method3934(byte[] arg0) {
        this.field2744.field2567 = arg0;
        this.field2744.field2566 = 10;
        int var2 = this.field2744.method3218();
        this.field2737 = this.field2744.method3218();
        this.field2742 = 500000;
        this.field2738 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2744.method3230();
            int var5 = this.field2744.method3230();
            if (var4 == 1297379947) {
                this.field2738[var3] = this.field2744.field2566;
                var3++;
            }
            this.field2744.field2566 += var5;
        }
        this.field2745 = 0L;
        this.field2739 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2739[var6] = this.field2738[var6];
        }
        this.field2740 = new int[var2];
        this.field2736 = new int[var2];
    }

    @ObfuscatedName("ho.i()V")
    public void method3935() {
        this.field2744.field2567 = null;
        this.field2738 = null;
        this.field2739 = null;
        this.field2740 = null;
        this.field2736 = null;
    }

    @ObfuscatedName("ho.o()Z")
    public boolean method3936() {
        return this.field2744.field2567 != null;
    }

    @ObfuscatedName("ho.j()I")
    public int method3948() {
        return this.field2739.length;
    }

    @ObfuscatedName("ho.k(I)V")
    public void method3938(int arg0) {
        this.field2744.field2566 = this.field2739[arg0];
    }

    @ObfuscatedName("ho.x(I)V")
    public void method3939(int arg0) {
        this.field2739[arg0] = this.field2744.field2566;
    }

    @ObfuscatedName("ho.z()V")
    public void method3940() {
        this.field2744.field2566 = -1;
    }

    @ObfuscatedName("ho.p(I)V")
    public void method3941(int arg0) {
        int var2 = this.field2744.method3242();
        this.field2740[arg0] += var2;
    }

    @ObfuscatedName("ho.w(I)I")
    public int method3963(int arg0) {
        return this.method3968(arg0);
    }

    @ObfuscatedName("ho.r(I)I")
    public int method3968(int arg0) {
        byte var2 = this.field2744.field2567[this.field2744.field2566];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2736[arg0] = var3;
            this.field2744.field2566++;
        } else {
            var3 = this.field2736[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3974(arg0, var3);
        }
        int var4 = this.field2744.method3242();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2744.field2567[this.field2744.field2566] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2744.field2566++;
                this.field2736[arg0] = var5;
                return this.method3974(arg0, var5);
            }
        }
        this.field2744.field2566 += var4;
        return 0;
    }

    @ObfuscatedName("ho.d(II)I")
    public int method3974(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2743[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2744.method3429() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2744.method3429() << 16;
            }
            return var8;
        }
        int var3 = this.field2744.method3429();
        int var4 = this.field2744.method3242();
        if (var3 == 47) {
            this.field2744.field2566 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2744.method3293();
            var4 -= 3;
            int var6 = this.field2740[arg0];
            this.field2745 += (long) (this.field2742 - var5) * (long) var6;
            this.field2742 = var5;
            this.field2744.field2566 += var4;
            return 2;
        } else {
            this.field2744.field2566 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ho.a(I)J")
    public long method3945(int arg0) {
        return (long) this.field2742 * (long) arg0 + this.field2745;
    }

    @ObfuscatedName("ho.b()I")
    public int method3937() {
        int var1 = this.field2739.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2739[var4] >= 0 && this.field2740[var4] < var3) {
                var2 = var4;
                var3 = this.field2740[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ho.h()Z")
    public boolean method3947() {
        int var1 = this.field2739.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2739[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ho.n(J)V")
    public void method3950(long arg0) {
        this.field2745 = arg0;
        int var3 = this.field2739.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2740[var4] = 0;
            this.field2736[var4] = 0;
            this.field2744.field2566 = this.field2738[var4];
            this.method3941(var4);
            this.field2739[var4] = this.field2744.field2566;
        }
    }
}
