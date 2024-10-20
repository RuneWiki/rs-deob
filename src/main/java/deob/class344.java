package deob;

@ObfuscatedName("nm")
public abstract class class344 {

    @ObfuscatedName("nm.ar")
    public int field4237;

    @ObfuscatedName("nm.am")
    public int[] field4232;

    @ObfuscatedName("nm.as")
    public int[] field4223;

    @ObfuscatedName("nm.aj")
    public class510 field4224;

    @ObfuscatedName("nm.ak")
    public int[] field4225;

    @ObfuscatedName("nm.az")
    public int[] field4228;

    @ObfuscatedName("nm.ad")
    public int[] field4227;

    @ObfuscatedName("nm.ae")
    public int[][] field4222;

    @ObfuscatedName("nm.ap")
    public int[][] field4229;

    @ObfuscatedName("nm.by")
    public class510[] field4230;

    @ObfuscatedName("nm.bb")
    public Object[] field4231;

    @ObfuscatedName("nm.bi")
    public Object[][] field4234;

    @ObfuscatedName("nm.be")
    public static class509 field4233 = new class509();

    @ObfuscatedName("nm.bk")
    public int field4226;

    @ObfuscatedName("nm.bx")
    public boolean field4235;

    @ObfuscatedName("nm.bo")
    public boolean field4236;

    @ObfuscatedName("nm.bz")
    public static int field4221 = 0;

    public class344(boolean arg0, boolean arg1) {
        this.field4235 = arg0;
        this.field4236 = arg1;
    }

