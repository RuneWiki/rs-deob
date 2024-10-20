package deob;

@ObfuscatedName("ly")
public abstract class class333 {

    @ObfuscatedName("ly.s")
    public int field4204;

    @ObfuscatedName("ly.l")
    public int[] field4198;

    @ObfuscatedName("ly.t")
    public int[] field4200;

    @ObfuscatedName("ly.c")
    public class488 field4201;

    @ObfuscatedName("ly.p")
    public int[] field4206;

    @ObfuscatedName("ly.d")
    public int[] field4199;

    @ObfuscatedName("ly.y")
    public int[] field4210;

    @ObfuscatedName("ly.z")
    public int[][] field4205;

    @ObfuscatedName("ly.w")
    public int[][] field4215;

    @ObfuscatedName("ly.as")
    public class488[] field4207;

    @ObfuscatedName("ly.ad")
    public Object[] field4208;

    @ObfuscatedName("ly.ao")
    public Object[][] field4209;

    @ObfuscatedName("ly.am")
    public static class487 field4216 = new class487();

    @ObfuscatedName("ly.av")
    public int field4211;

    @ObfuscatedName("ly.au")
    public boolean field4212;

    @ObfuscatedName("ly.ar")
    public boolean field4213;

    @ObfuscatedName("ly.at")
    public static int field4214 = 0;

    public class333(boolean arg0, boolean arg1) {
        this.field4212 = arg0;
        this.field4213 = arg1;
    }

