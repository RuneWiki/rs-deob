package deob;

@ObfuscatedName("gr")
public class class202 implements class210 {

    @ObfuscatedName("gr.c")
    public class191[] field2391;

    @ObfuscatedName("gr.b")
    public class321 field2396 = new class321();

    @ObfuscatedName("gr.p")
    public int field2397;

    @ObfuscatedName("gr.m")
    public int field2392 = 0;

    @ObfuscatedName("gr.t")
    public double field2393 = 1.0D;

    @ObfuscatedName("gr.s")
    public int field2394 = 128;

    @ObfuscatedName("gr.j")
    public class302 field2395;

    public class202(class302 arg0, class302 arg1, int arg2, double arg3, int arg4) {
        this.field2395 = arg1;
        this.field2397 = arg2;
        this.field2392 = this.field2397;
        this.field2393 = arg3;
        this.field2394 = arg4;
        int[] var7 = arg0.method5063(0);
        int var8 = var7.length;
        this.field2391 = new class191[arg0.method5144(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class419 var10 = new class419(arg0.method5053(0, var7[var9]));
            this.field2391[var7[var9]] = new class191(var10);
        }
    }

    @ObfuscatedName("gr.c(B)I")
    public int method3831() {
        int var1 = 0;
        int var2 = 0;
        class191[] var3 = this.field2391;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class191 var5 = var3[var4];
            if (var5 != null && var5.field2212 != null) {
                var1 += var5.field2212.length;
                int[] var6 = var5.field2212;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2395.method5056(var8)) {
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

    @ObfuscatedName("gr.b(D)V")
    public void method3832(double arg0) {
        this.field2393 = arg0;
        this.method3837();
    }

    @ObfuscatedName("gr.p(IB)[I")
    public int[] method3833(int arg0) {
        class191 var2 = this.field2391[arg0];
        if (var2 != null) {
            if (var2.field2214 != null) {
                this.field2396.method5297(var2);
                var2.field2215 = true;
                return var2.field2214;
            }
            boolean var3 = var2.method3520(this.field2393, this.field2394, this.field2395);
            if (var3) {
                if (this.field2392 == 0) {
                    class191 var4 = (class191) this.field2396.method5304();
                    var4.method3523();
                } else {
                    this.field2392--;
                }
                this.field2396.method5297(var2);
                var2.field2215 = true;
                return var2.field2214;
            }
        }
        return null;
    }

    @ObfuscatedName("gr.m(II)I")
    public int method3834(int arg0) {
        return this.field2391[arg0] == null ? 0 : this.field2391[arg0].field2206;
    }

    @ObfuscatedName("gr.t(II)Z")
    public boolean method3857(int arg0) {
        return this.field2391[arg0].field2207;
    }

    @ObfuscatedName("gr.s(II)Z")
    public boolean method3830(int arg0) {
        return this.field2394 == 64;
    }

    @ObfuscatedName("gr.j(B)V")
    public void method3837() {
        for (int var1 = 0; var1 < this.field2391.length; var1++) {
            if (this.field2391[var1] != null) {
                this.field2391[var1].method3523();
            }
        }
        this.field2396 = new class321();
        this.field2392 = this.field2397;
    }

    @ObfuscatedName("gr.w(II)V")
    public void method3838(int arg0) {
        for (int var2 = 0; var2 < this.field2391.length; var2++) {
            class191 var3 = this.field2391[var2];
            if (var3 != null && var3.field2213 != 0 && var3.field2215) {
                var3.method3517(arg0);
                var3.field2215 = false;
            }
        }
    }
}
