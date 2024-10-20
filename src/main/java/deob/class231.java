package deob;

@ObfuscatedName("hi")
public class class231 extends class128 {

    @ObfuscatedName("hi.j")
    public int field3269;

    @ObfuscatedName("hi.g")
    public boolean field3285;

    @ObfuscatedName("hi.m")
    public int field3276;

    @ObfuscatedName("hi.aa")
    public int field3281;

    @ObfuscatedName("hi.af")
    public int field3267;

    @ObfuscatedName("hi.at")
    public int field3277;

    @ObfuscatedName("hi.ap")
    public int field3273;

    @ObfuscatedName("hi.aw")
    public boolean field3279;

    @ObfuscatedName("hi.ah")
    public int field3295;

    @ObfuscatedName("hi.ag")
    public int field3274;

    @ObfuscatedName("hi.ai")
    public int field3271;

    @ObfuscatedName("hi.as")
    public int field3283;

    @ObfuscatedName("hi.ak")
    public String field3284;

    @ObfuscatedName("hi.an")
    public String field3275;

    @ObfuscatedName("hi.av")
    public String field3286;

    @ObfuscatedName("hi.ab")
    public String field3287;

    @ObfuscatedName("hi.ay")
    public int field3288;

    @ObfuscatedName("hi.am")
    public int field3289;

    @ObfuscatedName("hi.ar")
    public int field3290;

    @ObfuscatedName("hi.ad")
    public int field3291;

    @ObfuscatedName("hi.ax")
    public String field3292;

    @ObfuscatedName("hi.ac")
    public String field3293;

    @ObfuscatedName("hi.al")
    public int[] field3294 = new int[3];

    @ObfuscatedName("hi.bu")
    public int field3282;

    public class231(boolean arg0) {
        if (arg0) {
            if (Statics.field95.startsWith("win")) {
                this.field3269 = 1;
            } else if (Statics.field95.startsWith("mac")) {
                this.field3269 = 2;
            } else if (Statics.field95.startsWith("linux")) {
                this.field3269 = 3;
            } else {
                this.field3269 = 4;
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
                this.field3285 = true;
            } else {
                this.field3285 = false;
            }
            if (this.field3269 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3276 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3276 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3276 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3276 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3276 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3276 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3276 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3276 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3276 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3276 = 10;
                }
            } else if (this.field3269 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3276 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3276 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3276 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3276 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3276 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3276 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3276 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3281 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3281 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3281 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3281 = 4;
            } else {
                this.field3281 = 5;
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
            this.field3267 = var10;
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
            this.field3273 = var18;
            this.field3279 = false;
            this.field3295 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3267 > 3) {
                this.field3274 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3274 = 0;
            }
            this.field3271 = 0;
        }
        if (this.field3284 == null) {
            this.field3284 = "";
        }
        if (this.field3275 == null) {
            this.field3275 = "";
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
        this.method4069();
    }

    @ObfuscatedName("hi.b(I)V")
    public void method4069() {
        if (this.field3284.length() > 40) {
            this.field3284 = this.field3284.substring(0, 40);
        }
        if (this.field3275.length() > 40) {
            this.field3275 = this.field3275.substring(0, 40);
        }
        if (this.field3286.length() > 10) {
            this.field3286 = this.field3286.substring(0, 10);
        }
        if (this.field3287.length() > 10) {
            this.field3287 = this.field3287.substring(0, 10);
        }
    }

    @ObfuscatedName("hi.e(Lec;B)V")
    public void method4070(class154 arg0) {
        arg0.method2780(6);
        arg0.method2780(this.field3269);
        arg0.method2780(this.field3285 ? 1 : 0);
        arg0.method2780(this.field3276);
        arg0.method2780(this.field3281);
        arg0.method2780(this.field3267);
        arg0.method2780(this.field3277);
        arg0.method2780(this.field3273);
        arg0.method2780(this.field3279 ? 1 : 0);
        arg0.method2793(this.field3295);
        arg0.method2780(this.field3274);
        arg0.method2656(this.field3271);
        arg0.method2793(this.field3283);
        arg0.method2822(this.field3284);
        arg0.method2822(this.field3275);
        arg0.method2822(this.field3286);
        arg0.method2822(this.field3287);
        arg0.method2780(this.field3289);
        arg0.method2793(this.field3288);
        arg0.method2822(this.field3292);
        arg0.method2822(this.field3293);
        arg0.method2780(this.field3290);
        arg0.method2780(this.field3291);
        for (int var2 = 0; var2 < this.field3294.length; var2++) {
            arg0.method2658(this.field3294[var2]);
        }
        arg0.method2658(this.field3282);
    }

    @ObfuscatedName("hi.c(I)I")
    public int method4079() {
        byte var1 = 38;
        String var3 = this.field3284;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3275;
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
