package deob;

@ObfuscatedName("vf")
public class class572 implements Comparable {

    @ObfuscatedName("vf.ab")
    public String field5544;

    @ObfuscatedName("vf.ay")
    public String field5545;

    public class572(String arg0) {
        this.field5544 = arg0;
        class526 var3 = class526.field5252;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label95: {
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
                while (var6 > var5) {
                    char var9 = arg0.charAt(var6 - 1);
                    boolean var10 = var9 == 160 || var9 == ' ' || var9 == '_' || var9 == '-';
                    if (!var10) {
                        break;
                    }
                    var6--;
                }
                int var11 = var6 - var5;
                if (var11 >= 1) {
                    byte var13;
                    if (var3 == null) {
                        var13 = 12;
                    } else {
                        switch(var3.field5250) {
                            case 4:
                                var13 = 20;
                                break;
                            default:
                                var13 = 12;
                        }
                    }
                    if (var11 <= var13) {
                        StringBuilder var14 = new StringBuilder(var11);
                        for (int var15 = var5; var15 < var6; var15++) {
                            char var16 = arg0.charAt(var15);
                            if (class527.method6579(var16)) {
                                char var17 = class527.method2873(var16);
                                if (var17 != 0) {
                                    var14.append(var17);
                                }
                            }
                        }
                        if (var14.length() == 0) {
                            var4 = null;
                        } else {
                            var4 = var14.toString();
                        }
                        break label95;
                    }
                }
                var4 = null;
            }
        }
        this.field5545 = var4;
    }

    public class572(String arg0, class526 arg1) {
        this.field5544 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label95: {
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
                while (var6 > var5) {
                    char var9 = arg0.charAt(var6 - 1);
                    boolean var10 = var9 == 160 || var9 == ' ' || var9 == '_' || var9 == '-';
                    if (!var10) {
                        break;
                    }
                    var6--;
                }
                int var11 = var6 - var5;
                if (var11 >= 1) {
                    byte var13;
                    if (arg1 == null) {
                        var13 = 12;
                    } else {
                        switch(arg1.field5250) {
                            case 4:
                                var13 = 20;
                                break;
                            default:
                                var13 = 12;
                        }
                    }
                    if (var11 <= var13) {
                        StringBuilder var14 = new StringBuilder(var11);
                        for (int var15 = var5; var15 < var6; var15++) {
                            char var16 = arg0.charAt(var15);
                            if (class527.method6579(var16)) {
                                char var17 = class527.method2873(var16);
                                if (var17 != 0) {
                                    var14.append(var17);
                                }
                            }
                        }
                        if (var14.length() == 0) {
                            var4 = null;
                        } else {
                            var4 = var14.toString();
                        }
                        break label95;
                    }
                }
                var4 = null;
            }
        }
        this.field5545 = var4;
    }

    @ObfuscatedName("vf.ab(B)Ljava/lang/String;")
    public String method9470() {
        return this.field5544;
    }

    @ObfuscatedName("vf.ay(I)Ljava/lang/String;")
    public String method9471() {
        return this.field5545;
    }

    @ObfuscatedName("vf.ax(B)Z")
    public boolean method9468() {
        return this.field5545 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class572) {
            return false;
        }
        class572 var2 = (class572) arg0;
        if (this.field5545 == null) {
            return var2.field5545 == null;
        } else if (var2.field5545 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5545.equals(var2.field5545);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5545 == null ? 0 : this.field5545.hashCode();
    }

    public String toString() {
        return this.method9470();
    }

    @ObfuscatedName("vf.ao(Lvf;S)I")
    public int method9478(class572 arg0) {
        if (this.field5545 == null) {
            return arg0.field5545 == null ? 0 : 1;
        } else if (arg0.field5545 == null) {
            return -1;
        } else {
            return this.field5545.compareTo(arg0.field5545);
        }
    }

    public int compareTo(Object arg0) {
        return this.method9478((class572) arg0);
    }
}
