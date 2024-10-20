package deob;

@ObfuscatedName("jw")
public class class276 {

    @ObfuscatedName("jw.s")
    public class444 field3238 = new class444((byte[]) null);

    @ObfuscatedName("jw.h")
    public int field3235;

    @ObfuscatedName("jw.w")
    public int[] field3246;

    @ObfuscatedName("jw.v")
    public int[] field3237;

    @ObfuscatedName("jw.c")
    public int[] field3247;

    @ObfuscatedName("jw.q")
    public int[] field3239;

    @ObfuscatedName("jw.i")
    public int field3240;

    @ObfuscatedName("jw.o")
    public long field3242;

    @ObfuscatedName("jw.n")
    public static final byte[] field3234 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class276() {
    }

    public class276(byte[] arg0) {
        this.method4785(arg0);
    }

    @ObfuscatedName("jw.s([B)V")
    public void method4785(byte[] arg0) {
        this.field3238.field4707 = arg0;
        this.field3238.field4708 = 10;
        int var2 = this.field3238.method7120();
        this.field3235 = this.field3238.method7120();
        this.field3240 = 500000;
        this.field3246 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3238.method6934();
            int var5 = this.field3238.method6934();
            if (var4 == 1297379947) {
                this.field3246[var3] = this.field3238.field4708;
                var3++;
            }
            this.field3238.field4708 += var5;
        }
        this.field3242 = 0L;
        this.field3237 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3237[var6] = this.field3246[var6];
        }
        this.field3247 = new int[var2];
        this.field3239 = new int[var2];
    }

    @ObfuscatedName("jw.h()V")
    public void method4786() {
        this.field3238.field4707 = null;
        this.field3246 = null;
        this.field3237 = null;
        this.field3247 = null;
        this.field3239 = null;
    }

    @ObfuscatedName("jw.w()Z")
    public boolean method4787() {
        return this.field3238.field4707 != null;
    }

    @ObfuscatedName("jw.v()I")
    public int method4826() {
        return this.field3237.length;
    }

    @ObfuscatedName("jw.c(I)V")
    public void method4792(int arg0) {
        this.field3238.field4708 = this.field3237[arg0];
    }

    @ObfuscatedName("jw.q(I)V")
    public void method4790(int arg0) {
        this.field3237[arg0] = this.field3238.field4708;
    }

    @ObfuscatedName("jw.i()V")
    public void method4791() {
        this.field3238.field4708 = -1;
    }

    @ObfuscatedName("jw.k(I)V")
    public void method4825(int arg0) {
        int var2 = this.field3238.method7119();
        this.field3247[arg0] += var2;
    }

    @ObfuscatedName("jw.o(I)I")
    public int method4793(int arg0) {
        return this.method4795(arg0);
    }

    @ObfuscatedName("jw.n(I)I")
    public int method4795(int arg0) {
        byte var2 = this.field3238.field4707[this.field3238.field4708];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3239[arg0] = var3;
            this.field3238.field4708++;
        } else {
            var3 = this.field3239[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4823(arg0, var3);
        }
        int var4 = this.field3238.method7119();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3238.field4707[this.field3238.field4708] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3238.field4708++;
                this.field3239[arg0] = var5;
                return this.method4823(arg0, var5);
            }
        }
        this.field3238.field4708 += var4;
        return 0;
    }

    @ObfuscatedName("jw.d(II)I")
    public int method4823(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3234[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3238.method6929() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3238.method6929() << 16;
            }
            return var8;
        }
        int var3 = this.field3238.method6929();
        int var4 = this.field3238.method7119();
        if (var3 == 47) {
            this.field3238.field4708 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3238.method7095();
            var4 -= 3;
            int var6 = this.field3247[arg0];
            this.field3242 += (long) (this.field3240 - var5) * (long) var6;
            this.field3240 = var5;
            this.field3238.field4708 += var4;
            return 2;
        } else {
            this.field3238.field4708 += var4;
            return 3;
        }
    }

    @ObfuscatedName("jw.a(I)J")
    public long method4796(int arg0) {
        return (long) this.field3240 * (long) arg0 + this.field3242;
    }

    @ObfuscatedName("jw.m()I")
    public int method4797() {
        int var1 = this.field3237.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3237[var4] >= 0 && this.field3247[var4] < var3) {
                var2 = var4;
                var3 = this.field3247[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("jw.u()Z")
    public boolean method4804() {
        int var1 = this.field3237.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3237[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("jw.l(J)V")
    public void method4799(long arg0) {
        this.field3242 = arg0;
        int var3 = this.field3237.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3247[var4] = 0;
            this.field3239[var4] = 0;
            this.field3238.field4708 = this.field3246[var4];
            this.method4825(var4);
            this.field3237[var4] = this.field3238.field4708;
        }
    }
}
