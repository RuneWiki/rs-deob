package deob;

@ObfuscatedName("hw")
public class class231 extends class128 {

    @ObfuscatedName("hw.h")
    public int field3270;

    @ObfuscatedName("hw.u")
    public boolean field3271;

    @ObfuscatedName("hw.a")
    public int field3276;

    @ObfuscatedName("hw.ax")
    public int field3291;

    @ObfuscatedName("hw.ah")
    public int field3292;

    @ObfuscatedName("hw.az")
    public int field3279;

    @ObfuscatedName("hw.at")
    public int field3280;

    @ObfuscatedName("hw.ab")
    public boolean field3281;

    @ObfuscatedName("hw.ae")
    public int field3283;

    @ObfuscatedName("hw.am")
    public int field3289;

    @ObfuscatedName("hw.ay")
    public int field3284;

    @ObfuscatedName("hw.aq")
    public int field3285;

    @ObfuscatedName("hw.aj")
    public String field3297;

    @ObfuscatedName("hw.ap")
    public String field3287;

    @ObfuscatedName("hw.ai")
    public String field3288;

    @ObfuscatedName("hw.ac")
    public String field3286;

    @ObfuscatedName("hw.av")
    public int field3277;

    @ObfuscatedName("hw.as")
    public int field3278;

    @ObfuscatedName("hw.al")
    public int field3290;

    @ObfuscatedName("hw.ag")
    public int field3293;

    @ObfuscatedName("hw.aw")
    public String field3294;

    @ObfuscatedName("hw.ad")
    public String field3295;

    @ObfuscatedName("hw.au")
    public int[] field3296 = new int[3];

    @ObfuscatedName("hw.bj")
    public int field3273;

    public class231(boolean arg0) {
        if (arg0) {
            if (Statics.field1695.startsWith("win")) {
                this.field3270 = 1;
            } else if (Statics.field1695.startsWith("mac")) {
                this.field3270 = 2;
            } else if (Statics.field1695.startsWith("linux")) {
                this.field3270 = 3;
            } else {
                this.field3270 = 4;
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
                this.field3271 = true;
            } else {
                this.field3271 = false;
            }
            if (this.field3270 == 1) {
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
            } else if (this.field3270 == 2) {
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
                this.field3291 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3291 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3291 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3291 = 4;
            } else {
                this.field3291 = 5;
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
            this.field3292 = var10;
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
            this.field3279 = var14;
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
            this.field3280 = var18;
            this.field3281 = false;
            this.field3283 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3292 > 3) {
                this.field3289 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3289 = 0;
            }
            this.field3284 = 0;
        }
        if (this.field3297 == null) {
            this.field3297 = "";
        }
        if (this.field3287 == null) {
            this.field3287 = "";
        }
        if (this.field3288 == null) {
            this.field3288 = "";
        }
        if (this.field3286 == null) {
            this.field3286 = "";
        }
        if (this.field3294 == null) {
            this.field3294 = "";
        }
        if (this.field3295 == null) {
            this.field3295 = "";
        }
        this.method4052();
    }

    @ObfuscatedName("hw.x(I)V")
    public void method4052() {
        if (this.field3297.length() > 40) {
            this.field3297 = this.field3297.substring(0, 40);
        }
        if (this.field3287.length() > 40) {
            this.field3287 = this.field3287.substring(0, 40);
        }
        if (this.field3288.length() > 10) {
            this.field3288 = this.field3288.substring(0, 10);
        }
        if (this.field3286.length() > 10) {
            this.field3286 = this.field3286.substring(0, 10);
        }
    }

    @ObfuscatedName("hw.j(Lek;I)V")
    public void method4046(class154 arg0) {
        arg0.method2651(6);
        arg0.method2651(this.field3270);
        arg0.method2651(this.field3271 ? 1 : 0);
        arg0.method2651(this.field3276);
        arg0.method2651(this.field3291);
        arg0.method2651(this.field3292);
        arg0.method2651(this.field3279);
        arg0.method2651(this.field3280);
        arg0.method2651(this.field3281 ? 1 : 0);
        arg0.method2625(this.field3283);
        arg0.method2651(this.field3289);
        arg0.method2626(this.field3284);
        arg0.method2625(this.field3285);
        arg0.method2631(this.field3297);
        arg0.method2631(this.field3287);
        arg0.method2631(this.field3288);
        arg0.method2631(this.field3286);
        arg0.method2651(this.field3278);
        arg0.method2625(this.field3277);
        arg0.method2631(this.field3294);
        arg0.method2631(this.field3295);
        arg0.method2651(this.field3290);
        arg0.method2651(this.field3293);
        for (int var2 = 0; var2 < this.field3296.length; var2++) {
            arg0.method2627(this.field3296[var2]);
        }
        arg0.method2627(this.field3273);
    }

    @ObfuscatedName("hw.c(B)I")
    public int method4047() {
        byte var1 = 38;
        int var2 = var1 + class154.method220(this.field3297);
        int var3 = var2 + class154.method220(this.field3287);
        int var4 = var3 + class154.method220(this.field3288);
        int var5 = var4 + class154.method220(this.field3286);
        int var6 = var5 + class154.method220(this.field3294);
        return var6 + class154.method220(this.field3295);
    }
}
