package deob;

@ObfuscatedName("es")
public class class144 extends class69 {

    @ObfuscatedName("es.u")
    public class140 field1991;

    @ObfuscatedName("es.x")
    public class129 field1993 = new class129();

    @ObfuscatedName("es.i")
    public class52 field1992 = new class52();

    public class144(class140 arg0) {
        this.field1991 = arg0;
    }

    @ObfuscatedName("es.g()Lbx;")
    public class69 method879() {
        class141 var1 = (class141) this.field1993.method2242();
        if (var1 == null) {
            return null;
        } else if (var1.field1954 == null) {
            return this.method896();
        } else {
            return var1.field1954;
        }
    }

    @ObfuscatedName("es.z()Lbx;")
    public class69 method896() {
        class141 var1;
        do {
            var1 = (class141) this.field1993.method2244();
            if (var1 == null) {
                return null;
            }
        } while (var1.field1954 == null);
        return var1.field1954;
    }

    @ObfuscatedName("es.t()I")
    public int method889() {
        return 0;
    }

    @ObfuscatedName("es.m([III)V")
    public void method912(int[] arg0, int arg1, int arg2) {
        this.field1992.method912(arg0, arg1, arg2);
        for (class141 var4 = (class141) this.field1993.method2242(); var4 != null; var4 = (class141) this.field1993.method2244()) {
            if (!this.field1991.method2358(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1960) {
                        this.method2510(var4, arg0, var5, var6, var5 + var6);
                        var4.field1960 -= var6;
                        break;
                    }
                    this.method2510(var4, arg0, var5, var4.field1960, var5 + var6);
                    var5 += var4.field1960;
                    var6 -= var4.field1960;
                } while (!this.field1991.method2359(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("es.e(I)V")
    public void method887(int arg0) {
        this.field1992.method887(arg0);
        for (class141 var2 = (class141) this.field1993.method2242(); var2 != null; var2 = (class141) this.field1993.method2244()) {
            if (!this.field1991.method2358(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1960) {
                        this.method2504(var2, var3);
                        var2.field1960 -= var3;
                        break;
                    }
                    this.method2504(var2, var2.field1960);
                    var3 -= var2.field1960;
                } while (!this.field1991.method2359(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("es.u(Leg;[IIIII)V")
    public void method2510(class141 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field1991.field1920[arg0.field1958] & 0x4) != 0 && arg0.field1950 < 0) {
            int var6 = this.field1991.field1925[arg0.field1958] / Statics.field66;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field1956) / var6;
                if (var7 > arg3) {
                    arg0.field1956 += arg3 * var6;
                    break;
                }
                arg0.field1954.method912(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field1956 += var6 * var7 - 1048576;
                int var8 = Statics.field66 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class67 var10 = arg0.field1954;
                if (this.field1991.field1923[arg0.field1958] == 0) {
                    arg0.field1954 = class67.method1101(arg0.field1938, var10.method1177(), var10.method1107(), var10.method1144());
                } else {
                    arg0.field1954 = class67.method1101(arg0.field1938, var10.method1177(), 0, var10.method1144());
                    this.field1991.method2425(arg0, arg0.field1944.field1983[arg0.field1941] < 0);
                    arg0.field1954.method1212(var8, var10.method1107());
                }
                if (arg0.field1944.field1983[arg0.field1941] < 0) {
                    arg0.field1954.method1103(-1);
                }
                var10.method1114(var8);
                var10.method912(arg1, arg2, arg4 - arg2);
                if (var10.method1118()) {
                    this.field1992.method874(var10);
                }
            }
        }
        arg0.field1954.method912(arg1, arg2, arg3);
    }

    @ObfuscatedName("es.x(Leg;II)V")
    public void method2504(class141 arg0, int arg1) {
        if ((this.field1991.field1920[arg0.field1958] & 0x4) != 0 && arg0.field1950 < 0) {
            int var3 = this.field1991.field1925[arg0.field1958] / Statics.field66;
            int var4 = (var3 + 1048575 - arg0.field1956) / var3;
            arg0.field1956 = arg0.field1956 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field1991.field1923[arg0.field1958] == 0) {
                    arg0.field1954 = class67.method1101(arg0.field1938, arg0.field1954.method1177(), arg0.field1954.method1107(), arg0.field1954.method1144());
                } else {
                    arg0.field1954 = class67.method1101(arg0.field1938, arg0.field1954.method1177(), 0, arg0.field1954.method1144());
                    this.field1991.method2425(arg0, arg0.field1944.field1983[arg0.field1941] < 0);
                }
                if (arg0.field1944.field1983[arg0.field1941] < 0) {
                    arg0.field1954.method1103(-1);
                }
                arg1 = arg0.field1956 / var3;
            }
        }
        arg0.field1954.method887(arg1);
    }
}
