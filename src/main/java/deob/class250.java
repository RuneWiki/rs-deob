package deob;

@ObfuscatedName("ik")
public abstract class class250 {

    @ObfuscatedName("ik.l")
    public int field3235;

    @ObfuscatedName("ik.w")
    public int[] field3224;

    @ObfuscatedName("ik.s")
    public int[] field3229;

    @ObfuscatedName("ik.e")
    public class201 field3226;

    @ObfuscatedName("ik.a")
    public int[] field3227;

    @ObfuscatedName("ik.c")
    public int[] field3228;

    @ObfuscatedName("ik.p")
    public int[] field3236;

    @ObfuscatedName("ik.r")
    public int[][] field3225;

    @ObfuscatedName("ik.m")
    public int[][] field3231;

    @ObfuscatedName("ik.d")
    public class201[] field3232;

    @ObfuscatedName("ik.z")
    public Object[] field3233;

    @ObfuscatedName("ik.x")
    public Object[][] field3234;

    @ObfuscatedName("ik.v")
    public static class178 field3222 = new class178();

    @ObfuscatedName("ik.g")
    public int field3223;

    @ObfuscatedName("ik.j")
    public boolean field3237;

    @ObfuscatedName("ik.b")
    public boolean field3238;

    @ObfuscatedName("ik.u")
    public static int field3239 = 0;

    public class250(boolean arg0, boolean arg1) {
        this.field3237 = arg0;
        this.field3238 = arg1;
    }

