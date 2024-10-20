package deob;

@ObfuscatedName("hw")
public class class196 extends class469 {

    @ObfuscatedName("hw.at")
    public static class288 field2034 = new class288(64);

    @ObfuscatedName("hw.ac")
    public static class288 field2040 = new class288(50);

    @ObfuscatedName("hw.ai")
    public int field2036;

    @ObfuscatedName("hw.az")
    public String field2037 = class352.field4223;

    @ObfuscatedName("hw.ap")
    public int field2038 = 1;

    @ObfuscatedName("hw.aa")
    public int[] field2056;

    @ObfuscatedName("hw.af")
    public int[] field2039;

    @ObfuscatedName("hw.ad")
    public int field2041 = -1;

    @ObfuscatedName("hw.aq")
    public int field2042 = -1;

    @ObfuscatedName("hw.al")
    public int field2043 = -1;

    @ObfuscatedName("hw.an")
    public int field2059 = -1;

    @ObfuscatedName("hw.ar")
    public int field2045 = -1;

    @ObfuscatedName("hw.ab")
    public int field2046 = -1;

    @ObfuscatedName("hw.ag")
    public int field2047 = -1;

    @ObfuscatedName("hw.am")
    public int field2048 = -1;

    @ObfuscatedName("hw.ax")
    public int field2049 = -1;

    @ObfuscatedName("hw.ah")
    public int field2050 = -1;

    @ObfuscatedName("hw.as")
    public int field2076 = -1;

    @ObfuscatedName("hw.ay")
    public int field2044 = -1;

    @ObfuscatedName("hw.aj")
    public int field2053 = -1;

    @ObfuscatedName("hw.av")
    public int field2060 = -1;

    @ObfuscatedName("hw.aw")
    public int field2077 = -1;

    @ObfuscatedName("hw.ak")
    public short[] field2078;

    @ObfuscatedName("hw.bh")
    public short[] field2057;

    @ObfuscatedName("hw.bj")
    public short[] field2058;

    @ObfuscatedName("hw.bk")
    public short[] field2052;

    @ObfuscatedName("hw.bv")
    public String[] field2035 = new String[5];

    @ObfuscatedName("hw.bt")
    public boolean field2061 = true;

    @ObfuscatedName("hw.bd")
    public int field2062 = -1;

    @ObfuscatedName("hw.by")
    public int field2063 = 128;

    @ObfuscatedName("hw.bs")
    public int field2055 = 128;

    @ObfuscatedName("hw.bm")
    public boolean field2065 = false;

    @ObfuscatedName("hw.bf")
    public int field2064 = 0;

    @ObfuscatedName("hw.bq")
    public int field2067 = 0;

    @ObfuscatedName("hw.ba")
    public int field2068 = 32;

    @ObfuscatedName("hw.bl")
    public int[] field2066;

    @ObfuscatedName("hw.bp")
    public int field2070 = -1;

    @ObfuscatedName("hw.bu")
    public int field2071 = -1;

    @ObfuscatedName("hw.bo")
    public boolean field2072 = true;

    @ObfuscatedName("hw.bb")
    public boolean field2031 = true;

    @ObfuscatedName("hw.br")
    public boolean field2074 = false;

    @ObfuscatedName("hw.be")
    public int[] field2075 = null;

    @ObfuscatedName("hw.bi")
    public short[] field2073 = null;

    @ObfuscatedName("hw.bz")
    public class488 field2051;

