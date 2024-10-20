package deob;

@ObfuscatedName("em")
public class class144 extends class69 {

    @ObfuscatedName("em.b")
    public class140 field1997;

    @ObfuscatedName("em.e")
    public class129 field1998 = new class129();

    @ObfuscatedName("em.c")
    public class52 field1999 = new class52();

    public class144(class140 arg0) {
        this.field1997 = arg0;
    }

    @ObfuscatedName("em.j()Lbm;")
    public class69 method944() {
        class141 var1 = (class141) this.field1998.method2315();
        if (var1 == null) {
            return null;
        } else if (var1.field1960 == null) {
            return this.method926();
        } else {
            return var1.field1960;
        }
    }

    @ObfuscatedName("em.t()Lbm;")
    public class69 method926() {
        class141 var1;
        do {
            var1 = (class141) this.field1998.method2332();
            if (var1 == null) {
                return null;
            }
        } while (var1.field1960 == null);
        return var1.field1960;
    }

    @ObfuscatedName("em.k()I")
    public int method927() {
        return 0;
    }

    @ObfuscatedName("em.f([III)V")
    public void method942(int[] arg0, int arg1, int arg2) {
        this.field1999.method942(arg0, arg1, arg2);
        for (class141 var4 = (class141) this.field1998.method2315(); var4 != null; var4 = (class141) this.field1998.method2332()) {
            if (!this.field1997.method2437(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1949) {
                        this.method2574(var4, arg0, var5, var6, var5 + var6);
                        var4.field1949 -= var6;
                        break;
                    }
                    this.method2574(var4, arg0, var5, var4.field1949, var5 + var6);
                    var5 += var4.field1949;
                    var6 -= var4.field1949;
                } while (!this.field1997.method2438(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("em.v(I)V")
    public void method950(int arg0) {
        this.field1999.method950(arg0);
        for (class141 var2 = (class141) this.field1998.method2315(); var2 != null; var2 = (class141) this.field1998.method2332()) {
            if (!this.field1997.method2437(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1949) {
                        this.method2575(var2, var3);
                        var2.field1949 -= var3;
                        break;
                    }
                    this.method2575(var2, var2.field1949);
                    var3 -= var2.field1949;
                } while (!this.field1997.method2438(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("em.b(Leb;[IIIIB)V")
    public void method2574(class141 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field1997.field1924[arg0.field1966] & 0x4) != 0 && arg0.field1954 < 0) {
            int var6 = this.field1997.field1929[arg0.field1966] / Statics.field1072;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field1962) / var6;
                if (var7 > arg3) {
                    arg0.field1962 += arg3 * var6;
                    break;
                }
                arg0.field1960.method942(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field1962 += var6 * var7 - 1048576;
                int var8 = Statics.field1072 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class67 var10 = arg0.field1960;
                if (this.field1997.field1941[arg0.field1966] == 0) {
                    arg0.field1960 = class67.method1172(arg0.field1944, var10.method1282(), var10.method1178(), var10.method1179());
                } else {
                    arg0.field1960 = class67.method1172(arg0.field1944, var10.method1282(), 0, var10.method1179());
                    this.field1997.method2487(arg0, arg0.field1942.field1984[arg0.field1947] < 0);
                    arg0.field1960.method1182(var8, var10.method1178());
                }
                if (arg0.field1942.field1984[arg0.field1947] < 0) {
                    arg0.field1960.method1174(-1);
                }
                var10.method1283(var8);
                var10.method942(arg1, arg2, arg4 - arg2);
                if (var10.method1226()) {
                    this.field1999.method930(var10);
                }
            }
        }
        arg0.field1960.method942(arg1, arg2, arg3);
    }

    @ObfuscatedName("em.e(Leb;II)V")
    public void method2575(class141 arg0, int arg1) {
        if ((this.field1997.field1924[arg0.field1966] & 0x4) != 0 && arg0.field1954 < 0) {
            int var3 = this.field1997.field1929[arg0.field1966] / Statics.field1072;
            int var4 = (var3 + 1048575 - arg0.field1962) / var3;
            arg0.field1962 = arg0.field1962 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field1997.field1941[arg0.field1966] == 0) {
                    arg0.field1960 = class67.method1172(arg0.field1944, arg0.field1960.method1282(), arg0.field1960.method1178(), arg0.field1960.method1179());
                } else {
                    arg0.field1960 = class67.method1172(arg0.field1944, arg0.field1960.method1282(), 0, arg0.field1960.method1179());
                    this.field1997.method2487(arg0, arg0.field1942.field1984[arg0.field1947] < 0);
                }
                if (arg0.field1942.field1984[arg0.field1947] < 0) {
                    arg0.field1960.method1174(-1);
                }
                arg1 = arg0.field1962 / var3;
            }
        }
        arg0.field1960.method950(arg1);
    }
}
