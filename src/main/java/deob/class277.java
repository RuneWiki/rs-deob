package deob;

@ObfuscatedName("jy")
public abstract class class277 {

    @ObfuscatedName("jy.k")
    public int field3594;

    @ObfuscatedName("jy.a")
    public int[] field3579;

    @ObfuscatedName("jy.q")
    public int[] field3580;

    @ObfuscatedName("jy.u")
    public class404 field3581;

    @ObfuscatedName("jy.e")
    public int[] field3584;

    @ObfuscatedName("jy.c")
    public int[] field3585;

    @ObfuscatedName("jy.i")
    public int[] field3583;

    @ObfuscatedName("jy.m")
    public int[][] field3582;

    @ObfuscatedName("jy.b")
    public int[][] field3578;

    @ObfuscatedName("jy.z")
    public class404[] field3586;

    @ObfuscatedName("jy.d")
    public Object[] field3588;

    @ObfuscatedName("jy.y")
    public Object[][] field3589;

    @ObfuscatedName("jy.g")
    public static class403 field3590 = new class403();

    @ObfuscatedName("jy.ae")
    public int field3591;

    @ObfuscatedName("jy.an")
    public boolean field3587;

    @ObfuscatedName("jy.am")
    public boolean field3593;

    @ObfuscatedName("jy.al")
    public static int field3592 = 0;

    public class277(boolean arg0, boolean arg1) {
        this.field3587 = arg0;
        this.field3593 = arg1;
    }

