package deob;

@ObfuscatedName("iv")
public class class252 extends class44 {

    @ObfuscatedName("iv.n")
    public class249 field2964;

    @ObfuscatedName("iv.c")
    public class309 field2962 = new class309();

    @ObfuscatedName("iv.m")
    public class34 field2961 = new class34();

    public class252(class249 arg0) {
        this.field2964 = arg0;
    }

    @ObfuscatedName("iv.g()Lap;")
    public class44 method612() {
        class254 var1 = (class254) this.field2962.method4962();
        if (var1 == null) {
            return null;
        } else if (var1.field2968 == null) {
            return this.method613();
        } else {
            return var1.field2968;
        }
    }

    @ObfuscatedName("iv.z()Lap;")
    public class44 method613() {
        class254 var1;
        do {
            var1 = (class254) this.field2962.method4985();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2968 == null);
        return var1.field2968;
    }

    @ObfuscatedName("iv.a()I")
    public int method614() {
        return 0;
    }

    @ObfuscatedName("iv.u([III)V")
    public void method615(int[] arg0, int arg1, int arg2) {
        this.field2961.method615(arg0, arg1, arg2);
        for (class254 var4 = (class254) this.field2962.method4962(); var4 != null; var4 = (class254) this.field2962.method4985()) {
            if (!this.field2964.method4268(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2983) {
                        this.method4415(var4, arg0, var5, var6, var5 + var6);
                        var4.field2983 -= var6;
                        break;
                    }
                    this.method4415(var4, arg0, var5, var4.field2983, var5 + var6);
                    var5 += var4.field2983;
                    var6 -= var4.field2983;
                } while (!this.field2964.method4276(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("iv.l(I)V")
    public void method641(int arg0) {
        this.field2961.method641(arg0);
        for (class254 var2 = (class254) this.field2962.method4962(); var2 != null; var2 = (class254) this.field2962.method4985()) {
            if (!this.field2964.method4268(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2983) {
                        this.method4416(var2, var3);
                        var2.field2983 -= var3;
                        break;
                    }
                    this.method4416(var2, var2.field2983);
                    var3 -= var2.field2983;
                } while (!this.field2964.method4276(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("iv.n(Lid;[IIIIB)V")
    public void method4415(class254 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2964.field2930[arg0.field2971] & 0x4) != 0 && arg0.field2986 < 0) {
            int var6 = this.field2964.field2925[arg0.field2971] / Statics.field3288;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2989) / var6;
                if (var7 > arg3) {
                    arg0.field2989 += arg3 * var6;
                    break;
                }
                arg0.field2968.method615(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2989 += var6 * var7 - 1048576;
                int var8 = Statics.field3288 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class43 var10 = arg0.field2968;
                if (this.field2964.field2926[arg0.field2971] == 0) {
                    arg0.field2968 = class43.method773(arg0.field2970, var10.method822(), var10.method779(), var10.method780());
                } else {
                    arg0.field2968 = class43.method773(arg0.field2970, var10.method822(), 0, var10.method780());
                    this.field2964.method4254(arg0, arg0.field2969.field2950[arg0.field2987] < 0);
                    arg0.field2968.method774(var8, var10.method779());
                }
                if (arg0.field2969.field2950[arg0.field2987] < 0) {
                    arg0.field2968.method775(-1);
                }
                var10.method786(var8);
                var10.method615(arg1, arg2, arg4 - arg2);
                if (var10.method789()) {
                    this.field2961.method607(var10);
                }
            }
        }
        arg0.field2968.method615(arg1, arg2, arg3);
    }

    @ObfuscatedName("iv.c(Lid;II)V")
    public void method4416(class254 arg0, int arg1) {
        if ((this.field2964.field2930[arg0.field2971] & 0x4) != 0 && arg0.field2986 < 0) {
            int var3 = this.field2964.field2925[arg0.field2971] / Statics.field3288;
            int var4 = (var3 + 1048575 - arg0.field2989) / var3;
            arg0.field2989 = arg0.field2989 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2964.field2926[arg0.field2971] == 0) {
                    arg0.field2968 = class43.method773(arg0.field2970, arg0.field2968.method822(), arg0.field2968.method779(), arg0.field2968.method780());
                } else {
                    arg0.field2968 = class43.method773(arg0.field2970, arg0.field2968.method822(), 0, arg0.field2968.method780());
                    this.field2964.method4254(arg0, arg0.field2969.field2950[arg0.field2987] < 0);
                }
                if (arg0.field2969.field2950[arg0.field2987] < 0) {
                    arg0.field2968.method775(-1);
                }
                arg1 = arg0.field2989 / var3;
            }
        }
        arg0.field2968.method641(arg1);
    }
}
