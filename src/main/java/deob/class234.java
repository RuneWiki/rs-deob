package deob;

@ObfuscatedName("hp")
public abstract class class234 {

    @ObfuscatedName("hp.n")
    public int field3121;

    @ObfuscatedName("hp.v")
    public int[] field3107;

    @ObfuscatedName("hp.u")
    public int[] field3106;

    @ObfuscatedName("hp.r")
    public class335 field3109;

    @ObfuscatedName("hp.p")
    public int[] field3108;

    @ObfuscatedName("hp.q")
    public int[] field3110;

    @ObfuscatedName("hp.m")
    public int[] field3117;

    @ObfuscatedName("hp.y")
    public int[][] field3113;

    @ObfuscatedName("hp.i")
    public int[][] field3114;

    @ObfuscatedName("hp.c")
    public class335[] field3115;

    @ObfuscatedName("hp.b")
    public Object[] field3116;

    @ObfuscatedName("hp.o")
    public Object[][] field3111;

    @ObfuscatedName("hp.a")
    public static class334 field3118 = new class334();

    @ObfuscatedName("hp.e")
    public int field3119;

    @ObfuscatedName("hp.w")
    public boolean field3120;

    @ObfuscatedName("hp.t")
    public boolean field3122;

    @ObfuscatedName("hp.g")
    public static int field3123 = 0;

    public class234(boolean arg0, boolean arg1) {
        this.field3120 = arg0;
        this.field3122 = arg1;
    }

