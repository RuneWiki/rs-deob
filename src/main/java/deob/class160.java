package deob;

@ObfuscatedName("fk")
public class class160 {

    @ObfuscatedName("fk.k")
    public class107 field2705 = new class107((byte[]) null);

    @ObfuscatedName("fk.b")
    public int field2698;

    @ObfuscatedName("fk.e")
    public int[] field2699;

    @ObfuscatedName("fk.i")
    public int[] field2700;

    @ObfuscatedName("fk.t")
    public int[] field2702;

    @ObfuscatedName("fk.z")
    public int[] field2707;

    @ObfuscatedName("fk.g")
    public int field2703;

    @ObfuscatedName("fk.o")
    public long field2709;

    @ObfuscatedName("fk.q")
    public static final byte[] field2706 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class160() {
    }

    public class160(byte[] arg0) {
        this.method2975(arg0);
    }

    @ObfuscatedName("fk.k([B)V")
    public void method2975(byte[] arg0) {
        this.field2705.field1857 = arg0;
        this.field2705.field1862 = 10;
        int var2 = this.field2705.method2117();
        this.field2698 = this.field2705.method2117();
        this.field2703 = 500000;
        this.field2699 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2705.method2120();
            int var5 = this.field2705.method2120();
            if (var4 == 1297379947) {
                this.field2699[var3] = this.field2705.field1862;
                var3++;
            }
            this.field2705.field1862 += var5;
        }
        this.field2709 = 0L;
        this.field2700 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2700[var6] = this.field2699[var6];
        }
        this.field2702 = new int[var2];
        this.field2707 = new int[var2];
    }

    @ObfuscatedName("fk.b()V")
    public void method2964() {
        this.field2705.field1857 = null;
        this.field2699 = null;
        this.field2700 = null;
        this.field2702 = null;
        this.field2707 = null;
    }

    @ObfuscatedName("fk.e()Z")
    public boolean method2965() {
        return this.field2705.field1857 != null;
    }

    @ObfuscatedName("fk.i()I")
    public int method2966() {
        return this.field2700.length;
    }

    @ObfuscatedName("fk.t(I)V")
    public void method2974(int arg0) {
        this.field2705.field1862 = this.field2700[arg0];
    }

    @ObfuscatedName("fk.z(I)V")
    public void method2968(int arg0) {
        this.field2700[arg0] = this.field2705.field1862;
    }

    @ObfuscatedName("fk.g()V")
    public void method2962() {
        this.field2705.field1862 = -1;
    }

    @ObfuscatedName("fk.c(I)V")
    public void method2970(int arg0) {
        int var2 = this.field2705.method2241();
        this.field2702[arg0] += var2;
    }

    @ObfuscatedName("fk.o(I)I")
    public int method2971(int arg0) {
        return this.method2972(arg0);
    }

    @ObfuscatedName("fk.q(I)I")
    public int method2972(int arg0) {
        byte var2 = this.field2705.field1857[this.field2705.field1862];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2707[arg0] = var3;
            this.field2705.field1862++;
        } else {
            var3 = this.field2707[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2973(arg0, var3);
        }
        int var4 = this.field2705.method2241();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2705.field1857[this.field2705.field1862] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2705.field1862++;
                this.field2707[arg0] = var5;
                return this.method2973(arg0, var5);
            }
        }
        this.field2705.field1862 += var4;
        return 0;
    }

    @ObfuscatedName("fk.w(II)I")
    public int method2973(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2706[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2705.method2115() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2705.method2115() << 16;
            }
            return var8;
        }
        int var3 = this.field2705.method2115();
        int var4 = this.field2705.method2241();
        if (var3 == 47) {
            this.field2705.field1862 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2705.method2119();
            var4 -= 3;
            int var6 = this.field2702[arg0];
            this.field2709 += (long) (this.field2703 - var5) * (long) var6;
            this.field2703 = var5;
            this.field2705.field1862 += var4;
            return 2;
        } else {
            this.field2705.field1862 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fk.y(I)J")
    public long method3003(int arg0) {
        return (long) this.field2703 * (long) arg0 + this.field2709;
    }

    @ObfuscatedName("fk.p()I")
    public int method2989() {
        int var1 = this.field2700.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2700[var4] >= 0 && this.field2702[var4] < var3) {
                var2 = var4;
                var3 = this.field2702[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fk.m()Z")
    public boolean method3008() {
        int var1 = this.field2700.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2700[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fk.a(J)V")
    public void method2999(long arg0) {
        this.field2709 = arg0;
        int var3 = this.field2700.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2702[var4] = 0;
            this.field2707[var4] = 0;
            this.field2705.field1862 = this.field2699[var4];
            this.method2970(var4);
            this.field2700[var4] = this.field2705.field1862;
        }
    }
}
