package deob;

@ObfuscatedName("ek")
public class class144 extends class69 {

    @ObfuscatedName("ek.x")
    public class140 field2006;

    @ObfuscatedName("ek.n")
    public class129 field2004 = new class129();

    @ObfuscatedName("ek.g")
    public class52 field2005 = new class52();

    public class144(class140 arg0) {
        this.field2006 = arg0;
    }

    @ObfuscatedName("ek.p()Lbs;")
    public class69 method982() {
        class141 var1 = (class141) this.field2004.method2352();
        if (var1 == null) {
            return null;
        } else if (var1.field1975 == null) {
            return this.method983();
        } else {
            return var1.field1975;
        }
    }

    @ObfuscatedName("ek.j()Lbs;")
    public class69 method983() {
        class141 var1;
        do {
            var1 = (class141) this.field2004.method2341();
            if (var1 == null) {
                return null;
            }
        } while (var1.field1975 == null);
        return var1.field1975;
    }

    @ObfuscatedName("ek.s()I")
    public int method984() {
        return 0;
    }

    @ObfuscatedName("ek.k([III)V")
    public void method985(int[] arg0, int arg1, int arg2) {
        this.field2005.method985(arg0, arg1, arg2);
        for (class141 var4 = (class141) this.field2004.method2352(); var4 != null; var4 = (class141) this.field2004.method2341()) {
            if (!this.field2006.method2452(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1972) {
                        this.method2598(var4, arg0, var5, var6, var5 + var6);
                        var4.field1972 -= var6;
                        break;
                    }
                    this.method2598(var4, arg0, var5, var4.field1972, var5 + var6);
                    var5 += var4.field1972;
                    var6 -= var4.field1972;
                } while (!this.field2006.method2520(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ek.o(I)V")
    public void method987(int arg0) {
        this.field2005.method987(arg0);
        for (class141 var2 = (class141) this.field2004.method2352(); var2 != null; var2 = (class141) this.field2004.method2341()) {
            if (!this.field2006.method2452(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1972) {
                        this.method2597(var2, var3);
                        var2.field1972 -= var3;
                        break;
                    }
                    this.method2597(var2, var2.field1972);
                    var3 -= var2.field1972;
                } while (!this.field2006.method2520(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ek.x(Ley;[IIIII)V")
    public void method2598(class141 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2006.field1940[arg0.field1969] & 0x4) != 0 && arg0.field1971 < 0) {
            int var6 = this.field2006.field1951[arg0.field1969] / Statics.field1054;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field1977) / var6;
                if (var7 > arg3) {
                    arg0.field1977 += arg3 * var6;
                    break;
                }
                arg0.field1975.method985(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field1977 += var6 * var7 - 1048576;
                int var8 = Statics.field1054 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class67 var10 = arg0.field1975;
                if (this.field2006.field1944[arg0.field1969] == 0) {
                    arg0.field1975 = class67.method1216(arg0.field1959, var10.method1230(), var10.method1311(), var10.method1223());
                } else {
                    arg0.field1975 = class67.method1216(arg0.field1959, var10.method1230(), 0, var10.method1223());
                    this.field2006.method2435(arg0, arg0.field1958.field1993[arg0.field1962] < 0);
                    arg0.field1975.method1226(var8, var10.method1311());
                }
                if (arg0.field1958.field1993[arg0.field1962] < 0) {
                    arg0.field1975.method1218(-1);
                }
                var10.method1228(var8);
                var10.method985(arg1, arg2, arg4 - arg2);
                if (var10.method1232()) {
                    this.field2005.method1002(var10);
                }
            }
        }
        arg0.field1975.method985(arg1, arg2, arg3);
    }

    @ObfuscatedName("ek.n(Ley;IB)V")
    public void method2597(class141 arg0, int arg1) {
        if ((this.field2006.field1940[arg0.field1969] & 0x4) != 0 && arg0.field1971 < 0) {
            int var3 = this.field2006.field1951[arg0.field1969] / Statics.field1054;
            int var4 = (var3 + 1048575 - arg0.field1977) / var3;
            arg0.field1977 = arg0.field1977 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2006.field1944[arg0.field1969] == 0) {
                    arg0.field1975 = class67.method1216(arg0.field1959, arg0.field1975.method1230(), arg0.field1975.method1311(), arg0.field1975.method1223());
                } else {
                    arg0.field1975 = class67.method1216(arg0.field1959, arg0.field1975.method1230(), 0, arg0.field1975.method1223());
                    this.field2006.method2435(arg0, arg0.field1958.field1993[arg0.field1962] < 0);
                }
                if (arg0.field1958.field1993[arg0.field1962] < 0) {
                    arg0.field1975.method1218(-1);
                }
                arg1 = arg0.field1977 / var3;
            }
        }
        arg0.field1975.method987(arg1);
    }
}
