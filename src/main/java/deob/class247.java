package deob;

@ObfuscatedName("ik")
public abstract class class247 {

    @ObfuscatedName("ik.p")
    public int field3290;

    @ObfuscatedName("ik.i")
    public int[] field3301;

    @ObfuscatedName("ik.w")
    public int[] field3289;

    @ObfuscatedName("ik.s")
    public class199 field3292;

    @ObfuscatedName("ik.j")
    public int[] field3302;

    @ObfuscatedName("ik.a")
    public int[] field3299;

    @ObfuscatedName("ik.t")
    public int[] field3295;

    @ObfuscatedName("ik.r")
    public int[][] field3296;

    @ObfuscatedName("ik.m")
    public int[][] field3297;

    @ObfuscatedName("ik.h")
    public class199[] field3298;

    @ObfuscatedName("ik.o")
    public Object[] field3291;

    @ObfuscatedName("ik.x")
    public Object[][] field3300;

    @ObfuscatedName("ik.q")
    public static class178 field3293 = new class178();

    @ObfuscatedName("ik.v")
    public int field3294;

    @ObfuscatedName("ik.n")
    public boolean field3303;

    @ObfuscatedName("ik.y")
    public boolean field3304;

    @ObfuscatedName("ik.d")
    public static int field3305 = 0;

    public class247(boolean arg0, boolean arg1) {
        this.field3303 = arg0;
        this.field3304 = arg1;
    }

