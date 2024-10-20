package deob;

@ObfuscatedName("jk")
public class class276 {

    @ObfuscatedName("jk.v")
    public class438 field3212 = new class438((byte[]) null);

    @ObfuscatedName("jk.c")
    public int field3208;

    @ObfuscatedName("jk.i")
    public int[] field3209;

    @ObfuscatedName("jk.f")
    public int[] field3210;

    @ObfuscatedName("jk.b")
    public int[] field3207;

    @ObfuscatedName("jk.n")
    public int[] field3211;

    @ObfuscatedName("jk.s")
    public int field3213;

    @ObfuscatedName("jk.q")
    public long field3215;

    @ObfuscatedName("jk.o")
    public static final byte[] field3216 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class276() {
    }

    public class276(byte[] arg0) {
        this.method4843(arg0);
    }

    @ObfuscatedName("jk.v([B)V")
    public void method4843(byte[] arg0) {
        this.field3212.field4618 = arg0;
        this.field3212.field4621 = 10;
        int var2 = this.field3212.method7148();
        this.field3208 = this.field3212.method7148();
        this.field3213 = 500000;
        this.field3209 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3212.method6976();
            int var5 = this.field3212.method6976();
            if (var4 == 1297379947) {
                this.field3209[var3] = this.field3212.field4621;
                var3++;
            }
            this.field3212.field4621 += var5;
        }
        this.field3215 = 0L;
        this.field3210 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3210[var6] = this.field3209[var6];
        }
        this.field3207 = new int[var2];
        this.field3211 = new int[var2];
    }

    @ObfuscatedName("jk.c()V")
    public void method4896() {
        this.field3212.field4618 = null;
        this.field3209 = null;
        this.field3210 = null;
        this.field3207 = null;
        this.field3211 = null;
    }

    @ObfuscatedName("jk.i()Z")
    public boolean method4845() {
        return this.field3212.field4618 != null;
    }

    @ObfuscatedName("jk.f()I")
    public int method4844() {
        return this.field3210.length;
    }

    @ObfuscatedName("jk.b(I)V")
    public void method4847(int arg0) {
        this.field3212.field4621 = this.field3210[arg0];
    }

    @ObfuscatedName("jk.n(I)V")
    public void method4842(int arg0) {
        this.field3210[arg0] = this.field3212.field4621;
    }

    @ObfuscatedName("jk.s()V")
    public void method4848() {
        this.field3212.field4621 = -1;
    }

    @ObfuscatedName("jk.l(I)V")
    public void method4883(int arg0) {
        int var2 = this.field3212.method6990();
        this.field3207[arg0] += var2;
    }

    @ObfuscatedName("jk.q(I)I")
    public int method4846(int arg0) {
        return this.method4898(arg0);
    }

    @ObfuscatedName("jk.o(I)I")
    public int method4898(int arg0) {
        byte var2 = this.field3212.field4618[this.field3212.field4621];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3211[arg0] = var3;
            this.field3212.field4621++;
        } else {
            var3 = this.field3211[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4852(arg0, var3);
        }
        int var4 = this.field3212.method6990();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3212.field4618[this.field3212.field4621] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3212.field4621++;
                this.field3211[arg0] = var5;
                return this.method4852(arg0, var5);
            }
        }
        this.field3212.field4621 += var4;
        return 0;
    }

    @ObfuscatedName("jk.r(II)I")
    public int method4852(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3216[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3212.method6971() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3212.method6971() << 16;
            }
            return var8;
        }
        int var3 = this.field3212.method6971();
        int var4 = this.field3212.method6990();
        if (var3 == 47) {
            this.field3212.field4621 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3212.method6975();
            var4 -= 3;
            int var6 = this.field3207[arg0];
            this.field3215 += (long) (this.field3213 - var5) * (long) var6;
            this.field3213 = var5;
            this.field3212.field4621 += var4;
            return 2;
        } else {
            this.field3212.field4621 += var4;
            return 3;
        }
    }

    @ObfuscatedName("jk.p(I)J")
    public long method4866(int arg0) {
        return (long) this.field3213 * (long) arg0 + this.field3215;
    }

    @ObfuscatedName("jk.w()I")
    public int method4854() {
        int var1 = this.field3210.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3210[var4] >= 0 && this.field3207[var4] < var3) {
                var2 = var4;
                var3 = this.field3207[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("jk.k()Z")
    public boolean method4855() {
        int var1 = this.field3210.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3210[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("jk.d(J)V")
    public void method4856(long arg0) {
        this.field3215 = arg0;
        int var3 = this.field3210.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3207[var4] = 0;
            this.field3211[var4] = 0;
            this.field3212.field4621 = this.field3209[var4];
            this.method4883(var4);
            this.field3210[var4] = this.field3212.field4621;
        }
    }
}
