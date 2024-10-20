package deob;

@ObfuscatedName("bl")
public final class class72 extends class75 {

    @ObfuscatedName("bl.b")
    public class292 field800;

    @ObfuscatedName("bl.q")
    public class234 field781;

    @ObfuscatedName("bl.o")
    public int field783 = -1;

    @ObfuscatedName("bl.p")
    public int field804 = -1;

    @ObfuscatedName("bl.h")
    public String[] field786 = new String[3];

    @ObfuscatedName("bl.l")
    public int field787;

    @ObfuscatedName("bl.y")
    public int field788;

    @ObfuscatedName("bl.g")
    public int field798;

    @ObfuscatedName("bl.c")
    public int field790;

    @ObfuscatedName("bl.u")
    public int field791;

    @ObfuscatedName("bl.r")
    public int field799;

    @ObfuscatedName("bl.d")
    public int field793;

    @ObfuscatedName("bl.v")
    public int field794;

    @ObfuscatedName("bl.s")
    public class131 field795;

    @ObfuscatedName("bl.t")
    public int field782;

    @ObfuscatedName("bl.f")
    public int field797;

    @ObfuscatedName("bl.m")
    public int field785;

    @ObfuscatedName("bl.x")
    public int field796;

    @ObfuscatedName("bl.w")
    public boolean field789;

    @ObfuscatedName("bl.j")
    public int field801;

    @ObfuscatedName("bl.z")
    public boolean field802;

    @ObfuscatedName("bl.e")
    public int field803;

    @ObfuscatedName("bl.k")
    public int field809;

    @ObfuscatedName("bl.n")
    public class290 field805;

    @ObfuscatedName("bl.i")
    public class290 field806;

    @ObfuscatedName("bl.av")
    public boolean field807;

    @ObfuscatedName("bl.ao")
    public int field808;

    @ObfuscatedName("bl.am")
    public int field792;

