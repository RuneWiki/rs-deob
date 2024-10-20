package deob;

@ObfuscatedName("ar")
public class class34 extends class174 {

    @ObfuscatedName("ar.x")
    public static class170 field885 = new class170(64);

    @ObfuscatedName("ar.o")
    public static class170 field886 = new class170(100);

    @ObfuscatedName("ar.a")
    public int[] field869;

    @ObfuscatedName("ar.w")
    public int[] field870;

    @ObfuscatedName("ar.i")
    public int[] field871;

    @ObfuscatedName("ar.y")
    public int[] field872;

    @ObfuscatedName("ar.m")
    public int field873 = -1;

    @ObfuscatedName("ar.u")
    public int[] field884;

    @ObfuscatedName("ar.s")
    public boolean field875 = false;

    @ObfuscatedName("ar.e")
    public int field876 = 5;

    @ObfuscatedName("ar.r")
    public int field868 = -1;

    @ObfuscatedName("ar.n")
    public int field878 = -1;

    @ObfuscatedName("ar.g")
    public int field874 = 99;

    @ObfuscatedName("ar.c")
    public int field880 = -1;

    @ObfuscatedName("ar.v")
    public int field867 = -1;

    @ObfuscatedName("ar.b")
    public int field864 = 2;

    @ObfuscatedName("o.p(Leh;Leh;Leh;I)V")
    public static void method32(class153 arg0, class153 arg1, class153 arg2) {
        Statics.field877 = arg0;
        Statics.field865 = arg1;
        Statics.field866 = arg2;
    }

    @ObfuscatedName("m.l(II)Lar;")
    public static class34 method93(int arg0) {
        class34 var1 = (class34) field885.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field877.method3078(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method707(new class127(var2));
        }
        var3.method709();
        field885.method3364(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.d(Lds;I)V")
    public void method707(class127 arg0) {
        while (true) {
            int var2 = arg0.method2498();
            if (var2 == 0) {
                return;
            }
            this.method708(arg0, var2);
        }
    }

    @ObfuscatedName("ar.x(Lds;IB)V")
    public void method708(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2581();
            this.field871 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field871[var4] = arg0.method2581();
            }
            this.field869 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field869[var5] = arg0.method2581();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field869[var6] += arg0.method2581() << 16;
            }
        } else if (arg1 == 2) {
            this.field873 = arg0.method2581();
        } else if (arg1 == 3) {
            int var7 = arg0.method2498();
            this.field884 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field884[var8] = arg0.method2498();
            }
            this.field884[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field875 = true;
        } else if (arg1 == 5) {
            this.field876 = arg0.method2498();
        } else if (arg1 == 6) {
            this.field868 = arg0.method2581();
        } else if (arg1 == 7) {
            this.field878 = arg0.method2581();
        } else if (arg1 == 8) {
            this.field874 = arg0.method2498();
        } else if (arg1 == 9) {
            this.field880 = arg0.method2498();
        } else if (arg1 == 10) {
            this.field867 = arg0.method2498();
        } else if (arg1 == 11) {
            this.field864 = arg0.method2498();
        } else if (arg1 == 12) {
            int var9 = arg0.method2498();
            this.field870 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field870[var10] = arg0.method2581();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field870[var11] += arg0.method2581() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2498();
            this.field872 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field872[var13] = arg0.method2502();
            }
        }
    }

    @ObfuscatedName("ar.o(S)V")
    public void method709() {
        if (this.field880 == -1) {
            if (this.field884 == null) {
                this.field880 = 0;
            } else {
                this.field880 = 2;
            }
        }
        if (this.field867 != -1) {
            return;
        }
        if (this.field884 == null) {
            this.field867 = 0;
        } else {
            this.field867 = 2;
        }
    }

    @ObfuscatedName("ar.a(Ldl;IB)Ldl;")
    public class112 method710(class112 arg0, int arg1) {
        int var3 = this.field869[arg1];
        class109 var4 = method100(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2271(true);
        } else {
            class112 var6 = arg0.method2271(!var4.method2248(var5));
            var6.method2306(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.w(Ldl;IIB)Ldl;")
    public class112 method733(class112 arg0, int arg1, int arg2) {
        int var4 = this.field869[arg1];
        class109 var5 = method100(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2271(true);
        }
        class112 var7 = arg0.method2271(!var5.method2248(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2278();
        } else if (var8 == 2) {
            var7.method2280();
        } else if (var8 == 3) {
            var7.method2279();
        }
        var7.method2306(var5, var6);
        if (var8 == 1) {
            var7.method2279();
        } else if (var8 == 2) {
            var7.method2280();
        } else if (var8 == 3) {
            var7.method2278();
        }
        return var7;
    }

    @ObfuscatedName("ar.i(Ldl;II)Ldl;")
    public class112 method728(class112 arg0, int arg1) {
        int var3 = this.field869[arg1];
        class109 var4 = method100(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2272(true);
        } else {
            class112 var6 = arg0.method2272(!var4.method2248(var5));
            var6.method2306(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.y(Ldl;ILar;II)Ldl;")
    public class112 method713(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field869[arg1];
        class109 var6 = method100(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method710(arg0, arg3);
        }
        int var8 = arg2.field869[arg3];
        class109 var9 = method100(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2271(!var6.method2248(var7));
            var11.method2306(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2271(!var6.method2248(var7) & !var9.method2248(var10));
            var12.method2277(var6, var7, var9, var10, this.field884);
            return var12;
        }
    }

    @ObfuscatedName("ar.m(Ldl;II)Ldl;")
    public class112 method724(class112 arg0, int arg1) {
        int var3 = this.field869[arg1];
        class109 var4 = method100(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2271(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field870 != null && arg1 < this.field870.length) {
            int var8 = this.field870[arg1];
            var6 = method100(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2271(!var4.method2248(var5));
            var10.method2306(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2271(!var4.method2248(var5) & !var6.method2248(var7));
            var9.method2306(var4, var5);
            var9.method2306(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("u.u(II)Ldd;")
    public static class109 method100(int arg0) {
        class109 var1 = (class109) field886.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class109 var2 = class109.method1447(Statics.field865, Statics.field866, arg0, false);
        if (var2 != null) {
            field886.method3364(var2, (long) arg0);
        }
        return var2;
    }
}
