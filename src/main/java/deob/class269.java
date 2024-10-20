package deob;

@ObfuscatedName("jc")
public class class269 extends class185 {

    @ObfuscatedName("jc.d")
    public static class155 field3529 = new class155(64);

    @ObfuscatedName("jc.w")
    public static class155 field3513 = new class155(100);

    @ObfuscatedName("jc.v")
    public int[] field3514;

    @ObfuscatedName("jc.q")
    public int[] field3524;

    @ObfuscatedName("jc.z")
    public int[] field3515;

    @ObfuscatedName("jc.t")
    public int[] field3516;

    @ObfuscatedName("jc.e")
    public int field3517 = -1;

    @ObfuscatedName("jc.s")
    public int[] field3518;

    @ObfuscatedName("jc.p")
    public boolean field3519 = false;

    @ObfuscatedName("jc.n")
    public int field3520 = 5;

    @ObfuscatedName("jc.u")
    public int field3511 = -1;

    @ObfuscatedName("jc.h")
    public int field3522 = -1;

    @ObfuscatedName("jc.g")
    public int field3523 = 99;

    @ObfuscatedName("jc.i")
    public int field3521 = -1;

    @ObfuscatedName("jc.a")
    public int field3525 = -1;

    @ObfuscatedName("jc.b")
    public int field3526 = 2;

    @ObfuscatedName("iw.x(II)Ljc;")
    public static class269 method4110(int arg0) {
        class269 var1 = (class269) field3529.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1289.method3869(12, arg0);
        class269 var3 = new class269();
        if (var2 != null) {
            var3.method4445(new class310(var2));
        }
        var3.method4475();
        field3529.method3152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jc.m(Lkb;I)V")
    public void method4445(class310 arg0) {
        while (true) {
            int var2 = arg0.method5137();
            if (var2 == 0) {
                return;
            }
            this.method4446(arg0, var2);
        }
    }

    @ObfuscatedName("jc.k(Lkb;II)V")
    public void method4446(class310 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5139();
            this.field3515 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3515[var4] = arg0.method5139();
            }
            this.field3514 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3514[var5] = arg0.method5139();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3514[var6] += arg0.method5139() << 16;
            }
        } else if (arg1 == 2) {
            this.field3517 = arg0.method5139();
        } else if (arg1 == 3) {
            int var7 = arg0.method5137();
            this.field3518 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3518[var8] = arg0.method5137();
            }
            this.field3518[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3519 = true;
        } else if (arg1 == 5) {
            this.field3520 = arg0.method5137();
        } else if (arg1 == 6) {
            this.field3511 = arg0.method5139();
        } else if (arg1 == 7) {
            this.field3522 = arg0.method5139();
        } else if (arg1 == 8) {
            this.field3523 = arg0.method5137();
        } else if (arg1 == 9) {
            this.field3521 = arg0.method5137();
        } else if (arg1 == 10) {
            this.field3525 = arg0.method5137();
        } else if (arg1 == 11) {
            this.field3526 = arg0.method5137();
        } else if (arg1 == 12) {
            int var9 = arg0.method5137();
            this.field3524 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3524[var10] = arg0.method5139();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3524[var11] += arg0.method5139() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5137();
            this.field3516 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3516[var13] = arg0.method5264();
            }
        }
    }

    @ObfuscatedName("jc.d(B)V")
    public void method4475() {
        if (this.field3521 == -1) {
            if (this.field3518 == null) {
                this.field3521 = 0;
            } else {
                this.field3521 = 2;
            }
        }
        if (this.field3525 != -1) {
            return;
        }
        if (this.field3518 == null) {
            this.field3525 = 0;
        } else {
            this.field3525 = 2;
        }
    }

    @ObfuscatedName("jc.w(Lel;II)Lel;")
    public class137 method4448(class137 arg0, int arg1) {
        int var3 = this.field3514[arg1];
        class148 var4 = method124(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2721(true);
        } else {
            class137 var6 = arg0.method2721(!var4.method3110(var5));
            var6.method2709(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jc.v(Lel;III)Lel;")
    public class137 method4449(class137 arg0, int arg1, int arg2) {
        int var4 = this.field3514[arg1];
        class148 var5 = method124(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2721(true);
        }
        class137 var7 = arg0.method2721(!var5.method3110(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2714();
        } else if (var8 == 2) {
            var7.method2706();
        } else if (var8 == 3) {
            var7.method2719();
        }
        var7.method2709(var5, var6);
        if (var8 == 1) {
            var7.method2719();
        } else if (var8 == 2) {
            var7.method2706();
        } else if (var8 == 3) {
            var7.method2714();
        }
        return var7;
    }

    @ObfuscatedName("jc.q(Lel;IB)Lel;")
    public class137 method4447(class137 arg0, int arg1) {
        int var3 = this.field3514[arg1];
        class148 var4 = method124(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2763(true);
        } else {
            class137 var6 = arg0.method2763(!var4.method3110(var5));
            var6.method2709(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jc.z(Lel;ILjc;IB)Lel;")
    public class137 method4451(class137 arg0, int arg1, class269 arg2, int arg3) {
        int var5 = this.field3514[arg1];
        class148 var6 = method124(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4448(arg0, arg3);
        }
        int var8 = arg2.field3514[arg3];
        class148 var9 = method124(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class137 var11 = arg0.method2721(!var6.method3110(var7));
            var11.method2709(var6, var7);
            return var11;
        } else {
            class137 var12 = arg0.method2721(!var6.method3110(var7) & !var9.method3110(var10));
            var12.method2710(var6, var7, var9, var10, this.field3518);
            return var12;
        }
    }

    @ObfuscatedName("jc.t(Lel;IB)Lel;")
    public class137 method4476(class137 arg0, int arg1) {
        int var3 = this.field3514[arg1];
        class148 var4 = method124(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2721(true);
        }
        class148 var6 = null;
        int var7 = 0;
        if (this.field3524 != null && arg1 < this.field3524.length) {
            int var8 = this.field3524[arg1];
            var6 = method124(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class137 var10 = arg0.method2721(!var4.method3110(var5));
            var10.method2709(var4, var5);
            return var10;
        } else {
            class137 var9 = arg0.method2721(!var4.method3110(var5) & !var6.method3110(var7));
            var9.method2709(var4, var5);
            var9.method2709(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("g.e(II)Lef;")
    public static class148 method124(int arg0) {
        class148 var1 = (class148) field3513.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class244 var2 = Statics.field4030;
        class244 var3 = Statics.field1178;
        boolean var4 = true;
        int[] var5 = var2.method3879(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3877(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3877(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class148 var10;
        if (var4) {
            try {
                var10 = new class148(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3513.method3152(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("cz.s(B)V")
    public static void method1964() {
        field3529.method3141();
        field3513.method3141();
    }
}
