package deob;

@ObfuscatedName("er")
public class class142 extends class47 {

    @ObfuscatedName("er.g")
    public class140 field2377;

    @ObfuscatedName("er.e")
    public class175 field2376 = new class175();

    @ObfuscatedName("er.n")
    public class45 field2378 = new class45();

    public class142(class140 arg0) {
        this.field2377 = arg0;
    }

    @ObfuscatedName("er.v()Laz;")
    public class47 method1030() {
        class144 var1 = (class144) this.field2376.method3382();
        if (var1 == null) {
            return null;
        } else if (var1.field2407 == null) {
            return this.method971();
        } else {
            return var1.field2407;
        }
    }

    @ObfuscatedName("er.u()Laz;")
    public class47 method971() {
        class144 var1;
        do {
            var1 = (class144) this.field2376.method3388();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2407 == null);
        return var1.field2407;
    }

    @ObfuscatedName("er.k()I")
    public int method972() {
        return 0;
    }

    @ObfuscatedName("er.c([III)V")
    public void method973(int[] arg0, int arg1, int arg2) {
        this.field2378.method973(arg0, arg1, arg2);
        for (class144 var4 = (class144) this.field2376.method3382(); var4 != null; var4 = (class144) this.field2376.method3388()) {
            if (!this.field2377.method2800(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2414) {
                        this.method2893(var4, arg0, var5, var6, var5 + var6);
                        var4.field2414 -= var6;
                        break;
                    }
                    this.method2893(var4, arg0, var5, var4.field2414, var5 + var6);
                    var5 += var4.field2414;
                    var6 -= var4.field2414;
                } while (!this.field2377.method2801(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("er.al(I)V")
    public void method974(int arg0) {
        this.field2378.method974(arg0);
        for (class144 var2 = (class144) this.field2376.method3382(); var2 != null; var2 = (class144) this.field2376.method3388()) {
            if (!this.field2377.method2800(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2414) {
                        this.method2894(var2, var3);
                        var2.field2414 -= var3;
                        break;
                    }
                    this.method2894(var2, var2.field2414);
                    var3 -= var2.field2414;
                } while (!this.field2377.method2801(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("er.g(Lem;[IIIII)V")
    public void method2893(class144 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2377.field2341[arg0.field2418] & 0x4) != 0 && arg0.field2409 < 0) {
            int var6 = this.field2377.field2350[arg0.field2418] / Statics.field1989;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2416) / var6;
                if (var7 > arg3) {
                    arg0.field2416 += arg3 * var6;
                    break;
                }
                arg0.field2407.method973(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2416 += var6 * var7 - 1048576;
                int var8 = Statics.field1989 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class44 var10 = arg0.field2407;
                if (this.field2377.field2353[arg0.field2418] == 0) {
                    arg0.field2407 = class44.method952(arg0.field2417, var10.method1040(), var10.method1031(), var10.method959());
                } else {
                    arg0.field2407 = class44.method952(arg0.field2417, var10.method1040(), 0, var10.method959());
                    this.field2377.method2782(arg0, arg0.field2405.field2325[arg0.field2400] < 0);
                    arg0.field2407.method963(var8, var10.method1031());
                }
                if (arg0.field2405.field2325[arg0.field2400] < 0) {
                    arg0.field2407.method954(-1);
                }
                var10.method1084(var8);
                var10.method973(arg1, arg2, arg4 - arg2);
                if (var10.method969()) {
                    this.field2378.method1107(var10);
                }
            }
        }
        arg0.field2407.method973(arg1, arg2, arg3);
    }

    @ObfuscatedName("er.e(Lem;II)V")
    public void method2894(class144 arg0, int arg1) {
        if ((this.field2377.field2341[arg0.field2418] & 0x4) != 0 && arg0.field2409 < 0) {
            int var3 = this.field2377.field2350[arg0.field2418] / Statics.field1989;
            int var4 = (var3 + 1048575 - arg0.field2416) / var3;
            arg0.field2416 = arg0.field2416 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2377.field2353[arg0.field2418] == 0) {
                    arg0.field2407 = class44.method952(arg0.field2417, arg0.field2407.method1040(), arg0.field2407.method1031(), arg0.field2407.method959());
                } else {
                    arg0.field2407 = class44.method952(arg0.field2417, arg0.field2407.method1040(), 0, arg0.field2407.method959());
                    this.field2377.method2782(arg0, arg0.field2405.field2325[arg0.field2400] < 0);
                }
                if (arg0.field2405.field2325[arg0.field2400] < 0) {
                    arg0.field2407.method954(-1);
                }
                arg1 = arg0.field2416 / var3;
            }
        }
        arg0.field2407.method974(arg1);
    }
}
