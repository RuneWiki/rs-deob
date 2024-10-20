package deob;

@ObfuscatedName("ae")
public class class31 extends class174 {

    @ObfuscatedName("ae.v")
    public static class170 field769 = new class170(64);

    @ObfuscatedName("ae.p")
    public static class170 field777 = new class170(50);

    @ObfuscatedName("ae.e")
    public int field771;

    @ObfuscatedName("ae.d")
    public String field786 = "null";

    @ObfuscatedName("ae.y")
    public int field773 = 1;

    @ObfuscatedName("ae.x")
    public int[] field774;

    @ObfuscatedName("ae.t")
    public int[] field775;

    @ObfuscatedName("ae.i")
    public int field776 = -1;

    @ObfuscatedName("ae.z")
    public int field802 = -1;

    @ObfuscatedName("ae.o")
    public int field778 = -1;

    @ObfuscatedName("ae.u")
    public int field803 = -1;

    @ObfuscatedName("ae.f")
    public int field796 = -1;

    @ObfuscatedName("ae.k")
    public int field767 = -1;

    @ObfuscatedName("ae.q")
    public int field782 = -1;

    @ObfuscatedName("ae.a")
    public short[] field783;

    @ObfuscatedName("ae.w")
    public short[] field787;

    @ObfuscatedName("ae.g")
    public short[] field785;

    @ObfuscatedName("ae.l")
    public short[] field768;

    @ObfuscatedName("ae.m")
    public String[] field807 = new String[5];

    @ObfuscatedName("ae.b")
    public boolean field788 = true;

    @ObfuscatedName("ae.h")
    public int field789 = -1;

    @ObfuscatedName("ae.n")
    public int field790 = 128;

    @ObfuscatedName("ae.s")
    public int field779 = 128;

    @ObfuscatedName("ae.c")
    public boolean field792 = false;

    @ObfuscatedName("ae.am")
    public int field793 = 0;

    @ObfuscatedName("ae.ap")
    public int field791 = 0;

    @ObfuscatedName("ae.au")
    public int field795 = -1;

    @ObfuscatedName("ae.ab")
    public int field801 = 32;

    @ObfuscatedName("ae.ae")
    public int[] field797;

    @ObfuscatedName("ae.as")
    public int field798 = -1;

    @ObfuscatedName("ae.av")
    public int field799 = -1;

    @ObfuscatedName("ae.ar")
    public boolean field800 = true;

    @ObfuscatedName("ae.ad")
    public boolean field772 = true;

