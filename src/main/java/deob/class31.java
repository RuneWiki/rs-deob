package deob;

@ObfuscatedName("aj")
public class class31 extends class174 {

    @ObfuscatedName("aj.k")
    public static class170 field780 = new class170(64);

    @ObfuscatedName("aj.a")
    public static class170 field746 = new class170(50);

    @ObfuscatedName("aj.q")
    public int field747;

    @ObfuscatedName("aj.j")
    public String field753 = "null";

    @ObfuscatedName("aj.v")
    public int field749 = 1;

    @ObfuscatedName("aj.w")
    public int[] field745;

    @ObfuscatedName("aj.l")
    public int[] field748;

    @ObfuscatedName("aj.s")
    public int field752 = -1;

    @ObfuscatedName("aj.n")
    public int field767 = -1;

    @ObfuscatedName("aj.c")
    public int field771 = -1;

    @ObfuscatedName("aj.h")
    public int field779 = -1;

    @ObfuscatedName("aj.u")
    public int field743 = -1;

    @ObfuscatedName("aj.y")
    public int field762 = -1;

    @ObfuscatedName("aj.b")
    public int field758 = -1;

    @ObfuscatedName("aj.t")
    public short[] field759;

    @ObfuscatedName("aj.r")
    public short[] field760;

    @ObfuscatedName("aj.g")
    public short[] field761;

    @ObfuscatedName("aj.m")
    public short[] field777;

    @ObfuscatedName("aj.o")
    public String[] field763 = new String[5];

    @ObfuscatedName("aj.e")
    public boolean field764 = true;

    @ObfuscatedName("aj.f")
    public int field765 = -1;

    @ObfuscatedName("aj.i")
    public int field766 = 128;

    @ObfuscatedName("aj.d")
    public int field744 = 128;

    @ObfuscatedName("aj.z")
    public boolean field768 = false;

    @ObfuscatedName("aj.ai")
    public int field769 = 0;

    @ObfuscatedName("aj.ag")
    public int field770 = 0;

    @ObfuscatedName("aj.as")
    public int field751 = -1;

    @ObfuscatedName("aj.al")
    public int field772 = 32;

    @ObfuscatedName("aj.aj")
    public int[] field773;

    @ObfuscatedName("aj.am")
    public int field774 = -1;

    @ObfuscatedName("aj.ab")
    public int field775 = -1;

    @ObfuscatedName("aj.ao")
    public boolean field776 = true;

    @ObfuscatedName("aj.ac")
    public boolean field750 = true;

    @ObfuscatedName("eu.x(Lej;Lej;B)V")
    public static void method2635(class152 arg0, class152 arg1) {
        Statics.field756 = arg0;
        Statics.field755 = arg1;
    }

    @ObfuscatedName("aj.k(I)V")
    public void method602() {
    }

    @ObfuscatedName("aj.a(Ldg;B)V")
    public void method578(class127 arg0) {
        while (true) {
            int var2 = arg0.method2484();
            if (var2 == 0) {
                return;
            }
            this.method579(arg0, var2);
        }
    }

