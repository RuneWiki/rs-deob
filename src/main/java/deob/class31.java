package deob;

@ObfuscatedName("aa")
public class class31 extends class174 {

    @ObfuscatedName("aa.a")
    public static class170 field784 = new class170(64);

    @ObfuscatedName("aa.l")
    public static class170 field785 = new class170(50);

    @ObfuscatedName("aa.q")
    public int field786;

    @ObfuscatedName("aa.b")
    public String field787 = "null";

    @ObfuscatedName("aa.u")
    public int field790 = 1;

    @ObfuscatedName("aa.d")
    public int[] field789;

    @ObfuscatedName("aa.m")
    public int[] field817;

    @ObfuscatedName("aa.v")
    public int field791 = -1;

    @ObfuscatedName("aa.j")
    public int field792 = -1;

    @ObfuscatedName("aa.f")
    public int field793 = -1;

    @ObfuscatedName("aa.h")
    public int field794 = -1;

    @ObfuscatedName("aa.o")
    public int field803 = -1;

    @ObfuscatedName("aa.z")
    public int field796 = -1;

    @ObfuscatedName("aa.k")
    public int field816 = -1;

    @ObfuscatedName("aa.y")
    public short[] field798;

    @ObfuscatedName("aa.g")
    public short[] field799;

    @ObfuscatedName("aa.e")
    public short[] field800;

    @ObfuscatedName("aa.s")
    public short[] field801;

    @ObfuscatedName("aa.t")
    public String[] field802 = new String[5];

    @ObfuscatedName("aa.r")
    public boolean field807 = true;

    @ObfuscatedName("aa.w")
    public int field809 = -1;

    @ObfuscatedName("aa.x")
    public int field805 = 128;

    @ObfuscatedName("aa.n")
    public int field806 = 128;

    @ObfuscatedName("aa.c")
    public boolean field783 = false;

    @ObfuscatedName("aa.az")
    public int field808 = 0;

    @ObfuscatedName("aa.ax")
    public int field819 = 0;

    @ObfuscatedName("aa.aq")
    public int field810 = -1;

    @ObfuscatedName("aa.ap")
    public int field811 = 32;

    @ObfuscatedName("aa.aa")
    public int[] field812;

    @ObfuscatedName("aa.ai")
    public int field813 = -1;

    @ObfuscatedName("aa.ar")
    public int field814 = -1;

    @ObfuscatedName("aa.ag")
    public boolean field788 = true;

    @ObfuscatedName("aa.as")
    public boolean field795 = true;

    @ObfuscatedName("bj.i(Lef;Lef;B)V")
    public static void method1526(class152 arg0, class152 arg1) {
        Statics.field804 = arg0;
        Statics.field782 = arg1;
    }

    @ObfuscatedName("n.p(II)Laa;")
    public static class31 method246(int arg0) {
        class31 var1 = (class31) field784.method3223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field804.method2932(9, arg0);
        class31 var3 = new class31();
        var3.field786 = arg0;
        if (var2 != null) {
            var3.method623(new class127(var2));
        }
        var3.method606();
        field784.method3225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.a(I)V")
    public void method606() {
    }

    @ObfuscatedName("aa.l(Ldn;I)V")
    public void method623(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method602(arg0, var2);
        }
    }

