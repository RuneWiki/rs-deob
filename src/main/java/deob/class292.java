package deob;

@ObfuscatedName("kb")
public class class292 extends class193 {

    @ObfuscatedName("kb.f")
    public int field3855;

    @ObfuscatedName("kb.v")
    public boolean field3856;

    @ObfuscatedName("kb.z")
    public int field3863;

    @ObfuscatedName("kb.ag")
    public int field3879;

    @ObfuscatedName("kb.ar")
    public int field3867;

    @ObfuscatedName("kb.ae")
    public int field3866;

    @ObfuscatedName("kb.ai")
    public int field3885;

    @ObfuscatedName("kb.au")
    public boolean field3870;

    @ObfuscatedName("kb.ad")
    public int field3871;

    @ObfuscatedName("kb.ao")
    public int field3873;

    @ObfuscatedName("kb.az")
    public int field3874;

    @ObfuscatedName("kb.aq")
    public int field3869;

    @ObfuscatedName("kb.ay")
    public String field3876;

    @ObfuscatedName("kb.an")
    public String field3861;

    @ObfuscatedName("kb.af")
    public String field3878;

    @ObfuscatedName("kb.aa")
    public String field3877;

    @ObfuscatedName("kb.ak")
    public int field3859;

    @ObfuscatedName("kb.as")
    public int field3881;

    @ObfuscatedName("kb.ap")
    public int field3868;

    @ObfuscatedName("kb.aw")
    public int field3883;

    @ObfuscatedName("kb.al")
    public String field3884;

    @ObfuscatedName("kb.ab")
    public String field3851;

    @ObfuscatedName("kb.aj")
    public int[] field3886 = new int[3];

    @ObfuscatedName("kb.bz")
    public int field3887;

    public class292(boolean arg0) {
        if (arg0) {
            if (Statics.field782.startsWith("win")) {
                this.field3855 = 1;
            } else if (Statics.field782.startsWith("mac")) {
                this.field3855 = 2;
            } else if (Statics.field782.startsWith("linux")) {
                this.field3855 = 3;
            } else {
                this.field3855 = 4;
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
                this.field3856 = true;
            } else {
                this.field3856 = false;
            }
            if (this.field3855 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3863 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3863 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3863 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3863 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3863 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3863 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3863 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3863 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3863 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3863 = 10;
                }
            } else if (this.field3855 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3863 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3863 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3863 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3863 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3863 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3863 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3863 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3879 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3879 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3879 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3879 = 4;
            } else {
                this.field3879 = 5;
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
            this.field3867 = var10;
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
            this.field3866 = var14;
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
            this.field3870 = false;
            this.field3871 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3867 > 3) {
                this.field3873 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3873 = 0;
            }
            this.field3874 = 0;
        }
        if (this.field3876 == null) {
            this.field3876 = "";
        }
        if (this.field3861 == null) {
            this.field3861 = "";
        }
        if (this.field3878 == null) {
            this.field3878 = "";
        }
        if (this.field3877 == null) {
            this.field3877 = "";
        }
        if (this.field3884 == null) {
            this.field3884 = "";
        }
        if (this.field3851 == null) {
            this.field3851 = "";
        }
        this.method4979();
    }

    @ObfuscatedName("kb.d(I)V")
    public void method4979() {
        if (this.field3876.length() > 40) {
            this.field3876 = this.field3876.substring(0, 40);
        }
        if (this.field3861.length() > 40) {
            this.field3861 = this.field3861.substring(0, 40);
        }
        if (this.field3878.length() > 10) {
            this.field3878 = this.field3878.substring(0, 10);
        }
        if (this.field3877.length() > 10) {
            this.field3877 = this.field3877.substring(0, 10);
        }
    }

    @ObfuscatedName("kb.q(Lfw;B)V")
    public void method4981(class174 arg0) {
        arg0.method2899(6);
        arg0.method2899(this.field3855);
        arg0.method2899(this.field3856 ? 1 : 0);
        arg0.method2899(this.field3863);
        arg0.method2899(this.field3879);
        arg0.method2899(this.field3867);
        arg0.method2899(this.field3866);
        arg0.method2899(this.field3885);
        arg0.method2899(this.field3870 ? 1 : 0);
        arg0.method2900(this.field3871);
        arg0.method2899(this.field3873);
        arg0.method2901(this.field3874);
        arg0.method2900(this.field3869);
        arg0.method2908(this.field3876);
        arg0.method2908(this.field3861);
        arg0.method2908(this.field3878);
        arg0.method2908(this.field3877);
        arg0.method2899(this.field3881);
        arg0.method2900(this.field3859);
        arg0.method2908(this.field3884);
        arg0.method2908(this.field3851);
        arg0.method2899(this.field3868);
        arg0.method2899(this.field3883);
        for (int var2 = 0; var2 < this.field3886.length; var2++) {
            arg0.method2902(this.field3886[var2]);
        }
        arg0.method2902(this.field3887);
    }

    @ObfuscatedName("kb.x(I)I")
    public int method4978() {
        byte var1 = 38;
        String var3 = this.field3876;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3861;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3878;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3877;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3884;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3851;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