    @ObfuscatedName("aj.q(Ldg;II)V")
    public void method579(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2484();
            this.field745 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field745[var4] = arg0.method2539();
            }
        } else if (arg1 == 2) {
            this.field753 = arg0.method2571();
        } else if (arg1 == 12) {
            this.field749 = arg0.method2484();
        } else if (arg1 == 13) {
            this.field752 = arg0.method2539();
        } else if (arg1 == 14) {
            this.field779 = arg0.method2539();
        } else if (arg1 == 15) {
            this.field767 = arg0.method2539();
        } else if (arg1 == 16) {
            this.field771 = arg0.method2539();
        } else if (arg1 == 17) {
            this.field779 = arg0.method2539();
            this.field743 = arg0.method2539();
            this.field762 = arg0.method2539();
            this.field758 = arg0.method2539();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field763[arg1 - 30] = arg0.method2571();
            if (this.field763[arg1 - 30].equalsIgnoreCase(class134.field2057)) {
                this.field763[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2484();
            this.field759 = new short[var5];
            this.field760 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field759[var6] = (short) arg0.method2539();
                this.field760[var6] = (short) arg0.method2539();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2484();
            this.field761 = new short[var7];
            this.field777 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field761[var8] = (short) arg0.method2539();
                this.field777[var8] = (short) arg0.method2539();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2484();
            this.field748 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field748[var10] = arg0.method2539();
            }
        } else if (arg1 == 93) {
            this.field764 = false;
        } else if (arg1 == 95) {
            this.field765 = arg0.method2539();
        } else if (arg1 == 97) {
            this.field766 = arg0.method2539();
        } else if (arg1 == 98) {
            this.field744 = arg0.method2539();
        } else if (arg1 == 99) {
            this.field768 = true;
        } else if (arg1 == 100) {
            this.field769 = arg0.method2411();
        } else if (arg1 == 101) {
            this.field770 = arg0.method2411();
        } else if (arg1 == 102) {
            this.field751 = arg0.method2539();
        } else if (arg1 == 103) {
            this.field772 = arg0.method2539();
        } else if (arg1 == 106) {
            this.field774 = arg0.method2539();
            if (this.field774 == 65535) {
                this.field774 = -1;
            }
            this.field775 = arg0.method2539();
            if (this.field775 == 65535) {
                this.field775 = -1;
            }
            int var11 = arg0.method2484();
            this.field773 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field773[var12] = arg0.method2539();
                if (this.field773[var12] == 65535) {
                    this.field773[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field776 = false;
        } else if (arg1 == 109) {
            this.field750 = false;
        }
    }

    @ObfuscatedName("aj.j(Lao;ILao;IB)Ldi;")
    public final class112 method590(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field773 != null) {
            class31 var5 = this.method582();
            return var5 == null ? null : var5.method590(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field746.method3196((long) this.field747);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field745.length; var8++) {
                if (!Statics.field755.method2983(this.field745[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field745.length];
            for (int var10 = 0; var10 < this.field745.length; var10++) {
                var9[var10] = class101.method2034(Statics.field755, this.field745[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field759 != null) {
                for (int var12 = 0; var12 < this.field759.length; var12++) {
                    var11.method2016(this.field759[var12], this.field760[var12]);
                }
            }
            if (this.field761 != null) {
                for (int var13 = 0; var13 < this.field761.length; var13++) {
                    var11.method2017(this.field761[var13], this.field777[var13]);
                }
            }
            var6 = var11.method2004(this.field769 + 64, this.field770 * 5 + 850, -30, -50, -30);
            field746.method3197(var6, (long) this.field747);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method684(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method686(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2207(true);
        } else {
            var14 = arg2.method686(var6, arg3);
        }
        if (this.field766 != 128 || this.field744 != 128) {
            var14.method2224(this.field766, this.field744, this.field766);
        }
        return var14;
    }

    @ObfuscatedName("aj.v(I)Lcy;")
    public final class101 method581() {
        if (this.field773 != null) {
            class31 var1 = this.method582();
            return var1 == null ? null : var1.method581();
        } else if (this.field748 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field748.length; var3++) {
                if (!Statics.field755.method2983(this.field748[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field748.length];
            for (int var5 = 0; var5 < this.field748.length; var5++) {
                var4[var5] = class101.method2034(Statics.field755, this.field748[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field759 != null) {
                for (int var7 = 0; var7 < this.field759.length; var7++) {
                    var6.method2016(this.field759[var7], this.field760[var7]);
                }
            }
            if (this.field761 != null) {
                for (int var8 = 0; var8 < this.field761.length; var8++) {
                    var6.method2017(this.field761[var8], this.field777[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aj.w(B)Laj;")
    public final class31 method582() {
        int var1 = -1;
        if (this.field774 != -1) {
            var1 = class159.method1498(this.field774);
        } else if (this.field775 != -1) {
            var1 = class159.field2696[this.field775];
        }
        return var1 < 0 || var1 >= this.field773.length || this.field773[var1] == -1 ? null : Statics.method1391(this.field773[var1]);
    }

    @ObfuscatedName("aj.l(I)Z")
    public boolean method583() {
        if (this.field773 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field774 != -1) {
            var1 = class159.method1498(this.field774);
        } else if (this.field775 != -1) {
            var1 = class159.field2696[this.field775];
        }
        return var1 >= 0 && var1 < this.field773.length && this.field773[var1] != -1;
    }

    @ObfuscatedName("as.s(I)V")
    public static void method546() {
        field780.method3198();
        field746.method3198();
    }
}
