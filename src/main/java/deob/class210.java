package deob;

@ObfuscatedName("hw")
public class class210 {

    @ObfuscatedName("hw.w")
    public class177 field2591 = new class177((byte[]) null);

    @ObfuscatedName("hw.o")
    public int field2586;

    @ObfuscatedName("hw.x")
    public int[] field2581;

    @ObfuscatedName("hw.k")
    public int[] field2584;

    @ObfuscatedName("hw.f")
    public int[] field2583;

    @ObfuscatedName("hw.i")
    public int[] field2580;

    @ObfuscatedName("hw.j")
    public int field2579;

    @ObfuscatedName("hw.u")
    public long field2587;

    @ObfuscatedName("hw.r")
    public static final byte[] field2588 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class210() {
    }

    public class210(byte[] arg0) {
        this.method3505(arg0);
    }

    @ObfuscatedName("hw.w([B)V")
    public void method3505(byte[] arg0) {
        this.field2591.field2419 = arg0;
        this.field2591.field2412 = 10;
        int var2 = this.field2591.method2886();
        this.field2586 = this.field2591.method2886();
        this.field2579 = 500000;
        this.field2581 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2591.method2904();
            int var5 = this.field2591.method2904();
            if (var4 == 1297379947) {
                this.field2581[var3] = this.field2591.field2412;
                var3++;
            }
            this.field2591.field2412 += var5;
        }
        this.field2587 = 0L;
        this.field2584 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2584[var6] = this.field2581[var6];
        }
        this.field2583 = new int[var2];
        this.field2580 = new int[var2];
    }

    @ObfuscatedName("hw.o()V")
    public void method3494() {
        this.field2591.field2419 = null;
        this.field2581 = null;
        this.field2584 = null;
        this.field2583 = null;
        this.field2580 = null;
    }

    @ObfuscatedName("hw.x()Z")
    public boolean method3495() {
        return this.field2591.field2419 != null;
    }

    @ObfuscatedName("hw.k()I")
    public int method3496() {
        return this.field2584.length;
    }

    @ObfuscatedName("hw.f(I)V")
    public void method3506(int arg0) {
        this.field2591.field2412 = this.field2584[arg0];
    }

    @ObfuscatedName("hw.i(I)V")
    public void method3498(int arg0) {
        this.field2584[arg0] = this.field2591.field2412;
    }

    @ObfuscatedName("hw.j()V")
    public void method3499() {
        this.field2591.field2412 = -1;
    }

    @ObfuscatedName("hw.m(I)V")
    public void method3500(int arg0) {
        int var2 = this.field2591.method2900();
        this.field2583[arg0] += var2;
    }

    @ObfuscatedName("hw.u(I)I")
    public int method3539(int arg0) {
        return this.method3501(arg0);
    }

    @ObfuscatedName("hw.h(I)I")
    public int method3501(int arg0) {
        byte var2 = this.field2591.field2419[this.field2591.field2412];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2580[arg0] = var3;
            this.field2591.field2412++;
        } else {
            var3 = this.field2580[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3515(arg0, var3);
        }
        int var4 = this.field2591.method2900();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2591.field2419[this.field2591.field2412] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2591.field2412++;
                this.field2580[arg0] = var5;
                return this.method3515(arg0, var5);
            }
        }
        this.field2591.field2412 += var4;
        return 0;
    }

    @ObfuscatedName("hw.a(II)I")
    public int method3515(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2588[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2591.method2931() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2591.method2931() << 16;
            }
            return var8;
        }
        int var3 = this.field2591.method2931();
        int var4 = this.field2591.method2900();
        if (var3 == 47) {
            this.field2591.field2412 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2591.method2888();
            var4 -= 3;
            int var6 = this.field2583[arg0];
            this.field2587 += (long) (this.field2579 - var5) * (long) var6;
            this.field2579 = var5;
            this.field2591.field2412 += var4;
            return 2;
        } else {
            this.field2591.field2412 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hw.p(I)J")
    public long method3510(int arg0) {
        return (long) this.field2579 * (long) arg0 + this.field2587;
    }

    @ObfuscatedName("hw.q()I")
    public int method3519() {
        int var1 = this.field2584.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2584[var4] >= 0 && this.field2583[var4] < var3) {
                var2 = var4;
                var3 = this.field2583[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hw.l()Z")
    public boolean method3502() {
        int var1 = this.field2584.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2584[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hw.c(J)V")
    public void method3537(long arg0) {
        this.field2587 = arg0;
        int var3 = this.field2584.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2583[var4] = 0;
            this.field2580[var4] = 0;
            this.field2591.field2412 = this.field2581[var4];
            this.method3500(var4);
            this.field2584[var4] = this.field2591.field2412;
        }
    }
}
