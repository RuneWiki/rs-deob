package deob;

@ObfuscatedName("ky")
public class class305 extends class204 {

    @ObfuscatedName("ky.d")
    public int field3975;

    @ObfuscatedName("ky.s")
    public boolean field3944;

    @ObfuscatedName("ky.ac")
    public int field3956;

    @ObfuscatedName("ky.az")
    public int field3958;

    @ObfuscatedName("ky.ae")
    public int field3964;

    @ObfuscatedName("ky.av")
    public int field3962;

    @ObfuscatedName("ky.am")
    public int field3961;

    @ObfuscatedName("ky.ax")
    public boolean field3978;

    @ObfuscatedName("ky.ah")
    public int field3963;

    @ObfuscatedName("ky.aj")
    public int field3957;

    @ObfuscatedName("ky.ao")
    public int field3965;

    @ObfuscatedName("ky.al")
    public int field3966;

    @ObfuscatedName("ky.ay")
    public String field3967;

    @ObfuscatedName("ky.aq")
    public String field3968;

    @ObfuscatedName("ky.ak")
    public String field3947;

    @ObfuscatedName("ky.as")
    public String field3970;

    @ObfuscatedName("ky.au")
    public int field3952;

    @ObfuscatedName("ky.an")
    public int field3972;

    @ObfuscatedName("ky.ai")
    public int field3973;

    @ObfuscatedName("ky.ap")
    public int field3974;

    @ObfuscatedName("ky.ar")
    public String field3971;

    @ObfuscatedName("ky.bg")
    public String field3976;

    @ObfuscatedName("ky.bq")
    public int[] field3977 = new int[3];

    @ObfuscatedName("ky.bk")
    public int field3948;

    public class305(boolean arg0) {
        if (arg0) {
            if (Statics.field2175.startsWith("win")) {
                this.field3975 = 1;
            } else if (Statics.field2175.startsWith("mac")) {
                this.field3975 = 2;
            } else if (Statics.field2175.startsWith("linux")) {
                this.field3975 = 3;
            } else {
                this.field3975 = 4;
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
                this.field3944 = true;
            } else {
                this.field3944 = false;
            }
            if (this.field3975 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3956 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3956 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3956 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3956 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3956 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3956 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3956 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3956 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3956 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3956 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field3956 = 11;
                }
            } else if (this.field3975 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3956 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3956 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3956 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3956 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3956 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3956 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3956 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field3956 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3958 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3958 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3958 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3958 = 4;
            } else {
                this.field3958 = 5;
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
            this.field3964 = var10;
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
            this.field3962 = var14;
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
            this.field3961 = var18;
            this.field3978 = false;
            this.field3963 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3964 > 3) {
                this.field3957 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3957 = 0;
            }
            this.field3965 = 0;
        }
        if (this.field3967 == null) {
            this.field3967 = "";
        }
        if (this.field3968 == null) {
            this.field3968 = "";
        }
        if (this.field3947 == null) {
            this.field3947 = "";
        }
        if (this.field3970 == null) {
            this.field3970 = "";
        }
        if (this.field3971 == null) {
            this.field3971 = "";
        }
        if (this.field3976 == null) {
            this.field3976 = "";
        }
        this.method5184();
    }

    @ObfuscatedName("ky.n(I)V")
    public void method5184() {
        if (this.field3967.length() > 40) {
            this.field3967 = this.field3967.substring(0, 40);
        }
        if (this.field3968.length() > 40) {
            this.field3968 = this.field3968.substring(0, 40);
        }
        if (this.field3947.length() > 10) {
            this.field3947 = this.field3947.substring(0, 10);
        }
        if (this.field3970.length() > 10) {
            this.field3970 = this.field3970.substring(0, 10);
        }
    }

    @ObfuscatedName("ky.v(Lgv;I)V")
    public void method5189(class185 arg0) {
        arg0.method3157(6);
        arg0.method3157(this.field3975);
        arg0.method3157(this.field3944 ? 1 : 0);
        arg0.method3157(this.field3956);
        arg0.method3157(this.field3958);
        arg0.method3157(this.field3964);
        arg0.method3157(this.field3962);
        arg0.method3157(this.field3961);
        arg0.method3157(this.field3978 ? 1 : 0);
        arg0.method3006(this.field3963);
        arg0.method3157(this.field3957);
        arg0.method3153(this.field3965);
        arg0.method3006(this.field3966);
        arg0.method3127(this.field3967);
        arg0.method3127(this.field3968);
        arg0.method3127(this.field3947);
        arg0.method3127(this.field3970);
        arg0.method3157(this.field3972);
        arg0.method3006(this.field3952);
        arg0.method3127(this.field3971);
        arg0.method3127(this.field3976);
        arg0.method3157(this.field3973);
        arg0.method3157(this.field3974);
        for (int var2 = 0; var2 < this.field3977.length; var2++) {
            arg0.method3005(this.field3977[var2]);
        }
        arg0.method3005(this.field3948);
    }

    @ObfuscatedName("ky.y(B)I")
    public int method5187() {
        byte var1 = 38;
        String var3 = this.field3967;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3968;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3947;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3970;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3971;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3976;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
