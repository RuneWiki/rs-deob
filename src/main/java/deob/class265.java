package deob;

@ObfuscatedName("jw")
public class class265 extends class46 {

    @ObfuscatedName("jw.c")
    public class262 field3123;

    @ObfuscatedName("jw.b")
    public class321 field3124 = new class321();

    @ObfuscatedName("jw.p")
    public class36 field3125 = new class36();

    public class265(class262 arg0) {
        this.field3123 = arg0;
    }

    @ObfuscatedName("jw.s()Lai;")
    public class46 method664() {
        class267 var1 = (class267) this.field3124.method5301();
        if (var1 == null) {
            return null;
        } else if (var1.field3147 == null) {
            return this.method678();
        } else {
            return var1.field3147;
        }
    }

    @ObfuscatedName("jw.j()Lai;")
    public class46 method678() {
        class267 var1;
        do {
            var1 = (class267) this.field3124.method5303();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3147 == null);
        return var1.field3147;
    }

    @ObfuscatedName("jw.w()I")
    public int method666() {
        return 0;
    }

    @ObfuscatedName("jw.n([III)V")
    public void method667(int[] arg0, int arg1, int arg2) {
        this.field3125.method667(arg0, arg1, arg2);
        for (class267 var4 = (class267) this.field3124.method5301(); var4 != null; var4 = (class267) this.field3124.method5303()) {
            if (!this.field3123.method4625(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3135) {
                        this.method4765(var4, arg0, var5, var6, var5 + var6);
                        var4.field3135 -= var6;
                        break;
                    }
                    this.method4765(var4, arg0, var5, var4.field3135, var5 + var6);
                    var5 += var4.field3135;
                    var6 -= var4.field3135;
                } while (!this.field3123.method4626(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("jw.o(I)V")
    public void method669(int arg0) {
        this.field3125.method669(arg0);
        for (class267 var2 = (class267) this.field3124.method5301(); var2 != null; var2 = (class267) this.field3124.method5303()) {
            if (!this.field3123.method4625(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3135) {
                        this.method4766(var2, var3);
                        var2.field3135 -= var3;
                        break;
                    }
                    this.method4766(var2, var2.field3135);
                    var3 -= var2.field3135;
                } while (!this.field3123.method4626(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("jw.c(Ljq;[IIIII)V")
    public void method4765(class267 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3123.field3082[arg0.field3150] & 0x4) != 0 && arg0.field3143 < 0) {
            int var6 = this.field3123.field3087[arg0.field3150] / Statics.field4059;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3136) / var6;
                if (var7 > arg3) {
                    arg0.field3136 += arg3 * var6;
                    break;
                }
                arg0.field3147.method667(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3136 += var6 * var7 - 1048576;
                int var8 = Statics.field4059 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field3147;
                if (this.field3123.field3085[arg0.field3150] == 0) {
                    arg0.field3147 = class45.method901(arg0.field3131, var10.method825(), var10.method829(), var10.method817());
                } else {
                    arg0.field3147 = class45.method901(arg0.field3131, var10.method825(), 0, var10.method817());
                    this.field3123.method4605(arg0, arg0.field3130.field3114[arg0.field3134] < 0);
                    arg0.field3147.method821(var8, var10.method829());
                }
                if (arg0.field3130.field3114[arg0.field3134] < 0) {
                    arg0.field3147.method812(-1);
                }
                var10.method910(var8);
                var10.method667(arg1, arg2, arg4 - arg2);
                if (var10.method827()) {
                    this.field3125.method658(var10);
                }
            }
        }
        arg0.field3147.method667(arg1, arg2, arg3);
    }

    @ObfuscatedName("jw.b(Ljq;II)V")
    public void method4766(class267 arg0, int arg1) {
        if ((this.field3123.field3082[arg0.field3150] & 0x4) != 0 && arg0.field3143 < 0) {
            int var3 = this.field3123.field3087[arg0.field3150] / Statics.field4059;
            int var4 = (var3 + 1048575 - arg0.field3136) / var3;
            arg0.field3136 = arg0.field3136 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3123.field3085[arg0.field3150] == 0) {
                    arg0.field3147 = class45.method901(arg0.field3131, arg0.field3147.method825(), arg0.field3147.method829(), arg0.field3147.method817());
                } else {
                    arg0.field3147 = class45.method901(arg0.field3131, arg0.field3147.method825(), 0, arg0.field3147.method817());
                    this.field3123.method4605(arg0, arg0.field3130.field3114[arg0.field3134] < 0);
                }
                if (arg0.field3130.field3114[arg0.field3134] < 0) {
                    arg0.field3147.method812(-1);
                }
                arg1 = arg0.field3136 / var3;
            }
        }
        arg0.field3147.method669(arg1);
    }
}
