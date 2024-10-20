package deob;

@ObfuscatedName("hx")
public class class231 extends class128 {

    @ObfuscatedName("hx.p")
    public int field3268;

    @ObfuscatedName("hx.j")
    public boolean field3269;

    @ObfuscatedName("hx.z")
    public int field3274;

    @ObfuscatedName("hx.ae")
    public int field3275;

    @ObfuscatedName("hx.ad")
    public int field3282;

    @ObfuscatedName("hx.aq")
    public int field3277;

    @ObfuscatedName("hx.aa")
    public int field3295;

    @ObfuscatedName("hx.af")
    public boolean field3291;

    @ObfuscatedName("hx.as")
    public int field3280;

    @ObfuscatedName("hx.ax")
    public int field3272;

    @ObfuscatedName("hx.ag")
    public int field3276;

    @ObfuscatedName("hx.aj")
    public int field3283;

    @ObfuscatedName("hx.ar")
    public String field3288;

    @ObfuscatedName("hx.az")
    public String field3285;

    @ObfuscatedName("hx.av")
    public String field3286;

    @ObfuscatedName("hx.ap")
    public String field3287;

    @ObfuscatedName("hx.aw")
    public int field3278;

    @ObfuscatedName("hx.ay")
    public int field3289;

    @ObfuscatedName("hx.ai")
    public int field3290;

    @ObfuscatedName("hx.at")
    public int field3281;

    @ObfuscatedName("hx.ah")
    public String field3292;

    @ObfuscatedName("hx.am")
    public String field3293;

    @ObfuscatedName("hx.ak")
    public int[] field3279 = new int[3];

    @ObfuscatedName("hx.by")
    public int field3264;

    public class231(boolean arg0) {
        if (arg0) {
            if (Statics.field739.startsWith("win")) {
                this.field3268 = 1;
            } else if (Statics.field739.startsWith("mac")) {
                this.field3268 = 2;
            } else if (Statics.field739.startsWith("linux")) {
                this.field3268 = 3;
            } else {
                this.field3268 = 4;
            }
            String var2;
            try {
                var2 = System.getProperty("os.arch").toLowerCase();
            } catch (Exception var23) {
                var2 = "";
            }
            String var4;
            try {
                var4 = System.getProperty("os.version").toLowerCase();
            } catch (Exception var22) {
                var4 = "";
            }
            String var6 = "Unknown";
            String var7 = "1.1";
            try {
                var6 = System.getProperty("java.vendor");
                var7 = System.getProperty("java.version");
            } catch (Exception var21) {
            }
            if (var2.startsWith("amd64") || var2.startsWith("x86_64")) {
                this.field3269 = true;
            } else {
                this.field3269 = false;
            }
            if (this.field3268 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3274 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3274 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3274 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3274 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3274 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3274 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3274 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3274 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3274 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3274 = 10;
                }
            } else if (this.field3268 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3274 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3274 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3274 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3274 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3274 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3274 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3274 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3275 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3275 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3275 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3275 = 4;
            } else {
                this.field3275 = 5;
            }
            int var9 = 2;
            int var10 = 0;
            try {
                while (var9 < var7.length()) {
                    char var11 = var7.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 + (var11 - '0');
                    var9++;
                }
            } catch (Exception var26) {
            }
            this.field3282 = var10;
            int var13 = var7.indexOf(46, 2) + 1;
            int var14 = 0;
            try {
                while (var13 < var7.length()) {
                    char var15 = var7.charAt(var13);
                    if (var15 < '0' || var15 > '9') {
                        break;
                    }
                    var14 = var14 * 10 + (var15 - '0');
                    var13++;
                }
            } catch (Exception var25) {
            }
            this.field3277 = var14;
            int var17 = var7.indexOf(95, 4) + 1;
            int var18 = 0;
            try {
                while (var17 < var7.length()) {
                    char var19 = var7.charAt(var17);
                    if (var19 < '0' || var19 > '9') {
                        break;
                    }
                    var18 = var18 * 10 + (var19 - '0');
                    var17++;
                }
            } catch (Exception var24) {
            }
            this.field3295 = var18;
            this.field3291 = false;
            this.field3280 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3282 > 3) {
                this.field3272 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3272 = 0;
            }
            this.field3276 = 0;
        }
        if (this.field3288 == null) {
            this.field3288 = "";
        }
        if (this.field3285 == null) {
            this.field3285 = "";
        }
        if (this.field3286 == null) {
            this.field3286 = "";
        }
        if (this.field3287 == null) {
            this.field3287 = "";
        }
        if (this.field3292 == null) {
            this.field3292 = "";
        }
        if (this.field3293 == null) {
            this.field3293 = "";
        }
        this.method4059();
    }

    @ObfuscatedName("hx.x(B)V")
    public void method4059() {
        if (this.field3288.length() > 40) {
            this.field3288 = this.field3288.substring(0, 40);
        }
        if (this.field3285.length() > 40) {
            this.field3285 = this.field3285.substring(0, 40);
        }
        if (this.field3286.length() > 10) {
            this.field3286 = this.field3286.substring(0, 10);
        }
        if (this.field3287.length() > 10) {
            this.field3287 = this.field3287.substring(0, 10);
        }
    }

    @ObfuscatedName("hx.n(Leq;B)V")
    public void method4060(class154 arg0) {
        arg0.method2688(6);
        arg0.method2688(this.field3268);
        arg0.method2688(this.field3269 ? 1 : 0);
        arg0.method2688(this.field3274);
        arg0.method2688(this.field3275);
        arg0.method2688(this.field3282);
        arg0.method2688(this.field3277);
        arg0.method2688(this.field3295);
        arg0.method2688(this.field3291 ? 1 : 0);
        arg0.method2687(this.field3280);
        arg0.method2688(this.field3272);
        arg0.method2686(this.field3276);
        arg0.method2687(this.field3283);
        arg0.method2693(this.field3288);
        arg0.method2693(this.field3285);
        arg0.method2693(this.field3286);
        arg0.method2693(this.field3287);
        arg0.method2688(this.field3289);
        arg0.method2687(this.field3278);
        arg0.method2693(this.field3292);
        arg0.method2693(this.field3293);
        arg0.method2688(this.field3290);
        arg0.method2688(this.field3281);
        for (int var2 = 0; var2 < this.field3279.length; var2++) {
            arg0.method2689(this.field3279[var2]);
        }
        arg0.method2689(this.field3264);
    }

    @ObfuscatedName("hx.g(B)I")
    public int method4061() {
        byte var1 = 38;
        String var3 = this.field3288;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3285;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3286;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3287;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3292;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3293;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
