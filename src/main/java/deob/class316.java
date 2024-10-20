package deob;

@ObfuscatedName("lp")
public abstract class class316 {

    @ObfuscatedName("lp.b")
    public int field4022;

    @ObfuscatedName("lp.t")
    public int[] field4023;

    @ObfuscatedName("lp.g")
    public int[] field4028;

    @ObfuscatedName("lp.x")
    public class459 field4025;

    @ObfuscatedName("lp.n")
    public int[] field4026;

    @ObfuscatedName("lp.e")
    public int[] field4034;

    @ObfuscatedName("lp.h")
    public int[] field4024;

    @ObfuscatedName("lp.f")
    public int[][] field4029;

    @ObfuscatedName("lp.d")
    public int[][] field4030;

    @ObfuscatedName("lp.j")
    public class459[] field4031;

    @ObfuscatedName("lp.z")
    public Object[] field4032;

    @ObfuscatedName("lp.i")
    public Object[][] field4038;

    @ObfuscatedName("lp.u")
    public static class458 field4033 = new class458();

    @ObfuscatedName("lp.ag")
    public int field4035;

    @ObfuscatedName("lp.ar")
    public boolean field4036;

    @ObfuscatedName("lp.am")
    public boolean field4037;

    @ObfuscatedName("lp.ac")
    public static int field4027 = 0;

    public class316(boolean arg0, boolean arg1) {
        this.field4036 = arg0;
        this.field4037 = arg1;
    }