    @ObfuscatedName("nm.bc([BB)V")
    public void method6069(byte[] arg0) {
        this.field4226 = class489.method4137(arg0, arg0.length);
        class489 var2 = new class489(method169(arg0));
        int var3 = var2.method8248();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method8254();
        }
        int var4 = var2.method8248();
        if (var3 >= 7) {
            this.field4237 = var2.method8482();
        } else {
            this.field4237 = var2.method8250();
        }
        int var5 = 0;
        int var6 = -1;
        this.field4232 = new int[this.field4237];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field4237; var7++) {
                this.field4232[var7] = var5 += var2.method8482();
                if (this.field4232[var7] > var6) {
                    var6 = this.field4232[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field4237; var8++) {
                this.field4232[var8] = var5 += var2.method8250();
                if (this.field4232[var8] > var6) {
                    var6 = this.field4232[var8];
                }
            }
        }
        this.field4225 = new int[var6 + 1];
        this.field4228 = new int[var6 + 1];
        this.field4227 = new int[var6 + 1];
        this.field4222 = new int[var6 + 1][];
        this.field4231 = new Object[var6 + 1];
        this.field4234 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field4223 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field4237; var9++) {
                this.field4223[this.field4232[var9]] = var2.method8254();
            }
            this.field4224 = new class510(this.field4223);
        }
        for (int var10 = 0; var10 < this.field4237; var10++) {
            this.field4225[this.field4232[var10]] = var2.method8254();
        }
        for (int var11 = 0; var11 < this.field4237; var11++) {
            this.field4228[this.field4232[var11]] = var2.method8254();
        }
        for (int var12 = 0; var12 < this.field4237; var12++) {
            this.field4227[this.field4232[var12]] = var2.method8250();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field4237; var13++) {
                int var14 = this.field4232[var13];
                int var15 = this.field4227[var14];
                int var16 = 0;
                int var17 = -1;
                this.field4222[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field4222[var14][var18] = var16 += var2.method8482();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field4234[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field4237; var20++) {
                int var21 = this.field4232[var20];
                int var22 = this.field4227[var21];
                int var23 = 0;
                int var24 = -1;
                this.field4222[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field4222[var21][var25] = var23 += var2.method8250();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field4234[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field4229 = new int[var6 + 1][];
        this.field4230 = new class510[var6 + 1];
        for (int var27 = 0; var27 < this.field4237; var27++) {
            int var28 = this.field4232[var27];
            int var29 = this.field4227[var28];
            this.field4229[var28] = new int[this.field4234[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field4229[var28][this.field4222[var28][var30]] = var2.method8254();
            }
            this.field4230[var28] = new class510(this.field4229[var28]);
        }
    }

    @ObfuscatedName("nm.aw(II)V")
    public void method6044(int arg0) {
    }

    @ObfuscatedName("nm.bh(IIB)[B")
    public byte[] method6090(int arg0, int arg1) {
        return this.method6072(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("nm.bw(II[II)[B")
    public byte[] method6072(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4234.length || this.field4234[arg0] == null || arg1 < 0 || arg1 >= this.field4234[arg0].length) {
            return null;
        }
        if (this.field4234[arg0][arg1] == null) {
            boolean var4 = this.method6085(arg0, arg2);
            if (!var4) {
                this.method6019(arg0);
                boolean var5 = this.method6085(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class321.method3419(this.field4234[arg0][arg1], false);
        if (this.field4236) {
            this.field4234[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("nm.ce(IIB)Z")
    public boolean method6073(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4234.length || this.field4234[arg0] == null || arg1 < 0 || arg1 >= this.field4234[arg0].length) {
            return false;
        } else if (this.field4234[arg0][arg1] != null) {
            return true;
        } else if (this.field4231[arg0] == null) {
            this.method6019(arg0);
            return this.field4231[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("nm.ci(II)Z")
    public boolean method6080(int arg0) {
        if (this.field4234.length == 1) {
            return this.method6073(0, arg0);
        } else if (this.field4234[arg0].length == 1) {
            return this.method6073(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("nm.cs(II)Z")
    public boolean method6125(int arg0) {
        if (this.field4231[arg0] == null) {
            this.method6019(arg0);
            return this.field4231[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("nm.cc(S)Z")
    public boolean method6136() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4232.length; var2++) {
            int var3 = this.field4232[var2];
            if (this.field4231[var3] == null) {
                this.method6019(var3);
                if (this.field4231[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("nm.aa(II)I")
    public int method6025(int arg0) {
        return this.field4231[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("nm.cn(IB)[B")
    public byte[] method6117(int arg0) {
        if (this.field4234.length == 1) {
            return this.method6090(0, arg0);
        } else if (this.field4234[arg0].length == 1) {
            return this.method6090(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("nm.ca(III)[B")
    public byte[] method6078(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4234.length || this.field4234[arg0] == null || arg1 < 0 || arg1 >= this.field4234[arg0].length) {
            return null;
        }
        if (this.field4234[arg0][arg1] == null) {
            boolean var3 = this.method6085(arg0, (int[]) null);
            if (!var3) {
                this.method6019(arg0);
                boolean var4 = this.method6085(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class321.method3419(this.field4234[arg0][arg1], false);
    }

    @ObfuscatedName("nm.cu(II)[B")
    public byte[] method6079(int arg0) {
        if (this.field4234.length == 1) {
            return this.method6078(0, arg0);
        } else if (this.field4234[arg0].length == 1) {
            return this.method6078(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("nm.ac(II)V")
    public void method6019(int arg0) {
    }

    @ObfuscatedName("nm.ck(II)[I")
    public int[] method6074(int arg0) {
        return arg0 >= 0 && arg0 < this.field4222.length ? this.field4222[arg0] : null;
    }

    @ObfuscatedName("nm.cq(IB)I")
    public int method6081(int arg0) {
        return this.field4234 == null || arg0 >= this.field4234.length || this.field4234[arg0] == null ? 0 : this.field4234[arg0].length;
    }

    @ObfuscatedName("nm.cm(I)I")
    public int method6082() {
        return this.field4234.length;
    }

    @ObfuscatedName("nm.cf(I)V")
    public void method6083() {
        for (int var1 = 0; var1 < this.field4231.length; var1++) {
            this.field4231[var1] = null;
        }
    }

    @ObfuscatedName("nm.cl(IB)V")
    public void method6084(int arg0) {
        for (int var2 = 0; var2 < this.field4234[arg0].length; var2++) {
            this.field4234[arg0][var2] = null;
        }
    }

    @ObfuscatedName("nm.cg(I)V")
    public void method6087() {
        for (int var1 = 0; var1 < this.field4234.length; var1++) {
            if (this.field4234[var1] != null) {
                for (int var2 = 0; var2 < this.field4234[var1].length; var2++) {
                    this.field4234[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("nm.cr(I[II)Z")
    public boolean method6085(int arg0, int[] arg1) {
        if (this.field4231[arg0] == null) {
            return false;
        }
        int var3 = this.field4227[arg0];
        int[] var4 = this.field4222[arg0];
        Object[] var5 = this.field4234[arg0];
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
            var8 = class321.method3419(this.field4231[arg0], true);
            class489 var9 = new class489(var8);
            var9.method8274(arg1, 5, var9.field4991.length);
        } else {
            var8 = class321.method3419(this.field4231[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method169(var8);
        } catch (RuntimeException var27) {
            throw class516.method2434(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class489.method4137(var8, var8.length) + "," + class489.method4137(var8, var8.length - 2) + "," + this.field4225[arg0] + "," + this.field4226);
        }
        if (this.field4235) {
            this.field4231[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class489 var15 = new class489(var10);
            int[] var16 = new int[var3];
            var15.field4989 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method8254();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field4989 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method8254();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field4236) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class321.method2705(var20[var26], false);
                }
            }
        } else if (this.field4236) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class321.method2705(var10, false);
        }
        return true;
    }

    @ObfuscatedName("nm.cy(Ljava/lang/String;I)I")
    public int method6086(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4224.method8836(class372.method3512(var2));
    }

    @ObfuscatedName("nm.cx(ILjava/lang/String;S)I")
    public int method6075(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4230[arg0].method8836(class372.method3512(var3));
    }

    @ObfuscatedName("nm.cv(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6088(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4224.method8836(class372.method3512(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4230[var5].method8836(class372.method3512(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("nm.cb(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method6089(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4224.method8836(class372.method3512(var3));
        int var6 = this.field4230[var5].method8836(class372.method3512(var4));
        return this.method6090(var5, var6);
    }

    @ObfuscatedName("nm.co(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6140(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4224.method8836(class372.method3512(var3));
        int var6 = this.field4230[var5].method8836(class372.method3512(var4));
        return this.method6073(var5, var6);
    }

    @ObfuscatedName("nm.cz(Ljava/lang/String;I)Z")
    public boolean method6091(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4224.method8836(class372.method3512(var2));
        return this.method6125(var3);
    }

    @ObfuscatedName("nm.cw(Ljava/lang/String;I)V")
    public void method6092(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4224.method8836(class372.method3512(var2));
        if (var3 >= 0) {
            this.method6044(var3);
        }
    }

    @ObfuscatedName("nm.cj(Ljava/lang/String;I)I")
    public int method6068(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4224.method8836(class372.method3512(var2));
        return this.method6025(var3);
    }

    @ObfuscatedName("ai.ch([BI)[B")
    public static final byte[] method169(byte[] arg0) {
        class489 var1 = new class489(arg0);
        int var2 = var1.method8248();
        int var3 = var1.method8254();
        if (var3 < 0 || !(field4221 == 0 || var3 <= field4221)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method8266(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method8254();
            if (var5 < 0 || field4221 != 0 && var5 > field4221) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class492.method8522(var6, var5, arg0, var3, 9);
            } else {
                field4233.method8832(var1, var6);
            }
            return var6;
        }
    }
}