    @ObfuscatedName("ly.af([BI)V")
    public void method5843(byte[] arg0) {
        this.field4211 = class467.method6049(arg0, arg0.length);
        class467 var2 = new class467(method4825(arg0));
        int var3 = var2.method7792();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method7946();
        }
        int var4 = var2.method7792();
        if (var3 >= 7) {
            this.field4204 = var2.method7854();
        } else {
            this.field4204 = var2.method7794();
        }
        int var5 = 0;
        int var6 = -1;
        this.field4198 = new int[this.field4204];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field4204; var7++) {
                this.field4198[var7] = var5 += var2.method7854();
                if (this.field4198[var7] > var6) {
                    var6 = this.field4198[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field4204; var8++) {
                this.field4198[var8] = var5 += var2.method7794();
                if (this.field4198[var8] > var6) {
                    var6 = this.field4198[var8];
                }
            }
        }
        this.field4206 = new int[var6 + 1];
        this.field4199 = new int[var6 + 1];
        this.field4210 = new int[var6 + 1];
        this.field4205 = new int[var6 + 1][];
        this.field4208 = new Object[var6 + 1];
        this.field4209 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field4200 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field4204; var9++) {
                this.field4200[this.field4198[var9]] = var2.method7946();
            }
            this.field4201 = new class488(this.field4200);
        }
        for (int var10 = 0; var10 < this.field4204; var10++) {
            this.field4206[this.field4198[var10]] = var2.method7946();
        }
        for (int var11 = 0; var11 < this.field4204; var11++) {
            this.field4199[this.field4198[var11]] = var2.method7946();
        }
        for (int var12 = 0; var12 < this.field4204; var12++) {
            this.field4210[this.field4198[var12]] = var2.method7794();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field4204; var13++) {
                int var14 = this.field4198[var13];
                int var15 = this.field4210[var14];
                int var16 = 0;
                int var17 = -1;
                this.field4205[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field4205[var14][var18] = var16 += var2.method7854();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field4209[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field4204; var20++) {
                int var21 = this.field4198[var20];
                int var22 = this.field4210[var21];
                int var23 = 0;
                int var24 = -1;
                this.field4205[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field4205[var21][var25] = var23 += var2.method7794();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field4209[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field4215 = new int[var6 + 1][];
        this.field4207 = new class488[var6 + 1];
        for (int var27 = 0; var27 < this.field4204; var27++) {
            int var28 = this.field4198[var27];
            int var29 = this.field4210[var28];
            this.field4215[var28] = new int[this.field4209[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field4215[var28][this.field4205[var28][var30]] = var2.method7946();
            }
            this.field4207[var28] = new class488(this.field4215[var28]);
        }
    }

    @ObfuscatedName("ly.v(IB)V")
    public void method5803(int arg0) {
    }

    @ObfuscatedName("ly.ai(IIB)[B")
    public byte[] method5909(int arg0, int arg1) {
        return this.method5846(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ly.ax(II[II)[B")
    public byte[] method5846(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4209.length || this.field4209[arg0] == null || arg1 < 0 || arg1 >= this.field4209[arg0].length) {
            return null;
        }
        if (this.field4209[arg0][arg1] == null) {
            boolean var4 = this.method5860(arg0, arg2);
            if (!var4) {
                this.method5804(arg0);
                boolean var5 = this.method5860(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class310.method4233(this.field4209[arg0][arg1], false);
        if (this.field4213) {
            this.field4209[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ly.ah(IIB)Z")
    public boolean method5901(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4209.length || this.field4209[arg0] == null || arg1 < 0 || arg1 >= this.field4209[arg0].length) {
            return false;
        } else if (this.field4209[arg0][arg1] != null) {
            return true;
        } else if (this.field4208[arg0] == null) {
            this.method5804(arg0);
            return this.field4208[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ly.aw(II)Z")
    public boolean method5882(int arg0) {
        if (this.field4209.length == 1) {
            return this.method5901(0, arg0);
        } else if (this.field4209[arg0].length == 1) {
            return this.method5901(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ly.aj(II)Z")
    public boolean method5849(int arg0) {
        if (this.field4208[arg0] == null) {
            this.method5804(arg0);
            return this.field4208[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ly.aq(I)Z")
    public boolean method5850() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4198.length; var2++) {
            int var3 = this.field4198[var2];
            if (this.field4208[var3] == null) {
                this.method5804(var3);
                if (this.field4208[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ly.b(II)I")
    public int method5806(int arg0) {
        return this.field4208[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ly.ap(II)[B")
    public byte[] method5851(int arg0) {
        if (this.field4209.length == 1) {
            return this.method5909(0, arg0);
        } else if (this.field4209[arg0].length == 1) {
            return this.method5909(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ly.aa(III)[B")
    public byte[] method5852(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4209.length || this.field4209[arg0] == null || arg1 < 0 || arg1 >= this.field4209[arg0].length) {
            return null;
        }
        if (this.field4209[arg0][arg1] == null) {
            boolean var3 = this.method5860(arg0, (int[]) null);
            if (!var3) {
                this.method5804(arg0);
                boolean var4 = this.method5860(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class310.method4233(this.field4209[arg0][arg1], false);
    }

    @ObfuscatedName("ly.ae(IB)[B")
    public byte[] method5853(int arg0) {
        if (this.field4209.length == 1) {
            return this.method5852(0, arg0);
        } else if (this.field4209[arg0].length == 1) {
            return this.method5852(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ly.x(IB)V")
    public void method5804(int arg0) {
    }

    @ObfuscatedName("ly.ac(II)[I")
    public int[] method5854(int arg0) {
        return arg0 >= 0 && arg0 < this.field4205.length ? this.field4205[arg0] : null;
    }

    @ObfuscatedName("ly.bh(IB)I")
    public int method5869(int arg0) {
        return this.field4209[arg0].length;
    }

    @ObfuscatedName("ly.by(I)I")
    public int method5856() {
        return this.field4209.length;
    }

    @ObfuscatedName("ly.bw(B)V")
    public void method5855() {
        for (int var1 = 0; var1 < this.field4208.length; var1++) {
            this.field4208[var1] = null;
        }
    }

    @ObfuscatedName("ly.bp(IB)V")
    public void method5858(int arg0) {
        for (int var2 = 0; var2 < this.field4209[arg0].length; var2++) {
            this.field4209[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ly.bc(I)V")
    public void method5910() {
        for (int var1 = 0; var1 < this.field4209.length; var1++) {
            if (this.field4209[var1] != null) {
                for (int var2 = 0; var2 < this.field4209[var1].length; var2++) {
                    this.field4209[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ly.bl(I[IB)Z")
    public boolean method5860(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ly.bv(Ljava/lang/String;B)I")
    public int method5861(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4201.method8381(class361.method3155(var2));
    }

    @ObfuscatedName("ly.bx(ILjava/lang/String;I)I")
    public int method5868(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4207[arg0].method8381(class361.method3155(var3));
    }

    @ObfuscatedName("ly.bg(Ljava/lang/String;Ljava/lang/String;S)Z")
    public boolean method5894(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4201.method8381(class361.method3155(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4207[var5].method8381(class361.method3155(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ly.bz(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method5864(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4201.method8381(class361.method3155(var3));
        int var6 = this.field4207[var5].method8381(class361.method3155(var4));
        return this.method5909(var5, var6);
    }

    @ObfuscatedName("ly.bi(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method5865(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4201.method8381(class361.method3155(var3));
        int var6 = this.field4207[var5].method8381(class361.method3155(var4));
        return this.method5901(var5, var6);
    }

    @ObfuscatedName("ly.br(Ljava/lang/String;I)Z")
    public boolean method5905(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4201.method8381(class361.method3155(var2));
        return this.method5849(var3);
    }

    @ObfuscatedName("ly.bq(Ljava/lang/String;I)V")
    public void method5925(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4201.method8381(class361.method3155(var2));
        if (var3 >= 0) {
            this.method5803(var3);
        }
    }

    @ObfuscatedName("ly.bn(Ljava/lang/String;B)I")
    public int method5847(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4201.method8381(class361.method3155(var2));
        return this.method5806(var3);
    }

    @ObfuscatedName("ic.ba([BI)[B")
    public static final byte[] method4825(byte[] arg0) {
        class467 var1 = new class467(arg0);
        int var2 = var1.method7792();
        int var3 = var1.method7946();
        if (var3 < 0 || !(field4214 == 0 || var3 <= field4214)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method7804(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method7946();
            if (var5 < 0 || field4214 != 0 && var5 > field4214) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class470.method8051(var6, var5, arg0, var3, 9);
            } else {
                field4216.method8378(var1, var6);
            }
            return var6;
        }
    }
}
