package deob;

@ObfuscatedName("jz")
public class class264 extends class198 {

    @ObfuscatedName("jz.k")
    public static class193 field3627 = new class193(64);

    @ObfuscatedName("jz.f")
    public static class193 field3619 = new class193(100);

    @ObfuscatedName("jz.i")
    public int[] field3620;

    @ObfuscatedName("jz.j")
    public int[] field3621;

    @ObfuscatedName("jz.m")
    public int[] field3622;

    @ObfuscatedName("jz.u")
    public int[] field3623;

    @ObfuscatedName("jz.r")
    public int field3624 = -1;

    @ObfuscatedName("jz.v")
    public int[] field3625;

    @ObfuscatedName("jz.h")
    public boolean field3628 = false;

    @ObfuscatedName("jz.a")
    public int field3626 = 5;

    @ObfuscatedName("jz.p")
    public int field3629 = -1;

    @ObfuscatedName("jz.q")
    public int field3631 = -1;

    @ObfuscatedName("jz.l")
    public int field3630 = 99;

    @ObfuscatedName("jz.c")
    public int field3616 = -1;

    @ObfuscatedName("jz.n")
    public int field3632 = -1;

    @ObfuscatedName("jz.z")
    public int field3633 = 2;

    @ObfuscatedName("fe.w(II)Ljz;")
    public static class264 method3098(int arg0) {
        class264 var1 = (class264) field3627.method3239((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3618.method3754(12, arg0);
        class264 var3 = new class264();
        if (var2 != null) {
            var3.method4367(new class177(var2));
        }
        var3.method4357();
        field3627.method3241(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jz.o(Lfi;I)V")
    public void method4367(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method4342(arg0, var2);
        }
    }

    @ObfuscatedName("jz.x(Lfi;II)V")
    public void method4342(class177 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2886();
            this.field3622 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3622[var4] = arg0.method2886();
            }
            this.field3620 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3620[var5] = arg0.method2886();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3620[var6] += arg0.method2886() << 16;
            }
        } else if (arg1 == 2) {
            this.field3624 = arg0.method2886();
        } else if (arg1 == 3) {
            int var7 = arg0.method2931();
            this.field3625 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3625[var8] = arg0.method2931();
            }
            this.field3625[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3628 = true;
        } else if (arg1 == 5) {
            this.field3626 = arg0.method2931();
        } else if (arg1 == 6) {
            this.field3629 = arg0.method2886();
        } else if (arg1 == 7) {
            this.field3631 = arg0.method2886();
        } else if (arg1 == 8) {
            this.field3630 = arg0.method2931();
        } else if (arg1 == 9) {
            this.field3616 = arg0.method2931();
        } else if (arg1 == 10) {
            this.field3632 = arg0.method2931();
        } else if (arg1 == 11) {
            this.field3633 = arg0.method2931();
        } else if (arg1 == 12) {
            int var9 = arg0.method2931();
            this.field3621 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3621[var10] = arg0.method2886();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3621[var11] += arg0.method2886() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2931();
            this.field3623 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3623[var13] = arg0.method2888();
            }
        }
    }

    @ObfuscatedName("jz.k(I)V")
    public void method4357() {
        if (this.field3616 == -1) {
            if (this.field3625 == null) {
                this.field3616 = 0;
            } else {
                this.field3616 = 2;
            }
        }
        if (this.field3632 != -1) {
            return;
        }
        if (this.field3625 == null) {
            this.field3632 = 0;
        } else {
            this.field3632 = 2;
        }
    }

    @ObfuscatedName("jz.f(Lev;II)Lev;")
    public class134 method4375(class134 arg0, int arg1) {
        int var3 = this.field3620[arg1];
        class145 var4 = method699(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2295(true);
        } else {
            class134 var6 = arg0.method2295(!var4.method2621(var5));
            var6.method2301(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jz.i(Lev;IIS)Lev;")
    public class134 method4345(class134 arg0, int arg1, int arg2) {
        int var4 = this.field3620[arg1];
        class145 var5 = method699(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2295(true);
        }
        class134 var7 = arg0.method2295(!var5.method2621(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2263();
        } else if (var8 == 2) {
            var7.method2250();
        } else if (var8 == 3) {
            var7.method2261();
        }
        var7.method2301(var5, var6);
        if (var8 == 1) {
            var7.method2261();
        } else if (var8 == 2) {
            var7.method2250();
        } else if (var8 == 3) {
            var7.method2263();
        }
        return var7;
    }

    @ObfuscatedName("jz.j(Lev;II)Lev;")
    public class134 method4346(class134 arg0, int arg1) {
        int var3 = this.field3620[arg1];
        class145 var4 = method699(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2251(true);
        } else {
            class134 var6 = arg0.method2251(!var4.method2621(var5));
            var6.method2301(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jz.m(Lev;ILjz;IB)Lev;")
    public class134 method4347(class134 arg0, int arg1, class264 arg2, int arg3) {
        int var5 = this.field3620[arg1];
        class145 var6 = method699(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4375(arg0, arg3);
        }
        int var8 = arg2.field3620[arg3];
        class145 var9 = method699(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class134 var11 = arg0.method2295(!var6.method2621(var7));
            var11.method2301(var6, var7);
            return var11;
        } else {
            class134 var12 = arg0.method2295(!var6.method2621(var7) & !var9.method2621(var10));
            var12.method2259(var6, var7, var9, var10, this.field3625);
            return var12;
        }
    }

    @ObfuscatedName("jz.u(Lev;II)Lev;")
    public class134 method4354(class134 arg0, int arg1) {
        int var3 = this.field3620[arg1];
        class145 var4 = method699(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2295(true);
        }
        class145 var6 = null;
        int var7 = 0;
        if (this.field3621 != null && arg1 < this.field3621.length) {
            int var8 = this.field3621[arg1];
            var6 = method699(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class134 var10 = arg0.method2295(!var4.method2621(var5));
            var10.method2301(var4, var5);
            return var10;
        } else {
            class134 var9 = arg0.method2295(!var4.method2621(var5) & !var6.method2621(var7));
            var9.method2301(var4, var5);
            var9.method2301(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("bo.h(IB)Lek;")
    public static class145 method699(int arg0) {
        class145 var1 = (class145) field3619.method3239((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class239 var2 = Statics.field3617;
        class239 var3 = Statics.field522;
        boolean var4 = true;
        int[] var5 = var2.method3736(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3733(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3733(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class145 var10;
        if (var4) {
            try {
                var10 = new class145(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3619.method3241(var10, (long) arg0);
        }
        return var10;
    }
}
