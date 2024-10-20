package deob;

@ObfuscatedName("fp")
public class class176 extends class62 {

    @ObfuscatedName("fp.q")
    public class174 field2847;

    @ObfuscatedName("fp.s")
    public class189 field2845 = new class189();

    @ObfuscatedName("fp.h")
    public class51 field2846 = new class51();

    public class176(class174 arg0) {
        this.field2847 = arg0;
    }

    @ObfuscatedName("fp.t()Lba;")
    public class62 method984() {
        class177 var1 = (class177) this.field2845.method3309();
        if (var1 == null) {
            return null;
        } else if (var1.field2868 == null) {
            return this.method971();
        } else {
            return var1.field2868;
        }
    }

    @ObfuscatedName("fp.l()Lba;")
    public class62 method971() {
        class177 var1;
        do {
            var1 = (class177) this.field2845.method3311();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2868 == null);
        return var1.field2868;
    }

    @ObfuscatedName("fp.m()I")
    public int method997() {
        return 0;
    }

    @ObfuscatedName("fp.o([III)V")
    public void method973(int[] arg0, int arg1, int arg2) {
        this.field2846.method973(arg0, arg1, arg2);
        for (class177 var4 = (class177) this.field2845.method3309(); var4 != null; var4 = (class177) this.field2845.method3311()) {
            if (!this.field2847.method3215(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2869) {
                        this.method3224(var4, arg0, var5, var6, var5 + var6);
                        var4.field2869 -= var6;
                        break;
                    }
                    this.method3224(var4, arg0, var5, var4.field2869, var5 + var6);
                    var5 += var4.field2869;
                    var6 -= var4.field2869;
                } while (!this.field2847.method3154(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fp.p(I)V")
    public void method975(int arg0) {
        this.field2846.method975(arg0);
        for (class177 var2 = (class177) this.field2845.method3309(); var2 != null; var2 = (class177) this.field2845.method3311()) {
            if (!this.field2847.method3215(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2869) {
                        this.method3223(var2, var3);
                        var2.field2869 -= var3;
                        break;
                    }
                    this.method3223(var2, var2.field2869);
                    var3 -= var2.field2869;
                } while (!this.field2847.method3154(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fp.q(Lfr;[IIIII)V")
    public void method3224(class177 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2847.field2811[arg0.field2864] & 0x4) != 0 && arg0.field2863 < 0) {
            int var6 = this.field2847.field2818[arg0.field2864] / Statics.field3011;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2870) / var6;
                if (var7 > arg3) {
                    arg0.field2870 += arg3 * var6;
                    break;
                }
                arg0.field2868.method973(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2870 += var6 * var7 - 1048576;
                int var8 = Statics.field3011 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class60 var10 = arg0.field2868;
                if (this.field2847.field2800[arg0.field2864] == 0) {
                    arg0.field2868 = class60.method1238(arg0.field2856, var10.method1102(), var10.method1140(), var10.method1231());
                } else {
                    arg0.field2868 = class60.method1238(arg0.field2856, var10.method1102(), 0, var10.method1231());
                    this.field2847.method3136(arg0, arg0.field2851.field2769[arg0.field2861] < 0);
                    arg0.field2868.method1117(var8, var10.method1140());
                }
                if (arg0.field2851.field2769[arg0.field2861] < 0) {
                    arg0.field2868.method1192(-1);
                }
                var10.method1222(var8);
                var10.method973(arg1, arg2, arg4 - arg2);
                if (var10.method1122()) {
                    this.field2846.method990(var10);
                }
            }
        }
        arg0.field2868.method973(arg1, arg2, arg3);
    }

    @ObfuscatedName("fp.s(Lfr;II)V")
    public void method3223(class177 arg0, int arg1) {
        if ((this.field2847.field2811[arg0.field2864] & 0x4) != 0 && arg0.field2863 < 0) {
            int var3 = this.field2847.field2818[arg0.field2864] / Statics.field3011;
            int var4 = (var3 + 1048575 - arg0.field2870) / var3;
            arg0.field2870 = arg0.field2870 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2847.field2800[arg0.field2864] == 0) {
                    arg0.field2868 = class60.method1238(arg0.field2856, arg0.field2868.method1102(), arg0.field2868.method1140(), arg0.field2868.method1231());
                } else {
                    arg0.field2868 = class60.method1238(arg0.field2856, arg0.field2868.method1102(), 0, arg0.field2868.method1231());
                    this.field2847.method3136(arg0, arg0.field2851.field2769[arg0.field2861] < 0);
                }
                if (arg0.field2851.field2769[arg0.field2861] < 0) {
                    arg0.field2868.method1192(-1);
                }
                arg1 = arg0.field2870 / var3;
            }
        }
        arg0.field2868.method975(arg1);
    }
}
