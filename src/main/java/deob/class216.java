package deob;

@ObfuscatedName("hr")
public class class216 extends class119 {

    @ObfuscatedName("hr.m")
    public class212 field2677;

    @ObfuscatedName("hr.p")
    public class201 field2678 = new class201();

    @ObfuscatedName("hr.i")
    public class102 field2676 = new class102();

    public class216(class212 arg0) {
        this.field2677 = arg0;
    }

    @ObfuscatedName("hr.x()Ldq;")
    public class119 method1809() {
        class213 var1 = (class213) this.field2678.method3486();
        if (var1 == null) {
            return null;
        } else if (var1.field2646 == null) {
            return this.method1810();
        } else {
            return var1.field2646;
        }
    }

    @ObfuscatedName("hr.e()Ldq;")
    public class119 method1810() {
        class213 var1;
        do {
            var1 = (class213) this.field2678.method3507();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2646 == null);
        return var1.field2646;
    }

    @ObfuscatedName("hr.l()I")
    public int method1811() {
        return 0;
    }

    @ObfuscatedName("hr.b([III)V")
    public void method1812(int[] arg0, int arg1, int arg2) {
        this.field2676.method1812(arg0, arg1, arg2);
        for (class213 var4 = (class213) this.field2678.method3486(); var4 != null; var4 = (class213) this.field2678.method3507()) {
            if (!this.field2677.method3657(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2652) {
                        this.method3740(var4, arg0, var5, var6, var5 + var6);
                        var4.field2652 -= var6;
                        break;
                    }
                    this.method3740(var4, arg0, var5, var4.field2652, var5 + var6);
                    var5 += var4.field2652;
                    var6 -= var4.field2652;
                } while (!this.field2677.method3597(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hr.c(I)V")
    public void method1814(int arg0) {
        this.field2676.method1814(arg0);
        for (class213 var2 = (class213) this.field2678.method3486(); var2 != null; var2 = (class213) this.field2678.method3507()) {
            if (!this.field2677.method3657(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2652) {
                        this.method3745(var2, var3);
                        var2.field2652 -= var3;
                        break;
                    }
                    this.method3745(var2, var2.field2652);
                    var3 -= var2.field2652;
                } while (!this.field2677.method3597(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hr.m(Lhg;[IIIIB)V")
    public void method3740(class213 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2677.field2617[arg0.field2638] & 0x4) != 0 && arg0.field2647 < 0) {
            int var6 = this.field2677.field2614[arg0.field2638] / Statics.field1554;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2653) / var6;
                if (var7 > arg3) {
                    arg0.field2653 += arg3 * var6;
                    break;
                }
                arg0.field2646.method1812(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2653 += var6 * var7 - 1048576;
                int var8 = Statics.field1554 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class117 var10 = arg0.field2646;
                if (this.field2677.field2620[arg0.field2638] == 0) {
                    arg0.field2646 = class117.method2121(arg0.field2643, var10.method2040(), var10.method2036(), var10.method2032());
                } else {
                    arg0.field2646 = class117.method2121(arg0.field2643, var10.method2040(), 0, var10.method2032());
                    this.field2677.method3578(arg0, arg0.field2634.field2670[arg0.field2651] < 0);
                    arg0.field2646.method2122(var8, var10.method2036());
                }
                if (arg0.field2634.field2670[arg0.field2651] < 0) {
                    arg0.field2646.method2027(-1);
                }
                var10.method2038(var8);
                var10.method1812(arg1, arg2, arg4 - arg2);
                if (var10.method2073()) {
                    this.field2676.method1804(var10);
                }
            }
        }
        arg0.field2646.method1812(arg1, arg2, arg3);
    }

    @ObfuscatedName("hr.p(Lhg;II)V")
    public void method3745(class213 arg0, int arg1) {
        if ((this.field2677.field2617[arg0.field2638] & 0x4) != 0 && arg0.field2647 < 0) {
            int var3 = this.field2677.field2614[arg0.field2638] / Statics.field1554;
            int var4 = (var3 + 1048575 - arg0.field2653) / var3;
            arg0.field2653 = arg0.field2653 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2677.field2620[arg0.field2638] == 0) {
                    arg0.field2646 = class117.method2121(arg0.field2643, arg0.field2646.method2040(), arg0.field2646.method2036(), arg0.field2646.method2032());
                } else {
                    arg0.field2646 = class117.method2121(arg0.field2643, arg0.field2646.method2040(), 0, arg0.field2646.method2032());
                    this.field2677.method3578(arg0, arg0.field2634.field2670[arg0.field2651] < 0);
                }
                if (arg0.field2634.field2670[arg0.field2651] < 0) {
                    arg0.field2646.method2027(-1);
                }
                arg1 = arg0.field2653 / var3;
            }
        }
        arg0.field2646.method1814(arg1);
    }
}
