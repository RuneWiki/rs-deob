package deob;

@ObfuscatedName("ay")
public class class40 extends class195 {

    @ObfuscatedName("ay.n")
    public static class184 field937 = new class184(64);

    @ObfuscatedName("ay.t")
    public static class184 field938 = new class184(100);

    @ObfuscatedName("ay.e")
    public int[] field949;

    @ObfuscatedName("ay.q")
    public int[] field939;

    @ObfuscatedName("ay.z")
    public int[] field950;

    @ObfuscatedName("ay.v")
    public int[] field941;

    @ObfuscatedName("ay.b")
    public int field943 = -1;

    @ObfuscatedName("ay.f")
    public int[] field940;

    @ObfuscatedName("ay.i")
    public boolean field945 = false;

    @ObfuscatedName("ay.w")
    public int field946 = 5;

    @ObfuscatedName("ay.l")
    public int field935 = -1;

    @ObfuscatedName("ay.j")
    public int field942 = -1;

    @ObfuscatedName("ay.s")
    public int field947 = 99;

    @ObfuscatedName("ay.r")
    public int field948 = -1;

    @ObfuscatedName("ay.h")
    public int field951 = -1;

    @ObfuscatedName("ay.x")
    public int field944 = 2;

    @ObfuscatedName("u.y(IB)Lay;")
    public static class40 method547(int arg0) {
        class40 var1 = (class40) field937.method3327((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field936.method2874(12, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method769(new class111(var2));
        }
        var3.method771();
        field937.method3340(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.k(Ldw;B)V")
    public void method769(class111 arg0) {
        while (true) {
            int var2 = arg0.method2205();
            if (var2 == 0) {
                return;
            }
            this.method770(arg0, var2);
        }
    }

    @ObfuscatedName("ay.g(Ldw;II)V")
    public void method770(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2339();
            this.field950 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field950[var4] = arg0.method2339();
            }
            this.field949 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field949[var5] = arg0.method2339();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field949[var6] += arg0.method2339() << 16;
            }
        } else if (arg1 == 2) {
            this.field943 = arg0.method2339();
        } else if (arg1 == 3) {
            int var7 = arg0.method2205();
            this.field940 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field940[var8] = arg0.method2205();
            }
            this.field940[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field945 = true;
        } else if (arg1 == 5) {
            this.field946 = arg0.method2205();
        } else if (arg1 == 6) {
            this.field935 = arg0.method2339();
        } else if (arg1 == 7) {
            this.field942 = arg0.method2339();
        } else if (arg1 == 8) {
            this.field947 = arg0.method2205();
        } else if (arg1 == 9) {
            this.field948 = arg0.method2205();
        } else if (arg1 == 10) {
            this.field951 = arg0.method2205();
        } else if (arg1 == 11) {
            this.field944 = arg0.method2205();
        } else if (arg1 == 12) {
            int var9 = arg0.method2205();
            this.field939 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field939[var10] = arg0.method2339();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field939[var11] += arg0.method2339() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2205();
            this.field941 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field941[var13] = arg0.method2164();
            }
        }
    }

    @ObfuscatedName("ay.n(I)V")
    public void method771() {
        if (this.field948 == -1) {
            if (this.field940 == null) {
                this.field948 = 0;
            } else {
                this.field948 = 2;
            }
        }
        if (this.field951 != -1) {
            return;
        }
        if (this.field940 == null) {
            this.field951 = 0;
        } else {
            this.field951 = 2;
        }
    }

    @ObfuscatedName("ay.t(Lch;II)Lch;")
    public class100 method786(class100 arg0, int arg1) {
        int var3 = this.field949[arg1];
        class98 var4 = Statics.method641(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2003(true);
        } else {
            class100 var6 = arg0.method2003(!var4.method1984(var5));
            var6.method2051(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ay.e(Lch;IIB)Lch;")
    public class100 method773(class100 arg0, int arg1, int arg2) {
        int var4 = this.field949[arg1];
        class98 var5 = Statics.method641(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2003(true);
        }
        class100 var7 = arg0.method2003(!var5.method1984(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2008();
        } else if (var8 == 2) {
            var7.method2015();
        } else if (var8 == 3) {
            var7.method2057();
        }
        var7.method2051(var5, var6);
        if (var8 == 1) {
            var7.method2057();
        } else if (var8 == 2) {
            var7.method2015();
        } else if (var8 == 3) {
            var7.method2008();
        }
        return var7;
    }

    @ObfuscatedName("ay.q(Lch;II)Lch;")
    public class100 method774(class100 arg0, int arg1) {
        int var3 = this.field949[arg1];
        class98 var4 = Statics.method641(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1998(true);
        } else {
            class100 var6 = arg0.method1998(!var4.method1984(var5));
            var6.method2051(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ay.z(Lch;ILay;IB)Lch;")
    public class100 method768(class100 arg0, int arg1, class40 arg2, int arg3) {
        int var5 = this.field949[arg1];
        class98 var6 = Statics.method641(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method786(arg0, arg3);
        }
        int var8 = arg2.field949[arg3];
        class98 var9 = Statics.method641(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class100 var11 = arg0.method2003(!var6.method1984(var7));
            var11.method2051(var6, var7);
            return var11;
        } else {
            class100 var12 = arg0.method2003(!var6.method1984(var7) & !var9.method1984(var10));
            var12.method1999(var6, var7, var9, var10, this.field940);
            return var12;
        }
    }

    @ObfuscatedName("ay.v(Lch;IS)Lch;")
    public class100 method794(class100 arg0, int arg1) {
        int var3 = this.field949[arg1];
        class98 var4 = Statics.method641(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2003(true);
        }
        class98 var6 = null;
        int var7 = 0;
        if (this.field939 != null && arg1 < this.field939.length) {
            int var8 = this.field939[arg1];
            var6 = Statics.method641(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class100 var10 = arg0.method2003(!var4.method1984(var5));
            var10.method2051(var4, var5);
            return var10;
        } else {
            class100 var9 = arg0.method2003(!var4.method1984(var5) & !var6.method1984(var7));
            var9.method2051(var4, var5);
            var9.method2051(var6, var7);
            return var9;
        }
    }
}
