package deob;

@ObfuscatedName("ko")
public abstract class class290 {

    @ObfuscatedName("ko.t")
    public int field3687;

    @ObfuscatedName("ko.l")
    public int[] field3693;

    @ObfuscatedName("ko.u")
    public int[] field3695;

    @ObfuscatedName("ko.n")
    public class420 field3690;

    @ObfuscatedName("ko.z")
    public int[] field3691;

    @ObfuscatedName("ko.q")
    public int[] field3692;

    @ObfuscatedName("ko.d")
    public int[] field3697;

    @ObfuscatedName("ko.r")
    public int[][] field3694;

    @ObfuscatedName("ko.m")
    public int[][] field3700;

    @ObfuscatedName("ko.c")
    public class420[] field3696;

    @ObfuscatedName("ko.f")
    public Object[] field3698;

    @ObfuscatedName("ko.h")
    public Object[][] field3701;

    @ObfuscatedName("ko.v")
    public static class419 field3699 = new class419();

    @ObfuscatedName("ko.ag")
    public int field3689;

    @ObfuscatedName("ko.ae")
    public boolean field3688;

    @ObfuscatedName("ko.aq")
    public boolean field3702;

    @ObfuscatedName("ko.al")
    public static int field3703 = 0;

    public class290(boolean arg0, boolean arg1) {
        this.field3688 = arg0;
        this.field3702 = arg1;
    }

