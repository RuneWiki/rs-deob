package deob;

@ObfuscatedName("hf")
public class class218 {

    @ObfuscatedName("hf.a")
    public class185 field2685 = new class185((byte[]) null);

    @ObfuscatedName("hf.w")
    public int field2683;

    @ObfuscatedName("hf.e")
    public int[] field2694;

    @ObfuscatedName("hf.k")
    public int[] field2687;

    @ObfuscatedName("hf.u")
    public int[] field2686;

    @ObfuscatedName("hf.z")
    public int[] field2692;

    @ObfuscatedName("hf.t")
    public int field2688;

    @ObfuscatedName("hf.g")
    public long field2690;

    @ObfuscatedName("hf.j")
    public static final byte[] field2691 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class218() {
    }

    public class218(byte[] arg0) {
        this.method3653(arg0);
    }

    @ObfuscatedName("hf.a([B)V")
    public void method3653(byte[] arg0) {
        this.field2685.field2512 = arg0;
        this.field2685.field2509 = 10;
        int var2 = this.field2685.method3194();
        this.field2683 = this.field2685.method3194();
        this.field2688 = 500000;
        this.field2694 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2685.method2967();
            int var5 = this.field2685.method2967();
            if (var4 == 1297379947) {
                this.field2694[var3] = this.field2685.field2509;
                var3++;
            }
            this.field2685.field2509 += var5;
        }
        this.field2690 = 0L;
        this.field2687 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2687[var6] = this.field2694[var6];
        }
        this.field2686 = new int[var2];
        this.field2692 = new int[var2];
    }

    @ObfuscatedName("hf.w()V")
    public void method3654() {
        this.field2685.field2512 = null;
        this.field2694 = null;
        this.field2687 = null;
        this.field2686 = null;
        this.field2692 = null;
    }

    @ObfuscatedName("hf.e()Z")
    public boolean method3655() {
        return this.field2685.field2512 != null;
    }

    @ObfuscatedName("hf.k()I")
    public int method3686() {
        return this.field2687.length;
    }

    @ObfuscatedName("hf.u(I)V")
    public void method3689(int arg0) {
        this.field2685.field2509 = this.field2687[arg0];
    }

    @ObfuscatedName("hf.z(I)V")
    public void method3698(int arg0) {
        this.field2687[arg0] = this.field2685.field2509;
    }

    @ObfuscatedName("hf.t()V")
    public void method3659() {
        this.field2685.field2509 = -1;
    }

    @ObfuscatedName("hf.f(I)V")
    public void method3695(int arg0) {
        int var2 = this.field2685.method3039();
        this.field2686[arg0] += var2;
    }

    @ObfuscatedName("hf.g(I)I")
    public int method3692(int arg0) {
        return this.method3662(arg0);
    }

    @ObfuscatedName("hf.x(I)I")
    public int method3662(int arg0) {
        byte var2 = this.field2685.field2512[this.field2685.field2509];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2692[arg0] = var3;
            this.field2685.field2509++;
        } else {
            var3 = this.field2692[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3680(arg0, var3);
        }
        int var4 = this.field2685.method3039();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2685.field2512[this.field2685.field2509] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2685.field2509++;
                this.field2692[arg0] = var5;
                return this.method3680(arg0, var5);
            }
        }
        this.field2685.field2509 += var4;
        return 0;
    }

    @ObfuscatedName("hf.c(II)I")
    public int method3680(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2691[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2685.method2962() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2685.method2962() << 16;
            }
            return var8;
        }
        int var3 = this.field2685.method2962();
        int var4 = this.field2685.method3039();
        if (var3 == 47) {
            this.field2685.field2509 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2685.method2966();
            var4 -= 3;
            int var6 = this.field2686[arg0];
            this.field2690 += (long) (this.field2688 - var5) * (long) var6;
            this.field2688 = var5;
            this.field2685.field2509 += var4;
            return 2;
        } else {
            this.field2685.field2509 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hf.n(I)J")
    public long method3664(int arg0) {
        return (long) this.field2688 * (long) arg0 + this.field2690;
    }

    @ObfuscatedName("hf.y()I")
    public int method3669() {
        int var1 = this.field2687.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2687[var4] >= 0 && this.field2686[var4] < var3) {
                var2 = var4;
                var3 = this.field2686[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hf.o()Z")
    public boolean method3663() {
        int var1 = this.field2687.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2687[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hf.r(J)V")
    public void method3667(long arg0) {
        this.field2690 = arg0;
        int var3 = this.field2687.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2686[var4] = 0;
            this.field2692[var4] = 0;
            this.field2685.field2509 = this.field2694[var4];
            this.method3695(var4);
            this.field2687[var4] = this.field2685.field2509;
        }
    }
}
