package deob;

@ObfuscatedName("sn")
public class class489 implements class491 {

    @ObfuscatedName("sn.ax")
    public int field4861;

    @ObfuscatedName("sn.ao")
    public int field4863;

    @ObfuscatedName("sn.ah")
    public int field4864;

    @ObfuscatedName("sn.ac(I)Lsx;")
    public class490 method7783() {
        byte var1;
        if (Statics.field2351.startsWith("win")) {
            var1 = 1;
        } else if (Statics.field2351.startsWith("mac")) {
            var1 = 2;
        } else if (Statics.field2351.startsWith("linux")) {
            var1 = 3;
        } else {
            var1 = 4;
        }
        String var2;
        try {
            var2 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var33) {
            var2 = "";
        }
        String var4;
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var32) {
            var4 = "";
        }
        String var6 = "Unknown";
        String var7 = "1.1";
        try {
            var6 = System.getProperty("java.vendor");
            var7 = System.getProperty("java.version");
        } catch (Exception var31) {
        }
        boolean var9;
        if (var2.startsWith("amd64") || var2.startsWith("x86_64")) {
            var9 = true;
        } else {
            var9 = false;
        }
        byte var10 = 0;
        if (var1 == 1) {
            if (var4.indexOf("4.0") != -1) {
                var10 = 1;
            } else if (var4.indexOf("4.1") != -1) {
                var10 = 2;
            } else if (var4.indexOf("4.9") != -1) {
                var10 = 3;
            } else if (var4.indexOf("5.0") != -1) {
                var10 = 4;
            } else if (var4.indexOf("5.1") != -1) {
                var10 = 5;
            } else if (var4.indexOf("5.2") != -1) {
                var10 = 8;
            } else if (var4.indexOf("6.0") != -1) {
                var10 = 6;
            } else if (var4.indexOf("6.1") != -1) {
                var10 = 7;
            } else if (var4.indexOf("6.2") != -1) {
                var10 = 9;
            } else if (var4.indexOf("6.3") != -1) {
                var10 = 10;
            } else if (var4.indexOf("10.0") != -1) {
                var10 = 11;
            }
        } else if (var1 == 2) {
            if (var4.indexOf("10.4") != -1) {
                var10 = 20;
            } else if (var4.indexOf("10.5") != -1) {
                var10 = 21;
            } else if (var4.indexOf("10.6") != -1) {
                var10 = 22;
            } else if (var4.indexOf("10.7") != -1) {
                var10 = 23;
            } else if (var4.indexOf("10.8") != -1) {
                var10 = 24;
            } else if (var4.indexOf("10.9") != -1) {
                var10 = 25;
            } else if (var4.indexOf("10.10") != -1) {
                var10 = 26;
            } else if (var4.indexOf("10.11") != -1) {
                var10 = 27;
            } else if (var4.indexOf("10.12") != -1) {
                var10 = 28;
            } else if (var4.indexOf("10.13") != -1) {
                var10 = 29;
            }
        }
        byte var11;
        if (var6.toLowerCase().indexOf("sun") != -1) {
            var11 = 1;
        } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
            var11 = 2;
        } else if (var6.toLowerCase().indexOf("apple") != -1) {
            var11 = 3;
        } else if (var6.toLowerCase().indexOf("oracle") == -1) {
            var11 = 4;
        } else {
            var11 = 5;
        }
        this.method7793(var7);
        boolean var12 = false;
        int var13 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
        int var14;
        if (this.field4861 > 3) {
            var14 = Runtime.getRuntime().availableProcessors();
        } else {
            var14 = 0;
        }
        byte var15 = 0;
        String var16 = "";
        String var17 = "";
        String var18 = "";
        String var19 = "";
        String var20 = "";
        String var21 = "";
        boolean var22 = false;
        boolean var23 = false;
        boolean var24 = false;
        boolean var25 = false;
        int[] var26 = new int[3];
        boolean var27 = false;
        String var28 = "";
        String var29 = "";
        boolean var30 = false;
        return new class490(var1, var9, var10, var11, this.field4861, this.field4863, this.field4864, false, var13, var14, var15, 0, var16, var17, var18, var19, 0, 0, 0, 0, var20, var21, var26, 0, "", "");
    }

    @ObfuscatedName("sn.al(Ljava/lang/String;B)V")
    public void method7793(String arg0) {
        if (arg0.startsWith("1.")) {
            this.method7785(arg0);
        } else {
            this.method7786(arg0);
        }
    }

    @ObfuscatedName("sn.ak(Ljava/lang/String;I)V")
    public void method7785(String arg0) {
        String[] var2 = arg0.split("\\.");
        try {
            this.field4861 = Integer.parseInt(var2[1]);
            String[] var3 = var2[2].split("_");
            this.field4863 = Integer.parseInt(var3[0]);
            this.field4864 = Integer.parseInt(var3[1]);
        } catch (Exception var5) {
        }
    }

    @ObfuscatedName("sn.ax(Ljava/lang/String;B)V")
    public void method7786(String arg0) {
        String[] var2 = arg0.split("\\.");
        try {
            this.field4861 = Integer.parseInt(var2[0]);
            this.field4863 = Integer.parseInt(var2[1]);
            this.field4864 = Integer.parseInt(var2[2]);
        } catch (Exception var4) {
        }
    }
}
