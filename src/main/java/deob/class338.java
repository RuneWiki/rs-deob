package deob;

@ObfuscatedName("le")
public class class338 extends class217 {

    @ObfuscatedName("le.x")
    public int field4084;

    @ObfuscatedName("le.z")
    public boolean field4085;

    @ObfuscatedName("le.ac")
    public int field4092;

    @ObfuscatedName("le.as")
    public int field4104;

    @ObfuscatedName("le.aa")
    public int field4112;

    @ObfuscatedName("le.ah")
    public int field4095;

    @ObfuscatedName("le.ao")
    public int field4110;

    @ObfuscatedName("le.am")
    public boolean field4097;

    @ObfuscatedName("le.aq")
    public int field4098;

    @ObfuscatedName("le.af")
    public int field4079;

    @ObfuscatedName("le.ax")
    public int field4111;

    @ObfuscatedName("le.ag")
    public int field4101;

    @ObfuscatedName("le.ay")
    public String field4100;

    @ObfuscatedName("le.ad")
    public String field4105;

    @ObfuscatedName("le.at")
    public String field4096;

    @ObfuscatedName("le.av")
    public String field4094;

    @ObfuscatedName("le.az")
    public int field4106;

    @ObfuscatedName("le.aj")
    public int field4107;

    @ObfuscatedName("le.ar")
    public int field4108;

    @ObfuscatedName("le.au")
    public int field4109;

    @ObfuscatedName("le.an")
    public String field4102;

    @ObfuscatedName("le.bv")
    public String field4103;

    @ObfuscatedName("le.bw")
    public int[] field4113 = new int[3];

    @ObfuscatedName("le.bj")
    public int field4087;

    public class338(boolean arg0) {
        if (arg0) {
            if (Statics.field2506.startsWith("win")) {
                this.field4084 = 1;
            } else if (Statics.field2506.startsWith("mac")) {
                this.field4084 = 2;
            } else if (Statics.field2506.startsWith("linux")) {
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
                this.field4085 = true;
            } else {
                this.field4085 = false;
            }
            if (this.field4084 == 1) {
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
            } else if (this.field4084 == 2) {
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
                this.field4104 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field4104 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field4104 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field4104 = 4;
            } else {
                this.field4104 = 5;
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
            this.field4112 = var10;
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
            this.field4095 = var14;
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
            this.field4110 = var18;
            this.field4097 = false;
            this.field4098 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field4112 > 3) {
                this.field4079 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field4079 = 0;
            }
            this.field4111 = 0;
        }
        if (this.field4100 == null) {
            this.field4100 = "";
        }
        if (this.field4105 == null) {
            this.field4105 = "";
        }
        if (this.field4096 == null) {
            this.field4096 = "";
        }
        if (this.field4094 == null) {
            this.field4094 = "";
        }
        if (this.field4102 == null) {
            this.field4102 = "";
        }
        if (this.field4103 == null) {
            this.field4103 = "";
        }
        this.method5800();
    }

    @ObfuscatedName("le.c(I)V")
    public void method5800() {
        if (this.field4100.length() > 40) {
            this.field4100 = this.field4100.substring(0, 40);
        }
        if (this.field4105.length() > 40) {
            this.field4105 = this.field4105.substring(0, 40);
        }
        if (this.field4096.length() > 10) {
            this.field4096 = this.field4096.substring(0, 10);
        }
        if (this.field4094.length() > 10) {
            this.field4094 = this.field4094.substring(0, 10);
        }
    }

    @ObfuscatedName("le.i(Lgp;I)V")
    public void method5801(class195 arg0) {
        arg0.method3209(6);
        arg0.method3209(this.field4084);
        arg0.method3209(this.field4085 ? 1 : 0);
        arg0.method3209(this.field4092);
        arg0.method3209(this.field4104);
        arg0.method3209(this.field4112);
        arg0.method3209(this.field4095);
        arg0.method3209(this.field4110);
        arg0.method3209(this.field4097 ? 1 : 0);
        arg0.method3210(this.field4098);
        arg0.method3209(this.field4079);
        arg0.method3384(this.field4111);
        arg0.method3210(this.field4101);
        arg0.method3217(this.field4100);
        arg0.method3217(this.field4105);
        arg0.method3217(this.field4096);
        arg0.method3217(this.field4094);
        arg0.method3209(this.field4107);
        arg0.method3210(this.field4106);
        arg0.method3217(this.field4102);
        arg0.method3217(this.field4103);
        arg0.method3209(this.field4108);
        arg0.method3209(this.field4109);
        for (int var2 = 0; var2 < this.field4113.length; var2++) {
            arg0.method3212(this.field4113[var2]);
        }
        arg0.method3212(this.field4087);
    }

    @ObfuscatedName("le.o(I)I")
    public int method5811() {
        byte var1 = 38;
        int var2 = var1 + class195.method129(this.field4100);
        int var3 = var2 + class195.method129(this.field4105);
        int var4 = var3 + class195.method129(this.field4096);
        int var5 = var4 + class195.method129(this.field4094);
        int var6 = var5 + class195.method129(this.field4102);
        return var6 + class195.method129(this.field4103);
    }
}
