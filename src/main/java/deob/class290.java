package deob;

@ObfuscatedName("kl")
public abstract class class290 {

    @ObfuscatedName("kl.v")
    public int field3696;

    @ObfuscatedName("kl.s")
    public int[] field3703;

    @ObfuscatedName("kl.c")
    public int[] field3698;

    @ObfuscatedName("kl.b")
    public class420 field3697;

    @ObfuscatedName("kl.x")
    public int[] field3706;

    @ObfuscatedName("kl.p")
    public int[] field3699;

    @ObfuscatedName("kl.z")
    public int[] field3702;

    @ObfuscatedName("kl.h")
    public int[][] field3712;

    @ObfuscatedName("kl.o")
    public int[][] field3695;

    @ObfuscatedName("kl.r")
    public class420[] field3705;

    @ObfuscatedName("kl.n")
    public Object[] field3704;

    @ObfuscatedName("kl.u")
    public Object[][] field3701;

    @ObfuscatedName("kl.d")
    public static class419 field3708 = new class419();

    @ObfuscatedName("kl.ab")
    public int field3709;

    @ObfuscatedName("kl.ad")
    public boolean field3710;

    @ObfuscatedName("kl.as")
    public boolean field3711;

    @ObfuscatedName("kl.ak")
    public static int field3707 = 0;

    public class290(boolean arg0, boolean arg1) {
        this.field3710 = arg0;
        this.field3711 = arg1;
    }

