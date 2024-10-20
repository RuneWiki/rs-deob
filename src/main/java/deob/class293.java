package deob;

@ObfuscatedName("kj")
public class class293 extends class194 {

    @ObfuscatedName("kj.k")
    public int field3858;

    @ObfuscatedName("kj.v")
    public boolean field3859;

    @ObfuscatedName("kj.j")
    public int field3876;

    @ObfuscatedName("kj.ao")
    public int field3865;

    @ObfuscatedName("kj.al")
    public int field3872;

    @ObfuscatedName("kj.ae")
    public int field3867;

    @ObfuscatedName("kj.ax")
    public int field3868;

    @ObfuscatedName("kj.az")
    public boolean field3869;

    @ObfuscatedName("kj.aw")
    public int field3870;

    @ObfuscatedName("kj.ac")
    public int field3881;

    @ObfuscatedName("kj.ad")
    public int field3880;

    @ObfuscatedName("kj.at")
    public int field3873;

    @ObfuscatedName("kj.af")
    public String field3874;

    @ObfuscatedName("kj.am")
    public String field3875;

    @ObfuscatedName("kj.aq")
    public String field3864;

    @ObfuscatedName("kj.as")
    public String field3877;

    @ObfuscatedName("kj.ab")
    public int field3878;

    @ObfuscatedName("kj.ap")
    public int field3879;

    @ObfuscatedName("kj.ai")
    public int field3854;

    @ObfuscatedName("kj.an")
    public int field3885;

    @ObfuscatedName("kj.ar")
    public String field3882;

    @ObfuscatedName("kj.aj")
    public String field3871;

    @ObfuscatedName("kj.aa")
    public int[] field3884 = new int[3];

    @ObfuscatedName("kj.bn")
    public int field3863;

    public class293(boolean arg0) {
        if (arg0) {
            if (Statics.field297.startsWith("win")) {
                this.field3858 = 1;
            } else if (Statics.field297.startsWith("mac")) {
                this.field3858 = 2;
            } else if (Statics.field297.startsWith("linux")) {
                this.field3858 = 3;
            } else {
                this.field3858 = 4;
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
                this.field3859 = true;
            } else {
                this.field3859 = false;
            }
            if (this.field3858 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3876 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3876 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3876 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3876 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3876 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3876 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3876 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3876 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3876 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3876 = 10;
                }
            } else if (this.field3858 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3876 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3876 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3876 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3876 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3876 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3876 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3876 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3865 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3865 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3865 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3865 = 4;
            } else {
                this.field3865 = 5;
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
            this.field3872 = var10;
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
            this.field3867 = var14;
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
            this.field3868 = var18;
            this.field3869 = false;
            this.field3870 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3872 > 3) {
                this.field3881 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3881 = 0;
            }
            this.field3880 = 0;
        }
        if (this.field3874 == null) {
            this.field3874 = "";
        }
        if (this.field3875 == null) {
            this.field3875 = "";
        }
        if (this.field3864 == null) {
            this.field3864 = "";
        }
        if (this.field3877 == null) {
            this.field3877 = "";
        }
        if (this.field3882 == null) {
            this.field3882 = "";
        }
        if (this.field3871 == null) {
            this.field3871 = "";
        }
        this.method5085();
    }

    @ObfuscatedName("kj.e(I)V")
    public void method5085() {
        if (this.field3874.length() > 40) {
            this.field3874 = this.field3874.substring(0, 40);
        }
        if (this.field3875.length() > 40) {
            this.field3875 = this.field3875.substring(0, 40);
        }
        if (this.field3864.length() > 10) {
            this.field3864 = this.field3864.substring(0, 10);
        }
        if (this.field3877.length() > 10) {
            this.field3877 = this.field3877.substring(0, 10);
        }
    }

    @ObfuscatedName("kj.n(Lfh;I)V")
    public void method5094(class175 arg0) {
        arg0.method2913(6);
        arg0.method2913(this.field3858);
        arg0.method2913(this.field3859 ? 1 : 0);
        arg0.method2913(this.field3876);
        arg0.method2913(this.field3865);
        arg0.method2913(this.field3872);
        arg0.method2913(this.field3867);
        arg0.method2913(this.field3868);
        arg0.method2913(this.field3869 ? 1 : 0);
        arg0.method2914(this.field3870);
        arg0.method2913(this.field3881);
        arg0.method2915(this.field3880);
        arg0.method2914(this.field3873);
        arg0.method2953(this.field3874);
        arg0.method2953(this.field3875);
        arg0.method2953(this.field3864);
        arg0.method2953(this.field3877);
        arg0.method2913(this.field3879);
        arg0.method2914(this.field3878);
        arg0.method2953(this.field3882);
        arg0.method2953(this.field3871);
        arg0.method2913(this.field3854);
        arg0.method2913(this.field3885);
        for (int var2 = 0; var2 < this.field3884.length; var2++) {
            arg0.method2916(this.field3884[var2]);
        }
        arg0.method2916(this.field3863);
    }

    @ObfuscatedName("kj.g(I)I")
    public int method5086() {
        byte var1 = 38;
        int var2 = var1 + class175.method695(this.field3874);
        int var3 = var2 + class175.method695(this.field3875);
        int var4 = var3 + class175.method695(this.field3864);
        String var6 = this.field3877;
        int var7 = var6.length() + 2;
        int var8 = var4 + var7;
        int var9 = var8 + class175.method695(this.field3882);
        return var9 + class175.method695(this.field3871);
    }
}
