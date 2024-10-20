package deob;

@ObfuscatedName("hc")
public class class231 extends class128 {

    @ObfuscatedName("hc.n")
    public int field3269;

    @ObfuscatedName("hc.r")
    public boolean field3268;

    @ObfuscatedName("hc.g")
    public int field3272;

    @ObfuscatedName("hc.am")
    public int field3273;

    @ObfuscatedName("hc.ad")
    public int field3288;

    @ObfuscatedName("hc.ai")
    public int field3275;

    @ObfuscatedName("hc.ac")
    public int field3262;

    @ObfuscatedName("hc.ao")
    public boolean field3277;

    @ObfuscatedName("hc.as")
    public int field3278;

    @ObfuscatedName("hc.ah")
    public int field3279;

    @ObfuscatedName("hc.aw")
    public int field3280;

    @ObfuscatedName("hc.ap")
    public int field3281;

    @ObfuscatedName("hc.ak")
    public String field3282;

    @ObfuscatedName("hc.ag")
    public String field3283;

    @ObfuscatedName("hc.al")
    public String field3276;

    @ObfuscatedName("hc.an")
    public String field3285;

    @ObfuscatedName("hc.ar")
    public int field3286;

    @ObfuscatedName("hc.ab")
    public int field3287;

    @ObfuscatedName("hc.az")
    public int field3263;

    @ObfuscatedName("hc.ay")
    public int field3289;

    @ObfuscatedName("hc.av")
    public String field3290;

    @ObfuscatedName("hc.af")
    public String field3291;

    @ObfuscatedName("hc.ax")
    public int[] field3292 = new int[3];

    @ObfuscatedName("hc.bn")
    public int field3266;

    public class231(boolean arg0) {
        if (arg0) {
            if (Statics.field1213.startsWith("win")) {
                this.field3269 = 1;
            } else if (Statics.field1213.startsWith("mac")) {
                this.field3269 = 2;
            } else if (Statics.field1213.startsWith("linux")) {
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
                this.field3268 = true;
            } else {
                this.field3268 = false;
            }
            if (this.field3269 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3272 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3272 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3272 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3272 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3272 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3272 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3272 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3272 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3272 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3272 = 10;
                }
            } else if (this.field3269 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3272 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3272 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3272 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3272 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3272 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3272 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3272 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3273 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3273 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3273 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3273 = 4;
            } else {
                this.field3273 = 5;
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
            this.field3288 = var10;
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
            this.field3275 = var14;
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
            this.field3262 = var18;
            this.field3277 = false;
            this.field3278 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3288 > 3) {
                this.field3279 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3279 = 0;
            }
            this.field3280 = 0;
        }
        if (this.field3282 == null) {
            this.field3282 = "";
        }
        if (this.field3283 == null) {
            this.field3283 = "";
        }
        if (this.field3276 == null) {
            this.field3276 = "";
        }
        if (this.field3285 == null) {
            this.field3285 = "";
        }
        if (this.field3290 == null) {
            this.field3290 = "";
        }
        if (this.field3291 == null) {
            this.field3291 = "";
        }
        this.method4065();
    }

    @ObfuscatedName("hc.q(I)V")
    public void method4065() {
        if (this.field3282.length() > 40) {
            this.field3282 = this.field3282.substring(0, 40);
        }
        if (this.field3283.length() > 40) {
            this.field3283 = this.field3283.substring(0, 40);
        }
        if (this.field3276.length() > 10) {
            this.field3276 = this.field3276.substring(0, 10);
        }
        if (this.field3285.length() > 10) {
            this.field3285 = this.field3285.substring(0, 10);
        }
    }

    @ObfuscatedName("hc.d(Lel;I)V")
    public void method4066(class154 arg0) {
        arg0.method2751(6);
        arg0.method2751(this.field3269);
        arg0.method2751(this.field3268 ? 1 : 0);
        arg0.method2751(this.field3272);
        arg0.method2751(this.field3273);
        arg0.method2751(this.field3288);
        arg0.method2751(this.field3275);
        arg0.method2751(this.field3262);
        arg0.method2751(this.field3277 ? 1 : 0);
        arg0.method2664(this.field3278);
        arg0.method2751(this.field3279);
        arg0.method2794(this.field3280);
        arg0.method2664(this.field3281);
        arg0.method2658(this.field3282);
        arg0.method2658(this.field3283);
        arg0.method2658(this.field3276);
        arg0.method2658(this.field3285);
        arg0.method2751(this.field3287);
        arg0.method2664(this.field3286);
        arg0.method2658(this.field3290);
        arg0.method2658(this.field3291);
        arg0.method2751(this.field3263);
        arg0.method2751(this.field3289);
        for (int var2 = 0; var2 < this.field3292.length; var2++) {
            arg0.method2654(this.field3292[var2]);
        }
        arg0.method2654(this.field3266);
    }

    @ObfuscatedName("hc.h(I)I")
    public int method4068() {
        byte var1 = 38;
        String var3 = this.field3282;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3283;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3276;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3285;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3290;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3291;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
