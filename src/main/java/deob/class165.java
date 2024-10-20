package deob;

@ObfuscatedName("fi")
public class class165 extends class69 {

    @ObfuscatedName("fi.d")
    public class161 field2159;

    @ObfuscatedName("fi.c")
    public class150 field2153 = new class150();

    @ObfuscatedName("fi.n")
    public class52 field2162 = new class52();

    public class165(class161 arg0) {
        this.field2159 = arg0;
    }

    @ObfuscatedName("fi.p()Lbc;")
    public class69 method910() {
        class162 var1 = (class162) this.field2153.method2666();
        if (var1 == null) {
            return null;
        } else if (var1.field2113 == null) {
            return this.method913();
        } else {
            return var1.field2113;
        }
    }

    @ObfuscatedName("fi.u()Lbc;")
    public class69 method913() {
        class162 var1;
        do {
            var1 = (class162) this.field2153.method2668();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2113 == null);
        return var1.field2113;
    }

    @ObfuscatedName("fi.w()I")
    public int method914() {
        return 0;
    }

    @ObfuscatedName("fi.r([III)V")
    public void method915(int[] arg0, int arg1, int arg2) {
        this.field2162.method915(arg0, arg1, arg2);
        for (class162 var4 = (class162) this.field2153.method2666(); var4 != null; var4 = (class162) this.field2153.method2668()) {
            if (!this.field2159.method2774(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2125) {
                        this.method2909(var4, arg0, var5, var6, var5 + var6);
                        var4.field2125 -= var6;
                        break;
                    }
                    this.method2909(var4, arg0, var5, var4.field2125, var5 + var6);
                    var5 += var4.field2125;
                    var6 -= var4.field2125;
                } while (!this.field2159.method2775(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fi.k(I)V")
    public void method920(int arg0) {
        this.field2162.method920(arg0);
        for (class162 var2 = (class162) this.field2153.method2666(); var2 != null; var2 = (class162) this.field2153.method2668()) {
            if (!this.field2159.method2774(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2125) {
                        this.method2911(var2, var3);
                        var2.field2125 -= var3;
                        break;
                    }
                    this.method2911(var2, var2.field2125);
                    var3 -= var2.field2125;
                } while (!this.field2159.method2775(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fi.d(Lfd;[IIIIS)V")
    public void method2909(class162 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2159.field2087[arg0.field2124] & 0x4) != 0 && arg0.field2120 < 0) {
            int var6 = this.field2159.field2092[arg0.field2124] / Statics.field1033;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2126) / var6;
                if (var7 > arg3) {
                    arg0.field2126 += arg3 * var6;
                    break;
                }
                arg0.field2113.method915(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2126 += var6 * var7 - 1048576;
                int var8 = Statics.field1033 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class67 var10 = arg0.field2113;
                if (this.field2159.field2090[arg0.field2124] == 0) {
                    arg0.field2113 = class67.method1153(arg0.field2114, var10.method1151(), var10.method1158(), var10.method1159());
                } else {
                    arg0.field2113 = class67.method1153(arg0.field2114, var10.method1151(), 0, var10.method1159());
                    this.field2159.method2798(arg0, arg0.field2110.field2145[arg0.field2111] < 0);
                    arg0.field2113.method1163(var8, var10.method1158());
                }
                if (arg0.field2110.field2145[arg0.field2111] < 0) {
                    arg0.field2113.method1220(-1);
                }
                var10.method1165(var8);
                var10.method915(arg1, arg2, arg4 - arg2);
                if (var10.method1198()) {
                    this.field2162.method907(var10);
                }
            }
        }
        arg0.field2113.method915(arg1, arg2, arg3);
    }

    @ObfuscatedName("fi.c(Lfd;IS)V")
    public void method2911(class162 arg0, int arg1) {
        if ((this.field2159.field2087[arg0.field2124] & 0x4) != 0 && arg0.field2120 < 0) {
            int var3 = this.field2159.field2092[arg0.field2124] / Statics.field1033;
            int var4 = (var3 + 1048575 - arg0.field2126) / var3;
            arg0.field2126 = arg0.field2126 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2159.field2090[arg0.field2124] == 0) {
                    arg0.field2113 = class67.method1153(arg0.field2114, arg0.field2113.method1151(), arg0.field2113.method1158(), arg0.field2113.method1159());
                } else {
                    arg0.field2113 = class67.method1153(arg0.field2114, arg0.field2113.method1151(), 0, arg0.field2113.method1159());
                    this.field2159.method2798(arg0, arg0.field2110.field2145[arg0.field2111] < 0);
                }
                if (arg0.field2110.field2145[arg0.field2111] < 0) {
                    arg0.field2113.method1220(-1);
                }
                arg1 = arg0.field2126 / var3;
            }
        }
        arg0.field2113.method920(arg1);
    }
}
