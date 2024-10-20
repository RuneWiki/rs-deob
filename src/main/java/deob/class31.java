package deob;

@ObfuscatedName("ai")
public class class31 extends class174 {

    @ObfuscatedName("ai.n")
    public static class170 field797 = new class170(64);

    @ObfuscatedName("ai.e")
    public static class170 field763 = new class170(50);

    @ObfuscatedName("ai.l")
    public int field776;

    @ObfuscatedName("ai.d")
    public String field765 = "null";

    @ObfuscatedName("ai.r")
    public int field766 = 1;

    @ObfuscatedName("ai.k")
    public int[] field794;

    @ObfuscatedName("ai.u")
    public int[] field768;

    @ObfuscatedName("ai.o")
    public int field769 = -1;

    @ObfuscatedName("ai.g")
    public int field770 = -1;

    @ObfuscatedName("ai.s")
    public int field771 = -1;

    @ObfuscatedName("ai.b")
    public int field772 = -1;

    @ObfuscatedName("ai.v")
    public int field775 = -1;

    @ObfuscatedName("ai.j")
    public int field789 = -1;

    @ObfuscatedName("ai.q")
    public int field780 = -1;

    @ObfuscatedName("ai.a")
    public short[] field767;

    @ObfuscatedName("ai.c")
    public short[] field777;

    @ObfuscatedName("ai.m")
    public short[] field760;

    @ObfuscatedName("ai.z")
    public short[] field779;

    @ObfuscatedName("ai.w")
    public String[] field801 = new String[5];

    @ObfuscatedName("ai.h")
    public boolean field781 = true;

    @ObfuscatedName("ai.y")
    public int field782 = -1;

    @ObfuscatedName("ai.x")
    public int field783 = 128;

    @ObfuscatedName("ai.p")
    public int field790 = 128;

    @ObfuscatedName("ai.i")
    public boolean field785 = false;

    @ObfuscatedName("ai.aa")
    public int field786 = 0;

    @ObfuscatedName("ai.ax")
    public int field787 = 0;

    @ObfuscatedName("ai.ad")
    public int field788 = -1;

    @ObfuscatedName("ai.af")
    public int field761 = 32;

    @ObfuscatedName("ai.ai")
    public int[] field762;

    @ObfuscatedName("ai.ag")
    public int field791 = -1;

    @ObfuscatedName("ai.an")
    public int field792 = -1;

    @ObfuscatedName("ai.ac")
    public boolean field793 = true;

    @ObfuscatedName("ai.al")
    public boolean field784 = true;

