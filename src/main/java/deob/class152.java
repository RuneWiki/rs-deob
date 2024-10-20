package deob;

@ObfuscatedName("ev")
public abstract class class152 {

    @ObfuscatedName("ev.t")
    public int field2515;

    @ObfuscatedName("ev.l")
    public int[] field2514;

    @ObfuscatedName("ev.c")
    public int[] field2521;

    @ObfuscatedName("ev.d")
    public class169 field2528;

    @ObfuscatedName("ev.b")
    public int[] field2517;

    @ObfuscatedName("ev.i")
    public int[] field2518;

    @ObfuscatedName("ev.p")
    public int[] field2516;

    @ObfuscatedName("ev.y")
    public int[][] field2519;

    @ObfuscatedName("ev.u")
    public int[][] field2525;

    @ObfuscatedName("ev.z")
    public class169[] field2522;

    @ObfuscatedName("ev.j")
    public Object[] field2523;

    @ObfuscatedName("ev.h")
    public Object[][] field2524;

    @ObfuscatedName("ev.x")
    public static class122 field2529 = new class122();

    @ObfuscatedName("ev.q")
    public int field2526;

    @ObfuscatedName("ev.w")
    public boolean field2527;

    @ObfuscatedName("ev.k")
    public boolean field2520;

    @ObfuscatedName("ev.o")
    public static int field2513 = 0;

    public class152(boolean arg0, boolean arg1) {
        this.field2527 = arg0;
        this.field2520 = arg1;
    }

