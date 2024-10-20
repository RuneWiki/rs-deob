package deob;

@ObfuscatedName("aa")
public class class31 extends class174 {

    @ObfuscatedName("aa.d")
    public static class170 field783 = new class170(64);

    @ObfuscatedName("aa.x")
    public static class170 field762 = new class170(50);

    @ObfuscatedName("aa.o")
    public int field772;

    @ObfuscatedName("aa.a")
    public String field763 = "null";

    @ObfuscatedName("aa.w")
    public int field786 = 1;

    @ObfuscatedName("aa.i")
    public int[] field765;

    @ObfuscatedName("aa.y")
    public int[] field766;

    @ObfuscatedName("aa.m")
    public int field764 = -1;

    @ObfuscatedName("aa.u")
    public int field768 = -1;

    @ObfuscatedName("aa.s")
    public int field769 = -1;

    @ObfuscatedName("aa.e")
    public int field788 = -1;

    @ObfuscatedName("aa.r")
    public int field771 = -1;

    @ObfuscatedName("aa.n")
    public int field770 = -1;

    @ObfuscatedName("aa.g")
    public int field773 = -1;

    @ObfuscatedName("aa.c")
    public short[] field774;

    @ObfuscatedName("aa.v")
    public short[] field758;

    @ObfuscatedName("aa.b")
    public short[] field776;

    @ObfuscatedName("aa.k")
    public short[] field777;

    @ObfuscatedName("aa.t")
    public String[] field778 = new String[5];

    @ObfuscatedName("aa.f")
    public boolean field767 = true;

    @ObfuscatedName("aa.h")
    public int field780 = -1;

    @ObfuscatedName("aa.j")
    public int field781 = 128;

    @ObfuscatedName("aa.q")
    public int field782 = 128;

    @ObfuscatedName("aa.z")
    public boolean field791 = false;

    @ObfuscatedName("aa.af")
    public int field784 = 0;

    @ObfuscatedName("aa.ap")
    public int field785 = 0;

    @ObfuscatedName("aa.ah")
    public int field775 = -1;

    @ObfuscatedName("aa.at")
    public int field787 = 32;

    @ObfuscatedName("aa.aa")
    public int[] field779;

    @ObfuscatedName("aa.ae")
    public int field761 = -1;

    @ObfuscatedName("aa.aw")
    public int field790 = -1;

    @ObfuscatedName("aa.ar")
    public boolean field759 = true;

    @ObfuscatedName("aa.ai")
    public boolean field792 = true;

