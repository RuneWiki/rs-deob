package deob;

@ObfuscatedName("ku")
public class class295 extends class196 {

    @ObfuscatedName("ku.t")
    public int field3904;

    @ObfuscatedName("ku.p")
    public boolean field3894;

    @ObfuscatedName("ku.j")
    public int field3882;

    @ObfuscatedName("ku.af")
    public int field3884;

    @ObfuscatedName("ku.aa")
    public int field3887;

    @ObfuscatedName("ku.aq")
    public int field3892;

    @ObfuscatedName("ku.aj")
    public int field3885;

    @ObfuscatedName("ku.as")
    public boolean field3888;

    @ObfuscatedName("ku.av")
    public int field3889;

    @ObfuscatedName("ku.ag")
    public int field3890;

    @ObfuscatedName("ku.ax")
    public int field3886;

    @ObfuscatedName("ku.ad")
    public int field3878;

    @ObfuscatedName("ku.ae")
    public String field3893;

    @ObfuscatedName("ku.ac")
    public String field3903;

    @ObfuscatedName("ku.az")
    public String field3875;

    @ObfuscatedName("ku.ah")
    public String field3896;

    @ObfuscatedName("ku.at")
    public int field3897;

    @ObfuscatedName("ku.al")
    public int field3898;

    @ObfuscatedName("ku.au")
    public int field3899;

    @ObfuscatedName("ku.ak")
    public int field3900;

    @ObfuscatedName("ku.aw")
    public String field3901;

    @ObfuscatedName("ku.an")
    public String field3902;

    @ObfuscatedName("ku.ai")
    public int[] field3895 = new int[3];

    @ObfuscatedName("ku.bk")
    public int field3879;

    public class295(boolean arg0) {
        if (arg0) {
            if (Statics.field2340.startsWith("win")) {
                this.field3904 = 1;
            } else if (Statics.field2340.startsWith("mac")) {
                this.field3904 = 2;
            } else if (Statics.field2340.startsWith("linux")) {
                this.field3904 = 3;
            } else {
                this.field3904 = 4;
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
                this.field3894 = true;
            } else {
                this.field3894 = false;
            }
            if (this.field3904 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3882 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3882 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3882 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3882 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3882 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3882 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3882 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3882 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3882 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3882 = 10;
                }
            } else if (this.field3904 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3882 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3882 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3882 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3882 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3882 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3882 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3882 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3884 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3884 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3884 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3884 = 4;
            } else {
                this.field3884 = 5;
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
            this.field3887 = var10;
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
            this.field3885 = var18;
            this.field3888 = false;
            this.field3889 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3887 > 3) {
                this.field3890 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3890 = 0;
            }
            this.field3886 = 0;
        }
        if (this.field3893 == null) {
            this.field3893 = "";
        }
        if (this.field3903 == null) {
            this.field3903 = "";
        }
        if (this.field3875 == null) {
            this.field3875 = "";
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
        this.method5078();
    }

    @ObfuscatedName("ku.s(I)V")
    public void method5078() {
        if (this.field3893.length() > 40) {
            this.field3893 = this.field3893.substring(0, 40);
        }
        if (this.field3903.length() > 40) {
            this.field3903 = this.field3903.substring(0, 40);
        }
        if (this.field3875.length() > 10) {
            this.field3875 = this.field3875.substring(0, 10);
        }
        if (this.field3896.length() > 10) {
            this.field3896 = this.field3896.substring(0, 10);
        }
    }

    @ObfuscatedName("ku.c(Lfs;I)V")
    public void method5079(class177 arg0) {
        arg0.method3129(6);
        arg0.method3129(this.field3904);
        arg0.method3129(this.field3894 ? 1 : 0);
        arg0.method3129(this.field3882);
        arg0.method3129(this.field3884);
        arg0.method3129(this.field3887);
        arg0.method3129(this.field3892);
        arg0.method3129(this.field3885);
        arg0.method3129(this.field3888 ? 1 : 0);
        arg0.method2951(this.field3889);
        arg0.method3129(this.field3890);
        arg0.method2952(this.field3886);
        arg0.method2951(this.field3878);
        arg0.method2957(this.field3893);
        arg0.method2957(this.field3903);
        arg0.method2957(this.field3875);
        arg0.method2957(this.field3896);
        arg0.method3129(this.field3898);
        arg0.method2951(this.field3897);
        arg0.method2957(this.field3901);
        arg0.method2957(this.field3902);
        arg0.method3129(this.field3899);
        arg0.method3129(this.field3900);
        for (int var2 = 0; var2 < this.field3895.length; var2++) {
            arg0.method2953(this.field3895[var2]);
        }
        arg0.method2953(this.field3879);
    }

    @ObfuscatedName("ku.f(I)I")
    public int method5080() {
        byte var1 = 38;
        String var3 = this.field3893;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3903;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3875;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3896;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3901;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3902;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