    @ObfuscatedName("jy.at([BI)V")
    public void method4458(byte[] arg0) {
        this.field3591 = class385.method3950(arg0, arg0.length);
        class385 var2 = new class385(method833(arg0));
        int var3 = var2.method5958();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method6182();
        }
        int var4 = var2.method5958();
        if (var3 >= 7) {
            this.field3594 = var2.method6139();
        } else {
            this.field3594 = var2.method6053();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3579 = new int[this.field3594];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3594; var7++) {
                this.field3579[var7] = var5 += var2.method6139();
                if (this.field3579[var7] > var6) {
                    var6 = this.field3579[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3594; var8++) {
                this.field3579[var8] = var5 += var2.method6053();
                if (this.field3579[var8] > var6) {
                    var6 = this.field3579[var8];
                }
            }
        }
        this.field3584 = new int[var6 + 1];
        this.field3585 = new int[var6 + 1];
        this.field3583 = new int[var6 + 1];
        this.field3582 = new int[var6 + 1][];
        this.field3588 = new Object[var6 + 1];
        this.field3589 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3580 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3594; var9++) {
                this.field3580[this.field3579[var9]] = var2.method6182();
            }
            this.field3581 = new class404(this.field3580);
        }
        for (int var10 = 0; var10 < this.field3594; var10++) {
            this.field3584[this.field3579[var10]] = var2.method6182();
        }
        for (int var11 = 0; var11 < this.field3594; var11++) {
            this.field3585[this.field3579[var11]] = var2.method6182();
        }
        for (int var12 = 0; var12 < this.field3594; var12++) {
            this.field3583[this.field3579[var12]] = var2.method6053();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3594; var13++) {
                int var14 = this.field3579[var13];
                int var15 = this.field3583[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3582[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3582[var14][var18] = var16 += var2.method6139();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3589[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3594; var20++) {
                int var21 = this.field3579[var20];
                int var22 = this.field3583[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3582[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3582[var21][var25] = var23 += var2.method6053();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3589[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3578 = new int[var6 + 1][];
        this.field3586 = new class404[var6 + 1];
        for (int var27 = 0; var27 < this.field3594; var27++) {
            int var28 = this.field3579[var27];
            int var29 = this.field3583[var28];
            this.field3578[var28] = new int[this.field3589[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3578[var28][this.field3582[var28][var30]] = var2.method6182();
            }
            this.field3586[var28] = new class404(this.field3578[var28]);
        }
    }

    @ObfuscatedName("jy.v(II)V")
    public void method4419(int arg0) {
    }

    @ObfuscatedName("jy.af(III)[B")
    public byte[] method4459(int arg0, int arg1) {
        return this.method4460(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("jy.ar(II[IB)[B")
    public byte[] method4460(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3589.length || this.field3589[arg0] == null || arg1 < 0 || arg1 >= this.field3589[arg0].length) {
            return null;
        }
        if (this.field3589[arg0][arg1] == null) {
            boolean var4 = this.method4513(arg0, arg2);
            if (!var4) {
                this.method4420(arg0);
                boolean var5 = this.method4513(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class253.method4181(this.field3589[arg0][arg1], false);
        if (this.field3593) {
            this.field3589[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("jy.ay(III)Z")
    public boolean method4539(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3589.length || this.field3589[arg0] == null || arg1 < 0 || arg1 >= this.field3589[arg0].length) {
            return false;
        } else if (this.field3589[arg0][arg1] != null) {
            return true;
        } else if (this.field3588[arg0] == null) {
            this.method4420(arg0);
            return this.field3588[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jy.ap(IS)Z")
    public boolean method4485(int arg0) {
        if (this.field3589.length == 1) {
            return this.method4539(0, arg0);
        } else if (this.field3589[arg0].length == 1) {
            return this.method4539(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jy.ah(IS)Z")
    public boolean method4463(int arg0) {
        if (this.field3588[arg0] == null) {
            this.method4420(arg0);
            return this.field3588[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jy.ag(I)Z")
    public boolean method4464() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3579.length; var2++) {
            int var3 = this.field3579[var2];
            if (this.field3588[var3] == null) {
                this.method4420(var3);
                if (this.field3588[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("jy.o(IB)I")
    public int method4427(int arg0) {
        return this.field3588[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("jy.ai(II)[B")
    public byte[] method4466(int arg0) {
        if (this.field3589.length == 1) {
            return this.method4459(0, arg0);
        } else if (this.field3589[arg0].length == 1) {
            return this.method4459(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jy.ad(III)[B")
    public byte[] method4467(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3589.length || this.field3589[arg0] == null || arg1 < 0 || arg1 >= this.field3589[arg0].length) {
            return null;
        }
        if (this.field3589[arg0][arg1] == null) {
            boolean var3 = this.method4513(arg0, (int[]) null);
            if (!var3) {
                this.method4420(arg0);
                boolean var4 = this.method4513(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class253.method4181(this.field3589[arg0][arg1], false);
    }

    @ObfuscatedName("jy.ac(IS)[B")
    public byte[] method4519(int arg0) {
        if (this.field3589.length == 1) {
            return this.method4467(0, arg0);
        } else if (this.field3589[arg0].length == 1) {
            return this.method4467(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jy.j(IB)V")
    public void method4420(int arg0) {
    }

    @ObfuscatedName("jy.aw(II)[I")
    public int[] method4521(int arg0) {
        return arg0 >= 0 && arg0 < this.field3582.length ? this.field3582[arg0] : null;
    }

    @ObfuscatedName("jy.bt(II)I")
    public int method4484(int arg0) {
        return this.field3589[arg0].length;
    }

    @ObfuscatedName("jy.bk(I)I")
    public int method4470() {
        return this.field3589.length;
    }

    @ObfuscatedName("jy.br(B)V")
    public void method4471() {
        for (int var1 = 0; var1 < this.field3588.length; var1++) {
            this.field3588[var1] = null;
        }
    }

    @ObfuscatedName("jy.by(II)V")
    public void method4512(int arg0) {
        for (int var2 = 0; var2 < this.field3589[arg0].length; var2++) {
            this.field3589[arg0][var2] = null;
        }
    }

    @ObfuscatedName("jy.bv(B)V")
    public void method4473() {
        for (int var1 = 0; var1 < this.field3589.length; var1++) {
            if (this.field3589[var1] != null) {
                for (int var2 = 0; var2 < this.field3589[var1].length; var2++) {
                    this.field3589[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("jy.bf(I[IB)Z")
    public boolean method4513(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("jy.bd(Ljava/lang/String;I)I")
    public int method4474(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3581.method6515(class306.method342(var2));
    }

    @ObfuscatedName("jy.bg(ILjava/lang/String;B)I")
    public int method4476(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3586[arg0].method6515(class306.method342(var3));
    }

    @ObfuscatedName("jy.bw(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method4477(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3581.method6515(class306.method342(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3586[var5].method6515(class306.method342(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("jy.bo(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4478(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3581.method6515(class306.method342(var3));
        int var6 = this.field3586[var5].method6515(class306.method342(var4));
        return this.method4459(var5, var6);
    }

    @ObfuscatedName("jy.bm(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4510(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3581.method6515(class306.method342(var3));
        int var6 = this.field3586[var5].method6515(class306.method342(var4));
        return this.method4539(var5, var6);
    }

    @ObfuscatedName("jy.ba(Ljava/lang/String;B)Z")
    public boolean method4480(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3581.method6515(class306.method342(var2));
        return this.method4463(var3);
    }

    @ObfuscatedName("jy.bu(Ljava/lang/String;I)V")
    public void method4481(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3581.method6515(class306.method342(var2));
        if (var3 >= 0) {
            this.method4419(var3);
        }
    }

    @ObfuscatedName("jy.bl(Ljava/lang/String;I)I")
    public int method4482(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3581.method6515(class306.method342(var2));
        return this.method4427(var3);
    }

    @ObfuscatedName("ah.bj([BI)[B")
    public static final byte[] method833(byte[] arg0) {
        class385 var1 = new class385(arg0);
        int var2 = var1.method5958();
        int var3 = var1.method6182();
        if (var3 < 0 || !(field3592 == 0 || var3 <= field3592)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5970(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method6182();
            if (var5 < 0 || field3592 != 0 && var5 > field3592) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class387.method6209(var6, var5, arg0, var3, 9);
            } else {
                field3590.method6511(var1, var6);
            }
            return var6;
        }
    }
}