    @ObfuscatedName("dk.au(IB)Lhw;")
    public static class196 method2202(int arg0) {
        class196 var1 = (class196) field2034.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2032.method6128(9, arg0);
        class196 var3 = new class196();
        var3.field2036 = arg0;
        if (var2 != null) {
            var3.method3405(new class515(var2));
        }
        var3.method3404();
        field2034.method5177(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hw.ae(I)V")
    public void method3404() {
    }

    @ObfuscatedName("hw.ao(Ltm;B)V")
    public void method3405(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method3406(arg0, var2);
        }
    }

    @ObfuscatedName("hw.at(Ltm;II)V")
    public void method3406(class515 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8300();
            this.field2056 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2056[var4] = arg0.method8448();
            }
        } else if (arg1 == 2) {
            this.field2037 = arg0.method8311();
        } else if (arg1 == 12) {
            this.field2038 = arg0.method8300();
        } else if (arg1 == 13) {
            this.field2041 = arg0.method8448();
        } else if (arg1 == 14) {
            this.field2059 = arg0.method8448();
        } else if (arg1 == 15) {
            this.field2042 = arg0.method8448();
        } else if (arg1 == 16) {
            this.field2043 = arg0.method8448();
        } else if (arg1 == 17) {
            this.field2059 = arg0.method8448();
            this.field2045 = arg0.method8448();
            this.field2046 = arg0.method8448();
            this.field2047 = arg0.method8448();
        } else if (arg1 == 18) {
            arg0.method8448();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2035[arg1 - 30] = arg0.method8311();
            if (this.field2035[arg1 - 30].equalsIgnoreCase(class352.field4165)) {
                this.field2035[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method8300();
            this.field2078 = new short[var5];
            this.field2057 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2078[var6] = (short) arg0.method8448();
                this.field2057[var6] = (short) arg0.method8448();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8300();
            this.field2058 = new short[var7];
            this.field2052 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2058[var8] = (short) arg0.method8448();
                this.field2052[var8] = (short) arg0.method8448();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method8300();
            this.field2039 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2039[var10] = arg0.method8448();
            }
        } else if (arg1 == 93) {
            this.field2061 = false;
        } else if (arg1 == 95) {
            this.field2062 = arg0.method8448();
        } else if (arg1 == 97) {
            this.field2063 = arg0.method8448();
        } else if (arg1 == 98) {
            this.field2055 = arg0.method8448();
        } else if (arg1 == 99) {
            this.field2065 = true;
        } else if (arg1 == 100) {
            this.field2064 = arg0.method8301();
        } else if (arg1 == 101) {
            this.field2067 = arg0.method8301();
        } else if (arg1 == 102) {
            int var11 = arg0.method8300();
            int var12 = 0;
            for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                var12++;
            }
            this.field2075 = new int[var12];
            this.field2073 = new short[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                if ((var11 & 0x1 << var14) == 0) {
                    this.field2075[var14] = -1;
                    this.field2073[var14] = -1;
                } else {
                    this.field2075[var14] = arg0.method8440();
                    this.field2073[var14] = (short) arg0.method8317();
                }
            }
        } else if (arg1 == 103) {
            this.field2068 = arg0.method8448();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field2070 = arg0.method8448();
            if (this.field2070 == 65535) {
                this.field2070 = -1;
            }
            this.field2071 = arg0.method8448();
            if (this.field2071 == 65535) {
                this.field2071 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method8448();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method8300();
            this.field2066 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field2066[var17] = arg0.method8448();
                if (this.field2066[var17] == 65535) {
                    this.field2066[var17] = -1;
                }
            }
            this.field2066[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field2072 = false;
        } else if (arg1 == 109) {
            this.field2031 = false;
        } else if (arg1 == 111) {
            this.field2074 = true;
        } else if (arg1 == 114) {
            this.field2048 = arg0.method8448();
        } else if (arg1 == 115) {
            this.field2048 = arg0.method8448();
            this.field2049 = arg0.method8448();
            this.field2050 = arg0.method8448();
            this.field2076 = arg0.method8448();
        } else if (arg1 == 116) {
            this.field2044 = arg0.method8448();
        } else if (arg1 == 117) {
            this.field2044 = arg0.method8448();
            this.field2053 = arg0.method8448();
            this.field2060 = arg0.method8448();
            this.field2077 = arg0.method8448();
        } else if (arg1 == 249) {
            this.field2051 = class192.method1074(arg0, this.field2051);
        }
    }

