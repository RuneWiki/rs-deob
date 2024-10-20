package deob;

@ObfuscatedName("ak")
public class class34 extends class174 {

    @ObfuscatedName("ak.r")
    public static class170 field868 = new class170(64);

    @ObfuscatedName("ak.n")
    public static class170 field885 = new class170(100);

    @ObfuscatedName("ak.i")
    public int[] field870;

    @ObfuscatedName("ak.s")
    public int[] field869;

    @ObfuscatedName("ak.w")
    public int[] field872;

    @ObfuscatedName("ak.d")
    public int[] field873;

    @ObfuscatedName("ak.t")
    public int field874 = -1;

    @ObfuscatedName("ak.f")
    public int[] field887;

    @ObfuscatedName("ak.b")
    public boolean field876 = false;

    @ObfuscatedName("ak.z")
    public int field875 = 5;

    @ObfuscatedName("ak.l")
    public int field877 = -1;

    @ObfuscatedName("ak.e")
    public int field878 = -1;

    @ObfuscatedName("ak.p")
    public int field880 = 99;

    @ObfuscatedName("ak.o")
    public int field881 = -1;

    @ObfuscatedName("ak.h")
    public int field865 = -1;

    @ObfuscatedName("ak.j")
    public int field884 = 2;

    @ObfuscatedName("ep.g(Leo;Leo;Leo;B)V")
    public static void method2654(class152 arg0, class152 arg1, class152 arg2) {
        Statics.field866 = arg0;
        Statics.field871 = arg1;
        Statics.field867 = arg2;
    }

    @ObfuscatedName("bh.m(II)Lak;")
    public static class34 method1536(int arg0) {
        class34 var1 = (class34) field868.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field866.method2968(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method717(new class127(var2));
        }
        var3.method700();
        field868.method3249(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.v(Ldr;I)V")
    public void method717(class127 arg0) {
        while (true) {
            int var2 = arg0.method2414();
            if (var2 == 0) {
                return;
            }
            this.method699(arg0, var2);
        }
    }

    @ObfuscatedName("ak.r(Ldr;II)V")
    public void method699(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2416();
            this.field872 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field872[var4] = arg0.method2416();
            }
            this.field870 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field870[var5] = arg0.method2416();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field870[var6] += arg0.method2416() << 16;
            }
        } else if (arg1 == 2) {
            this.field874 = arg0.method2416();
        } else if (arg1 == 3) {
            int var7 = arg0.method2414();
            this.field887 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field887[var8] = arg0.method2414();
            }
            this.field887[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field876 = true;
        } else if (arg1 == 5) {
            this.field875 = arg0.method2414();
        } else if (arg1 == 6) {
            this.field877 = arg0.method2416();
        } else if (arg1 == 7) {
            this.field878 = arg0.method2416();
        } else if (arg1 == 8) {
            this.field880 = arg0.method2414();
        } else if (arg1 == 9) {
            this.field881 = arg0.method2414();
        } else if (arg1 == 10) {
            this.field865 = arg0.method2414();
        } else if (arg1 == 11) {
            this.field884 = arg0.method2414();
        } else if (arg1 == 12) {
            int var9 = arg0.method2414();
            this.field869 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field869[var10] = arg0.method2416();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field869[var11] += arg0.method2416() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2414();
            this.field873 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field873[var13] = arg0.method2479();
            }
        }
    }

    @ObfuscatedName("ak.n(I)V")
    public void method700() {
        if (this.field881 == -1) {
            if (this.field887 == null) {
                this.field881 = 0;
            } else {
                this.field881 = 2;
            }
        }
        if (this.field865 != -1) {
            return;
        }
        if (this.field887 == null) {
            this.field865 = 0;
        } else {
            this.field865 = 2;
        }
    }

    @ObfuscatedName("ak.i(Ldf;IB)Ldf;")
    public class112 method701(class112 arg0, int arg1) {
        int var3 = this.field870[arg1];
        class109 var4 = method565(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2262(true);
        } else {
            class112 var6 = arg0.method2262(!var4.method2185(var5));
            var6.method2210(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ak.s(Ldf;III)Ldf;")
    public class112 method702(class112 arg0, int arg1, int arg2) {
        int var4 = this.field870[arg1];
        class109 var5 = method565(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2262(true);
        }
        class112 var7 = arg0.method2262(!var5.method2185(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2213();
        } else if (var8 == 2) {
            var7.method2283();
        } else if (var8 == 3) {
            var7.method2214();
        }
        var7.method2210(var5, var6);
        if (var8 == 1) {
            var7.method2214();
        } else if (var8 == 2) {
            var7.method2283();
        } else if (var8 == 3) {
            var7.method2213();
        }
        return var7;
    }

    @ObfuscatedName("ak.w(Ldf;IB)Ldf;")
    public class112 method722(class112 arg0, int arg1) {
        int var3 = this.field870[arg1];
        class109 var4 = method565(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2205(true);
        } else {
            class112 var6 = arg0.method2205(!var4.method2185(var5));
            var6.method2210(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ak.d(Ldf;ILak;II)Ldf;")
    public class112 method703(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field870[arg1];
        class109 var6 = method565(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method701(arg0, arg3);
        }
        int var8 = arg2.field870[arg3];
        class109 var9 = method565(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2262(!var6.method2185(var7));
            var11.method2210(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2262(!var6.method2185(var7) & !var9.method2185(var10));
            var12.method2202(var6, var7, var9, var10, this.field887);
            return var12;
        }
    }

    @ObfuscatedName("ak.t(Ldf;II)Ldf;")
    public class112 method718(class112 arg0, int arg1) {
        int var3 = this.field870[arg1];
        class109 var4 = method565(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2262(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field869 != null && arg1 < this.field869.length) {
            int var8 = this.field869[arg1];
            var6 = method565(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2262(!var4.method2185(var5));
            var10.method2210(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2262(!var4.method2185(var5) & !var6.method2185(var7));
            var9.method2210(var4, var5);
            var9.method2210(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("au.f(II)Ldw;")
    public static class109 method565(int arg0) {
        class109 var1 = (class109) field885.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class152 var2 = Statics.field871;
        class152 var3 = Statics.field867;
        boolean var4 = true;
        int[] var5 = var2.method2977(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2974(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2974(var8, 0);
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
            field885.method3249(var10, (long) arg0);
        }
        return var10;
    }
}