    @ObfuscatedName("lp.ak([BI)V")
    public void method5214(byte[] arg0) {
        this.field4035 = class440.method6434(arg0, arg0.length);
        class440 var2 = new class440(method5112(arg0));
        int var3 = var2.method7071();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method6898();
        }
        int var4 = var2.method7071();
        if (var3 >= 7) {
            this.field4022 = var2.method7005();
        } else {
            this.field4022 = var2.method7082();
        }
        int var5 = 0;
        int var6 = -1;
        this.field4023 = new int[this.field4022];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field4022; var7++) {
                this.field4023[var7] = var5 += var2.method7005();
                if (this.field4023[var7] > var6) {
                    var6 = this.field4023[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field4022; var8++) {
                this.field4023[var8] = var5 += var2.method7082();
                if (this.field4023[var8] > var6) {
                    var6 = this.field4023[var8];
                }
            }
        }
        this.field4026 = new int[var6 + 1];
        this.field4034 = new int[var6 + 1];
        this.field4024 = new int[var6 + 1];
        this.field4029 = new int[var6 + 1][];
        this.field4032 = new Object[var6 + 1];
        this.field4038 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field4028 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field4022; var9++) {
                this.field4028[this.field4023[var9]] = var2.method6898();
            }
            this.field4025 = new class459(this.field4028);
        }
        for (int var10 = 0; var10 < this.field4022; var10++) {
            this.field4026[this.field4023[var10]] = var2.method6898();
        }
        for (int var11 = 0; var11 < this.field4022; var11++) {
            this.field4034[this.field4023[var11]] = var2.method6898();
        }
        for (int var12 = 0; var12 < this.field4022; var12++) {
            this.field4024[this.field4023[var12]] = var2.method7082();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field4022; var13++) {
                int var14 = this.field4023[var13];
                int var15 = this.field4024[var14];
                int var16 = 0;
                int var17 = -1;
                this.field4029[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field4029[var14][var18] = var16 += var2.method7005();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field4038[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field4022; var20++) {
                int var21 = this.field4023[var20];
                int var22 = this.field4024[var21];
                int var23 = 0;
                int var24 = -1;
                this.field4029[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field4029[var21][var25] = var23 += var2.method7082();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field4038[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field4030 = new int[var6 + 1][];
        this.field4031 = new class459[var6 + 1];
        for (int var27 = 0; var27 < this.field4022; var27++) {
            int var28 = this.field4023[var27];
            int var29 = this.field4024[var28];
            this.field4030[var28] = new int[this.field4038[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field4030[var28][this.field4029[var28][var30]] = var2.method6898();
            }
            this.field4031[var28] = new class459(this.field4030[var28]);
        }
    }

    @ObfuscatedName("lp.l(II)V")
    public void method5152(int arg0) {
    }

    @ObfuscatedName("lp.af(III)[B")
    public byte[] method5249(int arg0, int arg1) {
        return this.method5230(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("lp.al(II[II)[B")
    public byte[] method5230(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4038.length || this.field4038[arg0] == null || arg1 < 0 || arg1 >= this.field4038[arg0].length) {
            return null;
        }
        if (this.field4038[arg0][arg1] == null) {
            boolean var4 = this.method5198(arg0, arg2);
            if (!var4) {
                this.method5153(arg0);
                boolean var5 = this.method5198(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class284.method2637(this.field4038[arg0][arg1], false);
        if (this.field4037) {
            this.field4038[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("lp.aq(III)Z")
    public boolean method5237(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4038.length || this.field4038[arg0] == null || arg1 < 0 || arg1 >= this.field4038[arg0].length) {
            return false;
        } else if (this.field4038[arg0][arg1] != null) {
            return true;
        } else if (this.field4032[arg0] == null) {
            this.method5153(arg0);
            return this.field4032[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lp.ad(IB)Z")
    public boolean method5192(int arg0) {
        if (this.field4038.length == 1) {
            return this.method5237(0, arg0);
        } else if (this.field4038[arg0].length == 1) {
            return this.method5237(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("lp.an(II)Z")
    public boolean method5193(int arg0) {
        if (this.field4032[arg0] == null) {
            this.method5153(arg0);
            return this.field4032[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lp.aw(I)Z")
    public boolean method5188() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4023.length; var2++) {
            int var3 = this.field4023[var2];
            if (this.field4032[var3] == null) {
                this.method5153(var3);
                if (this.field4032[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("lp.r(IB)I")
    public int method5161(int arg0) {
        return this.field4032[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("lp.ah(II)[B")
    public byte[] method5195(int arg0) {
        if (this.field4038.length == 1) {
            return this.method5249(0, arg0);
        } else if (this.field4038[arg0].length == 1) {
            return this.method5249(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("lp.ao(III)[B")
    public byte[] method5196(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4038.length || this.field4038[arg0] == null || arg1 < 0 || arg1 >= this.field4038[arg0].length) {
            return null;
        }
        if (this.field4038[arg0][arg1] == null) {
            boolean var3 = this.method5198(arg0, (int[]) null);
            if (!var3) {
                this.method5153(arg0);
                boolean var4 = this.method5198(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class284.method2637(this.field4038[arg0][arg1], false);
    }

    @ObfuscatedName("lp.av(II)[B")
    public byte[] method5228(int arg0) {
        if (this.field4038.length == 1) {
            return this.method5196(0, arg0);
        } else if (this.field4038[arg0].length == 1) {
            return this.method5196(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("lp.k(II)V")
    public void method5153(int arg0) {
    }

    @ObfuscatedName("lp.ai(II)[I")
    public int[] method5252(int arg0) {
        return arg0 >= 0 && arg0 < this.field4029.length ? this.field4029[arg0] : null;
    }

    @ObfuscatedName("lp.ay(II)I")
    public int method5200(int arg0) {
        return this.field4038[arg0].length;
    }

    @ObfuscatedName("lp.aa(I)I")
    public int method5197() {
        return this.field4038.length;
    }

    @ObfuscatedName("lp.ax(I)V")
    public void method5212() {
        for (int var1 = 0; var1 < this.field4032.length; var1++) {
            this.field4032[var1] = null;
        }
    }

    @ObfuscatedName("lp.at(IB)V")
    public void method5213(int arg0) {
        for (int var2 = 0; var2 < this.field4038[arg0].length; var2++) {
            this.field4038[arg0][var2] = null;
        }
    }

    @ObfuscatedName("lp.br(I)V")
    public void method5204() {
        for (int var1 = 0; var1 < this.field4038.length; var1++) {
            if (this.field4038[var1] != null) {
                for (int var2 = 0; var2 < this.field4038[var1].length; var2++) {
                    this.field4038[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("lp.bc(I[IB)Z")
    public boolean method5198(int arg0, int[] arg1) {
        if (this.field4032[arg0] == null) {
            return false;
        }
        int var3 = this.field4024[arg0];
        int[] var4 = this.field4029[arg0];
        Object[] var5 = this.field4038[arg0];
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
            var8 = class284.method2637(this.field4032[arg0], true);
            class440 var9 = new class440(var8);
            var9.method6915(arg1, 5, var9.field4679.length);
        } else {
            var8 = class284.method2637(this.field4032[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method5112(var8);
        } catch (RuntimeException var31) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class440.method6434(var8, var8.length) + ",";
            int var14 = var8.length - 2;
            int var15 = class440.method2960(var8, 0, var14);
            throw class464.method2065(var31, var13 + var15 + "," + this.field4026[arg0] + "," + this.field4035);
        }
        if (this.field4036) {
            this.field4032[arg0] = null;
        }
        if (var3 > 1) {
            int var16 = var10.length;
            int var32 = var16 - 1;
            int var17 = var10[var32] & 0xFF;
            int var18 = var32 - var3 * var17 * 4;
            class440 var19 = new class440(var10);
            int[] var20 = new int[var3];
            var19.field4678 = var18;
            for (int var21 = 0; var21 < var17; var21++) {
                int var22 = 0;
                for (int var23 = 0; var23 < var3; var23++) {
                    var22 += var19.method6898();
                    var20[var23] += var22;
                }
            }
            byte[][] var24 = new byte[var3][];
            for (int var25 = 0; var25 < var3; var25++) {
                var24[var25] = new byte[var20[var25]];
                var20[var25] = 0;
            }
            var19.field4678 = var18;
            int var26 = 0;
            for (int var27 = 0; var27 < var17; var27++) {
                int var28 = 0;
                for (int var29 = 0; var29 < var3; var29++) {
                    var28 += var19.method6898();
                    System.arraycopy(var10, var26, var24[var29], var20[var29], var28);
                    var20[var29] += var28;
                    var26 += var28;
                }
            }
            for (int var30 = 0; var30 < var3; var30++) {
                if (this.field4037) {
                    var5[var4[var30]] = var24[var30];
                } else {
                    var5[var4[var30]] = class284.method4521(var24[var30], false);
                }
            }
        } else if (this.field4037) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class284.method4521(var10, false);
        }
        return true;
    }

    @ObfuscatedName("lp.bo(Ljava/lang/String;I)I")
    public int method5206(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4025.method7487(class344.method2410(var2));
    }

    @ObfuscatedName("lp.bl(ILjava/lang/String;I)I")
    public int method5207(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4031[arg0].method7487(class344.method2410(var3));
    }

    @ObfuscatedName("lp.bs(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method5211(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4025.method7487(class344.method2410(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4031[var5].method7487(class344.method2410(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("lp.bx(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method5208(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4025.method7487(class344.method2410(var3));
        int var6 = this.field4031[var5].method7487(class344.method2410(var4));
        return this.method5249(var5, var6);
    }

    @ObfuscatedName("lp.bd(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method5203(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4025.method7487(class344.method2410(var3));
        int var6 = this.field4031[var5].method7487(class344.method2410(var4));
        return this.method5237(var5, var6);
    }

    @ObfuscatedName("lp.bj(Ljava/lang/String;I)Z")
    public boolean method5210(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4025.method7487(class344.method2410(var2));
        return this.method5193(var3);
    }

    @ObfuscatedName("lp.be(Ljava/lang/String;I)V")
    public void method5191(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4025.method7487(class344.method2410(var2));
        if (var3 >= 0) {
            this.method5152(var3);
        }
    }

    @ObfuscatedName("lp.bf(Ljava/lang/String;I)I")
    public int method5223(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4025.method7487(class344.method2410(var2));
        return this.method5161(var3);
    }

    @ObfuscatedName("kj.bz([BB)[B")
    public static final byte[] method5112(byte[] arg0) {
        class440 var1 = new class440(arg0);
        int var2 = var1.method7071();
        int var3 = var1.method6898();
        if (var3 < 0 || !(field4027 == 0 || var3 <= field4027)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method6906(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method6898();
            if (var5 < 0 || field4027 != 0 && var5 > field4027) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class442.method7155(var6, var5, arg0, var3, 9);
            } else {
                field4033.method7483(var1, var6);
            }
            return var6;
        }
    }
}
