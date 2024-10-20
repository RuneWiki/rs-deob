package deob;

@ObfuscatedName("av")
public class class34 extends class175 {

    @ObfuscatedName("av.w")
    public static class171 field870 = new class171(64);

    @ObfuscatedName("av.r")
    public static class171 field871 = new class171(100);

    @ObfuscatedName("av.k")
    public int[] field872;

    @ObfuscatedName("av.z")
    public int[] field873;

    @ObfuscatedName("av.g")
    public int[] field877;

    @ObfuscatedName("av.n")
    public int[] field875;

    @ObfuscatedName("av.j")
    public int field876 = -1;

    @ObfuscatedName("av.c")
    public int[] field874;

    @ObfuscatedName("av.m")
    public boolean field886 = false;

    @ObfuscatedName("av.a")
    public int field884 = 5;

    @ObfuscatedName("av.e")
    public int field880 = -1;

    @ObfuscatedName("av.q")
    public int field881 = -1;

    @ObfuscatedName("av.y")
    public int field879 = 99;

    @ObfuscatedName("av.v")
    public int field883 = -1;

    @ObfuscatedName("av.s")
    public int field868 = -1;

    @ObfuscatedName("av.u")
    public int field885 = 2;

    @ObfuscatedName("dp.l(II)Lav;")
    public static class34 method2198(int arg0) {
        class34 var1 = (class34) field870.method3255((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field882.method3029(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method703(new class127(var2));
        }
        var3.method709();
        field870.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.b(Ldm;B)V")
    public void method703(class127 arg0) {
        while (true) {
            int var2 = arg0.method2440();
            if (var2 == 0) {
                return;
            }
            this.method704(arg0, var2);
        }
    }

    @ObfuscatedName("av.o(Ldm;II)V")
    public void method704(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2442();
            this.field877 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field877[var4] = arg0.method2442();
            }
            this.field872 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field872[var5] = arg0.method2442();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field872[var6] += arg0.method2442() << 16;
            }
        } else if (arg1 == 2) {
            this.field876 = arg0.method2442();
        } else if (arg1 == 3) {
            int var7 = arg0.method2440();
            this.field874 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field874[var8] = arg0.method2440();
            }
            this.field874[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field886 = true;
        } else if (arg1 == 5) {
            this.field884 = arg0.method2440();
        } else if (arg1 == 6) {
            this.field880 = arg0.method2442();
        } else if (arg1 == 7) {
            this.field881 = arg0.method2442();
        } else if (arg1 == 8) {
            this.field879 = arg0.method2440();
        } else if (arg1 == 9) {
            this.field883 = arg0.method2440();
        } else if (arg1 == 10) {
            this.field868 = arg0.method2440();
        } else if (arg1 == 11) {
            this.field885 = arg0.method2440();
        } else if (arg1 == 12) {
            int var9 = arg0.method2440();
            this.field873 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field873[var10] = arg0.method2442();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field873[var11] += arg0.method2442() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2440();
            this.field875 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field875[var13] = arg0.method2441();
            }
        }
    }

    @ObfuscatedName("av.w(B)V")
    public void method709() {
        if (this.field883 == -1) {
            if (this.field874 == null) {
                this.field883 = 0;
            } else {
                this.field883 = 2;
            }
        }
        if (this.field868 != -1) {
            return;
        }
        if (this.field874 == null) {
            this.field868 = 0;
        } else {
            this.field868 = 2;
        }
    }

    @ObfuscatedName("av.r(Ldt;II)Ldt;")
    public class112 method706(class112 arg0, int arg1) {
        int var3 = this.field872[arg1];
        class109 var4 = method604(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2227(true);
        } else {
            class112 var6 = arg0.method2227(!var4.method2205(var5));
            var6.method2233(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("av.k(Ldt;III)Ldt;")
    public class112 method737(class112 arg0, int arg1, int arg2) {
        int var4 = this.field872[arg1];
        class109 var5 = method604(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2227(true);
        }
        class112 var7 = arg0.method2227(!var5.method2205(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2238();
        } else if (var8 == 2) {
            var7.method2237();
        } else if (var8 == 3) {
            var7.method2236();
        }
        var7.method2233(var5, var6);
        if (var8 == 1) {
            var7.method2236();
        } else if (var8 == 2) {
            var7.method2237();
        } else if (var8 == 3) {
            var7.method2238();
        }
        return var7;
    }

    @ObfuscatedName("av.z(Ldt;II)Ldt;")
    public class112 method707(class112 arg0, int arg1) {
        int var3 = this.field872[arg1];
        class109 var4 = method604(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2251(true);
        } else {
            class112 var6 = arg0.method2251(!var4.method2205(var5));
            var6.method2233(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("av.g(Ldt;ILav;II)Ldt;")
    public class112 method733(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field872[arg1];
        class109 var6 = method604(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method706(arg0, arg3);
        }
        int var8 = arg2.field872[arg3];
        class109 var9 = method604(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2227(!var6.method2205(var7));
            var11.method2233(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2227(!var6.method2205(var7) & !var9.method2205(var10));
            var12.method2273(var6, var7, var9, var10, this.field874);
            return var12;
        }
    }

    @ObfuscatedName("av.n(Ldt;II)Ldt;")
    public class112 method735(class112 arg0, int arg1) {
        int var3 = this.field872[arg1];
        class109 var4 = method604(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2227(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field873 != null && arg1 < this.field873.length) {
            int var8 = this.field873[arg1];
            var6 = method604(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2227(!var4.method2205(var5));
            var10.method2233(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2227(!var4.method2205(var5) & !var6.method2205(var7));
            var9.method2233(var4, var5);
            var9.method2233(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ad.j(IB)Lde;")
    public static class109 method604(int arg0) {
        class109 var1 = (class109) field871.method3255((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class154 var2 = Statics.field867;
        class154 var3 = Statics.field869;
        boolean var4 = true;
        int[] var5 = var2.method3038(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3084(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3084(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class109 var10;
        if (var4) {
            try {
                var10 = new class109(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field871.method3253(var10, (long) arg0);
        }
        return var10;
    }
}
