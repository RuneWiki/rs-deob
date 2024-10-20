package deob;

@ObfuscatedName("ls")
public abstract class class316 {

    @ObfuscatedName("ls.y")
    public int field4008;

    @ObfuscatedName("ls.p")
    public int[] field4000;

    @ObfuscatedName("ls.e")
    public int[] field4001;

    @ObfuscatedName("ls.b")
    public class463 field4002;

    @ObfuscatedName("ls.x")
    public int[] field4003;

    @ObfuscatedName("ls.f")
    public int[] field4004;

    @ObfuscatedName("ls.t")
    public int[] field4012;

    @ObfuscatedName("ls.j")
    public int[][] field4005;

    @ObfuscatedName("ls.g")
    public int[][] field4007;

    @ObfuscatedName("ls.ar")
    public class463[] field4006;

    @ObfuscatedName("ls.aq")
    public Object[] field3999;

    @ObfuscatedName("ls.av")
    public Object[][] field4010;

    @ObfuscatedName("ls.aj")
    public static class462 field4011 = new class462();

    @ObfuscatedName("ls.ax")
    public int field4014;

    @ObfuscatedName("ls.ab")
    public boolean field4013;

    @ObfuscatedName("ls.ak")
    public boolean field4009;

    @ObfuscatedName("ls.au")
    public static int field4015 = 0;

    public class316(boolean arg0, boolean arg1) {
        this.field4013 = arg0;
        this.field4009 = arg1;
    }

