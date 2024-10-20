package deob;

@ObfuscatedName("fe")
public class class180 extends class65 {

    @ObfuscatedName("fe.j")
    public class178 field2926;

    @ObfuscatedName("fe.y")
    public class193 field2927 = new class193();

    @ObfuscatedName("fe.z")
    public class54 field2928 = new class54();

    public class180(class178 arg0) {
        this.field2926 = arg0;
    }

    @ObfuscatedName("fe.d()Lbx;")
    public class65 method1155() {
        class181 var1 = (class181) this.field2927.method3490();
        if (var1 == null) {
            return null;
        } else if (var1.field2950 == null) {
            return this.method1156();
        } else {
            return var1.field2950;
        }
    }

    @ObfuscatedName("fe.f()Lbx;")
    public class65 method1156() {
        class181 var1;
        do {
            var1 = (class181) this.field2927.method3492();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2950 == null);
        return var1.field2950;
    }

    @ObfuscatedName("fe.i()I")
    public int method1157() {
        return 0;
    }

    @ObfuscatedName("fe.a([III)V")
    public void method1158(int[] arg0, int arg1, int arg2) {
        this.field2928.method1158(arg0, arg1, arg2);
        for (class181 var4 = (class181) this.field2927.method3490(); var4 != null; var4 = (class181) this.field2927.method3492()) {
            if (!this.field2926.method3343(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2956) {
                        this.method3413(var4, arg0, var5, var6, var5 + var6);
                        var4.field2956 -= var6;
                        break;
                    }
                    this.method3413(var4, arg0, var5, var4.field2956, var5 + var6);
                    var5 += var4.field2956;
                    var6 -= var4.field2956;
                } while (!this.field2926.method3399(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fe.u(I)V")
    public void method1160(int arg0) {
        this.field2928.method1160(arg0);
        for (class181 var2 = (class181) this.field2927.method3490(); var2 != null; var2 = (class181) this.field2927.method3492()) {
            if (!this.field2926.method3343(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2956) {
                        this.method3411(var2, var3);
                        var2.field2956 -= var3;
                        break;
                    }
                    this.method3411(var2, var2.field2956);
                    var3 -= var2.field2956;
                } while (!this.field2926.method3399(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fe.j(Lfn;[IIIII)V")
    public void method3413(class181 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2926.field2899[arg0.field2946] & 0x4) != 0 && arg0.field2937 < 0) {
            int var6 = this.field2926.field2904[arg0.field2946] / Statics.field1163;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2953) / var6;
                if (var7 > arg3) {
                    arg0.field2953 += arg3 * var6;
                    break;
                }
                arg0.field2950.method1158(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2953 += var6 * var7 - 1048576;
                int var8 = Statics.field1163 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class63 var10 = arg0.field2950;
                if (this.field2926.field2902[arg0.field2946] == 0) {
                    arg0.field2950 = class63.method1310(arg0.field2934, var10.method1325(), var10.method1316(), var10.method1317());
                } else {
                    arg0.field2950 = class63.method1310(arg0.field2934, var10.method1325(), 0, var10.method1317());
                    this.field2926.method3395(arg0, arg0.field2933.field2858[arg0.field2935] < 0);
                    arg0.field2950.method1321(var8, var10.method1316());
                }
                if (arg0.field2933.field2858[arg0.field2935] < 0) {
                    arg0.field2950.method1355(-1);
                }
                var10.method1323(var8);
                var10.method1158(arg1, arg2, arg4 - arg2);
                if (var10.method1365()) {
                    this.field2928.method1184(var10);
                }
            }
        }
        arg0.field2950.method1158(arg1, arg2, arg3);
    }

    @ObfuscatedName("fe.y(Lfn;II)V")
    public void method3411(class181 arg0, int arg1) {
        if ((this.field2926.field2899[arg0.field2946] & 0x4) != 0 && arg0.field2937 < 0) {
            int var3 = this.field2926.field2904[arg0.field2946] / Statics.field1163;
            int var4 = (var3 + 1048575 - arg0.field2953) / var3;
            arg0.field2953 = arg0.field2953 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2926.field2902[arg0.field2946] == 0) {
                    arg0.field2950 = class63.method1310(arg0.field2934, arg0.field2950.method1325(), arg0.field2950.method1316(), arg0.field2950.method1317());
                } else {
                    arg0.field2950 = class63.method1310(arg0.field2934, arg0.field2950.method1325(), 0, arg0.field2950.method1317());
                    this.field2926.method3395(arg0, arg0.field2933.field2858[arg0.field2935] < 0);
                }
                if (arg0.field2933.field2858[arg0.field2935] < 0) {
                    arg0.field2950.method1355(-1);
                }
                arg1 = arg0.field2953 / var3;
            }
        }
        arg0.field2950.method1160(arg1);
    }
}
