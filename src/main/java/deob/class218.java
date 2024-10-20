package deob;

@ObfuscatedName("hi")
public class class218 {

    @ObfuscatedName("hi.n")
    public class185 field2690 = new class185((byte[]) null);

    @ObfuscatedName("hi.v")
    public int field2689;

    @ObfuscatedName("hi.y")
    public int[] field2695;

    @ObfuscatedName("hi.r")
    public int[] field2691;

    @ObfuscatedName("hi.h")
    public int[] field2692;

    @ObfuscatedName("hi.d")
    public int[] field2693;

    @ObfuscatedName("hi.s")
    public int field2694;

    @ObfuscatedName("hi.e")
    public long field2696;

    @ObfuscatedName("hi.f")
    public static final byte[] field2688 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class218() {
    }

    public class218(byte[] arg0) {
        this.method3681(arg0);
    }

    @ObfuscatedName("hi.n([B)V")
    public void method3681(byte[] arg0) {
        this.field2690.field2528 = arg0;
        this.field2690.field2529 = 10;
        int var2 = this.field2690.method3015();
        this.field2689 = this.field2690.method3015();
        this.field2694 = 500000;
        this.field2695 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2690.method3026();
            int var5 = this.field2690.method3026();
            if (var4 == 1297379947) {
                this.field2695[var3] = this.field2690.field2529;
                var3++;
            }
            this.field2690.field2529 += var5;
        }
        this.field2696 = 0L;
        this.field2691 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2691[var6] = this.field2695[var6];
        }
        this.field2692 = new int[var2];
        this.field2693 = new int[var2];
    }

    @ObfuscatedName("hi.v()V")
    public void method3682() {
        this.field2690.field2528 = null;
        this.field2695 = null;
        this.field2691 = null;
        this.field2692 = null;
        this.field2693 = null;
    }

    @ObfuscatedName("hi.y()Z")
    public boolean method3683() {
        return this.field2690.field2528 != null;
    }

    @ObfuscatedName("hi.r()I")
    public int method3684() {
        return this.field2691.length;
    }

    @ObfuscatedName("hi.h(I)V")
    public void method3704(int arg0) {
        this.field2690.field2529 = this.field2691[arg0];
    }

    @ObfuscatedName("hi.d(I)V")
    public void method3686(int arg0) {
        this.field2691[arg0] = this.field2690.field2529;
    }

    @ObfuscatedName("hi.s()V")
    public void method3690() {
        this.field2690.field2529 = -1;
    }

    @ObfuscatedName("hi.b(I)V")
    public void method3688(int arg0) {
        int var2 = this.field2690.method3038();
        this.field2692[arg0] += var2;
    }

    @ObfuscatedName("hi.e(I)I")
    public int method3689(int arg0) {
        return this.method3698(arg0);
    }

    @ObfuscatedName("hi.f(I)I")
    public int method3698(int arg0) {
        byte var2 = this.field2690.field2528[this.field2690.field2529];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2693[arg0] = var3;
            this.field2690.field2529++;
        } else {
            var3 = this.field2693[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3691(arg0, var3);
        }
        int var4 = this.field2690.method3038();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2690.field2528[this.field2690.field2529] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2690.field2529++;
                this.field2693[arg0] = var5;
                return this.method3691(arg0, var5);
            }
        }
        this.field2690.field2529 += var4;
        return 0;
    }

    @ObfuscatedName("hi.u(II)I")
    public int method3691(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2688[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2690.method3021() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2690.method3021() << 16;
            }
            return var8;
        }
        int var3 = this.field2690.method3021();
        int var4 = this.field2690.method3038();
        if (var3 == 47) {
            this.field2690.field2529 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2690.method3025();
            var4 -= 3;
            int var6 = this.field2692[arg0];
            this.field2696 += (long) (this.field2694 - var5) * (long) var6;
            this.field2694 = var5;
            this.field2690.field2529 += var4;
            return 2;
        } else {
            this.field2690.field2529 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hi.t(I)J")
    public long method3692(int arg0) {
        return (long) this.field2694 * (long) arg0 + this.field2696;
    }

    @ObfuscatedName("hi.o()I")
    public int method3711() {
        int var1 = this.field2691.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2691[var4] >= 0 && this.field2692[var4] < var3) {
                var2 = var4;
                var3 = this.field2692[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hi.a()Z")
    public boolean method3694() {
        int var1 = this.field2691.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2691[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hi.i(J)V")
    public void method3695(long arg0) {
        this.field2696 = arg0;
        int var3 = this.field2691.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2692[var4] = 0;
            this.field2693[var4] = 0;
            this.field2690.field2529 = this.field2695[var4];
            this.method3688(var4);
            this.field2691[var4] = this.field2690.field2529;
        }
    }
}
