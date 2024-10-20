package deob;

@ObfuscatedName("vs")
public class class554 implements Comparable {

    @ObfuscatedName("vs.am")
    public String field5330;

    @ObfuscatedName("vs.ap")
    public String field5328;

    public class554(String arg0) {
        this.field5330 = arg0;
        class509 var3 = class509.field5065;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            int var5 = 0;
            int var6 = arg0.length();
            while (var5 < var6 && class510.method3935(arg0.charAt(var5))) {
                var5++;
            }
            while (var6 > var5 && class510.method3935(arg0.charAt(var6 - 1))) {
                var6--;
            }
            int var7 = var6 - var5;
            if (var7 >= 1 && var7 <= class510.method5706(var3)) {
                StringBuilder var8 = new StringBuilder(var7);
                for (int var9 = var5; var9 < var6; var9++) {
                    char var10 = arg0.charAt(var9);
                    if (class510.method2718(var10)) {
                        char var11 = class510.method6629(var10);
                        if (var11 != 0) {
                            var8.append(var11);
                        }
                    }
                }
                if (var8.length() == 0) {
                    var4 = null;
                } else {
                    var4 = var8.toString();
                }
            } else {
                var4 = null;
            }
        }
        this.field5328 = var4;
    }

    public class554(String arg0, class509 arg1) {
        this.field5330 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            int var5 = 0;
            int var6 = arg0.length();
            while (var5 < var6 && class510.method3935(arg0.charAt(var5))) {
                var5++;
            }
            while (var6 > var5 && class510.method3935(arg0.charAt(var6 - 1))) {
                var6--;
            }
            int var7 = var6 - var5;
            if (var7 >= 1 && var7 <= class510.method5706(arg1)) {
                StringBuilder var8 = new StringBuilder(var7);
                for (int var9 = var5; var9 < var6; var9++) {
                    char var10 = arg0.charAt(var9);
                    if (class510.method2718(var10)) {
                        char var11 = class510.method6629(var10);
                        if (var11 != 0) {
                            var8.append(var11);
                        }
                    }
                }
                if (var8.length() == 0) {
                    var4 = null;
                } else {
                    var4 = var8.toString();
                }
            } else {
                var4 = null;
            }
        }
        this.field5328 = var4;
    }

    @ObfuscatedName("vs.am(I)Ljava/lang/String;")
    public String method9164() {
        return this.field5330;
    }

    @ObfuscatedName("vs.ap(I)Ljava/lang/String;")
    public String method9161() {
        return this.field5328;
    }

    @ObfuscatedName("vs.af(B)Z")
    public boolean method9168() {
        return this.field5328 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class554) {
            return false;
        }
        class554 var2 = (class554) arg0;
        if (this.field5328 == null) {
            return var2.field5328 == null;
        } else if (var2.field5328 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5328.equals(var2.field5328);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5328 == null ? 0 : this.field5328.hashCode();
    }

    public String toString() {
        return this.method9164();
    }

    @ObfuscatedName("vs.ag(Lvs;I)I")
    public int method9159(class554 arg0) {
        if (this.field5328 == null) {
            return arg0.field5328 == null ? 0 : 1;
        } else if (arg0.field5328 == null) {
            return -1;
        } else {
            return this.field5328.compareTo(arg0.field5328);
        }
    }

    public int compareTo(Object arg0) {
        return this.method9159((class554) arg0);
    }
}
