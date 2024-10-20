package deob;

@ObfuscatedName("hw")
public class class206 extends class484 {

    @ObfuscatedName("hw.ax")
    public static class302 field2046 = new class302(64);

    @ObfuscatedName("hw.ao")
    public static class302 field2047 = new class302(50);

    @ObfuscatedName("hw.ah")
    public int field2084;

    @ObfuscatedName("hw.ar")
    public String field2083 = class367.field3956;

    @ObfuscatedName("hw.ab")
    public int field2050 = 1;

    @ObfuscatedName("hw.am")
    public int[] field2051;

    @ObfuscatedName("hw.av")
    public int[] field2054;

    @ObfuscatedName("hw.ag")
    public int field2053 = -1;

    @ObfuscatedName("hw.aa")
    public int field2048 = -1;

    @ObfuscatedName("hw.ap")
    public int field2055 = -1;

    @ObfuscatedName("hw.ay")
    public int field2044 = -1;

    @ObfuscatedName("hw.as")
    public int field2057 = -1;

    @ObfuscatedName("hw.aj")
    public int field2058 = -1;

    @ObfuscatedName("hw.an")
    public int field2071 = -1;

    @ObfuscatedName("hw.au")
    public int field2060 = -1;

    @ObfuscatedName("hw.ai")
    public int field2061 = -1;

    @ObfuscatedName("hw.ae")
    public int field2062 = -1;

    @ObfuscatedName("hw.aw")
    public int field2089 = -1;

    @ObfuscatedName("hw.aq")
    public int field2064 = -1;

    @ObfuscatedName("hw.az")
    public int field2065 = -1;

    @ObfuscatedName("hw.at")
    public int field2066 = -1;

    @ObfuscatedName("hw.af")
    public int field2075 = -1;

    @ObfuscatedName("hw.ad")
    public short[] field2068;

    @ObfuscatedName("hw.bn")
    public short[] field2069;

    @ObfuscatedName("hw.bk")
    public short[] field2067;

    @ObfuscatedName("hw.by")
    public short[] field2078;

    @ObfuscatedName("hw.bd")
    public String[] field2056 = new String[5];

    @ObfuscatedName("hw.be")
    public boolean field2073 = true;

    @ObfuscatedName("hw.bv")
    public int field2074 = -1;

    @ObfuscatedName("hw.ba")
    public int field2063 = 128;

    @ObfuscatedName("hw.bz")
    public int field2076 = 128;

    @ObfuscatedName("hw.bb")
    public boolean field2077 = false;

    @ObfuscatedName("hw.bo")
    public int field2072 = 0;

    @ObfuscatedName("hw.bp")
    public int field2079 = 0;

    @ObfuscatedName("hw.bt")
    public int field2080 = 32;

    @ObfuscatedName("hw.bm")
    public int[] field2043;

    @ObfuscatedName("hw.br")
    public int field2082 = -1;

    @ObfuscatedName("hw.bs")
    public int field2070 = -1;

    @ObfuscatedName("hw.bc")
    public boolean field2059 = true;

    @ObfuscatedName("hw.bu")
    public boolean field2085 = true;

    @ObfuscatedName("hw.bf")
    public boolean field2081 = false;

    @ObfuscatedName("hw.bh")
    public int[] field2087 = null;

    @ObfuscatedName("hw.bl")
    public short[] field2088 = null;

    @ObfuscatedName("hw.bg")
    public class503 field2049;

    @ObfuscatedName("hk.ac(IS)Lhw;")
    public static class206 method3320(int arg0) {
        class206 var1 = (class206) field2046.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2045.method6342(9, arg0);
        class206 var3 = new class206();
        var3.field2084 = arg0;
        if (var2 != null) {
            var3.method3470(new class530(var2));
        }
        var3.method3469();
        field2046.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hw.al(B)V")
    public void method3469() {
    }

    @ObfuscatedName("hw.ak(Lul;B)V")
    public void method3470(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method3471(arg0, var2);
        }
    }

