package deob;

@ObfuscatedName("hn")
public class class231 extends class128 {

    @ObfuscatedName("hn.j")
    public int field3257;

    @ObfuscatedName("hn.q")
    public boolean field3258;

    @ObfuscatedName("hn.l")
    public int field3275;

    @ObfuscatedName("hn.ah")
    public int field3262;

    @ObfuscatedName("hn.aa")
    public int field3256;

    @ObfuscatedName("hn.ai")
    public int field3264;

    @ObfuscatedName("hn.af")
    public int field3265;

    @ObfuscatedName("hn.aj")
    public boolean field3266;

    @ObfuscatedName("hn.am")
    public int field3260;

    @ObfuscatedName("hn.ad")
    public int field3263;

    @ObfuscatedName("hn.ao")
    public int field3269;

    @ObfuscatedName("hn.ac")
    public int field3270;

    @ObfuscatedName("hn.ag")
    public String field3271;

    @ObfuscatedName("hn.at")
    public String field3272;

    @ObfuscatedName("hn.au")
    public String field3273;

    @ObfuscatedName("hn.ax")
    public String field3274;

    @ObfuscatedName("hn.ae")
    public int field3255;

    @ObfuscatedName("hn.ab")
    public int field3276;

    @ObfuscatedName("hn.al")
    public int field3268;

    @ObfuscatedName("hn.az")
    public int field3278;

    @ObfuscatedName("hn.av")
    public String field3279;

    @ObfuscatedName("hn.ak")
    public String field3261;

    @ObfuscatedName("hn.an")
    public int[] field3281 = new int[3];

    @ObfuscatedName("hn.bb")
    public int field3277;

    public class231(boolean arg0) {
        if (arg0) {
            if (Statics.field1196.startsWith("win")) {
                this.field3257 = 1;
            } else if (Statics.field1196.startsWith("mac")) {
                this.field3257 = 2;
            } else if (Statics.field1196.startsWith("linux")) {
                this.field3257 = 3;
            } else {
                this.field3257 = 4;
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
                this.field3258 = true;
            } else {
                this.field3258 = false;
            }
            if (this.field3257 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3275 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3275 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3275 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3275 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3275 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3275 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3275 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3275 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3275 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3275 = 10;
                }
            } else if (this.field3257 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3275 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3275 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3275 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3275 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3275 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3275 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3275 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3262 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3262 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3262 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3262 = 4;
            } else {
                this.field3262 = 5;
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
            this.field3256 = var10;
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
            this.field3260 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3256 > 3) {
                this.field3263 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3263 = 0;
            }
            this.field3269 = 0;
        }
        if (this.field3271 == null) {
            this.field3271 = "";
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
        if (this.field3261 == null) {
            this.field3261 = "";
        }
        this.method4005();
    }

    @ObfuscatedName("hn.k(B)V")
    public void method4005() {
        if (this.field3271.length() > 40) {
            this.field3271 = this.field3271.substring(0, 40);
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

    @ObfuscatedName("hn.y(Lfm;I)V")
    public void method4011(class161 arg0) {
        arg0.method2718(6);
        arg0.method2718(this.field3257);
        arg0.method2718(this.field3258 ? 1 : 0);
        arg0.method2718(this.field3275);
        arg0.method2718(this.field3262);
        arg0.method2718(this.field3256);
        arg0.method2718(this.field3264);
        arg0.method2718(this.field3265);
        arg0.method2718(this.field3266 ? 1 : 0);
        arg0.method2900(this.field3260);
        arg0.method2718(this.field3263);
        arg0.method2720(this.field3269);
        arg0.method2900(this.field3270);
        arg0.method2725(this.field3271);
        arg0.method2725(this.field3272);
        arg0.method2725(this.field3273);
        arg0.method2725(this.field3274);
        arg0.method2718(this.field3276);
        arg0.method2900(this.field3255);
        arg0.method2725(this.field3279);
        arg0.method2725(this.field3261);
        arg0.method2718(this.field3268);
        arg0.method2718(this.field3278);
        for (int var2 = 0; var2 < this.field3281.length; var2++) {
            arg0.method2863(this.field3281[var2]);
        }
        arg0.method2863(this.field3277);
    }

    @ObfuscatedName("hn.o(B)I")
    public int method4007() {
        byte var1 = 38;
        String var3 = this.field3271;
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
        String var23 = this.field3261;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
