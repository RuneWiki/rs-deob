package deob;

@ObfuscatedName("ag")
public class class31 extends class174 {

    @ObfuscatedName("ag.m")
    public static class170 field818 = new class170(64);

    @ObfuscatedName("ag.j")
    public static class170 field786 = new class170(50);

    @ObfuscatedName("ag.o")
    public int field785;

    @ObfuscatedName("ag.l")
    public String field788 = "null";

    @ObfuscatedName("ag.g")
    public int field789 = 1;

    @ObfuscatedName("ag.w")
    public int[] field790;

    @ObfuscatedName("ag.c")
    public int[] field804;

    @ObfuscatedName("ag.z")
    public int field792 = -1;

    @ObfuscatedName("ag.f")
    public int field793 = -1;

    @ObfuscatedName("ag.a")
    public int field803 = -1;

    @ObfuscatedName("ag.d")
    public int field795 = -1;

    @ObfuscatedName("ag.e")
    public int field796 = -1;

    @ObfuscatedName("ag.y")
    public int field797 = -1;

    @ObfuscatedName("ag.k")
    public int field798 = -1;

    @ObfuscatedName("ag.h")
    public short[] field820;

    @ObfuscatedName("ag.x")
    public short[] field794;

    @ObfuscatedName("ag.b")
    public short[] field801;

    @ObfuscatedName("ag.n")
    public short[] field816;

    @ObfuscatedName("ag.q")
    public String[] field799 = new String[5];

    @ObfuscatedName("ag.r")
    public boolean field783 = true;

    @ObfuscatedName("ag.u")
    public int field805 = -1;

    @ObfuscatedName("ag.p")
    public int field806 = 128;

    @ObfuscatedName("ag.t")
    public int field807 = 128;

    @ObfuscatedName("ag.s")
    public boolean field808 = false;

    @ObfuscatedName("ag.ah")
    public int field809 = 0;

    @ObfuscatedName("ag.ar")
    public int field810 = 0;

    @ObfuscatedName("ag.ac")
    public int field811 = -1;

    @ObfuscatedName("ag.as")
    public int field812 = 32;

    @ObfuscatedName("ag.ag")
    public int[] field813;

    @ObfuscatedName("ag.ak")
    public int field814 = -1;

    @ObfuscatedName("ag.am")
    public int field815 = -1;

    @ObfuscatedName("ag.ap")
    public boolean field822 = true;

    @ObfuscatedName("ag.au")
    public boolean field817 = true;

    @ObfuscatedName("ce.i(Ler;Ler;B)V")
    public static void method2164(class152 arg0, class152 arg1) {
        Statics.field800 = arg0;
        Statics.field784 = arg1;
    }