    @ObfuscatedName("f.j(II)Lae;")
    public static class31 method148(int arg0) {
        class31 var1 = (class31) field769.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field806.method3016(9, arg0);
        class31 var3 = new class31();
        var3.field771 = arg0;
        if (var2 != null) {
            var3.method620(new class127(var2));
        }
        var3.method603();
        field769.method3257(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.r(I)V")
    public void method603() {
    }

    @ObfuscatedName("ae.v(Ldn;I)V")
    public void method620(class127 arg0) {
        while (true) {
            int var2 = arg0.method2441();
            if (var2 == 0) {
                return;
            }
            this.method605(arg0, var2);
        }
    }

    @ObfuscatedName("ae.p(Ldn;II)V")
    public void method605(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2441();
            this.field774 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field774[var4] = arg0.method2609();
            }
        } else if (arg1 == 2) {
            this.field786 = arg0.method2449();
        } else if (arg1 == 12) {
            this.field773 = arg0.method2441();
        } else if (arg1 == 13) {
            this.field776 = arg0.method2609();
        } else if (arg1 == 14) {
            this.field803 = arg0.method2609();
        } else if (arg1 == 15) {
            this.field802 = arg0.method2609();
        } else if (arg1 == 16) {
            this.field778 = arg0.method2609();
        } else if (arg1 == 17) {
            this.field803 = arg0.method2609();
            this.field796 = arg0.method2609();
            this.field767 = arg0.method2609();
            this.field782 = arg0.method2609();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field807[arg1 - 30] = arg0.method2449();
            if (this.field807[arg1 - 30].equalsIgnoreCase(class134.field2073)) {
                this.field807[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2441();
            this.field783 = new short[var5];
            this.field787 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field783[var6] = (short) arg0.method2609();
                this.field787[var6] = (short) arg0.method2609();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2441();
            this.field785 = new short[var7];
            this.field768 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field785[var8] = (short) arg0.method2609();
                this.field768[var8] = (short) arg0.method2609();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2441();
            this.field775 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field775[var10] = arg0.method2609();
            }
        } else if (arg1 == 93) {
            this.field788 = false;
        } else if (arg1 == 95) {
            this.field789 = arg0.method2609();
        } else if (arg1 == 97) {
            this.field790 = arg0.method2609();
        } else if (arg1 == 98) {
            this.field779 = arg0.method2609();
        } else if (arg1 == 99) {
            this.field792 = true;
        } else if (arg1 == 100) {
            this.field793 = arg0.method2442();
        } else if (arg1 == 101) {
            this.field791 = arg0.method2442() * 5;
        } else if (arg1 == 102) {
            this.field795 = arg0.method2609();
        } else if (arg1 == 103) {
            this.field801 = arg0.method2609();
        } else if (arg1 == 106) {
            this.field798 = arg0.method2609();
            if (this.field798 == 65535) {
                this.field798 = -1;
            }
            this.field799 = arg0.method2609();
            if (this.field799 == 65535) {
                this.field799 = -1;
            }
            int var11 = arg0.method2441();
            this.field797 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field797[var12] = arg0.method2609();
                if (this.field797[var12] == 65535) {
                    this.field797[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field800 = false;
        } else if (arg1 == 109) {
            this.field772 = false;
        }
    }

    @ObfuscatedName("ae.e(Lar;ILar;IB)Ldt;")
    public final class112 method614(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field797 != null) {
            class31 var5 = this.method608();
            return var5 == null ? null : var5.method614(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field777.method3264((long) this.field771);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field774.length; var8++) {
                if (!Statics.field794.method2959(this.field774[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field774.length];
            for (int var10 = 0; var10 < this.field774.length; var10++) {
                var9[var10] = class101.method2115(Statics.field794, this.field774[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field783 != null) {
                for (int var12 = 0; var12 < this.field783.length; var12++) {
                    var11.method2062(this.field783[var12], this.field787[var12]);
                }
            }
            if (this.field785 != null) {
                for (int var13 = 0; var13 < this.field785.length; var13++) {
                    var11.method2063(this.field785[var13], this.field768[var13]);
                }
            }
            var6 = var11.method2073(this.field793 + 64, this.field791 + 850, -30, -50, -30);
            field777.method3257(var6, (long) this.field771);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method703(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method698(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2232(true);
        } else {
            var14 = arg2.method698(var6, arg3);
        }
        if (this.field790 != 128 || this.field779 != 128) {
            var14.method2241(this.field790, this.field779, this.field790);
        }
        return var14;
    }

    @ObfuscatedName("ae.d(I)Lco;")
    public final class101 method610() {
        if (this.field797 != null) {
            class31 var1 = this.method608();
            return var1 == null ? null : var1.method610();
        } else if (this.field775 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field775.length; var3++) {
                if (!Statics.field794.method2959(this.field775[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field775.length];
            for (int var5 = 0; var5 < this.field775.length; var5++) {
                var4[var5] = class101.method2115(Statics.field794, this.field775[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field783 != null) {
                for (int var7 = 0; var7 < this.field783.length; var7++) {
                    var6.method2062(this.field783[var7], this.field787[var7]);
                }
            }
            if (this.field785 != null) {
                for (int var8 = 0; var8 < this.field785.length; var8++) {
                    var6.method2063(this.field785[var8], this.field768[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ae.y(I)Lae;")
    public final class31 method608() {
        int var1 = -1;
        if (this.field798 != -1) {
            var1 = class159.method791(this.field798);
        } else if (this.field799 != -1) {
            var1 = class159.field2693[this.field799];
        }
        return var1 < 0 || var1 >= this.field797.length || this.field797[var1] == -1 ? null : method148(this.field797[var1]);
    }

    @ObfuscatedName("ae.x(I)Z")
    public boolean method609() {
        if (this.field797 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field798 != -1) {
            var1 = class159.method791(this.field798);
        } else if (this.field799 != -1) {
            var1 = class159.field2693[this.field799];
        }
        return var1 >= 0 && var1 < this.field797.length && this.field797[var1] != -1;
    }
}
