package deob;

@ObfuscatedName("ed")
public class class144 extends class69 {

    @ObfuscatedName("ed.q")
    public class140 field2007;

    @ObfuscatedName("ed.d")
    public class129 field2005 = new class129();

    @ObfuscatedName("ed.h")
    public class52 field2006 = new class52();

    public class144(class140 arg0) {
        this.field2007 = arg0;
    }

    @ObfuscatedName("ed.n()Lbs;")
    public class69 method984() {
        class141 var1 = (class141) this.field2005.method2319();
        if (var1 == null) {
            return null;
        } else if (var1.field1976 == null) {
            return this.method974();
        } else {
            return var1.field1976;
        }
    }

    @ObfuscatedName("ed.c()Lbs;")
    public class69 method974() {
        class141 var1;
        do {
            var1 = (class141) this.field2005.method2333();
            if (var1 == null) {
                return null;
            }
        } while (var1.field1976 == null);
        return var1.field1976;
    }

    @ObfuscatedName("ed.o()I")
    public int method990() {
        return 0;
    }

    @ObfuscatedName("ed.s([III)V")
    public void method976(int[] arg0, int arg1, int arg2) {
        this.field2006.method976(arg0, arg1, arg2);
        for (class141 var4 = (class141) this.field2005.method2319(); var4 != null; var4 = (class141) this.field2005.method2333()) {
            if (!this.field2007.method2426(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1953) {
                        this.method2563(var4, arg0, var5, var6, var5 + var6);
                        var4.field1953 -= var6;
                        break;
                    }
                    this.method2563(var4, arg0, var5, var4.field1953, var5 + var6);
                    var5 += var4.field1953;
                    var6 -= var4.field1953;
                } while (!this.field2007.method2435(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ed.b(I)V")
    public void method978(int arg0) {
        this.field2006.method978(arg0);
        for (class141 var2 = (class141) this.field2005.method2319(); var2 != null; var2 = (class141) this.field2005.method2333()) {
            if (!this.field2007.method2426(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1953) {
                        this.method2564(var2, var3);
                        var2.field1953 -= var3;
                        break;
                    }
                    this.method2564(var2, var2.field1953);
                    var3 -= var2.field1953;
                } while (!this.field2007.method2435(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ed.q(Len;[IIIII)V")
    public void method2563(class141 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2007.field1942[arg0.field1968] & 0x4) != 0 && arg0.field1966 < 0) {
            int var6 = this.field2007.field1936[arg0.field1968] / Statics.field1062;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field1972) / var6;
                if (var7 > arg3) {
                    arg0.field1972 += arg3 * var6;
                    break;
                }
                arg0.field1976.method976(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field1972 += var6 * var7 - 1048576;
                int var8 = Statics.field1062 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class67 var10 = arg0.field1976;
                if (this.field2007.field1939[arg0.field1968] == 0) {
                    arg0.field1976 = class67.method1201(arg0.field1954, var10.method1290(), var10.method1223(), var10.method1236());
                } else {
                    arg0.field1976 = class67.method1201(arg0.field1954, var10.method1290(), 0, var10.method1236());
                    this.field2007.method2418(arg0, arg0.field1974.field1993[arg0.field1956] < 0);
                    arg0.field1976.method1211(var8, var10.method1223());
                }
                if (arg0.field1974.field1993[arg0.field1956] < 0) {
                    arg0.field1976.method1208(-1);
                }
                var10.method1268(var8);
                var10.method976(arg1, arg2, arg4 - arg2);
                if (var10.method1217()) {
                    this.field2006.method968(var10);
                }
            }
        }
        arg0.field1976.method976(arg1, arg2, arg3);
    }

    @ObfuscatedName("ed.d(Len;II)V")
    public void method2564(class141 arg0, int arg1) {
        if ((this.field2007.field1942[arg0.field1968] & 0x4) != 0 && arg0.field1966 < 0) {
            int var3 = this.field2007.field1936[arg0.field1968] / Statics.field1062;
            int var4 = (var3 + 1048575 - arg0.field1972) / var3;
            arg0.field1972 = arg0.field1972 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2007.field1939[arg0.field1968] == 0) {
                    arg0.field1976 = class67.method1201(arg0.field1954, arg0.field1976.method1290(), arg0.field1976.method1223(), arg0.field1976.method1236());
                } else {
                    arg0.field1976 = class67.method1201(arg0.field1954, arg0.field1976.method1290(), 0, arg0.field1976.method1236());
                    this.field2007.method2418(arg0, arg0.field1974.field1993[arg0.field1956] < 0);
                }
                if (arg0.field1974.field1993[arg0.field1956] < 0) {
                    arg0.field1976.method1208(-1);
                }
                arg1 = arg0.field1972 / var3;
            }
        }
        arg0.field1976.method978(arg1);
    }
}