    @ObfuscatedName("cb.v(II)Lag;")
    public static class31 method2076(int arg0) {
        class31 var1 = (class31) field818.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field800.method3032(9, arg0);
        class31 var3 = new class31();
        var3.field785 = arg0;
        if (var2 != null) {
            var3.method618(new class127(var2));
        }
        var3.method617();
        field818.method3307(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.m(B)V")
    public void method617() {
    }

    @ObfuscatedName("ag.j(Lda;B)V")
    public void method618(class127 arg0) {
        while (true) {
            int var2 = arg0.method2491();
            if (var2 == 0) {
                return;
            }
            this.method629(arg0, var2);
        }
    }

    @ObfuscatedName("ag.o(Lda;II)V")
    public void method629(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2491();
            this.field790 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field790[var4] = arg0.method2493();
            }
        } else if (arg1 == 2) {
            this.field788 = arg0.method2500();
        } else if (arg1 == 12) {
            this.field789 = arg0.method2491();
        } else if (arg1 == 13) {
            this.field792 = arg0.method2493();
        } else if (arg1 == 14) {
            this.field795 = arg0.method2493();
        } else if (arg1 == 15) {
            this.field793 = arg0.method2493();
        } else if (arg1 == 16) {
            this.field803 = arg0.method2493();
        } else if (arg1 == 17) {
            this.field795 = arg0.method2493();
            this.field796 = arg0.method2493();
            this.field797 = arg0.method2493();
            this.field798 = arg0.method2493();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field799[arg1 - 30] = arg0.method2500();
            if (this.field799[arg1 - 30].equalsIgnoreCase(class134.field2246)) {
                this.field799[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2491();
            this.field820 = new short[var5];
            this.field794 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field820[var6] = (short) arg0.method2493();
                this.field794[var6] = (short) arg0.method2493();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2491();
            this.field801 = new short[var7];
            this.field816 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field801[var8] = (short) arg0.method2493();
                this.field816[var8] = (short) arg0.method2493();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2491();
            this.field804 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field804[var10] = arg0.method2493();
            }
        } else if (arg1 == 93) {
            this.field783 = false;
        } else if (arg1 == 95) {
            this.field805 = arg0.method2493();
        } else if (arg1 == 97) {
            this.field806 = arg0.method2493();
        } else if (arg1 == 98) {
            this.field807 = arg0.method2493();
        } else if (arg1 == 99) {
            this.field808 = true;
        } else if (arg1 == 100) {
            this.field809 = arg0.method2492();
        } else if (arg1 == 101) {
            this.field810 = arg0.method2492() * 5;
        } else if (arg1 == 102) {
            this.field811 = arg0.method2493();
        } else if (arg1 == 103) {
            this.field812 = arg0.method2493();
        } else if (arg1 == 106) {
            this.field814 = arg0.method2493();
            if (this.field814 == 65535) {
                this.field814 = -1;
            }
            this.field815 = arg0.method2493();
            if (this.field815 == 65535) {
                this.field815 = -1;
            }
            int var11 = arg0.method2491();
            this.field813 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field813[var12] = arg0.method2493();
                if (this.field813[var12] == 65535) {
                    this.field813[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field822 = false;
        } else if (arg1 == 109) {
            this.field817 = false;
        }
    }

    @ObfuscatedName("ag.l(Lap;ILap;II)Ldl;")
    public final class112 method623(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field813 != null) {
            class31 var5 = this.method622();
            return var5 == null ? null : var5.method623(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field786.method3308((long) this.field785);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field790.length; var8++) {
                if (!Statics.field784.method3105(this.field790[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field790.length];
            for (int var10 = 0; var10 < this.field790.length; var10++) {
                var9[var10] = class101.method2081(Statics.field784, this.field790[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field820 != null) {
                for (int var12 = 0; var12 < this.field820.length; var12++) {
                    var11.method2095(this.field820[var12], this.field794[var12]);
                }
            }
            if (this.field801 != null) {
                for (int var13 = 0; var13 < this.field801.length; var13++) {
                    var11.method2152(this.field801[var13], this.field816[var13]);
                }
            }
            var6 = var11.method2102(this.field809 + 64, this.field810 + 850, -30, -50, -30);
            field786.method3307(var6, (long) this.field785);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method723(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method728(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2270(true);
        } else {
            var14 = arg2.method728(var6, arg3);
        }
        if (this.field806 != 128 || this.field807 != 128) {
            var14.method2288(this.field806, this.field807, this.field806);
        }
        return var14;
    }

    @ObfuscatedName("ag.g(B)Lcw;")
    public final class101 method640() {
        if (this.field813 != null) {
            class31 var1 = this.method622();
            return var1 == null ? null : var1.method640();
        } else if (this.field804 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field804.length; var3++) {
                if (!Statics.field784.method3105(this.field804[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field804.length];
            for (int var5 = 0; var5 < this.field804.length; var5++) {
                var4[var5] = class101.method2081(Statics.field784, this.field804[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field820 != null) {
                for (int var7 = 0; var7 < this.field820.length; var7++) {
                    var6.method2095(this.field820[var7], this.field794[var7]);
                }
            }
            if (this.field801 != null) {
                for (int var8 = 0; var8 < this.field801.length; var8++) {
                    var6.method2152(this.field801[var8], this.field816[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ag.w(I)Lag;")
    public final class31 method622() {
        int var1 = -1;
        if (this.field814 != -1) {
            var1 = class159.method923(this.field814);
        } else if (this.field815 != -1) {
            var1 = class159.field2705[this.field815];
        }
        return var1 < 0 || var1 >= this.field813.length || this.field813[var1] == -1 ? null : method2076(this.field813[var1]);
    }

    @ObfuscatedName("ag.c(I)Z")
    public boolean method621() {
        if (this.field813 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field814 != -1) {
            var1 = class159.method923(this.field814);
        } else if (this.field815 != -1) {
            var1 = class159.field2705[this.field815];
        }
        return var1 >= 0 && var1 < this.field813.length && this.field813[var1] != -1;
    }

    @ObfuscatedName("p.z(I)V")
    public static void method231() {
        field818.method3311();
        field786.method3311();
    }
}
