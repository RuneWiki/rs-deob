package deob;

@ObfuscatedName("iz")
public class class220 extends class484 {

    @ObfuscatedName("iz.ac")
    public static boolean field2191 = false;

    @ObfuscatedName("iz.ax")
    public static class302 field2193 = new class302(4096);

    @ObfuscatedName("iz.ao")
    public static class302 field2196 = new class302(500);

    @ObfuscatedName("iz.ah")
    public static class302 field2195 = new class302(30);

    @ObfuscatedName("iz.ar")
    public static class302 field2223 = new class302(30);

    @ObfuscatedName("iz.ab")
    public static class236[] field2197 = new class236[4];

    @ObfuscatedName("iz.am")
    public int field2198;

    @ObfuscatedName("iz.av")
    public int[] field2233;

    @ObfuscatedName("iz.ag")
    public int[] field2222;

    @ObfuscatedName("iz.aa")
    public String field2201 = class367.field3956;

    @ObfuscatedName("iz.ap")
    public short[] field2190;

    @ObfuscatedName("iz.ay")
    public short[] field2203;

    @ObfuscatedName("iz.as")
    public short[] field2204;

    @ObfuscatedName("iz.aj")
    public short[] field2235;

    @ObfuscatedName("iz.an")
    public int field2206 = 1;

    @ObfuscatedName("iz.au")
    public int field2207 = 1;

    @ObfuscatedName("iz.ai")
    public int field2208 = 2;

    @ObfuscatedName("iz.ae")
    public boolean field2234 = true;

    @ObfuscatedName("iz.aw")
    public int field2210 = -1;

    @ObfuscatedName("iz.aq")
    public int field2213 = -1;

    @ObfuscatedName("iz.az")
    public boolean field2212 = false;

    @ObfuscatedName("iz.at")
    public boolean field2194 = false;

    @ObfuscatedName("iz.af")
    public int field2214 = -1;

    @ObfuscatedName("iz.ad")
    public int field2215 = 16;

    @ObfuscatedName("iz.bn")
    public int field2216 = 0;

    @ObfuscatedName("iz.bk")
    public int field2217 = 0;

    @ObfuscatedName("iz.by")
    public String[] field2218 = new String[5];

    @ObfuscatedName("iz.bd")
    public int field2219 = -1;

    @ObfuscatedName("iz.be")
    public int field2242 = -1;

    @ObfuscatedName("iz.bv")
    public boolean field2237 = false;

    @ObfuscatedName("iz.ba")
    public boolean field2225 = true;

    @ObfuscatedName("iz.bz")
    public int field2199 = 128;

    @ObfuscatedName("iz.bb")
    public int field2202 = 128;

    @ObfuscatedName("iz.bo")
    public int field2221 = 128;

    @ObfuscatedName("iz.bp")
    public int field2226 = 0;

    @ObfuscatedName("iz.bt")
    public int field2227 = 0;

    @ObfuscatedName("iz.bm")
    public int field2228 = 0;

    @ObfuscatedName("iz.br")
    public boolean field2229 = false;

    @ObfuscatedName("iz.bs")
    public boolean field2230 = false;

    @ObfuscatedName("iz.bc")
    public int field2231 = -1;

    @ObfuscatedName("iz.bu")
    public int[] field2232;

    @ObfuscatedName("iz.bf")
    public int field2220 = -1;

    @ObfuscatedName("iz.bh")
    public int field2205 = -1;

    @ObfuscatedName("iz.bl")
    public int field2211 = -1;

    @ObfuscatedName("iz.bg")
    public int field2236 = 0;

    @ObfuscatedName("iz.bj")
    public int field2239 = 0;

    @ObfuscatedName("iz.bx")
    public int field2238 = 0;

    @ObfuscatedName("iz.bi")
    public int[] field2209;

    @ObfuscatedName("iz.bq")
    public boolean field2240 = true;

    @ObfuscatedName("iz.bw")
    public class503 field2241;

