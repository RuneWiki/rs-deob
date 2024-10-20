package deob;

@ObfuscatedName("go")
public class class186 extends class67 {

    @ObfuscatedName("go.c")
    public class184 field2986;

    @ObfuscatedName("go.h")
    public class199 field2990 = new class199();

    @ObfuscatedName("go.k")
    public class56 field2987 = new class56();

    public class186(class184 arg0) {
        this.field2986 = arg0;
    }

    @ObfuscatedName("go.o()Lbv;")
    public class67 method1110() {
        class187 var1 = (class187) this.field2990.method3558();
        if (var1 == null) {
            return null;
        } else if (var1.field3009 == null) {
            return this.method1098();
        } else {
            return var1.field3009;
        }
    }

    @ObfuscatedName("go.i()Lbv;")
    public class67 method1098() {
        class187 var1;
        do {
            var1 = (class187) this.field2990.method3554();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3009 == null);
        return var1.field3009;
    }

    @ObfuscatedName("go.w()I")
    public int method1124() {
        return 0;
    }

    @ObfuscatedName("go.m([III)V")
    public void method1100(int[] arg0, int arg1, int arg2) {
        this.field2987.method1100(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2990.method3558(); var4 != null; var4 = (class187) this.field2990.method3554()) {
            if (!this.field2986.method3455(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3010) {
                        this.method3467(var4, arg0, var5, var6, var5 + var6);
                        var4.field3010 -= var6;
                        break;
                    }
                    this.method3467(var4, arg0, var5, var4.field3010, var5 + var6);
                    var5 += var4.field3010;
                    var6 -= var4.field3010;
                } while (!this.field2986.method3389(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("go.y(I)V")
    public void method1109(int arg0) {
        this.field2987.method1109(arg0);
        for (class187 var2 = (class187) this.field2990.method3558(); var2 != null; var2 = (class187) this.field2990.method3554()) {
            if (!this.field2986.method3455(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3010) {
                        this.method3466(var2, var3);
                        var2.field3010 -= var3;
                        break;
                    }
                    this.method3466(var2, var2.field3010);
                    var3 -= var2.field3010;
                } while (!this.field2986.method3389(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("go.c(Lgf;[IIIIS)V")
    public void method3467(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2986.field2958[arg0.field2992] & 0x4) != 0 && arg0.field3000 < 0) {
            int var6 = this.field2986.field2963[arg0.field2992] / Statics.field1191;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3014) / var6;
                if (var7 > arg3) {
                    arg0.field3014 += arg3 * var6;
                    break;
                }
                arg0.field3009.method1100(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3014 += var6 * var7 - 1048576;
                int var8 = Statics.field1191 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3009;
                if (this.field2986.field2961[arg0.field2992] == 0) {
                    arg0.field3009 = class65.method1255(arg0.field3001, var10.method1270(), var10.method1261(), var10.method1266());
                } else {
                    arg0.field3009 = class65.method1255(arg0.field3001, var10.method1270(), 0, var10.method1266());
                    this.field2986.method3386(arg0, arg0.field3005.field2913[arg0.field2996] < 0);
                    arg0.field3009.method1281(var8, var10.method1261());
                }
                if (arg0.field3005.field2913[arg0.field2996] < 0) {
                    arg0.field3009.method1257(-1);
                }
                var10.method1330(var8);
                var10.method1100(arg1, arg2, arg4 - arg2);
                if (var10.method1272()) {
                    this.field2987.method1092(var10);
                }
            }
        }
        arg0.field3009.method1100(arg1, arg2, arg3);
    }

    @ObfuscatedName("go.h(Lgf;IB)V")
    public void method3466(class187 arg0, int arg1) {
        if ((this.field2986.field2958[arg0.field2992] & 0x4) != 0 && arg0.field3000 < 0) {
            int var3 = this.field2986.field2963[arg0.field2992] / Statics.field1191;
            int var4 = (var3 + 1048575 - arg0.field3014) / var3;
            arg0.field3014 = arg0.field3014 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2986.field2961[arg0.field2992] == 0) {
                    arg0.field3009 = class65.method1255(arg0.field3001, arg0.field3009.method1270(), arg0.field3009.method1261(), arg0.field3009.method1266());
                } else {
                    arg0.field3009 = class65.method1255(arg0.field3001, arg0.field3009.method1270(), 0, arg0.field3009.method1266());
                    this.field2986.method3386(arg0, arg0.field3005.field2913[arg0.field2996] < 0);
                }
                if (arg0.field3005.field2913[arg0.field2996] < 0) {
                    arg0.field3009.method1257(-1);
                }
                arg1 = arg0.field3014 / var3;
            }
        }
        arg0.field3009.method1109(arg1);
    }
}
