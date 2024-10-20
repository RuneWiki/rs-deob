package deob;

@ObfuscatedName("el")
public abstract class class142 {

    @ObfuscatedName("el.z")
    public int field2424;

    @ObfuscatedName("el.n")
    public int[] field2411;

    @ObfuscatedName("el.u")
    public int[] field2412;

    @ObfuscatedName("el.t")
    public class166 field2413;

    @ObfuscatedName("el.e")
    public int[] field2415;

    @ObfuscatedName("el.a")
    public int[] field2418;

    @ObfuscatedName("el.l")
    public int[] field2416;

    @ObfuscatedName("el.v")
    public int[][] field2417;

    @ObfuscatedName("el.j")
    public int[][] field2426;

    @ObfuscatedName("el.k")
    public class166[] field2414;

    @ObfuscatedName("el.g")
    public Object[] field2420;

    @ObfuscatedName("el.d")
    public Object[][] field2421;

    @ObfuscatedName("el.b")
    public static class101 field2422 = new class101();

    @ObfuscatedName("el.i")
    public int field2423;

    @ObfuscatedName("el.o")
    public boolean field2427;

    @ObfuscatedName("el.x")
    public boolean field2425;

    @ObfuscatedName("el.m")
    public static int field2410 = 0;

    public class142(boolean arg0, boolean arg1) {
        this.field2427 = arg0;
        this.field2425 = arg1;
    }

