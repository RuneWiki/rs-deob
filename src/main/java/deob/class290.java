package deob;

@ObfuscatedName("kk")
public abstract class class290 {

    @ObfuscatedName("kk.f")
    public int field3705;

    @ObfuscatedName("kk.s")
    public int[] field3714;

    @ObfuscatedName("kk.h")
    public int[] field3704;

    @ObfuscatedName("kk.d")
    public class419 field3712;

    @ObfuscatedName("kk.q")
    public int[] field3706;

    @ObfuscatedName("kk.j")
    public int[] field3707;

    @ObfuscatedName("kk.x")
    public int[] field3708;

    @ObfuscatedName("kk.b")
    public int[][] field3702;

    @ObfuscatedName("kk.t")
    public int[][] field3710;

    @ObfuscatedName("kk.r")
    public class419[] field3709;

    @ObfuscatedName("kk.p")
    public Object[] field3711;

    @ObfuscatedName("kk.w")
    public Object[][] field3713;

    @ObfuscatedName("kk.i")
    public static class418 field3703 = new class418();

    @ObfuscatedName("kk.aq")
    public int field3715;

    @ObfuscatedName("kk.ad")
    public boolean field3716;

    @ObfuscatedName("kk.al")
    public boolean field3717;

    @ObfuscatedName("kk.aa")
    public static int field3718 = 0;

    public class290(boolean arg0, boolean arg1) {
        this.field3716 = arg0;
        this.field3717 = arg1;
    }

