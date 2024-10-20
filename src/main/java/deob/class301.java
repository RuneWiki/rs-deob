package deob;

@ObfuscatedName("kh")
public class class301 extends class200 {

    @ObfuscatedName("kh.x")
    public int field3932;

    @ObfuscatedName("kh.e")
    public boolean field3933;

    @ObfuscatedName("kh.al")
    public int field3939;

    @ObfuscatedName("kh.ap")
    public int field3941;

    @ObfuscatedName("kh.av")
    public int field3960;

    @ObfuscatedName("kh.ak")
    public int field3943;

    @ObfuscatedName("kh.at")
    public int field3944;

    @ObfuscatedName("kh.an")
    public boolean field3956;

    @ObfuscatedName("kh.ah")
    public int field3946;

    @ObfuscatedName("kh.ay")
    public int field3947;

    @ObfuscatedName("kh.aw")
    public int field3950;

    @ObfuscatedName("kh.au")
    public int field3942;

    @ObfuscatedName("kh.ac")
    public String field3934;

    @ObfuscatedName("kh.ai")
    public String field3951;

    @ObfuscatedName("kh.ax")
    public String field3931;

    @ObfuscatedName("kh.af")
    public String field3953;

    @ObfuscatedName("kh.aa")
    public int field3954;

    @ObfuscatedName("kh.ad")
    public int field3955;

    @ObfuscatedName("kh.aj")
    public int field3929;

    @ObfuscatedName("kh.ae")
    public int field3957;

    @ObfuscatedName("kh.ar")
    public String field3958;

    @ObfuscatedName("kh.bu")
    public String field3959;

    @ObfuscatedName("kh.bk")
    public int[] field3945 = new int[3];

    @ObfuscatedName("kh.bo")
    public int field3928;

    public class301(boolean arg0) {
        if (arg0) {
            if (Statics.field1315.startsWith("win")) {
                this.field3932 = 1;
            } else if (Statics.field1315.startsWith("mac")) {
                this.field3932 = 2;
            } else if (Statics.field1315.startsWith("linux")) {
                this.field3932 = 3;
            } else {
                this.field3932 = 4;
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
                this.field3933 = true;
            } else {
                this.field3933 = false;
            }
            if (this.field3932 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3939 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3939 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3939 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3939 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3939 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3939 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3939 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3939 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3939 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3939 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field3939 = 11;
                }
            } else if (this.field3932 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3939 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3939 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3939 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3939 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3939 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3939 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3939 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field3939 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3941 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3941 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3941 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3941 = 4;
            } else {
                this.field3941 = 5;
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
            this.field3960 = var10;
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
            this.field3943 = var14;
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
            this.field3944 = var18;
            this.field3956 = false;
            this.field3946 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3960 > 3) {
                this.field3947 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3947 = 0;
            }
            this.field3950 = 0;
        }
        if (this.field3934 == null) {
            this.field3934 = "";
        }
        if (this.field3951 == null) {
            this.field3951 = "";
        }
        if (this.field3931 == null) {
            this.field3931 = "";
        }
        if (this.field3953 == null) {
            this.field3953 = "";
        }
        if (this.field3958 == null) {
            this.field3958 = "";
        }
        if (this.field3959 == null) {
            this.field3959 = "";
        }
        this.method5215();
    }

    @ObfuscatedName("kh.m(B)V")
    public void method5215() {
        if (this.field3934.length() > 40) {
            this.field3934 = this.field3934.substring(0, 40);
        }
        if (this.field3951.length() > 40) {
            this.field3951 = this.field3951.substring(0, 40);
        }
        if (this.field3931.length() > 10) {
            this.field3931 = this.field3931.substring(0, 10);
        }
        if (this.field3953.length() > 10) {
            this.field3953 = this.field3953.substring(0, 10);
        }
    }

    @ObfuscatedName("kh.p(Lfv;I)V")
    public void method5216(class181 arg0) {
        arg0.method2996(6);
        arg0.method2996(this.field3932);
        arg0.method2996(this.field3933 ? 1 : 0);
        arg0.method2996(this.field3939);
        arg0.method2996(this.field3941);
        arg0.method2996(this.field3960);
        arg0.method2996(this.field3943);
        arg0.method2996(this.field3944);
        arg0.method2996(this.field3956 ? 1 : 0);
        arg0.method2997(this.field3946);
        arg0.method2996(this.field3947);
        arg0.method2998(this.field3950);
        arg0.method2997(this.field3942);
        arg0.method3004(this.field3934);
        arg0.method3004(this.field3951);
        arg0.method3004(this.field3931);
        arg0.method3004(this.field3953);
        arg0.method2996(this.field3955);
        arg0.method2997(this.field3954);
        arg0.method3004(this.field3958);
        arg0.method3004(this.field3959);
        arg0.method2996(this.field3929);
        arg0.method2996(this.field3957);
        for (int var2 = 0; var2 < this.field3945.length; var2++) {
            arg0.method2999(this.field3945[var2]);
        }
        arg0.method2999(this.field3928);
    }

    @ObfuscatedName("kh.i(I)I")
    public int method5217() {
        byte var1 = 38;
        int var2 = var1 + class181.method67(this.field3934);
        int var3 = var2 + class181.method67(this.field3951);
        int var4 = var3 + class181.method67(this.field3931);
        int var5 = var4 + class181.method67(this.field3953);
        int var6 = var5 + class181.method67(this.field3958);
        return var6 + class181.method67(this.field3959);
    }
}
