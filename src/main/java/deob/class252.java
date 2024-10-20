package deob;

@ObfuscatedName("ij")
public class class252 extends class44 {

    @ObfuscatedName("ij.i")
    public class249 field2983;

    @ObfuscatedName("ij.s")
    public class309 field2980 = new class309();

    @ObfuscatedName("ij.a")
    public class34 field2982 = new class34();

    public class252(class249 arg0) {
        this.field2983 = arg0;
    }

    @ObfuscatedName("ij.g()Lav;")
    public class44 method626() {
        class254 var1 = (class254) this.field2980.method4981();
        if (var1 == null) {
            return null;
        } else if (var1.field2986 == null) {
            return this.method627();
        } else {
            return var1.field2986;
        }
    }

    @ObfuscatedName("ij.e()Lav;")
    public class44 method627() {
        class254 var1;
        do {
            var1 = (class254) this.field2980.method4987();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2986 == null);
        return var1.field2986;
    }

    @ObfuscatedName("ij.p()I")
    public int method628() {
        return 0;
    }

    @ObfuscatedName("ij.j([III)V")
    public void method640(int[] arg0, int arg1, int arg2) {
        this.field2982.method640(arg0, arg1, arg2);
        for (class254 var4 = (class254) this.field2980.method4981(); var4 != null; var4 = (class254) this.field2980.method4987()) {
            if (!this.field2983.method4294(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2996) {
                        this.method4446(var4, arg0, var5, var6, var5 + var6);
                        var4.field2996 -= var6;
                        break;
                    }
                    this.method4446(var4, arg0, var5, var4.field2996, var5 + var6);
                    var5 += var4.field2996;
                    var6 -= var4.field2996;
                } while (!this.field2983.method4295(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ij.x(I)V")
    public void method631(int arg0) {
        this.field2982.method631(arg0);
        for (class254 var2 = (class254) this.field2980.method4981(); var2 != null; var2 = (class254) this.field2980.method4987()) {
            if (!this.field2983.method4294(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2996) {
                        this.method4443(var2, var3);
                        var2.field2996 -= var3;
                        break;
                    }
                    this.method4443(var2, var2.field2996);
                    var3 -= var2.field2996;
                } while (!this.field2983.method4295(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ij.i(Liu;[IIIII)V")
    public void method4446(class254 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2983.field2945[arg0.field2997] & 0x4) != 0 && arg0.field3000 < 0) {
            int var6 = this.field2983.field2947[arg0.field2997] / Statics.field4360;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3004) / var6;
                if (var7 > arg3) {
                    arg0.field3004 += arg3 * var6;
                    break;
                }
                arg0.field2986.method640(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3004 += var6 * var7 - 1048576;
                int var8 = Statics.field4360 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class43 var10 = arg0.field2986;
                if (this.field2983.field2933[arg0.field2997] == 0) {
                    arg0.field2986 = class43.method790(arg0.field2988, var10.method804(), var10.method890(), var10.method796());
                } else {
                    arg0.field2986 = class43.method790(arg0.field2988, var10.method804(), 0, var10.method796());
                    this.field2983.method4275(arg0, arg0.field3006.field2973[arg0.field2991] < 0);
                    arg0.field2986.method895(var8, var10.method890());
                }
                if (arg0.field3006.field2973[arg0.field2991] < 0) {
                    arg0.field2986.method800(-1);
                }
                var10.method802(var8);
                var10.method640(arg1, arg2, arg4 - arg2);
                if (var10.method806()) {
                    this.field2982.method622(var10);
                }
            }
        }
        arg0.field2986.method640(arg1, arg2, arg3);
    }

    @ObfuscatedName("ij.w(Liu;IB)V")
    public void method4443(class254 arg0, int arg1) {
        if ((this.field2983.field2945[arg0.field2997] & 0x4) != 0 && arg0.field3000 < 0) {
            int var3 = this.field2983.field2947[arg0.field2997] / Statics.field4360;
            int var4 = (var3 + 1048575 - arg0.field3004) / var3;
            arg0.field3004 = arg0.field3004 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2983.field2933[arg0.field2997] == 0) {
                    arg0.field2986 = class43.method790(arg0.field2988, arg0.field2986.method804(), arg0.field2986.method890(), arg0.field2986.method796());
                } else {
                    arg0.field2986 = class43.method790(arg0.field2988, arg0.field2986.method804(), 0, arg0.field2986.method796());
                    this.field2983.method4275(arg0, arg0.field3006.field2973[arg0.field2991] < 0);
                }
                if (arg0.field3006.field2973[arg0.field2991] < 0) {
                    arg0.field2986.method800(-1);
                }
                arg1 = arg0.field3004 / var3;
            }
        }
        arg0.field2986.method631(arg1);
    }
}
