package deob;

@ObfuscatedName("nq")
public class class370 implements class372 {

    @ObfuscatedName("nq.k")
    public int field4061;

    @ObfuscatedName("nq.o")
    public int field4058;

    @ObfuscatedName("nq.g")
    public int field4063;

    @ObfuscatedName("nq.n(B)Lnh;")
    public class371 method5745() {
        byte var1;
        if (Statics.field1523.startsWith("win")) {
            var1 = 1;
        } else if (Statics.field1523.startsWith("mac")) {
            var1 = 2;
        } else if (Statics.field1523.startsWith("linux")) {
            var1 = 3;
        } else {
            var1 = 4;
        }
        String var2;
        try {
            var2 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var24) {
            var2 = "";
        }
        String var4;
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var23) {
            var4 = "";
        }
        String var6 = "Unknown";
        String var7 = "1.1";
        try {
            var6 = System.getProperty("java.vendor");
            var7 = System.getProperty("java.version");
        } catch (Exception var22) {
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
        this.method5741(var7);
        int var12 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
        int var13;
        if (this.field4061 > 3) {
            var13 = Runtime.getRuntime().availableProcessors();
        } else {
            var13 = 0;
        }
        byte var14 = 0;
        String var15 = "";
        String var16 = "";
        String var17 = "";
        String var18 = "";
        String var19 = "";
        String var20 = "";
        int[] var21 = new int[3];
        return new class371(var1, var9, var10, var11, this.field4061, this.field4058, this.field4063, false, var12, var13, var14, 0, var15, var16, var17, var18, 0, 0, 0, 0, var19, var20, var21, 0, "");
    }

    @ObfuscatedName("nq.c(Ljava/lang/String;B)V")
    public void method5741(String arg0) {
        if (arg0.startsWith("1.")) {
            this.method5742(arg0);
        } else {
            this.method5743(arg0);
        }
    }

    @ObfuscatedName("nq.m(Ljava/lang/String;B)V")
    public void method5742(String arg0) {
        String[] var2 = arg0.split("\\.");
        try {
            this.field4061 = Integer.parseInt(var2[1]);
            String[] var3 = var2[2].split("_");
            this.field4058 = Integer.parseInt(var3[0]);
            this.field4063 = Integer.parseInt(var3[1]);
        } catch (Exception var5) {
        }
    }

    @ObfuscatedName("nq.k(Ljava/lang/String;B)V")
    public void method5743(String arg0) {
        String[] var2 = arg0.split("\\.");
        try {
            this.field4061 = Integer.parseInt(var2[0]);
            this.field4058 = Integer.parseInt(var2[1]);
            this.field4063 = Integer.parseInt(var2[2]);
        } catch (Exception var4) {
        }
    }
}
