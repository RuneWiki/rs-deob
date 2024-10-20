package deob;

@ObfuscatedName("eq")
public class class144 extends class69 {

    @ObfuscatedName("eq.b")
    public class140 field2002;

    @ObfuscatedName("eq.l")
    public class129 field1999 = new class129();

    @ObfuscatedName("eq.i")
    public class52 field2000 = new class52();

    public class144(class140 arg0) {
        this.field2002 = arg0;
    }

    @ObfuscatedName("eq.x()Lbq;")
    public class69 method996() {
        class141 var1 = (class141) this.field1999.method2324();
        if (var1 == null) {
            return null;
        } else if (var1.field1956 == null) {
            return this.method970();
        } else {
            return var1.field1956;
        }
    }

    @ObfuscatedName("eq.z()Lbq;")
    public class69 method970() {
        class141 var1;
        do {
            var1 = (class141) this.field1999.method2331();
            if (var1 == null) {
                return null;
            }
        } while (var1.field1956 == null);
        return var1.field1956;
    }

    @ObfuscatedName("eq.p()I")
    public int method971() {
        return 0;
    }

    @ObfuscatedName("eq.s([III)V")
    public void method985(int[] arg0, int arg1, int arg2) {
        this.field2000.method985(arg0, arg1, arg2);
        for (class141 var4 = (class141) this.field1999.method2324(); var4 != null; var4 = (class141) this.field1999.method2331()) {
            if (!this.field2002.method2450(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1969) {
                        this.method2580(var4, arg0, var5, var6, var5 + var6);
                        var4.field1969 -= var6;
                        break;
                    }
                    this.method2580(var4, arg0, var5, var4.field1969, var5 + var6);
                    var5 += var4.field1969;
                    var6 -= var4.field1969;
                } while (!this.field2002.method2439(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("eq.y(I)V")
    public void method974(int arg0) {
        this.field2000.method974(arg0);
        for (class141 var2 = (class141) this.field1999.method2324(); var2 != null; var2 = (class141) this.field1999.method2331()) {
            if (!this.field2002.method2450(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1969) {
                        this.method2581(var2, var3);
                        var2.field1969 -= var3;
                        break;
                    }
                    this.method2581(var2, var2.field1969);
                    var3 -= var2.field1969;
                } while (!this.field2002.method2439(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("eq.b(Lea;[IIIII)V")
    public void method2580(class141 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2002.field1934[arg0.field1967] & 0x4) != 0 && arg0.field1964 < 0) {
            int var6 = this.field2002.field1939[arg0.field1967] / Statics.field3080;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field1970) / var6;
                if (var7 > arg3) {
                    arg0.field1970 += arg3 * var6;
                    break;
                }
                arg0.field1956.method985(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field1970 += var6 * var7 - 1048576;
                int var8 = Statics.field3080 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class67 var10 = arg0.field1956;
                if (this.field2002.field1937[arg0.field1967] == 0) {
                    arg0.field1956 = class67.method1193(arg0.field1955, var10.method1189(), var10.method1199(), var10.method1234());
                } else {
                    arg0.field1956 = class67.method1193(arg0.field1955, var10.method1189(), 0, var10.method1234());
                    this.field2002.method2422(arg0, arg0.field1958.field1992[arg0.field1952] < 0);
                    arg0.field1956.method1204(var8, var10.method1199());
                }
                if (arg0.field1958.field1992[arg0.field1952] < 0) {
                    arg0.field1956.method1195(-1);
                }
                var10.method1246(var8);
                var10.method985(arg1, arg2, arg4 - arg2);
                if (var10.method1210()) {
                    this.field2000.method964(var10);
                }
            }
        }
        arg0.field1956.method985(arg1, arg2, arg3);
    }

    @ObfuscatedName("eq.l(Lea;II)V")
    public void method2581(class141 arg0, int arg1) {
        if ((this.field2002.field1934[arg0.field1967] & 0x4) != 0 && arg0.field1964 < 0) {
            int var3 = this.field2002.field1939[arg0.field1967] / Statics.field3080;
            int var4 = (var3 + 1048575 - arg0.field1970) / var3;
            arg0.field1970 = arg0.field1970 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2002.field1937[arg0.field1967] == 0) {
                    arg0.field1956 = class67.method1193(arg0.field1955, arg0.field1956.method1189(), arg0.field1956.method1199(), arg0.field1956.method1234());
                } else {
                    arg0.field1956 = class67.method1193(arg0.field1955, arg0.field1956.method1189(), 0, arg0.field1956.method1234());
                    this.field2002.method2422(arg0, arg0.field1958.field1992[arg0.field1952] < 0);
                }
                if (arg0.field1958.field1992[arg0.field1952] < 0) {
                    arg0.field1956.method1195(-1);
                }
                arg1 = arg0.field1970 / var3;
            }
        }
        arg0.field1956.method974(arg1);
    }
}
