package deob;

@ObfuscatedName("ln")
public class class338 extends class217 {

    @ObfuscatedName("ln.y")
    public int field4084;

    @ObfuscatedName("ln.k")
    public boolean field4085;

    @ObfuscatedName("ln.ak")
    public int field4095;

    @ObfuscatedName("ln.al")
    public int field4089;

    @ObfuscatedName("ln.af")
    public int field4090;

    @ObfuscatedName("ln.ai")
    public int field4104;

    @ObfuscatedName("ln.az")
    public int field4083;

    @ObfuscatedName("ln.aq")
    public boolean field4093;

    @ObfuscatedName("ln.ae")
    public int field4094;

    @ObfuscatedName("ln.ar")
    public int field4106;

    @ObfuscatedName("ln.at")
    public int field4097;

    @ObfuscatedName("ln.ag")
    public int field4098;

    @ObfuscatedName("ln.an")
    public String field4088;

    @ObfuscatedName("ln.ax")
    public String field4100;

    @ObfuscatedName("ln.ah")
    public String field4099;

    @ObfuscatedName("ln.ab")
    public String field4092;

    @ObfuscatedName("ln.am")
    public int field4080;

    @ObfuscatedName("ln.ay")
    public int field4103;

    @ObfuscatedName("ln.aj")
    public int field4105;

    @ObfuscatedName("ln.aa")
    public int field4102;

    @ObfuscatedName("ln.av")
    public String field4091;

    @ObfuscatedName("ln.bc")
    public String field4108;

    @ObfuscatedName("ln.br")
    public int[] field4109 = new int[3];

    @ObfuscatedName("ln.by")
    public int field4110;

    public class338(boolean arg0) {
        if (arg0) {
            if (Statics.field2205.startsWith("win")) {
                this.field4084 = 1;
            } else if (Statics.field2205.startsWith("mac")) {
                this.field4084 = 2;
            } else if (Statics.field2205.startsWith("linux")) {
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
                    this.field4095 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field4095 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field4095 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field4095 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field4095 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field4095 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field4095 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field4095 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field4095 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field4095 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field4095 = 11;
                }
            } else if (this.field4084 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field4095 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field4095 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field4095 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field4095 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field4095 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field4095 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field4095 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field4095 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field4089 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field4089 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field4089 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field4089 = 4;
            } else {
                this.field4089 = 5;
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
            this.field4090 = var10;
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
            this.field4104 = var14;
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
            this.field4083 = var18;
            this.field4093 = false;
            this.field4094 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field4090 > 3) {
                this.field4106 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field4106 = 0;
            }
            this.field4097 = 0;
        }
        if (this.field4088 == null) {
            this.field4088 = "";
        }
        if (this.field4100 == null) {
            this.field4100 = "";
        }
        if (this.field4099 == null) {
            this.field4099 = "";
        }
        if (this.field4092 == null) {
            this.field4092 = "";
        }
        if (this.field4091 == null) {
            this.field4091 = "";
        }
        if (this.field4108 == null) {
            this.field4108 = "";
        }
        this.method5787();
    }

    @ObfuscatedName("ln.d(I)V")
    public void method5787() {
        if (this.field4088.length() > 40) {
            this.field4088 = this.field4088.substring(0, 40);
        }
        if (this.field4100.length() > 40) {
            this.field4100 = this.field4100.substring(0, 40);
        }
        if (this.field4099.length() > 10) {
            this.field4099 = this.field4099.substring(0, 10);
        }
        if (this.field4092.length() > 10) {
            this.field4092 = this.field4092.substring(0, 10);
        }
    }

    @ObfuscatedName("ln.z(Lgy;I)V")
    public void method5788(class195 arg0) {
        arg0.method3243(6);
        arg0.method3243(this.field4084);
        arg0.method3243(this.field4085 ? 1 : 0);
        arg0.method3243(this.field4095);
        arg0.method3243(this.field4089);
        arg0.method3243(this.field4090);
        arg0.method3243(this.field4104);
        arg0.method3243(this.field4083);
        arg0.method3243(this.field4093 ? 1 : 0);
        arg0.method3360(this.field4094);
        arg0.method3243(this.field4106);
        arg0.method3325(this.field4097);
        arg0.method3360(this.field4098);
        arg0.method3251(this.field4088);
        arg0.method3251(this.field4100);
        arg0.method3251(this.field4099);
        arg0.method3251(this.field4092);
        arg0.method3243(this.field4103);
        arg0.method3360(this.field4080);
        arg0.method3251(this.field4091);
        arg0.method3251(this.field4108);
        arg0.method3243(this.field4105);
        arg0.method3243(this.field4102);
        for (int var2 = 0; var2 < this.field4109.length; var2++) {
            arg0.method3326(this.field4109[var2]);
        }
        arg0.method3326(this.field4110);
    }

    @ObfuscatedName("ln.n(B)I")
    public int method5786() {
        byte var1 = 38;
        int var2 = var1 + class195.method1710(this.field4088);
        int var3 = var2 + class195.method1710(this.field4100);
        int var4 = var3 + class195.method1710(this.field4099);
        int var5 = var4 + class195.method1710(this.field4092);
        int var6 = var5 + class195.method1710(this.field4091);
        return var6 + class195.method1710(this.field4108);
    }
}