    @ObfuscatedName("ko.an([BI)V")
    public void method4742(byte[] arg0) {
        this.field3689 = class401.method2134(arg0, arg0.length);
        class401 var2 = new class401(method5366(arg0));
        int var3 = var2.method6240();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method6245();
        }
        int var4 = var2.method6240();
        if (var3 >= 7) {
            this.field3687 = var2.method6256();
        } else {
            this.field3687 = var2.method6242();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3693 = new int[this.field3687];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3687; var7++) {
                this.field3693[var7] = var5 += var2.method6256();
                if (this.field3693[var7] > var6) {
                    var6 = this.field3693[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3687; var8++) {
                this.field3693[var8] = var5 += var2.method6242();
                if (this.field3693[var8] > var6) {
                    var6 = this.field3693[var8];
                }
            }
        }
        this.field3691 = new int[var6 + 1];
        this.field3692 = new int[var6 + 1];
        this.field3697 = new int[var6 + 1];
        this.field3694 = new int[var6 + 1][];
        this.field3698 = new Object[var6 + 1];
        this.field3701 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3695 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3687; var9++) {
                this.field3695[this.field3693[var9]] = var2.method6245();
            }
            this.field3690 = new class420(this.field3695);
        }
        for (int var10 = 0; var10 < this.field3687; var10++) {
            this.field3691[this.field3693[var10]] = var2.method6245();
        }
        for (int var11 = 0; var11 < this.field3687; var11++) {
            this.field3692[this.field3693[var11]] = var2.method6245();
        }
        for (int var12 = 0; var12 < this.field3687; var12++) {
            this.field3697[this.field3693[var12]] = var2.method6242();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3687; var13++) {
                int var14 = this.field3693[var13];
                int var15 = this.field3697[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3694[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3694[var14][var18] = var16 += var2.method6256();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3701[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3687; var20++) {
                int var21 = this.field3693[var20];
                int var22 = this.field3697[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3694[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3694[var21][var25] = var23 += var2.method6242();
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
        this.field3700 = new int[var6 + 1][];
        this.field3696 = new class420[var6 + 1];
        for (int var27 = 0; var27 < this.field3687; var27++) {
            int var28 = this.field3693[var27];
            int var29 = this.field3697[var28];
            this.field3700[var28] = new int[this.field3701[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3700[var28][this.field3694[var28][var30]] = var2.method6245();
            }
            this.field3696[var28] = new class420(this.field3700[var28]);
        }
    }

    @ObfuscatedName("ko.s(II)V")
    public void method4730(int arg0) {
    }

    @ObfuscatedName("ko.ax(III)[B")
    public byte[] method4743(int arg0, int arg1) {
        return this.method4769(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ko.av(II[II)[B")
    public byte[] method4769(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3701.length || this.field3701[arg0] == null || arg1 < 0 || arg1 >= this.field3701[arg0].length) {
            return null;
        }
        if (this.field3701[arg0][arg1] == null) {
            boolean var4 = this.method4758(arg0, arg2);
            if (!var4) {
                this.method4718(arg0);
                boolean var5 = this.method4758(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class266.method1907(this.field3701[arg0][arg1], false);
        if (this.field3702) {
            this.field3701[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ko.ap(IIB)Z")
    public boolean method4745(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3701.length || this.field3701[arg0] == null || arg1 < 0 || arg1 >= this.field3701[arg0].length) {
            return false;
        } else if (this.field3701[arg0][arg1] != null) {
            return true;
        } else if (this.field3698[arg0] == null) {
            this.method4718(arg0);
            return this.field3698[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ko.au(II)Z")
    public boolean method4793(int arg0) {
        if (this.field3701.length == 1) {
            return this.method4745(0, arg0);
        } else if (this.field3701[arg0].length == 1) {
            return this.method4745(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ko.aj(II)Z")
    public boolean method4747(int arg0) {
        if (this.field3698[arg0] == null) {
            this.method4718(arg0);
            return this.field3698[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ko.af(S)Z")
    public boolean method4741() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3693.length; var2++) {
            int var3 = this.field3693[var2];
            if (this.field3698[var3] == null) {
                this.method4718(var3);
                if (this.field3698[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ko.j(IB)I")
    public int method4708(int arg0) {
        return this.field3698[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ko.aw(IB)[B")
    public byte[] method4749(int arg0) {
        if (this.field3701.length == 1) {
            return this.method4743(0, arg0);
        } else if (this.field3701[arg0].length == 1) {
            return this.method4743(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ko.ao(III)[B")
    public byte[] method4750(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3701.length || this.field3701[arg0] == null || arg1 < 0 || arg1 >= this.field3701[arg0].length) {
            return null;
        }
        if (this.field3701[arg0][arg1] == null) {
            boolean var3 = this.method4758(arg0, (int[]) null);
            if (!var3) {
                this.method4718(arg0);
                boolean var4 = this.method4758(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class266.method1907(this.field3701[arg0][arg1], false);
    }

    @ObfuscatedName("ko.aa(II)[B")
    public byte[] method4751(int arg0) {
        if (this.field3701.length == 1) {
            return this.method4750(0, arg0);
        } else if (this.field3701[arg0].length == 1) {
            return this.method4750(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ko.a(IB)V")
    public void method4718(int arg0) {
    }

    @ObfuscatedName("ko.ay(IB)[I")
    public int[] method4752(int arg0) {
        return arg0 >= 0 && arg0 < this.field3694.length ? this.field3694[arg0] : null;
    }

    @ObfuscatedName("ko.bg(IB)I")
    public int method4768(int arg0) {
        return this.field3701[arg0].length;
    }

    @ObfuscatedName("ko.bl(I)I")
    public int method4754() {
        return this.field3701.length;
    }

    @ObfuscatedName("ko.bx(I)V")
    public void method4755() {
        for (int var1 = 0; var1 < this.field3698.length; var1++) {
            this.field3698[var1] = null;
        }
    }

    @ObfuscatedName("ko.bd(IB)V")
    public void method4813(int arg0) {
        for (int var2 = 0; var2 < this.field3701[arg0].length; var2++) {
            this.field3701[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ko.bt(I)V")
    public void method4757() {
        for (int var1 = 0; var1 < this.field3701.length; var1++) {
            if (this.field3701[var1] != null) {
                for (int var2 = 0; var2 < this.field3701[var1].length; var2++) {
                    this.field3701[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ko.bf(I[IB)Z")
    public boolean method4758(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ko.bw(Ljava/lang/String;I)I")
    public int method4759(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3690.method6809(class319.method2775(var2));
    }

    @ObfuscatedName("ko.bm(ILjava/lang/String;B)I")
    public int method4760(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3696[arg0].method6809(class319.method2775(var3));
    }

    @ObfuscatedName("ko.br(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4761(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3690.method6809(class319.method2775(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3696[var5].method6809(class319.method2775(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ko.bj(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method4762(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3690.method6809(class319.method2775(var3));
        int var6 = this.field3696[var5].method6809(class319.method2775(var4));
        return this.method4743(var5, var6);
    }

    @ObfuscatedName("ko.bo(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4763(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3690.method6809(class319.method2775(var3));
        int var6 = this.field3696[var5].method6809(class319.method2775(var4));
        return this.method4745(var5, var6);
    }

    @ObfuscatedName("ko.bv(Ljava/lang/String;I)Z")
    public boolean method4753(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3690.method6809(class319.method2775(var2));
        return this.method4747(var3);
    }

    @ObfuscatedName("ko.bu(Ljava/lang/String;I)V")
    public void method4765(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3690.method6809(class319.method2775(var2));
        if (var3 >= 0) {
            this.method4730(var3);
        }
    }

    @ObfuscatedName("ko.bz(Ljava/lang/String;I)I")
    public int method4827(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3690.method6809(class319.method2775(var2));
        return this.method4708(var3);
    }

    @ObfuscatedName("lb.bc([BB)[B")
    public static final byte[] method5366(byte[] arg0) {
        class401 var1 = new class401(arg0);
        int var2 = var1.method6240();
        int var3 = var1.method6245();
        if (var3 < 0 || !(field3703 == 0 || var3 <= field3703)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method6264(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method6245();
            if (var5 < 0 || field3703 != 0 && var5 > field3703) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class403.method6455(var6, var5, arg0, var3, 9);
            } else {
                field3699.method6805(var1, var6);
            }
            return var6;
        }
    }
}