    @ObfuscatedName("ik.f([BI)V")
    public void method4287(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class185.method3132(arg0, 0, var2);
        this.field3223 = var3;
        class185 var4 = new class185(method3257(arg0));
        int var5 = var4.method3344();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method3432();
        }
        int var6 = var4.method3344();
        if (var5 >= 7) {
            this.field3235 = var4.method3360();
        } else {
            this.field3235 = var4.method3346();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3224 = new int[this.field3235];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3235; var9++) {
                this.field3224[var9] = var7 += var4.method3360();
                if (this.field3224[var9] > var8) {
                    var8 = this.field3224[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3235; var10++) {
                this.field3224[var10] = var7 += var4.method3346();
                if (this.field3224[var10] > var8) {
                    var8 = this.field3224[var10];
                }
            }
        }
        this.field3227 = new int[var8 + 1];
        this.field3228 = new int[var8 + 1];
        this.field3236 = new int[var8 + 1];
        this.field3225 = new int[var8 + 1][];
        this.field3233 = new Object[var8 + 1];
        this.field3234 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3229 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3235; var11++) {
                this.field3229[this.field3224[var11]] = var4.method3432();
            }
            this.field3226 = new class201(this.field3229);
        }
        for (int var12 = 0; var12 < this.field3235; var12++) {
            this.field3227[this.field3224[var12]] = var4.method3432();
        }
        for (int var13 = 0; var13 < this.field3235; var13++) {
            this.field3228[this.field3224[var13]] = var4.method3432();
        }
        for (int var14 = 0; var14 < this.field3235; var14++) {
            this.field3236[this.field3224[var14]] = var4.method3346();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3235; var15++) {
                int var16 = this.field3224[var15];
                int var17 = this.field3236[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3225[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3225[var16][var20] = var18 += var4.method3360();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3234[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3235; var22++) {
                int var23 = this.field3224[var22];
                int var24 = this.field3236[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3225[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3225[var23][var27] = var25 += var4.method3346();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3234[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3231 = new int[var8 + 1][];
        this.field3232 = new class201[var8 + 1];
        for (int var29 = 0; var29 < this.field3235; var29++) {
            int var30 = this.field3224[var29];
            int var31 = this.field3236[var30];
            this.field3231[var30] = new int[this.field3234[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3231[var30][this.field3225[var30][var32]] = var4.method3432();
            }
            this.field3232[var30] = new class201(this.field3231[var30]);
        }
    }

    @ObfuscatedName("ik.l(II)V")
    public void method4288(int arg0) {
    }

    @ObfuscatedName("ik.w(III)[B")
    public byte[] method4289(int arg0, int arg1) {
        return this.method4290(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ik.s(II[IB)[B")
    public byte[] method4290(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3234.length || this.field3234[arg0] == null || arg1 < 0 || arg1 >= this.field3234[arg0].length) {
            return null;
        }
        if (this.field3234[arg0][arg1] == null) {
            boolean var4 = this.method4306(arg0, arg2);
            if (!var4) {
                this.method4321(arg0);
                boolean var5 = this.method4306(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class189.method3648(this.field3234[arg0][arg1], false);
        if (this.field3238) {
            this.field3234[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ik.e(III)Z")
    public boolean method4359(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3234.length || this.field3234[arg0] == null || arg1 < 0 || arg1 >= this.field3234[arg0].length) {
            return false;
        } else if (this.field3234[arg0][arg1] != null) {
            return true;
        } else if (this.field3233[arg0] == null) {
            this.method4321(arg0);
            return this.field3233[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ik.c(II)Z")
    public boolean method4292(int arg0) {
        if (this.field3234.length == 1) {
            return this.method4359(0, arg0);
        } else if (this.field3234[arg0].length == 1) {
            return this.method4359(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ik.p(IB)Z")
    public boolean method4341(int arg0) {
        if (this.field3233[arg0] == null) {
            this.method4321(arg0);
            return this.field3233[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ik.r(I)Z")
    public boolean method4294() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3224.length; var2++) {
            int var3 = this.field3224[var2];
            if (this.field3233[var3] == null) {
                this.method4321(var3);
                if (this.field3233[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ik.m(IB)I")
    public int method4295(int arg0) {
        return this.field3233[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ik.d(II)[B")
    public byte[] method4296(int arg0) {
        if (this.field3234.length == 1) {
            return this.method4289(0, arg0);
        } else if (this.field3234[arg0].length == 1) {
            return this.method4289(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ik.z(III)[B")
    public byte[] method4386(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3234.length || this.field3234[arg0] == null || arg1 < 0 || arg1 >= this.field3234[arg0].length) {
            return null;
        }
        if (this.field3234[arg0][arg1] == null) {
            boolean var3 = this.method4306(arg0, (int[]) null);
            if (!var3) {
                this.method4321(arg0);
                boolean var4 = this.method4306(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class189.method3648(this.field3234[arg0][arg1], false);
    }

    @ObfuscatedName("ik.x(II)[B")
    public byte[] method4298(int arg0) {
        if (this.field3234.length == 1) {
            return this.method4386(0, arg0);
        } else if (this.field3234[arg0].length == 1) {
            return this.method4386(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ik.v(II)V")
    public void method4321(int arg0) {
    }

    @ObfuscatedName("ik.g(II)[I")
    public int[] method4366(int arg0) {
        return this.field3225[arg0];
    }

    @ObfuscatedName("ik.u(II)I")
    public int method4326(int arg0) {
        return this.field3234[arg0].length;
    }

    @ObfuscatedName("ik.o(B)I")
    public int method4302() {
        return this.field3234.length;
    }

    @ObfuscatedName("ik.i(I)V")
    public void method4303() {
        for (int var1 = 0; var1 < this.field3233.length; var1++) {
            this.field3233[var1] = null;
        }
    }

    @ObfuscatedName("ik.k(II)V")
    public void method4349(int arg0) {
        for (int var2 = 0; var2 < this.field3234[arg0].length; var2++) {
            this.field3234[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ik.q(I)V")
    public void method4305() {
        for (int var1 = 0; var1 < this.field3234.length; var1++) {
            if (this.field3234[var1] != null) {
                for (int var2 = 0; var2 < this.field3234[var1].length; var2++) {
                    this.field3234[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ik.y(I[II)Z")
    public boolean method4306(int arg0, int[] arg1) {
        if (this.field3233[arg0] == null) {
            return false;
        }
        int var3 = this.field3236[arg0];
        int[] var4 = this.field3225[arg0];
        Object[] var5 = this.field3234[arg0];
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
            var8 = class189.method3648(this.field3233[arg0], true);
            class185 var9 = new class185(var8);
            var9.method3551(arg1, 5, var9.field2415.length);
        } else {
            var8 = class189.method3648(this.field3233[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method3257(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class185.method3132(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class185.method3132(var8, 0, var17);
            throw class155.method982(var34, var16 + var18 + "," + this.field3227[arg0] + "," + this.field3223);
        }
        if (this.field3237) {
            this.field3233[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class185 var22 = new class185(var10);
            int[] var23 = new int[var3];
            var22.field2414 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method3432();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field2414 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method3432();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field3238) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class189.method3071(var27[var33], false);
                }
            }
        } else if (this.field3238) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class189.method3071(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ik.av(Ljava/lang/String;I)I")
    public int method4312(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3226.method3724(class308.method4099(var2));
    }

    @ObfuscatedName("ik.ag(ILjava/lang/String;I)I")
    public int method4291(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3232[arg0].method3724(class308.method4099(var3));
    }

    @ObfuscatedName("ik.af(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4308(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3226.method3724(class308.method4099(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3232[var5].method3724(class308.method4099(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ik.az(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4309(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3226.method3724(class308.method4099(var3));
        int var6 = this.field3232[var5].method3724(class308.method4099(var4));
        return this.method4289(var5, var6);
    }

    @ObfuscatedName("ik.at(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method4310(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3226.method3724(class308.method4099(var3));
        int var6 = this.field3232[var5].method3724(class308.method4099(var4));
        return this.method4359(var5, var6);
    }

    @ObfuscatedName("ik.ac(Ljava/lang/String;B)Z")
    public boolean method4311(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3226.method3724(class308.method4099(var2));
        return this.method4341(var3);
    }

    @ObfuscatedName("ik.am(Ljava/lang/String;I)V")
    public void method4368(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3226.method3724(class308.method4099(var2));
        if (var3 >= 0) {
            this.method4288(var3);
        }
    }

    @ObfuscatedName("ik.aw(Ljava/lang/String;I)I")
    public int method4304(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3226.method3724(class308.method4099(var2));
        return this.method4295(var3);
    }

    @ObfuscatedName("ft.aa([BB)[B")
    public static final byte[] method3257(byte[] arg0) {
        class185 var1 = new class185(arg0);
        int var2 = var1.method3344();
        int var3 = var1.method3432();
        if (var3 < 0 || !(field3239 == 0 || var3 <= field3239)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3383(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3432();
            if (var5 < 0 || field3239 != 0 && var5 > field3239) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class179.method3287(var6, var5, arg0, var3, 9);
            } else {
                field3222.method3274(var1, var6);
            }
            return var6;
        }
    }
}
