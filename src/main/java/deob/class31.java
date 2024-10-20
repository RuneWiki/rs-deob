package deob;

@ObfuscatedName("at")
public class class31 extends class175 {

    @ObfuscatedName("at.o")
    public static class171 field763 = new class171(64);

    @ObfuscatedName("at.w")
    public static class171 field766 = new class171(50);

    @ObfuscatedName("at.r")
    public int field800;

    @ObfuscatedName("at.k")
    public String field768 = "null";

    @ObfuscatedName("at.z")
    public int field774 = 1;

    @ObfuscatedName("at.g")
    public int[] field770;

    @ObfuscatedName("at.n")
    public int[] field765;

    @ObfuscatedName("at.j")
    public int field772 = -1;

    @ObfuscatedName("at.c")
    public int field773 = -1;

    @ObfuscatedName("at.m")
    public int field788 = -1;

    @ObfuscatedName("at.a")
    public int field771 = -1;

    @ObfuscatedName("at.e")
    public int field776 = -1;

    @ObfuscatedName("at.q")
    public int field777 = -1;

    @ObfuscatedName("at.y")
    public int field778 = -1;

    @ObfuscatedName("at.v")
    public short[] field779;

    @ObfuscatedName("at.s")
    public short[] field780;

    @ObfuscatedName("at.u")
    public short[] field802;

    @ObfuscatedName("at.d")
    public short[] field782;

    @ObfuscatedName("at.i")
    public String[] field783 = new String[5];

    @ObfuscatedName("at.p")
    public boolean field784 = true;

    @ObfuscatedName("at.h")
    public int field769 = -1;

    @ObfuscatedName("at.f")
    public int field786 = 128;

    @ObfuscatedName("at.t")
    public int field799 = 128;

    @ObfuscatedName("at.x")
    public boolean field775 = false;

    @ObfuscatedName("at.ar")
    public int field787 = 0;

    @ObfuscatedName("at.au")
    public int field790 = 0;

    @ObfuscatedName("at.an")
    public int field767 = -1;

    @ObfuscatedName("at.ad")
    public int field792 = 32;

    @ObfuscatedName("at.at")
    public int[] field793;

    @ObfuscatedName("at.ay")
    public int field794 = -1;

    @ObfuscatedName("at.ac")
    public int field795 = -1;

    @ObfuscatedName("at.av")
    public boolean field796 = true;

    @ObfuscatedName("at.ae")
    public boolean field797 = true;

