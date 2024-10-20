package deob;

@ObfuscatedName("hu")
public class class231 extends class128 {

    @ObfuscatedName("hu.g")
    public int field3268;

    @ObfuscatedName("hu.k")
    public boolean field3279;

    @ObfuscatedName("hu.l")
    public int field3272;

    @ObfuscatedName("hu.ao")
    public int field3261;

    @ObfuscatedName("hu.ax")
    public int field3254;

    @ObfuscatedName("hu.ae")
    public int field3262;

    @ObfuscatedName("hu.al")
    public int field3263;

    @ObfuscatedName("hu.an")
    public boolean field3267;

    @ObfuscatedName("hu.aw")
    public int field3265;

    @ObfuscatedName("hu.ar")
    public int field3266;

    @ObfuscatedName("hu.as")
    public int field3253;

    @ObfuscatedName("hu.aq")
    public int field3269;

    @ObfuscatedName("hu.af")
    public String field3270;

    @ObfuscatedName("hu.aj")
    public String field3271;

    @ObfuscatedName("hu.ap")
    public String field3264;

    @ObfuscatedName("hu.ac")
    public String field3273;

    @ObfuscatedName("hu.at")
    public int field3274;

    @ObfuscatedName("hu.av")
    public int field3275;

    @ObfuscatedName("hu.am")
    public int field3252;

    @ObfuscatedName("hu.ak")
    public int field3277;

    @ObfuscatedName("hu.au")
    public String field3278;

    @ObfuscatedName("hu.ag")
    public String field3250;

    @ObfuscatedName("hu.ab")
    public int[] field3280 = new int[3];

    @ObfuscatedName("hu.bt")
    public int field3281;

    public class231(boolean arg0) {
        if (arg0) {
            if (Statics.field2870.startsWith("win")) {
                this.field3268 = 1;
            } else if (Statics.field2870.startsWith("mac")) {
                this.field3268 = 2;
            } else if (Statics.field2870.startsWith("linux")) {
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
                this.field3279 = true;
            } else {
                this.field3279 = false;
            }
            if (this.field3268 == 1) {
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
            } else if (this.field3268 == 2) {
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
                this.field3261 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3261 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3261 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3261 = 4;
            } else {
                this.field3261 = 5;
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
            this.field3254 = var10;
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
            this.field3262 = var14;
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
            this.field3263 = var18;
            this.field3267 = false;
            this.field3265 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3254 > 3) {
                this.field3266 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3266 = 0;
            }
            this.field3253 = 0;
        }
        if (this.field3270 == null) {
            this.field3270 = "";
        }
        if (this.field3271 == null) {
            this.field3271 = "";
        }
        if (this.field3264 == null) {
            this.field3264 = "";
        }
        if (this.field3273 == null) {
            this.field3273 = "";
        }
        if (this.field3278 == null) {
            this.field3278 = "";
        }
        if (this.field3250 == null) {
            this.field3250 = "";
        }
        this.method3875();
    }

    @ObfuscatedName("hu.s(I)V")
    public void method3875() {
        if (this.field3270.length() > 40) {
            this.field3270 = this.field3270.substring(0, 40);
        }
        if (this.field3271.length() > 40) {
            this.field3271 = this.field3271.substring(0, 40);
        }
        if (this.field3264.length() > 10) {
            this.field3264 = this.field3264.substring(0, 10);
        }
        if (this.field3273.length() > 10) {
            this.field3273 = this.field3273.substring(0, 10);
        }
    }

    @ObfuscatedName("hu.c(Lea;I)V")
    public void method3876(class154 arg0) {
        arg0.method2531(6);
        arg0.method2531(this.field3268);
        arg0.method2531(this.field3279 ? 1 : 0);
        arg0.method2531(this.field3272);
        arg0.method2531(this.field3261);
        arg0.method2531(this.field3254);
        arg0.method2531(this.field3262);
        arg0.method2531(this.field3263);
        arg0.method2531(this.field3267 ? 1 : 0);
        arg0.method2532(this.field3265);
        arg0.method2531(this.field3266);
        arg0.method2533(this.field3253);
        arg0.method2532(this.field3269);
        arg0.method2538(this.field3270);
        arg0.method2538(this.field3271);
        arg0.method2538(this.field3264);
        arg0.method2538(this.field3273);
        arg0.method2531(this.field3275);
        arg0.method2532(this.field3274);
        arg0.method2538(this.field3278);
        arg0.method2538(this.field3250);
        arg0.method2531(this.field3252);
        arg0.method2531(this.field3277);
        for (int var2 = 0; var2 < this.field3280.length; var2++) {
            arg0.method2534(this.field3280[var2]);
        }
        arg0.method2534(this.field3281);
    }

    @ObfuscatedName("hu.f(B)I")
    public int method3884() {
        byte var1 = 38;
        int var2 = var1 + class154.method148(this.field3270);
        int var3 = var2 + class154.method148(this.field3271);
        int var4 = var3 + class154.method148(this.field3264);
        int var5 = var4 + class154.method148(this.field3273);
        int var6 = var5 + class154.method148(this.field3278);
        return var6 + class154.method148(this.field3250);
    }
}
