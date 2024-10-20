package deob;

@ObfuscatedName("kq")
public abstract class class307 {

    @ObfuscatedName("kq.q")
    public int field3895;

    @ObfuscatedName("kq.x")
    public int[] field3906;

    @ObfuscatedName("kq.p")
    public int[] field3897;

    @ObfuscatedName("kq.n")
    public class440 field3898;

    @ObfuscatedName("kq.m")
    public int[] field3899;

    @ObfuscatedName("kq.d")
    public int[] field3900;

    @ObfuscatedName("kq.j")
    public int[] field3901;

    @ObfuscatedName("kq.f")
    public int[][] field3902;

    @ObfuscatedName("kq.g")
    public int[][] field3903;

    @ObfuscatedName("kq.t")
    public class440[] field3904;

    @ObfuscatedName("kq.k")
    public Object[] field3896;

    @ObfuscatedName("kq.b")
    public Object[][] field3910;

    @ObfuscatedName("kq.z")
    public static class439 field3907 = new class439();

    @ObfuscatedName("kq.ap")
    public int field3908;

    @ObfuscatedName("kq.af")
    public boolean field3909;

    @ObfuscatedName("kq.ak")
    public boolean field3905;

    @ObfuscatedName("kq.av")
    public static int field3911 = 0;

    public class307(boolean arg0, boolean arg1) {
        this.field3909 = arg0;
        this.field3905 = arg1;
    }

