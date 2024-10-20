package deob;

@ObfuscatedName("rp")
public class class490 implements Comparable {

    @ObfuscatedName("rp.h")
    public String field5062;

    @ObfuscatedName("rp.e")
    public String field5061;

    public class490(String arg0) {
        this.field5062 = arg0;
        class447 var3 = class447.field4832;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label81: {
                int var5 = 0;
                int var6 = arg0.length();
                while (var5 < var6) {
                    char var7 = arg0.charAt(var5);
                    boolean var8 = var7 == 160 || var7 == ' ' || var7 == '_' || var7 == '-';
                    if (!var8) {
                        break;
                    }
                    var5++;
                }
                while (var6 > var5 && class448.method1133(arg0.charAt(var6 - 1))) {
                    var6--;
                }
                int var9 = var6 - var5;
                if (var9 >= 1) {
                    byte var11;
                    if (var3 == null) {
                        var11 = 12;
                    } else {
                        switch(var3.field4834) {
                            case 1:
                                var11 = 20;
                                break;
                            default:
                                var11 = 12;
                        }
                    }
                    if (var9 <= var11) {
                        StringBuilder var12 = new StringBuilder(var9);
                        for (int var13 = var5; var13 < var6; var13++) {
                            char var14 = arg0.charAt(var13);
                            if (class448.method3798(var14)) {
                                char var15 = class448.method6911(var14);
                                if (var15 != 0) {
                                    var12.append(var15);
                                }
                            }
                        }
                        if (var12.length() == 0) {
                            var4 = null;
                        } else {
                            var4 = var12.toString();
                        }
                        break label81;
                    }
                }
                var4 = null;
            }
        }
        this.field5061 = var4;
    }

    public class490(String arg0, class447 arg1) {
        this.field5062 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label81: {
                int var5 = 0;
                int var6 = arg0.length();
                while (var5 < var6) {
                    char var7 = arg0.charAt(var5);
                    boolean var8 = var7 == 160 || var7 == ' ' || var7 == '_' || var7 == '-';
                    if (!var8) {
                        break;
                    }
                    var5++;
                }
                while (var6 > var5 && class448.method1133(arg0.charAt(var6 - 1))) {
                    var6--;
                }
                int var9 = var6 - var5;
                if (var9 >= 1) {
                    byte var11;
                    if (arg1 == null) {
                        var11 = 12;
                    } else {
                        switch(arg1.field4834) {
                            case 1:
                                var11 = 20;
                                break;
                            default:
                                var11 = 12;
                        }
                    }
                    if (var9 <= var11) {
                        StringBuilder var12 = new StringBuilder(var9);
                        for (int var13 = var5; var13 < var6; var13++) {
                            char var14 = arg0.charAt(var13);
                            if (class448.method3798(var14)) {
                                char var15 = class448.method6911(var14);
                                if (var15 != 0) {
                                    var12.append(var15);
                                }
                            }
                        }
                        if (var12.length() == 0) {
                            var4 = null;
                        } else {
                            var4 = var12.toString();
                        }
                        break label81;
                    }
                }
                var4 = null;
            }
        }
        this.field5061 = var4;
    }

    @ObfuscatedName("rp.h(I)Ljava/lang/String;")
    public String method8383() {
        return this.field5062;
    }

    @ObfuscatedName("rp.e(B)Ljava/lang/String;")
    public String method8384() {
        return this.field5061;
    }

    @ObfuscatedName("rp.v(B)Z")
    public boolean method8385() {
        return this.field5061 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class490) {
            return false;
        }
        class490 var2 = (class490) arg0;
        if (this.field5061 == null) {
            return var2.field5061 == null;
        } else if (var2.field5061 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5061.equals(var2.field5061);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5061 == null ? 0 : this.field5061.hashCode();
    }

    public String toString() {
        return this.method8383();
    }

    @ObfuscatedName("rp.x(Lrp;B)I")
    public int method8391(class490 arg0) {
        if (this.field5061 == null) {
            return arg0.field5061 == null ? 0 : 1;
        } else if (arg0.field5061 == null) {
            return -1;
        } else {
            return this.field5061.compareTo(arg0.field5061);
        }
    }

    public int compareTo(Object arg0) {
        return this.method8391((class490) arg0);
    }
}