    @ObfuscatedName("dj.f(II)Lai;")
    public static class31 method2320(int arg0) {
        class31 var1 = (class31) field797.method3276((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field796.method3035(9, arg0);
        class31 var3 = new class31();
        var3.field776 = arg0;
        if (var2 != null) {
            var3.method599(new class127(var2));
        }
        var3.method625();
        field797.method3275(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.t(B)V")
    public void method625() {
    }

    @ObfuscatedName("ai.n(Ldq;B)V")
    public void method599(class127 arg0) {
        while (true) {
            int var2 = arg0.method2458();
            if (var2 == 0) {
                return;
            }
            this.method600(arg0, var2);
        }
    }

    @ObfuscatedName("ai.e(Ldq;II)V")
    public void method600(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2458();
            this.field794 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field794[var4] = arg0.method2460();
            }
        } else if (arg1 == 2) {
            this.field765 = arg0.method2636();
        } else if (arg1 == 12) {
            this.field766 = arg0.method2458();
        } else if (arg1 == 13) {
            this.field769 = arg0.method2460();
        } else if (arg1 == 14) {
            this.field772 = arg0.method2460();
        } else if (arg1 == 15) {
            this.field770 = arg0.method2460();
        } else if (arg1 == 16) {
            this.field771 = arg0.method2460();
        } else if (arg1 == 17) {
            this.field772 = arg0.method2460();
            this.field775 = arg0.method2460();
            this.field789 = arg0.method2460();
            this.field780 = arg0.method2460();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field801[arg1 - 30] = arg0.method2636();
            if (this.field801[arg1 - 30].equalsIgnoreCase(class135.field2093)) {
                this.field801[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2458();
            this.field767 = new short[var5];
            this.field777 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field767[var6] = (short) arg0.method2460();
                this.field777[var6] = (short) arg0.method2460();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2458();
            this.field760 = new short[var7];
            this.field779 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field760[var8] = (short) arg0.method2460();
                this.field779[var8] = (short) arg0.method2460();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2458();
            this.field768 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field768[var10] = arg0.method2460();
            }
        } else if (arg1 == 93) {
            this.field781 = false;
        } else if (arg1 == 95) {
            this.field782 = arg0.method2460();
        } else if (arg1 == 97) {
            this.field783 = arg0.method2460();
        } else if (arg1 == 98) {
            this.field790 = arg0.method2460();
        } else if (arg1 == 99) {
            this.field785 = true;
        } else if (arg1 == 100) {
            this.field786 = arg0.method2459();
        } else if (arg1 == 101) {
            this.field787 = arg0.method2459();
        } else if (arg1 == 102) {
            this.field788 = arg0.method2460();
        } else if (arg1 == 103) {
            this.field761 = arg0.method2460();
        } else if (arg1 == 106) {
            this.field791 = arg0.method2460();
            if (this.field791 == 65535) {
                this.field791 = -1;
            }
            this.field792 = arg0.method2460();
            if (this.field792 == 65535) {
                this.field792 = -1;
            }
            int var11 = arg0.method2458();
            this.field762 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field762[var12] = arg0.method2460();
                if (this.field762[var12] == 65535) {
                    this.field762[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field793 = false;
        } else if (arg1 == 109) {
            this.field784 = false;
        }
    }

    @ObfuscatedName("ai.l(Lac;ILac;IB)Ldp;")
    public final class112 method601(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field762 != null) {
            class31 var5 = this.method619();
            return var5 == null ? null : var5.method601(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field763.method3276((long) this.field776);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field794.length; var8++) {
                if (!Statics.field800.method3103(this.field794[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field794.length];
            for (int var10 = 0; var10 < this.field794.length; var10++) {
                var9[var10] = class101.method2067(Statics.field800, this.field794[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field767 != null) {
                for (int var12 = 0; var12 < this.field767.length; var12++) {
                    var11.method2071(this.field767[var12], this.field777[var12]);
                }
            }
            if (this.field760 != null) {
                for (int var13 = 0; var13 < this.field760.length; var13++) {
                    var11.method2079(this.field760[var13], this.field779[var13]);
                }
            }
            var6 = var11.method2112(this.field786 + 64, this.field787 * 5 + 850, -30, -50, -30);
            field763.method3275(var6, (long) this.field776);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method728(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method714(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2263(true);
        } else {
            var14 = arg2.method714(var6, arg3);
        }
        if (this.field783 != 128 || this.field790 != 128) {
            var14.method2250(this.field783, this.field790, this.field783);
        }
        return var14;
    }

    @ObfuscatedName("ai.d(I)Lcz;")
    public final class101 method602() {
        if (this.field762 != null) {
            class31 var1 = this.method619();
            return var1 == null ? null : var1.method602();
        } else if (this.field768 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field768.length; var3++) {
                if (!Statics.field800.method3103(this.field768[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field768.length];
            for (int var5 = 0; var5 < this.field768.length; var5++) {
                var4[var5] = class101.method2067(Statics.field800, this.field768[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field767 != null) {
                for (int var7 = 0; var7 < this.field767.length; var7++) {
                    var6.method2071(this.field767[var7], this.field777[var7]);
                }
            }
            if (this.field760 != null) {
                for (int var8 = 0; var8 < this.field760.length; var8++) {
                    var6.method2079(this.field760[var8], this.field779[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ai.r(I)Lai;")
    public final class31 method619() {
        int var1 = -1;
        if (this.field791 != -1) {
            var1 = class160.method315(this.field791);
        } else if (this.field792 != -1) {
            var1 = class160.field2717[this.field792];
        }
        return var1 < 0 || var1 >= this.field762.length || this.field762[var1] == -1 ? null : method2320(this.field762[var1]);
    }

    @ObfuscatedName("ai.k(I)Z")
    public boolean method603() {
        if (this.field762 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field791 != -1) {
            var1 = class160.method315(this.field791);
        } else if (this.field792 != -1) {
            var1 = class160.field2717[this.field792];
        }
        return var1 >= 0 && var1 < this.field762.length && this.field762[var1] != -1;
    }

    @ObfuscatedName("be.u(I)V")
    public static void method1602() {
        field797.method3271();
        field763.method3271();
    }
}
