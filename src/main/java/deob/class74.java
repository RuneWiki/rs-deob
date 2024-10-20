package deob;

@ObfuscatedName("bf")
public final class class74 extends class78 {

    @ObfuscatedName("bf.n")
    public String field860;

    @ObfuscatedName("bf.v")
    public class225 field858;

    @ObfuscatedName("bf.y")
    public int field837 = -1;

    @ObfuscatedName("bf.r")
    public int field854 = -1;

    @ObfuscatedName("bf.d")
    public String[] field861 = new String[3];

    @ObfuscatedName("bf.s")
    public int field839;

    @ObfuscatedName("bf.b")
    public int field842;

    @ObfuscatedName("bf.e")
    public int field844;

    @ObfuscatedName("bf.f")
    public int field835;

    @ObfuscatedName("bf.z")
    public int field845;

    @ObfuscatedName("bf.u")
    public int field846;

    @ObfuscatedName("bf.p")
    public int field847;

    @ObfuscatedName("bf.w")
    public int field848;

    @ObfuscatedName("bf.t")
    public class133 field849;

    @ObfuscatedName("bf.o")
    public int field850;

    @ObfuscatedName("bf.a")
    public int field851;

    @ObfuscatedName("bf.i")
    public int field852;

    @ObfuscatedName("bf.m")
    public int field853;

    @ObfuscatedName("bf.x")
    public boolean field841;

    @ObfuscatedName("bf.l")
    public int field855;

    @ObfuscatedName("bf.j")
    public boolean field856;

    @ObfuscatedName("bf.g")
    public int field857;

    @ObfuscatedName("bf.c")
    public int field843;

    @ObfuscatedName("bf.k")
    public boolean field859;

    @ObfuscatedName("bf.q")
    public int field840;

    @ObfuscatedName("bf.ac")
    public int field836;

