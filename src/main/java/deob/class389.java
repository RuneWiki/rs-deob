package deob;

@ObfuscatedName("ob")
public abstract class class389 {

    @ObfuscatedName("ob.av")
    public int field4500;

    @ObfuscatedName("ob.ar")
    public int[] field4509;

    @ObfuscatedName("ob.ap")
    public int[] field4508;

    @ObfuscatedName("ob.ak")
    public class571 field4497;

    @ObfuscatedName("ob.ai")
    public int[] field4498;

    @ObfuscatedName("ob.at")
    public int[] field4495;

    @ObfuscatedName("ob.az")
    public int[] field4505;

    @ObfuscatedName("ob.bg")
    public int[][] field4501;

    @ObfuscatedName("ob.bz")
    public int[][] field4502;

    @ObfuscatedName("ob.bj")
    public class571[] field4503;

    @ObfuscatedName("ob.bc")
    public Object[] field4504;

    @ObfuscatedName("ob.bo")
    public Object[][] field4499;

    @ObfuscatedName("ob.bm")
    public static class570 field4494 = new class570();

    @ObfuscatedName("ob.bd")
    public int field4507;

    @ObfuscatedName("ob.bh")
    public boolean field4506;

    @ObfuscatedName("ob.bx")
    public boolean field4496;

    @ObfuscatedName("ob.bv")
    public static int field4510 = 0;

    public class389(boolean arg0, boolean arg1) {
        this.field4506 = arg0;
        this.field4496 = arg1;
    }

