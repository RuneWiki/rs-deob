package deob;

@ObfuscatedName("hp")
public class class225 extends class108 {

    @ObfuscatedName("hp.g")
    public class221 field2617;

    @ObfuscatedName("hp.r")
    public class208 field2616 = new class208();

    @ObfuscatedName("hp.e")
    public class91 field2618 = new class91();

    public class225(class221 arg0) {
        this.field2617 = arg0;
    }

    @ObfuscatedName("hp.i()Ldz;")
    public class108 method2084() {
        class222 var1 = (class222) this.field2616.method3979();
        if (var1 == null) {
            return null;
        } else if (var1.field2582 == null) {
            return this.method2085();
        } else {
            return var1.field2582;
        }
    }

    @ObfuscatedName("hp.p()Ldz;")
    public class108 method2085() {
        class222 var1;
        do {
            var1 = (class222) this.field2616.method3964();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2582 == null);
        return var1.field2582;
    }

    @ObfuscatedName("hp.m()I")
    public int method2086() {
        return 0;
    }

    @ObfuscatedName("hp.d([III)V")
    public void method2087(int[] arg0, int arg1, int arg2) {
        this.field2618.method2087(arg0, arg1, arg2);
        for (class222 var4 = (class222) this.field2616.method3979(); var4 != null; var4 = (class222) this.field2616.method3964()) {
            if (!this.field2617.method4096(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2577) {
                        this.method4247(var4, arg0, var5, var6, var5 + var6);
                        var4.field2577 -= var6;
                        break;
                    }
                    this.method4247(var4, arg0, var5, var4.field2577, var5 + var6);
                    var5 += var4.field2577;
                    var6 -= var4.field2577;
                } while (!this.field2617.method4161(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hp.x(I)V")
    public void method2089(int arg0) {
        this.field2618.method2089(arg0);
        for (class222 var2 = (class222) this.field2616.method3979(); var2 != null; var2 = (class222) this.field2616.method3964()) {
            if (!this.field2617.method4096(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2577) {
                        this.method4249(var2, var3);
                        var2.field2577 -= var3;
                        break;
                    }
                    this.method4249(var2, var2.field2577);
                    var3 -= var2.field2577;
                } while (!this.field2617.method4161(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hp.g(Lho;[IIIII)V")
    public void method4247(class222 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2617.field2549[arg0.field2586] & 0x4) != 0 && arg0.field2578 < 0) {
            int var6 = this.field2617.field2547[arg0.field2586] / Statics.field1378;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2568) / var6;
                if (var7 > arg3) {
                    arg0.field2568 += arg3 * var6;
                    break;
                }
                arg0.field2582.method2087(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2568 += var6 * var7 - 1048576;
                int var8 = Statics.field1378 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class106 var10 = arg0.field2582;
                if (this.field2617.field2541[arg0.field2586] == 0) {
                    arg0.field2582 = class106.method2310(arg0.field2566, var10.method2307(), var10.method2316(), var10.method2317());
                } else {
                    arg0.field2582 = class106.method2310(arg0.field2566, var10.method2307(), 0, var10.method2317());
                    this.field2617.method4078(arg0, arg0.field2572.field2602[arg0.field2569] < 0);
                    arg0.field2582.method2396(var8, var10.method2316());
                }
                if (arg0.field2572.field2602[arg0.field2569] < 0) {
                    arg0.field2582.method2312(-1);
                }
                var10.method2323(var8);
                var10.method2087(arg1, arg2, arg4 - arg2);
                if (var10.method2327()) {
                    this.field2618.method2082(var10);
                }
            }
        }
        arg0.field2582.method2087(arg1, arg2, arg3);
    }

    @ObfuscatedName("hp.r(Lho;II)V")
    public void method4249(class222 arg0, int arg1) {
        if ((this.field2617.field2549[arg0.field2586] & 0x4) != 0 && arg0.field2578 < 0) {
            int var3 = this.field2617.field2547[arg0.field2586] / Statics.field1378;
            int var4 = (var3 + 1048575 - arg0.field2568) / var3;
            arg0.field2568 = arg0.field2568 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2617.field2541[arg0.field2586] == 0) {
                    arg0.field2582 = class106.method2310(arg0.field2566, arg0.field2582.method2307(), arg0.field2582.method2316(), arg0.field2582.method2317());
                } else {
                    arg0.field2582 = class106.method2310(arg0.field2566, arg0.field2582.method2307(), 0, arg0.field2582.method2317());
                    this.field2617.method4078(arg0, arg0.field2572.field2602[arg0.field2569] < 0);
                }
                if (arg0.field2572.field2602[arg0.field2569] < 0) {
                    arg0.field2582.method2312(-1);
                }
                arg1 = arg0.field2568 / var3;
            }
        }
        arg0.field2582.method2089(arg1);
    }
}
