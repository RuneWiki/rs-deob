package deob;

@ObfuscatedName("kf")
public class class293 extends class194 {

    @ObfuscatedName("kf.n")
    public int field3877;

    @ObfuscatedName("kf.q")
    public boolean field3875;

    @ObfuscatedName("kf.ar")
    public int field3899;

    @ObfuscatedName("kf.am")
    public int field3881;

    @ObfuscatedName("kf.aq")
    public int field3885;

    @ObfuscatedName("kf.at")
    public int field3892;

    @ObfuscatedName("kf.az")
    public int field3891;

    @ObfuscatedName("kf.ac")
    public boolean field3883;

    @ObfuscatedName("kf.aa")
    public int field3889;

    @ObfuscatedName("kf.ay")
    public int field3890;

    @ObfuscatedName("kf.ao")
    public int field3874;

    @ObfuscatedName("kf.aw")
    public int field3870;

    @ObfuscatedName("kf.ah")
    public String field3893;

    @ObfuscatedName("kf.an")
    public String field3884;

    @ObfuscatedName("kf.af")
    public String field3895;

    @ObfuscatedName("kf.ak")
    public String field3896;

    @ObfuscatedName("kf.as")
    public int field3882;

    @ObfuscatedName("kf.ap")
    public int field3898;

    @ObfuscatedName("kf.ae")
    public int field3887;

    @ObfuscatedName("kf.ai")
    public int field3900;

    @ObfuscatedName("kf.au")
    public String field3901;

    @ObfuscatedName("kf.bp")
    public String field3902;

    @ObfuscatedName("kf.bd")
    public int[] field3903 = new int[3];

    @ObfuscatedName("kf.bs")
    public int field3904;

    public class293(boolean arg0) {
        if (arg0) {
            if (Statics.field3720.startsWith("win")) {
                this.field3877 = 1;
            } else if (Statics.field3720.startsWith("mac")) {
                this.field3877 = 2;
            } else if (Statics.field3720.startsWith("linux")) {
                this.field3877 = 3;
            } else {
                this.field3877 = 4;
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
                this.field3875 = true;
            } else {
                this.field3875 = false;
            }
            if (this.field3877 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3899 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3899 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3899 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3899 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3899 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3899 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3899 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3899 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3899 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3899 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field3899 = 11;
                }
            } else if (this.field3877 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3899 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3899 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3899 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3899 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3899 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3899 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3899 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field3899 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3881 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3881 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3881 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3881 = 4;
            } else {
                this.field3881 = 5;
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
            this.field3885 = var10;
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
            this.field3892 = var14;
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
            this.field3891 = var18;
            this.field3883 = false;
            this.field3889 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3885 > 3) {
                this.field3890 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3890 = 0;
            }
            this.field3874 = 0;
        }
        if (this.field3893 == null) {
            this.field3893 = "";
        }
        if (this.field3884 == null) {
            this.field3884 = "";
        }
        if (this.field3895 == null) {
            this.field3895 = "";
        }
        if (this.field3896 == null) {
            this.field3896 = "";
        }
        if (this.field3901 == null) {
            this.field3901 = "";
        }
        if (this.field3902 == null) {
            this.field3902 = "";
        }
        this.method4997();
    }

    @ObfuscatedName("kf.i(I)V")
    public void method4997() {
        if (this.field3893.length() > 40) {
            this.field3893 = this.field3893.substring(0, 40);
        }
        if (this.field3884.length() > 40) {
            this.field3884 = this.field3884.substring(0, 40);
        }
        if (this.field3895.length() > 10) {
            this.field3895 = this.field3895.substring(0, 10);
        }
        if (this.field3896.length() > 10) {
            this.field3896 = this.field3896.substring(0, 10);
        }
    }

    @ObfuscatedName("kf.j(Lfp;I)V")
    public void method4996(class175 arg0) {
        arg0.method3102(6);
        arg0.method3102(this.field3877);
        arg0.method3102(this.field3875 ? 1 : 0);
        arg0.method3102(this.field3899);
        arg0.method3102(this.field3881);
        arg0.method3102(this.field3885);
        arg0.method3102(this.field3892);
        arg0.method3102(this.field3891);
        arg0.method3102(this.field3883 ? 1 : 0);
        arg0.method2978(this.field3889);
        arg0.method3102(this.field3890);
        arg0.method3196(this.field3874);
        arg0.method2978(this.field3870);
        arg0.method2985(this.field3893);
        arg0.method2985(this.field3884);
        arg0.method2985(this.field3895);
        arg0.method2985(this.field3896);
        arg0.method3102(this.field3898);
        arg0.method2978(this.field3882);
        arg0.method2985(this.field3901);
        arg0.method2985(this.field3902);
        arg0.method3102(this.field3887);
        arg0.method3102(this.field3900);
        for (int var2 = 0; var2 < this.field3903.length; var2++) {
            arg0.method3136(this.field3903[var2]);
        }
        arg0.method3136(this.field3904);
    }

    @ObfuscatedName("kf.a(I)I")
    public int method4999() {
        byte var1 = 38;
        int var2 = var1 + Statics.method935(this.field3893);
        int var3 = var2 + Statics.method935(this.field3884);
        int var4 = var3 + Statics.method935(this.field3895);
        int var5 = var4 + Statics.method935(this.field3896);
        int var6 = var5 + Statics.method935(this.field3901);
        return var6 + Statics.method935(this.field3902);
    }
}
