package deob;

@ObfuscatedName("ke")
public class class292 extends class193 {

    @ObfuscatedName("ke.z")
    public int field3869;

    @ObfuscatedName("ke.j")
    public boolean field3870;

    @ObfuscatedName("ke.y")
    public int field3875;

    @ObfuscatedName("ke.ap")
    public int field3876;

    @ObfuscatedName("ke.ak")
    public int field3877;

    @ObfuscatedName("ke.al")
    public int field3878;

    @ObfuscatedName("ke.ab")
    public int field3893;

    @ObfuscatedName("ke.am")
    public boolean field3880;

    @ObfuscatedName("ke.ar")
    public int field3881;

    @ObfuscatedName("ke.ac")
    public int field3882;

    @ObfuscatedName("ke.ay")
    public int field3892;

    @ObfuscatedName("ke.aj")
    public int field3884;

    @ObfuscatedName("ke.ag")
    public String field3885;

    @ObfuscatedName("ke.aq")
    public String field3886;

    @ObfuscatedName("ke.as")
    public String field3887;

    @ObfuscatedName("ke.an")
    public String field3888;

    @ObfuscatedName("ke.az")
    public int field3865;

    @ObfuscatedName("ke.ai")
    public int field3890;

    @ObfuscatedName("ke.aw")
    public int field3891;

    @ObfuscatedName("ke.au")
    public int field3874;

    @ObfuscatedName("ke.ah")
    public String field3883;

    @ObfuscatedName("ke.ad")
    public String field3894;

    @ObfuscatedName("ke.at")
    public int[] field3871 = new int[3];

    @ObfuscatedName("ke.bg")
    public int field3896;

    public class292(boolean arg0) {
        if (arg0) {
            if (Statics.field813.startsWith("win")) {
                this.field3869 = 1;
            } else if (Statics.field813.startsWith("mac")) {
                this.field3869 = 2;
            } else if (Statics.field813.startsWith("linux")) {
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
                this.field3870 = true;
            } else {
                this.field3870 = false;
            }
            if (this.field3869 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3875 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3875 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3875 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3875 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3875 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3875 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3875 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3875 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3875 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3875 = 10;
                }
            } else if (this.field3869 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3875 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3875 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3875 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3875 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3875 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3875 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3875 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3876 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3876 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3876 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3876 = 4;
            } else {
                this.field3876 = 5;
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
            this.field3878 = var14;
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
            this.field3893 = var18;
            this.field3880 = false;
            this.field3881 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3877 > 3) {
                this.field3882 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3882 = 0;
            }
            this.field3892 = 0;
        }
        if (this.field3885 == null) {
            this.field3885 = "";
        }
        if (this.field3886 == null) {
            this.field3886 = "";
        }
        if (this.field3887 == null) {
            this.field3887 = "";
        }
        if (this.field3888 == null) {
            this.field3888 = "";
        }
        if (this.field3883 == null) {
            this.field3883 = "";
        }
        if (this.field3894 == null) {
            this.field3894 = "";
        }
        this.method4896();
    }

    @ObfuscatedName("ke.p(I)V")
    public void method4896() {
        if (this.field3885.length() > 40) {
            this.field3885 = this.field3885.substring(0, 40);
        }
        if (this.field3886.length() > 40) {
            this.field3886 = this.field3886.substring(0, 40);
        }
        if (this.field3887.length() > 10) {
            this.field3887 = this.field3887.substring(0, 10);
        }
        if (this.field3888.length() > 10) {
            this.field3888 = this.field3888.substring(0, 10);
        }
    }

    @ObfuscatedName("ke.m(Lfr;B)V")
    public void method4904(class174 arg0) {
        arg0.method2961(6);
        arg0.method2961(this.field3869);
        arg0.method2961(this.field3870 ? 1 : 0);
        arg0.method2961(this.field3875);
        arg0.method2961(this.field3876);
        arg0.method2961(this.field3877);
        arg0.method2961(this.field3878);
        arg0.method2961(this.field3893);
        arg0.method2961(this.field3880 ? 1 : 0);
        arg0.method2957(this.field3881);
        arg0.method2961(this.field3882);
        arg0.method2797(this.field3892);
        arg0.method2957(this.field3884);
        arg0.method2802(this.field3885);
        arg0.method2802(this.field3886);
        arg0.method2802(this.field3887);
        arg0.method2802(this.field3888);
        arg0.method2961(this.field3890);
        arg0.method2957(this.field3865);
        arg0.method2802(this.field3883);
        arg0.method2802(this.field3894);
        arg0.method2961(this.field3891);
        arg0.method2961(this.field3874);
        for (int var2 = 0; var2 < this.field3871.length; var2++) {
            arg0.method2798(this.field3871[var2]);
        }
        arg0.method2798(this.field3896);
    }

    @ObfuscatedName("ke.e(I)I")
    public int method4899() {
        byte var1 = 38;
        int var2 = var1 + class174.method2318(this.field3885);
        int var3 = var2 + class174.method2318(this.field3886);
        int var4 = var3 + class174.method2318(this.field3887);
        int var5 = var4 + class174.method2318(this.field3888);
        int var6 = var5 + class174.method2318(this.field3883);
        return var6 + class174.method2318(this.field3894);
    }
}
