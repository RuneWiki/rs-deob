package deob;

@ObfuscatedName("er")
public abstract class class146 {

    @ObfuscatedName("er.z")
    public int field2443;

    @ObfuscatedName("er.j")
    public int[] field2439;

    @ObfuscatedName("er.a")
    public int[] field2440;

    @ObfuscatedName("er.y")
    public class170 field2441;

    @ObfuscatedName("er.i")
    public int[] field2442;

    @ObfuscatedName("er.b")
    public int[] field2449;

    @ObfuscatedName("er.s")
    public int[] field2444;

    @ObfuscatedName("er.q")
    public int[][] field2445;

    @ObfuscatedName("er.p")
    public int[][] field2453;

    @ObfuscatedName("er.h")
    public class170[] field2447;

    @ObfuscatedName("er.r")
    public Object[] field2448;

    @ObfuscatedName("er.o")
    public Object[][] field2451;

    @ObfuscatedName("er.f")
    public static class104 field2450 = new class104();

    @ObfuscatedName("er.u")
    public int field2446;

    @ObfuscatedName("er.c")
    public boolean field2452;

    @ObfuscatedName("er.l")
    public boolean field2454;

    @ObfuscatedName("er.w")
    public static int field2438 = 0;

    public class146(boolean arg0, boolean arg1) {
        this.field2452 = arg0;
        this.field2454 = arg1;
    }

