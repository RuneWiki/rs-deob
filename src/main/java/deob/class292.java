package deob;

@ObfuscatedName("kt")
public class class292 extends class193 {

    @ObfuscatedName("kt.r")
    public int field3869;

    @ObfuscatedName("kt.v")
    public boolean field3883;

    @ObfuscatedName("kt.g")
    public int field3887;

    @ObfuscatedName("kt.an")
    public int field3866;

    @ObfuscatedName("kt.au")
    public int field3877;

    @ObfuscatedName("kt.ar")
    public int field3870;

    @ObfuscatedName("kt.ay")
    public int field3879;

    @ObfuscatedName("kt.ao")
    public boolean field3895;

    @ObfuscatedName("kt.as")
    public int field3874;

    @ObfuscatedName("kt.aq")
    public int field3882;

    @ObfuscatedName("kt.ac")
    public int field3884;

    @ObfuscatedName("kt.at")
    public int field3885;

    @ObfuscatedName("kt.av")
    public String field3888;

    @ObfuscatedName("kt.aa")
    public String field3886;

    @ObfuscatedName("kt.am")
    public String field3880;

    @ObfuscatedName("kt.az")
    public String field3889;

    @ObfuscatedName("kt.al")
    public int field3890;

    @ObfuscatedName("kt.ad")
    public int field3891;

    @ObfuscatedName("kt.ae")
    public int field3892;

    @ObfuscatedName("kt.ag")
    public int field3893;

    @ObfuscatedName("kt.ap")
    public String field3894;

    @ObfuscatedName("kt.af")
    public String field3881;

    @ObfuscatedName("kt.aj")
    public int[] field3896 = new int[3];

    @ObfuscatedName("kt.bb")
    public int field3878;

    public class292(boolean arg0) {
        if (arg0) {
            if (Statics.field2262.startsWith("win")) {
                this.field3869 = 1;
            } else if (Statics.field2262.startsWith("mac")) {
                this.field3869 = 2;
            } else if (Statics.field2262.startsWith("linux")) {
                this.field3869 = 3;
            } else {
                this.field3869 = 4;
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
                this.field3883 = true;
            } else {
                this.field3883 = false;
            }
            if (this.field3869 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3887 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3887 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3887 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3887 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3887 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3887 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3887 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3887 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3887 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3887 = 10;
                }
            } else if (this.field3869 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3887 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3887 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3887 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3887 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3887 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3887 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3887 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3866 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3866 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3866 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3866 = 4;
            } else {
                this.field3866 = 5;
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
            this.field3877 = var10;
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
            this.field3879 = var18;
            this.field3895 = false;
            this.field3874 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3877 > 3) {
                this.field3882 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3882 = 0;
            }
            this.field3884 = 0;
        }
        if (this.field3888 == null) {
            this.field3888 = "";
        }
        if (this.field3886 == null) {
            this.field3886 = "";
        }
        if (this.field3880 == null) {
            this.field3880 = "";
        }
        if (this.field3889 == null) {
            this.field3889 = "";
        }
        if (this.field3894 == null) {
            this.field3894 = "";
        }
        if (this.field3881 == null) {
            this.field3881 = "";
        }
        this.method4988();
    }

    @ObfuscatedName("kt.i(I)V")
    public void method4988() {
        if (this.field3888.length() > 40) {
            this.field3888 = this.field3888.substring(0, 40);
        }
        if (this.field3886.length() > 40) {
            this.field3886 = this.field3886.substring(0, 40);
        }
        if (this.field3880.length() > 10) {
            this.field3880 = this.field3880.substring(0, 10);
        }
        if (this.field3889.length() > 10) {
            this.field3889 = this.field3889.substring(0, 10);
        }
    }

    @ObfuscatedName("kt.w(Lfp;B)V")
    public void method4989(class174 arg0) {
        arg0.method2865(6);
        arg0.method2865(this.field3869);
        arg0.method2865(this.field3883 ? 1 : 0);
        arg0.method2865(this.field3887);
        arg0.method2865(this.field3866);
        arg0.method2865(this.field3877);
        arg0.method2865(this.field3870);
        arg0.method2865(this.field3879);
        arg0.method2865(this.field3895 ? 1 : 0);
        arg0.method2990(this.field3874);
        arg0.method2865(this.field3882);
        arg0.method2867(this.field3884);
        arg0.method2990(this.field3885);
        arg0.method2872(this.field3888);
        arg0.method2872(this.field3886);
        arg0.method2872(this.field3880);
        arg0.method2872(this.field3889);
        arg0.method2865(this.field3891);
        arg0.method2990(this.field3890);
        arg0.method2872(this.field3894);
        arg0.method2872(this.field3881);
        arg0.method2865(this.field3892);
        arg0.method2865(this.field3893);
        for (int var2 = 0; var2 < this.field3896.length; var2++) {
            arg0.method2868(this.field3896[var2]);
        }
        arg0.method2868(this.field3878);
    }

    @ObfuscatedName("kt.a(B)I")
    public int method4987() {
        byte var1 = 38;
        int var2 = var1 + class174.method3954(this.field3888);
        int var3 = var2 + class174.method3954(this.field3886);
        int var4 = var3 + class174.method3954(this.field3880);
        int var5 = var4 + class174.method3954(this.field3889);
        int var6 = var5 + class174.method3954(this.field3894);
        return var6 + class174.method3954(this.field3881);
    }
}
