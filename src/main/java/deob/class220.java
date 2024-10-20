package deob;

@ObfuscatedName("hn")
public class class220 extends class119 {

    @ObfuscatedName("hn.a")
    public class216 field2708;

    @ObfuscatedName("hn.e")
    public class205 field2709 = new class205();

    @ObfuscatedName("hn.k")
    public class102 field2711 = new class102();

    public class220(class216 arg0) {
        this.field2708 = arg0;
    }

    @ObfuscatedName("hn.z()Ldy;")
    public class119 method1730() {
        class217 var1 = (class217) this.field2709.method3442();
        if (var1 == null) {
            return null;
        } else if (var1.field2671 == null) {
            return this.method1758();
        } else {
            return var1.field2671;
        }
    }

    @ObfuscatedName("hn.t()Ldy;")
    public class119 method1758() {
        class217 var1;
        do {
            var1 = (class217) this.field2709.method3444();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2671 == null);
        return var1.field2671;
    }

    @ObfuscatedName("hn.f()I")
    public int method1732() {
        return 0;
    }

    @ObfuscatedName("hn.g([III)V")
    public void method1733(int[] arg0, int arg1, int arg2) {
        this.field2711.method1733(arg0, arg1, arg2);
        for (class217 var4 = (class217) this.field2709.method3442(); var4 != null; var4 = (class217) this.field2709.method3444()) {
            if (!this.field2708.method3630(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2678) {
                        this.method3716(var4, arg0, var5, var6, var5 + var6);
                        var4.field2678 -= var6;
                        break;
                    }
                    this.method3716(var4, arg0, var5, var4.field2678, var5 + var6);
                    var5 += var4.field2678;
                    var6 -= var4.field2678;
                } while (!this.field2708.method3564(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hn.c(I)V")
    public void method1735(int arg0) {
        this.field2711.method1735(arg0);
        for (class217 var2 = (class217) this.field2709.method3442(); var2 != null; var2 = (class217) this.field2709.method3444()) {
            if (!this.field2708.method3630(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2678) {
                        this.method3718(var2, var3);
                        var2.field2678 -= var3;
                        break;
                    }
                    this.method3718(var2, var2.field2678);
                    var3 -= var2.field2678;
                } while (!this.field2708.method3564(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hn.a(Lhq;[IIIII)V")
    public void method3716(class217 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2708.field2643[arg0.field2662] & 0x4) != 0 && arg0.field2673 < 0) {
            int var6 = this.field2708.field2635[arg0.field2662] / Statics.field715;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2679) / var6;
                if (var7 > arg3) {
                    arg0.field2679 += arg3 * var6;
                    break;
                }
                arg0.field2671.method1733(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2679 += var6 * var7 - 1048576;
                int var8 = Statics.field715 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class117 var10 = arg0.field2671;
                if (this.field2708.field2632[arg0.field2662] == 0) {
                    arg0.field2671 = class117.method1934(arg0.field2677, var10.method1948(), var10.method1940(), var10.method1941());
                } else {
                    arg0.field2671 = class117.method1934(arg0.field2677, var10.method1948(), 0, var10.method1941());
                    this.field2708.method3546(arg0, arg0.field2660.field2698[arg0.field2664] < 0);
                    arg0.field2671.method1945(var8, var10.method1940());
                }
                if (arg0.field2660.field2698[arg0.field2664] < 0) {
                    arg0.field2671.method1936(-1);
                }
                var10.method1981(var8);
                var10.method1733(arg1, arg2, arg4 - arg2);
                if (var10.method1950()) {
                    this.field2711.method1729(var10);
                }
            }
        }
        arg0.field2671.method1733(arg1, arg2, arg3);
    }

    @ObfuscatedName("hn.w(Lhq;II)V")
    public void method3718(class217 arg0, int arg1) {
        if ((this.field2708.field2643[arg0.field2662] & 0x4) != 0 && arg0.field2673 < 0) {
            int var3 = this.field2708.field2635[arg0.field2662] / Statics.field715;
            int var4 = (var3 + 1048575 - arg0.field2679) / var3;
            arg0.field2679 = arg0.field2679 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2708.field2632[arg0.field2662] == 0) {
                    arg0.field2671 = class117.method1934(arg0.field2677, arg0.field2671.method1948(), arg0.field2671.method1940(), arg0.field2671.method1941());
                } else {
                    arg0.field2671 = class117.method1934(arg0.field2677, arg0.field2671.method1948(), 0, arg0.field2671.method1941());
                    this.field2708.method3546(arg0, arg0.field2660.field2698[arg0.field2664] < 0);
                }
                if (arg0.field2660.field2698[arg0.field2664] < 0) {
                    arg0.field2671.method1936(-1);
                }
                arg1 = arg0.field2679 / var3;
            }
        }
        arg0.field2671.method1735(arg1);
    }
}
