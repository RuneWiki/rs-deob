package deob;

@ObfuscatedName("ah")
public class class30 extends class173 {

    @ObfuscatedName("ah.n")
    public static class169 field773 = new class169(64);

    @ObfuscatedName("ah.c")
    public static class169 field789 = new class169(50);

    @ObfuscatedName("ah.r")
    public int field790;

    @ObfuscatedName("ah.k")
    public String field765 = "null";

    @ObfuscatedName("ah.e")
    public int field763 = 1;

    @ObfuscatedName("ah.q")
    public int[] field764;

    @ObfuscatedName("ah.u")
    public int[] field758;

    @ObfuscatedName("ah.s")
    public int field766 = -1;

    @ObfuscatedName("ah.l")
    public int field767 = -1;

    @ObfuscatedName("ah.o")
    public int field768 = -1;

    @ObfuscatedName("ah.h")
    public int field769 = -1;

    @ObfuscatedName("ah.p")
    public int field770 = -1;

    @ObfuscatedName("ah.d")
    public int field771 = -1;

    @ObfuscatedName("ah.m")
    public int field761 = -1;

    @ObfuscatedName("ah.z")
    public short[] field786;

    @ObfuscatedName("ah.t")
    public short[] field757;

    @ObfuscatedName("ah.i")
    public short[] field775;

    @ObfuscatedName("ah.j")
    public short[] field781;

    @ObfuscatedName("ah.a")
    public String[] field777 = new String[5];

    @ObfuscatedName("ah.g")
    public boolean field778 = true;

    @ObfuscatedName("ah.x")
    public int field779 = -1;

    @ObfuscatedName("ah.b")
    public int field780 = 128;

    @ObfuscatedName("ah.w")
    public int field784 = 128;

    @ObfuscatedName("ah.y")
    public boolean field782 = false;

    @ObfuscatedName("ah.au")
    public int field783 = 0;

    @ObfuscatedName("ah.az")
    public int field774 = 0;

    @ObfuscatedName("ah.ak")
    public int field785 = -1;

    @ObfuscatedName("ah.ah")
    public int field776 = 32;

    @ObfuscatedName("ah.aa")
    public int[] field787;

    @ObfuscatedName("ah.am")
    public int field788 = -1;

    @ObfuscatedName("ah.al")
    public int field760 = -1;

    @ObfuscatedName("ah.ae")
    public boolean field759 = true;

    @ObfuscatedName("ah.ab")
    public boolean field791 = true;