    @ObfuscatedName("ls.aw([BS)V")
    public void method5195(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class444.method4881(arg0, 0, var2);
        this.field4014 = var3;
        class444 var4 = new class444(method5109(arg0));
        int var5 = var4.method6929();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method6934();
        }
        int var6 = var4.method6929();
        if (var5 >= 7) {
            this.field4008 = var4.method7066();
        } else {
            this.field4008 = var4.method7120();
        }
        int var7 = 0;
        int var8 = -1;
        this.field4000 = new int[this.field4008];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field4008; var9++) {
                this.field4000[var9] = var7 += var4.method7066();
                if (this.field4000[var9] > var8) {
                    var8 = this.field4000[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field4008; var10++) {
                this.field4000[var10] = var7 += var4.method7120();
                if (this.field4000[var10] > var8) {
                    var8 = this.field4000[var10];
                }
            }
        }
        this.field4003 = new int[var8 + 1];
        this.field4004 = new int[var8 + 1];
        this.field4012 = new int[var8 + 1];
        this.field4005 = new int[var8 + 1][];
        this.field3999 = new Object[var8 + 1];
        this.field4010 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field4001 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field4008; var11++) {
                this.field4001[this.field4000[var11]] = var4.method6934();
            }
            this.field4002 = new class463(this.field4001);
        }
        for (int var12 = 0; var12 < this.field4008; var12++) {
            this.field4003[this.field4000[var12]] = var4.method6934();
        }
        for (int var13 = 0; var13 < this.field4008; var13++) {
            this.field4004[this.field4000[var13]] = var4.method6934();
        }
        for (int var14 = 0; var14 < this.field4008; var14++) {
            this.field4012[this.field4000[var14]] = var4.method7120();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field4008; var15++) {
                int var16 = this.field4000[var15];
                int var17 = this.field4012[var16];
                int var18 = 0;
                int var19 = -1;
                this.field4005[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field4005[var16][var20] = var18 += var4.method7066();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field4010[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field4008; var22++) {
                int var23 = this.field4000[var22];
                int var24 = this.field4012[var23];
                int var25 = 0;
                int var26 = -1;
                this.field4005[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field4005[var23][var27] = var25 += var4.method7120();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field4010[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field4007 = new int[var8 + 1][];
        this.field4006 = new class463[var8 + 1];
        for (int var29 = 0; var29 < this.field4008; var29++) {
            int var30 = this.field4000[var29];
            int var31 = this.field4012[var30];
            this.field4007[var30] = new int[this.field4010[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field4007[var30][this.field4005[var30][var32]] = var4.method6934();
            }
            this.field4006[var30] = new class463(this.field4007[var30]);
        }
    }

    @ObfuscatedName("ls.w(IB)V")
    public void method5137(int arg0) {
    }

    @ObfuscatedName("ls.ai(III)[B")
    public byte[] method5179(int arg0, int arg1) {
        return this.method5180(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ls.ap(II[II)[B")
    public byte[] method5180(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4010.length || this.field4010[arg0] == null || arg1 < 0 || arg1 >= this.field4010[arg0].length) {
            return null;
        }
        if (this.field4010[arg0][arg1] == null) {
            boolean var4 = this.method5210(arg0, arg2);
            if (!var4) {
                this.method5138(arg0);
                boolean var5 = this.method5210(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class284.method6391(this.field4010[arg0][arg1], false);
        if (this.field4009) {
            this.field4010[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ls.az(IIB)Z")
    public boolean method5234(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4010.length || this.field4010[arg0] == null || arg1 < 0 || arg1 >= this.field4010[arg0].length) {
            return false;
        } else if (this.field4010[arg0][arg1] != null) {
            return true;
        } else if (this.field3999[arg0] == null) {
            this.method5138(arg0);
            return this.field3999[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ls.an(II)Z")
    public boolean method5182(int arg0) {
        if (this.field4010.length == 1) {
            return this.method5234(0, arg0);
        } else if (this.field4010[arg0].length == 1) {
            return this.method5234(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ls.ah(II)Z")
    public boolean method5183(int arg0) {
        if (this.field3999[arg0] == null) {
            this.method5138(arg0);
            return this.field3999[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ls.aa(B)Z")
    public boolean method5177() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4000.length; var2++) {
            int var3 = this.field4000[var2];
            if (this.field3999[var3] == null) {
                this.method5138(var3);
                if (this.field3999[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ls.n(II)I")
    public int method5134(int arg0) {
        return this.field3999[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ls.at(IB)[B")
    public byte[] method5186(int arg0) {
        if (this.field4010.length == 1) {
            return this.method5179(0, arg0);
        } else if (this.field4010[arg0].length == 1) {
            return this.method5179(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ls.bq(IIB)[B")
    public byte[] method5187(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4010.length || this.field4010[arg0] == null || arg1 < 0 || arg1 >= this.field4010[arg0].length) {
            return null;
        }
        if (this.field4010[arg0][arg1] == null) {
            boolean var3 = this.method5210(arg0, (int[]) null);
            if (!var3) {
                this.method5138(arg0);
                boolean var4 = this.method5210(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class284.method6391(this.field4010[arg0][arg1], false);
    }

    @ObfuscatedName("ls.bn(IB)[B")
    public byte[] method5188(int arg0) {
        if (this.field4010.length == 1) {
            return this.method5187(0, arg0);
        } else if (this.field4010[arg0].length == 1) {
            return this.method5187(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ls.v(IB)V")
    public void method5138(int arg0) {
    }

    @ObfuscatedName("ls.bl(IB)[I")
    public int[] method5245(int arg0) {
        return arg0 >= 0 && arg0 < this.field4005.length ? this.field4005[arg0] : null;
    }

    @ObfuscatedName("ls.bv(II)I")
    public int method5184(int arg0) {
        return this.field4010[arg0].length;
    }

    @ObfuscatedName("ls.bu(I)I")
    public int method5243() {
        return this.field4010.length;
    }

    @ObfuscatedName("ls.bb(I)V")
    public void method5191() {
        for (int var1 = 0; var1 < this.field3999.length; var1++) {
            this.field3999[var1] = null;
        }
    }

    @ObfuscatedName("ls.bt(II)V")
    public void method5192(int arg0) {
        for (int var2 = 0; var2 < this.field4010[arg0].length; var2++) {
            this.field4010[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ls.bw(B)V")
    public void method5193() {
        for (int var1 = 0; var1 < this.field4010.length; var1++) {
            if (this.field4010[var1] != null) {
                for (int var2 = 0; var2 < this.field4010[var1].length; var2++) {
                    this.field4010[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ls.bd(I[II)Z")
    public boolean method5210(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ls.bg(Ljava/lang/String;I)I")
    public int method5269(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4002.method7487(class344.method4632(var2));
    }

    @ObfuscatedName("ls.by(ILjava/lang/String;B)I")
    public int method5196(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4006[arg0].method7487(class344.method4632(var3));
    }

    @ObfuscatedName("ls.bs(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method5232(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4002.method7487(class344.method4632(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4006[var5].method7487(class344.method4632(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ls.br(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method5198(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4002.method7487(class344.method4632(var3));
        int var6 = this.field4006[var5].method7487(class344.method4632(var4));
        return this.method5179(var5, var6);
    }

    @ObfuscatedName("ls.bx(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method5199(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4002.method7487(class344.method4632(var3));
        int var6 = this.field4006[var5].method7487(class344.method4632(var4));
        return this.method5234(var5, var6);
    }

    @ObfuscatedName("ls.ba(Ljava/lang/String;I)Z")
    public boolean method5200(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4002.method7487(class344.method4632(var2));
        return this.method5183(var3);
    }

    @ObfuscatedName("ls.bh(Ljava/lang/String;B)V")
    public void method5201(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4002.method7487(class344.method4632(var2));
        if (var3 >= 0) {
            this.method5137(var3);
        }
    }

    @ObfuscatedName("ls.bc(Ljava/lang/String;I)I")
    public int method5202(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4002.method7487(class344.method4632(var2));
        return this.method5134(var3);
    }

    @ObfuscatedName("kb.bm([BI)[B")
    public static final byte[] method5109(byte[] arg0) {
        class444 var1 = new class444(arg0);
        int var2 = var1.method6929();
        int var3 = var1.method6934();
        if (var3 < 0 || !(field4015 == 0 || var3 <= field4015)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method7137(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method6934();
            if (var5 < 0 || field4015 != 0 && var5 > field4015) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class446.method7178(var6, var5, arg0, var3, 9);
            } else {
                field4011.method7484(var1, var6);
            }
            return var6;
        }
    }
}
