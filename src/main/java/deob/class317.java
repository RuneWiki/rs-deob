package deob;

@ObfuscatedName("lv")
public abstract class class317 {

    @ObfuscatedName("lv.a")
    public int field4049;

    @ObfuscatedName("lv.l")
    public int[] field4040;

    @ObfuscatedName("lv.e")
    public int[] field4051;

    @ObfuscatedName("lv.g")
    public class464 field4043;

    @ObfuscatedName("lv.y")
    public int[] field4052;

    @ObfuscatedName("lv.i")
    public int[] field4044;

    @ObfuscatedName("lv.r")
    public int[] field4045;

    @ObfuscatedName("lv.z")
    public int[][] field4046;

    @ObfuscatedName("lv.o")
    public int[][] field4039;

    @ObfuscatedName("lv.as")
    public class464[] field4048;

    @ObfuscatedName("lv.ac")
    public Object[] field4042;

    @ObfuscatedName("lv.ao")
    public Object[][] field4050;

    @ObfuscatedName("lv.ar")
    public static class463 field4047 = new class463();

    @ObfuscatedName("lv.aq")
    public int field4041;

    @ObfuscatedName("lv.ai")
    public boolean field4053;

    @ObfuscatedName("lv.an")
    public boolean field4054;

    @ObfuscatedName("lv.aa")
    public static int field4055 = 0;

    public class317(boolean arg0, boolean arg1) {
        this.field4053 = arg0;
        this.field4054 = arg1;
    }

