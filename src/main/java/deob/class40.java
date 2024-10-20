package deob;

@ObfuscatedName("aq")
public class class40 extends class204 {

    @ObfuscatedName("aq.o")
    public static class193 field891 = new class193(64);

    @ObfuscatedName("aq.z")
    public static class193 field860 = new class193(50);

    @ObfuscatedName("aq.c")
    public int field861;

    @ObfuscatedName("aq.d")
    public String field862 = "null";

    @ObfuscatedName("aq.l")
    public int field863 = 1;

    @ObfuscatedName("aq.b")
    public int[] field859;

    @ObfuscatedName("aq.j")
    public int[] field865;

    @ObfuscatedName("aq.f")
    public int field866 = -1;

    @ObfuscatedName("aq.i")
    public int field867 = -1;

    @ObfuscatedName("aq.g")
    public int field868 = -1;

    @ObfuscatedName("aq.t")
    public int field869 = -1;

    @ObfuscatedName("aq.e")
    public int field870 = -1;

    @ObfuscatedName("aq.q")
    public int field881 = -1;

    @ObfuscatedName("aq.u")
    public int field872 = -1;

    @ObfuscatedName("aq.r")
    public short[] field873;

    @ObfuscatedName("aq.a")
    public short[] field885;

    @ObfuscatedName("aq.m")
    public short[] field875;

    @ObfuscatedName("aq.y")
    public short[] field876;

    @ObfuscatedName("aq.x")
    public String[] field889 = new String[5];

    @ObfuscatedName("aq.n")
    public boolean field874 = true;

    @ObfuscatedName("aq.v")
    public int field879 = -1;

    @ObfuscatedName("aq.s")
    public int field880 = 128;

    @ObfuscatedName("aq.w")
    public int field871 = 128;

    @ObfuscatedName("aq.p")
    public boolean field894 = false;

    @ObfuscatedName("aq.ao")
    public int field883 = 0;

    @ObfuscatedName("aq.ae")
    public int field884 = 0;

    @ObfuscatedName("aq.ay")
    public int field857 = -1;

    @ObfuscatedName("aq.ad")
    public int field886 = 32;

    @ObfuscatedName("aq.as")
    public int[] field877;

    @ObfuscatedName("aq.ag")
    public int field888 = -1;

    @ObfuscatedName("aq.au")
    public int field864 = -1;

    @ObfuscatedName("aq.ar")
    public boolean field890 = true;

    @ObfuscatedName("aq.az")
    public boolean field882 = true;

    @ObfuscatedName("aq.aw")
    public boolean field892 = false;

    @ObfuscatedName("aq.at")
    public int field893 = 30;

    @ObfuscatedName("o.k(Lfo;Lfo;I)V")
    public static void method32(class167 arg0, class167 arg1) {
        Statics.field887 = arg0;
        Statics.field858 = arg1;
    }

