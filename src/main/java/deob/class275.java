package deob;

@ObfuscatedName("jv")
public abstract class class275 {

    @ObfuscatedName("jv.c")
    public int field3600;

    @ObfuscatedName("jv.e")
    public int[] field3585;

    @ObfuscatedName("jv.g")
    public int[] field3584;

    @ObfuscatedName("jv.a")
    public class401 field3594;

    @ObfuscatedName("jv.k")
    public int[] field3587;

    @ObfuscatedName("jv.m")
    public int[] field3586;

    @ObfuscatedName("jv.x")
    public int[] field3589;

    @ObfuscatedName("jv.z")
    public int[][] field3591;

    @ObfuscatedName("jv.w")
    public int[][] field3592;

    @ObfuscatedName("jv.t")
    public class401[] field3593;

    @ObfuscatedName("jv.h")
    public Object[] field3588;

    @ObfuscatedName("jv.q")
    public Object[][] field3595;

    @ObfuscatedName("jv.i")
    public static class400 field3596 = new class400();

    @ObfuscatedName("jv.ae")
    public int field3597;

    @ObfuscatedName("jv.ap")
    public boolean field3598;

    @ObfuscatedName("jv.ab")
    public boolean field3599;

    @ObfuscatedName("jv.al")
    public static int field3590 = 0;

    public class275(boolean arg0, boolean arg1) {
        this.field3598 = arg0;
        this.field3599 = arg1;
    }

