package deob;

@ObfuscatedName("gw")
public class class202 implements class210 {

    @ObfuscatedName("gw.c")
    public class191[] field2404;

    @ObfuscatedName("gw.l")
    public class326 field2409 = new class326();

    @ObfuscatedName("gw.s")
    public int field2406;

    @ObfuscatedName("gw.e")
    public int field2407 = 0;

    @ObfuscatedName("gw.r")
    public double field2410 = 1.0D;

    @ObfuscatedName("gw.o")
    public int field2408 = 128;

    @ObfuscatedName("gw.i")
    public class307 field2405;

    public class202(class307 arg0, class307 arg1, int arg2, double arg3, int arg4) {
        this.field2405 = arg1;
        this.field2406 = arg2;
        this.field2407 = this.field2406;
        this.field2410 = arg3;
        this.field2408 = arg4;
        int[] var7 = arg0.method5084(0);
        int var8 = var7.length;
        this.field2404 = new class191[arg0.method5029(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class421 var10 = new class421(arg0.method5066(0, var7[var9]));
            this.field2404[var7[var9]] = new class191(var10);
        }
    }

    @ObfuscatedName("gw.c(I)I")
    public int method3775() {
        int var1 = 0;
        int var2 = 0;
        class191[] var3 = this.field2404;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class191 var5 = var3[var4];
            if (var5 != null && var5.field2219 != null) {
                var1 += var5.field2219.length;
                int[] var6 = var5.field2219;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2405.method5035(var8)) {
                        var2++;
                    }
                }
            }
        }
        if (var1 == 0) {
            return 0;
        } else {
            return var2 * 100 / var1;
        }
    }

    @ObfuscatedName("gw.l(D)V")
    public void method3794(double arg0) {
        this.field2410 = arg0;
        this.method3778();
    }

    @ObfuscatedName("gw.s(II)[I")
    public int[] method3777(int arg0) {
        class191 var2 = this.field2404[arg0];
        if (var2 != null) {
            if (var2.field2214 != null) {
                this.field2409.method5263(var2);
                var2.field2209 = true;
                return var2.field2214;
            }
            boolean var3 = var2.method3453(this.field2410, this.field2408, this.field2405);
            if (var3) {
                if (this.field2407 == 0) {
                    class191 var4 = (class191) this.field2409.method5268();
                    var4.method3454();
                } else {
                    this.field2407--;
                }
                this.field2409.method5263(var2);
                var2.field2209 = true;
                return var2.field2214;
            }
        }
        return null;
    }

    @ObfuscatedName("gw.e(IB)I")
    public int method3787(int arg0) {
        return this.field2404[arg0] == null ? 0 : this.field2404[arg0].field2211;
    }

    @ObfuscatedName("gw.r(IB)Z")
    public boolean method3779(int arg0) {
        return this.field2404[arg0].field2212;
    }

    @ObfuscatedName("gw.o(II)Z")
    public boolean method3800(int arg0) {
        return this.field2408 == 64;
    }

    @ObfuscatedName("gw.i(B)V")
    public void method3778() {
        for (int var1 = 0; var1 < this.field2404.length; var1++) {
            if (this.field2404[var1] != null) {
                this.field2404[var1].method3454();
            }
        }
        this.field2409 = new class326();
        this.field2407 = this.field2406;
    }

    @ObfuscatedName("gw.w(II)V")
    public void method3781(int arg0) {
        for (int var2 = 0; var2 < this.field2404.length; var2++) {
            class191 var3 = this.field2404[var2];
            if (var3 != null && var3.field2217 != 0 && var3.field2209) {
                var3.method3455(arg0);
                var3.field2209 = false;
            }
        }
    }
}