    @ObfuscatedName("eq.v(II)Lah;")
    public static class30 method3061(int arg0) {
        class30 var1 = (class30) field773.method3224((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field762.method3020(9, arg0);
        class30 var3 = new class30();
        var3.field790 = arg0;
        if (var2 != null) {
            var3.method622(new class126(var2));
        }
        var3.method602();
        field773.method3231(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.f(B)V")
    public void method602() {
    }

    @ObfuscatedName("ah.n(Ldr;I)V")
    public void method622(class126 arg0) {
        while (true) {
            int var2 = arg0.method2466();
            if (var2 == 0) {
                return;
            }
            this.method604(arg0, var2);
        }
    }

    @ObfuscatedName("ah.c(Ldr;II)V")
    public void method604(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2466();
            this.field764 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field764[var4] = arg0.method2468();
            }
        } else if (arg1 == 2) {
            this.field765 = arg0.method2462();
        } else if (arg1 == 12) {
            this.field763 = arg0.method2466();
        } else if (arg1 == 13) {
            this.field766 = arg0.method2468();
        } else if (arg1 == 14) {
            this.field769 = arg0.method2468();
        } else if (arg1 == 15) {
            this.field767 = arg0.method2468();
        } else if (arg1 == 16) {
            this.field768 = arg0.method2468();
        } else if (arg1 == 17) {
            this.field769 = arg0.method2468();
            this.field770 = arg0.method2468();
            this.field771 = arg0.method2468();
            this.field761 = arg0.method2468();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field777[arg1 - 30] = arg0.method2462();
            if (this.field777[arg1 - 30].equalsIgnoreCase(class133.field2069)) {
                this.field777[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2466();
            this.field786 = new short[var5];
            this.field757 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field786[var6] = (short) arg0.method2468();
                this.field757[var6] = (short) arg0.method2468();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2466();
            this.field775 = new short[var7];
            this.field781 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field775[var8] = (short) arg0.method2468();
                this.field781[var8] = (short) arg0.method2468();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2466();
            this.field758 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field758[var10] = arg0.method2468();
            }
        } else if (arg1 == 93) {
            this.field778 = false;
        } else if (arg1 == 95) {
            this.field779 = arg0.method2468();
        } else if (arg1 == 97) {
            this.field780 = arg0.method2468();
        } else if (arg1 == 98) {
            this.field784 = arg0.method2468();
        } else if (arg1 == 99) {
            this.field782 = true;
        } else if (arg1 == 100) {
            this.field783 = arg0.method2499();
        } else if (arg1 == 101) {
            this.field774 = arg0.method2499() * 5;
        } else if (arg1 == 102) {
            this.field785 = arg0.method2468();
        } else if (arg1 == 103) {
            this.field776 = arg0.method2468();
        } else if (arg1 == 106) {
            this.field788 = arg0.method2468();
            if (this.field788 == 65535) {
                this.field788 = -1;
            }
            this.field760 = arg0.method2468();
            if (this.field760 == 65535) {
                this.field760 = -1;
            }
            int var11 = arg0.method2466();
            this.field787 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field787[var12] = arg0.method2468();
                if (this.field787[var12] == 65535) {
                    this.field787[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field759 = false;
        } else if (arg1 == 109) {
            this.field791 = false;
        }
    }

    @ObfuscatedName("ah.r(Lal;ILal;II)Ldf;")
    public final class111 method601(class33 arg0, int arg1, class33 arg2, int arg3) {
        if (this.field787 != null) {
            class30 var5 = this.method607();
            return var5 == null ? null : var5.method601(arg0, arg1, arg2, arg3);
        }
        class111 var6 = (class111) field789.method3224((long) this.field790);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field764.length; var8++) {
                if (!Statics.field792.method2993(this.field764[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field764.length];
            for (int var10 = 0; var10 < this.field764.length; var10++) {
                var9[var10] = class100.method2060(Statics.field792, this.field764[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field786 != null) {
                for (int var12 = 0; var12 < this.field786.length; var12++) {
                    var11.method2082(this.field786[var12], this.field757[var12]);
                }
            }
            if (this.field775 != null) {
                for (int var13 = 0; var13 < this.field775.length; var13++) {
                    var11.method2101(this.field775[var13], this.field781[var13]);
                }
            }
            var6 = var11.method2080(this.field783 + 64, this.field774 + 850, -30, -50, -30);
            field789.method3231(var6, (long) this.field790);
        }
        class111 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method709(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method710(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2276(true);
        } else {
            var14 = arg2.method710(var6, arg3);
        }
        if (this.field780 != 128 || this.field784 != 128) {
            var14.method2264(this.field780, this.field784, this.field780);
        }
        return var14;
    }

    @ObfuscatedName("ah.k(B)Lcw;")
    public final class100 method606() {
        if (this.field787 != null) {
            class30 var1 = this.method607();
            return var1 == null ? null : var1.method606();
        } else if (this.field758 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field758.length; var3++) {
                if (!Statics.field792.method2993(this.field758[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field758.length];
            for (int var5 = 0; var5 < this.field758.length; var5++) {
                var4[var5] = class100.method2060(Statics.field792, this.field758[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field786 != null) {
                for (int var7 = 0; var7 < this.field786.length; var7++) {
                    var6.method2082(this.field786[var7], this.field757[var7]);
                }
            }
            if (this.field775 != null) {
                for (int var8 = 0; var8 < this.field775.length; var8++) {
                    var6.method2101(this.field775[var8], this.field781[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ah.e(I)Lah;")
    public final class30 method607() {
        int var1 = -1;
        if (this.field788 != -1) {
            var1 = class158.method2233(this.field788);
        } else if (this.field760 != -1) {
            var1 = class158.field2693[this.field760];
        }
        return var1 < 0 || var1 >= this.field787.length || this.field787[var1] == -1 ? null : method3061(this.field787[var1]);
    }

    @ObfuscatedName("ah.q(I)Z")
    public boolean method608() {
        if (this.field787 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field788 != -1) {
            var1 = class158.method2233(this.field788);
        } else if (this.field760 != -1) {
            var1 = class158.field2693[this.field760];
        }
        return var1 >= 0 && var1 < this.field787.length && this.field787[var1] != -1;
    }

    @ObfuscatedName("dy.u(I)V")
    public static void method2229() {
        field773.method3227();
        field789.method3227();
    }
}
