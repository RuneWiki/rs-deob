package deob;

@ObfuscatedName("jt")
public class class278 extends class44 {

    @ObfuscatedName("jt.v")
    public class275 field3231;

    @ObfuscatedName("jt.c")
    public class335 field3232 = new class335();

    @ObfuscatedName("jt.i")
    public class34 field3233 = new class34();

    public class278(class275 arg0) {
        this.field3231 = arg0;
    }

    @ObfuscatedName("jt.n()Laf;")
    public class44 method615() {
        class280 var1 = (class280) this.field3232.method5540();
        if (var1 == null) {
            return null;
        } else if (var1.field3241 == null) {
            return this.method616();
        } else {
            return var1.field3241;
        }
    }

    @ObfuscatedName("jt.s()Laf;")
    public class44 method616() {
        class280 var1;
        do {
            var1 = (class280) this.field3232.method5534();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3241 == null);
        return var1.field3241;
    }

    @ObfuscatedName("jt.l()I")
    public int method617() {
        return 0;
    }

    @ObfuscatedName("jt.q([III)V")
    public void method618(int[] arg0, int arg1, int arg2) {
        this.field3233.method618(arg0, arg1, arg2);
        for (class280 var4 = (class280) this.field3232.method5540(); var4 != null; var4 = (class280) this.field3232.method5534()) {
            if (!this.field3231.method4759(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3256) {
                        this.method4913(var4, arg0, var5, var6, var5 + var6);
                        var4.field3256 -= var6;
                        break;
                    }
                    this.method4913(var4, arg0, var5, var4.field3256, var5 + var6);
                    var5 += var4.field3256;
                    var6 -= var4.field3256;
                } while (!this.field3231.method4789(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("jt.r(I)V")
    public void method620(int arg0) {
        this.field3233.method620(arg0);
        for (class280 var2 = (class280) this.field3232.method5540(); var2 != null; var2 = (class280) this.field3232.method5534()) {
            if (!this.field3231.method4759(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3256) {
                        this.method4912(var2, var3);
                        var2.field3256 -= var3;
                        break;
                    }
                    this.method4912(var2, var2.field3256);
                    var3 -= var2.field3256;
                } while (!this.field3231.method4789(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("jt.v(Ljn;[IIIII)V")
    public void method4913(class280 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3231.field3194[arg0.field3249] & 0x4) != 0 && arg0.field3250 < 0) {
            int var6 = this.field3231.field3196[arg0.field3249] / Statics.field269;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3239) / var6;
                if (var7 > arg3) {
                    arg0.field3239 += arg3 * var6;
                    break;
                }
                arg0.field3241.method618(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3239 += var6 * var7 - 1048576;
                int var8 = Statics.field269 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class43 var10 = arg0.field3241;
                if (this.field3231.field3190[arg0.field3249] == 0) {
                    arg0.field3241 = class43.method765(arg0.field3255, var10.method827(), var10.method770(), var10.method771());
                } else {
                    arg0.field3241 = class43.method765(arg0.field3255, var10.method827(), 0, var10.method771());
                    this.field3231.method4818(arg0, arg0.field3237.field3228[arg0.field3252] < 0);
                    arg0.field3241.method775(var8, var10.method770());
                }
                if (arg0.field3237.field3228[arg0.field3252] < 0) {
                    arg0.field3241.method848(-1);
                }
                var10.method842(var8);
                var10.method618(arg1, arg2, arg4 - arg2);
                if (var10.method780()) {
                    this.field3233.method623(var10);
                }
            }
        }
        arg0.field3241.method618(arg1, arg2, arg3);
    }

    @ObfuscatedName("jt.c(Ljn;II)V")
    public void method4912(class280 arg0, int arg1) {
        if ((this.field3231.field3194[arg0.field3249] & 0x4) != 0 && arg0.field3250 < 0) {
            int var3 = this.field3231.field3196[arg0.field3249] / Statics.field269;
            int var4 = (var3 + 1048575 - arg0.field3239) / var3;
            arg0.field3239 = arg0.field3239 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3231.field3190[arg0.field3249] == 0) {
                    arg0.field3241 = class43.method765(arg0.field3255, arg0.field3241.method827(), arg0.field3241.method770(), arg0.field3241.method771());
                } else {
                    arg0.field3241 = class43.method765(arg0.field3255, arg0.field3241.method827(), 0, arg0.field3241.method771());
                    this.field3231.method4818(arg0, arg0.field3237.field3228[arg0.field3252] < 0);
                }
                if (arg0.field3237.field3228[arg0.field3252] < 0) {
                    arg0.field3241.method848(-1);
                }
                arg1 = arg0.field3239 / var3;
            }
        }
        arg0.field3241.method620(arg1);
    }
}
