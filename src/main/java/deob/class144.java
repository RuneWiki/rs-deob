package deob;

@ObfuscatedName("el")
public class class144 extends class69 {

    @ObfuscatedName("el.p")
    public class140 field2008;

    @ObfuscatedName("el.g")
    public class129 field2007 = new class129();

    @ObfuscatedName("el.x")
    public class52 field2009 = new class52();

    public class144(class140 arg0) {
        this.field2008 = arg0;
    }

    @ObfuscatedName("el.k()Lbs;")
    public class69 method875() {
        class141 var1 = (class141) this.field2007.method2237();
        if (var1 == null) {
            return null;
        } else if (var1.field1976 == null) {
            return this.method876();
        } else {
            return var1.field1976;
        }
    }

    @ObfuscatedName("el.j()Lbs;")
    public class69 method876() {
        class141 var1;
        do {
            var1 = (class141) this.field2007.method2251();
            if (var1 == null) {
                return null;
            }
        } while (var1.field1976 == null);
        return var1.field1976;
    }

    @ObfuscatedName("el.s()I")
    public int method877() {
        return 0;
    }

    @ObfuscatedName("el.o([III)V")
    public void method878(int[] arg0, int arg1, int arg2) {
        this.field2009.method878(arg0, arg1, arg2);
        for (class141 var4 = (class141) this.field2007.method2237(); var4 != null; var4 = (class141) this.field2007.method2251()) {
            if (!this.field2008.method2362(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1967) {
                        this.method2509(var4, arg0, var5, var6, var5 + var6);
                        var4.field1967 -= var6;
                        break;
                    }
                    this.method2509(var4, arg0, var5, var4.field1967, var5 + var6);
                    var5 += var4.field1967;
                    var6 -= var4.field1967;
                } while (!this.field2008.method2363(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("el.c(I)V")
    public void method888(int arg0) {
        this.field2009.method888(arg0);
        for (class141 var2 = (class141) this.field2007.method2237(); var2 != null; var2 = (class141) this.field2007.method2251()) {
            if (!this.field2008.method2362(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1967) {
                        this.method2502(var2, var3);
                        var2.field1967 -= var3;
                        break;
                    }
                    this.method2502(var2, var2.field1967);
                    var3 -= var2.field1967;
                } while (!this.field2008.method2363(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("el.p(Lef;[IIIII)V")
    public void method2509(class141 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2008.field1941[arg0.field1977] & 0x4) != 0 && arg0.field1972 < 0) {
            int var6 = this.field2008.field1956[arg0.field1977] / Statics.field1048;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field1978) / var6;
                if (var7 > arg3) {
                    arg0.field1978 += arg3 * var6;
                    break;
                }
                arg0.field1976.method878(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field1978 += var6 * var7 - 1048576;
                int var8 = Statics.field1048 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class67 var10 = arg0.field1976;
                if (this.field2008.field1944[arg0.field1977] == 0) {
                    arg0.field1976 = class67.method1111(arg0.field1969, var10.method1227(), var10.method1117(), var10.method1204());
                } else {
                    arg0.field1976 = class67.method1111(arg0.field1969, var10.method1227(), 0, var10.method1204());
                    this.field2008.method2416(arg0, arg0.field1966.field1999[arg0.field1970] < 0);
                    arg0.field1976.method1140(var8, var10.method1117());
                }
                if (arg0.field1966.field1999[arg0.field1970] < 0) {
                    arg0.field1976.method1113(-1);
                }
                var10.method1123(var8);
                var10.method878(arg1, arg2, arg4 - arg2);
                if (var10.method1127()) {
                    this.field2009.method870(var10);
                }
            }
        }
        arg0.field1976.method878(arg1, arg2, arg3);
    }

    @ObfuscatedName("el.g(Lef;IB)V")
    public void method2502(class141 arg0, int arg1) {
        if ((this.field2008.field1941[arg0.field1977] & 0x4) != 0 && arg0.field1972 < 0) {
            int var3 = this.field2008.field1956[arg0.field1977] / Statics.field1048;
            int var4 = (var3 + 1048575 - arg0.field1978) / var3;
            arg0.field1978 = arg0.field1978 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2008.field1944[arg0.field1977] == 0) {
                    arg0.field1976 = class67.method1111(arg0.field1969, arg0.field1976.method1227(), arg0.field1976.method1117(), arg0.field1976.method1204());
                } else {
                    arg0.field1976 = class67.method1111(arg0.field1969, arg0.field1976.method1227(), 0, arg0.field1976.method1204());
                    this.field2008.method2416(arg0, arg0.field1966.field1999[arg0.field1970] < 0);
                }
                if (arg0.field1966.field1999[arg0.field1970] < 0) {
                    arg0.field1976.method1113(-1);
                }
                arg1 = arg0.field1978 / var3;
            }
        }
        arg0.field1976.method888(arg1);
    }
}
