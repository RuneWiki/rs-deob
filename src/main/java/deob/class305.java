package deob;

@ObfuscatedName("ki")
public class class305 extends class204 {

    @ObfuscatedName("ki.z")
    public int field3973;

    @ObfuscatedName("ki.t")
    public boolean field3945;

    @ObfuscatedName("ki.ab")
    public int field3954;

    @ObfuscatedName("ki.ax")
    public int field3946;

    @ObfuscatedName("ki.at")
    public int field3953;

    @ObfuscatedName("ki.ap")
    public int field3957;

    @ObfuscatedName("ki.an")
    public int field3958;

    @ObfuscatedName("ki.ac")
    public boolean field3959;

    @ObfuscatedName("ki.aw")
    public int field3960;

    @ObfuscatedName("ki.ay")
    public int field3961;

    @ObfuscatedName("ki.af")
    public int field3962;

    @ObfuscatedName("ki.ah")
    public int field3952;

    @ObfuscatedName("ki.az")
    public String field3971;

    @ObfuscatedName("ki.av")
    public String field3965;

    @ObfuscatedName("ki.ae")
    public String field3966;

    @ObfuscatedName("ki.am")
    public String field3964;

    @ObfuscatedName("ki.aa")
    public int field3968;

    @ObfuscatedName("ki.aj")
    public int field3969;

    @ObfuscatedName("ki.ao")
    public int field3970;

    @ObfuscatedName("ki.ar")
    public int field3963;

    @ObfuscatedName("ki.au")
    public String field3967;

    @ObfuscatedName("ki.bb")
    public String field3956;

    @ObfuscatedName("ki.bc")
    public int[] field3974 = new int[3];

    @ObfuscatedName("ki.bp")
    public int field3975;

    public class305(boolean arg0) {
        if (arg0) {
            if (Statics.field2145.startsWith("win")) {
                this.field3973 = 1;
            } else if (Statics.field2145.startsWith("mac")) {
                this.field3973 = 2;
            } else if (Statics.field2145.startsWith("linux")) {
                this.field3973 = 3;
            } else {
                this.field3973 = 4;
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
                this.field3945 = true;
            } else {
                this.field3945 = false;
            }
            if (this.field3973 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3954 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3954 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3954 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3954 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3954 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3954 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3954 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3954 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3954 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3954 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field3954 = 11;
                }
            } else if (this.field3973 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3954 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3954 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3954 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3954 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3954 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3954 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3954 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field3954 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3946 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3946 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3946 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3946 = 4;
            } else {
                this.field3946 = 5;
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
            this.field3953 = var10;
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
            this.field3957 = var14;
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
            this.field3958 = var18;
            this.field3959 = false;
            this.field3960 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3953 > 3) {
                this.field3961 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3961 = 0;
            }
            this.field3962 = 0;
        }
        if (this.field3971 == null) {
            this.field3971 = "";
        }
        if (this.field3965 == null) {
            this.field3965 = "";
        }
        if (this.field3966 == null) {
            this.field3966 = "";
        }
        if (this.field3964 == null) {
            this.field3964 = "";
        }
        if (this.field3967 == null) {
            this.field3967 = "";
        }
        if (this.field3956 == null) {
            this.field3956 = "";
        }
        this.method5137();
    }

    @ObfuscatedName("ki.a(I)V")
    public void method5137() {
        if (this.field3971.length() > 40) {
            this.field3971 = this.field3971.substring(0, 40);
        }
        if (this.field3965.length() > 40) {
            this.field3965 = this.field3965.substring(0, 40);
        }
        if (this.field3966.length() > 10) {
            this.field3966 = this.field3966.substring(0, 10);
        }
        if (this.field3964.length() > 10) {
            this.field3964 = this.field3964.substring(0, 10);
        }
    }

    @ObfuscatedName("ki.w(Lgh;B)V")
    public void method5139(class185 arg0) {
        arg0.method2946(6);
        arg0.method2946(this.field3973);
        arg0.method2946(this.field3945 ? 1 : 0);
        arg0.method2946(this.field3954);
        arg0.method2946(this.field3946);
        arg0.method2946(this.field3953);
        arg0.method2946(this.field3957);
        arg0.method2946(this.field3958);
        arg0.method2946(this.field3959 ? 1 : 0);
        arg0.method2944(this.field3960);
        arg0.method2946(this.field3961);
        arg0.method3045(this.field3962);
        arg0.method2944(this.field3952);
        arg0.method2954(this.field3971);
        arg0.method2954(this.field3965);
        arg0.method2954(this.field3966);
        arg0.method2954(this.field3964);
        arg0.method2946(this.field3969);
        arg0.method2944(this.field3968);
        arg0.method2954(this.field3967);
        arg0.method2954(this.field3956);
        arg0.method2946(this.field3970);
        arg0.method2946(this.field3963);
        for (int var2 = 0; var2 < this.field3974.length; var2++) {
            arg0.method2949(this.field3974[var2]);
        }
        arg0.method2949(this.field3975);
    }

    @ObfuscatedName("ki.e(S)I")
    public int method5138() {
        byte var1 = 38;
        int var2 = var1 + class185.method20(this.field3971);
        int var3 = var2 + class185.method20(this.field3965);
        int var4 = var3 + class185.method20(this.field3966);
        int var5 = var4 + class185.method20(this.field3964);
        int var6 = var5 + class185.method20(this.field3967);
        return var6 + class185.method20(this.field3956);
    }
}