    @ObfuscatedName("dg.p(II)Laa;")
    public static class31 method2231(int arg0) {
        class31 var1 = (class31) field783.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field760.method3078(9, arg0);
        class31 var3 = new class31();
        var3.field772 = arg0;
        if (var2 != null) {
            var3.method604(new class127(var2));
        }
        var3.method617();
        field783.method3364(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.l(I)V")
    public void method617() {
    }

    @ObfuscatedName("aa.d(Lds;I)V")
    public void method604(class127 arg0) {
        while (true) {
            int var2 = arg0.method2498();
            if (var2 == 0) {
                return;
            }
            this.method608(arg0, var2);
        }
    }

    @ObfuscatedName("aa.x(Lds;II)V")
    public void method608(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2498();
            this.field765 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field765[var4] = arg0.method2581();
            }
        } else if (arg1 == 2) {
            this.field763 = arg0.method2506();
        } else if (arg1 == 12) {
            this.field786 = arg0.method2498();
        } else if (arg1 == 13) {
            this.field764 = arg0.method2581();
        } else if (arg1 == 14) {
            this.field788 = arg0.method2581();
        } else if (arg1 == 15) {
            this.field768 = arg0.method2581();
        } else if (arg1 == 16) {
            this.field769 = arg0.method2581();
        } else if (arg1 == 17) {
            this.field788 = arg0.method2581();
            this.field771 = arg0.method2581();
            this.field770 = arg0.method2581();
            this.field773 = arg0.method2581();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field778[arg1 - 30] = arg0.method2506();
            if (this.field778[arg1 - 30].equalsIgnoreCase(class135.field2210)) {
                this.field778[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2498();
            this.field774 = new short[var5];
            this.field758 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field774[var6] = (short) arg0.method2581();
                this.field758[var6] = (short) arg0.method2581();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2498();
            this.field776 = new short[var7];
            this.field777 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field776[var8] = (short) arg0.method2581();
                this.field777[var8] = (short) arg0.method2581();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2498();
            this.field766 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field766[var10] = arg0.method2581();
            }
        } else if (arg1 == 93) {
            this.field767 = false;
        } else if (arg1 == 95) {
            this.field780 = arg0.method2581();
        } else if (arg1 == 97) {
            this.field781 = arg0.method2581();
        } else if (arg1 == 98) {
            this.field782 = arg0.method2581();
        } else if (arg1 == 99) {
            this.field791 = true;
        } else if (arg1 == 100) {
            this.field784 = arg0.method2499();
        } else if (arg1 == 101) {
            this.field785 = arg0.method2499();
        } else if (arg1 == 102) {
            this.field775 = arg0.method2581();
        } else if (arg1 == 103) {
            this.field787 = arg0.method2581();
        } else if (arg1 == 106) {
            this.field761 = arg0.method2581();
            if (this.field761 == 65535) {
                this.field761 = -1;
            }
            this.field790 = arg0.method2581();
            if (this.field790 == 65535) {
                this.field790 = -1;
            }
            int var11 = arg0.method2498();
            this.field779 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field779[var12] = arg0.method2581();
                if (this.field779[var12] == 65535) {
                    this.field779[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field759 = false;
        } else if (arg1 == 109) {
            this.field792 = false;
        }
    }

    @ObfuscatedName("aa.o(Lar;ILar;IS)Ldl;")
    public final class112 method606(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field779 != null) {
            class31 var5 = this.method626();
            return var5 == null ? null : var5.method606(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field762.method3357((long) this.field772);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field765.length; var8++) {
                if (!Statics.field789.method3080(this.field765[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field765.length];
            for (int var10 = 0; var10 < this.field765.length; var10++) {
                var9[var10] = class101.method2098(Statics.field789, this.field765[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field774 != null) {
                for (int var12 = 0; var12 < this.field774.length; var12++) {
                    var11.method2097(this.field774[var12], this.field758[var12]);
                }
            }
            if (this.field776 != null) {
                for (int var13 = 0; var13 < this.field776.length; var13++) {
                    var11.method2138(this.field776[var13], this.field777[var13]);
                }
            }
            var6 = var11.method2084(this.field784 + 64, this.field785 * 5 + 850, -30, -50, -30);
            field762.method3364(var6, (long) this.field772);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method713(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method710(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2271(true);
        } else {
            var14 = arg2.method710(var6, arg3);
        }
        if (this.field781 != 128 || this.field782 != 128) {
            var14.method2284(this.field781, this.field782, this.field781);
        }
        return var14;
    }

    @ObfuscatedName("aa.a(B)Lcm;")
    public final class101 method627() {
        if (this.field779 != null) {
            class31 var1 = this.method626();
            return var1 == null ? null : var1.method627();
        } else if (this.field766 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field766.length; var3++) {
                if (!Statics.field789.method3080(this.field766[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field766.length];
            for (int var5 = 0; var5 < this.field766.length; var5++) {
                var4[var5] = class101.method2098(Statics.field789, this.field766[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field774 != null) {
                for (int var7 = 0; var7 < this.field774.length; var7++) {
                    var6.method2097(this.field774[var7], this.field758[var7]);
                }
            }
            if (this.field776 != null) {
                for (int var8 = 0; var8 < this.field776.length; var8++) {
                    var6.method2138(this.field776[var8], this.field777[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aa.w(I)Laa;")
    public final class31 method626() {
        int var1 = -1;
        if (this.field761 != -1) {
            var1 = class160.method905(this.field761);
        } else if (this.field790 != -1) {
            var1 = class160.field2725[this.field790];
        }
        return var1 < 0 || var1 >= this.field779.length || this.field779[var1] == -1 ? null : method2231(this.field779[var1]);
    }

    @ObfuscatedName("aa.i(I)Z")
    public boolean method607() {
        if (this.field779 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field761 != -1) {
            var1 = class160.method905(this.field761);
        } else if (this.field790 != -1) {
            var1 = class160.field2725[this.field790];
        }
        return var1 >= 0 && var1 < this.field779.length && this.field779[var1] != -1;
    }

    @ObfuscatedName("ej.y(S)V")
    public static void method3031() {
        field783.method3360();
        field762.method3360();
    }
}