    @ObfuscatedName("tr.ac(Lom;Lom;ZI)V")
    public static void method8215(class374 arg0, class374 arg1, boolean arg2) {
        Statics.field2200 = arg0;
        Statics.field2192 = arg1;
        field2191 = arg2;
    }

    @ObfuscatedName("iz.ak(I)V")
    public void method3687() {
        if (this.field2210 == -1) {
            this.field2210 = 0;
            if (this.field2233 != null && (this.field2222 == null || this.field2222[0] == 10)) {
                this.field2210 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2218[var1] != null) {
                    this.field2210 = 1;
                }
            }
        }
        if (this.field2231 == -1) {
            this.field2231 = this.field2208 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("iz.ax(Lul;I)V")
    public void method3688(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method3689(arg0, var2);
        }
    }

    @ObfuscatedName("iz.ao(Lul;IB)V")
    public void method3689(class530 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8365();
            if (var3 > 0) {
                if (this.field2233 == null || field2191) {
                    this.field2222 = new int[var3];
                    this.field2233 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2233[var4] = arg0.method8598();
                        this.field2222[var4] = arg0.method8365();
                    }
                } else {
                    arg0.field5140 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2201 = arg0.method8588();
        } else if (arg1 == 5) {
            int var5 = arg0.method8365();
            if (var5 > 0) {
                if (this.field2233 == null || field2191) {
                    this.field2222 = null;
                    this.field2233 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2233[var6] = arg0.method8598();
                    }
                } else {
                    arg0.field5140 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2206 = arg0.method8365();
        } else if (arg1 == 15) {
            this.field2207 = arg0.method8365();
        } else if (arg1 == 17) {
            this.field2208 = 0;
            this.field2234 = false;
        } else if (arg1 == 18) {
            this.field2234 = false;
        } else if (arg1 == 19) {
            this.field2210 = arg0.method8365();
        } else if (arg1 == 21) {
            this.field2213 = 0;
        } else if (arg1 == 22) {
            this.field2212 = true;
        } else if (arg1 == 23) {
            this.field2194 = true;
        } else if (arg1 == 24) {
            this.field2214 = arg0.method8598();
            if (this.field2214 == 65535) {
                this.field2214 = -1;
            }
        } else if (arg1 == 27) {
            this.field2208 = 1;
        } else if (arg1 == 28) {
            this.field2215 = arg0.method8365();
        } else if (arg1 == 29) {
            this.field2216 = arg0.method8366();
        } else if (arg1 == 39) {
            this.field2217 = arg0.method8366();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2218[arg1 - 30] = arg0.method8588();
            if (this.field2218[arg1 - 30].equalsIgnoreCase(class367.field3951)) {
                this.field2218[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method8365();
            this.field2190 = new short[var7];
            this.field2203 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2190[var8] = (short) arg0.method8598();
                this.field2203[var8] = (short) arg0.method8598();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method8365();
            this.field2204 = new short[var9];
            this.field2235 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2204[var10] = (short) arg0.method8598();
                this.field2235[var10] = (short) arg0.method8598();
            }
        } else if (arg1 == 61) {
            arg0.method8598();
        } else if (arg1 == 62) {
            this.field2237 = true;
        } else if (arg1 == 64) {
            this.field2225 = false;
        } else if (arg1 == 65) {
            this.field2199 = arg0.method8598();
        } else if (arg1 == 66) {
            this.field2202 = arg0.method8598();
        } else if (arg1 == 67) {
            this.field2221 = arg0.method8598();
        } else if (arg1 == 68) {
            this.field2242 = arg0.method8598();
        } else if (arg1 == 69) {
            arg0.method8365();
        } else if (arg1 == 70) {
            this.field2226 = arg0.method8368();
        } else if (arg1 == 71) {
            this.field2227 = arg0.method8368();
        } else if (arg1 == 72) {
            this.field2228 = arg0.method8368();
        } else if (arg1 == 73) {
            this.field2229 = true;
        } else if (arg1 == 74) {
            this.field2230 = true;
        } else if (arg1 == 75) {
            this.field2231 = arg0.method8365();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2220 = arg0.method8598();
            if (this.field2220 == 65535) {
                this.field2220 = -1;
            }
            this.field2205 = arg0.method8598();
            if (this.field2205 == 65535) {
                this.field2205 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method8598();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method8365();
            this.field2232 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2232[var15] = arg0.method8598();
                if (this.field2232[var15] == 65535) {
                    this.field2232[var15] = -1;
                }
            }
            this.field2232[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2211 = arg0.method8598();
            this.field2236 = arg0.method8365();
        } else if (arg1 == 79) {
            this.field2239 = arg0.method8598();
            this.field2238 = arg0.method8598();
            this.field2236 = arg0.method8365();
            int var11 = arg0.method8365();
            this.field2209 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2209[var12] = arg0.method8598();
            }
        } else if (arg1 == 81) {
            this.field2213 = arg0.method8365() * 256;
        } else if (arg1 == 82) {
            this.field2219 = arg0.method8598();
        } else if (arg1 == 89) {
            this.field2240 = false;
        } else if (arg1 == 249) {
            this.field2241 = class199.method3135(arg0, this.field2241);
        }
    }

    @ObfuscatedName("iz.ah(II)Z")
    public final boolean method3690(int arg0) {
        if (this.field2222 != null) {
            for (int var4 = 0; var4 < this.field2222.length; var4++) {
                if (this.field2222[var4] == arg0) {
                    return Statics.field2192.method6265(this.field2233[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2233 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2233.length; var3++) {
                var2 &= Statics.field2192.method6265(this.field2233[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iz.ar(B)Z")
    public final boolean method3691() {
        if (this.field2233 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2233.length; var2++) {
            var1 &= Statics.field2192.method6265(this.field2233[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("iz.ab(II[[IIIII)Ljy;")
    public final class247 method3692(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2222 == null) {
            var7 = (long) ((this.field2198 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2198 << 10) + (arg0 << 3) + arg1);
        }
        class247 var9 = (class247) field2195.method5286(var7);
        if (var9 == null) {
            class236 var10 = this.method3695(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2212) {
                var10.field2480 = (short) (this.field2216 + 64);
                var10.field2481 = (short) (this.field2217 * 25 + 768);
                var10.method4064();
                var9 = var10;
            } else {
                var9 = var10.method4080(this.field2216 + 64, this.field2217 * 25 + 768, -50, -10, -50);
            }
            field2195.method5289(var9, var7);
        }
        if (this.field2212) {
            var9 = ((class236) var9).method4065();
        }
        if (this.field2213 >= 0) {
            if (var9 instanceof class254) {
                var9 = ((class254) var9).method4538(arg2, arg3, arg4, arg5, true, this.field2213);
            } else if (var9 instanceof class236) {
                var9 = ((class236) var9).method4085(arg2, arg3, arg4, arg5, true, this.field2213);
            }
        }
        return var9;
    }

    @ObfuscatedName("iz.am(II[[IIIII)Ljn;")
    public final class254 method3693(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2222 == null) {
            var7 = (long) ((this.field2198 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2198 << 10) + (arg0 << 3) + arg1);
        }
        class254 var9 = (class254) field2223.method5286(var7);
        if (var9 == null) {
            class236 var10 = this.method3695(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4080(this.field2216 + 64, this.field2217 * 25 + 768, -50, -10, -50);
            field2223.method5289(var9, var7);
        }
        if (this.field2213 >= 0) {
            var9 = var9.method4538(arg2, arg3, arg4, arg5, true, this.field2213);
        }
        return var9;
    }

    @ObfuscatedName("iz.av(II[[IIIILif;II)Ljn;")
    public final class254 method3694(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class223 arg6, int arg7) {
        long var9;
        if (this.field2222 == null) {
            var9 = (long) ((this.field2198 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2198 << 10) + (arg0 << 3) + arg1);
        }
        class254 var11 = (class254) field2223.method5286(var9);
        if (var11 == null) {
            class236 var12 = this.method3695(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method4080(this.field2216 + 64, this.field2217 * 25 + 768, -50, -10, -50);
            field2223.method5289(var11, var9);
        }
        if (arg6 == null && this.field2213 == -1) {
            return var11;
        }
        class254 var13;
        if (arg6 == null) {
            var13 = var11.method4534(true);
        } else {
            var13 = arg6.method3846(var11, arg7, arg1);
        }
        if (this.field2213 >= 0) {
            var13 = var13.method4538(arg2, arg3, arg4, arg5, false, this.field2213);
        }
        return var13;
    }

    @ObfuscatedName("iz.ag(IIB)Ljw;")
    public final class236 method3695(int arg0, int arg1) {
        class236 var3 = null;
        if (this.field2222 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2233 == null) {
                return null;
            }
            boolean var4 = this.field2237;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2233.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2233[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class236) field2196.method5286((long) var7);
                if (var3 == null) {
                    var3 = class236.method4058(Statics.field2192, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method4075();
                    }
                    field2196.method5289(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2197[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class236(field2197, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2222.length; var9++) {
                if (this.field2222[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2233[var8];
            boolean var11 = this.field2237 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class236) field2196.method5286((long) var10);
            if (var3 == null) {
                var3 = class236.method4058(Statics.field2192, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method4075();
                }
                field2196.method5289(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2199 == 128 && this.field2202 == 128 && this.field2221 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2226 == 0 && this.field2227 == 0 && this.field2228 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class236 var14 = new class236(var3, arg1 == 0 && !var12 && !var13, this.field2190 == null, this.field2204 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method4071(256);
            var14.method4104(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method4068();
        } else if (var15 == 2) {
            var14.method4076();
        } else if (var15 == 3) {
            var14.method4091();
        }
        if (this.field2190 != null) {
            for (int var16 = 0; var16 < this.field2190.length; var16++) {
                var14.method4132(this.field2190[var16], this.field2203[var16]);
            }
        }
        if (this.field2204 != null) {
            for (int var17 = 0; var17 < this.field2204.length; var17++) {
                var14.method4074(this.field2204[var17], this.field2235[var17]);
            }
        }
        if (var12) {
            var14.method4113(this.field2199, this.field2202, this.field2221);
        }
        if (var13) {
            var14.method4104(this.field2226, this.field2227, this.field2228);
        }
        return var14;
    }

    @ObfuscatedName("iz.aa(B)Liz;")
    public final class220 method3696() {
        int var1 = -1;
        if (this.field2220 != -1) {
            var1 = class336.method686(this.field2220);
        } else if (this.field2205 != -1) {
            var1 = class336.field3568[this.field2205];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2232.length - 1) {
            var2 = this.field2232[var1];
        } else {
            var2 = this.field2232[this.field2232.length - 1];
        }
        return var2 == -1 ? null : Statics.method2243(var2);
    }

    @ObfuscatedName("iz.ap(III)I")
    public int method3710(int arg0, int arg1) {
        return class199.method2595(this.field2241, arg0, arg1);
    }

    @ObfuscatedName("iz.ay(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3698(int arg0, String arg1) {
        return class199.method439(this.field2241, arg0, arg1);
    }

    @ObfuscatedName("mn.as(I)V")
    public static void method5588() {
        field2193.method5288();
        field2196.method5288();
        field2195.method5288();
        field2223.method5288();
    }

    @ObfuscatedName("iz.aj(I)Z")
    public boolean method3699() {
        if (this.field2232 == null) {
            return this.field2211 != -1 || this.field2209 != null;
        }
        for (int var1 = 0; var1 < this.field2232.length; var1++) {
            if (this.field2232[var1] != -1) {
                class220 var2 = Statics.method2243(this.field2232[var1]);
                if (var2.field2211 != -1 || var2.field2209 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
