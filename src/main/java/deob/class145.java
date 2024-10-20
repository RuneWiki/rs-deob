package deob;

@ObfuscatedName("ec")
public abstract class class145 {

    @ObfuscatedName("ec.e")
    public int field2444;

    @ObfuscatedName("ec.p")
    public int[] field2435;

    @ObfuscatedName("ec.a")
    public int[] field2445;

    @ObfuscatedName("ec.g")
    public class169 field2437;

    @ObfuscatedName("ec.u")
    public int[] field2438;

    @ObfuscatedName("ec.k")
    public int[] field2439;

    @ObfuscatedName("ec.m")
    public int[] field2440;

    @ObfuscatedName("ec.t")
    public int[][] field2449;

    @ObfuscatedName("ec.l")
    public int[][] field2442;

    @ObfuscatedName("ec.f")
    public class169[] field2443;

    @ObfuscatedName("ec.c")
    public Object[] field2436;

    @ObfuscatedName("ec.i")
    public Object[][] field2451;

    @ObfuscatedName("ec.o")
    public static class104 field2446 = new class104();

    @ObfuscatedName("ec.d")
    public int field2447;

    @ObfuscatedName("ec.b")
    public boolean field2448;

    @ObfuscatedName("ec.v")
    public boolean field2441;

    @ObfuscatedName("ec.n")
    public static int field2450 = 0;

    public class145(boolean arg0, boolean arg1) {
        this.field2448 = arg0;
        this.field2441 = arg1;
    }