    @ObfuscatedName("kq.ai([BB)V")
    public void method5030(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class421.method2121(arg0, 0, var2);
        this.field3908 = var3;
        class421 var4 = new class421(method1963(arg0));
        int var5 = var4.method6686();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method6669();
        }
        int var6 = var4.method6686();
        if (var5 >= 7) {
            this.field3895 = var4.method6681();
        } else {
            this.field3895 = var4.method6666();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3906 = new int[this.field3895];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3895; var9++) {
                this.field3906[var9] = var7 += var4.method6681();
                if (this.field3906[var9] > var8) {
                    var8 = this.field3906[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3895; var10++) {
                this.field3906[var10] = var7 += var4.method6666();
                if (this.field3906[var10] > var8) {
                    var8 = this.field3906[var10];
                }
            }
        }
        this.field3899 = new int[var8 + 1];
        this.field3900 = new int[var8 + 1];
        this.field3901 = new int[var8 + 1];
        this.field3902 = new int[var8 + 1][];
        this.field3896 = new Object[var8 + 1];
        this.field3910 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3897 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3895; var11++) {
                this.field3897[this.field3906[var11]] = var4.method6669();
            }
            this.field3898 = new class440(this.field3897);
        }
        for (int var12 = 0; var12 < this.field3895; var12++) {
            this.field3899[this.field3906[var12]] = var4.method6669();
        }
        for (int var13 = 0; var13 < this.field3895; var13++) {
            this.field3900[this.field3906[var13]] = var4.method6669();
        }
        for (int var14 = 0; var14 < this.field3895; var14++) {
            this.field3901[this.field3906[var14]] = var4.method6666();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3895; var15++) {
                int var16 = this.field3906[var15];
                int var17 = this.field3901[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3902[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3902[var16][var20] = var18 += var4.method6681();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3910[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3895; var22++) {
                int var23 = this.field3906[var22];
                int var24 = this.field3901[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3902[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3902[var23][var27] = var25 += var4.method6666();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3910[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3903 = new int[var8 + 1][];
        this.field3904 = new class440[var8 + 1];
        for (int var29 = 0; var29 < this.field3895; var29++) {
            int var30 = this.field3906[var29];
            int var31 = this.field3901[var30];
            this.field3903[var30] = new int[this.field3910[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3903[var30][this.field3902[var30][var32]] = var4.method6669();
            }
            this.field3904[var30] = new class440(this.field3903[var30]);
        }
    }

    @ObfuscatedName("kq.s(II)V")
    public void method4977(int arg0) {
    }

    @ObfuscatedName("kq.am(IIB)[B")
    public byte[] method5066(int arg0, int arg1) {
        return this.method5033(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("kq.bt(II[II)[B")
    public byte[] method5033(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3910.length || this.field3910[arg0] == null || arg1 < 0 || arg1 >= this.field3910[arg0].length) {
            return null;
        }
        if (this.field3910[arg0][arg1] == null) {
            boolean var4 = this.method5045(arg0, arg2);
            if (!var4) {
                this.method4978(arg0);
                boolean var5 = this.method5045(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class276.method1938(this.field3910[arg0][arg1], false);
        if (this.field3905) {
            this.field3910[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("kq.bn(III)Z")
    public boolean method5057(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3910.length || this.field3910[arg0] == null || arg1 < 0 || arg1 >= this.field3910[arg0].length) {
            return false;
        } else if (this.field3910[arg0][arg1] != null) {
            return true;
        } else if (this.field3896[arg0] == null) {
            this.method4978(arg0);
            return this.field3896[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("kq.bz(II)Z")
    public boolean method5035(int arg0) {
        if (this.field3910.length == 1) {
            return this.method5057(0, arg0);
        } else if (this.field3910[arg0].length == 1) {
            return this.method5057(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("kq.bx(II)Z")
    public boolean method5036(int arg0) {
        if (this.field3896[arg0] == null) {
            this.method4978(arg0);
            return this.field3896[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("kq.bd(I)Z")
    public boolean method5037() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3906.length; var2++) {
            int var3 = this.field3906[var2];
            if (this.field3896[var3] == null) {
                this.method4978(var3);
                if (this.field3896[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("kq.v(IB)I")
    public int method4983(int arg0) {
        return this.field3896[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("kq.bg(IB)[B")
    public byte[] method5056(int arg0) {
        if (this.field3910.length == 1) {
            return this.method5066(0, arg0);
        } else if (this.field3910[arg0].length == 1) {
            return this.method5066(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("kq.bm(III)[B")
    public byte[] method5111(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3910.length || this.field3910[arg0] == null || arg1 < 0 || arg1 >= this.field3910[arg0].length) {
            return null;
        }
        if (this.field3910[arg0][arg1] == null) {
            boolean var3 = this.method5045(arg0, (int[]) null);
            if (!var3) {
                this.method4978(arg0);
                boolean var4 = this.method5045(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class276.method1938(this.field3910[arg0][arg1], false);
    }

    @ObfuscatedName("kq.bi(IB)[B")
    public byte[] method5039(int arg0) {
        if (this.field3910.length == 1) {
            return this.method5111(0, arg0);
        } else if (this.field3910[arg0].length == 1) {
            return this.method5111(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("kq.e(IB)V")
    public void method4978(int arg0) {
    }

    @ObfuscatedName("kq.bw(II)[I")
    public int[] method5084(int arg0) {
        return arg0 >= 0 && arg0 < this.field3902.length ? this.field3902[arg0] : null;
    }

    @ObfuscatedName("kq.bu(IB)I")
    public int method5029(int arg0) {
        return this.field3910[arg0].length;
    }

    @ObfuscatedName("kq.bs(S)I")
    public int method5041() {
        return this.field3910.length;
    }

    @ObfuscatedName("kq.bb(B)V")
    public void method5042() {
        for (int var1 = 0; var1 < this.field3896.length; var1++) {
            this.field3896[var1] = null;
        }
    }

    @ObfuscatedName("kq.br(IB)V")
    public void method5043(int arg0) {
        for (int var2 = 0; var2 < this.field3910[arg0].length; var2++) {
            this.field3910[arg0][var2] = null;
        }
    }

    @ObfuscatedName("kq.bh(B)V")
    public void method5053() {
        for (int var1 = 0; var1 < this.field3910.length; var1++) {
            if (this.field3910[var1] != null) {
                for (int var2 = 0; var2 < this.field3910[var1].length; var2++) {
                    this.field3910[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("kq.bf(I[II)Z")
    public boolean method5045(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("kq.bq(Ljava/lang/String;I)I")
    public int method5046(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3898.method7227(class336.method4935(var2));
    }

    @ObfuscatedName("kq.ba(ILjava/lang/String;B)I")
    public int method5047(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3904[arg0].method7227(class336.method4935(var3));
    }

    @ObfuscatedName("kq.bv(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method5044(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3898.method7227(class336.method4935(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3904[var5].method7227(class336.method4935(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("kq.bl(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method5049(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3898.method7227(class336.method4935(var3));
        int var6 = this.field3904[var5].method7227(class336.method4935(var4));
        return this.method5066(var5, var6);
    }

    @ObfuscatedName("kq.bc(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method5050(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3898.method7227(class336.method4935(var3));
        int var6 = this.field3904[var5].method7227(class336.method4935(var4));
        return this.method5057(var5, var6);
    }

    @ObfuscatedName("kq.bj(Ljava/lang/String;I)Z")
    public boolean method5051(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3898.method7227(class336.method4935(var2));
        return this.method5036(var3);
    }

    @ObfuscatedName("kq.bo(Ljava/lang/String;I)V")
    public void method5054(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3898.method7227(class336.method4935(var2));
        if (var3 >= 0) {
            this.method4977(var3);
        }
    }

    @ObfuscatedName("kq.by(Ljava/lang/String;B)I")
    public int method5052(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3898.method7227(class336.method4935(var2));
        return this.method4983(var3);
    }

    @ObfuscatedName("bk.bk([BB)[B")
    public static final byte[] method1963(byte[] arg0) {
        class421 var1 = new class421(arg0);
        int var2 = var1.method6686();
        int var3 = var1.method6669();
        if (var3 < 0 || !(field3911 == 0 || var3 <= field3911)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method6678(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method6669();
            if (var5 < 0 || field3911 != 0 && var5 > field3911) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class423.method6892(var6, var5, arg0, var3, 9);
            } else {
                field3907.method7222(var1, var6);
            }
            return var6;
        }
    }
}
