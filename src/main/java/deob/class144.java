package deob;

@ObfuscatedName("ej")
public class class144 extends class69 {

    @ObfuscatedName("ej.k")
    public class140 field1999;

    @ObfuscatedName("ej.y")
    public class129 field2001 = new class129();

    @ObfuscatedName("ej.o")
    public class52 field1998 = new class52();

    public class144(class140 arg0) {
        this.field1999 = arg0;
    }

    @ObfuscatedName("ej.j()Lbs;")
    public class69 method896() {
        class141 var1 = (class141) this.field2001.method2243();
        if (var1 == null) {
            return null;
        } else if (var1.field1971 == null) {
            return this.method897();
        } else {
            return var1.field1971;
        }
    }

    @ObfuscatedName("ej.c()Lbs;")
    public class69 method897() {
        class141 var1;
        do {
            var1 = (class141) this.field2001.method2238();
            if (var1 == null) {
                return null;
            }
        } while (var1.field1971 == null);
        return var1.field1971;
    }

    @ObfuscatedName("ej.g()I")
    public int method898() {
        return 0;
    }

    @ObfuscatedName("ej.i([III)V")
    public void method907(int[] arg0, int arg1, int arg2) {
        this.field1998.method907(arg0, arg1, arg2);
        for (class141 var4 = (class141) this.field2001.method2243(); var4 != null; var4 = (class141) this.field2001.method2238()) {
            if (!this.field1999.method2337(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1968) {
                        this.method2508(var4, arg0, var5, var6, var5 + var6);
                        var4.field1968 -= var6;
                        break;
                    }
                    this.method2508(var4, arg0, var5, var4.field1968, var5 + var6);
                    var5 += var4.field1968;
                    var6 -= var4.field1968;
                } while (!this.field1999.method2389(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ej.a(I)V")
    public void method919(int arg0) {
        this.field1998.method919(arg0);
        for (class141 var2 = (class141) this.field2001.method2243(); var2 != null; var2 = (class141) this.field2001.method2238()) {
            if (!this.field1999.method2337(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1968) {
                        this.method2509(var2, var3);
                        var2.field1968 -= var3;
                        break;
                    }
                    this.method2509(var2, var2.field1968);
                    var3 -= var2.field1968;
                } while (!this.field1999.method2389(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ej.k(Leg;[IIIII)V")
    public void method2508(class141 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field1999.field1918[arg0.field1960] & 0x4) != 0 && arg0.field1963 < 0) {
            int var6 = this.field1999.field1935[arg0.field1960] / Statics.field1046;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field1969) / var6;
                if (var7 > arg3) {
                    arg0.field1969 += arg3 * var6;
                    break;
                }
                arg0.field1971.method907(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field1969 += var6 * var7 - 1048576;
                int var8 = Statics.field1046 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class67 var10 = arg0.field1971;
                if (this.field1999.field1933[arg0.field1960] == 0) {
                    arg0.field1971 = class67.method1203(arg0.field1962, var10.method1157(), var10.method1149(), var10.method1239());
                } else {
                    arg0.field1971 = class67.method1203(arg0.field1962, var10.method1157(), 0, var10.method1239());
                    this.field1999.method2311(arg0, arg0.field1950.field1988[arg0.field1954] < 0);
                    arg0.field1971.method1153(var8, var10.method1149());
                }
                if (arg0.field1950.field1988[arg0.field1954] < 0) {
                    arg0.field1971.method1146(-1);
                }
                var10.method1155(var8);
                var10.method907(arg1, arg2, arg4 - arg2);
                if (var10.method1140()) {
                    this.field1998.method891(var10);
                }
            }
        }
        arg0.field1971.method907(arg1, arg2, arg3);
    }

    @ObfuscatedName("ej.y(Leg;IB)V")
    public void method2509(class141 arg0, int arg1) {
        if ((this.field1999.field1918[arg0.field1960] & 0x4) != 0 && arg0.field1963 < 0) {
            int var3 = this.field1999.field1935[arg0.field1960] / Statics.field1046;
            int var4 = (var3 + 1048575 - arg0.field1969) / var3;
            arg0.field1969 = arg0.field1969 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field1999.field1933[arg0.field1960] == 0) {
                    arg0.field1971 = class67.method1203(arg0.field1962, arg0.field1971.method1157(), arg0.field1971.method1149(), arg0.field1971.method1239());
                } else {
                    arg0.field1971 = class67.method1203(arg0.field1962, arg0.field1971.method1157(), 0, arg0.field1971.method1239());
                    this.field1999.method2311(arg0, arg0.field1950.field1988[arg0.field1954] < 0);
                }
                if (arg0.field1950.field1988[arg0.field1954] < 0) {
                    arg0.field1971.method1146(-1);
                }
                arg1 = arg0.field1969 / var3;
            }
        }
        arg0.field1971.method919(arg1);
    }
}