    @ObfuscatedName("ob.bs([BI)V")
    public void method6639(byte[] arg0) {
        this.field4507 = class549.method8(arg0, arg0.length);
        class549 var2 = new class549(method4125(arg0));
        int var3 = var2.method9025();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method8803();
        }
        int var4 = var2.method9025();
        if (var3 >= 7) {
            this.field4500 = var2.method8816();
        } else {
            this.field4500 = var2.method8968();
        }
        int var5 = 0;
        int var6 = -1;
        this.field4509 = new int[this.field4500];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field4500; var7++) {
                this.field4509[var7] = var5 += var2.method8816();
                if (this.field4509[var7] > var6) {
                    var6 = this.field4509[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field4500; var8++) {
                this.field4509[var8] = var5 += var2.method8968();
                if (this.field4509[var8] > var6) {
                    var6 = this.field4509[var8];
                }
            }
        }
        this.field4498 = new int[var6 + 1];
        this.field4495 = new int[var6 + 1];
        this.field4505 = new int[var6 + 1];
        this.field4501 = new int[var6 + 1][];
        this.field4504 = new Object[var6 + 1];
        this.field4499 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field4508 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field4500; var9++) {
                this.field4508[this.field4509[var9]] = var2.method8803();
            }
            this.field4497 = new class571(this.field4508);
        }
        for (int var10 = 0; var10 < this.field4500; var10++) {
            this.field4498[this.field4509[var10]] = var2.method8803();
        }
        for (int var11 = 0; var11 < this.field4500; var11++) {
            this.field4495[this.field4509[var11]] = var2.method8803();
        }
        for (int var12 = 0; var12 < this.field4500; var12++) {
            this.field4505[this.field4509[var12]] = var2.method8968();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field4500; var13++) {
                int var14 = this.field4509[var13];
                int var15 = this.field4505[var14];
                int var16 = 0;
                int var17 = -1;
                this.field4501[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field4501[var14][var18] = var16 += var2.method8816();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field4499[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field4500; var20++) {
                int var21 = this.field4509[var20];
                int var22 = this.field4505[var21];
                int var23 = 0;
                int var24 = -1;
                this.field4501[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field4501[var21][var25] = var23 += var2.method8968();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field4499[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field4502 = new int[var6 + 1][];
        this.field4503 = new class571[var6 + 1];
        for (int var27 = 0; var27 < this.field4500; var27++) {
            int var28 = this.field4509[var27];
            int var29 = this.field4505[var28];
            this.field4502[var28] = new int[this.field4499[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field4502[var28][this.field4501[var28][var30]] = var2.method8803();
            }
            this.field4503[var28] = new class571(this.field4502[var28]);
        }
    }

    @ObfuscatedName("ob.an(II)V")
    public void method6589(int arg0) {
    }

    @ObfuscatedName("ob.bb(III)[B")
    public byte[] method6670(int arg0, int arg1) {
        return this.method6640(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ob.by(II[IB)[B")
    public byte[] method6640(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4499.length || this.field4499[arg0] == null || arg1 < 0 || arg1 >= this.field4499[arg0].length) {
            return null;
        }
        if (this.field4499[arg0][arg1] == null) {
            boolean var4 = this.method6659(arg0, arg2);
            if (!var4) {
                this.method6590(arg0);
                boolean var5 = this.method6659(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class365.method773(this.field4499[arg0][arg1], false);
        if (this.field4496) {
            this.field4499[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ob.bl(IIB)Z")
    public boolean method6656(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4499.length || this.field4499[arg0] == null || arg1 < 0 || arg1 >= this.field4499[arg0].length) {
            return false;
        } else if (this.field4499[arg0][arg1] != null) {
            return true;
        } else if (this.field4504[arg0] == null) {
            this.method6590(arg0);
            return this.field4504[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ob.cx(II)Z")
    public boolean method6653(int arg0) {
        if (this.field4499.length == 1) {
            return this.method6656(0, arg0);
        } else if (this.field4499[arg0].length == 1) {
            return this.method6656(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ob.cu(II)Z")
    public boolean method6642(int arg0) {
        if (this.field4504[arg0] == null) {
            this.method6590(arg0);
            return this.field4504[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ob.cz(I)Z")
    public boolean method6652() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4509.length; var2++) {
            int var3 = this.field4509[var2];
            if (this.field4504[var3] == null) {
                this.method6590(var3);
                if (this.field4504[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ob.ad(II)I")
    public int method6603(int arg0) {
        return this.field4504[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ob.cm(II)[B")
    public byte[] method6644(int arg0) {
        if (this.field4499.length == 1) {
            return this.method6670(0, arg0);
        } else if (this.field4499[arg0].length == 1) {
            return this.method6670(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ob.ct(III)[B")
    public byte[] method6645(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4499.length || this.field4499[arg0] == null || arg1 < 0 || arg1 >= this.field4499[arg0].length) {
            return null;
        }
        if (this.field4499[arg0][arg1] == null) {
            boolean var3 = this.method6659(arg0, (int[]) null);
            if (!var3) {
                this.method6590(arg0);
                boolean var4 = this.method6659(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class365.method773(this.field4499[arg0][arg1], false);
    }

    @ObfuscatedName("ob.cl(IB)[B")
    public byte[] method6646(int arg0) {
        if (this.field4499.length == 1) {
            return this.method6645(0, arg0);
        } else if (this.field4499[arg0].length == 1) {
            return this.method6645(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ob.au(IB)V")
    public void method6590(int arg0) {
    }

    @ObfuscatedName("ob.cb(II)[I")
    public int[] method6647(int arg0) {
        return arg0 >= 0 && arg0 < this.field4501.length ? this.field4501[arg0] : null;
    }

    @ObfuscatedName("ob.cr(IB)I")
    public int method6685(int arg0) {
        return this.field4499 == null || arg0 >= this.field4499.length || this.field4499[arg0] == null ? 0 : this.field4499[arg0].length;
    }

    @ObfuscatedName("ob.cj(I)I")
    public int method6649() {
        return this.field4499.length;
    }

    @ObfuscatedName("ob.cg(I)V")
    public void method6721() {
        for (int var1 = 0; var1 < this.field4504.length; var1++) {
            this.field4504[var1] = null;
        }
    }

    @ObfuscatedName("ob.cp(II)V")
    public void method6651(int arg0) {
        for (int var2 = 0; var2 < this.field4499[arg0].length; var2++) {
            this.field4499[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ob.cq(I)V")
    public void method6725() {
        for (int var1 = 0; var1 < this.field4499.length; var1++) {
            if (this.field4499[var1] != null) {
                for (int var2 = 0; var2 < this.field4499[var1].length; var2++) {
                    this.field4499[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ob.ci(I[IB)Z")
    public boolean method6659(int arg0, int[] arg1) {
        if (this.field4504[arg0] == null) {
            return false;
        }
        int var3 = this.field4505[arg0];
        int[] var4 = this.field4501[arg0];
        Object[] var5 = this.field4499[arg0];
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
            var8 = class365.method773(this.field4504[arg0], true);
            class549 var9 = new class549(var8);
            var9.method8823(arg1, 5, var9.field5381.length);
        } else {
            var8 = class365.method773(this.field4504[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method4125(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class549.method8139(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class549.method8139(var8, 0, var18);
            throw class575.method2096(var35, var17 + var19 + "," + this.field4498[arg0] + "," + this.field4507);
        }
        if (this.field4506) {
            this.field4504[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class549 var23 = new class549(var10);
            int[] var24 = new int[var3];
            var23.field5378 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method8803();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field5378 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method8803();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field4496) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class365.method4614(var28[var34], false);
                }
            }
        } else if (this.field4496) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class365.method4614(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ob.co(Ljava/lang/String;B)I")
    public int method6654(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4497.method9465(class417.method3157(var2));
    }

    @ObfuscatedName("ob.cn(ILjava/lang/String;I)I")
    public int method6655(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4503[arg0].method9465(class417.method3157(var3));
    }

    @ObfuscatedName("ob.cy(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6728(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4497.method9465(class417.method3157(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4503[var5].method9465(class417.method3157(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ob.ce(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method6657(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4497.method9465(class417.method3157(var3));
        int var6 = this.field4503[var5].method9465(class417.method3157(var4));
        return this.method6670(var5, var6);
    }

    @ObfuscatedName("ob.cf(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method6658(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4497.method9465(class417.method3157(var3));
        int var6 = this.field4503[var5].method9465(class417.method3157(var4));
        return this.method6656(var5, var6);
    }

    @ObfuscatedName("ob.cc(Ljava/lang/String;I)Z")
    public boolean method6662(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4497.method9465(class417.method3157(var2));
        return this.method6642(var3);
    }

    @ObfuscatedName("ob.cs(Ljava/lang/String;I)V")
    public void method6660(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4497.method9465(class417.method3157(var2));
        if (var3 >= 0) {
            this.method6589(var3);
        }
    }

    @ObfuscatedName("ob.cw(Ljava/lang/String;I)I")
    public int method6661(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4497.method9465(class417.method3157(var2));
        return this.method6603(var3);
    }

    @ObfuscatedName("hu.ck([BI)[B")
    public static final byte[] method4125(byte[] arg0) {
        class549 var1 = new class549(arg0);
        int var2 = var1.method9025();
        int var3 = var1.method8803();
        if (var3 < 0 || !(field4510 == 0 || var3 <= field4510)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method8811(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method8803();
            if (var5 < 0 || field4510 != 0 && var5 > field4510) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class552.method9073(var6, var5, arg0, var3, 9);
            } else {
                field4494.method9463(var1, var6);
            }
            return var6;
        }
    }
}