    @ObfuscatedName("ik.p([BI)V")
    public void method4039(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class185.field2489[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field3294 = var5;
        class185 var8 = new class185(method4742(arg0));
        int var9 = var8.method3197();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method3127();
        }
        int var10 = var8.method3197();
        if (var9 >= 7) {
            this.field3290 = var8.method3137();
        } else {
            this.field3290 = var8.method3124();
        }
        int var11 = 0;
        int var12 = -1;
        this.field3301 = new int[this.field3290];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field3290; var13++) {
                this.field3301[var13] = var11 += var8.method3137();
                if (this.field3301[var13] > var12) {
                    var12 = this.field3301[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field3290; var14++) {
                this.field3301[var14] = var11 += var8.method3124();
                if (this.field3301[var14] > var12) {
                    var12 = this.field3301[var14];
                }
            }
        }
        this.field3302 = new int[var12 + 1];
        this.field3299 = new int[var12 + 1];
        this.field3295 = new int[var12 + 1];
        this.field3296 = new int[var12 + 1][];
        this.field3291 = new Object[var12 + 1];
        this.field3300 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field3289 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field3290; var15++) {
                this.field3289[this.field3301[var15]] = var8.method3127();
            }
            this.field3292 = new class199(this.field3289);
        }
        for (int var16 = 0; var16 < this.field3290; var16++) {
            this.field3302[this.field3301[var16]] = var8.method3127();
        }
        for (int var17 = 0; var17 < this.field3290; var17++) {
            this.field3299[this.field3301[var17]] = var8.method3127();
        }
        for (int var18 = 0; var18 < this.field3290; var18++) {
            this.field3295[this.field3301[var18]] = var8.method3124();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field3290; var19++) {
                int var20 = this.field3301[var19];
                int var21 = this.field3295[var20];
                int var22 = 0;
                int var23 = -1;
                this.field3296[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field3296[var20][var24] = var22 += var8.method3137();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field3300[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field3290; var26++) {
                int var27 = this.field3301[var26];
                int var28 = this.field3295[var27];
                int var29 = 0;
                int var30 = -1;
                this.field3296[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field3296[var27][var31] = var29 += var8.method3124();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field3300[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field3297 = new int[var12 + 1][];
        this.field3298 = new class199[var12 + 1];
        for (int var33 = 0; var33 < this.field3290; var33++) {
            int var34 = this.field3301[var33];
            int var35 = this.field3295[var34];
            this.field3297[var34] = new int[this.field3300[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field3297[var34][this.field3296[var34][var36]] = var8.method3127();
            }
            this.field3298[var34] = new class199(this.field3297[var34]);
        }
    }

    @ObfuscatedName("ik.i(IS)V")
    public void method4031(int arg0) {
    }

    @ObfuscatedName("ik.w(III)[B")
    public byte[] method4032(int arg0, int arg1) {
        return this.method4033(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ik.s(II[IB)[B")
    public byte[] method4033(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3300.length || this.field3300[arg0] == null || arg1 < 0 || arg1 >= this.field3300[arg0].length) {
            return null;
        }
        if (this.field3300[arg0][arg1] == null) {
            boolean var4 = this.method4048(arg0, arg2);
            if (!var4) {
                this.method4049(arg0);
                boolean var5 = this.method4048(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class188.method685(this.field3300[arg0][arg1], false);
        if (this.field3304) {
            this.field3300[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ik.j(III)Z")
    public boolean method4034(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3300.length || this.field3300[arg0] == null || arg1 < 0 || arg1 >= this.field3300[arg0].length) {
            return false;
        } else if (this.field3300[arg0][arg1] != null) {
            return true;
        } else if (this.field3291[arg0] == null) {
            this.method4049(arg0);
            return this.field3291[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ik.a(IB)Z")
    public boolean method4040(int arg0) {
        if (this.field3300.length == 1) {
            return this.method4034(0, arg0);
        } else if (this.field3300[arg0].length == 1) {
            return this.method4034(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ik.t(II)Z")
    public boolean method4119(int arg0) {
        if (this.field3291[arg0] == null) {
            this.method4049(arg0);
            return this.field3291[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ik.r(I)Z")
    public boolean method4037() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3301.length; var2++) {
            int var3 = this.field3301[var2];
            if (this.field3291[var3] == null) {
                this.method4049(var3);
                if (this.field3291[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ik.m(II)I")
    public int method4038(int arg0) {
        return this.field3291[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ik.h(IB)[B")
    public byte[] method4097(int arg0) {
        if (this.field3300.length == 1) {
            return this.method4032(0, arg0);
        } else if (this.field3300[arg0].length == 1) {
            return this.method4032(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ik.o(IIB)[B")
    public byte[] method4057(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3300.length || this.field3300[arg0] == null || arg1 < 0 || arg1 >= this.field3300[arg0].length) {
            return null;
        }
        if (this.field3300[arg0][arg1] == null) {
            boolean var3 = this.method4048(arg0, (int[]) null);
            if (!var3) {
                this.method4049(arg0);
                boolean var4 = this.method4048(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class188.method685(this.field3300[arg0][arg1], false);
    }

    @ObfuscatedName("ik.x(II)[B")
    public byte[] method4086(int arg0) {
        if (this.field3300.length == 1) {
            return this.method4057(0, arg0);
        } else if (this.field3300[arg0].length == 1) {
            return this.method4057(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ik.q(II)V")
    public void method4049(int arg0) {
    }

    @ObfuscatedName("ik.d(II)[I")
    public int[] method4043(int arg0) {
        return this.field3296[arg0];
    }

    @ObfuscatedName("ik.l(II)I")
    public int method4044(int arg0) {
        return this.field3300[arg0].length;
    }

    @ObfuscatedName("ik.f(I)I")
    public int method4045() {
        return this.field3300.length;
    }

    @ObfuscatedName("ik.k(IB)V")
    public void method4046(int arg0) {
        for (int var2 = 0; var2 < this.field3300[arg0].length; var2++) {
            this.field3300[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ik.e(B)V")
    public void method4047() {
        for (int var1 = 0; var1 < this.field3300.length; var1++) {
            if (this.field3300[var1] != null) {
                for (int var2 = 0; var2 < this.field3300[var1].length; var2++) {
                    this.field3300[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ik.u(I[II)Z")
    public boolean method4048(int arg0, int[] arg1) {
        if (this.field3291[arg0] == null) {
            return false;
        }
        int var3 = this.field3295[arg0];
        int[] var4 = this.field3296[arg0];
        Object[] var5 = this.field3300[arg0];
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
            var8 = class188.method685(this.field3291[arg0], true);
            class185 var9 = new class185(var8);
            var9.method3113(arg1, 5, var9.field2491.length);
        } else {
            var8 = class188.method685(this.field3291[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method4742(var8);
        } catch (RuntimeException var42) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class185.field2489[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var20 = var13 + var17 + ",";
            int var21 = var8.length - 2;
            int var22 = -1;
            for (int var23 = 0; var23 < var21; var23++) {
                var22 = var22 >>> 8 ^ class185.field2489[(var22 ^ var8[var23]) & 0xFF];
            }
            int var24 = ~var22;
            throw class155.method4665(var42, var20 + var24 + "," + this.field3302[arg0] + "," + this.field3294);
        }
        if (this.field3303) {
            this.field3291[arg0] = null;
        }
        if (var3 > 1) {
            int var27 = var10.length;
            int var43 = var27 - 1;
            int var28 = var10[var43] & 0xFF;
            int var29 = var43 - var3 * var28 * 4;
            class185 var30 = new class185(var10);
            int[] var31 = new int[var3];
            var30.field2488 = var29;
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = 0;
                for (int var34 = 0; var34 < var3; var34++) {
                    var33 += var30.method3127();
                    var31[var34] += var33;
                }
            }
            byte[][] var35 = new byte[var3][];
            for (int var36 = 0; var36 < var3; var36++) {
                var35[var36] = new byte[var31[var36]];
                var31[var36] = 0;
            }
            var30.field2488 = var29;
            int var37 = 0;
            for (int var38 = 0; var38 < var28; var38++) {
                int var39 = 0;
                for (int var40 = 0; var40 < var3; var40++) {
                    var39 += var30.method3127();
                    System.arraycopy(var10, var37, var35[var40], var31[var40], var39);
                    var31[var40] += var39;
                    var37 += var39;
                }
            }
            for (int var41 = 0; var41 < var3; var41++) {
                if (this.field3304) {
                    var5[var4[var41]] = var35[var41];
                } else {
                    var5[var4[var41]] = class188.method3015(var35[var41], false);
                }
            }
        } else if (this.field3304) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class188.method3015(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ik.z(Ljava/lang/String;I)I")
    public int method4117(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3292.method3492(class294.method496(var2));
    }

    @ObfuscatedName("ik.b(ILjava/lang/String;B)I")
    public int method4050(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3298[arg0].method3492(class294.method496(var3));
    }

    @ObfuscatedName("ik.c(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method4100(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3292.method3492(class294.method496(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3298[var5].method3492(class294.method496(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ik.aa(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4052(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3292.method3492(class294.method496(var3));
        int var6 = this.field3298[var5].method3492(class294.method496(var4));
        return this.method4032(var5, var6);
    }

    @ObfuscatedName("ik.ap(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4053(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3292.method3492(class294.method496(var3));
        int var6 = this.field3298[var5].method3492(class294.method496(var4));
        return this.method4034(var5, var6);
    }

    @ObfuscatedName("ik.ao(Ljava/lang/String;I)Z")
    public boolean method4054(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3292.method3492(class294.method496(var2));
        return this.method4119(var3);
    }

    @ObfuscatedName("ik.ar(Ljava/lang/String;B)V")
    public void method4030(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3292.method3492(class294.method496(var2));
        if (var3 >= 0) {
            this.method4031(var3);
        }
    }

    @ObfuscatedName("ik.ay(Ljava/lang/String;I)I")
    public int method4056(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3292.method3492(class294.method496(var2));
        return this.method4038(var3);
    }

    @ObfuscatedName("ji.ax([BI)[B")
    public static final byte[] method4742(byte[] arg0) {
        class185 var1 = new class185(arg0);
        int var2 = var1.method3197();
        int var3 = var1.method3127();
        if (var3 < 0 || !(field3305 == 0 || var3 <= field3305)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3134(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3127();
            if (var5 < 0 || field3305 != 0 && var5 > field3305) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class179.method3077(var6, var5, arg0, var3, 9);
            } else {
                field3293.method3059(var1, var6);
            }
            return var6;
        }
    }
}
