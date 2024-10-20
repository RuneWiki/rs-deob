package deob;

@ObfuscatedName("hz")
public class class231 extends class128 {

    @ObfuscatedName("hz.k")
    public int field3253;

    @ObfuscatedName("hz.j")
    public boolean field3254;

    @ObfuscatedName("hz.b")
    public int field3260;

    @ObfuscatedName("hz.aj")
    public int field3259;

    @ObfuscatedName("hz.ax")
    public int field3255;

    @ObfuscatedName("hz.ak")
    public int field3264;

    @ObfuscatedName("hz.ar")
    public int field3265;

    @ObfuscatedName("hz.aw")
    public boolean field3266;

    @ObfuscatedName("hz.ay")
    public int field3276;

    @ObfuscatedName("hz.av")
    public int field3268;

    @ObfuscatedName("hz.ag")
    public int field3277;

    @ObfuscatedName("hz.ao")
    public int field3270;

    @ObfuscatedName("hz.ab")
    public String field3263;

    @ObfuscatedName("hz.an")
    public String field3272;

    @ObfuscatedName("hz.ac")
    public String field3273;

    @ObfuscatedName("hz.al")
    public String field3274;

    @ObfuscatedName("hz.ae")
    public int field3275;

    @ObfuscatedName("hz.ap")
    public int field3258;

    @ObfuscatedName("hz.au")
    public int field3278;

    @ObfuscatedName("hz.aq")
    public int field3269;

    @ObfuscatedName("hz.at")
    public String field3279;

    @ObfuscatedName("hz.az")
    public String field3280;

    @ObfuscatedName("hz.as")
    public int[] field3281 = new int[3];

    @ObfuscatedName("hz.be")
    public int field3282;

    public class231(boolean arg0) {
        if (arg0) {
            if (Statics.field1535.startsWith("win")) {
                this.field3253 = 1;
            } else if (Statics.field1535.startsWith("mac")) {
                this.field3253 = 2;
            } else if (Statics.field1535.startsWith("linux")) {
                this.field3253 = 3;
            } else {
                this.field3253 = 4;
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
                this.field3254 = true;
            } else {
                this.field3254 = false;
            }
            if (this.field3253 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3260 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3260 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3260 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3260 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3260 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3260 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3260 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3260 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3260 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3260 = 10;
                }
            } else if (this.field3253 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3260 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3260 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3260 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3260 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3260 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3260 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3260 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3259 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3259 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3259 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3259 = 4;
            } else {
                this.field3259 = 5;
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
            this.field3255 = var10;
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
            this.field3264 = var14;
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
            this.field3265 = var18;
            this.field3266 = false;
            this.field3276 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3255 > 3) {
                this.field3268 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3268 = 0;
            }
            this.field3277 = 0;
        }
        if (this.field3263 == null) {
            this.field3263 = "";
        }
        if (this.field3272 == null) {
            this.field3272 = "";
        }
        if (this.field3273 == null) {
            this.field3273 = "";
        }
        if (this.field3274 == null) {
            this.field3274 = "";
        }
        if (this.field3279 == null) {
            this.field3279 = "";
        }
        if (this.field3280 == null) {
            this.field3280 = "";
        }
        this.method4002();
    }

    @ObfuscatedName("hz.p(I)V")
    public void method4002() {
        if (this.field3263.length() > 40) {
            this.field3263 = this.field3263.substring(0, 40);
        }
        if (this.field3272.length() > 40) {
            this.field3272 = this.field3272.substring(0, 40);
        }
        if (this.field3273.length() > 10) {
            this.field3273 = this.field3273.substring(0, 10);
        }
        if (this.field3274.length() > 10) {
            this.field3274 = this.field3274.substring(0, 10);
        }
    }

    @ObfuscatedName("hz.g(Lev;B)V")
    public void method3994(class154 arg0) {
        arg0.method2578(6);
        arg0.method2578(this.field3253);
        arg0.method2578(this.field3254 ? 1 : 0);
        arg0.method2578(this.field3260);
        arg0.method2578(this.field3259);
        arg0.method2578(this.field3255);
        arg0.method2578(this.field3264);
        arg0.method2578(this.field3265);
        arg0.method2578(this.field3266 ? 1 : 0);
        arg0.method2616(this.field3276);
        arg0.method2578(this.field3268);
        arg0.method2580(this.field3277);
        arg0.method2616(this.field3270);
        arg0.method2668(this.field3263);
        arg0.method2668(this.field3272);
        arg0.method2668(this.field3273);
        arg0.method2668(this.field3274);
        arg0.method2578(this.field3258);
        arg0.method2616(this.field3275);
        arg0.method2668(this.field3279);
        arg0.method2668(this.field3280);
        arg0.method2578(this.field3278);
        arg0.method2578(this.field3269);
        for (int var2 = 0; var2 < this.field3281.length; var2++) {
            arg0.method2581(this.field3281[var2]);
        }
        arg0.method2581(this.field3282);
    }

    @ObfuscatedName("hz.x(I)I")
    public int method3993() {
        byte var1 = 38;
        String var3 = this.field3263;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3272;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3273;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3274;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3279;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3280;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
