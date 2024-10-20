package deob;

@ObfuscatedName("bc")
public final class class72 extends class75 {

    @ObfuscatedName("bc.p")
    public class281 field787;

    @ObfuscatedName("bc.i")
    public class225 field788;

    @ObfuscatedName("bc.w")
    public int field789 = -1;

    @ObfuscatedName("bc.s")
    public int field790 = -1;

    @ObfuscatedName("bc.a")
    public String[] field803 = new String[3];

    @ObfuscatedName("bc.t")
    public int field793;

    @ObfuscatedName("bc.r")
    public int field816;

    @ObfuscatedName("bc.m")
    public int field800;

    @ObfuscatedName("bc.h")
    public int field796;

    @ObfuscatedName("bc.o")
    public int field797;

    @ObfuscatedName("bc.x")
    public int field798;

    @ObfuscatedName("bc.q")
    public int field792;

    @ObfuscatedName("bc.v")
    public int field807;

    @ObfuscatedName("bc.n")
    public class131 field801;

    @ObfuscatedName("bc.y")
    public int field802;

    @ObfuscatedName("bc.d")
    public int field805;

    @ObfuscatedName("bc.l")
    public int field804;

    @ObfuscatedName("bc.f")
    public int field817;

    @ObfuscatedName("bc.k")
    public boolean field806;

    @ObfuscatedName("bc.e")
    public int field799;

    @ObfuscatedName("bc.u")
    public boolean field808;

    @ObfuscatedName("bc.g")
    public int field809;

    @ObfuscatedName("bc.z")
    public int field810;

    @ObfuscatedName("bc.b")
    public class279 field811;

    @ObfuscatedName("bc.c")
    public class279 field812;

    @ObfuscatedName("bc.aa")
    public boolean field813;

    @ObfuscatedName("bc.ap")
    public int field814;

    @ObfuscatedName("bc.ao")
    public int field815;

