package deob;

@ObfuscatedName("ea")
public class class33 extends class182 {

    @ObfuscatedName("ea.b")
    public class160 field326 = new class160();

    @ObfuscatedName("ea.c")
    public class71 field325 = new class71();

    @ObfuscatedName("ea.v")
    public class35 field327;

    @ObfuscatedName("ea.v(Lex;[IIIII)V")
    public void method544(class55 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field327.field345[arg0.field602] & 0x4) != 0 && arg0.field600 < 0) {
            int var6 = this.field327.field347[arg0.field602] / Statics.field1914;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field607) / var6;
                if (var7 > arg3) {
                    arg0.field607 += arg3 * var6;
                    break;
                }
                arg0.field604.method548(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field607 += var6 * var7 - 1048576;
                int var8 = Statics.field1914 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class180 var10 = arg0.field604;
                if (this.field327.field340[arg0.field602] == 0) {
                    arg0.field604 = class180.method3269(arg0.field588, var10.method3370(), var10.method3275(), var10.method3276());
                } else {
                    arg0.field604 = class180.method3269(arg0.field588, var10.method3370(), 0, var10.method3276());
                    this.field327.method592(arg0, arg0.field587.field938[arg0.field591] < 0);
                    arg0.field604.method3280(var8, var10.method3275());
                }
                if (arg0.field587.field938[arg0.field591] < 0) {
                    arg0.field604.method3271(-1);
                }
                var10.method3282(var8);
                var10.method548(arg1, arg2, arg4 - arg2);
                if (var10.method3286()) {
                    this.field326.method2842(var10);
                }
            }
        }
        arg0.field604.method548(arg1, arg2, arg3);
    }

    @ObfuscatedName("ea.r()Lab;")
    public class182 method545() {
        class55 var1 = (class55) this.field325.method1104();
        if (var1 == null) {
            return null;
        } else if (var1.field604 == null) {
            return this.method555();
        } else {
            return var1.field604;
        }
    }

    @ObfuscatedName("ea.q([III)V")
    public void method548(int[] arg0, int arg1, int arg2) {
        this.field326.method548(arg0, arg1, arg2);
        for (class55 var4 = (class55) this.field325.method1104(); var4 != null; var4 = (class55) this.field325.method1106()) {
            if (!this.field327.method684(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field605) {
                        this.method544(var4, arg0, var5, var6, var5 + var6);
                        var4.field605 -= var6;
                        break;
                    }
                    this.method544(var4, arg0, var5, var4.field605, var5 + var6);
                    var5 += var4.field605;
                    var6 -= var4.field605;
                } while (!this.field327.method685(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ea.as(I)V")
    public void method549(int arg0) {
        this.field326.method549(arg0);
        for (class55 var2 = (class55) this.field325.method1104(); var2 != null; var2 = (class55) this.field325.method1106()) {
            if (!this.field327.method684(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field605) {
                        this.method550(var2, var3);
                        var2.field605 -= var3;
                        break;
                    }
                    this.method550(var2, var2.field605);
                    var3 -= var2.field605;
                } while (!this.field327.method685(var2, (int[]) null, 0, var3));
            }
        }
    }

    public class33(class35 arg0) {
        this.field327 = arg0;
    }

    @ObfuscatedName("ea.c(Lex;II)V")
    public void method550(class55 arg0, int arg1) {
        if ((this.field327.field345[arg0.field602] & 0x4) != 0 && arg0.field600 < 0) {
            int var3 = this.field327.field347[arg0.field602] / Statics.field1914;
            int var4 = (var3 + 1048575 - arg0.field607) / var3;
            arg0.field607 = arg0.field607 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field327.field340[arg0.field602] == 0) {
                    arg0.field604 = class180.method3269(arg0.field588, arg0.field604.method3370(), arg0.field604.method3275(), arg0.field604.method3276());
                } else {
                    arg0.field604 = class180.method3269(arg0.field588, arg0.field604.method3370(), 0, arg0.field604.method3276());
                    this.field327.method592(arg0, arg0.field587.field938[arg0.field591] < 0);
                }
                if (arg0.field587.field938[arg0.field591] < 0) {
                    arg0.field604.method3271(-1);
                }
                arg1 = arg0.field607 / var3;
            }
        }
        arg0.field604.method549(arg1);
    }

    @ObfuscatedName("ea.l()Lab;")
    public class182 method555() {
        class55 var1;
        do {
            var1 = (class55) this.field325.method1106();
            if (var1 == null) {
                return null;
            }
        } while (var1.field604 == null);
        return var1.field604;
    }

    @ObfuscatedName("ea.n()I")
    public int method560() {
        return 0;
    }
}
