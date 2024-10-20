package deob;

@ObfuscatedName("hq")
public class class231 extends class128 {

    @ObfuscatedName("hq.c")
    public int field3251;

    @ObfuscatedName("hq.d")
    public boolean field3252;

    @ObfuscatedName("hq.o")
    public int field3281;

    @ObfuscatedName("hq.af")
    public int field3260;

    @ObfuscatedName("hq.aa")
    public int field3276;

    @ObfuscatedName("hq.ax")
    public int field3271;

    @ObfuscatedName("hq.ai")
    public int field3263;

    @ObfuscatedName("hq.ah")
    public boolean field3264;

    @ObfuscatedName("hq.av")
    public int field3265;

    @ObfuscatedName("hq.az")
    public int field3278;

    @ObfuscatedName("hq.aw")
    public int field3256;

    @ObfuscatedName("hq.ak")
    public int field3269;

    @ObfuscatedName("hq.aq")
    public String field3248;

    @ObfuscatedName("hq.ac")
    public String field3261;

    @ObfuscatedName("hq.am")
    public String field3272;

    @ObfuscatedName("hq.ay")
    public String field3273;

    @ObfuscatedName("hq.ar")
    public int field3274;

    @ObfuscatedName("hq.ab")
    public int field3275;

    @ObfuscatedName("hq.as")
    public int field3268;

    @ObfuscatedName("hq.ap")
    public int field3277;

    @ObfuscatedName("hq.ae")
    public String field3270;

    @ObfuscatedName("hq.ao")
    public String field3279;

    @ObfuscatedName("hq.au")
    public int[] field3280 = new int[3];

    @ObfuscatedName("hq.bw")
    public int field3266;

    public class231(boolean arg0) {
        if (arg0) {
            if (Statics.field208.startsWith("win")) {
                this.field3251 = 1;
            } else if (Statics.field208.startsWith("mac")) {
                this.field3251 = 2;
            } else if (Statics.field208.startsWith("linux")) {
                this.field3251 = 3;
            } else {
                this.field3251 = 4;
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
                this.field3252 = true;
            } else {
                this.field3252 = false;
            }
            if (this.field3251 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3281 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3281 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3281 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3281 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3281 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3281 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3281 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3281 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3281 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3281 = 10;
                }
            } else if (this.field3251 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3281 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3281 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3281 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3281 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3281 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3281 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3281 = 26;
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
            this.field3276 = var10;
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
            this.field3271 = var14;
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
            if (this.field3276 > 3) {
                this.field3278 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3278 = 0;
            }
            this.field3256 = 0;
        }
        if (this.field3248 == null) {
            this.field3248 = "";
        }
        if (this.field3261 == null) {
            this.field3261 = "";
        }
        if (this.field3272 == null) {
            this.field3272 = "";
        }
        if (this.field3273 == null) {
            this.field3273 = "";
        }
        if (this.field3270 == null) {
            this.field3270 = "";
        }
        if (this.field3279 == null) {
            this.field3279 = "";
        }
        this.method4002();
    }

    @ObfuscatedName("hq.u(I)V")
    public void method4002() {
        if (this.field3248.length() > 40) {
            this.field3248 = this.field3248.substring(0, 40);
        }
        if (this.field3261.length() > 40) {
            this.field3261 = this.field3261.substring(0, 40);
        }
        if (this.field3272.length() > 10) {
            this.field3272 = this.field3272.substring(0, 10);
        }
        if (this.field3273.length() > 10) {
            this.field3273 = this.field3273.substring(0, 10);
        }
    }

    @ObfuscatedName("hq.x(Len;I)V")
    public void method4005(class154 arg0) {
        arg0.method2573(6);
        arg0.method2573(this.field3251);
        arg0.method2573(this.field3252 ? 1 : 0);
        arg0.method2573(this.field3281);
        arg0.method2573(this.field3260);
        arg0.method2573(this.field3276);
        arg0.method2573(this.field3271);
        arg0.method2573(this.field3263);
        arg0.method2573(this.field3264 ? 1 : 0);
        arg0.method2731(this.field3265);
        arg0.method2573(this.field3278);
        arg0.method2727(this.field3256);
        arg0.method2731(this.field3269);
        arg0.method2580(this.field3248);
        arg0.method2580(this.field3261);
        arg0.method2580(this.field3272);
        arg0.method2580(this.field3273);
        arg0.method2573(this.field3275);
        arg0.method2731(this.field3274);
        arg0.method2580(this.field3270);
        arg0.method2580(this.field3279);
        arg0.method2573(this.field3268);
        arg0.method2573(this.field3277);
        for (int var2 = 0; var2 < this.field3280.length; var2++) {
            arg0.method2576(this.field3280[var2]);
        }
        arg0.method2576(this.field3266);
    }

    @ObfuscatedName("hq.i(I)I")
    public int method4008() {
        byte var1 = 38;
        int var2 = var1 + class154.method2120(this.field3248);
        int var3 = var2 + class154.method2120(this.field3261);
        int var4 = var3 + class154.method2120(this.field3272);
        int var5 = var4 + class154.method2120(this.field3273);
        int var6 = var5 + class154.method2120(this.field3270);
        return var6 + class154.method2120(this.field3279);
    }
}