    @ObfuscatedName("aa.q(Ldn;II)V")
    public void method602(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2411();
            this.field789 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field789[var4] = arg0.method2413();
            }
        } else if (arg1 == 2) {
            this.field787 = arg0.method2419();
        } else if (arg1 == 12) {
            this.field790 = arg0.method2411();
        } else if (arg1 == 13) {
            this.field791 = arg0.method2413();
        } else if (arg1 == 14) {
            this.field794 = arg0.method2413();
        } else if (arg1 == 15) {
            this.field792 = arg0.method2413();
        } else if (arg1 == 16) {
            this.field793 = arg0.method2413();
        } else if (arg1 == 17) {
            this.field794 = arg0.method2413();
            this.field803 = arg0.method2413();
            this.field796 = arg0.method2413();
            this.field816 = arg0.method2413();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field802[arg1 - 30] = arg0.method2419();
            if (this.field802[arg1 - 30].equalsIgnoreCase(class134.field2089)) {
                this.field802[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2411();
            this.field798 = new short[var5];
            this.field799 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field798[var6] = (short) arg0.method2413();
                this.field799[var6] = (short) arg0.method2413();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2411();
            this.field800 = new short[var7];
            this.field801 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field800[var8] = (short) arg0.method2413();
                this.field801[var8] = (short) arg0.method2413();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2411();
            this.field817 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field817[var10] = arg0.method2413();
            }
        } else if (arg1 == 93) {
            this.field807 = false;
        } else if (arg1 == 95) {
            this.field809 = arg0.method2413();
        } else if (arg1 == 97) {
            this.field805 = arg0.method2413();
        } else if (arg1 == 98) {
            this.field806 = arg0.method2413();
        } else if (arg1 == 99) {
            this.field783 = true;
        } else if (arg1 == 100) {
            this.field808 = arg0.method2475();
        } else if (arg1 == 101) {
            this.field819 = arg0.method2475() * 5;
        } else if (arg1 == 102) {
            this.field810 = arg0.method2413();
        } else if (arg1 == 103) {
            this.field811 = arg0.method2413();
        } else if (arg1 == 106) {
            this.field813 = arg0.method2413();
            if (this.field813 == 65535) {
                this.field813 = -1;
            }
            this.field814 = arg0.method2413();
            if (this.field814 == 65535) {
                this.field814 = -1;
            }
            int var11 = arg0.method2411();
            this.field812 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field812[var12] = arg0.method2413();
                if (this.field812[var12] == 65535) {
                    this.field812[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field788 = false;
        } else if (arg1 == 109) {
            this.field795 = false;
        }
    }

    @ObfuscatedName("aa.b(Lag;ILag;II)Ldc;")
    public final class112 method600(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field812 != null) {
            class31 var5 = this.method603();
            return var5 == null ? null : var5.method600(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field785.method3223((long) this.field786);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field789.length; var8++) {
                if (!Statics.field782.method2937(this.field789[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field789.length];
            for (int var10 = 0; var10 < this.field789.length; var10++) {
                var9[var10] = class101.method2035(Statics.field782, this.field789[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field798 != null) {
                for (int var12 = 0; var12 < this.field798.length; var12++) {
                    var11.method1999(this.field798[var12], this.field799[var12]);
                }
            }
            if (this.field800 != null) {
                for (int var13 = 0; var13 < this.field800.length; var13++) {
                    var11.method2029(this.field800[var13], this.field801[var13]);
                }
            }
            var6 = var11.method2006(this.field808 + 64, this.field819 + 850, -30, -50, -30);
            field785.method3225(var6, (long) this.field786);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method695(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method692(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2239(true);
        } else {
            var14 = arg2.method692(var6, arg3);
        }
        if (this.field805 != 128 || this.field806 != 128) {
            var14.method2185(this.field805, this.field806, this.field805);
        }
        return var14;
    }

    @ObfuscatedName("aa.u(B)Lcm;")
    public final class101 method604() {
        if (this.field812 != null) {
            class31 var1 = this.method603();
            return var1 == null ? null : var1.method604();
        } else if (this.field817 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field817.length; var3++) {
                if (!Statics.field782.method2937(this.field817[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field817.length];
            for (int var5 = 0; var5 < this.field817.length; var5++) {
                var4[var5] = class101.method2035(Statics.field782, this.field817[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field798 != null) {
                for (int var7 = 0; var7 < this.field798.length; var7++) {
                    var6.method1999(this.field798[var7], this.field799[var7]);
                }
            }
            if (this.field800 != null) {
                for (int var8 = 0; var8 < this.field800.length; var8++) {
                    var6.method2029(this.field800[var8], this.field801[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aa.d(I)Laa;")
    public final class31 method603() {
        int var1 = -1;
        if (this.field813 != -1) {
            var1 = class159.method1461(this.field813);
        } else if (this.field814 != -1) {
            var1 = class159.field2709[this.field814];
        }
        return var1 < 0 || var1 >= this.field812.length || this.field812[var1] == -1 ? null : method246(this.field812[var1]);
    }

    @ObfuscatedName("aa.m(I)Z")
    public boolean method601() {
        if (this.field812 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field813 != -1) {
            var1 = class159.method1461(this.field813);
        } else if (this.field814 != -1) {
            var1 = class159.field2709[this.field814];
        }
        return var1 >= 0 && var1 < this.field812.length && this.field812[var1] != -1;
    }
}
