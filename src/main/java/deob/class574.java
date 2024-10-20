package deob;

@ObfuscatedName("wf")
public class class574 implements Comparable {

    @ObfuscatedName("wf.ac")
    public String field5575;

    @ObfuscatedName("wf.ae")
    public String field5574;

    public class574(String arg0) {
        this.field5575 = arg0;
        class528 var3 = class528.field5292;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            int var5 = 0;
            int var6 = arg0.length();
            while (var5 < var6 && class529.method5759(arg0.charAt(var5))) {
                var5++;
            }
            while (var6 > var5 && class529.method5759(arg0.charAt(var6 - 1))) {
                var6--;
            }
            int var7 = var6 - var5;
            if (var7 >= 1 && var7 <= class529.method2489(var3)) {
                StringBuilder var8 = new StringBuilder(var7);
                for (int var9 = var5; var9 < var6; var9++) {
                    char var10 = arg0.charAt(var9);
                    if (class529.method3587(var10)) {
                        char var11 = class529.method5052(var10);
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
        this.field5574 = var4;
    }

    public class574(String arg0, class528 arg1) {
        this.field5575 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            int var5 = 0;
            int var6 = arg0.length();
            while (var5 < var6 && class529.method5759(arg0.charAt(var5))) {
                var5++;
            }
            while (var6 > var5 && class529.method5759(arg0.charAt(var6 - 1))) {
                var6--;
            }
            int var7 = var6 - var5;
            if (var7 >= 1 && var7 <= class529.method2489(arg1)) {
                StringBuilder var8 = new StringBuilder(var7);
                for (int var9 = var5; var9 < var6; var9++) {
                    char var10 = arg0.charAt(var9);
                    if (class529.method3587(var10)) {
                        char var11 = class529.method5052(var10);
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
        this.field5574 = var4;
    }

    @ObfuscatedName("wf.ac(B)Ljava/lang/String;")
    public String method9621() {
        return this.field5575;
    }

    @ObfuscatedName("wf.ae(I)Ljava/lang/String;")
    public String method9622() {
        return this.field5574;
    }

    @ObfuscatedName("wf.ag(I)Z")
    public boolean method9639() {
        return this.field5574 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class574) {
            return false;
        }
        class574 var2 = (class574) arg0;
        if (this.field5574 == null) {
            return var2.field5574 == null;
        } else if (var2.field5574 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5574.equals(var2.field5574);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5574 == null ? 0 : this.field5574.hashCode();
    }

    public String toString() {
        return this.method9621();
    }

    @ObfuscatedName("wf.ax(Lwf;I)I")
    public int method9625(class574 arg0) {
        if (this.field5574 == null) {
            return arg0.field5574 == null ? 0 : 1;
        } else if (arg0.field5574 == null) {
            return -1;
        } else {
            return this.field5574.compareTo(arg0.field5574);
        }
    }

    public int compareTo(Object arg0) {
        return this.method9625((class574) arg0);
    }
}