    public class74() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field861[var1] = "";
        }
        this.field839 = 0;
        this.field842 = 0;
        this.field835 = 0;
        this.field845 = 0;
        this.field841 = false;
        this.field855 = 0;
        this.field856 = false;
        this.field859 = false;
    }

    @ObfuscatedName("bf.n(Lgv;I)V")
    public final void method1039(class185 arg0) {
        arg0.field2529 = 0;
        int var2 = arg0.method3021();
        this.field837 = arg0.method3022();
        this.field854 = arg0.method3022();
        int var3 = -1;
        this.field855 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3021();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3021();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3015();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class268.method1985(var4[var5] - 512).field3619;
                    if (var8 != 0) {
                        this.field855 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3021();
            if (var11 < 0 || var11 >= Statics.field2464[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1150 = arg0.method3015();
        if (this.field1150 == 65535) {
            this.field1150 = -1;
        }
        this.field1157 = arg0.method3015();
        if (this.field1157 == 65535) {
            this.field1157 = -1;
        }
        this.field1174 = this.field1157;
        this.field1169 = arg0.method3015();
        if (this.field1169 == 65535) {
            this.field1169 = -1;
        }
        this.field1159 = arg0.method3015();
        if (this.field1159 == 65535) {
            this.field1159 = -1;
        }
        this.field1176 = arg0.method3015();
        if (this.field1176 == 65535) {
            this.field1176 = -1;
        }
        this.field1161 = arg0.method3015();
        if (this.field1161 == 65535) {
            this.field1161 = -1;
        }
        this.field1162 = arg0.method3015();
        if (this.field1162 == 65535) {
            this.field1162 = -1;
        }
        this.field860 = arg0.method3030();
        if (Statics.field289 == this) {
            Statics.field2138 = this.field860;
        }
        this.field839 = arg0.method3021();
        this.field842 = arg0.method3015();
        this.field856 = arg0.method3021() == 1;
        if (client.field995 == 0 && client.field1023 >= 2) {
            this.field856 = false;
        }
        if (this.field858 == null) {
            this.field858 = new class225();
        }
        this.field858.method3793(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bf.v(I)I")
    public int method1052() {
        return this.field858 == null || this.field858.field2734 == -1 ? 1 : class270.method564(this.field858.field2734).field3668;
    }

    @ObfuscatedName("bf.y(B)Les;")
    public final class133 method1047() {
        if (this.field858 == null) {
            return null;
        }
        class272 var1 = this.field1182 != -1 && this.field1185 == 0 ? class272.method579(this.field1182) : null;
        class272 var2 = this.field1179 == -1 || this.field841 || this.field1179 == this.field1150 && var1 != null ? null : class272.method579(this.field1179);
        class133 var3 = this.field858.method3799(var1, this.field1206, var2, this.field1180);
        if (var3 == null) {
            return null;
        }
        var3.method2359();
        this.field1200 = var3.field2026;
        if (!this.field841 && this.field1187 != -1 && this.field1188 != -1) {
            class133 var4 = Statics.method4461(this.field1187).method4116(this.field1188);
            if (var4 != null) {
                var4.method2362(0, -this.field1191, 0);
                class133[] var5 = new class133[] { var3, var4 };
                var3 = new class133(var5, 2);
            }
        }
        if (!this.field841 && this.field849 != null) {
            if (client.field883 >= this.field845) {
                this.field849 = null;
            }
            if (client.field883 >= this.field835 && client.field883 < this.field845) {
                class133 var6 = this.field849;
                var6.method2362(this.field846 - this.field1155, this.field847 - this.field844, this.field848 - this.field1151);
                if (this.field1166 == 512) {
                    var6.method2345();
                    var6.method2345();
                    var6.method2345();
                } else if (this.field1166 == 1024) {
                    var6.method2345();
                    var6.method2345();
                } else if (this.field1166 == 1536) {
                    var6.method2345();
                }
                class133[] var7 = new class133[] { var3, var6 };
                var3 = new class133(var7, 2);
                if (this.field1166 == 512) {
                    var6.method2345();
                } else if (this.field1166 == 1024) {
                    var6.method2345();
                    var6.method2345();
                } else if (this.field1166 == 1536) {
                    var6.method2345();
                    var6.method2345();
                    var6.method2345();
                }
                var6.method2362(this.field1155 - this.field846, this.field844 - this.field847, this.field1151 - this.field848);
            }
        }
        var3.field1855 = true;
        return var3;
    }

    @ObfuscatedName("bf.r(IIBI)V")
    public final void method1054(int arg0, int arg1, byte arg2) {
        if (this.field1182 != -1 && class272.method579(this.field1182).field3701 == 1) {
            this.field1182 = -1;
        }
        this.field1178 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1057(arg0, arg1);
        } else if (this.field1199[0] >= 0 && this.field1199[0] < 104 && this.field1164[0] >= 0 && this.field1164[0] < 104) {
            if (arg2 == 2) {
                client.method1661(this, arg0, arg1, (byte) 2);
            }
            this.method1043(arg0, arg1, arg2);
        } else {
            this.method1057(arg0, arg1);
        }
    }

    @ObfuscatedName("bf.h(III)V")
    public void method1057(int arg0, int arg1) {
        this.field1204 = 0;
        this.field1209 = 0;
        this.field1208 = 0;
        this.field1199[0] = arg0;
        this.field1164[0] = arg1;
        int var3 = this.method1052();
        this.field1155 = this.field1199[0] * 128 + var3 * 64;
        this.field1151 = this.field1164[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bf.d(IIBI)V")
    public final void method1043(int arg0, int arg1, byte arg2) {
        if (this.field1204 < 9) {
            this.field1204++;
        }
        for (int var4 = this.field1204; var4 > 0; var4--) {
            this.field1199[var4] = this.field1199[var4 - 1];
            this.field1164[var4] = this.field1164[var4 - 1];
            this.field1152[var4] = this.field1152[var4 - 1];
        }
        this.field1199[0] = arg0;
        this.field1164[0] = arg1;
        this.field1152[0] = arg2;
    }

    @ObfuscatedName("bf.s(I)Z")
    public final boolean method1044() {
        return this.field858 != null;
    }
}