    @ObfuscatedName("er.z([BI)V")
    public void method2703(byte[] arg0) {
        this.field2446 = class107.method1872(arg0, arg0.length);
        class107 var2 = new class107(method87(arg0));
        int var3 = var2.method2122();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2127();
        }
        int var4 = var2.method2122();
        if (var3 >= 7) {
            this.field2443 = var2.method2136();
        } else {
            this.field2443 = var2.method2239();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2439 = new int[this.field2443];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2443; var7++) {
                this.field2439[var7] = var5 += var2.method2136();
                if (this.field2439[var7] > var6) {
                    var6 = this.field2439[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2443; var8++) {
                this.field2439[var8] = var5 += var2.method2239();
                if (this.field2439[var8] > var6) {
                    var6 = this.field2439[var8];
                }
            }
        }
        this.field2442 = new int[var6 + 1];
        this.field2449 = new int[var6 + 1];
        this.field2444 = new int[var6 + 1];
        this.field2445 = new int[var6 + 1][];
        this.field2448 = new Object[var6 + 1];
        this.field2451 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2440 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2443; var9++) {
                this.field2440[this.field2439[var9]] = var2.method2127();
            }
            this.field2441 = new class170(this.field2440);
        }
        for (int var10 = 0; var10 < this.field2443; var10++) {
            this.field2442[this.field2439[var10]] = var2.method2127();
        }
        for (int var11 = 0; var11 < this.field2443; var11++) {
            this.field2449[this.field2439[var11]] = var2.method2127();
        }
        for (int var12 = 0; var12 < this.field2443; var12++) {
            this.field2444[this.field2439[var12]] = var2.method2239();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2443; var13++) {
                int var14 = this.field2439[var13];
                int var15 = this.field2444[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2445[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2445[var14][var18] = var16 += var2.method2136();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2451[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2443; var20++) {
                int var21 = this.field2439[var20];
                int var22 = this.field2444[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2445[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2445[var21][var25] = var23 += var2.method2239();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2451[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2453 = new int[var6 + 1][];
        this.field2447 = new class170[var6 + 1];
        for (int var27 = 0; var27 < this.field2443; var27++) {
            int var28 = this.field2439[var27];
            int var29 = this.field2444[var28];
            this.field2453[var28] = new int[this.field2451[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2453[var28][this.field2445[var28][var30]] = var2.method2127();
            }
            this.field2447[var28] = new class170(this.field2453[var28]);
        }
    }

    @ObfuscatedName("er.j(II)V")
    public void method2704(int arg0) {
    }

    @ObfuscatedName("er.a(III)[B")
    public byte[] method2705(int arg0, int arg1) {
        return this.method2734(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("er.y(II[IS)[B")
    public byte[] method2734(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2451.length || this.field2451[arg0] == null || arg1 < 0 || arg1 >= this.field2451[arg0].length) {
            return null;
        }
        if (this.field2451[arg0][arg1] == null) {
            boolean var4 = this.method2784(arg0, arg2);
            if (!var4) {
                this.method2713(arg0);
                boolean var5 = this.method2784(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class112.method1965(this.field2451[arg0][arg1], false);
        if (this.field2454) {
            this.field2451[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("er.i(IIS)Z")
    public boolean method2772(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2451.length || this.field2451[arg0] == null || arg1 < 0 || arg1 >= this.field2451[arg0].length) {
            return false;
        } else if (this.field2451[arg0][arg1] != null) {
            return true;
        } else if (this.field2448[arg0] == null) {
            this.method2713(arg0);
            return this.field2448[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("er.b(II)Z")
    public boolean method2708(int arg0) {
        if (this.field2448[arg0] == null) {
            this.method2713(arg0);
            return this.field2448[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("er.s(I)Z")
    public boolean method2709() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2439.length; var2++) {
            int var3 = this.field2439[var2];
            if (this.field2448[var3] == null) {
                this.method2713(var3);
                if (this.field2448[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("er.q(IS)[B")
    public byte[] method2710(int arg0) {
        if (this.field2451.length == 1) {
            return this.method2705(0, arg0);
        } else if (this.field2451[arg0].length == 1) {
            return this.method2705(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("er.p(III)[B")
    public byte[] method2739(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2451.length || this.field2451[arg0] == null || arg1 < 0 || arg1 >= this.field2451[arg0].length) {
            return null;
        }
        if (this.field2451[arg0][arg1] == null) {
            boolean var3 = this.method2784(arg0, (int[]) null);
            if (!var3) {
                this.method2713(arg0);
                boolean var4 = this.method2784(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class112.method1965(this.field2451[arg0][arg1], false);
    }

    @ObfuscatedName("er.h(II)[B")
    public byte[] method2714(int arg0) {
        if (this.field2451.length == 1) {
            return this.method2739(0, arg0);
        } else if (this.field2451[arg0].length == 1) {
            return this.method2739(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("er.r(II)V")
    public void method2713(int arg0) {
    }

    @ObfuscatedName("er.o(II)[I")
    public int[] method2720(int arg0) {
        return this.field2445[arg0];
    }

    @ObfuscatedName("er.f(IB)I")
    public int method2738(int arg0) {
        return this.field2451[arg0].length;
    }

    @ObfuscatedName("er.u(I)I")
    public int method2716() {
        return this.field2451.length;
    }

    @ObfuscatedName("er.c(II)V")
    public void method2786(int arg0) {
        for (int var2 = 0; var2 < this.field2451[arg0].length; var2++) {
            this.field2451[arg0][var2] = null;
        }
    }

    @ObfuscatedName("er.l(I)V")
    public void method2718() {
        for (int var1 = 0; var1 < this.field2451.length; var1++) {
            if (this.field2451[var1] != null) {
                for (int var2 = 0; var2 < this.field2451[var1].length; var2++) {
                    this.field2451[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("er.w(I[II)Z")
    public boolean method2784(int arg0, int[] arg1) {
        if (this.field2448[arg0] == null) {
            return false;
        }
        int var3 = this.field2444[arg0];
        int[] var4 = this.field2445[arg0];
        Object[] var5 = this.field2451[arg0];
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
            var8 = class112.method1965(this.field2448[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2139(arg1, 5, var9.field1823.length);
        } else {
            var8 = class112.method1965(this.field2448[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method87(var8);
        } catch (RuntimeException var27) {
            throw class135.method2072(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class107.method1872(var8, var8.length) + "," + class107.method1872(var8, var8.length - 2) + "," + this.field2442[arg0] + "," + this.field2446);
        }
        if (this.field2452) {
            this.field2448[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class107 var15 = new class107(var10);
            int[] var16 = new int[var3];
            var15.field1819 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2127();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1819 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2127();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2454) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class112.method626(var20[var26], false);
                }
            }
        } else if (this.field2454) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method626(var10, false);
        }
        return true;
    }

    @ObfuscatedName("er.x(Ljava/lang/String;S)I")
    public int method2707(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2441.method3161(class197.method884(var2));
    }

    @ObfuscatedName("er.t(ILjava/lang/String;I)I")
    public int method2721(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2447[arg0].method3161(class197.method884(var3));
    }

    @ObfuscatedName("er.k(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2722(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2441.method3161(class197.method884(var3));
        int var6 = this.field2447[var5].method3161(class197.method884(var4));
        return this.method2705(var5, var6);
    }

    @ObfuscatedName("er.e(Ljava/lang/String;Ljava/lang/String;S)Z")
    public boolean method2723(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2441.method3161(class197.method884(var3));
        int var6 = this.field2447[var5].method3161(class197.method884(var4));
        return this.method2772(var5, var6);
    }

    @ObfuscatedName("er.v(Ljava/lang/String;B)Z")
    public boolean method2711(String arg0) {
        int var2 = this.method2707("");
        return var2 == -1 ? this.method2723(arg0, "") : this.method2723("", arg0);
    }

    @ObfuscatedName("er.n(Ljava/lang/String;I)V")
    public void method2725(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2441.method3161(class197.method884(var2));
        if (var3 >= 0) {
            this.method2704(var3);
        }
    }

    @ObfuscatedName("p.d([BB)[B")
    public static final byte[] method87(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2122();
        int var3 = var1.method2127();
        if (var3 < 0 || !(field2438 == 0 || var3 <= field2438)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2133(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2127();
            if (var5 < 0 || field2438 != 0 && var5 > field2438) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2079(var6, var5, arg0, var3, 9);
            } else {
                field2450.method2074(var1, var6);
            }
            return var6;
        }
    }
}
