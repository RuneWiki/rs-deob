package deob;

@ObfuscatedName("jp")
public abstract class class276 {

    @ObfuscatedName("jp.k")
    public int field3590;

    @ObfuscatedName("jp.g")
    public int[] field3585;

    @ObfuscatedName("jp.t")
    public int[] field3586;

    @ObfuscatedName("jp.x")
    public class402 field3587;

    @ObfuscatedName("jp.u")
    public int[] field3588;

    @ObfuscatedName("jp.q")
    public int[] field3589;

    @ObfuscatedName("jp.s")
    public int[] field3601;

    @ObfuscatedName("jp.p")
    public int[][] field3591;

    @ObfuscatedName("jp.c")
    public int[][] field3592;

    @ObfuscatedName("jp.n")
    public class402[] field3593;

    @ObfuscatedName("jp.l")
    public Object[] field3584;

    @ObfuscatedName("jp.w")
    public Object[][] field3595;

    @ObfuscatedName("jp.a")
    public static class401 field3596 = new class401();

    @ObfuscatedName("jp.aw")
    public int field3599;

    @ObfuscatedName("jp.ak")
    public boolean field3597;

    @ObfuscatedName("jp.ad")
    public boolean field3598;

    @ObfuscatedName("jp.at")
    public static int field3600 = 0;

    public class276(boolean arg0, boolean arg1) {
        this.field3597 = arg0;
        this.field3598 = arg1;
    }

