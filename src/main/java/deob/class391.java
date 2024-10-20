package deob;

@ObfuscatedName("po")
public abstract class class391 {

    @ObfuscatedName("po.as")
    public int field4556;

    @ObfuscatedName("po.ay")
    public int[] field4548;

    @ObfuscatedName("po.aj")
    public int[] field4552;

    @ObfuscatedName("po.av")
    public class573 field4550;

    @ObfuscatedName("po.aw")
    public int[] field4549;

    @ObfuscatedName("po.an")
    public int[] field4553;

    @ObfuscatedName("po.ak")
    public int[] field4551;

    @ObfuscatedName("po.bn")
    public int[][] field4554;

    @ObfuscatedName("po.bh")
    public int[][] field4555;

    @ObfuscatedName("po.bd")
    public class573[] field4557;

    @ObfuscatedName("po.bx")
    public Object[] field4547;

    @ObfuscatedName("po.bf")
    public Object[][] field4558;

    @ObfuscatedName("po.bm")
    public static class572 field4559 = new class572();

    @ObfuscatedName("po.bs")
    public int field4560;

    @ObfuscatedName("po.bw")
    public boolean field4561;

    @ObfuscatedName("po.ba")
    public boolean field4562;

    @ObfuscatedName("po.bj")
    public static int field4563 = 0;

    public class391(boolean arg0, boolean arg1) {
        this.field4561 = arg0;
        this.field4562 = arg1;
    }

