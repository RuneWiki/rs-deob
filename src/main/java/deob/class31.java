package deob;

@ObfuscatedName("aa")
public class class31 extends class174 {

    @ObfuscatedName("aa.v")
    public static class170 field768 = new class170(64);

    @ObfuscatedName("aa.r")
    public static class170 field767 = new class170(50);

    @ObfuscatedName("aa.n")
    public int field770;

    @ObfuscatedName("aa.i")
    public String field771 = "null";

    @ObfuscatedName("aa.s")
    public int field772 = 1;

    @ObfuscatedName("aa.w")
    public int[] field773;

    @ObfuscatedName("aa.d")
    public int[] field774;

    @ObfuscatedName("aa.t")
    public int field788 = -1;

    @ObfuscatedName("aa.f")
    public int field801 = -1;

    @ObfuscatedName("aa.b")
    public int field777 = -1;

    @ObfuscatedName("aa.z")
    public int field797 = -1;

    @ObfuscatedName("aa.l")
    public int field794 = -1;

    @ObfuscatedName("aa.e")
    public int field780 = -1;

    @ObfuscatedName("aa.p")
    public int field769 = -1;

    @ObfuscatedName("aa.o")
    public short[] field782;

    @ObfuscatedName("aa.h")
    public short[] field783;

    @ObfuscatedName("aa.j")
    public short[] field784;

    @ObfuscatedName("aa.x")
    public short[] field785;

    @ObfuscatedName("aa.k")
    public String[] field800 = new String[5];

    @ObfuscatedName("aa.a")
    public boolean field775 = true;

    @ObfuscatedName("aa.y")
    public int field781 = -1;

    @ObfuscatedName("aa.q")
    public int field789 = 128;

    @ObfuscatedName("aa.c")
    public int field790 = 128;

    @ObfuscatedName("aa.u")
    public boolean field791 = false;

    @ObfuscatedName("aa.ah")
    public int field792 = 0;

    @ObfuscatedName("aa.az")
    public int field793 = 0;

    @ObfuscatedName("aa.au")
    public int field779 = -1;

    @ObfuscatedName("aa.ae")
    public int field795 = 32;

    @ObfuscatedName("aa.aa")
    public int[] field796;

    @ObfuscatedName("aa.av")
    public int field787 = -1;

    @ObfuscatedName("aa.aq")
    public int field786 = -1;

    @ObfuscatedName("aa.ak")
    public boolean field799 = true;

    @ObfuscatedName("aa.ad")
    public boolean field776 = true;