    @ObfuscatedName("kk.ap([BI)V")
    public void method4708(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class400.method5557(arg0, 0, var2);
        this.field3715 = var3;
        class400 var4 = new class400(method2468(arg0));
        int var5 = var4.method6217();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method6222();
        }
        int var6 = var4.method6217();
        if (var5 >= 7) {
            this.field3705 = var4.method6233();
        } else {
            this.field3705 = var4.method6219();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3714 = new int[this.field3705];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3705; var9++) {
                this.field3714[var9] = var7 += var4.method6233();
                if (this.field3714[var9] > var8) {
                    var8 = this.field3714[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3705; var10++) {
                this.field3714[var10] = var7 += var4.method6219();
                if (this.field3714[var10] > var8) {
                    var8 = this.field3714[var10];
                }
            }
        }
        this.field3706 = new int[var8 + 1];
        this.field3707 = new int[var8 + 1];
        this.field3708 = new int[var8 + 1];
        this.field3702 = new int[var8 + 1][];
        this.field3711 = new Object[var8 + 1];
        this.field3713 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3704 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3705; var11++) {
                this.field3704[this.field3714[var11]] = var4.method6222();
            }
            this.field3712 = new class419(this.field3704);
        }
        for (int var12 = 0; var12 < this.field3705; var12++) {
            this.field3706[this.field3714[var12]] = var4.method6222();
        }
        for (int var13 = 0; var13 < this.field3705; var13++) {
            this.field3707[this.field3714[var13]] = var4.method6222();
        }
        for (int var14 = 0; var14 < this.field3705; var14++) {
            this.field3708[this.field3714[var14]] = var4.method6219();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3705; var15++) {
                int var16 = this.field3714[var15];
                int var17 = this.field3708[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3702[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3702[var16][var20] = var18 += var4.method6233();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3713[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3705; var22++) {
                int var23 = this.field3714[var22];
                int var24 = this.field3708[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3702[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3702[var23][var27] = var25 += var4.method6219();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3713[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3710 = new int[var8 + 1][];
        this.field3709 = new class419[var8 + 1];
        for (int var29 = 0; var29 < this.field3705; var29++) {
            int var30 = this.field3714[var29];
            int var31 = this.field3708[var30];
            this.field3710[var30] = new int[this.field3713[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3710[var30][this.field3702[var30][var32]] = var4.method6222();
            }
            this.field3709[var30] = new class419(this.field3710[var30]);
        }
    }

    @ObfuscatedName("kk.m(II)V")
    public void method4666(int arg0) {
    }

    @ObfuscatedName("kk.ai(IIB)[B")
    public byte[] method4710(int arg0, int arg1) {
        return this.method4711(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("kk.ac(II[II)[B")
    public byte[] method4711(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3713.length || this.field3713[arg0] == null || arg1 < 0 || arg1 >= this.field3713[arg0].length) {
            return null;
        }
        if (this.field3713[arg0][arg1] == null) {
            boolean var4 = this.method4724(arg0, arg2);
            if (!var4) {
                this.method4695(arg0);
                boolean var5 = this.method4724(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class266.method2917(this.field3713[arg0][arg1], false);
        if (this.field3717) {
            this.field3713[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("kk.ag(IIB)Z")
    public boolean method4735(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3713.length || this.field3713[arg0] == null || arg1 < 0 || arg1 >= this.field3713[arg0].length) {
            return false;
        } else if (this.field3713[arg0][arg1] != null) {
            return true;
        } else if (this.field3711[arg0] == null) {
            this.method4695(arg0);
            return this.field3711[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("kk.ar(II)Z")
    public boolean method4712(int arg0) {
        if (this.field3713.length == 1) {
            return this.method4735(0, arg0);
        } else if (this.field3713[arg0].length == 1) {
            return this.method4735(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("kk.az(IB)Z")
    public boolean method4714(int arg0) {
        if (this.field3711[arg0] == null) {
            this.method4695(arg0);
            return this.field3711[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("kk.bd(I)Z")
    public boolean method4733() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3714.length; var2++) {
            int var3 = this.field3714[var2];
            if (this.field3711[var3] == null) {
                this.method4695(var3);
                if (this.field3711[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("kk.u(II)I")
    public int method4672(int arg0) {
        return this.field3711[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("kk.bt(II)[B")
    public byte[] method4771(int arg0) {
        if (this.field3713.length == 1) {
            return this.method4710(0, arg0);
        } else if (this.field3713[arg0].length == 1) {
            return this.method4710(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("kk.bf(III)[B")
    public byte[] method4716(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3713.length || this.field3713[arg0] == null || arg1 < 0 || arg1 >= this.field3713[arg0].length) {
            return null;
        }
        if (this.field3713[arg0][arg1] == null) {
            boolean var3 = this.method4724(arg0, (int[]) null);
            if (!var3) {
                this.method4695(arg0);
                boolean var4 = this.method4724(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class266.method2917(this.field3713[arg0][arg1], false);
    }

    @ObfuscatedName("kk.bp(II)[B")
    public byte[] method4717(int arg0) {
        if (this.field3713.length == 1) {
            return this.method4716(0, arg0);
        } else if (this.field3713[arg0].length == 1) {
            return this.method4716(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("kk.k(II)V")
    public void method4695(int arg0) {
    }

    @ObfuscatedName("kk.bl(II)[I")
    public int[] method4719(int arg0) {
        return arg0 >= 0 && arg0 < this.field3702.length ? this.field3702[arg0] : null;
    }

    @ObfuscatedName("kk.bc(II)I")
    public int method4720(int arg0) {
        return this.field3713[arg0].length;
    }

    @ObfuscatedName("kk.br(I)I")
    public int method4721() {
        return this.field3713.length;
    }

    @ObfuscatedName("kk.bw(I)V")
    public void method4722() {
        for (int var1 = 0; var1 < this.field3711.length; var1++) {
            this.field3711[var1] = null;
        }
    }

    @ObfuscatedName("kk.bh(II)V")
    public void method4766(int arg0) {
        for (int var2 = 0; var2 < this.field3713[arg0].length; var2++) {
            this.field3713[arg0][var2] = null;
        }
    }

    @ObfuscatedName("kk.bj(B)V")
    public void method4723() {
        for (int var1 = 0; var1 < this.field3713.length; var1++) {
            if (this.field3713[var1] != null) {
                for (int var2 = 0; var2 < this.field3713[var1].length; var2++) {
                    this.field3713[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("kk.be(I[II)Z")
    public boolean method4724(int arg0, int[] arg1) {
        if (this.field3711[arg0] == null) {
            return false;
        }
        int var3 = this.field3708[arg0];
        int[] var4 = this.field3702[arg0];
        Object[] var5 = this.field3713[arg0];
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
            var8 = class266.method2917(this.field3711[arg0], true);
            class400 var9 = new class400(var8);
            var9.method6239(arg1, 5, var9.field4271.length);
        } else {
            var8 = class266.method2917(this.field3711[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2468(var8);
        } catch (RuntimeException var31) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class400.method5557(var8, 0, var14);
            throw class424.method2818(var31, var13 + var15 + "," + class400.method2369(var8, var8.length - 2) + "," + this.field3706[arg0] + "," + this.field3715);
        }
        if (this.field3716) {
            this.field3711[arg0] = null;
        }
        if (var3 > 1) {
            int var16 = var10.length;
            int var32 = var16 - 1;
            int var17 = var10[var32] & 0xFF;
            int var18 = var32 - var3 * var17 * 4;
            class400 var19 = new class400(var10);
            int[] var20 = new int[var3];
            var19.field4272 = var18;
            for (int var21 = 0; var21 < var17; var21++) {
                int var22 = 0;
                for (int var23 = 0; var23 < var3; var23++) {
                    var22 += var19.method6222();
                    var20[var23] += var22;
                }
            }
            byte[][] var24 = new byte[var3][];
            for (int var25 = 0; var25 < var3; var25++) {
                var24[var25] = new byte[var20[var25]];
                var20[var25] = 0;
            }
            var19.field4272 = var18;
            int var26 = 0;
            for (int var27 = 0; var27 < var17; var27++) {
                int var28 = 0;
                for (int var29 = 0; var29 < var3; var29++) {
                    var28 += var19.method6222();
                    System.arraycopy(var10, var26, var24[var29], var20[var29], var28);
                    var20[var29] += var28;
                    var26 += var28;
                }
            }
            for (int var30 = 0; var30 < var3; var30++) {
                if (this.field3717) {
                    var5[var4[var30]] = var24[var30];
                } else {
                    var5[var4[var30]] = class266.method4122(var24[var30], false);
                }
            }
        } else if (this.field3717) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class266.method4122(var10, false);
        }
        return true;
    }

    @ObfuscatedName("kk.bq(Ljava/lang/String;I)I")
    public int method4725(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3712.method6776(class319.method3097(var2));
    }

    @ObfuscatedName("kk.bu(ILjava/lang/String;I)I")
    public int method4775(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3709[arg0].method6776(class319.method3097(var3));
    }

    @ObfuscatedName("kk.bn(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4727(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3712.method6776(class319.method3097(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3709[var5].method6776(class319.method3097(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("kk.bk(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4728(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3712.method6776(class319.method3097(var3));
        int var6 = this.field3709[var5].method6776(class319.method3097(var4));
        return this.method4710(var5, var6);
    }

    @ObfuscatedName("kk.bm(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4732(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3712.method6776(class319.method3097(var3));
        int var6 = this.field3709[var5].method6776(class319.method3097(var4));
        return this.method4735(var5, var6);
    }

    @ObfuscatedName("kk.bb(Ljava/lang/String;I)Z")
    public boolean method4715(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3712.method6776(class319.method3097(var2));
        return this.method4714(var3);
    }

    @ObfuscatedName("kk.bx(Ljava/lang/String;B)V")
    public void method4731(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3712.method6776(class319.method3097(var2));
        if (var3 >= 0) {
            this.method4666(var3);
        }
    }

    @ObfuscatedName("kk.ba(Ljava/lang/String;S)I")
    public int method4736(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3712.method6776(class319.method3097(var2));
        return this.method4672(var3);
    }

    @ObfuscatedName("ev.bg([BI)[B")
    public static final byte[] method2468(byte[] arg0) {
        class400 var1 = new class400(arg0);
        int var2 = var1.method6217();
        int var3 = var1.method6222();
        if (var3 < 0 || !(field3718 == 0 || var3 <= field3718)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method6229(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method6222();
            if (var5 < 0 || field3718 != 0 && var5 > field3718) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class402.method6449(var6, var5, arg0, var3, 9);
            } else {
                field3703.method6773(var1, var6);
            }
            return var6;
        }
    }
}