    @ObfuscatedName("ev.t([BI)V")
    public void method2985(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class127.method247(arg0, 0, var2);
        this.field2526 = var3;
        class127 var4 = new class127(method2726(arg0));
        int var5 = var4.method2438();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2448();
        }
        int var6 = var4.method2438();
        if (var5 >= 7) {
            this.field2515 = var4.method2452();
        } else {
            this.field2515 = var4.method2440();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2514 = new int[this.field2515];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2515; var9++) {
                this.field2514[var9] = var7 += var4.method2452();
                if (this.field2514[var9] > var8) {
                    var8 = this.field2514[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2515; var10++) {
                this.field2514[var10] = var7 += var4.method2440();
                if (this.field2514[var10] > var8) {
                    var8 = this.field2514[var10];
                }
            }
        }
        this.field2517 = new int[var8 + 1];
        this.field2518 = new int[var8 + 1];
        this.field2516 = new int[var8 + 1];
        this.field2519 = new int[var8 + 1][];
        this.field2523 = new Object[var8 + 1];
        this.field2524 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2521 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2515; var11++) {
                this.field2521[this.field2514[var11]] = var4.method2448();
            }
            this.field2528 = new class169(this.field2521);
        }
        for (int var12 = 0; var12 < this.field2515; var12++) {
            this.field2517[this.field2514[var12]] = var4.method2448();
        }
        for (int var13 = 0; var13 < this.field2515; var13++) {
            this.field2518[this.field2514[var13]] = var4.method2448();
        }
        for (int var14 = 0; var14 < this.field2515; var14++) {
            this.field2516[this.field2514[var14]] = var4.method2440();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2515; var15++) {
                int var16 = this.field2514[var15];
                int var17 = this.field2516[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2519[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2519[var16][var20] = var18 += var4.method2452();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2524[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2515; var22++) {
                int var23 = this.field2514[var22];
                int var24 = this.field2516[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2519[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2519[var23][var27] = var25 += var4.method2440();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2524[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2525 = new int[var8 + 1][];
        this.field2522 = new class169[var8 + 1];
        for (int var29 = 0; var29 < this.field2515; var29++) {
            int var30 = this.field2514[var29];
            int var31 = this.field2516[var30];
            this.field2525[var30] = new int[this.field2524[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2525[var30][this.field2519[var30][var32]] = var4.method2448();
            }
            this.field2522[var30] = new class169(this.field2525[var30]);
        }
    }

    @ObfuscatedName("ev.l(IB)V")
    public void method2986(int arg0) {
    }

    @ObfuscatedName("ev.c(IIB)[B")
    public byte[] method2987(int arg0, int arg1) {
        return this.method2988(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ev.d(II[IB)[B")
    public byte[] method2988(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2524.length || this.field2524[arg0] == null || arg1 < 0 || arg1 >= this.field2524[arg0].length) {
            return null;
        }
        if (this.field2524[arg0][arg1] == null) {
            boolean var4 = this.method3001(arg0, arg2);
            if (!var4) {
                this.method3063(arg0);
                boolean var5 = this.method3001(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method137(this.field2524[arg0][arg1], false);
        if (this.field2520) {
            this.field2524[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ev.b(III)Z")
    public boolean method2989(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2524.length || this.field2524[arg0] == null || arg1 < 0 || arg1 >= this.field2524[arg0].length) {
            return false;
        } else if (this.field2524[arg0][arg1] != null) {
            return true;
        } else if (this.field2523[arg0] == null) {
            this.method3063(arg0);
            return this.field2523[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ev.i(IB)Z")
    public boolean method2990(int arg0) {
        if (this.field2523[arg0] == null) {
            this.method3063(arg0);
            return this.field2523[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ev.p(B)Z")
    public boolean method2991() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2514.length; var2++) {
            int var3 = this.field2514[var2];
            if (this.field2523[var3] == null) {
                this.method3063(var3);
                if (this.field2523[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ev.y(II)[B")
    public byte[] method3017(int arg0) {
        if (this.field2524.length == 1) {
            return this.method2987(0, arg0);
        } else if (this.field2524[arg0].length == 1) {
            return this.method2987(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ev.u(III)[B")
    public byte[] method2992(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2524.length || this.field2524[arg0] == null || arg1 < 0 || arg1 >= this.field2524[arg0].length) {
            return null;
        }
        if (this.field2524[arg0][arg1] == null) {
            boolean var3 = this.method3001(arg0, (int[]) null);
            if (!var3) {
                this.method3063(arg0);
                boolean var4 = this.method3001(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method137(this.field2524[arg0][arg1], false);
    }

    @ObfuscatedName("ev.z(II)[B")
    public byte[] method2994(int arg0) {
        if (this.field2524.length == 1) {
            return this.method2992(0, arg0);
        } else if (this.field2524[arg0].length == 1) {
            return this.method2992(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ev.j(IS)V")
    public void method3063(int arg0) {
    }

    @ObfuscatedName("ev.h(IB)[I")
    public int[] method3020(int arg0) {
        return this.field2519[arg0];
    }

    @ObfuscatedName("ev.x(II)I")
    public int method3048(int arg0) {
        return this.field2524[arg0].length;
    }

    @ObfuscatedName("ev.q(I)I")
    public int method2998() {
        return this.field2524.length;
    }

    @ObfuscatedName("ev.w(IB)V")
    public void method2999(int arg0) {
        for (int var2 = 0; var2 < this.field2524[arg0].length; var2++) {
            this.field2524[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ev.k(I)V")
    public void method3064() {
        for (int var1 = 0; var1 < this.field2524.length; var1++) {
            if (this.field2524[var1] != null) {
                for (int var2 = 0; var2 < this.field2524[var1].length; var2++) {
                    this.field2524[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ev.o(I[II)Z")
    public boolean method3001(int arg0, int[] arg1) {
        if (this.field2523[arg0] == null) {
            return false;
        }
        int var3 = this.field2516[arg0];
        int[] var4 = this.field2519[arg0];
        Object[] var5 = this.field2524[arg0];
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
            var8 = class119.method137(this.field2523[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2455(arg1, 5, var9.field2061.length);
        } else {
            var8 = class119.method137(this.field2523[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2726(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class127.method247(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class127.method247(var8, 0, var18);
            throw class80.method2681(var35, var17 + var19 + "," + this.field2517[arg0] + "," + this.field2526);
        }
        if (this.field2527) {
            this.field2523[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class127 var23 = new class127(var10);
            int[] var24 = new int[var3];
            var23.field2059 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2448();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2059 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2448();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2520) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = Statics.method126(var28[var34], false);
                }
            }
        } else if (this.field2520) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = Statics.method126(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ev.f(Ljava/lang/String;S)I")
    public int method3023(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2528.method3256(class147.method1650(var2));
    }

    @ObfuscatedName("ev.r(ILjava/lang/String;B)I")
    public int method3003(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2522[arg0].method3256(class147.method1650(var3));
    }

    @ObfuscatedName("ev.s(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3052(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2528.method3256(class147.method1650(var3));
        int var6 = this.field2522[var5].method3256(class147.method1650(var4));
        return this.method2987(var5, var6);
    }

    @ObfuscatedName("ev.g(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3045(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2528.method3256(class147.method1650(var3));
        int var6 = this.field2522[var5].method3256(class147.method1650(var4));
        return this.method2989(var5, var6);
    }

    @ObfuscatedName("ev.m(Ljava/lang/String;B)V")
    public void method3006(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2528.method3256(class147.method1650(var2));
        if (var3 >= 0) {
            this.method2986(var3);
        }
    }

    @ObfuscatedName("eq.a([BB)[B")
    public static final byte[] method2726(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2438();
        int var3 = var1.method2448();
        if (var3 < 0 || !(field2513 == 0 || var3 <= field2513)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2449(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2448();
            if (var5 < 0 || field2513 != 0 && var5 > field2513) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2381(var6, var5, arg0, var3, 9);
            } else {
                field2529.method2376(var1, var6);
            }
            return var6;
        }
    }
}
