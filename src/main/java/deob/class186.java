package deob;

@ObfuscatedName("gi")
public class class186 extends class67 {

    @ObfuscatedName("gi.m")
    public class184 field2984;

    @ObfuscatedName("gi.l")
    public class199 field2982 = new class199();

    @ObfuscatedName("gi.y")
    public class56 field2986 = new class56();

    public class186(class184 arg0) {
        this.field2984 = arg0;
    }

    @ObfuscatedName("gi.j()Lby;")
    public class67 method1155() {
        class187 var1 = (class187) this.field2982.method3611();
        if (var1 == null) {
            return null;
        } else if (var1.field3005 == null) {
            return this.method1156();
        } else {
            return var1.field3005;
        }
    }

    @ObfuscatedName("gi.i()Lby;")
    public class67 method1156() {
        class187 var1;
        do {
            var1 = (class187) this.field2982.method3613();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3005 == null);
        return var1.field3005;
    }

    @ObfuscatedName("gi.x()I")
    public int method1157() {
        return 0;
    }

    @ObfuscatedName("gi.g([III)V")
    public void method1183(int[] arg0, int arg1, int arg2) {
        this.field2986.method1183(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2982.method3611(); var4 != null; var4 = (class187) this.field2982.method3613()) {
            if (!this.field2984.method3452(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2995) {
                        this.method3519(var4, arg0, var5, var6, var5 + var6);
                        var4.field2995 -= var6;
                        break;
                    }
                    this.method3519(var4, arg0, var5, var4.field2995, var5 + var6);
                    var5 += var4.field2995;
                    var6 -= var4.field2995;
                } while (!this.field2984.method3470(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gi.p(I)V")
    public void method1160(int arg0) {
        this.field2986.method1160(arg0);
        for (class187 var2 = (class187) this.field2982.method3611(); var2 != null; var2 = (class187) this.field2982.method3613()) {
            if (!this.field2984.method3452(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2995) {
                        this.method3520(var2, var3);
                        var2.field2995 -= var3;
                        break;
                    }
                    this.method3520(var2, var2.field2995);
                    var3 -= var2.field2995;
                } while (!this.field2984.method3470(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gi.m(Lgr;[IIIII)V")
    public void method3519(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2984.field2954[arg0.field2987] & 0x4) != 0 && arg0.field2991 < 0) {
            int var6 = this.field2984.field2956[arg0.field2987] / Statics.field1139;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3006) / var6;
                if (var7 > arg3) {
                    arg0.field3006 += arg3 * var6;
                    break;
                }
                arg0.field3005.method1183(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3006 += var6 * var7 - 1048576;
                int var8 = Statics.field1139 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3005;
                if (this.field2984.field2950[arg0.field2987] == 0) {
                    arg0.field3005 = class65.method1305(arg0.field2989, var10.method1332(), var10.method1326(), var10.method1316());
                } else {
                    arg0.field3005 = class65.method1305(arg0.field2989, var10.method1332(), 0, var10.method1316());
                    this.field2984.method3463(arg0, arg0.field2988.field2913[arg0.field3001] < 0);
                    arg0.field3005.method1393(var8, var10.method1326());
                }
                if (arg0.field2988.field2913[arg0.field3001] < 0) {
                    arg0.field3005.method1344(-1);
                }
                var10.method1315(var8);
                var10.method1183(arg1, arg2, arg4 - arg2);
                if (var10.method1319()) {
                    this.field2986.method1150(var10);
                }
            }
        }
        arg0.field3005.method1183(arg1, arg2, arg3);
    }

    @ObfuscatedName("gi.l(Lgr;IB)V")
    public void method3520(class187 arg0, int arg1) {
        if ((this.field2984.field2954[arg0.field2987] & 0x4) != 0 && arg0.field2991 < 0) {
            int var3 = this.field2984.field2956[arg0.field2987] / Statics.field1139;
            int var4 = (var3 + 1048575 - arg0.field3006) / var3;
            arg0.field3006 = arg0.field3006 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2984.field2950[arg0.field2987] == 0) {
                    arg0.field3005 = class65.method1305(arg0.field2989, arg0.field3005.method1332(), arg0.field3005.method1326(), arg0.field3005.method1316());
                } else {
                    arg0.field3005 = class65.method1305(arg0.field2989, arg0.field3005.method1332(), 0, arg0.field3005.method1316());
                    this.field2984.method3463(arg0, arg0.field2988.field2913[arg0.field3001] < 0);
                }
                if (arg0.field2988.field2913[arg0.field3001] < 0) {
                    arg0.field3005.method1344(-1);
                }
                arg1 = arg0.field3006 / var3;
            }
        }
        arg0.field3005.method1160(arg1);
    }
}
