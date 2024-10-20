package deob;

@ObfuscatedName("aw")
public class class38 extends class181 {

    @ObfuscatedName("aw.y")
    public static class171 field870 = new class171(64);

    @ObfuscatedName("aw.i")
    public static class171 field869 = new class171(100);

    @ObfuscatedName("aw.b")
    public int[] field872;

    @ObfuscatedName("aw.s")
    public int[] field873;

    @ObfuscatedName("aw.q")
    public int[] field867;

    @ObfuscatedName("aw.p")
    public int[] field875;

    @ObfuscatedName("aw.h")
    public int field883 = -1;

    @ObfuscatedName("aw.r")
    public int[] field877;

    @ObfuscatedName("aw.o")
    public boolean field878 = false;

    @ObfuscatedName("aw.f")
    public int field876 = 5;

    @ObfuscatedName("aw.u")
    public int field884 = -1;

    @ObfuscatedName("aw.c")
    public int field881 = -1;

    @ObfuscatedName("aw.l")
    public int field882 = 99;

    @ObfuscatedName("aw.w")
    public int field886 = -1;

    @ObfuscatedName("aw.x")
    public int field880 = -1;

    @ObfuscatedName("aw.t")
    public int field885 = 2;

    @ObfuscatedName("s.z(IB)Law;")
    public static class38 method84(int arg0) {
        class38 var1 = (class38) field870.method3162((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field889.method2705(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method686(new class107(var2));
        }
        var3.method689();
        field870.method3171(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.j(Ldq;I)V")
    public void method686(class107 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method688(arg0, var2);
        }
    }

    @ObfuscatedName("aw.a(Ldq;II)V")
    public void method688(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2239();
            this.field867 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field867[var4] = arg0.method2239();
            }
            this.field872 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field872[var5] = arg0.method2239();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field872[var6] += arg0.method2239() << 16;
            }
        } else if (arg1 == 2) {
            this.field883 = arg0.method2239();
        } else if (arg1 == 3) {
            int var7 = arg0.method2122();
            this.field877 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field877[var8] = arg0.method2122();
            }
            this.field877[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field878 = true;
        } else if (arg1 == 5) {
            this.field876 = arg0.method2122();
        } else if (arg1 == 6) {
            this.field884 = arg0.method2239();
        } else if (arg1 == 7) {
            this.field881 = arg0.method2239();
        } else if (arg1 == 8) {
            this.field882 = arg0.method2122();
        } else if (arg1 == 9) {
            this.field886 = arg0.method2122();
        } else if (arg1 == 10) {
            this.field880 = arg0.method2122();
        } else if (arg1 == 11) {
            this.field885 = arg0.method2122();
        } else if (arg1 == 12) {
            int var9 = arg0.method2122();
            this.field873 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field873[var10] = arg0.method2239();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field873[var11] += arg0.method2239() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2122();
            this.field875 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field875[var13] = arg0.method2212();
            }
        }
    }

    @ObfuscatedName("aw.y(I)V")
    public void method689() {
        if (this.field886 == -1) {
            if (this.field877 == null) {
                this.field886 = 0;
            } else {
                this.field886 = 2;
            }
        }
        if (this.field880 != -1) {
            return;
        }
        if (this.field877 == null) {
            this.field880 = 0;
        } else {
            this.field880 = 2;
        }
    }

    @ObfuscatedName("aw.i(Lcu;IB)Lcu;")
    public class98 method718(class98 arg0, int arg1) {
        int var3 = this.field872[arg1];
        class96 var4 = Statics.method143(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1999(true);
        } else {
            class98 var6 = arg0.method1999(!var4.method1969(var5));
            var6.method1984(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aw.b(Lcu;III)Lcu;")
    public class98 method708(class98 arg0, int arg1, int arg2) {
        int var4 = this.field872[arg1];
        class96 var5 = Statics.method143(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1999(true);
        }
        class98 var7 = arg0.method1999(!var5.method1969(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1989();
        } else if (var8 == 2) {
            var7.method1988();
        } else if (var8 == 3) {
            var7.method2045();
        }
        var7.method1984(var5, var6);
        if (var8 == 1) {
            var7.method2045();
        } else if (var8 == 2) {
            var7.method1988();
        } else if (var8 == 3) {
            var7.method1989();
        }
        return var7;
    }

    @ObfuscatedName("aw.s(Lcu;II)Lcu;")
    public class98 method692(class98 arg0, int arg1) {
        int var3 = this.field872[arg1];
        class96 var4 = Statics.method143(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1979(true);
        } else {
            class98 var6 = arg0.method1979(!var4.method1969(var5));
            var6.method1984(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aw.q(Lcu;ILaw;II)Lcu;")
    public class98 method690(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field872[arg1];
        class96 var6 = Statics.method143(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method718(arg0, arg3);
        }
        int var8 = arg2.field872[arg3];
        class96 var9 = Statics.method143(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method1999(!var6.method1969(var7));
            var11.method1984(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method1999(!var6.method1969(var7) & !var9.method1969(var10));
            var12.method1985(var6, var7, var9, var10, this.field877);
            return var12;
        }
    }

    @ObfuscatedName("aw.p(Lcu;IB)Lcu;")
    public class98 method714(class98 arg0, int arg1) {
        int var3 = this.field872[arg1];
        class96 var4 = Statics.method143(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1999(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field873 != null && arg1 < this.field873.length) {
            int var8 = this.field873[arg1];
            var6 = Statics.method143(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method1999(!var4.method1969(var5));
            var10.method1984(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method1999(!var4.method1969(var5) & !var6.method1969(var7));
            var9.method1984(var4, var5);
            var9.method1984(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ct.r(I)V")
    public static void method2062() {
        field870.method3164();
        field869.method3164();
    }
}
