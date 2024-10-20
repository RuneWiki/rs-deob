package deob;

@ObfuscatedName("hs")
public class class202 extends class481 {

    @ObfuscatedName("hs.at")
    public static boolean field2108 = false;

    @ObfuscatedName("hs.ao")
    public static class299 field2099 = new class299(4096);

    @ObfuscatedName("hs.ab")
    public static class299 field2080 = new class299(500);

    @ObfuscatedName("hs.au")
    public static class299 field2078 = new class299(30);

    @ObfuscatedName("hs.aa")
    public static class299 field2090 = new class299(30);

    @ObfuscatedName("hs.ac")
    public static class262[] field2081 = new class262[4];

    @ObfuscatedName("hs.al")
    public int field2088;

    @ObfuscatedName("hs.az")
    public int[] field2084;

    @ObfuscatedName("hs.ap")
    public int[] field2085;

    @ObfuscatedName("hs.av")
    public String field2086 = class364.field4153;

    @ObfuscatedName("hs.ax")
    public short[] field2087;

    @ObfuscatedName("hs.as")
    public short[] field2123;

    @ObfuscatedName("hs.ay")
    public short[] field2089;

    @ObfuscatedName("hs.ak")
    public short[] field2082;

    @ObfuscatedName("hs.aj")
    public int field2091 = 1;

    @ObfuscatedName("hs.am")
    public int field2100 = 1;

    @ObfuscatedName("hs.aq")
    public int field2092 = 2;

    @ObfuscatedName("hs.ai")
    public boolean field2094 = true;

    @ObfuscatedName("hs.aw")
    public int field2095 = -1;

    @ObfuscatedName("hs.ae")
    public int field2096 = -1;

    @ObfuscatedName("hs.an")
    public boolean field2097 = false;

    @ObfuscatedName("hs.ag")
    public boolean field2098 = false;

    @ObfuscatedName("hs.ad")
    public int field2083 = -1;

    @ObfuscatedName("hs.af")
    public int field2093 = 16;

    @ObfuscatedName("hs.be")
    public int field2101 = 0;

    @ObfuscatedName("hs.bd")
    public int field2102 = 0;

    @ObfuscatedName("hs.bl")
    public String[] field2103 = new String[5];

    @ObfuscatedName("hs.bi")
    public int field2104 = -1;

    @ObfuscatedName("hs.bv")
    public int field2105 = -1;

    @ObfuscatedName("hs.bf")
    public boolean field2106 = false;

    @ObfuscatedName("hs.bg")
    public boolean field2116 = true;

    @ObfuscatedName("hs.ba")
    public int field2115 = 128;

    @ObfuscatedName("hs.bm")
    public int field2109 = 128;

    @ObfuscatedName("hs.bp")
    public int field2110 = 128;

    @ObfuscatedName("hs.bw")
    public int field2111 = 0;

    @ObfuscatedName("hs.bj")
    public int field2112 = 0;

    @ObfuscatedName("hs.bn")
    public int field2113 = 0;

    @ObfuscatedName("hs.bo")
    public boolean field2075 = false;

    @ObfuscatedName("hs.bt")
    public boolean field2079 = false;

    @ObfuscatedName("hs.bu")
    public int field2076 = -1;

    @ObfuscatedName("hs.by")
    public int[] field2114;

    @ObfuscatedName("hs.bh")
    public int field2118 = -1;

    @ObfuscatedName("hs.bz")
    public int field2119 = -1;

    @ObfuscatedName("hs.bc")
    public int field2120 = -1;

    @ObfuscatedName("hs.bs")
    public int field2121 = 0;

    @ObfuscatedName("hs.bx")
    public int field2122 = 0;

    @ObfuscatedName("hs.bb")
    public int field2117 = 0;

    @ObfuscatedName("hs.bk")
    public int[] field2124;

    @ObfuscatedName("hs.br")
    public boolean field2125 = true;

    @ObfuscatedName("hs.bq")
    public class500 field2126;