    @ObfuscatedName("kl.aj([BB)V")
    public void method4755(byte[] arg0) {
        this.field3709 = class401.method2096(arg0, arg0.length);
        class401 var2 = new class401(method111(arg0));
        int var3 = var2.method6272();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method6277();
        }
        int var4 = var2.method6272();
        if (var3 >= 7) {
            this.field3696 = var2.method6288();
        } else {
            this.field3696 = var2.method6284();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3703 = new int[this.field3696];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3696; var7++) {
                this.field3703[var7] = var5 += var2.method6288();
                if (this.field3703[var7] > var6) {
                    var6 = this.field3703[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3696; var8++) {
                this.field3703[var8] = var5 += var2.method6284();
                if (this.field3703[var8] > var6) {
                    var6 = this.field3703[var8];
                }
            }
        }
        this.field3706 = new int[var6 + 1];
        this.field3699 = new int[var6 + 1];
        this.field3702 = new int[var6 + 1];
        this.field3712 = new int[var6 + 1][];
        this.field3704 = new Object[var6 + 1];
        this.field3701 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3698 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3696; var9++) {
                this.field3698[this.field3703[var9]] = var2.method6277();
            }
            this.field3697 = new class420(this.field3698);
        }
        for (int var10 = 0; var10 < this.field3696; var10++) {
            this.field3706[this.field3703[var10]] = var2.method6277();
        }
        for (int var11 = 0; var11 < this.field3696; var11++) {
            this.field3699[this.field3703[var11]] = var2.method6277();
        }
        for (int var12 = 0; var12 < this.field3696; var12++) {
            this.field3702[this.field3703[var12]] = var2.method6284();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3696; var13++) {
                int var14 = this.field3703[var13];
                int var15 = this.field3702[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3712[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3712[var14][var18] = var16 += var2.method6288();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3701[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3696; var20++) {
                int var21 = this.field3703[var20];
                int var22 = this.field3702[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3712[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3712[var21][var25] = var23 += var2.method6284();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3701[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3695 = new int[var6 + 1][];
        this.field3705 = new class420[var6 + 1];
        for (int var27 = 0; var27 < this.field3696; var27++) {
            int var28 = this.field3703[var27];
            int var29 = this.field3702[var28];
            this.field3695[var28] = new int[this.field3701[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3695[var28][this.field3712[var28][var30]] = var2.method6277();
            }
            this.field3705[var28] = new class420(this.field3695[var28]);
        }
    }

    @ObfuscatedName("kl.f(IB)V")
    public void method4730(int arg0) {
    }

    @ObfuscatedName("kl.am(III)[B")
    public byte[] method4756(int arg0, int arg1) {
        return this.method4757(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("kl.aw(II[IB)[B")
    public byte[] method4757(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3701.length || this.field3701[arg0] == null || arg1 < 0 || arg1 >= this.field3701[arg0].length) {
            return null;
        }
        if (this.field3701[arg0][arg1] == null) {
            boolean var4 = this.method4806(arg0, arg2);
            if (!var4) {
                this.method4733(arg0);
                boolean var5 = this.method4806(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = Statics.method3566(this.field3701[arg0][arg1], false);
        if (this.field3711) {
            this.field3701[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("kl.az(III)Z")
    public boolean method4758(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3701.length || this.field3701[arg0] == null || arg1 < 0 || arg1 >= this.field3701[arg0].length) {
            return false;
        } else if (this.field3701[arg0][arg1] != null) {
            return true;
        } else if (this.field3704[arg0] == null) {
            this.method4733(arg0);
            return this.field3704[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("kl.ae(II)Z")
    public boolean method4759(int arg0) {
        if (this.field3701.length == 1) {
            return this.method4758(0, arg0);
        } else if (this.field3701[arg0].length == 1) {
            return this.method4758(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("kl.ai(II)Z")
    public boolean method4760(int arg0) {
        if (this.field3704[arg0] == null) {
            this.method4733(arg0);
            return this.field3704[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("kl.bg(B)Z")
    public boolean method4761() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3703.length; var2++) {
            int var3 = this.field3703[var2];
            if (this.field3704[var3] == null) {
                this.method4733(var3);
                if (this.field3704[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("kl.e(IB)I")
    public int method4714(int arg0) {
        return this.field3704[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("kl.bf(II)[B")
    public byte[] method4762(int arg0) {
        if (this.field3701.length == 1) {
            return this.method4756(0, arg0);
        } else if (this.field3701[arg0].length == 1) {
            return this.method4756(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("kl.bj(III)[B")
    public byte[] method4763(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3701.length || this.field3701[arg0] == null || arg1 < 0 || arg1 >= this.field3701[arg0].length) {
            return null;
        }
        if (this.field3701[arg0][arg1] == null) {
            boolean var3 = this.method4806(arg0, (int[]) null);
            if (!var3) {
                this.method4733(arg0);
                boolean var4 = this.method4806(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return Statics.method3566(this.field3701[arg0][arg1], false);
    }

    @ObfuscatedName("kl.bo(II)[B")
    public byte[] method4764(int arg0) {
        if (this.field3701.length == 1) {
            return this.method4763(0, arg0);
        } else if (this.field3701[arg0].length == 1) {
            return this.method4763(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("kl.j(IB)V")
    public void method4733(int arg0) {
    }

    @ObfuscatedName("kl.bx(II)[I")
    public int[] method4765(int arg0) {
        return arg0 >= 0 && arg0 < this.field3712.length ? this.field3712[arg0] : null;
    }

    @ObfuscatedName("kl.bu(II)I")
    public int method4774(int arg0) {
        return this.field3701[arg0].length;
    }

    @ObfuscatedName("kl.bc(B)I")
    public int method4794() {
        return this.field3701.length;
    }

    @ObfuscatedName("kl.ba(I)V")
    public void method4823() {
        for (int var1 = 0; var1 < this.field3704.length; var1++) {
            this.field3704[var1] = null;
        }
    }

    @ObfuscatedName("kl.bm(II)V")
    public void method4768(int arg0) {
        for (int var2 = 0; var2 < this.field3701[arg0].length; var2++) {
            this.field3701[arg0][var2] = null;
        }
    }

    @ObfuscatedName("kl.bv(I)V")
    public void method4841() {
        for (int var1 = 0; var1 < this.field3701.length; var1++) {
            if (this.field3701[var1] != null) {
                for (int var2 = 0; var2 < this.field3701[var1].length; var2++) {
                    this.field3701[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("kl.bs(I[IS)Z")
    public boolean method4806(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("kl.bd(Ljava/lang/String;I)I")
    public int method4771(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3697.method6812(class319.method2297(var2));
    }

    @ObfuscatedName("kl.bb(ILjava/lang/String;B)I")
    public int method4848(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3705[arg0].method6812(class319.method2297(var3));
    }

    @ObfuscatedName("kl.bh(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4773(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3697.method6812(class319.method2297(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3705[var5].method6812(class319.method2297(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("kl.bi(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4807(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3697.method6812(class319.method2297(var3));
        int var6 = this.field3705[var5].method6812(class319.method2297(var4));
        return this.method4756(var5, var6);
    }

    @ObfuscatedName("kl.bq(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4775(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3697.method6812(class319.method2297(var3));
        int var6 = this.field3705[var5].method6812(class319.method2297(var4));
        return this.method4758(var5, var6);
    }

    @ObfuscatedName("kl.by(Ljava/lang/String;B)Z")
    public boolean method4776(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3697.method6812(class319.method2297(var2));
        return this.method4760(var3);
    }

    @ObfuscatedName("kl.be(Ljava/lang/String;I)V")
    public void method4839(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3697.method6812(class319.method2297(var2));
        if (var3 >= 0) {
            this.method4730(var3);
        }
    }

    @ObfuscatedName("kl.bw(Ljava/lang/String;I)I")
    public int method4842(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3697.method6812(class319.method2297(var2));
        return this.method4714(var3);
    }

    @ObfuscatedName("g.bn([BI)[B")
    public static final byte[] method111(byte[] arg0) {
        class401 var1 = new class401(arg0);
        int var2 = var1.method6272();
        int var3 = var1.method6277();
        if (var3 < 0 || !(field3707 == 0 || var3 <= field3707)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method6299(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method6277();
            if (var5 < 0 || field3707 != 0 && var5 > field3707) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class403.method6498(var6, var5, arg0, var3, 9);
            } else {
                field3708.method6808(var1, var6);
            }
            return var6;
        }
    }
}
