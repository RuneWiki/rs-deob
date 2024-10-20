package deob;

@ObfuscatedName("gz")
public class class186 extends class67 {

    @ObfuscatedName("gz.z")
    public class184 field2993;

    @ObfuscatedName("gz.q")
    public class199 field2990 = new class199();

    @ObfuscatedName("gz.k")
    public class56 field2989 = new class56();

    public class186(class184 arg0) {
        this.field2993 = arg0;
    }

    @ObfuscatedName("gz.l()Lbt;")
    public class67 method1098() {
        class187 var1 = (class187) this.field2990.method3502();
        if (var1 == null) {
            return null;
        } else if (var1.field3013 == null) {
            return this.method1103();
        } else {
            return var1.field3013;
        }
    }

    @ObfuscatedName("gz.r()Lbt;")
    public class67 method1103() {
        class187 var1;
        do {
            var1 = (class187) this.field2990.method3489();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3013 == null);
        return var1.field3013;
    }

    @ObfuscatedName("gz.g()I")
    public int method1100() {
        return 0;
    }

    @ObfuscatedName("gz.h([III)V")
    public void method1113(int[] arg0, int arg1, int arg2) {
        this.field2989.method1113(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2990.method3502(); var4 != null; var4 = (class187) this.field2990.method3489()) {
            if (!this.field2993.method3327(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3001) {
                        this.method3415(var4, arg0, var5, var6, var5 + var6);
                        var4.field3001 -= var6;
                        break;
                    }
                    this.method3415(var4, arg0, var5, var4.field3001, var5 + var6);
                    var5 += var4.field3001;
                    var6 -= var4.field3001;
                } while (!this.field2993.method3334(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gz.j(I)V")
    public void method1123(int arg0) {
        this.field2989.method1123(arg0);
        for (class187 var2 = (class187) this.field2990.method3502(); var2 != null; var2 = (class187) this.field2990.method3489()) {
            if (!this.field2993.method3327(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3001) {
                        this.method3416(var2, var3);
                        var2.field3001 -= var3;
                        break;
                    }
                    this.method3416(var2, var2.field3001);
                    var3 -= var2.field3001;
                } while (!this.field2993.method3334(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gz.z(Lgb;[IIIII)V")
    public void method3415(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2993.field2963[arg0.field3015] & 0x4) != 0 && arg0.field3009 < 0) {
            int var6 = this.field2993.field2959[arg0.field3015] / Statics.field1194;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3004) / var6;
                if (var7 > arg3) {
                    arg0.field3004 += arg3 * var6;
                    break;
                }
                arg0.field3013.method1113(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3004 += var6 * var7 - 1048576;
                int var8 = Statics.field1194 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3013;
                if (this.field2993.field2952[arg0.field3015] == 0) {
                    arg0.field3013 = class65.method1286(arg0.field2997, var10.method1248(), var10.method1240(), var10.method1241());
                } else {
                    arg0.field3013 = class65.method1286(arg0.field2997, var10.method1248(), 0, var10.method1241());
                    this.field2993.method3308(arg0, arg0.field2996.field2917[arg0.field3000] < 0);
                    arg0.field3013.method1245(var8, var10.method1240());
                }
                if (arg0.field2996.field2917[arg0.field3000] < 0) {
                    arg0.field3013.method1236(-1);
                }
                var10.method1243(var8);
                var10.method1113(arg1, arg2, arg4 - arg2);
                if (var10.method1250()) {
                    this.field2989.method1093(var10);
                }
            }
        }
        arg0.field3013.method1113(arg1, arg2, arg3);
    }

    @ObfuscatedName("gz.q(Lgb;II)V")
    public void method3416(class187 arg0, int arg1) {
        if ((this.field2993.field2963[arg0.field3015] & 0x4) != 0 && arg0.field3009 < 0) {
            int var3 = this.field2993.field2959[arg0.field3015] / Statics.field1194;
            int var4 = (var3 + 1048575 - arg0.field3004) / var3;
            arg0.field3004 = arg0.field3004 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2993.field2952[arg0.field3015] == 0) {
                    arg0.field3013 = class65.method1286(arg0.field2997, arg0.field3013.method1248(), arg0.field3013.method1240(), arg0.field3013.method1241());
                } else {
                    arg0.field3013 = class65.method1286(arg0.field2997, arg0.field3013.method1248(), 0, arg0.field3013.method1241());
                    this.field2993.method3308(arg0, arg0.field2996.field2917[arg0.field3000] < 0);
                }
                if (arg0.field2996.field2917[arg0.field3000] < 0) {
                    arg0.field3013.method1236(-1);
                }
                arg1 = arg0.field3004 / var3;
            }
        }
        arg0.field3013.method1123(arg1);
    }
}