    @ObfuscatedName("hp.z([BS)V")
    public void method3724(byte[] arg0) {
        this.field3119 = class300.method4716(arg0, arg0.length);
        class300 var2 = new class300(method3504(arg0));
        int var3 = var2.method4990();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method5085();
        }
        int var4 = var2.method4990();
        if (var3 >= 7) {
            this.field3121 = var2.method5006();
        } else {
            this.field3121 = var2.method4992();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3107 = new int[this.field3121];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3121; var7++) {
                this.field3107[var7] = var5 += var2.method5006();
                if (this.field3107[var7] > var6) {
                    var6 = this.field3107[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3121; var8++) {
                this.field3107[var8] = var5 += var2.method4992();
                if (this.field3107[var8] > var6) {
                    var6 = this.field3107[var8];
                }
            }
        }
        this.field3108 = new int[var6 + 1];
        this.field3110 = new int[var6 + 1];
        this.field3117 = new int[var6 + 1];
        this.field3113 = new int[var6 + 1][];
        this.field3116 = new Object[var6 + 1];
        this.field3111 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3106 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3121; var9++) {
                this.field3106[this.field3107[var9]] = var2.method5085();
            }
            this.field3109 = new class335(this.field3106);
        }
        for (int var10 = 0; var10 < this.field3121; var10++) {
            this.field3108[this.field3107[var10]] = var2.method5085();
        }
        for (int var11 = 0; var11 < this.field3121; var11++) {
            this.field3110[this.field3107[var11]] = var2.method5085();
        }
        for (int var12 = 0; var12 < this.field3121; var12++) {
            this.field3117[this.field3107[var12]] = var2.method4992();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3121; var13++) {
                int var14 = this.field3107[var13];
                int var15 = this.field3117[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3113[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3113[var14][var18] = var16 += var2.method5006();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3111[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3121; var20++) {
                int var21 = this.field3107[var20];
                int var22 = this.field3117[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3113[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3113[var21][var25] = var23 += var2.method4992();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3111[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3114 = new int[var6 + 1][];
        this.field3115 = new class335[var6 + 1];
        for (int var27 = 0; var27 < this.field3121; var27++) {
            int var28 = this.field3107[var27];
            int var29 = this.field3117[var28];
            this.field3114[var28] = new int[this.field3111[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3114[var28][this.field3113[var28][var30]] = var2.method5085();
            }
            this.field3115[var28] = new class335(this.field3114[var28]);
        }
    }

    @ObfuscatedName("hp.n(IB)V")
    public void method3725(int arg0) {
    }

    @ObfuscatedName("hp.v(IIS)[B")
    public byte[] method3726(int arg0, int arg1) {
        return this.method3727(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("hp.u(II[II)[B")
    public byte[] method3727(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3111.length || this.field3111[arg0] == null || arg1 < 0 || arg1 >= this.field3111[arg0].length) {
            return null;
        }
        if (this.field3111[arg0][arg1] == null) {
            boolean var4 = this.method3801(arg0, arg2);
            if (!var4) {
                this.method3799(arg0);
                boolean var5 = this.method3801(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class206.method127(this.field3111[arg0][arg1], false);
        if (this.field3122) {
            this.field3111[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("hp.r(III)Z")
    public boolean method3730(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3111.length || this.field3111[arg0] == null || arg1 < 0 || arg1 >= this.field3111[arg0].length) {
            return false;
        } else if (this.field3111[arg0][arg1] != null) {
            return true;
        } else if (this.field3116[arg0] == null) {
            this.method3799(arg0);
            return this.field3116[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hp.p(II)Z")
    public boolean method3737(int arg0) {
        if (this.field3111.length == 1) {
            return this.method3730(0, arg0);
        } else if (this.field3111[arg0].length == 1) {
            return this.method3730(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hp.q(II)Z")
    public boolean method3752(int arg0) {
        if (this.field3116[arg0] == null) {
            this.method3799(arg0);
            return this.field3116[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hp.m(I)Z")
    public boolean method3731() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3107.length; var2++) {
            int var3 = this.field3107[var2];
            if (this.field3116[var3] == null) {
                this.method3799(var3);
                if (this.field3116[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("hp.y(II)I")
    public int method3746(int arg0) {
        return this.field3116[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("hp.i(II)[B")
    public byte[] method3733(int arg0) {
        if (this.field3111.length == 1) {
            return this.method3726(0, arg0);
        } else if (this.field3111[arg0].length == 1) {
            return this.method3726(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hp.c(III)[B")
    public byte[] method3734(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3111.length || this.field3111[arg0] == null || arg1 < 0 || arg1 >= this.field3111[arg0].length) {
            return null;
        }
        if (this.field3111[arg0][arg1] == null) {
            boolean var3 = this.method3801(arg0, (int[]) null);
            if (!var3) {
                this.method3799(arg0);
                boolean var4 = this.method3801(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class206.method127(this.field3111[arg0][arg1], false);
    }

    @ObfuscatedName("hp.b(IB)[B")
    public byte[] method3735(int arg0) {
        if (this.field3111.length == 1) {
            return this.method3734(0, arg0);
        } else if (this.field3111[arg0].length == 1) {
            return this.method3734(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hp.o(II)V")
    public void method3799(int arg0) {
    }

    @ObfuscatedName("hp.a(IB)[I")
    public int[] method3748(int arg0) {
        return arg0 >= 0 && arg0 < this.field3113.length ? this.field3113[arg0] : null;
    }

    @ObfuscatedName("hp.e(II)I")
    public int method3738(int arg0) {
        return this.field3111[arg0].length;
    }

    @ObfuscatedName("hp.x(B)I")
    public int method3739() {
        return this.field3111.length;
    }

    @ObfuscatedName("hp.h(I)V")
    public void method3740() {
        for (int var1 = 0; var1 < this.field3116.length; var1++) {
            this.field3116[var1] = null;
        }
    }

    @ObfuscatedName("hp.s(II)V")
    public void method3800(int arg0) {
        for (int var2 = 0; var2 < this.field3111[arg0].length; var2++) {
            this.field3111[arg0][var2] = null;
        }
    }

    @ObfuscatedName("hp.f(I)V")
    public void method3742() {
        for (int var1 = 0; var1 < this.field3111.length; var1++) {
            if (this.field3111[var1] != null) {
                for (int var2 = 0; var2 < this.field3111[var1].length; var2++) {
                    this.field3111[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("hp.j(I[II)Z")
    public boolean method3801(int arg0, int[] arg1) {
        if (this.field3116[arg0] == null) {
            return false;
        }
        int var3 = this.field3117[arg0];
        int[] var4 = this.field3113[arg0];
        Object[] var5 = this.field3111[arg0];
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            if (var5[var4[var7]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var8;
        if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
            var8 = class206.method127(this.field3116[arg0], true);
            class300 var9 = new class300(var8);
            var9.method4983(arg1, 5, var9.field3699.length);
        } else {
            var8 = class206.method127(this.field3116[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method3504(var8);
        } catch (RuntimeException var27) {
            throw class341.method162(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class300.method4716(var8, var8.length) + "," + class300.method4716(var8, var8.length - 2) + "," + this.field3108[arg0] + "," + this.field3119);
        }
        if (this.field3120) {
            this.field3116[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class300 var15 = new class300(var10);
            int[] var16 = new int[var3];
            var15.field3702 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method5085();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field3702 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method5085();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3122) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class206.method62(var20[var26], false);
                }
            }
        } else if (this.field3122) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class206.method62(var10, false);
        }
        return true;
    }

    @ObfuscatedName("hp.d(Ljava/lang/String;I)I")
    public int method3765(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3109.method5933(class291.method179(var2));
    }

    @ObfuscatedName("hp.l(ILjava/lang/String;I)I")
    public int method3745(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3115[arg0].method5933(class291.method179(var3));
    }

    @ObfuscatedName("hp.k(Ljava/lang/String;Ljava/lang/String;S)Z")
    public boolean method3814(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3109.method5933(class291.method179(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3115[var5].method5933(class291.method179(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("hp.ac(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3789(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3109.method5933(class291.method179(var3));
        int var6 = this.field3115[var5].method5933(class291.method179(var4));
        return this.method3726(var5, var6);
    }

    @ObfuscatedName("hp.aa(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3728(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3109.method5933(class291.method179(var3));
        int var6 = this.field3115[var5].method5933(class291.method179(var4));
        return this.method3730(var5, var6);
    }

    @ObfuscatedName("hp.ap(Ljava/lang/String;I)Z")
    public boolean method3749(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3109.method5933(class291.method179(var2));
        return this.method3752(var3);
    }

    @ObfuscatedName("hp.ar(Ljava/lang/String;B)V")
    public void method3750(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3109.method5933(class291.method179(var2));
        if (var3 >= 0) {
            this.method3725(var3);
        }
    }

    @ObfuscatedName("hp.ab(Ljava/lang/String;I)I")
    public int method3751(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3109.method5933(class291.method179(var2));
        return this.method3746(var3);
    }

    @ObfuscatedName("gk.ax([BI)[B")
    public static final byte[] method3504(byte[] arg0) {
        class300 var1 = new class300(arg0);
        int var2 = var1.method4990();
        int var3 = var1.method5085();
        if (var3 < 0 || !(field3123 == 0 || var3 <= field3123)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5066(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5085();
            if (var5 < 0 || field3123 != 0 && var5 > field3123) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class304.method5252(var6, var5, arg0, var3, 9);
            } else {
                field3118.method5929(var1, var6);
            }
            return var6;
        }
    }
}