    @ObfuscatedName("hw.ac(Lib;ILib;ILhq;I)Ljr;")
    public final class240 method3407(class209 arg0, int arg1, class209 arg2, int arg3, class195 arg4) {
        if (this.field2066 != null) {
            class196 var6 = this.method3409();
            return var6 == null ? null : var6.method3407(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field2036;
        if (arg4 != null) {
            var7 |= arg4.field2027 << 16;
        }
        class240 var9 = (class240) field2040.method5182(var7);
        if (var9 == null) {
            class222 var10 = this.method3439(this.field2056, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3965(this.field2064 + 64, this.field2067 * 5 + 850, -30, -50, -30);
            field2040.method5177(var9, var7);
        }
        class240 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method3743(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method3740(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method4446(true);
        } else {
            var11 = arg2.method3740(var9, arg3);
        }
        if (this.field2063 != 128 || this.field2055 != 128) {
            var11.method4467(this.field2063, this.field2055, this.field2063);
        }
        return var11;
    }

    @ObfuscatedName("hw.ai(Lhq;I)Lic;")
    public final class222 method3408(class195 arg0) {
        if (this.field2066 == null) {
            return this.method3439(this.field2039, arg0);
        } else {
            class196 var2 = this.method3409();
            return var2 == null ? null : var2.method3408(arg0);
        }
    }

    @ObfuscatedName("hw.az([ILhq;I)Lic;")
    public class222 method3439(int[] arg0, class195 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field2025 != null) {
            var3 = arg1.field2025;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field2033.method6130(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class222[] var6 = new class222[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class222.method4002(Statics.field2033, var3[var7], 0);
        }
        class222 var8;
        if (var6.length == 1) {
            var8 = var6[0];
            if (var8 == null) {
                var8 = new class222(var6, var6.length);
            }
        } else {
            var8 = new class222(var6, var6.length);
        }
        if (this.field2078 != null) {
            short[] var9 = this.field2057;
            if (arg1 != null && arg1.field2026 != null) {
                var9 = arg1.field2026;
            }
            for (int var10 = 0; var10 < this.field2078.length; var10++) {
                var8.method3996(this.field2078[var10], var9[var10]);
            }
        }
        if (this.field2058 != null) {
            short[] var11 = this.field2052;
            if (arg1 != null && arg1.field2028 != null) {
                var11 = arg1.field2028;
            }
            for (int var12 = 0; var12 < this.field2058.length; var12++) {
                var8.method3958(this.field2058[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("hw.ap(I)Lhw;")
    public final class196 method3409() {
        int var1 = -1;
        if (this.field2070 != -1) {
            var1 = class322.method2448(this.field2070);
        } else if (this.field2071 != -1) {
            var1 = class322.field3540[this.field2071];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2066.length - 1) {
            var2 = this.field2066[var1];
        } else {
            var2 = this.field2066[this.field2066.length - 1];
        }
        return var2 == -1 ? null : method2202(var2);
    }

    @ObfuscatedName("hw.aa(I)Z")
    public boolean method3415() {
        if (this.field2066 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2070 != -1) {
            var1 = class322.method2448(this.field2070);
        } else if (this.field2071 != -1) {
            var1 = class322.field3540[this.field2071];
        }
        if (var1 >= 0 && var1 < this.field2066.length) {
            return this.field2066[var1] != -1;
        } else {
            return this.field2066[this.field2066.length - 1] != -1;
        }
    }

    @ObfuscatedName("hw.af(III)I")
    public int method3446(int arg0, int arg1) {
        class488 var3 = this.field2051;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class472 var5 = (class472) var3.method8008((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4812;
            }
        }
        return var4;
    }

    @ObfuscatedName("hw.ad(ILjava/lang/String;S)Ljava/lang/String;")
    public String method3434(int arg0, String arg1) {
        class488 var3 = this.field2051;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class470 var5 = (class470) var3.method8008((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4810;
            }
        }
        return var4;
    }

    @ObfuscatedName("hw.aq(I)Z")
    public boolean method3413() {
        return this.field2075 != null && this.field2073 != null;
    }

    @ObfuscatedName("hw.al(I)[I")
    public int[] method3414() {
        return this.field2075;
    }

    @ObfuscatedName("hw.an(II)I")
    public int method3411(int arg0) {
        return this.field2075 == null || arg0 >= this.field2075.length ? -1 : this.field2075[arg0];
    }

    @ObfuscatedName("hw.ar(I)[S")
    public short[] method3416() {
        return this.field2073;
    }

    @ObfuscatedName("hw.ab(IB)S")
    public short method3431(int arg0) {
        return this.field2073 == null || arg0 >= this.field2073.length ? -1 : this.field2073[arg0];
    }
}
