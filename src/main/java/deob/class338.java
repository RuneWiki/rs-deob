package deob;

@ObfuscatedName("lp")
public class class338 extends class217 {

    @ObfuscatedName("lp.b")
    public int field4088;

    @ObfuscatedName("lp.e")
    public boolean field4086;

    @ObfuscatedName("lp.ay")
    public int field4092;

    @ObfuscatedName("lp.az")
    public int field4103;

    @ObfuscatedName("lp.ap")
    public int field4095;

    @ObfuscatedName("lp.ah")
    public int field4096;

    @ObfuscatedName("lp.au")
    public int field4100;

    @ObfuscatedName("lp.ax")
    public boolean field4098;

    @ObfuscatedName("lp.ar")
    public int field4107;

    @ObfuscatedName("lp.ai")
    public int field4099;

    @ObfuscatedName("lp.at")
    public int field4101;

    @ObfuscatedName("lp.ag")
    public int field4102;

    @ObfuscatedName("lp.as")
    public String field4112;

    @ObfuscatedName("lp.aw")
    public String field4104;

    @ObfuscatedName("lp.aq")
    public String field4105;

    @ObfuscatedName("lp.aa")
    public String field4111;

    @ObfuscatedName("lp.af")
    public int field4089;

    @ObfuscatedName("lp.ak")
    public int field4108;

    @ObfuscatedName("lp.ab")
    public int field4109;

    @ObfuscatedName("lp.ac")
    public int field4110;

    @ObfuscatedName("lp.ad")
    public String field4106;

    @ObfuscatedName("lp.bg")
    public String field4097;

    @ObfuscatedName("lp.br")
    public int[] field4113 = new int[3];

    @ObfuscatedName("lp.ba")
    public int field4114;

    public class338(boolean arg0) {
        if (arg0) {
            if (Statics.field2182.startsWith("win")) {
                this.field4088 = 1;
            } else if (Statics.field2182.startsWith("mac")) {
                this.field4088 = 2;
            } else if (Statics.field2182.startsWith("linux")) {
                this.field4088 = 3;
            } else {
                this.field4088 = 4;
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
                this.field4086 = true;
            } else {
                this.field4086 = false;
            }
            if (this.field4088 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field4092 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field4092 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field4092 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field4092 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field4092 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field4092 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field4092 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field4092 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field4092 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field4092 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field4092 = 11;
                }
            } else if (this.field4088 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field4092 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field4092 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field4092 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field4092 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field4092 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field4092 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field4092 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field4092 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field4103 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field4103 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field4103 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field4103 = 4;
            } else {
                this.field4103 = 5;
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
            this.field4095 = var10;
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
            this.field4096 = var14;
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
            this.field4100 = var18;
            this.field4098 = false;
            this.field4107 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field4095 > 3) {
                this.field4099 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field4099 = 0;
            }
            this.field4101 = 0;
        }
        if (this.field4112 == null) {
            this.field4112 = "";
        }
        if (this.field4104 == null) {
            this.field4104 = "";
        }
        if (this.field4105 == null) {
            this.field4105 = "";
        }
        if (this.field4111 == null) {
            this.field4111 = "";
        }
        if (this.field4106 == null) {
            this.field4106 = "";
        }
        if (this.field4097 == null) {
            this.field4097 = "";
        }
        this.method5745();
    }

    @ObfuscatedName("lp.t(I)V")
    public void method5745() {
        if (this.field4112.length() > 40) {
            this.field4112 = this.field4112.substring(0, 40);
        }
        if (this.field4104.length() > 40) {
            this.field4104 = this.field4104.substring(0, 40);
        }
        if (this.field4105.length() > 10) {
            this.field4105 = this.field4105.substring(0, 10);
        }
        if (this.field4111.length() > 10) {
            this.field4111 = this.field4111.substring(0, 10);
        }
    }

    @ObfuscatedName("lp.q(Lgb;I)V")
    public void method5739(class195 arg0) {
        arg0.method3220(6);
        arg0.method3220(this.field4088);
        arg0.method3220(this.field4086 ? 1 : 0);
        arg0.method3220(this.field4092);
        arg0.method3220(this.field4103);
        arg0.method3220(this.field4095);
        arg0.method3220(this.field4096);
        arg0.method3220(this.field4100);
        arg0.method3220(this.field4098 ? 1 : 0);
        arg0.method3323(this.field4107);
        arg0.method3220(this.field4099);
        arg0.method3222(this.field4101);
        arg0.method3323(this.field4102);
        arg0.method3353(this.field4112);
        arg0.method3353(this.field4104);
        arg0.method3353(this.field4105);
        arg0.method3353(this.field4111);
        arg0.method3220(this.field4108);
        arg0.method3323(this.field4089);
        arg0.method3353(this.field4106);
        arg0.method3353(this.field4097);
        arg0.method3220(this.field4109);
        arg0.method3220(this.field4110);
        for (int var2 = 0; var2 < this.field4113.length; var2++) {
            arg0.method3223(this.field4113[var2]);
        }
        arg0.method3223(this.field4114);
    }

    @ObfuscatedName("lp.i(I)I")
    public int method5746() {
        byte var1 = 38;
        int var2 = var1 + class195.method4178(this.field4112);
        int var3 = var2 + class195.method4178(this.field4104);
        int var4 = var3 + class195.method4178(this.field4105);
        int var5 = var4 + class195.method4178(this.field4111);
        int var6 = var5 + class195.method4178(this.field4106);
        return var6 + class195.method4178(this.field4097);
    }
}
