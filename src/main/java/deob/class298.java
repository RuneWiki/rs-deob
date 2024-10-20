package deob;

@ObfuscatedName("kx")
public class class298 implements Comparable {

    @ObfuscatedName("kx.a")
    public String field3729;

    @ObfuscatedName("kx.s")
    public String field3727;

    public class298(String arg0, class335 arg1) {
        this.field3729 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            int var5 = 0;
            int var6 = arg0.length();
            while (var5 < var6 && class309.method198(arg0.charAt(var5))) {
                var5++;
            }
            while (var6 > var5 && class309.method198(arg0.charAt(var6 - 1))) {
                var6--;
            }
            int var7 = var6 - var5;
            if (var7 >= 1 && var7 <= class309.method3290(arg1)) {
                StringBuilder var8 = new StringBuilder(var7);
                for (int var9 = var5; var9 < var6; var9++) {
                    char var10 = arg0.charAt(var9);
                    boolean var11;
                    if (Character.isISOControl(var10)) {
                        var11 = false;
                    } else if (class312.method2559(var10)) {
                        var11 = true;
                    } else {
                        char[] var12 = class309.field3800;
                        int var13 = 0;
                        label61: while (true) {
                            if (var13 >= var12.length) {
                                char[] var15 = class309.field3802;
                                for (int var16 = 0; var16 < var15.length; var16++) {
                                    char var17 = var15[var16];
                                    if (var10 == var17) {
                                        var11 = true;
                                        break label61;
                                    }
                                }
                                var11 = false;
                                break;
                            }
                            char var14 = var12[var13];
                            if (var10 == var14) {
                                var11 = true;
                                break;
                            }
                            var13++;
                        }
                    }
                    if (var11) {
                        char var18 = class309.method1103(var10);
                        if (var18 != 0) {
                            var8.append(var18);
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
        this.field3727 = var4;
    }

    @ObfuscatedName("kx.a(B)Ljava/lang/String;")
    public String method5236() {
        return this.field3729;
    }

    @ObfuscatedName("kx.s(I)Z")
    public boolean method5238() {
        return this.field3727 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class298) {
            return false;
        }
        class298 var2 = (class298) arg0;
        if (this.field3727 == null) {
            return var2.field3727 == null;
        } else if (var2.field3727 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3727.equals(var2.field3727);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3727 == null ? 0 : this.field3727.hashCode();
    }

    public String toString() {
        return this.method5236();
    }

    @ObfuscatedName("kx.g(Lkx;I)I")
    public int method5239(class298 arg0) {
        if (this.field3727 == null) {
            return arg0.field3727 == null ? 0 : 1;
        } else if (arg0.field3727 == null) {
            return -1;
        } else {
            return this.field3727.compareTo(arg0.field3727);
        }
    }

    public int compareTo(Object arg0) {
        return this.method5239((class298) arg0);
    }
}
