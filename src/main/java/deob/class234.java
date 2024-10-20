package deob;

@ObfuscatedName("hz")
public abstract class class234 {

    @ObfuscatedName("hz.i")
    public int field3112;

    @ObfuscatedName("hz.y")
    public int[] field3105;

    @ObfuscatedName("hz.w")
    public int[] field3103;

    @ObfuscatedName("hz.p")
    public class335 field3107;

    @ObfuscatedName("hz.b")
    public int[] field3108;

    @ObfuscatedName("hz.e")
    public int[] field3109;

    @ObfuscatedName("hz.x")
    public int[] field3110;

    @ObfuscatedName("hz.a")
    public int[][] field3111;

    @ObfuscatedName("hz.d")
    public int[][] field3118;

    @ObfuscatedName("hz.c")
    public class335[] field3113;

    @ObfuscatedName("hz.o")
    public Object[] field3114;

    @ObfuscatedName("hz.v")
    public Object[][] field3117;

    @ObfuscatedName("hz.k")
    public static class334 field3116 = new class334();

    @ObfuscatedName("hz.s")
    public int field3104;

    @ObfuscatedName("hz.l")
    public boolean field3120;

    @ObfuscatedName("hz.t")
    public boolean field3106;

    @ObfuscatedName("hz.j")
    public static int field3119 = 0;

    public class234(boolean arg0, boolean arg1) {
        this.field3120 = arg0;
        this.field3106 = arg1;
    }