    @ObfuscatedName("el.z([BI)V")
    public void method2743(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class104.method148(arg0, 0, var2);
        this.field2423 = var3;
        class104 var4 = new class104(method557(arg0));
        int var5 = var4.method2257();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2130();
        }
        int var6 = var4.method2257();
        if (var5 >= 7) {
            this.field2424 = var4.method2286();
        } else {
            this.field2424 = var4.method2206();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2411 = new int[this.field2424];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2424; var9++) {
                this.field2411[var9] = var7 += var4.method2286();
                if (this.field2411[var9] > var8) {
                    var8 = this.field2411[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2424; var10++) {
                this.field2411[var10] = var7 += var4.method2206();
                if (this.field2411[var10] > var8) {
                    var8 = this.field2411[var10];
                }
            }
        }
        this.field2415 = new int[var8 + 1];
        this.field2418 = new int[var8 + 1];
        this.field2416 = new int[var8 + 1];
        this.field2417 = new int[var8 + 1][];
        this.field2420 = new Object[var8 + 1];
        this.field2421 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2412 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2424; var11++) {
                this.field2412[this.field2411[var11]] = var4.method2130();
            }
            this.field2413 = new class166(this.field2412);
        }
        for (int var12 = 0; var12 < this.field2424; var12++) {
            this.field2415[this.field2411[var12]] = var4.method2130();
        }
        for (int var13 = 0; var13 < this.field2424; var13++) {
            this.field2418[this.field2411[var13]] = var4.method2130();
        }
        for (int var14 = 0; var14 < this.field2424; var14++) {
            this.field2416[this.field2411[var14]] = var4.method2206();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2424; var15++) {
                int var16 = this.field2411[var15];
                int var17 = this.field2416[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2417[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2417[var16][var20] = var18 += var4.method2286();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2421[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2424; var22++) {
                int var23 = this.field2411[var22];
                int var24 = this.field2416[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2417[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2417[var23][var27] = var25 += var4.method2206();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2421[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2426 = new int[var8 + 1][];
        this.field2414 = new class166[var8 + 1];
        for (int var29 = 0; var29 < this.field2424; var29++) {
            int var30 = this.field2411[var29];
            int var31 = this.field2416[var30];
            this.field2426[var30] = new int[this.field2421[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2426[var30][this.field2417[var30][var32]] = var4.method2130();
            }
            this.field2414[var30] = new class166(this.field2426[var30]);
        }
    }

    @ObfuscatedName("el.n(IB)V")
    public void method2744(int arg0) {
    }

    @ObfuscatedName("el.u(III)[B")
    public byte[] method2768(int arg0, int arg1) {
        return this.method2746(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("el.t(II[II)[B")
    public byte[] method2746(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2421.length || this.field2421[arg0] == null || arg1 < 0 || arg1 >= this.field2421[arg0].length) {
            return null;
        }
        if (this.field2421[arg0][arg1] == null) {
            boolean var4 = this.method2759(arg0, arg2);
            if (!var4) {
                this.method2753(arg0);
                boolean var5 = this.method2759(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class109.method133(this.field2421[arg0][arg1], false);
        if (this.field2425) {
            this.field2421[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("el.e(IIB)Z")
    public boolean method2747(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2421.length || this.field2421[arg0] == null || arg1 < 0 || arg1 >= this.field2421[arg0].length) {
            return false;
        } else if (this.field2421[arg0][arg1] != null) {
            return true;
        } else if (this.field2420[arg0] == null) {
            this.method2753(arg0);
            return this.field2420[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("el.a(IB)Z")
    public boolean method2812(int arg0) {
        if (this.field2420[arg0] == null) {
            this.method2753(arg0);
            return this.field2420[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("el.l(B)Z")
    public boolean method2774() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2411.length; var2++) {
            int var3 = this.field2411[var2];
            if (this.field2420[var3] == null) {
                this.method2753(var3);
                if (this.field2420[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("el.v(II)[B")
    public byte[] method2815(int arg0) {
        if (this.field2421.length == 1) {
            return this.method2768(0, arg0);
        } else if (this.field2421[arg0].length == 1) {
            return this.method2768(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("el.j(III)[B")
    public byte[] method2767(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2421.length || this.field2421[arg0] == null || arg1 < 0 || arg1 >= this.field2421[arg0].length) {
            return null;
        }
        if (this.field2421[arg0][arg1] == null) {
            boolean var3 = this.method2759(arg0, (int[]) null);
            if (!var3) {
                this.method2753(arg0);
                boolean var4 = this.method2759(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class109.method133(this.field2421[arg0][arg1], false);
    }

    @ObfuscatedName("el.k(IB)[B")
    public byte[] method2772(int arg0) {
        if (this.field2421.length == 1) {
            return this.method2767(0, arg0);
        } else if (this.field2421[arg0].length == 1) {
            return this.method2767(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("el.g(IB)V")
    public void method2753(int arg0) {
    }

    @ObfuscatedName("el.d(IB)[I")
    public int[] method2749(int arg0) {
        return this.field2417[arg0];
    }

    @ObfuscatedName("el.b(II)I")
    public int method2755(int arg0) {
        return this.field2421[arg0].length;
    }

    @ObfuscatedName("el.i(I)I")
    public int method2756() {
        return this.field2421.length;
    }

    @ObfuscatedName("el.o(IB)V")
    public void method2757(int arg0) {
        for (int var2 = 0; var2 < this.field2421[arg0].length; var2++) {
            this.field2421[arg0][var2] = null;
        }
    }

    @ObfuscatedName("el.x(B)V")
    public void method2758() {
        for (int var1 = 0; var1 < this.field2421.length; var1++) {
            if (this.field2421[var1] != null) {
                for (int var2 = 0; var2 < this.field2421[var1].length; var2++) {
                    this.field2421[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("el.m(I[II)Z")
    public boolean method2759(int arg0, int[] arg1) {
        if (this.field2420[arg0] == null) {
            return false;
        }
        int var3 = this.field2416[arg0];
        int[] var4 = this.field2417[arg0];
        Object[] var5 = this.field2421[arg0];
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
            var8 = class109.method133(this.field2420[arg0], true);
            class104 var9 = new class104(var8);
            var9.method2284(arg1, 5, var9.field1819.length);
        } else {
            var8 = class109.method133(this.field2420[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method557(var8);
        } catch (RuntimeException var27) {
            throw class132.method105(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class104.method537(var8, var8.length) + "," + class104.method537(var8, var8.length - 2) + "," + this.field2415[arg0] + "," + this.field2423);
        }
        if (this.field2427) {
            this.field2420[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class104 var15 = new class104(var10);
            int[] var16 = new int[var3];
            var15.field1815 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2130();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1815 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2130();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2425) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class109.method543(var20[var26], false);
                }
            }
        } else if (this.field2425) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class109.method543(var10, false);
        }
        return true;
    }

    @ObfuscatedName("el.f(Ljava/lang/String;B)I")
    public int method2760(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2413.method3178(class189.method2846(var2));
    }

    @ObfuscatedName("el.q(ILjava/lang/String;B)I")
    public int method2761(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2414[arg0].method3178(class189.method2846(var3));
    }

    @ObfuscatedName("el.c(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2762(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2413.method3178(class189.method2846(var3));
        int var6 = this.field2414[var5].method3178(class189.method2846(var4));
        return this.method2768(var5, var6);
    }

    @ObfuscatedName("el.h(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method2763(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2413.method3178(class189.method2846(var3));
        int var6 = this.field2414[var5].method3178(class189.method2846(var4));
        return this.method2747(var5, var6);
    }

    @ObfuscatedName("el.y(Ljava/lang/String;B)V")
    public void method2764(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2413.method3178(class189.method2846(var2));
        if (var3 >= 0) {
            this.method2744(var3);
        }
    }

    @ObfuscatedName("p.r([BI)[B")
    public static final byte[] method557(byte[] arg0) {
        class104 var1 = new class104(arg0);
        int var2 = var1.method2257();
        int var3 = var1.method2130();
        if (var3 < 0 || !(field2410 == 0 || var3 <= field2410)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2146(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2130();
            if (var5 < 0 || field2410 != 0 && var5 > field2410) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class102.method2079(var6, var5, arg0, var3, 9);
            } else {
                field2422.method2075(var1, var6);
            }
            return var6;
        }
    }
}