    @ObfuscatedName("hw.ax(Lul;IB)V")
    public void method3471(class530 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8365();
            this.field2051 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2051[var4] = arg0.method8598();
            }
        } else if (arg1 == 2) {
            this.field2083 = arg0.method8588();
        } else if (arg1 == 12) {
            this.field2050 = arg0.method8365();
        } else if (arg1 == 13) {
            this.field2053 = arg0.method8598();
        } else if (arg1 == 14) {
            this.field2044 = arg0.method8598();
        } else if (arg1 == 15) {
            this.field2048 = arg0.method8598();
        } else if (arg1 == 16) {
            this.field2055 = arg0.method8598();
        } else if (arg1 == 17) {
            this.field2044 = arg0.method8598();
            this.field2057 = arg0.method8598();
            this.field2058 = arg0.method8598();
            this.field2071 = arg0.method8598();
        } else if (arg1 == 18) {
            arg0.method8598();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2056[arg1 - 30] = arg0.method8588();
            if (this.field2056[arg1 - 30].equalsIgnoreCase(class367.field3951)) {
                this.field2056[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method8365();
            this.field2068 = new short[var5];
            this.field2069 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2068[var6] = (short) arg0.method8598();
                this.field2069[var6] = (short) arg0.method8598();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8365();
            this.field2067 = new short[var7];
            this.field2078 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2067[var8] = (short) arg0.method8598();
                this.field2078[var8] = (short) arg0.method8598();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method8365();
            this.field2054 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2054[var10] = arg0.method8598();
            }
        } else if (arg1 == 93) {
            this.field2073 = false;
        } else if (arg1 == 95) {
            this.field2074 = arg0.method8598();
        } else if (arg1 == 97) {
            this.field2063 = arg0.method8598();
        } else if (arg1 == 98) {
            this.field2076 = arg0.method8598();
        } else if (arg1 == 99) {
            this.field2077 = true;
        } else if (arg1 == 100) {
            this.field2072 = arg0.method8366();
        } else if (arg1 == 101) {
            this.field2079 = arg0.method8366();
        } else if (arg1 == 102) {
            int var11 = arg0.method8365();
            int var12 = 0;
            for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                var12++;
            }
            this.field2087 = new int[var12];
            this.field2088 = new short[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                if ((var11 & 0x1 << var14) == 0) {
                    this.field2087[var14] = -1;
                    this.field2088[var14] = -1;
                } else {
                    this.field2087[var14] = arg0.method8385();
                    this.field2088[var14] = (short) arg0.method8382();
                }
            }
        } else if (arg1 == 103) {
            this.field2080 = arg0.method8598();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field2082 = arg0.method8598();
            if (this.field2082 == 65535) {
                this.field2082 = -1;
            }
            this.field2070 = arg0.method8598();
            if (this.field2070 == 65535) {
                this.field2070 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method8598();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method8365();
            this.field2043 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field2043[var17] = arg0.method8598();
                if (this.field2043[var17] == 65535) {
                    this.field2043[var17] = -1;
                }
            }
            this.field2043[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field2059 = false;
        } else if (arg1 == 109) {
            this.field2085 = false;
        } else if (arg1 == 111) {
            this.field2081 = true;
        } else if (arg1 == 114) {
            this.field2060 = arg0.method8598();
        } else if (arg1 == 115) {
            this.field2060 = arg0.method8598();
            this.field2061 = arg0.method8598();
            this.field2062 = arg0.method8598();
            this.field2089 = arg0.method8598();
        } else if (arg1 == 116) {
            this.field2064 = arg0.method8598();
        } else if (arg1 == 117) {
            this.field2064 = arg0.method8598();
            this.field2065 = arg0.method8598();
            this.field2066 = arg0.method8598();
            this.field2075 = arg0.method8598();
        } else if (arg1 == 249) {
            this.field2049 = class199.method3135(arg0, this.field2049);
        }
    }

    @ObfuscatedName("hw.ao(Lif;ILif;ILhe;B)Ljn;")
    public final class254 method3472(class223 arg0, int arg1, class223 arg2, int arg3, class205 arg4) {
        if (this.field2043 != null) {
            class206 var6 = this.method3500();
            return var6 == null ? null : var6.method3472(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field2084;
        if (arg4 != null) {
            var7 |= arg4.field2041 << 16;
        }
        class254 var9 = (class254) field2047.method5286(var7);
        if (var9 == null) {
            class236 var10 = this.method3474(this.field2051, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4080(this.field2072 + 64, this.field2079 * 5 + 850, -30, -50, -30);
            field2047.method5289(var9, var7);
        }
        class254 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method3841(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method3845(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method4534(true);
        } else {
            var11 = arg2.method3845(var9, arg3);
        }
        if (this.field2063 != 128 || this.field2076 != 128) {
            var11.method4559(this.field2063, this.field2076, this.field2063);
        }
        return var11;
    }

    @ObfuscatedName("hw.ah(Lhe;I)Ljw;")
    public final class236 method3473(class205 arg0) {
        if (this.field2043 == null) {
            return this.method3474(this.field2054, arg0);
        } else {
            class206 var2 = this.method3500();
            return var2 == null ? null : var2.method3473(arg0);
        }
    }

    @ObfuscatedName("hw.ar([ILhe;I)Ljw;")
    public class236 method3474(int[] arg0, class205 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field2038 != null) {
            var3 = arg1.field2038;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field2086.method6265(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class236[] var6 = new class236[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class236.method4058(Statics.field2086, var3[var7], 0);
        }
        class236 var8;
        if (var6.length == 1) {
            var8 = var6[0];
            if (var8 == null) {
                var8 = new class236(var6, var6.length);
            }
        } else {
            var8 = new class236(var6, var6.length);
        }
        if (this.field2068 != null) {
            short[] var9 = this.field2069;
            if (arg1 != null && arg1.field2037 != null) {
                var9 = arg1.field2037;
            }
            for (int var10 = 0; var10 < this.field2068.length; var10++) {
                var8.method4132(this.field2068[var10], var9[var10]);
            }
        }
        if (this.field2067 != null) {
            short[] var11 = this.field2078;
            if (arg1 != null && arg1.field2040 != null) {
                var11 = arg1.field2040;
            }
            for (int var12 = 0; var12 < this.field2067.length; var12++) {
                var8.method4074(this.field2067[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("hw.ab(I)Lhw;")
    public final class206 method3500() {
        int var1 = -1;
        if (this.field2082 != -1) {
            var1 = class336.method686(this.field2082);
        } else if (this.field2070 != -1) {
            var1 = class336.field3568[this.field2070];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2043.length - 1) {
            var2 = this.field2043[var1];
        } else {
            var2 = this.field2043[this.field2043.length - 1];
        }
        return var2 == -1 ? null : method3320(var2);
    }

    @ObfuscatedName("hw.am(I)Z")
    public boolean method3476() {
        if (this.field2043 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2082 != -1) {
            var1 = class336.method686(this.field2082);
        } else if (this.field2070 != -1) {
            var1 = class336.field3568[this.field2070];
        }
        if (var1 >= 0 && var1 < this.field2043.length) {
            return this.field2043[var1] != -1;
        } else {
            return this.field2043[this.field2043.length - 1] != -1;
        }
    }

    @ObfuscatedName("hw.av(IIS)I")
    public int method3477(int arg0, int arg1) {
        return class199.method2595(this.field2049, arg0, arg1);
    }

    @ObfuscatedName("hw.ag(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3506(int arg0, String arg1) {
        return class199.method439(this.field2049, arg0, arg1);
    }

    @ObfuscatedName("aw.aa(I)V")
    public static void method284() {
        field2046.method5288();
        field2047.method5288();
    }

    @ObfuscatedName("hw.ap(I)Z")
    public boolean method3479() {
        return this.field2087 != null && this.field2088 != null;
    }

    @ObfuscatedName("hw.ay(B)[I")
    public int[] method3480() {
        return this.field2087;
    }

    @ObfuscatedName("hw.as(II)I")
    public int method3481(int arg0) {
        return this.field2087 == null || arg0 >= this.field2087.length ? -1 : this.field2087[arg0];
    }

    @ObfuscatedName("hw.aj(I)[S")
    public short[] method3491() {
        return this.field2088;
    }

    @ObfuscatedName("hw.an(II)S")
    public short method3483(int arg0) {
        return this.field2088 == null || arg0 >= this.field2088.length ? -1 : this.field2088[arg0];
    }
}