    @ObfuscatedName("po.bv([BI)V")
    public void method6781(byte[] arg0) {
        this.field4560 = class551.method2421(arg0, arg0.length);
        class551 var2 = new class551(method4983(arg0));
        int var3 = var2.method8955();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method9110();
        }
        int var4 = var2.method8955();
        if (var3 >= 7) {
            this.field4556 = var2.method8992();
        } else {
            this.field4556 = var2.method9119();
        }
        int var5 = 0;
        int var6 = -1;
        this.field4548 = new int[this.field4556];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field4556; var7++) {
                this.field4548[var7] = var5 += var2.method8992();
                if (this.field4548[var7] > var6) {
                    var6 = this.field4548[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field4556; var8++) {
                this.field4548[var8] = var5 += var2.method9119();
                if (this.field4548[var8] > var6) {
                    var6 = this.field4548[var8];
                }
            }
        }
        this.field4549 = new int[var6 + 1];
        this.field4553 = new int[var6 + 1];
        this.field4551 = new int[var6 + 1];
        this.field4554 = new int[var6 + 1][];
        this.field4547 = new Object[var6 + 1];
        this.field4558 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field4552 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field4556; var9++) {
                this.field4552[this.field4548[var9]] = var2.method9110();
            }
            this.field4550 = new class573(this.field4552);
        }
        for (int var10 = 0; var10 < this.field4556; var10++) {
            this.field4549[this.field4548[var10]] = var2.method9110();
        }
        for (int var11 = 0; var11 < this.field4556; var11++) {
            this.field4553[this.field4548[var11]] = var2.method9110();
        }
        for (int var12 = 0; var12 < this.field4556; var12++) {
            this.field4551[this.field4548[var12]] = var2.method9119();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field4556; var13++) {
                int var14 = this.field4548[var13];
                int var15 = this.field4551[var14];
                int var16 = 0;
                int var17 = -1;
                this.field4554[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field4554[var14][var18] = var16 += var2.method8992();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field4558[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field4556; var20++) {
                int var21 = this.field4548[var20];
                int var22 = this.field4551[var21];
                int var23 = 0;
                int var24 = -1;
                this.field4554[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field4554[var21][var25] = var23 += var2.method9119();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field4558[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field4555 = new int[var6 + 1][];
        this.field4557 = new class573[var6 + 1];
        for (int var27 = 0; var27 < this.field4556; var27++) {
            int var28 = this.field4548[var27];
            int var29 = this.field4551[var28];
            this.field4555[var28] = new int[this.field4558[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field4555[var28][this.field4554[var28][var30]] = var2.method9110();
            }
            this.field4557[var28] = new class573(this.field4555[var28]);
        }
    }

    @ObfuscatedName("po.ag(II)V")
    public void method6732(int arg0) {
    }

    @ObfuscatedName("po.bt(IIB)[B")
    public byte[] method6782(int arg0, int arg1) {
        return this.method6833(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("po.bq(II[II)[B")
    public byte[] method6833(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4558.length || this.field4558[arg0] == null || arg1 < 0 || arg1 >= this.field4558[arg0].length) {
            return null;
        }
        if (this.field4558[arg0][arg1] == null) {
            boolean var4 = this.method6796(arg0, arg2);
            if (!var4) {
                this.method6733(arg0);
                boolean var5 = this.method6796(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class367.method6074(this.field4558[arg0][arg1], false);
        if (this.field4562) {
            this.field4558[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("po.bk(IIB)Z")
    public boolean method6784(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4558.length || this.field4558[arg0] == null || arg1 < 0 || arg1 >= this.field4558[arg0].length) {
            return false;
        } else if (this.field4558[arg0][arg1] != null) {
            return true;
        } else if (this.field4547[arg0] == null) {
            this.method6733(arg0);
            return this.field4547[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("po.be(II)Z")
    public boolean method6785(int arg0) {
        if (this.field4558.length == 1) {
            return this.method6784(0, arg0);
        } else if (this.field4558[arg0].length == 1) {
            return this.method6784(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("po.bc(II)Z")
    public boolean method6786(int arg0) {
        if (this.field4547[arg0] == null) {
            this.method6733(arg0);
            return this.field4547[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("po.cn(I)Z")
    public boolean method6805() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4548.length; var2++) {
            int var3 = this.field4548[var2];
            if (this.field4547[var3] == null) {
                this.method6733(var3);
                if (this.field4547[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("po.ar(II)I")
    public int method6734(int arg0) {
        return this.field4547[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("po.ch(IB)[B")
    public byte[] method6788(int arg0) {
        if (this.field4558.length == 1) {
            return this.method6782(0, arg0);
        } else if (this.field4558[arg0].length == 1) {
            return this.method6782(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("po.cf(IIB)[B")
    public byte[] method6789(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4558.length || this.field4558[arg0] == null || arg1 < 0 || arg1 >= this.field4558[arg0].length) {
            return null;
        }
        if (this.field4558[arg0][arg1] == null) {
            boolean var3 = this.method6796(arg0, (int[]) null);
            if (!var3) {
                this.method6733(arg0);
                boolean var4 = this.method6796(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class367.method6074(this.field4558[arg0][arg1], false);
    }

    @ObfuscatedName("po.cu(II)[B")
    public byte[] method6811(int arg0) {
        if (this.field4558.length == 1) {
            return this.method6789(0, arg0);
        } else if (this.field4558[arg0].length == 1) {
            return this.method6789(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("po.am(II)V")
    public void method6733(int arg0) {
    }

    @ObfuscatedName("po.cm(II)[I")
    public int[] method6808(int arg0) {
        return arg0 >= 0 && arg0 < this.field4554.length ? this.field4554[arg0] : null;
    }

    @ObfuscatedName("po.cj(IB)I")
    public int method6792(int arg0) {
        return this.field4558 == null || arg0 >= this.field4558.length || this.field4558[arg0] == null ? 0 : this.field4558[arg0].length;
    }

    @ObfuscatedName("po.cx(I)I")
    public int method6793() {
        return this.field4558.length;
    }

    @ObfuscatedName("po.ci(I)V")
    public void method6835() {
        for (int var1 = 0; var1 < this.field4547.length; var1++) {
            this.field4547[var1] = null;
        }
    }

    @ObfuscatedName("po.cy(IB)V")
    public void method6795(int arg0) {
        for (int var2 = 0; var2 < this.field4558[arg0].length; var2++) {
            this.field4558[arg0][var2] = null;
        }
    }

    @ObfuscatedName("po.co(B)V")
    public void method6780() {
        for (int var1 = 0; var1 < this.field4558.length; var1++) {
            if (this.field4558[var1] != null) {
                for (int var2 = 0; var2 < this.field4558[var1].length; var2++) {
                    this.field4558[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("po.cv(I[II)Z")
    public boolean method6796(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("po.cg(Ljava/lang/String;S)I")
    public int method6797(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4550.method9619(class419.method6965(var2));
    }

    @ObfuscatedName("po.ct(ILjava/lang/String;I)I")
    public int method6806(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4557[arg0].method9619(class419.method6965(var3));
    }

    @ObfuscatedName("po.cq(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6799(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4550.method9619(class419.method6965(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4557[var5].method9619(class419.method6965(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("po.cc(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method6800(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4550.method9619(class419.method6965(var3));
        int var6 = this.field4557[var5].method9619(class419.method6965(var4));
        return this.method6782(var5, var6);
    }

    @ObfuscatedName("po.cz(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6801(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4550.method9619(class419.method6965(var3));
        int var6 = this.field4557[var5].method9619(class419.method6965(var4));
        return this.method6784(var5, var6);
    }

    @ObfuscatedName("po.cw(Ljava/lang/String;B)Z")
    public boolean method6802(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4550.method9619(class419.method6965(var2));
        return this.method6786(var3);
    }

    @ObfuscatedName("po.cr(Ljava/lang/String;B)V")
    public void method6783(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4550.method9619(class419.method6965(var2));
        if (var3 >= 0) {
            this.method6732(var3);
        }
    }

    @ObfuscatedName("po.cl(Ljava/lang/String;B)I")
    public int method6804(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4550.method9619(class419.method6965(var2));
        return this.method6734(var3);
    }

    @ObfuscatedName("jc.ca([BI)[B")
    public static final byte[] method4983(byte[] arg0) {
        class551 var1 = new class551(arg0);
        int var2 = var1.method8955();
        int var3 = var1.method9110();
        if (var3 < 0 || !(field4563 == 0 || var3 <= field4563)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method9170(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method9110();
            if (var5 < 0 || field4563 != 0 && var5 > field4563) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class554.method9256(var6, var5, arg0, var3, 9);
            } else {
                field4559.method9614(var1, var6);
            }
            return var6;
        }
    }
}