    @ObfuscatedName("ec.e([BI)V")
    public void method2715(byte[] arg0) {
        this.field2447 = class107.method535(arg0, arg0.length);
        class107 var2 = new class107(method28(arg0));
        int var3 = var2.method2125();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2146();
        }
        int var4 = var2.method2125();
        if (var3 >= 7) {
            this.field2444 = var2.method2155();
        } else {
            this.field2444 = var2.method2182();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2435 = new int[this.field2444];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2444; var7++) {
                this.field2435[var7] = var5 += var2.method2155();
                if (this.field2435[var7] > var6) {
                    var6 = this.field2435[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2444; var8++) {
                this.field2435[var8] = var5 += var2.method2182();
                if (this.field2435[var8] > var6) {
                    var6 = this.field2435[var8];
                }
            }
        }
        this.field2438 = new int[var6 + 1];
        this.field2439 = new int[var6 + 1];
        this.field2440 = new int[var6 + 1];
        this.field2449 = new int[var6 + 1][];
        this.field2436 = new Object[var6 + 1];
        this.field2451 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2445 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2444; var9++) {
                this.field2445[this.field2435[var9]] = var2.method2146();
            }
            this.field2437 = new class169(this.field2445);
        }
        for (int var10 = 0; var10 < this.field2444; var10++) {
            this.field2438[this.field2435[var10]] = var2.method2146();
        }
        for (int var11 = 0; var11 < this.field2444; var11++) {
            this.field2439[this.field2435[var11]] = var2.method2146();
        }
        for (int var12 = 0; var12 < this.field2444; var12++) {
            this.field2440[this.field2435[var12]] = var2.method2182();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2444; var13++) {
                int var14 = this.field2435[var13];
                int var15 = this.field2440[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2449[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2449[var14][var18] = var16 += var2.method2155();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2451[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2444; var20++) {
                int var21 = this.field2435[var20];
                int var22 = this.field2440[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2449[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2449[var21][var25] = var23 += var2.method2182();
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
        this.field2442 = new int[var6 + 1][];
        this.field2443 = new class169[var6 + 1];
        for (int var27 = 0; var27 < this.field2444; var27++) {
            int var28 = this.field2435[var27];
            int var29 = this.field2440[var28];
            this.field2442[var28] = new int[this.field2451[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2442[var28][this.field2449[var28][var30]] = var2.method2146();
            }
            this.field2443[var28] = new class169(this.field2442[var28]);
        }
    }

    @ObfuscatedName("ec.p(II)V")
    public void method2739(int arg0) {
    }

    @ObfuscatedName("ec.a(III)[B")
    public byte[] method2717(int arg0, int arg1) {
        return this.method2718(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ec.g(II[II)[B")
    public byte[] method2718(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2451.length || this.field2451[arg0] == null || arg1 < 0 || arg1 >= this.field2451[arg0].length) {
            return null;
        }
        if (this.field2451[arg0][arg1] == null) {
            boolean var4 = this.method2730(arg0, arg2);
            if (!var4) {
                this.method2724(arg0);
                boolean var5 = this.method2730(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class112.method578(this.field2451[arg0][arg1], false);
        if (this.field2441) {
            this.field2451[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ec.u(III)Z")
    public boolean method2719(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2451.length || this.field2451[arg0] == null || arg1 < 0 || arg1 >= this.field2451[arg0].length) {
            return false;
        } else if (this.field2451[arg0][arg1] != null) {
            return true;
        } else if (this.field2436[arg0] == null) {
            this.method2724(arg0);
            return this.field2436[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ec.k(IB)Z")
    public boolean method2720(int arg0) {
        if (this.field2436[arg0] == null) {
            this.method2724(arg0);
            return this.field2436[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ec.m(I)Z")
    public boolean method2721() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2435.length; var2++) {
            int var3 = this.field2435[var2];
            if (this.field2436[var3] == null) {
                this.method2724(var3);
                if (this.field2436[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ec.t(II)[B")
    public byte[] method2770(int arg0) {
        if (this.field2451.length == 1) {
            return this.method2717(0, arg0);
        } else if (this.field2451[arg0].length == 1) {
            return this.method2717(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ec.l(III)[B")
    public byte[] method2723(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2451.length || this.field2451[arg0] == null || arg1 < 0 || arg1 >= this.field2451[arg0].length) {
            return null;
        }
        if (this.field2451[arg0][arg1] == null) {
            boolean var3 = this.method2730(arg0, (int[]) null);
            if (!var3) {
                this.method2724(arg0);
                boolean var4 = this.method2730(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class112.method578(this.field2451[arg0][arg1], false);
    }

    @ObfuscatedName("ec.f(IB)[B")
    public byte[] method2746(int arg0) {
        if (this.field2451.length == 1) {
            return this.method2723(0, arg0);
        } else if (this.field2451[arg0].length == 1) {
            return this.method2723(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ec.c(II)V")
    public void method2724(int arg0) {
    }

    @ObfuscatedName("ec.i(II)[I")
    public int[] method2737(int arg0) {
        return this.field2449[arg0];
    }

    @ObfuscatedName("ec.o(II)I")
    public int method2726(int arg0) {
        return this.field2451[arg0].length;
    }

    @ObfuscatedName("ec.d(I)I")
    public int method2727() {
        return this.field2451.length;
    }

    @ObfuscatedName("ec.b(II)V")
    public void method2728(int arg0) {
        for (int var2 = 0; var2 < this.field2451[arg0].length; var2++) {
            this.field2451[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ec.v(I)V")
    public void method2729() {
        for (int var1 = 0; var1 < this.field2451.length; var1++) {
            if (this.field2451[var1] != null) {
                for (int var2 = 0; var2 < this.field2451[var1].length; var2++) {
                    this.field2451[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ec.n(I[II)Z")
    public boolean method2730(int arg0, int[] arg1) {
        if (this.field2436[arg0] == null) {
            return false;
        }
        int var3 = this.field2440[arg0];
        int[] var4 = this.field2449[arg0];
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
            var8 = class112.method578(this.field2436[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2271(arg1, 5, var9.field1845.length);
        } else {
            var8 = class112.method578(this.field2436[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method28(var8);
        } catch (RuntimeException var27) {
            throw class135.method1346(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class107.method535(var8, var8.length) + "," + class107.method535(var8, var8.length - 2) + "," + this.field2438[arg0] + "," + this.field2447);
        }
        if (this.field2448) {
            this.field2436[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class107 var15 = new class107(var10);
            int[] var16 = new int[var3];
            var15.field1841 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2146();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1841 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2146();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2441) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class112.method1970(var20[var26], false);
                }
            }
        } else if (this.field2441) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method1970(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ec.w(Ljava/lang/String;I)I")
    public int method2781(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2437.method3157(class196.method3152(var2));
    }

    @ObfuscatedName("ec.z(ILjava/lang/String;I)I")
    public int method2732(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2443[arg0].method3157(class196.method3152(var3));
    }

    @ObfuscatedName("ec.x(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method2772(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2437.method3157(class196.method3152(var3));
        int var6 = this.field2443[var5].method3157(class196.method3152(var4));
        return this.method2717(var5, var6);
    }

    @ObfuscatedName("ec.q(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method2757(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2437.method3157(class196.method3152(var3));
        int var6 = this.field2443[var5].method3157(class196.method3152(var4));
        return this.method2719(var5, var6);
    }

    @ObfuscatedName("ec.s(Ljava/lang/String;I)V")
    public void method2786(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2437.method3157(class196.method3152(var2));
        if (var3 >= 0) {
            this.method2739(var3);
        }
    }

    @ObfuscatedName("g.j([BI)[B")
    public static final byte[] method28(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2125();
        int var3 = var1.method2146();
        if (var3 < 0 || !(field2450 == 0 || var3 <= field2450)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2321(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2146();
            if (var5 < 0 || field2450 != 0 && var5 > field2450) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2115(var6, var5, arg0, var3, 9);
            } else {
                field2446.method2085(var1, var6);
            }
            return var6;
        }
    }
}
