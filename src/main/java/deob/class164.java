package deob;

@ObfuscatedName("fq")
public class class164 extends class60 {

    @ObfuscatedName("fq.t")
    public class162 field2762;

    @ObfuscatedName("fq.s")
    public class177 field2761 = new class177();

    @ObfuscatedName("fq.f")
    public class49 field2764 = new class49();

    public class164(class162 arg0) {
        this.field2762 = arg0;
    }

    @ObfuscatedName("fq.n()Lbe;")
    public class60 method929() {
        class165 var1 = (class165) this.field2761.method3239();
        if (var1 == null) {
            return null;
        } else if (var1.field2785 == null) {
            return this.method928();
        } else {
            return var1.field2785;
        }
    }

    @ObfuscatedName("fq.v()Lbe;")
    public class60 method928() {
        class165 var1;
        do {
            var1 = (class165) this.field2761.method3248();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2785 == null);
        return var1.field2785;
    }

    @ObfuscatedName("fq.z()I")
    public int method931() {
        return 0;
    }

    @ObfuscatedName("fq.j([III)V")
    public void method932(int[] arg0, int arg1, int arg2) {
        this.field2764.method932(arg0, arg1, arg2);
        for (class165 var4 = (class165) this.field2761.method3239(); var4 != null; var4 = (class165) this.field2761.method3248()) {
            if (!this.field2762.method3133(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2786) {
                        this.method3144(var4, arg0, var5, var6, var5 + var6);
                        var4.field2786 -= var6;
                        break;
                    }
                    this.method3144(var4, arg0, var5, var4.field2786, var5 + var6);
                    var5 += var4.field2786;
                    var6 -= var4.field2786;
                } while (!this.field2762.method3061(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fq.g(I)V")
    public void method934(int arg0) {
        this.field2764.method934(arg0);
        for (class165 var2 = (class165) this.field2761.method3239(); var2 != null; var2 = (class165) this.field2761.method3248()) {
            if (!this.field2762.method3133(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2786) {
                        this.method3145(var2, var3);
                        var2.field2786 -= var3;
                        break;
                    }
                    this.method3145(var2, var2.field2786);
                    var3 -= var2.field2786;
                } while (!this.field2762.method3061(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fq.t(Lfw;[IIIIB)V")
    public void method3144(class165 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2762.field2720[arg0.field2788] & 0x4) != 0 && arg0.field2781 < 0) {
            int var6 = this.field2762.field2746[arg0.field2788] / Statics.field1085;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2778) / var6;
                if (var7 > arg3) {
                    arg0.field2778 += arg3 * var6;
                    break;
                }
                arg0.field2785.method932(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2778 += var6 * var7 - 1048576;
                int var8 = Statics.field1085 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2785;
                if (this.field2762.field2732[arg0.field2788] == 0) {
                    arg0.field2785 = class58.method1073(arg0.field2769, var10.method1078(), var10.method1200(), var10.method1080());
                } else {
                    arg0.field2785 = class58.method1073(arg0.field2769, var10.method1078(), 0, var10.method1080());
                    this.field2762.method3043(arg0, arg0.field2768.field2682[arg0.field2772] < 0);
                    arg0.field2785.method1170(var8, var10.method1200());
                }
                if (arg0.field2768.field2682[arg0.field2772] < 0) {
                    arg0.field2785.method1075(-1);
                }
                var10.method1086(var8);
                var10.method932(arg1, arg2, arg4 - arg2);
                if (var10.method1090()) {
                    this.field2764.method924(var10);
                }
            }
        }
        arg0.field2785.method932(arg1, arg2, arg3);
    }

    @ObfuscatedName("fq.s(Lfw;II)V")
    public void method3145(class165 arg0, int arg1) {
        if ((this.field2762.field2720[arg0.field2788] & 0x4) != 0 && arg0.field2781 < 0) {
            int var3 = this.field2762.field2746[arg0.field2788] / Statics.field1085;
            int var4 = (var3 + 1048575 - arg0.field2778) / var3;
            arg0.field2778 = arg0.field2778 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2762.field2732[arg0.field2788] == 0) {
                    arg0.field2785 = class58.method1073(arg0.field2769, arg0.field2785.method1078(), arg0.field2785.method1200(), arg0.field2785.method1080());
                } else {
                    arg0.field2785 = class58.method1073(arg0.field2769, arg0.field2785.method1078(), 0, arg0.field2785.method1080());
                    this.field2762.method3043(arg0, arg0.field2768.field2682[arg0.field2772] < 0);
                }
                if (arg0.field2768.field2682[arg0.field2772] < 0) {
                    arg0.field2785.method1075(-1);
                }
                arg1 = arg0.field2778 / var3;
            }
        }
        arg0.field2785.method934(arg1);
    }
}
