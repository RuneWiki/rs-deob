package deob;

@ObfuscatedName("io")
public class class220 extends class489 {

    @ObfuscatedName("io.at")
    public static class304 field2223 = new class304(64);

    @ObfuscatedName("io.an")
    public static class304 field2224 = new class304(64);

    @ObfuscatedName("io.ao")
    public static class304 field2225 = new class304(20);

    @ObfuscatedName("io.ag")
    public int field2241 = -1;

    @ObfuscatedName("io.ai")
    public int field2236 = 16777215;

    @ObfuscatedName("io.ax")
    public int field2228 = 70;

    @ObfuscatedName("io.ar")
    public int field2229 = -1;

    @ObfuscatedName("io.aj")
    public int field2240 = -1;

    @ObfuscatedName("io.au")
    public int field2237 = -1;

    @ObfuscatedName("io.ay")
    public int field2232 = -1;

    @ObfuscatedName("io.ap")
    public int field2233 = 0;

    @ObfuscatedName("io.av")
    public int field2234 = 0;

    @ObfuscatedName("io.aa")
    public int field2235 = -1;

    @ObfuscatedName("io.aq")
    public String field2231 = "";

    @ObfuscatedName("io.am")
    public int field2230 = -1;

    @ObfuscatedName("io.ac")
    public int field2238 = 0;

    @ObfuscatedName("io.ae")
    public int[] field2239;

    @ObfuscatedName("io.ak")
    public int field2227 = -1;

    @ObfuscatedName("io.bp")
    public int field2221 = -1;

    @ObfuscatedName("hh.az(IS)Lio;")
    public static class220 method3401(int arg0) {
        class220 var1 = (class220) field2223.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2226.method6328(32, arg0);
        class220 var3 = new class220();
        if (var2 != null) {
            var3.method3728(new class535(var2));
        }
        field2223.method5346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.ah(Lur;B)V")
    public void method3728(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method3718(arg0, var2);
        }
    }

    @ObfuscatedName("io.af(Lur;IB)V")
    public void method3718(class535 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2241 = arg0.method8633();
        } else if (arg1 == 2) {
            this.field2236 = arg0.method8466();
        } else if (arg1 == 3) {
            this.field2229 = arg0.method8633();
        } else if (arg1 == 4) {
            this.field2237 = arg0.method8633();
        } else if (arg1 == 5) {
            this.field2240 = arg0.method8633();
        } else if (arg1 == 6) {
            this.field2232 = arg0.method8633();
        } else if (arg1 == 7) {
            this.field2233 = arg0.method8465();
        } else if (arg1 == 8) {
            this.field2231 = arg0.method8474();
        } else if (arg1 == 9) {
            this.field2228 = arg0.method8670();
        } else if (arg1 == 10) {
            this.field2234 = arg0.method8465();
        } else if (arg1 == 11) {
            this.field2235 = 0;
        } else if (arg1 == 12) {
            this.field2230 = arg0.method8462();
        } else if (arg1 == 13) {
            this.field2238 = arg0.method8465();
        } else if (arg1 == 14) {
            this.field2235 = arg0.method8670();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2227 = arg0.method8670();
            if (this.field2227 == 65535) {
                this.field2227 = -1;
            }
            this.field2221 = arg0.method8670();
            if (this.field2221 == 65535) {
                this.field2221 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method8670();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method8462();
            this.field2239 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2239[var5] = arg0.method8670();
                if (this.field2239[var5] == 65535) {
                    this.field2239[var5] = -1;
                }
            }
            this.field2239[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("io.at(I)Lio;")
    public final class220 method3732() {
        int var1 = -1;
        if (this.field2227 != -1) {
            var1 = class338.method3618(this.field2227);
        } else if (this.field2221 != -1) {
            var1 = class338.field3634[this.field2221];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2239.length - 1) {
            var2 = this.field2239[var1];
        } else {
            var2 = this.field2239[this.field2239.length - 1];
        }
        return var2 == -1 ? null : method3401(var2);
    }

    @ObfuscatedName("io.an(IB)Ljava/lang/String;")
    public String method3719(int arg0) {
        String var2 = this.field2231;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class407.method2713(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("io.ao(I)Lvg;")
    public class549 method3720() {
        if (this.field2229 < 0) {
            return null;
        }
        class549 var1 = (class549) field2224.method5336((long) this.field2229);
        if (var1 != null) {
            return var1;
        }
        class549 var2 = class550.method1978(Statics.field2220, this.field2229, 0);
        if (var2 != null) {
            field2224.method5346(var2, (long) this.field2229);
        }
        return var2;
    }

    @ObfuscatedName("io.ab(B)Lvg;")
    public class549 method3721() {
        if (this.field2240 < 0) {
            return null;
        }
        class549 var1 = (class549) field2224.method5336((long) this.field2240);
        if (var1 != null) {
            return var1;
        }
        class549 var2 = class550.method1978(Statics.field2220, this.field2240, 0);
        if (var2 != null) {
            field2224.method5346(var2, (long) this.field2240);
        }
        return var2;
    }

    @ObfuscatedName("io.aw(I)Lvg;")
    public class549 method3722() {
        if (this.field2237 < 0) {
            return null;
        }
        class549 var1 = (class549) field2224.method5336((long) this.field2237);
        if (var1 != null) {
            return var1;
        }
        class549 var2 = class550.method1978(Statics.field2220, this.field2237, 0);
        if (var2 != null) {
            field2224.method5346(var2, (long) this.field2237);
        }
        return var2;
    }

    @ObfuscatedName("io.ad(B)Lvg;")
    public class549 method3734() {
        if (this.field2232 < 0) {
            return null;
        }
        class549 var1 = (class549) field2224.method5336((long) this.field2232);
        if (var1 != null) {
            return var1;
        }
        class549 var2 = class550.method1978(Statics.field2220, this.field2232, 0);
        if (var2 != null) {
            field2224.method5346(var2, (long) this.field2232);
        }
        return var2;
    }

    @ObfuscatedName("io.al(I)Lpx;")
    public class414 method3724() {
        if (this.field2241 == -1) {
            return null;
        }
        class414 var1 = (class414) field2225.method5336((long) this.field2241);
        if (var1 != null) {
            return var1;
        }
        class379 var2 = Statics.field2220;
        class379 var3 = Statics.field2222;
        int var4 = this.field2241;
        byte[] var5 = var2.method6328(var4, 0);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            class550.method7827(var5);
            var6 = true;
        }
        class414 var7;
        if (var6) {
            byte[] var8 = var3.method6328(var4, 0);
            class414 var9;
            if (var8 == null) {
                var9 = null;
            } else {
                class414 var10 = new class414(var8, Statics.field5344, Statics.field5348, Statics.field5346, Statics.field4802, Statics.field1518, Statics.field5347);
                Statics.field5344 = null;
                Statics.field5348 = null;
                Statics.field5346 = null;
                Statics.field4802 = null;
                Statics.field1518 = null;
                Statics.field5347 = (byte[][]) null;
                var9 = var10;
            }
            var7 = var9;
        } else {
            var7 = null;
        }
        if (var7 != null) {
            field2225.method5346(var7, (long) this.field2241);
        }
        return var7;
    }
}