    @ObfuscatedName("pv.at(Lol;Lol;ZI)V")
    public static void method6968(class371 arg0, class371 arg1, boolean arg2) {
        Statics.field2107 = arg0;
        Statics.field2077 = arg1;
        field2108 = arg2;
    }

    @ObfuscatedName("hs.ar(S)V")
    public void method3575() {
        if (this.field2095 == -1) {
            this.field2095 = 0;
            if (this.field2084 != null && (this.field2085 == null || this.field2085[0] == 10)) {
                this.field2095 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2103[var1] != null) {
                    this.field2095 = 1;
                }
            }
        }
        if (this.field2076 == -1) {
            this.field2076 = this.field2092 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("hs.ao(Luj;B)V")
    public void method3576(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method3596(arg0, var2);
        }
    }

    @ObfuscatedName("hs.ab(Luj;II)V")
    public void method3596(class527 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8410();
            if (var3 > 0) {
                if (this.field2084 == null || field2108) {
                    this.field2085 = new int[var3];
                    this.field2084 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2084[var4] = arg0.method8412();
                        this.field2085[var4] = arg0.method8410();
                    }
                } else {
                    arg0.field5137 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2086 = arg0.method8535();
        } else if (arg1 == 5) {
            int var5 = arg0.method8410();
            if (var5 > 0) {
                if (this.field2084 == null || field2108) {
                    this.field2085 = null;
                    this.field2084 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2084[var6] = arg0.method8412();
                    }
                } else {
                    arg0.field5137 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2091 = arg0.method8410();
        } else if (arg1 == 15) {
            this.field2100 = arg0.method8410();
        } else if (arg1 == 17) {
            this.field2092 = 0;
            this.field2094 = false;
        } else if (arg1 == 18) {
            this.field2094 = false;
        } else if (arg1 == 19) {
            this.field2095 = arg0.method8410();
        } else if (arg1 == 21) {
            this.field2096 = 0;
        } else if (arg1 == 22) {
            this.field2097 = true;
        } else if (arg1 == 23) {
            this.field2098 = true;
        } else if (arg1 == 24) {
            this.field2083 = arg0.method8412();
            if (this.field2083 == 65535) {
                this.field2083 = -1;
            }
        } else if (arg1 == 27) {
            this.field2092 = 1;
        } else if (arg1 == 28) {
            this.field2093 = arg0.method8410();
        } else if (arg1 == 29) {
            this.field2101 = arg0.method8616();
        } else if (arg1 == 39) {
            this.field2102 = arg0.method8616() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2103[arg1 - 30] = arg0.method8535();
            if (this.field2103[arg1 - 30].equalsIgnoreCase(class364.field4155)) {
                this.field2103[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method8410();
            this.field2087 = new short[var7];
            this.field2123 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2087[var8] = (short) arg0.method8412();
                this.field2123[var8] = (short) arg0.method8412();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method8410();
            this.field2089 = new short[var9];
            this.field2082 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2089[var10] = (short) arg0.method8412();
                this.field2082[var10] = (short) arg0.method8412();
            }
        } else if (arg1 == 61) {
            arg0.method8412();
        } else if (arg1 == 62) {
            this.field2106 = true;
        } else if (arg1 == 64) {
            this.field2116 = false;
        } else if (arg1 == 65) {
            this.field2115 = arg0.method8412();
        } else if (arg1 == 66) {
            this.field2109 = arg0.method8412();
        } else if (arg1 == 67) {
            this.field2110 = arg0.method8412();
        } else if (arg1 == 68) {
            this.field2105 = arg0.method8412();
        } else if (arg1 == 69) {
            arg0.method8410();
        } else if (arg1 == 70) {
            this.field2111 = arg0.method8508();
        } else if (arg1 == 71) {
            this.field2112 = arg0.method8508();
        } else if (arg1 == 72) {
            this.field2113 = arg0.method8508();
        } else if (arg1 == 73) {
            this.field2075 = true;
        } else if (arg1 == 74) {
            this.field2079 = true;
        } else if (arg1 == 75) {
            this.field2076 = arg0.method8410();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2118 = arg0.method8412();
            if (this.field2118 == 65535) {
                this.field2118 = -1;
            }
            this.field2119 = arg0.method8412();
            if (this.field2119 == 65535) {
                this.field2119 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method8412();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method8410();
            this.field2114 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2114[var15] = arg0.method8412();
                if (this.field2114[var15] == 65535) {
                    this.field2114[var15] = -1;
                }
            }
            this.field2114[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2120 = arg0.method8412();
            this.field2121 = arg0.method8410();
        } else if (arg1 == 79) {
            this.field2122 = arg0.method8412();
            this.field2117 = arg0.method8412();
            this.field2121 = arg0.method8410();
            int var11 = arg0.method8410();
            this.field2124 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2124[var12] = arg0.method8412();
            }
        } else if (arg1 == 81) {
            this.field2096 = arg0.method8410() * 256;
        } else if (arg1 == 82) {
            this.field2104 = arg0.method8412();
        } else if (arg1 == 89) {
            this.field2125 = false;
        } else if (arg1 == 249) {
            this.field2126 = class182.method3052(arg0, this.field2126);
        }
    }

    @ObfuscatedName("hs.au(II)Z")
    public final boolean method3577(int arg0) {
        if (this.field2085 != null) {
            for (int var4 = 0; var4 < this.field2085.length; var4++) {
                if (this.field2085[var4] == arg0) {
                    return Statics.field2077.method6308(this.field2084[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2084 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2084.length; var3++) {
                var2 &= Statics.field2077.method6308(this.field2084[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hs.aa(B)Z")
    public final boolean method3578() {
        if (this.field2084 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2084.length; var2++) {
            var1 &= Statics.field2077.method6308(this.field2084[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("hs.ac(II[[IIIII)Lkt;")
    public final class273 method3579(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2085 == null) {
            var7 = (long) ((this.field2088 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2088 << 10) + (arg0 << 3) + arg1);
        }
        class273 var9 = (class273) field2078.method5289(var7);
        if (var9 == null) {
            class262 var10 = this.method3582(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2097) {
                var10.field2690 = (short) (this.field2101 + 64);
                var10.field2696 = (short) (this.field2102 + 768);
                var10.method4597();
                var9 = var10;
            } else {
                var9 = var10.method4593(this.field2101 + 64, this.field2102 + 768, -50, -10, -50);
            }
            field2078.method5303(var9, var7);
        }
        if (this.field2097) {
            var9 = ((class262) var9).method4633();
        }
        if (this.field2096 >= 0) {
            if (var9 instanceof class280) {
                var9 = ((class280) var9).method5028(arg2, arg3, arg4, arg5, true, this.field2096);
            } else if (var9 instanceof class262) {
                var9 = ((class262) var9).method4578(arg2, arg3, arg4, arg5, true, this.field2096);
            }
        }
        return var9;
    }

    @ObfuscatedName("hs.al(II[[IIIII)Lka;")
    public final class280 method3580(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2085 == null) {
            var7 = (long) ((this.field2088 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2088 << 10) + (arg0 << 3) + arg1);
        }
        class280 var9 = (class280) field2090.method5289(var7);
        if (var9 == null) {
            class262 var10 = this.method3582(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4593(this.field2101 + 64, this.field2102 + 768, -50, -10, -50);
            field2090.method5303(var9, var7);
        }
        if (this.field2096 >= 0) {
            var9 = var9.method5028(arg2, arg3, arg4, arg5, true, this.field2096);
        }
        return var9;
    }

    @ObfuscatedName("hs.az(II[[IIIILhx;IB)Lka;")
    public final class280 method3581(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class205 arg6, int arg7) {
        long var9;
        if (this.field2085 == null) {
            var9 = (long) ((this.field2088 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2088 << 10) + (arg0 << 3) + arg1);
        }
        class280 var11 = (class280) field2090.method5289(var9);
        if (var11 == null) {
            class262 var12 = this.method3582(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method4593(this.field2101 + 64, this.field2102 + 768, -50, -10, -50);
            field2090.method5303(var11, var9);
        }
        if (arg6 == null && this.field2096 == -1) {
            return var11;
        }
        class280 var13;
        if (arg6 == null) {
            var13 = var11.method5029(true);
        } else {
            var13 = arg6.method3729(var11, arg7, arg1);
        }
        if (this.field2096 >= 0) {
            var13 = var13.method5028(arg2, arg3, arg4, arg5, false, this.field2096);
        }
        return var13;
    }

    @ObfuscatedName("hs.ap(III)Lkq;")
    public final class262 method3582(int arg0, int arg1) {
        class262 var3 = null;
        if (this.field2085 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2084 == null) {
                return null;
            }
            boolean var4 = this.field2106;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2084.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2084[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class262) field2080.method5289((long) var7);
                if (var3 == null) {
                    var3 = class262.method4571(Statics.field2077, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method4638();
                    }
                    field2080.method5303(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2081[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class262(field2081, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2085.length; var9++) {
                if (this.field2085[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2084[var8];
            boolean var11 = this.field2106 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class262) field2080.method5289((long) var10);
            if (var3 == null) {
                var3 = class262.method4571(Statics.field2077, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method4638();
                }
                field2080.method5303(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2115 == 128 && this.field2109 == 128 && this.field2110 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2111 == 0 && this.field2112 == 0 && this.field2113 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class262 var14 = new class262(var3, arg1 == 0 && !var12 && !var13, this.field2087 == null, this.field2089 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method4646(256);
            var14.method4584(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method4580();
        } else if (var15 == 2) {
            var14.method4591();
        } else if (var15 == 3) {
            var14.method4582();
        }
        if (this.field2087 != null) {
            for (int var16 = 0; var16 < this.field2087.length; var16++) {
                var14.method4585(this.field2087[var16], this.field2123[var16]);
            }
        }
        if (this.field2089 != null) {
            for (int var17 = 0; var17 < this.field2089.length; var17++) {
                var14.method4641(this.field2089[var17], this.field2082[var17]);
            }
        }
        if (var12) {
            var14.method4588(this.field2115, this.field2109, this.field2110);
        }
        if (var13) {
            var14.method4584(this.field2111, this.field2112, this.field2113);
        }
        return var14;
    }

    @ObfuscatedName("hs.av(I)Lhs;")
    public final class202 method3592() {
        int var1 = -1;
        if (this.field2118 != -1) {
            var1 = class333.method2521(this.field2118);
        } else if (this.field2119 != -1) {
            var1 = class333.field3554[this.field2119];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2114.length - 1) {
            var2 = this.field2114[var1];
        } else {
            var2 = this.field2114[this.field2114.length - 1];
        }
        return var2 == -1 ? null : Statics.method4138(var2);
    }

    @ObfuscatedName("hs.ax(III)I")
    public int method3584(int arg0, int arg1) {
        return class182.method2319(this.field2126, arg0, arg1);
    }

    @ObfuscatedName("hs.as(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3574(int arg0, String arg1) {
        class500 var3 = this.field2126;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class482 var5 = (class482) var3.method8134((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4845;
            }
        }
        return var4;
    }

    @ObfuscatedName("kz.ay(I)V")
    public static void method4746() {
        field2099.method5292();
        field2080.method5292();
        field2078.method5292();
        field2090.method5292();
    }

    @ObfuscatedName("hs.ak(B)Z")
    public boolean method3586() {
        if (this.field2114 == null) {
            return this.field2120 != -1 || this.field2124 != null;
        }
        for (int var1 = 0; var1 < this.field2114.length; var1++) {
            if (this.field2114[var1] != -1) {
                class202 var2 = Statics.method4138(this.field2114[var1]);
                if (var2.field2120 != -1 || var2.field2124 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
