package deob;

@ObfuscatedName("hf")
public class class231 extends class128 {

    @ObfuscatedName("hf.n")
    public int field3252;

    @ObfuscatedName("hf.a")
    public boolean field3253;

    @ObfuscatedName("hf.b")
    public int field3258;

    @ObfuscatedName("hf.ay")
    public int field3259;

    @ObfuscatedName("hf.ap")
    public int field3260;

    @ObfuscatedName("hf.aj")
    public int field3261;

    @ObfuscatedName("hf.aw")
    public int field3262;

    @ObfuscatedName("hf.am")
    public boolean field3263;

    @ObfuscatedName("hf.av")
    public int field3264;

    @ObfuscatedName("hf.az")
    public int field3250;

    @ObfuscatedName("hf.ad")
    public int field3249;

    @ObfuscatedName("hf.ab")
    public int field3267;

    @ObfuscatedName("hf.al")
    public String field3273;

    @ObfuscatedName("hf.as")
    public String field3269;

    @ObfuscatedName("hf.ar")
    public String field3270;

    @ObfuscatedName("hf.at")
    public String field3277;

    @ObfuscatedName("hf.ax")
    public int field3272;

    @ObfuscatedName("hf.ao")
    public int field3278;

    @ObfuscatedName("hf.ah")
    public int field3274;

    @ObfuscatedName("hf.ac")
    public int field3271;

    @ObfuscatedName("hf.ae")
    public String field3276;

    @ObfuscatedName("hf.au")
    public String field3251;

    @ObfuscatedName("hf.ag")
    public int[] field3248 = new int[3];

    @ObfuscatedName("hf.bq")
    public int field3279;

    public class231(boolean arg0) {
        if (arg0) {
            if (Statics.field1463.startsWith("win")) {
                this.field3252 = 1;
            } else if (Statics.field1463.startsWith("mac")) {
                this.field3252 = 2;
            } else if (Statics.field1463.startsWith("linux")) {
                this.field3252 = 3;
            } else {
                this.field3252 = 4;
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
                this.field3253 = true;
            } else {
                this.field3253 = false;
            }
            if (this.field3252 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3258 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3258 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3258 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3258 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3258 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3258 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3258 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3258 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3258 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3258 = 10;
                }
            } else if (this.field3252 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3258 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3258 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3258 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3258 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3258 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3258 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3258 = 26;
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
            this.field3260 = var10;
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
            this.field3261 = var14;
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
            this.field3263 = false;
            this.field3264 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3260 > 3) {
                this.field3250 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3250 = 0;
            }
            this.field3249 = 0;
        }
        if (this.field3273 == null) {
            this.field3273 = "";
        }
        if (this.field3269 == null) {
            this.field3269 = "";
        }
        if (this.field3270 == null) {
            this.field3270 = "";
        }
        if (this.field3277 == null) {
            this.field3277 = "";
        }
        if (this.field3276 == null) {
            this.field3276 = "";
        }
        if (this.field3251 == null) {
            this.field3251 = "";
        }
        this.method3922();
    }

    @ObfuscatedName("hf.i(B)V")
    public void method3922() {
        if (this.field3273.length() > 40) {
            this.field3273 = this.field3273.substring(0, 40);
        }
        if (this.field3269.length() > 40) {
            this.field3269 = this.field3269.substring(0, 40);
        }
        if (this.field3270.length() > 10) {
            this.field3270 = this.field3270.substring(0, 10);
        }
        if (this.field3277.length() > 10) {
            this.field3277 = this.field3277.substring(0, 10);
        }
    }

    @ObfuscatedName("hf.e(Let;B)V")
    public void method3929(class154 arg0) {
        arg0.method2746(6);
        arg0.method2746(this.field3252);
        arg0.method2746(this.field3253 ? 1 : 0);
        arg0.method2746(this.field3258);
        arg0.method2746(this.field3259);
        arg0.method2746(this.field3260);
        arg0.method2746(this.field3261);
        arg0.method2746(this.field3262);
        arg0.method2746(this.field3263 ? 1 : 0);
        arg0.method2560(this.field3264);
        arg0.method2746(this.field3250);
        arg0.method2561(this.field3249);
        arg0.method2560(this.field3267);
        arg0.method2565(this.field3273);
        arg0.method2565(this.field3269);
        arg0.method2565(this.field3270);
        arg0.method2565(this.field3277);
        arg0.method2746(this.field3278);
        arg0.method2560(this.field3272);
        arg0.method2565(this.field3276);
        arg0.method2565(this.field3251);
        arg0.method2746(this.field3274);
        arg0.method2746(this.field3271);
        for (int var2 = 0; var2 < this.field3248.length; var2++) {
            arg0.method2562(this.field3248[var2]);
        }
        arg0.method2562(this.field3279);
    }

    @ObfuscatedName("hf.f(I)I")
    public int method3924() {
        byte var1 = 38;
        String var3 = this.field3273;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3269;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3270;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3277;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3276;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3251;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