    public class72() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field803[var1] = "";
        }
        this.field793 = 0;
        this.field816 = 0;
        this.field796 = 0;
        this.field797 = 0;
        this.field806 = false;
        this.field799 = 0;
        this.field808 = false;
        this.field811 = class279.field3691;
        this.field812 = class279.field3691;
        this.field813 = false;
    }

    @ObfuscatedName("bc.p(Lgj;I)V")
    public final void method1072(class185 arg0) {
        arg0.field2488 = 0;
        int var2 = arg0.method3197();
        this.field789 = arg0.method3123();
        this.field790 = arg0.method3123();
        int var3 = -1;
        this.field799 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3197();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3197();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3124();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class268.method1489(var4[var5] - 512).field3552;
                    if (var8 != 0) {
                        this.field799 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3197();
            if (var11 < 0 || var11 >= Statics.field785[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1103 = arg0.method3124();
        if (this.field1103 == 65535) {
            this.field1103 = -1;
        }
        this.field1107 = arg0.method3124();
        if (this.field1107 == 65535) {
            this.field1107 = -1;
        }
        this.field1150 = this.field1107;
        this.field1106 = arg0.method3124();
        if (this.field1106 == 65535) {
            this.field1106 = -1;
        }
        this.field1145 = arg0.method3124();
        if (this.field1145 == 65535) {
            this.field1145 = -1;
        }
        this.field1105 = arg0.method3124();
        if (this.field1105 == 65535) {
            this.field1105 = -1;
        }
        this.field1109 = arg0.method3124();
        if (this.field1109 == 65535) {
            this.field1109 = -1;
        }
        this.field1110 = arg0.method3124();
        if (this.field1110 == 65535) {
            this.field1110 = -1;
        }
        this.field787 = new class281(arg0.method3131(), Statics.field459);
        this.method1039();
        this.method1042();
        if (Statics.field470 == this) {
            Statics.field2099 = this.field787.method4758();
        }
        this.field793 = arg0.method3197();
        this.field816 = arg0.method3124();
        this.field808 = arg0.method3197() == 1;
        if (client.field958 == 0 && client.field957 >= 2) {
            this.field808 = false;
        }
        if (this.field788 == null) {
            this.field788 = new class225();
        }
        this.field788.method3889(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bc.i(B)Z")
    public boolean method1038() {
        if (class279.field3691 == this.field811) {
            this.method1040();
        }
        return class279.field3692 == this.field811;
    }

    @ObfuscatedName("bc.w(I)V")
    public void method1039() {
        this.field811 = class279.field3691;
    }

    @ObfuscatedName("bc.s(I)V")
    public void method1040() {
        this.field811 = Statics.field2282.field1192.method4684(this.field787) ? class279.field3692 : class279.field3693;
    }

    @ObfuscatedName("bc.j(B)Z")
    public boolean method1054() {
        if (class279.field3691 == this.field812) {
            this.method1043();
        }
        return class279.field3692 == this.field812;
    }

    @ObfuscatedName("bc.a(B)V")
    public void method1042() {
        this.field812 = class279.field3691;
    }

    @ObfuscatedName("bc.t(I)V")
    public void method1043() {
        this.field812 = Statics.field2926 != null && Statics.field2926.method4684(this.field787) ? class279.field3692 : class279.field3693;
    }

    @ObfuscatedName("bc.r(I)I")
    public int method1049() {
        return this.field788 == null || this.field788.field2706 == -1 ? 1 : class270.method4001(this.field788.field2706).field3612;
    }

    @ObfuscatedName("bc.m(I)Len;")
    public final class131 method1045() {
        if (this.field788 == null) {
            return null;
        }
        class272 var1 = this.field1130 != -1 && this.field1101 == 0 ? class272.method2308(this.field1130) : null;
        class272 var2 = this.field1127 == -1 || this.field806 || this.field1127 == this.field1103 && var1 != null ? null : class272.method2308(this.field1127);
        class131 var3 = this.field788.method3895(var1, this.field1098, var2, this.field1118);
        if (var3 == null) {
            return null;
        }
        var3.method2484();
        this.field1148 = var3.field1998;
        if (!this.field806 && this.field1135 != -1 && this.field1136 != -1) {
            class131 var4 = class257.method82(this.field1135).method4252(this.field1136);
            if (var4 != null) {
                var4.method2476(0, -this.field1139, 0);
                class131[] var5 = new class131[] { var3, var4 };
                var3 = new class131(var5, 2);
            }
        }
        if (!this.field806 && this.field801 != null) {
            if (client.field832 >= this.field797) {
                this.field801 = null;
            }
            if (client.field832 >= this.field796 && client.field832 < this.field797) {
                class131 var6 = this.field801;
                var6.method2476(this.field798 - this.field1152, this.field792 - this.field800, this.field807 - this.field1117);
                if (this.field1149 == 512) {
                    var6.method2472();
                    var6.method2472();
                    var6.method2472();
                } else if (this.field1149 == 1024) {
                    var6.method2472();
                    var6.method2472();
                } else if (this.field1149 == 1536) {
                    var6.method2472();
                }
                class131[] var7 = new class131[] { var3, var6 };
                var3 = new class131(var7, 2);
                if (this.field1149 == 512) {
                    var6.method2472();
                } else if (this.field1149 == 1024) {
                    var6.method2472();
                    var6.method2472();
                } else if (this.field1149 == 1536) {
                    var6.method2472();
                    var6.method2472();
                    var6.method2472();
                }
                var6.method2476(this.field1152 - this.field798, this.field800 - this.field792, this.field1117 - this.field807);
            }
        }
        var3.field1826 = true;
        return var3;
    }

    @ObfuscatedName("bc.h(IIBS)V")
    public final void method1037(int arg0, int arg1, byte arg2) {
        if (this.field1130 != -1 && class272.method2308(this.field1130).field3672 == 1) {
            this.field1130 = -1;
        }
        this.field1126 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1047(arg0, arg1);
        } else if (this.field1153[0] >= 0 && this.field1153[0] < 104 && this.field1154[0] >= 0 && this.field1154[0] < 104) {
            if (arg2 == 2) {
                client.method4741(this, arg0, arg1, (byte) 2);
            }
            this.method1060(arg0, arg1, arg2);
        } else {
            this.method1047(arg0, arg1);
        }
    }

    @ObfuscatedName("bc.o(III)V")
    public void method1047(int arg0, int arg1) {
        this.field1099 = 0;
        this.field1157 = 0;
        this.field1137 = 0;
        this.field1153[0] = arg0;
        this.field1154[0] = arg1;
        int var3 = this.method1049();
        this.field1152 = this.field1153[0] * 128 + var3 * 64;
        this.field1117 = this.field1154[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bc.x(IIBB)V")
    public final void method1060(int arg0, int arg1, byte arg2) {
        if (this.field1099 < 9) {
            this.field1099++;
        }
        for (int var4 = this.field1099; var4 > 0; var4--) {
            this.field1153[var4] = this.field1153[var4 - 1];
            this.field1154[var4] = this.field1154[var4 - 1];
            this.field1155[var4] = this.field1155[var4 - 1];
        }
        this.field1153[0] = arg0;
        this.field1154[0] = arg1;
        this.field1155[0] = arg2;
    }

    @ObfuscatedName("bc.q(I)Z")
    public final boolean method1048() {
        return this.field788 != null;
    }
}