    public class72() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field786[var1] = "";
        }
        this.field787 = 0;
        this.field788 = 0;
        this.field790 = 0;
        this.field791 = 0;
        this.field789 = false;
        this.field801 = 0;
        this.field802 = false;
        this.field805 = class290.field3724;
        this.field806 = class290.field3724;
        this.field807 = false;
    }

    @ObfuscatedName("bl.b(Lgn;B)V")
    public final void method1098(class194 arg0) {
        arg0.field2538 = 0;
        int var2 = arg0.method3247();
        this.field783 = arg0.method3248();
        this.field804 = arg0.method3248();
        int var3 = -1;
        this.field801 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3247();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3247();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3249();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class277.method1730(var4[var5] - 512).field3617;
                    if (var8 != 0) {
                        this.field801 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3247();
            if (var11 < 0 || var11 >= Statics.field2751[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1097 = arg0.method3249();
        if (this.field1097 == 65535) {
            this.field1097 = -1;
        }
        this.field1101 = arg0.method3249();
        if (this.field1101 == 65535) {
            this.field1101 = -1;
        }
        this.field1102 = this.field1101;
        this.field1103 = arg0.method3249();
        if (this.field1103 == 65535) {
            this.field1103 = -1;
        }
        this.field1100 = arg0.method3249();
        if (this.field1100 == 65535) {
            this.field1100 = -1;
        }
        this.field1131 = arg0.method3249();
        if (this.field1131 == 65535) {
            this.field1131 = -1;
        }
        this.field1106 = arg0.method3249();
        if (this.field1106 == 65535) {
            this.field1106 = -1;
        }
        this.field1107 = arg0.method3249();
        if (this.field1107 == 65535) {
            this.field1107 = -1;
        }
        this.field800 = new class292(arg0.method3256(), Statics.field2759);
        this.method1117();
        this.method1089();
        if (Statics.field818 == this) {
            Statics.field2145 = this.field800.method4926();
        }
        this.field787 = arg0.method3247();
        this.field788 = arg0.method3249();
        this.field802 = arg0.method3247() == 1;
        if (client.field824 == 0 && client.field907 >= 2) {
            this.field802 = false;
        }
        if (this.field781 == null) {
            this.field781 = new class234();
        }
        this.field781.method4044(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bl.q(I)Z")
    public boolean method1085() {
        if (class290.field3724 == this.field805) {
            this.method1099();
        }
        return class290.field3723 == this.field805;
    }

    @ObfuscatedName("bl.o(S)V")
    public void method1117() {
        this.field805 = class290.field3724;
    }

    @ObfuscatedName("bl.p(I)V")
    public void method1099() {
        this.field805 = Statics.field1278.field1195.method4829(this.field800) ? class290.field3723 : class290.field3727;
    }

    @ObfuscatedName("bl.a(I)Z")
    public boolean method1088() {
        if (class290.field3724 == this.field806) {
            this.method1121();
        }
        return class290.field3723 == this.field806;
    }

    @ObfuscatedName("bl.h(I)V")
    public void method1089() {
        this.field806 = class290.field3724;
    }

    @ObfuscatedName("bl.l(I)V")
    public void method1121() {
        this.field806 = Statics.field14 != null && Statics.field14.method4829(this.field800) ? class290.field3723 : class290.field3727;
    }

    @ObfuscatedName("bl.y(I)I")
    public int method1091() {
        return this.field781 == null || this.field781.field2747 == -1 ? 1 : class279.method2487(this.field781.field2747).field3662;
    }

    @ObfuscatedName("bl.g(I)Lee;")
    public final class131 method1092() {
        if (this.field781 == null) {
            return null;
        }
        class281 var1 = this.field1127 != -1 && this.field1130 == 0 ? class281.method2838(this.field1127) : null;
        class281 var2 = this.field1124 == -1 || this.field789 || this.field1124 == this.field1097 && var1 != null ? null : class281.method2838(this.field1124);
        class131 var3 = this.field781.method4050(var1, this.field1128, var2, this.field1125);
        if (var3 == null) {
            return null;
        }
        var3.method2495();
        this.field1132 = var3.field1996;
        if (!this.field789 && this.field1108 != -1 && this.field1105 != -1) {
            class131 var4 = class266.method3059(this.field1108).method4392(this.field1105);
            if (var4 != null) {
                var4.method2522(0, -this.field1136, 0);
                class131[] var5 = new class131[] { var3, var4 };
                var3 = new class131(var5, 2);
            }
        }
        if (!this.field789 && this.field795 != null) {
            if (client.field830 >= this.field791) {
                this.field795 = null;
            }
            if (client.field830 >= this.field790 && client.field830 < this.field791) {
                class131 var6 = this.field795;
                var6.method2522(this.field799 - this.field1133, this.field793 - this.field798, this.field794 - this.field1096);
                if (this.field1146 == 512) {
                    var6.method2502();
                    var6.method2502();
                    var6.method2502();
                } else if (this.field1146 == 1024) {
                    var6.method2502();
                    var6.method2502();
                } else if (this.field1146 == 1536) {
                    var6.method2502();
                }
                class131[] var7 = new class131[] { var3, var6 };
                var3 = new class131(var7, 2);
                if (this.field1146 == 512) {
                    var6.method2502();
                } else if (this.field1146 == 1024) {
                    var6.method2502();
                    var6.method2502();
                } else if (this.field1146 == 1536) {
                    var6.method2502();
                    var6.method2502();
                    var6.method2502();
                }
                var6.method2522(this.field1133 - this.field799, this.field798 - this.field793, this.field1096 - this.field794);
            }
        }
        var3.field1828 = true;
        return var3;
    }

    @ObfuscatedName("bl.c(IIBI)V")
    public final void method1093(int arg0, int arg1, byte arg2) {
        if (this.field1127 != -1 && class281.method2838(this.field1127).field3696 == 1) {
            this.field1127 = -1;
        }
        this.field1123 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1094(arg0, arg1);
        } else if (this.field1150[0] >= 0 && this.field1150[0] < 104 && this.field1151[0] >= 0 && this.field1151[0] < 104) {
            if (arg2 == 2) {
                client.method1026(this, arg0, arg1, (byte) 2);
            }
            this.method1095(arg0, arg1, arg2);
        } else {
            this.method1094(arg0, arg1);
        }
    }

    @ObfuscatedName("bl.u(III)V")
    public void method1094(int arg0, int arg1) {
        this.field1149 = 0;
        this.field1154 = 0;
        this.field1129 = 0;
        this.field1150[0] = arg0;
        this.field1151[0] = arg1;
        int var3 = this.method1091();
        this.field1133 = this.field1150[0] * 128 + var3 * 64;
        this.field1096 = this.field1151[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bl.t(IIBI)V")
    public final void method1095(int arg0, int arg1, byte arg2) {
        if (this.field1149 < 9) {
            this.field1149++;
        }
        for (int var4 = this.field1149; var4 > 0; var4--) {
            this.field1150[var4] = this.field1150[var4 - 1];
            this.field1151[var4] = this.field1151[var4 - 1];
            this.field1153[var4] = this.field1153[var4 - 1];
        }
        this.field1150[0] = arg0;
        this.field1151[0] = arg1;
        this.field1153[0] = arg2;
    }

    @ObfuscatedName("bl.f(B)Z")
    public final boolean method1096() {
        return this.field781 != null;
    }
}
