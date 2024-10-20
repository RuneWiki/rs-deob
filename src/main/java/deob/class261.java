package deob;

@ObfuscatedName("jj")
public class class261 extends class195 {

    @ObfuscatedName("jj.y")
    public static class190 field3584 = new class190(64);

    @ObfuscatedName("jj.e")
    public static class190 field3592 = new class190(100);

    @ObfuscatedName("jj.f")
    public int[] field3586;

    @ObfuscatedName("jj.v")
    public int[] field3587;

    @ObfuscatedName("jj.t")
    public int[] field3589;

    @ObfuscatedName("jj.i")
    public int[] field3597;

    @ObfuscatedName("jj.r")
    public int field3590 = -1;

    @ObfuscatedName("jj.g")
    public int[] field3591;

    @ObfuscatedName("jj.s")
    public boolean field3581 = false;

    @ObfuscatedName("jj.o")
    public int field3593 = 5;

    @ObfuscatedName("jj.p")
    public int field3594 = -1;

    @ObfuscatedName("jj.u")
    public int field3595 = -1;

    @ObfuscatedName("jj.b")
    public int field3596 = 99;

    @ObfuscatedName("jj.w")
    public int field3585 = -1;

    @ObfuscatedName("jj.k")
    public int field3598 = -1;

    @ObfuscatedName("jj.n")
    public int field3599 = 2;

    @ObfuscatedName("aq.d(II)Ljj;")
    public static class261 method494(int arg0) {
        class261 var1 = (class261) field3584.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3583.method3750(12, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4300(new class174(var2));
        }
        var3.method4302();
        field3584.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jj.q(Lfw;I)V")
    public void method4300(class174 arg0) {
        while (true) {
            int var2 = arg0.method2921();
            if (var2 == 0) {
                return;
            }
            this.method4301(arg0, var2);
        }
    }

    @ObfuscatedName("jj.x(Lfw;II)V")
    public void method4301(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2916();
            this.field3589 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3589[var4] = arg0.method2916();
            }
            this.field3586 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3586[var5] = arg0.method2916();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3586[var6] += arg0.method2916() << 16;
            }
        } else if (arg1 == 2) {
            this.field3590 = arg0.method2916();
        } else if (arg1 == 3) {
            int var7 = arg0.method2921();
            this.field3591 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3591[var8] = arg0.method2921();
            }
            this.field3591[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3581 = true;
        } else if (arg1 == 5) {
            this.field3593 = arg0.method2921();
        } else if (arg1 == 6) {
            this.field3594 = arg0.method2916();
        } else if (arg1 == 7) {
            this.field3595 = arg0.method2916();
        } else if (arg1 == 8) {
            this.field3596 = arg0.method2921();
        } else if (arg1 == 9) {
            this.field3585 = arg0.method2921();
        } else if (arg1 == 10) {
            this.field3598 = arg0.method2921();
        } else if (arg1 == 11) {
            this.field3599 = arg0.method2921();
        } else if (arg1 == 12) {
            int var9 = arg0.method2921();
            this.field3587 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3587[var10] = arg0.method2916();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3587[var11] += arg0.method2916() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2921();
            this.field3597 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3597[var13] = arg0.method2918();
            }
        }
    }

    @ObfuscatedName("jj.y(I)V")
    public void method4302() {
        if (this.field3585 == -1) {
            if (this.field3591 == null) {
                this.field3585 = 0;
            } else {
                this.field3585 = 2;
            }
        }
        if (this.field3598 != -1) {
            return;
        }
        if (this.field3591 == null) {
            this.field3598 = 0;
        } else {
            this.field3598 = 2;
        }
    }

    @ObfuscatedName("jj.e(Lev;IB)Lev;")
    public class134 method4303(class134 arg0, int arg1) {
        int var3 = this.field3586[arg1];
        class145 var4 = method2658(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2266(true);
        } else {
            class134 var6 = arg0.method2266(!var4.method2660(var5));
            var6.method2279(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jj.f(Lev;IIS)Lev;")
    public class134 method4304(class134 arg0, int arg1, int arg2) {
        int var4 = this.field3586[arg1];
        class145 var5 = method2658(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2266(true);
        }
        class134 var7 = arg0.method2266(!var5.method2660(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2302();
        } else if (var8 == 2) {
            var7.method2341();
        } else if (var8 == 3) {
            var7.method2277();
        }
        var7.method2279(var5, var6);
        if (var8 == 1) {
            var7.method2277();
        } else if (var8 == 2) {
            var7.method2341();
        } else if (var8 == 3) {
            var7.method2302();
        }
        return var7;
    }

    @ObfuscatedName("jj.v(Lev;II)Lev;")
    public class134 method4309(class134 arg0, int arg1) {
        int var3 = this.field3586[arg1];
        class145 var4 = method2658(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2288(true);
        } else {
            class134 var6 = arg0.method2288(!var4.method2660(var5));
            var6.method2279(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jj.t(Lev;ILjj;II)Lev;")
    public class134 method4306(class134 arg0, int arg1, class261 arg2, int arg3) {
        int var5 = this.field3586[arg1];
        class145 var6 = method2658(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4303(arg0, arg3);
        }
        int var8 = arg2.field3586[arg3];
        class145 var9 = method2658(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class134 var11 = arg0.method2266(!var6.method2660(var7));
            var11.method2279(var6, var7);
            return var11;
        } else {
            class134 var12 = arg0.method2266(!var6.method2660(var7) & !var9.method2660(var10));
            var12.method2275(var6, var7, var9, var10, this.field3591);
            return var12;
        }
    }

    @ObfuscatedName("jj.i(Lev;II)Lev;")
    public class134 method4307(class134 arg0, int arg1) {
        int var3 = this.field3586[arg1];
        class145 var4 = method2658(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2266(true);
        }
        class145 var6 = null;
        int var7 = 0;
        if (this.field3587 != null && arg1 < this.field3587.length) {
            int var8 = this.field3587[arg1];
            var6 = method2658(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class134 var10 = arg0.method2266(!var4.method2660(var5));
            var10.method2279(var4, var5);
            return var10;
        } else {
            class134 var9 = arg0.method2266(!var4.method2660(var5) & !var6.method2660(var7));
            var9.method2279(var4, var5);
            var9.method2279(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("es.r(II)Len;")
    public static class145 method2658(int arg0) {
        class145 var1 = (class145) field3592.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class236 var2 = Statics.field3582;
        class236 var3 = Statics.field3588;
        boolean var4 = true;
        int[] var5 = var2.method3760(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3757(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3757(var8, 0);
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
            field3592.method3256(var10, (long) arg0);
        }
        return var10;
    }
}
