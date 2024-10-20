package deob;

@ObfuscatedName("fx")
public class class160 {

    @ObfuscatedName("fx.e")
    public class107 field2687 = new class107((byte[]) null);

    @ObfuscatedName("fx.o")
    public int field2690;

    @ObfuscatedName("fx.y")
    public int[] field2694;

    @ObfuscatedName("fx.b")
    public int[] field2689;

    @ObfuscatedName("fx.w")
    public int[] field2691;

    @ObfuscatedName("fx.r")
    public int[] field2686;

    @ObfuscatedName("fx.l")
    public int field2692;

    @ObfuscatedName("fx.f")
    public long field2695;

    @ObfuscatedName("fx.x")
    public static final byte[] field2697 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class160() {
    }

    public class160(byte[] arg0) {
        this.method2876(arg0);
    }

    @ObfuscatedName("fx.e([B)V")
    public void method2876(byte[] arg0) {
        this.field2687.field1840 = arg0;
        this.field2687.field1841 = 10;
        int var2 = this.field2687.method2232();
        this.field2690 = this.field2687.method2232();
        this.field2692 = 500000;
        this.field2694 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2687.method2207();
            int var5 = this.field2687.method2207();
            if (var4 == 1297379947) {
                this.field2694[var3] = this.field2687.field1841;
                var3++;
            }
            this.field2687.field1841 += var5;
        }
        this.field2695 = 0L;
        this.field2689 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2689[var6] = this.field2694[var6];
        }
        this.field2691 = new int[var2];
        this.field2686 = new int[var2];
    }

    @ObfuscatedName("fx.o()V")
    public void method2926() {
        this.field2687.field1840 = null;
        this.field2694 = null;
        this.field2689 = null;
        this.field2691 = null;
        this.field2686 = null;
    }

    @ObfuscatedName("fx.y()Z")
    public boolean method2903() {
        return this.field2687.field1840 != null;
    }

    @ObfuscatedName("fx.b()I")
    public int method2922() {
        return this.field2689.length;
    }

    @ObfuscatedName("fx.w(I)V")
    public void method2896(int arg0) {
        this.field2687.field1841 = this.field2689[arg0];
    }

    @ObfuscatedName("fx.r(I)V")
    public void method2880(int arg0) {
        this.field2689[arg0] = this.field2687.field1841;
    }

    @ObfuscatedName("fx.l()V")
    public void method2881() {
        this.field2687.field1841 = -1;
    }

    @ObfuscatedName("fx.s(I)V")
    public void method2882(int arg0) {
        int var2 = this.field2687.method2112();
        this.field2691[arg0] += var2;
    }

    @ObfuscatedName("fx.f(I)I")
    public int method2883(int arg0) {
        return this.method2884(arg0);
    }

    @ObfuscatedName("fx.x(I)I")
    public int method2884(int arg0) {
        byte var2 = this.field2687.field1840[this.field2687.field1841];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2686[arg0] = var3;
            this.field2687.field1841++;
        } else {
            var3 = this.field2686[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2879(arg0, var3);
        }
        int var4 = this.field2687.method2112();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2687.field1840[this.field2687.field1841] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2687.field1841++;
                this.field2686[arg0] = var5;
                return this.method2879(arg0, var5);
            }
        }
        this.field2687.field1841 += var4;
        return 0;
    }

    @ObfuscatedName("fx.h(II)I")
    public int method2879(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2697[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2687.method2123() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2687.method2123() << 16;
            }
            return var8;
        }
        int var3 = this.field2687.method2123();
        int var4 = this.field2687.method2112();
        if (var3 == 47) {
            this.field2687.field1841 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2687.method2215();
            var4 -= 3;
            int var6 = this.field2691[arg0];
            this.field2695 += (long) (this.field2692 - var5) * (long) var6;
            this.field2692 = var5;
            this.field2687.field1841 += var4;
            return 2;
        } else {
            this.field2687.field1841 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fx.a(I)J")
    public long method2886(int arg0) {
        return (long) this.field2692 * (long) arg0 + this.field2695;
    }

    @ObfuscatedName("fx.u()I")
    public int method2887() {
        int var1 = this.field2689.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2689[var4] >= 0 && this.field2691[var4] < var3) {
                var2 = var4;
                var3 = this.field2691[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fx.v()Z")
    public boolean method2888() {
        int var1 = this.field2689.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2689[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fx.i(J)V")
    public void method2889(long arg0) {
        this.field2695 = arg0;
        int var3 = this.field2689.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2691[var4] = 0;
            this.field2686[var4] = 0;
            this.field2687.field1841 = this.field2694[var4];
            this.method2882(var4);
            this.field2689[var4] = this.field2687.field1841;
        }
    }
}