    @ObfuscatedName("i.g(IB)Laa;")
    public static class31 method44(int arg0) {
        class31 var1 = (class31) field768.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2016.method2968(9, arg0);
        class31 var3 = new class31();
        var3.field770 = arg0;
        if (var2 != null) {
            var3.method599(new class127(var2));
        }
        var3.method598();
        field768.method3249(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.m(B)V")
    public void method598() {
    }

    @ObfuscatedName("aa.v(Ldr;I)V")
    public void method599(class127 arg0) {
        while (true) {
            int var2 = arg0.method2414();
            if (var2 == 0) {
                return;
            }
            this.method612(arg0, var2);
        }
    }

    @ObfuscatedName("aa.r(Ldr;IS)V")
    public void method612(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2414();
            this.field773 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field773[var4] = arg0.method2416();
            }
        } else if (arg1 == 2) {
            this.field771 = arg0.method2422();
        } else if (arg1 == 12) {
            this.field772 = arg0.method2414();
        } else if (arg1 == 13) {
            this.field788 = arg0.method2416();
        } else if (arg1 == 14) {
            this.field797 = arg0.method2416();
        } else if (arg1 == 15) {
            this.field801 = arg0.method2416();
        } else if (arg1 == 16) {
            this.field777 = arg0.method2416();
        } else if (arg1 == 17) {
            this.field797 = arg0.method2416();
            this.field794 = arg0.method2416();
            this.field780 = arg0.method2416();
            this.field769 = arg0.method2416();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field800[arg1 - 30] = arg0.method2422();
            if (this.field800[arg1 - 30].equalsIgnoreCase(class134.field2070)) {
                this.field800[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2414();
            this.field782 = new short[var5];
            this.field783 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field782[var6] = (short) arg0.method2416();
                this.field783[var6] = (short) arg0.method2416();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2414();
            this.field784 = new short[var7];
            this.field785 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field784[var8] = (short) arg0.method2416();
                this.field785[var8] = (short) arg0.method2416();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2414();
            this.field774 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field774[var10] = arg0.method2416();
            }
        } else if (arg1 == 93) {
            this.field775 = false;
        } else if (arg1 == 95) {
            this.field781 = arg0.method2416();
        } else if (arg1 == 97) {
            this.field789 = arg0.method2416();
        } else if (arg1 == 98) {
            this.field790 = arg0.method2416();
        } else if (arg1 == 99) {
            this.field791 = true;
        } else if (arg1 == 100) {
            this.field792 = arg0.method2415();
        } else if (arg1 == 101) {
            this.field793 = arg0.method2415();
        } else if (arg1 == 102) {
            this.field779 = arg0.method2416();
        } else if (arg1 == 103) {
            this.field795 = arg0.method2416();
        } else if (arg1 == 106) {
            this.field787 = arg0.method2416();
            if (this.field787 == 65535) {
                this.field787 = -1;
            }
            this.field786 = arg0.method2416();
            if (this.field786 == 65535) {
                this.field786 = -1;
            }
            int var11 = arg0.method2414();
            this.field796 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field796[var12] = arg0.method2416();
                if (this.field796[var12] == 65535) {
                    this.field796[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field799 = false;
        } else if (arg1 == 109) {
            this.field776 = false;
        }
    }

    @ObfuscatedName("aa.n(Lak;ILak;II)Ldf;")
    public final class112 method601(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field796 != null) {
            class31 var5 = this.method610();
            return var5 == null ? null : var5.method601(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field767.method3245((long) this.field770);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field773.length; var8++) {
                if (!Statics.field798.method2970(this.field773[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field773.length];
            for (int var10 = 0; var10 < this.field773.length; var10++) {
                var9[var10] = class101.method2086(Statics.field798, this.field773[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field782 != null) {
                for (int var12 = 0; var12 < this.field782.length; var12++) {
                    var11.method2031(this.field782[var12], this.field783[var12]);
                }
            }
            if (this.field784 != null) {
                for (int var13 = 0; var13 < this.field784.length; var13++) {
                    var11.method2042(this.field784[var13], this.field785[var13]);
                }
            }
            var6 = var11.method2039(this.field792 + 64, this.field793 * 5 + 850, -30, -50, -30);
            field767.method3249(var6, (long) this.field770);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method703(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method701(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2262(true);
        } else {
            var14 = arg2.method701(var6, arg3);
        }
        if (this.field789 != 128 || this.field790 != 128) {
            var14.method2217(this.field789, this.field790, this.field789);
        }
        return var14;
    }

    @ObfuscatedName("aa.i(I)Lck;")
    public final class101 method627() {
        if (this.field796 != null) {
            class31 var1 = this.method610();
            return var1 == null ? null : var1.method627();
        } else if (this.field774 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field774.length; var3++) {
                if (!Statics.field798.method2970(this.field774[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field774.length];
            for (int var5 = 0; var5 < this.field774.length; var5++) {
                var4[var5] = class101.method2086(Statics.field798, this.field774[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field782 != null) {
                for (int var7 = 0; var7 < this.field782.length; var7++) {
                    var6.method2031(this.field782[var7], this.field783[var7]);
                }
            }
            if (this.field784 != null) {
                for (int var8 = 0; var8 < this.field784.length; var8++) {
                    var6.method2042(this.field784[var8], this.field785[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aa.s(I)Laa;")
    public final class31 method610() {
        int var1 = -1;
        if (this.field787 != -1) {
            var1 = class159.method2666(this.field787);
        } else if (this.field786 != -1) {
            var1 = class159.field2693[this.field786];
        }
        return var1 < 0 || var1 >= this.field796.length || this.field796[var1] == -1 ? null : method44(this.field796[var1]);
    }

    @ObfuscatedName("aa.w(B)Z")
    public boolean method604() {
        if (this.field796 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field787 != -1) {
            var1 = class159.method2666(this.field787);
        } else if (this.field786 != -1) {
            var1 = class159.field2693[this.field786];
        }
        return var1 >= 0 && var1 < this.field796.length && this.field796[var1] != -1;
    }
}
