package deob;

@ObfuscatedName("ks")
public class class292 extends class193 {

    @ObfuscatedName("ks.b")
    public int field3889;

    @ObfuscatedName("ks.k")
    public boolean field3869;

    @ObfuscatedName("ks.t")
    public int field3880;

    @ObfuscatedName("ks.az")
    public int field3882;

    @ObfuscatedName("ks.ar")
    public int field3875;

    @ObfuscatedName("ks.ai")
    public int field3870;

    @ObfuscatedName("ks.ap")
    public int field3877;

    @ObfuscatedName("ks.al")
    public boolean field3878;

    @ObfuscatedName("ks.aw")
    public int field3874;

    @ObfuscatedName("ks.ax")
    public int field3872;

    @ObfuscatedName("ks.ao")
    public int field3881;

    @ObfuscatedName("ks.aq")
    public int field3876;

    @ObfuscatedName("ks.ab")
    public String field3883;

    @ObfuscatedName("ks.as")
    public String field3884;

    @ObfuscatedName("ks.av")
    public String field3885;

    @ObfuscatedName("ks.ac")
    public String field3886;

    @ObfuscatedName("ks.ag")
    public int field3887;

    @ObfuscatedName("ks.au")
    public int field3888;

    @ObfuscatedName("ks.aa")
    public int field3868;

    @ObfuscatedName("ks.an")
    public int field3890;

    @ObfuscatedName("ks.aj")
    public String field3891;

    @ObfuscatedName("ks.af")
    public String field3892;

    @ObfuscatedName("ks.ah")
    public int[] field3893 = new int[3];

    @ObfuscatedName("ks.bz")
    public int field3894;

    public class292(boolean arg0) {
        if (arg0) {
            if (Statics.field585.startsWith("win")) {
                this.field3889 = 1;
            } else if (Statics.field585.startsWith("mac")) {
                this.field3889 = 2;
            } else if (Statics.field585.startsWith("linux")) {
                this.field3889 = 3;
            } else {
                this.field3889 = 4;
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
                this.field3869 = true;
            } else {
                this.field3869 = false;
            }
            if (this.field3889 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3880 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3880 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3880 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3880 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3880 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3880 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3880 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3880 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3880 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3880 = 10;
                }
            } else if (this.field3889 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3880 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3880 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3880 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3880 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3880 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3880 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3880 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3882 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3882 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3882 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3882 = 4;
            } else {
                this.field3882 = 5;
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
            this.field3875 = var10;
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
            this.field3870 = var14;
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
            this.field3877 = var18;
            this.field3878 = false;
            this.field3874 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3875 > 3) {
                this.field3872 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3872 = 0;
            }
            this.field3881 = 0;
        }
        if (this.field3883 == null) {
            this.field3883 = "";
        }
        if (this.field3884 == null) {
            this.field3884 = "";
        }
        if (this.field3885 == null) {
            this.field3885 = "";
        }
        if (this.field3886 == null) {
            this.field3886 = "";
        }
        if (this.field3891 == null) {
            this.field3891 = "";
        }
        if (this.field3892 == null) {
            this.field3892 = "";
        }
        this.method5023();
    }

    @ObfuscatedName("ks.e(I)V")
    public void method5023() {
        if (this.field3883.length() > 40) {
            this.field3883 = this.field3883.substring(0, 40);
        }
        if (this.field3884.length() > 40) {
            this.field3884 = this.field3884.substring(0, 40);
        }
        if (this.field3885.length() > 10) {
            this.field3885 = this.field3885.substring(0, 10);
        }
        if (this.field3886.length() > 10) {
            this.field3886 = this.field3886.substring(0, 10);
        }
    }

    @ObfuscatedName("ks.o(Lfw;I)V")
    public void method5024(class174 arg0) {
        arg0.method2876(6);
        arg0.method2876(this.field3889);
        arg0.method2876(this.field3869 ? 1 : 0);
        arg0.method2876(this.field3880);
        arg0.method2876(this.field3882);
        arg0.method2876(this.field3875);
        arg0.method2876(this.field3870);
        arg0.method2876(this.field3877);
        arg0.method2876(this.field3878 ? 1 : 0);
        arg0.method2877(this.field3874);
        arg0.method2876(this.field3872);
        arg0.method2878(this.field3881);
        arg0.method2877(this.field3876);
        arg0.method2883(this.field3883);
        arg0.method2883(this.field3884);
        arg0.method2883(this.field3885);
        arg0.method2883(this.field3886);
        arg0.method2876(this.field3888);
        arg0.method2877(this.field3887);
        arg0.method2883(this.field3891);
        arg0.method2883(this.field3892);
        arg0.method2876(this.field3868);
        arg0.method2876(this.field3890);
        for (int var2 = 0; var2 < this.field3893.length; var2++) {
            arg0.method3055(this.field3893[var2]);
        }
        arg0.method3055(this.field3894);
    }

    @ObfuscatedName("ks.m(I)I")
    public int method5028() {
        byte var1 = 38;
        String var3 = this.field3883;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3884;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3885;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3886;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3891;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3892;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
