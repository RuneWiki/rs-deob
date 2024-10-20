package deob;

@ObfuscatedName("jq")
public class class282 extends class346 {

    @ObfuscatedName("jq.p")
    public static class199 field3433 = new class199(64);

    @ObfuscatedName("jq.b")
    public int field3435 = -1;

    @ObfuscatedName("jq.e")
    public int[] field3431;

    @ObfuscatedName("jq.k")
    public short[] field3434;

    @ObfuscatedName("jq.g")
    public short[] field3437;

    @ObfuscatedName("jq.h")
    public short[] field3436;

    @ObfuscatedName("jq.n")
    public short[] field3439;

    @ObfuscatedName("jq.l")
    public int[] field3440 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("jq.m")
    public boolean field3441 = false;

    @ObfuscatedName("hh.f(IB)Ljq;")
    public static class282 method3652(int arg0) {
        class282 var1 = (class282) field3433.method3398((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3438.method3933(3, arg0);
        class282 var3 = new class282();
        if (var2 != null) {
            var3.method4383(new class382(var2));
        }
        field3433.method3400(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jq.o(Lnu;I)V")
    public void method4383(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            this.method4379(arg0, var2);
        }
    }

    @ObfuscatedName("jq.u(Lnu;IB)V")
    public void method4379(class382 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3435 = arg0.method5856();
        } else if (arg1 == 2) {
            int var3 = arg0.method5856();
            this.field3431 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3431[var4] = arg0.method5858();
            }
        } else if (arg1 == 3) {
            this.field3441 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5856();
            this.field3434 = new short[var5];
            this.field3437 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3434[var6] = (short) arg0.method5858();
                this.field3437[var6] = (short) arg0.method5858();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5856();
            this.field3436 = new short[var7];
            this.field3439 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3436[var8] = (short) arg0.method5858();
                this.field3439[var8] = (short) arg0.method5858();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3440[arg1 - 60] = arg0.method5858();
        }
    }

    @ObfuscatedName("jq.p(S)Z")
    public boolean method4380() {
        if (this.field3431 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3431.length; var2++) {
            if (!Statics.field3346.method3935(this.field3431[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jq.b(B)Lfs;")
    public class169 method4400() {
        if (this.field3431 == null) {
            return null;
        }
        class169[] var1 = new class169[this.field3431.length];
        for (int var2 = 0; var2 < this.field3431.length; var2++) {
            var1[var2] = class169.method2839(Statics.field3346, this.field3431[var2], 0);
        }
        class169 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class169(var1, var1.length);
        }
        if (this.field3434 != null) {
            for (int var4 = 0; var4 < this.field3434.length; var4++) {
                var3.method2852(this.field3434[var4], this.field3437[var4]);
            }
        }
        if (this.field3436 != null) {
            for (int var5 = 0; var5 < this.field3436.length; var5++) {
                var3.method2842(this.field3436[var5], this.field3439[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("jq.e(I)Z")
    public boolean method4385() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3440[var2] != -1 && !Statics.field3346.method3935(this.field3440[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jq.k(I)Lfs;")
    public class169 method4377() {
        class169[] var1 = new class169[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3440[var3] != -1) {
                var1[var2++] = class169.method2839(Statics.field3346, this.field3440[var3], 0);
            }
        }
        class169 var4 = new class169(var1, var2);
        if (this.field3434 != null) {
            for (int var5 = 0; var5 < this.field3434.length; var5++) {
                var4.method2852(this.field3434[var5], this.field3437[var5]);
            }
        }
        if (this.field3436 != null) {
            for (int var6 = 0; var6 < this.field3436.length; var6++) {
                var4.method2842(this.field3436[var6], this.field3439[var6]);
            }
        }
        return var4;
    }
}
