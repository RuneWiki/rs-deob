package deob;

@ObfuscatedName("lo")
public class class338 extends class217 {

    @ObfuscatedName("lo.l")
    public int field4086;

    @ObfuscatedName("lo.s")
    public boolean field4087;

    @ObfuscatedName("lo.ax")
    public int field4091;

    @ObfuscatedName("lo.as")
    public int field4092;

    @ObfuscatedName("lo.av")
    public int field4093;

    @ObfuscatedName("lo.ao")
    public int field4094;

    @ObfuscatedName("lo.ak")
    public int field4095;

    @ObfuscatedName("lo.ad")
    public boolean field4105;

    @ObfuscatedName("lo.az")
    public int field4097;

    @ObfuscatedName("lo.ab")
    public int field4098;

    @ObfuscatedName("lo.af")
    public int field4082;

    @ObfuscatedName("lo.ah")
    public int field4103;

    @ObfuscatedName("lo.au")
    public String field4102;

    @ObfuscatedName("lo.ap")
    public String field4100;

    @ObfuscatedName("lo.at")
    public String field4090;

    @ObfuscatedName("lo.am")
    public String field4083;

    @ObfuscatedName("lo.an")
    public int field4106;

    @ObfuscatedName("lo.ae")
    public int field4107;

    @ObfuscatedName("lo.aw")
    public int field4108;

    @ObfuscatedName("lo.ar")
    public int field4109;

    @ObfuscatedName("lo.aq")
    public String field4110;

    @ObfuscatedName("lo.bq")
    public String field4111;

    @ObfuscatedName("lo.bi")
    public int[] field4112 = new int[3];

    @ObfuscatedName("lo.bo")
    public int field4113;

    public class338(boolean arg0) {
        if (arg0) {
            if (Statics.field2204.startsWith("win")) {
                this.field4086 = 1;
            } else if (Statics.field2204.startsWith("mac")) {
                this.field4086 = 2;
            } else if (Statics.field2204.startsWith("linux")) {
                this.field4086 = 3;
            } else {
                this.field4086 = 4;
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
            if (this.field4086 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field4091 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field4091 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field4091 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field4091 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field4091 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field4091 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field4091 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field4091 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field4091 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field4091 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field4091 = 11;
                }
            } else if (this.field4086 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field4091 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field4091 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field4091 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field4091 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field4091 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field4091 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field4091 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field4091 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field4092 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field4092 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field4092 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field4092 = 4;
            } else {
                this.field4092 = 5;
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
            this.field4093 = var10;
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
            this.field4094 = var14;
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
            this.field4095 = var18;
            this.field4105 = false;
            this.field4097 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field4093 > 3) {
                this.field4098 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field4098 = 0;
            }
            this.field4082 = 0;
        }
        if (this.field4102 == null) {
            this.field4102 = "";
        }
        if (this.field4100 == null) {
            this.field4100 = "";
        }
        if (this.field4090 == null) {
            this.field4090 = "";
        }
        if (this.field4083 == null) {
            this.field4083 = "";
        }
        if (this.field4110 == null) {
            this.field4110 = "";
        }
        if (this.field4111 == null) {
            this.field4111 = "";
        }
        this.method5826();
    }

    @ObfuscatedName("lo.g(I)V")
    public void method5826() {
        if (this.field4102.length() > 40) {
            this.field4102 = this.field4102.substring(0, 40);
        }
        if (this.field4100.length() > 40) {
            this.field4100 = this.field4100.substring(0, 40);
        }
        if (this.field4090.length() > 10) {
            this.field4090 = this.field4090.substring(0, 10);
        }
        if (this.field4083.length() > 10) {
            this.field4083 = this.field4083.substring(0, 10);
        }
    }

    @ObfuscatedName("lo.e(Lgg;B)V")
    public void method5828(class195 arg0) {
        arg0.method3363(6);
        arg0.method3363(this.field4086);
        arg0.method3363(this.field4087 ? 1 : 0);
        arg0.method3363(this.field4091);
        arg0.method3363(this.field4092);
        arg0.method3363(this.field4093);
        arg0.method3363(this.field4094);
        arg0.method3363(this.field4095);
        arg0.method3363(this.field4105 ? 1 : 0);
        arg0.method3476(this.field4097);
        arg0.method3363(this.field4098);
        arg0.method3358(this.field4082);
        arg0.method3476(this.field4103);
        arg0.method3301(this.field4102);
        arg0.method3301(this.field4100);
        arg0.method3301(this.field4090);
        arg0.method3301(this.field4083);
        arg0.method3363(this.field4107);
        arg0.method3476(this.field4106);
        arg0.method3301(this.field4110);
        arg0.method3301(this.field4111);
        arg0.method3363(this.field4108);
        arg0.method3363(this.field4109);
        for (int var2 = 0; var2 < this.field4112.length; var2++) {
            arg0.method3319(this.field4112[var2]);
        }
        arg0.method3319(this.field4113);
    }

    @ObfuscatedName("lo.b(I)I")
    public int method5835() {
        byte var1 = 38;
        int var2 = var1 + class195.method111(this.field4102);
        int var3 = var2 + class195.method111(this.field4100);
        int var4 = var3 + class195.method111(this.field4090);
        int var5 = var4 + class195.method111(this.field4083);
        int var6 = var5 + class195.method111(this.field4110);
        return var6 + class195.method111(this.field4111);
    }
}