    @ObfuscatedName("lv.aj([BI)V")
    public void method5489(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class445.field4736[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field4041 = var5;
        class445 var8 = new class445(method2875(arg0));
        int var9 = var8.method7196();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method7201();
        }
        int var10 = var8.method7196();
        if (var9 >= 7) {
            this.field4049 = var8.method7214();
        } else {
            this.field4049 = var8.method7198();
        }
        int var11 = 0;
        int var12 = -1;
        this.field4040 = new int[this.field4049];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field4049; var13++) {
                this.field4040[var13] = var11 += var8.method7214();
                if (this.field4040[var13] > var12) {
                    var12 = this.field4040[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field4049; var14++) {
                this.field4040[var14] = var11 += var8.method7198();
                if (this.field4040[var14] > var12) {
                    var12 = this.field4040[var14];
                }
            }
        }
        this.field4052 = new int[var12 + 1];
        this.field4044 = new int[var12 + 1];
        this.field4045 = new int[var12 + 1];
        this.field4046 = new int[var12 + 1][];
        this.field4042 = new Object[var12 + 1];
        this.field4050 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field4051 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field4049; var15++) {
                this.field4051[this.field4040[var15]] = var8.method7201();
            }
            this.field4043 = new class464(this.field4051);
        }
        for (int var16 = 0; var16 < this.field4049; var16++) {
            this.field4052[this.field4040[var16]] = var8.method7201();
        }
        for (int var17 = 0; var17 < this.field4049; var17++) {
            this.field4044[this.field4040[var17]] = var8.method7201();
        }
        for (int var18 = 0; var18 < this.field4049; var18++) {
            this.field4045[this.field4040[var18]] = var8.method7198();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field4049; var19++) {
                int var20 = this.field4040[var19];
                int var21 = this.field4045[var20];
                int var22 = 0;
                int var23 = -1;
                this.field4046[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field4046[var20][var24] = var22 += var8.method7214();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field4050[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field4049; var26++) {
                int var27 = this.field4040[var26];
                int var28 = this.field4045[var27];
                int var29 = 0;
                int var30 = -1;
                this.field4046[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field4046[var27][var31] = var29 += var8.method7198();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field4050[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field4039 = new int[var12 + 1][];
        this.field4048 = new class464[var12 + 1];
        for (int var33 = 0; var33 < this.field4049; var33++) {
            int var34 = this.field4040[var33];
            int var35 = this.field4045[var34];
            this.field4039[var34] = new int[this.field4050[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field4039[var34][this.field4046[var34][var36]] = var8.method7201();
            }
            this.field4048[var34] = new class464(this.field4039[var34]);
        }
    }

    @ObfuscatedName("lv.f(II)V")
    public void method5400(int arg0) {
    }

    @ObfuscatedName("lv.ax(IIB)[B")
    public byte[] method5499(int arg0, int arg1) {
        return this.method5478(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("lv.av(II[II)[B")
    public byte[] method5478(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4050.length || this.field4050[arg0] == null || arg1 < 0 || arg1 >= this.field4050[arg0].length) {
            return null;
        }
        if (this.field4050[arg0][arg1] == null) {
            boolean var4 = this.method5430(arg0, arg2);
            if (!var4) {
                this.method5371(arg0);
                boolean var5 = this.method5430(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class285.method2859(this.field4050[arg0][arg1], false);
        if (this.field4054) {
            this.field4050[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("lv.ae(IIB)Z")
    public boolean method5490(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4050.length || this.field4050[arg0] == null || arg1 < 0 || arg1 >= this.field4050[arg0].length) {
            return false;
        } else if (this.field4050[arg0][arg1] != null) {
            return true;
        } else if (this.field4042[arg0] == null) {
            this.method5371(arg0);
            return this.field4042[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lv.ay(II)Z")
    public boolean method5417(int arg0) {
        if (this.field4050.length == 1) {
            return this.method5490(0, arg0);
        } else if (this.field4050[arg0].length == 1) {
            return this.method5490(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("lv.ag(II)Z")
    public boolean method5418(int arg0) {
        if (this.field4042[arg0] == null) {
            this.method5371(arg0);
            return this.field4042[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lv.aw(I)Z")
    public boolean method5419() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4040.length; var2++) {
            int var3 = this.field4040[var2];
            if (this.field4042[var3] == null) {
                this.method5371(var3);
                if (this.field4042[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("lv.x(IB)I")
    public int method5377(int arg0) {
        return this.field4042[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("lv.ah(II)[B")
    public byte[] method5454(int arg0) {
        if (this.field4050.length == 1) {
            return this.method5499(0, arg0);
        } else if (this.field4050[arg0].length == 1) {
            return this.method5499(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("lv.at(IIB)[B")
    public byte[] method5421(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4050.length || this.field4050[arg0] == null || arg1 < 0 || arg1 >= this.field4050[arg0].length) {
            return null;
        }
        if (this.field4050[arg0][arg1] == null) {
            boolean var3 = this.method5430(arg0, (int[]) null);
            if (!var3) {
                this.method5371(arg0);
                boolean var4 = this.method5430(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class285.method2859(this.field4050[arg0][arg1], false);
    }

    @ObfuscatedName("lv.al(IB)[B")
    public byte[] method5422(int arg0) {
        if (this.field4050.length == 1) {
            return this.method5421(0, arg0);
        } else if (this.field4050[arg0].length == 1) {
            return this.method5421(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("lv.n(II)V")
    public void method5371(int arg0) {
    }

    @ObfuscatedName("lv.au(II)[I")
    public int[] method5424(int arg0) {
        return arg0 >= 0 && arg0 < this.field4046.length ? this.field4046[arg0] : null;
    }

    @ObfuscatedName("lv.bg(II)I")
    public int method5425(int arg0) {
        return this.field4050[arg0].length;
    }

    @ObfuscatedName("lv.bi(I)I")
    public int method5426() {
        return this.field4050.length;
    }

    @ObfuscatedName("lv.bj(I)V")
    public void method5427() {
        for (int var1 = 0; var1 < this.field4042.length; var1++) {
            this.field4042[var1] = null;
        }
    }

    @ObfuscatedName("lv.by(IB)V")
    public void method5428(int arg0) {
        for (int var2 = 0; var2 < this.field4050[arg0].length; var2++) {
            this.field4050[arg0][var2] = null;
        }
    }

    @ObfuscatedName("lv.bz(I)V")
    public void method5429() {
        for (int var1 = 0; var1 < this.field4050.length; var1++) {
            if (this.field4050[var1] != null) {
                for (int var2 = 0; var2 < this.field4050[var1].length; var2++) {
                    this.field4050[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("lv.bo(I[II)Z")
    public boolean method5430(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("lv.br(Ljava/lang/String;I)I")
    public int method5482(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4043.method7772(class345.method4609(var2));
    }

    @ObfuscatedName("lv.bp(ILjava/lang/String;I)I")
    public int method5432(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4048[arg0].method7772(class345.method4609(var3));
    }

    @ObfuscatedName("lv.bd(Ljava/lang/String;Ljava/lang/String;S)Z")
    public boolean method5433(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4043.method7772(class345.method4609(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4048[var5].method7772(class345.method4609(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("lv.bl(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method5501(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4043.method7772(class345.method4609(var3));
        int var6 = this.field4048[var5].method7772(class345.method4609(var4));
        return this.method5499(var5, var6);
    }

    @ObfuscatedName("lv.bk(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method5431(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4043.method7772(class345.method4609(var3));
        int var6 = this.field4048[var5].method7772(class345.method4609(var4));
        return this.method5490(var5, var6);
    }

    @ObfuscatedName("lv.bh(Ljava/lang/String;I)Z")
    public boolean method5436(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4043.method7772(class345.method4609(var2));
        return this.method5418(var3);
    }

    @ObfuscatedName("lv.bx(Ljava/lang/String;I)V")
    public void method5437(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4043.method7772(class345.method4609(var2));
        if (var3 >= 0) {
            this.method5400(var3);
        }
    }

    @ObfuscatedName("lv.be(Ljava/lang/String;I)I")
    public int method5438(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4043.method7772(class345.method4609(var2));
        return this.method5377(var3);
    }

    @ObfuscatedName("ex.bf([BI)[B")
    public static final byte[] method2875(byte[] arg0) {
        class445 var1 = new class445(arg0);
        int var2 = var1.method7196();
        int var3 = var1.method7201();
        if (var3 < 0 || !(field4055 == 0 || var3 <= field4055)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method7209(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method7201();
            if (var5 < 0 || field4055 != 0 && var5 > field4055) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class447.method7422(var6, var5, arg0, var3, 9);
            } else {
                field4047.method7768(var1, var6);
            }
            return var6;
        }
    }
}