    @ObfuscatedName("jp.al([BI)V")
    public void method4503(byte[] arg0) {
        this.field3599 = class384.method3405(arg0, arg0.length);
        class384 var2 = new class384(method2103(arg0));
        int var3 = var2.method5902();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method5965();
        }
        int var4 = var2.method5902();
        if (var3 >= 7) {
            this.field3590 = var2.method5913();
        } else {
            this.field3590 = var2.method5899();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3585 = new int[this.field3590];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3590; var7++) {
                this.field3585[var7] = var5 += var2.method5913();
                if (this.field3585[var7] > var6) {
                    var6 = this.field3585[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3590; var8++) {
                this.field3585[var8] = var5 += var2.method5899();
                if (this.field3585[var8] > var6) {
                    var6 = this.field3585[var8];
                }
            }
        }
        this.field3588 = new int[var6 + 1];
        this.field3589 = new int[var6 + 1];
        this.field3601 = new int[var6 + 1];
        this.field3591 = new int[var6 + 1][];
        this.field3584 = new Object[var6 + 1];
        this.field3595 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3586 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3590; var9++) {
                this.field3586[this.field3585[var9]] = var2.method5965();
            }
            this.field3587 = new class402(this.field3586);
        }
        for (int var10 = 0; var10 < this.field3590; var10++) {
            this.field3588[this.field3585[var10]] = var2.method5965();
        }
        for (int var11 = 0; var11 < this.field3590; var11++) {
            this.field3589[this.field3585[var11]] = var2.method5965();
        }
        for (int var12 = 0; var12 < this.field3590; var12++) {
            this.field3601[this.field3585[var12]] = var2.method5899();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3590; var13++) {
                int var14 = this.field3585[var13];
                int var15 = this.field3601[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3591[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3591[var14][var18] = var16 += var2.method5913();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3595[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3590; var20++) {
                int var21 = this.field3585[var20];
                int var22 = this.field3601[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3591[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3591[var21][var25] = var23 += var2.method5899();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3595[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3592 = new int[var6 + 1][];
        this.field3593 = new class402[var6 + 1];
        for (int var27 = 0; var27 < this.field3590; var27++) {
            int var28 = this.field3585[var27];
            int var29 = this.field3601[var28];
            this.field3592[var28] = new int[this.field3595[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3592[var28][this.field3591[var28][var30]] = var2.method5965();
            }
            this.field3593[var28] = new class402(this.field3592[var28]);
        }
    }

    @ObfuscatedName("jp.v(II)V")
    public void method4499(int arg0) {
    }

    @ObfuscatedName("jp.aj(IIS)[B")
    public byte[] method4504(int arg0, int arg1) {
        return this.method4505(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("jp.ac(II[II)[B")
    public byte[] method4505(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3595.length || this.field3595[arg0] == null || arg1 < 0 || arg1 >= this.field3595[arg0].length) {
            return null;
        }
        if (this.field3595[arg0][arg1] == null) {
            boolean var4 = this.method4519(arg0, arg2);
            if (!var4) {
                this.method4461(arg0);
                boolean var5 = this.method4519(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class252.method5001(this.field3595[arg0][arg1], false);
        if (this.field3598) {
            this.field3595[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("jp.as(III)Z")
    public boolean method4506(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3595.length || this.field3595[arg0] == null || arg1 < 0 || arg1 >= this.field3595[arg0].length) {
            return false;
        } else if (this.field3595[arg0][arg1] != null) {
            return true;
        } else if (this.field3584[arg0] == null) {
            this.method4461(arg0);
            return this.field3584[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jp.au(IB)Z")
    public boolean method4507(int arg0) {
        if (this.field3595.length == 1) {
            return this.method4506(0, arg0);
        } else if (this.field3595[arg0].length == 1) {
            return this.method4506(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jp.ay(IB)Z")
    public boolean method4569(int arg0) {
        if (this.field3584[arg0] == null) {
            this.method4461(arg0);
            return this.field3584[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jp.am(I)Z")
    public boolean method4543() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3585.length; var2++) {
            int var3 = this.field3585[var2];
            if (this.field3584[var3] == null) {
                this.method4461(var3);
                if (this.field3584[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("jp.h(II)I")
    public int method4483(int arg0) {
        return this.field3584[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("jp.aa(II)[B")
    public byte[] method4511(int arg0) {
        if (this.field3595.length == 1) {
            return this.method4504(0, arg0);
        } else if (this.field3595[arg0].length == 1) {
            return this.method4504(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jp.ai(III)[B")
    public byte[] method4529(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3595.length || this.field3595[arg0] == null || arg1 < 0 || arg1 >= this.field3595[arg0].length) {
            return null;
        }
        if (this.field3595[arg0][arg1] == null) {
            boolean var3 = this.method4519(arg0, (int[]) null);
            if (!var3) {
                this.method4461(arg0);
                boolean var4 = this.method4519(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class252.method5001(this.field3595[arg0][arg1], false);
    }

    @ObfuscatedName("jp.av(II)[B")
    public byte[] method4571(int arg0) {
        if (this.field3595.length == 1) {
            return this.method4529(0, arg0);
        } else if (this.field3595[arg0].length == 1) {
            return this.method4529(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jp.y(II)V")
    public void method4461(int arg0) {
    }

    @ObfuscatedName("jp.ax(II)[I")
    public int[] method4513(int arg0) {
        return arg0 >= 0 && arg0 < this.field3591.length ? this.field3591[arg0] : null;
    }

    @ObfuscatedName("jp.ar(II)I")
    public int method4514(int arg0) {
        return this.field3595[arg0].length;
    }

    @ObfuscatedName("jp.af(B)I")
    public int method4515() {
        return this.field3595.length;
    }

    @ObfuscatedName("jp.bq(B)V")
    public void method4516() {
        for (int var1 = 0; var1 < this.field3584.length; var1++) {
            this.field3584[var1] = null;
        }
    }

    @ObfuscatedName("jp.bx(II)V")
    public void method4517(int arg0) {
        for (int var2 = 0; var2 < this.field3595[arg0].length; var2++) {
            this.field3595[arg0][var2] = null;
        }
    }

    @ObfuscatedName("jp.bi(I)V")
    public void method4518() {
        for (int var1 = 0; var1 < this.field3595.length; var1++) {
            if (this.field3595[var1] != null) {
                for (int var2 = 0; var2 < this.field3595[var1].length; var2++) {
                    this.field3595[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("jp.bz(I[IB)Z")
    public boolean method4519(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("jp.bb(Ljava/lang/String;B)I")
    public int method4582(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3587.method6450(class305.method5653(var2));
    }

    @ObfuscatedName("jp.bv(ILjava/lang/String;I)I")
    public int method4521(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3593[arg0].method6450(class305.method5653(var3));
    }

    @ObfuscatedName("jp.bc(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method4522(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3587.method6450(class305.method5653(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3593[var5].method6450(class305.method5653(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("jp.be(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4567(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3587.method6450(class305.method5653(var3));
        int var6 = this.field3593[var5].method6450(class305.method5653(var4));
        return this.method4504(var5, var6);
    }

    @ObfuscatedName("jp.ba(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4566(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3587.method6450(class305.method5653(var3));
        int var6 = this.field3593[var5].method6450(class305.method5653(var4));
        return this.method4506(var5, var6);
    }

    @ObfuscatedName("jp.bs(Ljava/lang/String;I)Z")
    public boolean method4525(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3587.method6450(class305.method5653(var2));
        return this.method4569(var3);
    }

    @ObfuscatedName("jp.br(Ljava/lang/String;I)V")
    public void method4526(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3587.method6450(class305.method5653(var2));
        if (var3 >= 0) {
            this.method4499(var3);
        }
    }

    @ObfuscatedName("jp.bw(Ljava/lang/String;I)I")
    public int method4527(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3587.method6450(class305.method5653(var2));
        return this.method4483(var3);
    }

    @ObfuscatedName("dm.by([BI)[B")
    public static final byte[] method2103(byte[] arg0) {
        class384 var1 = new class384(arg0);
        int var2 = var1.method5902();
        int var3 = var1.method5965();
        if (var3 < 0 || !(field3600 == 0 || var3 <= field3600)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5909(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5965();
            if (var5 < 0 || field3600 != 0 && var5 > field3600) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class386.method6123(var6, var5, arg0, var3, 9);
            } else {
                field3596.method6444(var1, var6);
            }
            return var6;
        }
    }
}