    @ObfuscatedName("hz.f([BI)V")
    public void method3825(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class300.method4641(arg0, 0, var2);
        this.field3104 = var3;
        class300 var4 = new class300(method3725(arg0));
        int var5 = var4.method5110();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method5192();
        }
        int var6 = var4.method5110();
        if (var5 >= 7) {
            this.field3112 = var4.method5126();
        } else {
            this.field3112 = var4.method5112();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3105 = new int[this.field3112];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3112; var9++) {
                this.field3105[var9] = var7 += var4.method5126();
                if (this.field3105[var9] > var8) {
                    var8 = this.field3105[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3112; var10++) {
                this.field3105[var10] = var7 += var4.method5112();
                if (this.field3105[var10] > var8) {
                    var8 = this.field3105[var10];
                }
            }
        }
        this.field3108 = new int[var8 + 1];
        this.field3109 = new int[var8 + 1];
        this.field3110 = new int[var8 + 1];
        this.field3111 = new int[var8 + 1][];
        this.field3114 = new Object[var8 + 1];
        this.field3117 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3103 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3112; var11++) {
                this.field3103[this.field3105[var11]] = var4.method5192();
            }
            this.field3107 = new class335(this.field3103);
        }
        for (int var12 = 0; var12 < this.field3112; var12++) {
            this.field3108[this.field3105[var12]] = var4.method5192();
        }
        for (int var13 = 0; var13 < this.field3112; var13++) {
            this.field3109[this.field3105[var13]] = var4.method5192();
        }
        for (int var14 = 0; var14 < this.field3112; var14++) {
            this.field3110[this.field3105[var14]] = var4.method5112();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3112; var15++) {
                int var16 = this.field3105[var15];
                int var17 = this.field3110[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3111[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3111[var16][var20] = var18 += var4.method5126();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3117[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3112; var22++) {
                int var23 = this.field3105[var22];
                int var24 = this.field3110[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3111[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3111[var23][var27] = var25 += var4.method5112();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3117[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3118 = new int[var8 + 1][];
        this.field3113 = new class335[var8 + 1];
        for (int var29 = 0; var29 < this.field3112; var29++) {
            int var30 = this.field3105[var29];
            int var31 = this.field3110[var30];
            this.field3118[var30] = new int[this.field3117[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3118[var30][this.field3111[var30][var32]] = var4.method5192();
            }
            this.field3113[var30] = new class335(this.field3118[var30]);
        }
    }

    @ObfuscatedName("hz.i(II)V")
    public void method3829(int arg0) {
    }

    @ObfuscatedName("hz.y(III)[B")
    public byte[] method3752(int arg0, int arg1) {
        return this.method3753(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("hz.w(II[IB)[B")
    public byte[] method3753(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3117.length || this.field3117[arg0] == null || arg1 < 0 || arg1 >= this.field3117[arg0].length) {
            return null;
        }
        if (this.field3117[arg0][arg1] == null) {
            boolean var4 = this.method3769(arg0, arg2);
            if (!var4) {
                this.method3762(arg0);
                boolean var5 = this.method3769(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        Object var6 = this.field3117[arg0][arg1];
        byte[] var7;
        if (var6 == null) {
            var7 = null;
        } else if (var6 instanceof byte[]) {
            byte[] var8 = (byte[]) ((byte[]) var6);
            var7 = var8;
        } else if ((var6 instanceof class208)) {
            class208 var9 = (class208) var6;
            var7 = var9.method3582();
        } else {
            throw new IllegalArgumentException();
        }
        if (this.field3106) {
            this.field3117[arg0][arg1] = null;
        }
        return var7;
    }

    @ObfuscatedName("hz.p(IIB)Z")
    public boolean method3754(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3117.length || this.field3117[arg0] == null || arg1 < 0 || arg1 >= this.field3117[arg0].length) {
            return false;
        } else if (this.field3117[arg0][arg1] != null) {
            return true;
        } else if (this.field3114[arg0] == null) {
            this.method3762(arg0);
            return this.field3114[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hz.b(IB)Z")
    public boolean method3784(int arg0) {
        if (this.field3117.length == 1) {
            return this.method3754(0, arg0);
        } else if (this.field3117[arg0].length == 1) {
            return this.method3754(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hz.e(IB)Z")
    public boolean method3756(int arg0) {
        if (this.field3114[arg0] == null) {
            this.method3762(arg0);
            return this.field3114[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hz.x(I)Z")
    public boolean method3827() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3105.length; var2++) {
            int var3 = this.field3105[var2];
            if (this.field3114[var3] == null) {
                this.method3762(var3);
                if (this.field3114[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("hz.a(IS)I")
    public int method3758(int arg0) {
        return this.field3114[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("hz.d(IS)[B")
    public byte[] method3759(int arg0) {
        if (this.field3117.length == 1) {
            return this.method3752(0, arg0);
        } else if (this.field3117[arg0].length == 1) {
            return this.method3752(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hz.c(III)[B")
    public byte[] method3760(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3117.length || this.field3117[arg0] == null || arg1 < 0 || arg1 >= this.field3117[arg0].length) {
            return null;
        }
        if (this.field3117[arg0][arg1] == null) {
            boolean var3 = this.method3769(arg0, (int[]) null);
            if (!var3) {
                this.method3762(arg0);
                boolean var4 = this.method3769(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        Object var5 = this.field3117[arg0][arg1];
        byte[] var6;
        if (var5 == null) {
            var6 = null;
        } else if (var5 instanceof byte[]) {
            byte[] var7 = (byte[]) ((byte[]) var5);
            var6 = var7;
        } else if ((var5 instanceof class208)) {
            class208 var8 = (class208) var5;
            var6 = var8.method3582();
        } else {
            throw new IllegalArgumentException();
        }
        return var6;
    }

    @ObfuscatedName("hz.o(II)[B")
    public byte[] method3761(int arg0) {
        if (this.field3117.length == 1) {
            return this.method3760(0, arg0);
        } else if (this.field3117[arg0].length == 1) {
            return this.method3760(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hz.l(II)V")
    public void method3762(int arg0) {
    }

    @ObfuscatedName("hz.t(II)[I")
    public int[] method3808(int arg0) {
        return arg0 >= 0 && arg0 < this.field3111.length ? this.field3111[arg0] : null;
    }

    @ObfuscatedName("hz.j(IB)I")
    public int method3764(int arg0) {
        return this.field3117[arg0].length;
    }

    @ObfuscatedName("hz.n(S)I")
    public int method3765() {
        return this.field3117.length;
    }

    @ObfuscatedName("hz.u(B)V")
    public void method3766() {
        for (int var1 = 0; var1 < this.field3114.length; var1++) {
            this.field3114[var1] = null;
        }
    }

    @ObfuscatedName("hz.z(II)V")
    public void method3767(int arg0) {
        for (int var2 = 0; var2 < this.field3117[arg0].length; var2++) {
            this.field3117[arg0][var2] = null;
        }
    }

    @ObfuscatedName("hz.h(I)V")
    public void method3823() {
        for (int var1 = 0; var1 < this.field3117.length; var1++) {
            if (this.field3117[var1] != null) {
                for (int var2 = 0; var2 < this.field3117[var1].length; var2++) {
                    this.field3117[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("hz.m(I[II)Z")
    public boolean method3769(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("hz.aa(Ljava/lang/String;I)I")
    public int method3847(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3107.method6053(class291.method1890(var2));
    }

    @ObfuscatedName("hz.av(ILjava/lang/String;I)I")
    public int method3846(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3113[arg0].method6053(class291.method1890(var3));
    }

    @ObfuscatedName("hz.aw(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3772(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3107.method6053(class291.method1890(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3113[var5].method6053(class291.method1890(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("hz.as(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3773(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3107.method6053(class291.method1890(var3));
        int var6 = this.field3113[var5].method6053(class291.method1890(var4));
        return this.method3752(var5, var6);
    }

    @ObfuscatedName("hz.ak(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3771(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3107.method6053(class291.method1890(var3));
        int var6 = this.field3113[var5].method6053(class291.method1890(var4));
        return this.method3754(var5, var6);
    }

    @ObfuscatedName("hz.au(Ljava/lang/String;I)Z")
    public boolean method3774(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3107.method6053(class291.method1890(var2));
        return this.method3756(var3);
    }

    @ObfuscatedName("hz.ah(Ljava/lang/String;S)V")
    public void method3763(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3107.method6053(class291.method1890(var2));
        if (var3 >= 0) {
            this.method3829(var3);
        }
    }

    @ObfuscatedName("hz.aq(Ljava/lang/String;S)I")
    public int method3776(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3107.method6053(class291.method1890(var2));
        return this.method3758(var3);
    }

    @ObfuscatedName("hv.ao([BI)[B")
    public static final byte[] method3725(byte[] arg0) {
        class300 var1 = new class300(arg0);
        int var2 = var1.method5110();
        int var3 = var1.method5192();
        if (var3 < 0 || !(field3119 == 0 || var3 <= field3119)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5122(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5192();
            if (var5 < 0 || field3119 != 0 && var5 > field3119) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class304.method5395(var6, var5, arg0, var3, 9);
            } else {
                field3116.method6049(var1, var6);
            }
            return var6;
        }
    }
}
