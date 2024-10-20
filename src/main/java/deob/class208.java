package deob;

@ObfuscatedName("hs")
public class class208 extends class504 {

    @ObfuscatedName("hs.am")
    public static class317 field2138 = new class317(64);

    @ObfuscatedName("hs.ax")
    public static class317 field2142 = new class317(64);

    @ObfuscatedName("hs.aq")
    public static class317 field2143 = new class317(20);

    @ObfuscatedName("hs.ad")
    public int field2146 = -1;

    @ObfuscatedName("hs.ah")
    public int field2147 = 16777215;

    @ObfuscatedName("hs.ap")
    public int field2148 = 70;

    @ObfuscatedName("hs.ab")
    public int field2149 = -1;

    @ObfuscatedName("hs.az")
    public int field2150 = -1;

    @ObfuscatedName("hs.aa")
    public int field2151 = -1;

    @ObfuscatedName("hs.ai")
    public int field2152 = -1;

    @ObfuscatedName("hs.ao")
    public int field2153 = 0;

    @ObfuscatedName("hs.as")
    public int field2154 = 0;

    @ObfuscatedName("hs.ay")
    public int field2155 = -1;

    @ObfuscatedName("hs.aj")
    public String field2156 = "";

    @ObfuscatedName("hs.av")
    public int field2140 = -1;

    @ObfuscatedName("hs.aw")
    public int field2158 = 0;

    @ObfuscatedName("hs.an")
    public int[] field2159;

    @ObfuscatedName("hs.ak")
    public int field2160 = -1;

    @ObfuscatedName("hs.bn")
    public int field2157 = -1;

    @ObfuscatedName("dx.ac(Lpo;Lpo;Lpo;I)V")
    public static void method2394(class391 arg0, class391 arg1, class391 arg2) {
        Statics.field2161 = arg0;
        Statics.field2139 = arg1;
        Statics.field2145 = arg2;
    }

    @ObfuscatedName("hs.ae(Lvf;I)V")
    public void method3759(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method3760(arg0, var2);
        }
    }

    @ObfuscatedName("hs.ag(Lvf;II)V")
    public void method3760(class551 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2146 = arg0.method9205();
        } else if (arg1 == 2) {
            this.field2147 = arg0.method8978();
        } else if (arg1 == 3) {
            this.field2149 = arg0.method9205();
        } else if (arg1 == 4) {
            this.field2151 = arg0.method9205();
        } else if (arg1 == 5) {
            this.field2150 = arg0.method9205();
        } else if (arg1 == 6) {
            this.field2152 = arg0.method9205();
        } else if (arg1 == 7) {
            this.field2153 = arg0.method8977();
        } else if (arg1 == 8) {
            this.field2156 = arg0.method8985();
        } else if (arg1 == 9) {
            this.field2148 = arg0.method9119();
        } else if (arg1 == 10) {
            this.field2154 = arg0.method8977();
        } else if (arg1 == 11) {
            this.field2155 = 0;
        } else if (arg1 == 12) {
            this.field2140 = arg0.method8955();
        } else if (arg1 == 13) {
            this.field2158 = arg0.method8977();
        } else if (arg1 == 14) {
            this.field2155 = arg0.method9119();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2160 = arg0.method9119();
            if (this.field2160 == 65535) {
                this.field2160 = -1;
            }
            this.field2157 = arg0.method9119();
            if (this.field2157 == 65535) {
                this.field2157 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method9119();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method8955();
            this.field2159 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2159[var5] = arg0.method9119();
                if (this.field2159[var5] == 65535) {
                    this.field2159[var5] = -1;
                }
            }
            this.field2159[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("hs.am(I)Lhs;")
    public final class208 method3768() {
        int var1 = -1;
        if (this.field2160 != -1) {
            var1 = class351.method3259(this.field2160);
        } else if (this.field2157 != -1) {
            var1 = class351.field3752[this.field2157];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2159.length - 1) {
            var2 = this.field2159[var1];
        } else {
            var2 = this.field2159[this.field2159.length - 1];
        }
        if (var2 == -1) {
            return null;
        }
        class208 var3 = (class208) field2138.method5733((long) var2);
        class208 var4;
        if (var3 == null) {
            byte[] var5 = Statics.field2161.method6782(32, var2);
            class208 var6 = new class208();
            if (var5 != null) {
                var6.method3759(new class551(var5));
            }
            field2138.method5735(var6, (long) var2);
            var4 = var6;
        } else {
            var4 = var3;
        }
        return var4;
    }

    @ObfuscatedName("hs.ax(IB)Ljava/lang/String;")
    public String method3761(int arg0) {
        String var2 = this.field2156;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class419.method3344(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("hs.aq(S)Lvv;")
    public class565 method3765() {
        if (this.field2149 < 0) {
            return null;
        }
        class565 var1 = (class565) field2142.method5733((long) this.field2149);
        if (var1 != null) {
            return var1;
        }
        class565 var2 = class566.method8084(Statics.field2139, this.field2149, 0);
        if (var2 != null) {
            field2142.method5735(var2, (long) this.field2149);
        }
        return var2;
    }

    @ObfuscatedName("hs.af(I)Lvv;")
    public class565 method3781() {
        if (this.field2150 < 0) {
            return null;
        }
        class565 var1 = (class565) field2142.method5733((long) this.field2150);
        if (var1 != null) {
            return var1;
        }
        class565 var2 = class566.method8084(Statics.field2139, this.field2150, 0);
        if (var2 != null) {
            field2142.method5735(var2, (long) this.field2150);
        }
        return var2;
    }

    @ObfuscatedName("hs.at(I)Lvv;")
    public class565 method3787() {
        if (this.field2151 < 0) {
            return null;
        }
        class565 var1 = (class565) field2142.method5733((long) this.field2151);
        if (var1 != null) {
            return var1;
        }
        class565 var2 = class566.method8084(Statics.field2139, this.field2151, 0);
        if (var2 != null) {
            field2142.method5735(var2, (long) this.field2151);
        }
        return var2;
    }

    @ObfuscatedName("hs.au(I)Lvv;")
    public class565 method3766() {
        if (this.field2152 < 0) {
            return null;
        }
        class565 var1 = (class565) field2142.method5733((long) this.field2152);
        if (var1 != null) {
            return var1;
        }
        class565 var2 = class566.method8084(Statics.field2139, this.field2152, 0);
        if (var2 != null) {
            field2142.method5735(var2, (long) this.field2152);
        }
        return var2;
    }

    @ObfuscatedName("hs.ar(S)Lqu;")
    public class435 method3767() {
        if (this.field2146 == -1) {
            return null;
        }
        class435 var1 = (class435) field2143.method5733((long) this.field2146);
        if (var1 != null) {
            return var1;
        }
        class391 var2 = Statics.field2139;
        class391 var3 = Statics.field2145;
        int var4 = this.field2146;
        class435 var5;
        if (class566.method8328(var2, var4, 0)) {
            byte[] var6 = var3.method6782(var4, 0);
            class435 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class435 var8 = new class435(var6, Statics.field4920, Statics.field988, Statics.field4598, Statics.field2922, Statics.field5524, Statics.field3699);
                class566.method3270();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field2143.method5735(var5, (long) this.field2146);
        }
        return var5;
    }

    @ObfuscatedName("af.al(B)V")
    public static void method38() {
        field2138.method5736();
        field2142.method5736();
        field2143.method5736();
    }
}
