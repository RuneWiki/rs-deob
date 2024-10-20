package deob;

@ObfuscatedName("fe")
public class class177 extends class62 {

    @ObfuscatedName("fe.o")
    public class175 field2892;

    @ObfuscatedName("fe.l")
    public class190 field2894 = new class190();

    @ObfuscatedName("fe.g")
    public class51 field2893 = new class51();

    public class177(class175 arg0) {
        this.field2892 = arg0;
    }

    @ObfuscatedName("fe.r()Lbo;")
    public class62 method1058() {
        class178 var1 = (class178) this.field2894.method3499();
        if (var1 == null) {
            return null;
        } else if (var1.field2915 == null) {
            return this.method1036();
        } else {
            return var1.field2915;
        }
    }

    @ObfuscatedName("fe.v()Lbo;")
    public class62 method1036() {
        class178 var1;
        do {
            var1 = (class178) this.field2894.method3482();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2915 == null);
        return var1.field2915;
    }

    @ObfuscatedName("fe.y()I")
    public int method1031() {
        return 0;
    }

    @ObfuscatedName("fe.k([III)V")
    public void method1037(int[] arg0, int arg1, int arg2) {
        this.field2893.method1037(arg0, arg1, arg2);
        for (class178 var4 = (class178) this.field2894.method3499(); var4 != null; var4 = (class178) this.field2894.method3482()) {
            if (!this.field2892.method3289(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2907) {
                        this.method3386(var4, arg0, var5, var6, var5 + var6);
                        var4.field2907 -= var6;
                        break;
                    }
                    this.method3386(var4, arg0, var5, var4.field2907, var5 + var6);
                    var5 += var4.field2907;
                    var6 -= var4.field2907;
                } while (!this.field2892.method3300(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fe.j(I)V")
    public void method1043(int arg0) {
        this.field2893.method1043(arg0);
        for (class178 var2 = (class178) this.field2894.method3499(); var2 != null; var2 = (class178) this.field2894.method3482()) {
            if (!this.field2892.method3289(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2907) {
                        this.method3390(var2, var3);
                        var2.field2907 -= var3;
                        break;
                    }
                    this.method3390(var2, var2.field2907);
                    var3 -= var2.field2907;
                } while (!this.field2892.method3300(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fe.o(Lfy;[IIIII)V")
    public void method3386(class178 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2892.field2862[arg0.field2916] & 0x4) != 0 && arg0.field2912 < 0) {
            int var6 = this.field2892.field2867[arg0.field2916] / Statics.field1685;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2902) / var6;
                if (var7 > arg3) {
                    arg0.field2902 += arg3 * var6;
                    break;
                }
                arg0.field2915.method1037(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2902 += var6 * var7 - 1048576;
                int var8 = Statics.field1685 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class60 var10 = arg0.field2915;
                if (this.field2892.field2865[arg0.field2916] == 0) {
                    arg0.field2915 = class60.method1185(arg0.field2900, var10.method1200(), var10.method1249(), var10.method1192());
                } else {
                    arg0.field2915 = class60.method1185(arg0.field2900, var10.method1200(), 0, var10.method1192());
                    this.field2892.method3283(arg0, arg0.field2899.field2818[arg0.field2903] < 0);
                    arg0.field2915.method1196(var8, var10.method1249());
                }
                if (arg0.field2899.field2818[arg0.field2903] < 0) {
                    arg0.field2915.method1187(-1);
                }
                var10.method1198(var8);
                var10.method1037(arg1, arg2, arg4 - arg2);
                if (var10.method1202()) {
                    this.field2893.method1026(var10);
                }
            }
        }
        arg0.field2915.method1037(arg1, arg2, arg3);
    }

    @ObfuscatedName("fe.l(Lfy;II)V")
    public void method3390(class178 arg0, int arg1) {
        if ((this.field2892.field2862[arg0.field2916] & 0x4) != 0 && arg0.field2912 < 0) {
            int var3 = this.field2892.field2867[arg0.field2916] / Statics.field1685;
            int var4 = (var3 + 1048575 - arg0.field2902) / var3;
            arg0.field2902 = arg0.field2902 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2892.field2865[arg0.field2916] == 0) {
                    arg0.field2915 = class60.method1185(arg0.field2900, arg0.field2915.method1200(), arg0.field2915.method1249(), arg0.field2915.method1192());
                } else {
                    arg0.field2915 = class60.method1185(arg0.field2900, arg0.field2915.method1200(), 0, arg0.field2915.method1192());
                    this.field2892.method3283(arg0, arg0.field2899.field2818[arg0.field2903] < 0);
                }
                if (arg0.field2899.field2818[arg0.field2903] < 0) {
                    arg0.field2915.method1187(-1);
                }
                arg1 = arg0.field2902 / var3;
            }
        }
        arg0.field2915.method1043(arg1);
    }
}
