package deob;

@ObfuscatedName("ih")
public class class252 extends class44 {

    @ObfuscatedName("ih.l")
    public class249 field2975;

    @ObfuscatedName("ih.q")
    public class309 field2976 = new class309();

    @ObfuscatedName("ih.f")
    public class34 field2974 = new class34();

    public class252(class249 arg0) {
        this.field2975 = arg0;
    }

    @ObfuscatedName("ih.k()Lav;")
    public class44 method615() {
        class254 var1 = (class254) this.field2976.method5035();
        if (var1 == null) {
            return null;
        } else if (var1.field2997 == null) {
            return this.method616();
        } else {
            return var1.field2997;
        }
    }

    @ObfuscatedName("ih.t()Lav;")
    public class44 method616() {
        class254 var1;
        do {
            var1 = (class254) this.field2976.method5022();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2997 == null);
        return var1.field2997;
    }

    @ObfuscatedName("ih.a()I")
    public int method624() {
        return 0;
    }

    @ObfuscatedName("ih.e([III)V")
    public void method618(int[] arg0, int arg1, int arg2) {
        this.field2974.method618(arg0, arg1, arg2);
        for (class254 var4 = (class254) this.field2976.method5035(); var4 != null; var4 = (class254) this.field2976.method5022()) {
            if (!this.field2975.method4375(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2998) {
                        this.method4462(var4, arg0, var5, var6, var5 + var6);
                        var4.field2998 -= var6;
                        break;
                    }
                    this.method4462(var4, arg0, var5, var4.field2998, var5 + var6);
                    var5 += var4.field2998;
                    var6 -= var4.field2998;
                } while (!this.field2975.method4324(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ih.y(I)V")
    public void method613(int arg0) {
        this.field2974.method613(arg0);
        for (class254 var2 = (class254) this.field2976.method5035(); var2 != null; var2 = (class254) this.field2976.method5022()) {
            if (!this.field2975.method4375(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2998) {
                        this.method4463(var2, var3);
                        var2.field2998 -= var3;
                        break;
                    }
                    this.method4463(var2, var2.field2998);
                    var3 -= var2.field2998;
                } while (!this.field2975.method4324(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ih.l(Lib;[IIIII)V")
    public void method4462(class254 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2975.field2949[arg0.field2981] & 0x4) != 0 && arg0.field2979 < 0) {
            int var6 = this.field2975.field2940[arg0.field2981] / Statics.field280;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2999) / var6;
                if (var7 > arg3) {
                    arg0.field2999 += arg3 * var6;
                    break;
                }
                arg0.field2997.method618(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2999 += var6 * var7 - 1048576;
                int var8 = Statics.field280 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class43 var10 = arg0.field2997;
                if (this.field2975.field2938[arg0.field2981] == 0) {
                    arg0.field2997 = class43.method767(arg0.field2993, var10.method770(), var10.method821(), var10.method774());
                } else {
                    arg0.field2997 = class43.method767(arg0.field2993, var10.method770(), 0, var10.method774());
                    this.field2975.method4380(arg0, arg0.field2980.field2966[arg0.field2989] < 0);
                    arg0.field2997.method778(var8, var10.method821());
                }
                if (arg0.field2980.field2966[arg0.field2989] < 0) {
                    arg0.field2997.method769(-1);
                }
                var10.method780(var8);
                var10.method618(arg1, arg2, arg4 - arg2);
                if (var10.method881()) {
                    this.field2974.method636(var10);
                }
            }
        }
        arg0.field2997.method618(arg1, arg2, arg3);
    }

    @ObfuscatedName("ih.q(Lib;IB)V")
    public void method4463(class254 arg0, int arg1) {
        if ((this.field2975.field2949[arg0.field2981] & 0x4) != 0 && arg0.field2979 < 0) {
            int var3 = this.field2975.field2940[arg0.field2981] / Statics.field280;
            int var4 = (var3 + 1048575 - arg0.field2999) / var3;
            arg0.field2999 = arg0.field2999 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2975.field2938[arg0.field2981] == 0) {
                    arg0.field2997 = class43.method767(arg0.field2993, arg0.field2997.method770(), arg0.field2997.method821(), arg0.field2997.method774());
                } else {
                    arg0.field2997 = class43.method767(arg0.field2993, arg0.field2997.method770(), 0, arg0.field2997.method774());
                    this.field2975.method4380(arg0, arg0.field2980.field2966[arg0.field2989] < 0);
                }
                if (arg0.field2980.field2966[arg0.field2989] < 0) {
                    arg0.field2997.method769(-1);
                }
                arg1 = arg0.field2999 / var3;
            }
        }
        arg0.field2997.method613(arg1);
    }
}
