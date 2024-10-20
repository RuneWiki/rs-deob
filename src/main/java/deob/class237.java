package deob;

@ObfuscatedName("ih")
public class class237 extends class59 {

    @ObfuscatedName("ih.v")
    public class234 field2889;

    @ObfuscatedName("ih.n")
    public class294 field2887 = new class294();

    @ObfuscatedName("ih.f")
    public class49 field2888 = new class49();

    public class237(class234 arg0) {
        this.field2889 = arg0;
    }

    @ObfuscatedName("ih.j()Lbm;")
    public class59 method553() {
        class239 var1 = (class239) this.field2887.method4714();
        if (var1 == null) {
            return null;
        } else if (var1.field2910 == null) {
            return this.method556();
        } else {
            return var1.field2910;
        }
    }

    @ObfuscatedName("ih.r()Lbm;")
    public class59 method556() {
        class239 var1;
        do {
            var1 = (class239) this.field2887.method4741();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2910 == null);
        return var1.field2910;
    }

    @ObfuscatedName("ih.b()I")
    public int method557() {
        return 0;
    }

    @ObfuscatedName("ih.d([III)V")
    public void method586(int[] arg0, int arg1, int arg2) {
        this.field2888.method586(arg0, arg1, arg2);
        for (class239 var4 = (class239) this.field2887.method4714(); var4 != null; var4 = (class239) this.field2887.method4741()) {
            if (!this.field2889.method4047(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2892) {
                        this.method4189(var4, arg0, var5, var6, var5 + var6);
                        var4.field2892 -= var6;
                        break;
                    }
                    this.method4189(var4, arg0, var5, var4.field2892, var5 + var6);
                    var5 += var4.field2892;
                    var6 -= var4.field2892;
                } while (!this.field2889.method4048(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ih.u(I)V")
    public void method558(int arg0) {
        this.field2888.method558(arg0);
        for (class239 var2 = (class239) this.field2887.method4714(); var2 != null; var2 = (class239) this.field2887.method4741()) {
            if (!this.field2889.method4047(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2892) {
                        this.method4190(var2, var3);
                        var2.field2892 -= var3;
                        break;
                    }
                    this.method4190(var2, var2.field2892);
                    var3 -= var2.field2892;
                } while (!this.field2889.method4048(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ih.v(Liq;[IIIIS)V")
    public void method4189(class239 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2889.field2847[arg0.field2906] & 0x4) != 0 && arg0.field2896 < 0) {
            int var6 = this.field2889.field2852[arg0.field2906] / Statics.field429;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2905) / var6;
                if (var7 > arg3) {
                    arg0.field2905 += arg3 * var6;
                    break;
                }
                arg0.field2910.method586(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2905 += var6 * var7 - 1048576;
                int var8 = Statics.field429 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2910;
                if (this.field2889.field2837[arg0.field2906] == 0) {
                    arg0.field2910 = class58.method720(arg0.field2911, var10.method733(), var10.method776(), var10.method833());
                } else {
                    arg0.field2910 = class58.method720(arg0.field2911, var10.method733(), 0, var10.method833());
                    this.field2889.method4029(arg0, arg0.field2893.field2879[arg0.field2897] < 0);
                    arg0.field2910.method730(var8, var10.method776());
                }
                if (arg0.field2893.field2879[arg0.field2897] < 0) {
                    arg0.field2910.method722(-1);
                }
                var10.method731(var8);
                var10.method586(arg1, arg2, arg4 - arg2);
                if (var10.method735()) {
                    this.field2888.method550(var10);
                }
            }
        }
        arg0.field2910.method586(arg1, arg2, arg3);
    }

    @ObfuscatedName("ih.n(Liq;II)V")
    public void method4190(class239 arg0, int arg1) {
        if ((this.field2889.field2847[arg0.field2906] & 0x4) != 0 && arg0.field2896 < 0) {
            int var3 = this.field2889.field2852[arg0.field2906] / Statics.field429;
            int var4 = (var3 + 1048575 - arg0.field2905) / var3;
            arg0.field2905 = arg0.field2905 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2889.field2837[arg0.field2906] == 0) {
                    arg0.field2910 = class58.method720(arg0.field2911, arg0.field2910.method733(), arg0.field2910.method776(), arg0.field2910.method833());
                } else {
                    arg0.field2910 = class58.method720(arg0.field2911, arg0.field2910.method733(), 0, arg0.field2910.method833());
                    this.field2889.method4029(arg0, arg0.field2893.field2879[arg0.field2897] < 0);
                }
                if (arg0.field2893.field2879[arg0.field2897] < 0) {
                    arg0.field2910.method722(-1);
                }
                arg1 = arg0.field2905 / var3;
            }
        }
        arg0.field2910.method558(arg1);
    }
}