    @ObfuscatedName("b.h(IB)Laq;")
    public static class40 method96(int arg0) {
        class40 var1 = (class40) field891.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field887.method3118(9, arg0);
        class40 var3 = new class40();
        var3.field861 = arg0;
        if (var2 != null) {
            var3.method710(new class119(var2));
        }
        var3.method741();
        field891.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.o(I)V")
    public void method741() {
    }

    @ObfuscatedName("aq.z(Ldk;B)V")
    public void method710(class119 arg0) {
        while (true) {
            int var2 = arg0.method2330();
            if (var2 == 0) {
                return;
            }
            this.method713(arg0, var2);
        }
    }

    @ObfuscatedName("aq.c(Ldk;IB)V")
    public void method713(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2330();
            this.field859 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field859[var4] = arg0.method2332();
            }
        } else if (arg1 == 2) {
            this.field862 = arg0.method2337();
        } else if (arg1 == 12) {
            this.field863 = arg0.method2330();
        } else if (arg1 == 13) {
            this.field866 = arg0.method2332();
        } else if (arg1 == 14) {
            this.field869 = arg0.method2332();
        } else if (arg1 == 15) {
            this.field867 = arg0.method2332();
        } else if (arg1 == 16) {
            this.field868 = arg0.method2332();
        } else if (arg1 == 17) {
            this.field869 = arg0.method2332();
            this.field870 = arg0.method2332();
            this.field881 = arg0.method2332();
            this.field872 = arg0.method2332();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field889[arg1 - 30] = arg0.method2337();
            if (this.field889[arg1 - 30].equalsIgnoreCase(class157.field2296)) {
                this.field889[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2330();
            this.field873 = new short[var5];
            this.field885 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field873[var6] = (short) arg0.method2332();
                this.field885[var6] = (short) arg0.method2332();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2330();
            this.field875 = new short[var7];
            this.field876 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field875[var8] = (short) arg0.method2332();
                this.field876[var8] = (short) arg0.method2332();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2330();
            this.field865 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field865[var10] = arg0.method2332();
            }
        } else if (arg1 == 93) {
            this.field874 = false;
        } else if (arg1 == 95) {
            this.field879 = arg0.method2332();
        } else if (arg1 == 97) {
            this.field880 = arg0.method2332();
        } else if (arg1 == 98) {
            this.field871 = arg0.method2332();
        } else if (arg1 == 99) {
            this.field894 = true;
        } else if (arg1 == 100) {
            this.field883 = arg0.method2413();
        } else if (arg1 == 101) {
            this.field884 = arg0.method2413();
        } else if (arg1 == 102) {
            this.field857 = arg0.method2332();
        } else if (arg1 == 103) {
            this.field886 = arg0.method2332();
        } else if (arg1 == 106) {
            this.field888 = arg0.method2332();
            if (this.field888 == 65535) {
                this.field888 = -1;
            }
            this.field864 = arg0.method2332();
            if (this.field864 == 65535) {
                this.field864 = -1;
            }
            int var11 = arg0.method2330();
            this.field877 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field877[var12] = arg0.method2332();
                if (this.field877[var12] == 65535) {
                    this.field877[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field890 = false;
        } else if (arg1 == 109) {
            this.field882 = false;
        } else if (arg1 == 111) {
            this.field892 = true;
        } else if (arg1 == 112) {
            this.field893 = arg0.method2330();
        }
    }

    @ObfuscatedName("aq.d(Lah;ILah;IB)Ldl;")
    public final class105 method726(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field877 != null) {
            class40 var5 = this.method714();
            return var5 == null ? null : var5.method726(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field860.method3510((long) this.field861);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field859.length; var8++) {
                if (!Statics.field858.method3051(this.field859[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field859.length];
            for (int var10 = 0; var10 < this.field859.length; var10++) {
                var9[var10] = class100.method2051(Statics.field858, this.field859[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field873 != null) {
                for (int var12 = 0; var12 < this.field873.length; var12++) {
                    var11.method2064(this.field873[var12], this.field885[var12]);
                }
            }
            if (this.field875 != null) {
                for (int var13 = 0; var13 < this.field875.length; var13++) {
                    var11.method2070(this.field875[var13], this.field876[var13]);
                }
            }
            var6 = var11.method2089(this.field883 + 64, this.field884 * 5 + 850, -30, -50, -30);
            field860.method3512(var6, (long) this.field861);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method806(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method805(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2138(true);
        } else {
            var14 = arg2.method805(var6, arg3);
        }
        if (this.field880 != 128 || this.field871 != 128) {
            var14.method2152(this.field880, this.field871, this.field880);
        }
        return var14;
    }

    @ObfuscatedName("aq.l(I)Lcg;")
    public final class100 method718() {
        if (this.field877 != null) {
            class40 var1 = this.method714();
            return var1 == null ? null : var1.method718();
        } else if (this.field865 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field865.length; var3++) {
                if (!Statics.field858.method3051(this.field865[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field865.length];
            for (int var5 = 0; var5 < this.field865.length; var5++) {
                var4[var5] = class100.method2051(Statics.field858, this.field865[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field873 != null) {
                for (int var7 = 0; var7 < this.field873.length; var7++) {
                    var6.method2064(this.field873[var7], this.field885[var7]);
                }
            }
            if (this.field875 != null) {
                for (int var8 = 0; var8 < this.field875.length; var8++) {
                    var6.method2070(this.field875[var8], this.field876[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aq.b(I)Laq;")
    public final class40 method714() {
        int var1 = -1;
        if (this.field888 != -1) {
            var1 = class176.method3506(this.field888);
        } else if (this.field864 != -1) {
            var1 = class176.field2886[this.field864];
        }
        return var1 < 0 || var1 >= this.field877.length || this.field877[var1] == -1 ? null : method96(this.field877[var1]);
    }

    @ObfuscatedName("aq.j(I)Z")
    public boolean method715() {
        if (this.field877 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field888 != -1) {
            var1 = class176.method3506(this.field888);
        } else if (this.field864 != -1) {
            var1 = class176.field2886[this.field864];
        }
        return var1 >= 0 && var1 < this.field877.length && this.field877[var1] != -1;
    }

    @ObfuscatedName("ap.f(I)V")
    public static void method702() {
        field891.method3518();
        field860.method3518();
    }
}
