package deob;

@ObfuscatedName("hf")
public class class228 {

    @ObfuscatedName("hf.a")
    public class190 field2619 = new class190((byte[]) null);

    @ObfuscatedName("hf.s")
    public int field2615;

    @ObfuscatedName("hf.g")
    public int[] field2611;

    @ObfuscatedName("hf.x")
    public int[] field2610;

    @ObfuscatedName("hf.h")
    public int[] field2613;

    @ObfuscatedName("hf.f")
    public int[] field2614;

    @ObfuscatedName("hf.p")
    public int field2612;

    @ObfuscatedName("hf.q")
    public long field2617;

    @ObfuscatedName("hf.b")
    public static final byte[] field2618 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class228() {
    }

    public class228(byte[] arg0) {
        this.method4209(arg0);
    }

    @ObfuscatedName("hf.a([B)V")
    public void method4209(byte[] arg0) {
        this.field2619.field2420 = arg0;
        this.field2619.field2419 = 10;
        int var2 = this.field2619.method3610();
        this.field2615 = this.field2619.method3610();
        this.field2612 = 500000;
        this.field2611 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2619.method3460();
            int var5 = this.field2619.method3460();
            if (var4 == 1297379947) {
                this.field2611[var3] = this.field2619.field2419;
                var3++;
            }
            this.field2619.field2419 += var5;
        }
        this.field2617 = 0L;
        this.field2610 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2610[var6] = this.field2611[var6];
        }
        this.field2613 = new int[var2];
        this.field2614 = new int[var2];
    }

    @ObfuscatedName("hf.s()V")
    public void method4189() {
        this.field2619.field2420 = null;
        this.field2611 = null;
        this.field2610 = null;
        this.field2613 = null;
        this.field2614 = null;
    }

    @ObfuscatedName("hf.g()Z")
    public boolean method4184() {
        return this.field2619.field2420 != null;
    }

    @ObfuscatedName("hf.x()I")
    public int method4185() {
        return this.field2610.length;
    }

    @ObfuscatedName("hf.h(I)V")
    public void method4186(int arg0) {
        this.field2619.field2419 = this.field2610[arg0];
    }

    @ObfuscatedName("hf.f(I)V")
    public void method4216(int arg0) {
        this.field2610[arg0] = this.field2619.field2419;
    }

    @ObfuscatedName("hf.p()V")
    public void method4212() {
        this.field2619.field2419 = -1;
    }

    @ObfuscatedName("hf.m(I)V")
    public void method4188(int arg0) {
        int var2 = this.field2619.method3473();
        this.field2613[arg0] += var2;
    }

    @ObfuscatedName("hf.q(I)I")
    public int method4190(int arg0) {
        return this.method4191(arg0);
    }

    @ObfuscatedName("hf.b(I)I")
    public int method4191(int arg0) {
        byte var2 = this.field2619.field2420[this.field2619.field2419];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2614[arg0] = var3;
            this.field2619.field2419++;
        } else {
            var3 = this.field2614[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4192(arg0, var3);
        }
        int var4 = this.field2619.method3473();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2619.field2420[this.field2619.field2419] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2619.field2419++;
                this.field2614[arg0] = var5;
                return this.method4192(arg0, var5);
            }
        }
        this.field2619.field2419 += var4;
        return 0;
    }

    @ObfuscatedName("hf.n(II)I")
    public int method4192(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2618[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2619.method3443() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2619.method3443() << 16;
            }
            return var8;
        }
        int var3 = this.field2619.method3443();
        int var4 = this.field2619.method3473();
        if (var3 == 47) {
            this.field2619.field2419 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2619.method3459();
            var4 -= 3;
            int var6 = this.field2613[arg0];
            this.field2617 += (long) (this.field2612 - var5) * (long) var6;
            this.field2612 = var5;
            this.field2619.field2419 += var4;
            return 2;
        } else {
            this.field2619.field2419 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hf.e(I)J")
    public long method4193(int arg0) {
        return (long) this.field2612 * (long) arg0 + this.field2617;
    }

    @ObfuscatedName("hf.r()I")
    public int method4194() {
        int var1 = this.field2610.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2610[var4] >= 0 && this.field2613[var4] < var3) {
                var2 = var4;
                var3 = this.field2613[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hf.t()Z")
    public boolean method4195() {
        int var1 = this.field2610.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2610[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hf.l(J)V")
    public void method4196(long arg0) {
        this.field2617 = arg0;
        int var3 = this.field2610.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2613[var4] = 0;
            this.field2614[var4] = 0;
            this.field2619.field2419 = this.field2611[var4];
            this.method4188(var4);
            this.field2610[var4] = this.field2619.field2419;
        }
    }
}