    @ObfuscatedName("jv.aq([BI)V")
    public void method4466(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class383.method1015(arg0, 0, var2);
        this.field3597 = var3;
        class383 var4 = new class383(method2277(arg0));
        int var5 = var4.method5965();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method5970();
        }
        int var6 = var4.method5965();
        if (var5 >= 7) {
            this.field3600 = var4.method5968();
        } else {
            this.field3600 = var4.method5967();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3585 = new int[this.field3600];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3600; var9++) {
                this.field3585[var9] = var7 += var4.method5968();
                if (this.field3585[var9] > var8) {
                    var8 = this.field3585[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3600; var10++) {
                this.field3585[var10] = var7 += var4.method5967();
                if (this.field3585[var10] > var8) {
                    var8 = this.field3585[var10];
                }
            }
        }
        this.field3587 = new int[var8 + 1];
        this.field3586 = new int[var8 + 1];
        this.field3589 = new int[var8 + 1];
        this.field3591 = new int[var8 + 1][];
        this.field3588 = new Object[var8 + 1];
        this.field3595 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3584 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3600; var11++) {
                this.field3584[this.field3585[var11]] = var4.method5970();
            }
            this.field3594 = new class401(this.field3584);
        }
        for (int var12 = 0; var12 < this.field3600; var12++) {
            this.field3587[this.field3585[var12]] = var4.method5970();
        }
        for (int var13 = 0; var13 < this.field3600; var13++) {
            this.field3586[this.field3585[var13]] = var4.method5970();
        }
        for (int var14 = 0; var14 < this.field3600; var14++) {
            this.field3589[this.field3585[var14]] = var4.method5967();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3600; var15++) {
                int var16 = this.field3585[var15];
                int var17 = this.field3589[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3591[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3591[var16][var20] = var18 += var4.method5968();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3595[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3600; var22++) {
                int var23 = this.field3585[var22];
                int var24 = this.field3589[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3591[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3591[var23][var27] = var25 += var4.method5967();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3595[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3592 = new int[var8 + 1][];
        this.field3593 = new class401[var8 + 1];
        for (int var29 = 0; var29 < this.field3600; var29++) {
            int var30 = this.field3585[var29];
            int var31 = this.field3589[var30];
            this.field3592[var30] = new int[this.field3595[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3592[var30][this.field3591[var30][var32]] = var4.method5970();
            }
            this.field3593[var30] = new class401(this.field3592[var30]);
        }
    }

    @ObfuscatedName("jv.f(IB)V")
    public void method4423(int arg0) {
    }

    @ObfuscatedName("jv.aw(III)[B")
    public byte[] method4468(int arg0, int arg1) {
        return this.method4469(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("jv.af(II[II)[B")
    public byte[] method4469(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3595.length || this.field3595[arg0] == null || arg1 < 0 || arg1 >= this.field3595[arg0].length) {
            return null;
        }
        if (this.field3595[arg0][arg1] == null) {
            boolean var4 = this.method4483(arg0, arg2);
            if (!var4) {
                this.method4424(arg0);
                boolean var5 = this.method4483(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class251.method5100(this.field3595[arg0][arg1], false);
        if (this.field3599) {
            this.field3595[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("jv.ak(IIB)Z")
    public boolean method4470(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3595.length || this.field3595[arg0] == null || arg1 < 0 || arg1 >= this.field3595[arg0].length) {
            return false;
        } else if (this.field3595[arg0][arg1] != null) {
            return true;
        } else if (this.field3588[arg0] == null) {
            this.method4424(arg0);
            return this.field3588[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jv.ay(IB)Z")
    public boolean method4510(int arg0) {
        if (this.field3595.length == 1) {
            return this.method4470(0, arg0);
        } else if (this.field3595[arg0].length == 1) {
            return this.method4470(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jv.aa(IB)Z")
    public boolean method4493(int arg0) {
        if (this.field3588[arg0] == null) {
            this.method4424(arg0);
            return this.field3588[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jv.au(I)Z")
    public boolean method4504() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3585.length; var2++) {
            int var3 = this.field3585[var2];
            if (this.field3588[var3] == null) {
                this.method4424(var3);
                if (this.field3588[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("jv.d(II)I")
    public int method4450(int arg0) {
        return this.field3588[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("jv.an(IB)[B")
    public byte[] method4474(int arg0) {
        if (this.field3595.length == 1) {
            return this.method4468(0, arg0);
        } else if (this.field3595[arg0].length == 1) {
            return this.method4468(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jv.bd(III)[B")
    public byte[] method4499(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3595.length || this.field3595[arg0] == null || arg1 < 0 || arg1 >= this.field3595[arg0].length) {
            return null;
        }
        if (this.field3595[arg0][arg1] == null) {
            boolean var3 = this.method4483(arg0, (int[]) null);
            if (!var3) {
                this.method4424(arg0);
                boolean var4 = this.method4483(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class251.method5100(this.field3595[arg0][arg1], false);
    }

    @ObfuscatedName("jv.bt(II)[B")
    public byte[] method4476(int arg0) {
        if (this.field3595.length == 1) {
            return this.method4499(0, arg0);
        } else if (this.field3595[arg0].length == 1) {
            return this.method4499(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jv.y(IB)V")
    public void method4424(int arg0) {
    }

    @ObfuscatedName("jv.bq(IB)[I")
    public int[] method4477(int arg0) {
        return arg0 >= 0 && arg0 < this.field3591.length ? this.field3591[arg0] : null;
    }

    @ObfuscatedName("jv.bu(II)I")
    public int method4478(int arg0) {
        return this.field3595[arg0].length;
    }

    @ObfuscatedName("jv.bl(I)I")
    public int method4536() {
        return this.field3595.length;
    }

    @ObfuscatedName("jv.bv(B)V")
    public void method4480() {
        for (int var1 = 0; var1 < this.field3588.length; var1++) {
            this.field3588[var1] = null;
        }
    }

    @ObfuscatedName("jv.bm(II)V")
    public void method4481(int arg0) {
        for (int var2 = 0; var2 < this.field3595[arg0].length; var2++) {
            this.field3595[arg0][var2] = null;
        }
    }

    @ObfuscatedName("jv.bz(B)V")
    public void method4529() {
        for (int var1 = 0; var1 < this.field3595.length; var1++) {
            if (this.field3595[var1] != null) {
                for (int var2 = 0; var2 < this.field3595[var1].length; var2++) {
                    this.field3595[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("jv.bh(I[II)Z")
    public boolean method4483(int arg0, int[] arg1) {
        if (this.field3588[arg0] == null) {
            return false;
        }
        int var3 = this.field3589[arg0];
        int[] var4 = this.field3591[arg0];
        Object[] var5 = this.field3595[arg0];
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
            var8 = class251.method5100(this.field3588[arg0], true);
            class383 var9 = new class383(var8);
            var9.method6127(arg1, 5, var9.field4155.length);
        } else {
            var8 = class251.method5100(this.field3588[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2277(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class383.method1015(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class383.method1015(var8, 0, var17);
            throw class406.method3325(var34, var16 + var18 + "," + this.field3587[arg0] + "," + this.field3597);
        }
        if (this.field3598) {
            this.field3588[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class383 var22 = new class383(var10);
            int[] var23 = new int[var3];
            var22.field4158 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method5970();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field4158 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method5970();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field3599) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class251.method4623(var27[var33], false);
                }
            }
        } else if (this.field3599) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class251.method4623(var10, false);
        }
        return true;
    }

    @ObfuscatedName("jv.bs(Ljava/lang/String;I)I")
    public int method4484(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3594.method6489(class304.method1717(var2));
    }

    @ObfuscatedName("jv.br(ILjava/lang/String;I)I")
    public int method4485(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3593[arg0].method6489(class304.method1717(var3));
    }

    @ObfuscatedName("jv.bf(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method4501(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3594.method6489(class304.method1717(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3593[var5].method6489(class304.method1717(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("jv.ba(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4471(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3594.method6489(class304.method1717(var3));
        int var6 = this.field3593[var5].method6489(class304.method1717(var4));
        return this.method4468(var5, var6);
    }

    @ObfuscatedName("jv.be(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4488(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3594.method6489(class304.method1717(var3));
        int var6 = this.field3593[var5].method6489(class304.method1717(var4));
        return this.method4470(var5, var6);
    }

    @ObfuscatedName("jv.bj(Ljava/lang/String;I)Z")
    public boolean method4489(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3594.method6489(class304.method1717(var2));
        return this.method4493(var3);
    }

    @ObfuscatedName("jv.bx(Ljava/lang/String;B)V")
    public void method4490(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3594.method6489(class304.method1717(var2));
        if (var3 >= 0) {
            this.method4423(var3);
        }
    }

    @ObfuscatedName("jv.bp(Ljava/lang/String;I)I")
    public int method4492(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3594.method6489(class304.method1717(var2));
        return this.method4450(var3);
    }

    @ObfuscatedName("dn.bn([BI)[B")
    public static final byte[] method2277(byte[] arg0) {
        class383 var1 = new class383(arg0);
        int var2 = var1.method5965();
        int var3 = var1.method5970();
        if (var3 < 0 || !(field3590 == 0 || var3 <= field3590)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method6100(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5970();
            if (var5 < 0 || field3590 != 0 && var5 > field3590) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class385.method6211(var6, var5, arg0, var3, 9);
            } else {
                field3596.method6487(var1, var6);
            }
            return var6;
        }
    }
}
