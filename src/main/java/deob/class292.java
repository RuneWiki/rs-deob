package deob;

@ObfuscatedName("ky")
public class class292 extends class193 {

    @ObfuscatedName("ky.y")
    public int field3861;

    @ObfuscatedName("ky.h")
    public boolean field3866;

    @ObfuscatedName("ky.u")
    public int field3867;

    @ObfuscatedName("ky.at")
    public int field3873;

    @ObfuscatedName("ky.ah")
    public int field3874;

    @ObfuscatedName("ky.ai")
    public int field3875;

    @ObfuscatedName("ky.aw")
    public int field3872;

    @ObfuscatedName("ky.al")
    public boolean field3868;

    @ObfuscatedName("ky.ab")
    public int field3865;

    @ObfuscatedName("ky.ap")
    public int field3879;

    @ObfuscatedName("ky.as")
    public int field3880;

    @ObfuscatedName("ky.av")
    public int field3881;

    @ObfuscatedName("ky.ag")
    public String field3882;

    @ObfuscatedName("ky.az")
    public String field3883;

    @ObfuscatedName("ky.ac")
    public String field3890;

    @ObfuscatedName("ky.ax")
    public String field3885;

    @ObfuscatedName("ky.au")
    public int field3886;

    @ObfuscatedName("ky.aj")
    public int field3871;

    @ObfuscatedName("ky.aq")
    public int field3888;

    @ObfuscatedName("ky.ay")
    public int field3889;

    @ObfuscatedName("ky.ak")
    public String field3892;

    @ObfuscatedName("ky.ao")
    public String field3891;

    @ObfuscatedName("ky.am")
    public int[] field3893 = new int[3];

    @ObfuscatedName("ky.be")
    public int field3887;

    public class292(boolean arg0) {
        if (arg0) {
            if (Statics.field2274.startsWith("win")) {
                this.field3861 = 1;
            } else if (Statics.field2274.startsWith("mac")) {
                this.field3861 = 2;
            } else if (Statics.field2274.startsWith("linux")) {
                this.field3861 = 3;
            } else {
                this.field3861 = 4;
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
                this.field3866 = true;
            } else {
                this.field3866 = false;
            }
            if (this.field3861 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3867 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3867 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3867 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3867 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3867 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3867 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3867 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3867 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3867 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3867 = 10;
                }
            } else if (this.field3861 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3867 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3867 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3867 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3867 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3867 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3867 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3867 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3873 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3873 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3873 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3873 = 4;
            } else {
                this.field3873 = 5;
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
            this.field3874 = var10;
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
            this.field3875 = var14;
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
            this.field3872 = var18;
            this.field3868 = false;
            this.field3865 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3874 > 3) {
                this.field3879 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3879 = 0;
            }
            this.field3880 = 0;
        }
        if (this.field3882 == null) {
            this.field3882 = "";
        }
        if (this.field3883 == null) {
            this.field3883 = "";
        }
        if (this.field3890 == null) {
            this.field3890 = "";
        }
        if (this.field3885 == null) {
            this.field3885 = "";
        }
        if (this.field3892 == null) {
            this.field3892 = "";
        }
        if (this.field3891 == null) {
            this.field3891 = "";
        }
        this.method4987();
    }

    @ObfuscatedName("ky.i(I)V")
    public void method4987() {
        if (this.field3882.length() > 40) {
            this.field3882 = this.field3882.substring(0, 40);
        }
        if (this.field3883.length() > 40) {
            this.field3883 = this.field3883.substring(0, 40);
        }
        if (this.field3890.length() > 10) {
            this.field3890 = this.field3890.substring(0, 10);
        }
        if (this.field3885.length() > 10) {
            this.field3885 = this.field3885.substring(0, 10);
        }
    }

    @ObfuscatedName("ky.c(Lfx;B)V")
    public void method4988(class174 arg0) {
        arg0.method2865(6);
        arg0.method2865(this.field3861);
        arg0.method2865(this.field3866 ? 1 : 0);
        arg0.method2865(this.field3867);
        arg0.method2865(this.field3873);
        arg0.method2865(this.field3874);
        arg0.method2865(this.field3875);
        arg0.method2865(this.field3872);
        arg0.method2865(this.field3868 ? 1 : 0);
        arg0.method2856(this.field3865);
        arg0.method2865(this.field3879);
        arg0.method3002(this.field3880);
        arg0.method2856(this.field3881);
        arg0.method2982(this.field3882);
        arg0.method2982(this.field3883);
        arg0.method2982(this.field3890);
        arg0.method2982(this.field3885);
        arg0.method2865(this.field3871);
        arg0.method2856(this.field3886);
        arg0.method2982(this.field3892);
        arg0.method2982(this.field3891);
        arg0.method2865(this.field3888);
        arg0.method2865(this.field3889);
        for (int var2 = 0; var2 < this.field3893.length; var2++) {
            arg0.method2871(this.field3893[var2]);
        }
        arg0.method2871(this.field3887);
    }

    @ObfuscatedName("ky.e(B)I")
    public int method4989() {
        byte var1 = 38;
        String var3 = this.field3882;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3883;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3890;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3885;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3892;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3891;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
