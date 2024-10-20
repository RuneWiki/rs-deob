package deob;

@ObfuscatedName("ls")
public class class338 extends class217 {

    @ObfuscatedName("ls.m")
    public int field4084;

    @ObfuscatedName("ls.z")
    public boolean field4087;

    @ObfuscatedName("ls.ab")
    public int field4094;

    @ObfuscatedName("ls.ah")
    public int field4095;

    @ObfuscatedName("ls.af")
    public int field4099;

    @ObfuscatedName("ls.aq")
    public int field4097;

    @ObfuscatedName("ls.ai")
    public int field4098;

    @ObfuscatedName("ls.az")
    public boolean field4083;

    @ObfuscatedName("ls.aa")
    public int field4100;

    @ObfuscatedName("ls.am")
    public int field4101;

    @ObfuscatedName("ls.ax")
    public int field4102;

    @ObfuscatedName("ls.ad")
    public int field4115;

    @ObfuscatedName("ls.au")
    public String field4104;

    @ObfuscatedName("ls.ar")
    public String field4105;

    @ObfuscatedName("ls.an")
    public String field4106;

    @ObfuscatedName("ls.ae")
    public String field4107;

    @ObfuscatedName("ls.aw")
    public int field4108;

    @ObfuscatedName("ls.ak")
    public int field4112;

    @ObfuscatedName("ls.as")
    public int field4110;

    @ObfuscatedName("ls.aj")
    public int field4111;

    @ObfuscatedName("ls.ay")
    public String field4088;

    @ObfuscatedName("ls.bm")
    public String field4113;

    @ObfuscatedName("ls.bx")
    public int[] field4114 = new int[3];

    @ObfuscatedName("ls.bl")
    public int field4086;

    public class338(boolean arg0) {
        if (arg0) {
            if (Statics.field374.startsWith("win")) {
                this.field4084 = 1;
            } else if (Statics.field374.startsWith("mac")) {
                this.field4084 = 2;
            } else if (Statics.field374.startsWith("linux")) {
                this.field4084 = 3;
            } else {
                this.field4084 = 4;
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
                this.field4087 = true;
            } else {
                this.field4087 = false;
            }
            if (this.field4084 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field4094 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field4094 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field4094 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field4094 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field4094 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field4094 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field4094 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field4094 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field4094 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field4094 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field4094 = 11;
                }
            } else if (this.field4084 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field4094 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field4094 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field4094 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field4094 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field4094 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field4094 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field4094 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field4094 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field4095 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field4095 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field4095 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field4095 = 4;
            } else {
                this.field4095 = 5;
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
            this.field4099 = var10;
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
            this.field4097 = var14;
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
            this.field4098 = var18;
            this.field4083 = false;
            this.field4100 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field4099 > 3) {
                this.field4101 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field4101 = 0;
            }
            this.field4102 = 0;
        }
        if (this.field4104 == null) {
            this.field4104 = "";
        }
        if (this.field4105 == null) {
            this.field4105 = "";
        }
        if (this.field4106 == null) {
            this.field4106 = "";
        }
        if (this.field4107 == null) {
            this.field4107 = "";
        }
        if (this.field4088 == null) {
            this.field4088 = "";
        }
        if (this.field4113 == null) {
            this.field4113 = "";
        }
        this.method5748();
    }

    @ObfuscatedName("ls.o(I)V")
    public void method5748() {
        if (this.field4104.length() > 40) {
            this.field4104 = this.field4104.substring(0, 40);
        }
        if (this.field4105.length() > 40) {
            this.field4105 = this.field4105.substring(0, 40);
        }
        if (this.field4106.length() > 10) {
            this.field4106 = this.field4106.substring(0, 10);
        }
        if (this.field4107.length() > 10) {
            this.field4107 = this.field4107.substring(0, 10);
        }
    }

    @ObfuscatedName("ls.k(Lgc;I)V")
    public void method5744(class195 arg0) {
        arg0.method3189(6);
        arg0.method3189(this.field4084);
        arg0.method3189(this.field4087 ? 1 : 0);
        arg0.method3189(this.field4094);
        arg0.method3189(this.field4095);
        arg0.method3189(this.field4099);
        arg0.method3189(this.field4097);
        arg0.method3189(this.field4098);
        arg0.method3189(this.field4083 ? 1 : 0);
        arg0.method3190(this.field4100);
        arg0.method3189(this.field4101);
        arg0.method3191(this.field4102);
        arg0.method3190(this.field4115);
        arg0.method3197(this.field4104);
        arg0.method3197(this.field4105);
        arg0.method3197(this.field4106);
        arg0.method3197(this.field4107);
        arg0.method3189(this.field4112);
        arg0.method3190(this.field4108);
        arg0.method3197(this.field4088);
        arg0.method3197(this.field4113);
        arg0.method3189(this.field4110);
        arg0.method3189(this.field4111);
        for (int var2 = 0; var2 < this.field4114.length; var2++) {
            arg0.method3405(this.field4114[var2]);
        }
        arg0.method3405(this.field4086);
    }

    @ObfuscatedName("ls.t(B)I")
    public int method5745() {
        byte var1 = 38;
        int var2 = var1 + class195.method156(this.field4104);
        int var3 = var2 + class195.method156(this.field4105);
        int var4 = var3 + class195.method156(this.field4106);
        int var5 = var4 + class195.method156(this.field4107);
        int var6 = var5 + class195.method156(this.field4088);
        return var6 + class195.method156(this.field4113);
    }
}
