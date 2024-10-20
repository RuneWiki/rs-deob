package deob;

@ObfuscatedName("hu")
public class class231 extends class128 {

    @ObfuscatedName("hu.r")
    public int field3253;

    @ObfuscatedName("hu.c")
    public boolean field3271;

    @ObfuscatedName("hu.u")
    public int field3268;

    @ObfuscatedName("hu.ai")
    public int field3260;

    @ObfuscatedName("hu.aq")
    public int field3261;

    @ObfuscatedName("hu.ac")
    public int field3256;

    @ObfuscatedName("hu.ae")
    public int field3263;

    @ObfuscatedName("hu.ag")
    public boolean field3264;

    @ObfuscatedName("hu.am")
    public int field3265;

    @ObfuscatedName("hu.ap")
    public int field3257;

    @ObfuscatedName("hu.ab")
    public int field3267;

    @ObfuscatedName("hu.ax")
    public int field3250;

    @ObfuscatedName("hu.ad")
    public String field3254;

    @ObfuscatedName("hu.ah")
    public String field3279;

    @ObfuscatedName("hu.al")
    public String field3270;

    @ObfuscatedName("hu.aa")
    public String field3259;

    @ObfuscatedName("hu.an")
    public int field3273;

    @ObfuscatedName("hu.at")
    public int field3274;

    @ObfuscatedName("hu.au")
    public int field3275;

    @ObfuscatedName("hu.ak")
    public int field3276;

    @ObfuscatedName("hu.ar")
    public String field3266;

    @ObfuscatedName("hu.aj")
    public String field3278;

    @ObfuscatedName("hu.ao")
    public int[] field3272 = new int[3];

    @ObfuscatedName("hu.bn")
    public int field3280;

    public class231(boolean arg0) {
        if (arg0) {
            if (Statics.field592.startsWith("win")) {
                this.field3253 = 1;
            } else if (Statics.field592.startsWith("mac")) {
                this.field3253 = 2;
            } else if (Statics.field592.startsWith("linux")) {
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
                this.field3271 = true;
            } else {
                this.field3271 = false;
            }
            if (this.field3253 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3268 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3268 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3268 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3268 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3268 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3268 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3268 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3268 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3268 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3268 = 10;
                }
            } else if (this.field3253 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3268 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3268 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3268 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3268 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3268 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3268 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3268 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3260 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3260 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3260 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3260 = 4;
            } else {
                this.field3260 = 5;
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
            this.field3261 = var10;
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
            this.field3256 = var14;
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
            this.field3264 = false;
            this.field3265 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3261 > 3) {
                this.field3257 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3257 = 0;
            }
            this.field3267 = 0;
        }
        if (this.field3254 == null) {
            this.field3254 = "";
        }
        if (this.field3279 == null) {
            this.field3279 = "";
        }
        if (this.field3270 == null) {
            this.field3270 = "";
        }
        if (this.field3259 == null) {
            this.field3259 = "";
        }
        if (this.field3266 == null) {
            this.field3266 = "";
        }
        if (this.field3278 == null) {
            this.field3278 = "";
        }
        this.method4051();
    }

    @ObfuscatedName("hu.n(I)V")
    public void method4051() {
        if (this.field3254.length() > 40) {
            this.field3254 = this.field3254.substring(0, 40);
        }
        if (this.field3279.length() > 40) {
            this.field3279 = this.field3279.substring(0, 40);
        }
        if (this.field3270.length() > 10) {
            this.field3270 = this.field3270.substring(0, 10);
        }
        if (this.field3259.length() > 10) {
            this.field3259 = this.field3259.substring(0, 10);
        }
    }

    @ObfuscatedName("hu.d(Lfa;B)V")
    public void method4052(class161 arg0) {
        arg0.method2765(6);
        arg0.method2765(this.field3253);
        arg0.method2765(this.field3271 ? 1 : 0);
        arg0.method2765(this.field3268);
        arg0.method2765(this.field3260);
        arg0.method2765(this.field3261);
        arg0.method2765(this.field3256);
        arg0.method2765(this.field3263);
        arg0.method2765(this.field3264 ? 1 : 0);
        arg0.method2766(this.field3265);
        arg0.method2765(this.field3257);
        arg0.method2767(this.field3267);
        arg0.method2766(this.field3250);
        arg0.method2772(this.field3254);
        arg0.method2772(this.field3279);
        arg0.method2772(this.field3270);
        arg0.method2772(this.field3259);
        arg0.method2765(this.field3274);
        arg0.method2766(this.field3273);
        arg0.method2772(this.field3266);
        arg0.method2772(this.field3278);
        arg0.method2765(this.field3275);
        arg0.method2765(this.field3276);
        for (int var2 = 0; var2 < this.field3272.length; var2++) {
            arg0.method2768(this.field3272[var2]);
        }
        arg0.method2768(this.field3280);
    }

    @ObfuscatedName("hu.m(I)I")
    public int method4053() {
        byte var1 = 38;
        String var3 = this.field3254;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3279;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3270;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3259;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3266;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3278;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