    @ObfuscatedName("fy.l(II)Lat;")
    public static class31 method3247(int arg0) {
        class31 var1 = (class31) field763.method3255((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field781.method3029(9, arg0);
        class31 var3 = new class31();
        var3.field800 = arg0;
        if (var2 != null) {
            var3.method607(new class127(var2));
        }
        var3.method606();
        field763.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.b(I)V")
    public void method606() {
    }

    @ObfuscatedName("at.o(Ldm;B)V")
    public void method607(class127 arg0) {
        while (true) {
            int var2 = arg0.method2440();
            if (var2 == 0) {
                return;
            }
            this.method605(arg0, var2);
        }
    }

    @ObfuscatedName("at.w(Ldm;IS)V")
    public void method605(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2440();
            this.field770 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field770[var4] = arg0.method2442();
            }
        } else if (arg1 == 2) {
            this.field768 = arg0.method2471();
        } else if (arg1 == 12) {
            this.field774 = arg0.method2440();
        } else if (arg1 == 13) {
            this.field772 = arg0.method2442();
        } else if (arg1 == 14) {
            this.field771 = arg0.method2442();
        } else if (arg1 == 15) {
            this.field773 = arg0.method2442();
        } else if (arg1 == 16) {
            this.field788 = arg0.method2442();
        } else if (arg1 == 17) {
            this.field771 = arg0.method2442();
            this.field776 = arg0.method2442();
            this.field777 = arg0.method2442();
            this.field778 = arg0.method2442();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field783[arg1 - 30] = arg0.method2471();
            if (this.field783[arg1 - 30].equalsIgnoreCase(class136.field2093)) {
                this.field783[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2440();
            this.field779 = new short[var5];
            this.field780 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field779[var6] = (short) arg0.method2442();
                this.field780[var6] = (short) arg0.method2442();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2440();
            this.field802 = new short[var7];
            this.field782 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field802[var8] = (short) arg0.method2442();
                this.field782[var8] = (short) arg0.method2442();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2440();
            this.field765 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field765[var10] = arg0.method2442();
            }
        } else if (arg1 == 93) {
            this.field784 = false;
        } else if (arg1 == 95) {
            this.field769 = arg0.method2442();
        } else if (arg1 == 97) {
            this.field786 = arg0.method2442();
        } else if (arg1 == 98) {
            this.field799 = arg0.method2442();
        } else if (arg1 == 99) {
            this.field775 = true;
        } else if (arg1 == 100) {
            this.field787 = arg0.method2438();
        } else if (arg1 == 101) {
            this.field790 = arg0.method2438() * 5;
        } else if (arg1 == 102) {
            this.field767 = arg0.method2442();
        } else if (arg1 == 103) {
            this.field792 = arg0.method2442();
        } else if (arg1 == 106) {
            this.field794 = arg0.method2442();
            if (this.field794 == 65535) {
                this.field794 = -1;
            }
            this.field795 = arg0.method2442();
            if (this.field795 == 65535) {
                this.field795 = -1;
            }
            int var11 = arg0.method2440();
            this.field793 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field793[var12] = arg0.method2442();
                if (this.field793[var12] == 65535) {
                    this.field793[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field796 = false;
        } else if (arg1 == 109) {
            this.field797 = false;
        }
    }

    @ObfuscatedName("at.r(Lav;ILav;II)Ldt;")
    public final class112 method609(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field793 != null) {
            class31 var5 = this.method612();
            return var5 == null ? null : var5.method609(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field766.method3255((long) this.field800);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field770.length; var8++) {
                if (!Statics.field789.method3031(this.field770[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field770.length];
            for (int var10 = 0; var10 < this.field770.length; var10++) {
                var9[var10] = class101.method2087(Statics.field789, this.field770[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field779 != null) {
                for (int var12 = 0; var12 < this.field779.length; var12++) {
                    var11.method2071(this.field779[var12], this.field780[var12]);
                }
            }
            if (this.field802 != null) {
                for (int var13 = 0; var13 < this.field802.length; var13++) {
                    var11.method2038(this.field802[var13], this.field782[var13]);
                }
            }
            var6 = var11.method2105(this.field787 + 64, this.field790 + 850, -30, -50, -30);
            field766.method3253(var6, (long) this.field800);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method733(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method706(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2227(true);
        } else {
            var14 = arg2.method706(var6, arg3);
        }
        if (this.field786 != 128 || this.field799 != 128) {
            var14.method2240(this.field786, this.field799, this.field786);
        }
        return var14;
    }

    @ObfuscatedName("at.k(I)Lcc;")
    public final class101 method610() {
        if (this.field793 != null) {
            class31 var1 = this.method612();
            return var1 == null ? null : var1.method610();
        } else if (this.field765 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field765.length; var3++) {
                if (!Statics.field789.method3031(this.field765[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field765.length];
            for (int var5 = 0; var5 < this.field765.length; var5++) {
                var4[var5] = class101.method2087(Statics.field789, this.field765[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field779 != null) {
                for (int var7 = 0; var7 < this.field779.length; var7++) {
                    var6.method2071(this.field779[var7], this.field780[var7]);
                }
            }
            if (this.field802 != null) {
                for (int var8 = 0; var8 < this.field802.length; var8++) {
                    var6.method2038(this.field802[var8], this.field782[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("at.z(B)Lat;")
    public final class31 method612() {
        int var1 = -1;
        if (this.field794 != -1) {
            var1 = class161.method3138(this.field794);
        } else if (this.field795 != -1) {
            var1 = class161.field2736[this.field795];
        }
        return var1 < 0 || var1 >= this.field793.length || this.field793[var1] == -1 ? null : method3247(this.field793[var1]);
    }

    @ObfuscatedName("at.g(I)Z")
    public boolean method608() {
        if (this.field793 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field794 != -1) {
            var1 = class161.method3138(this.field794);
        } else if (this.field795 != -1) {
            var1 = class161.field2736[this.field795];
        }
        return var1 >= 0 && var1 < this.field793.length && this.field793[var1] != -1;
    }

    @ObfuscatedName("dv.n(B)V")
    public static void method2371() {
        field763.method3254();
        field766.method3254();
    }
}
