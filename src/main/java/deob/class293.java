package deob;

@ObfuscatedName("ku")
public class class293 implements Comparable {

    @ObfuscatedName("ku.x")
    public String field3622;

    @ObfuscatedName("ku.m")
    public String field3623;

    public class293(String arg0, class348 arg1) {
        this.field3622 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
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
            if (var11 >= 1 && var11 <= class349.method3838(arg1)) {
                StringBuilder var12 = new StringBuilder(var11);
                for (int var13 = var5; var13 < var6; var13++) {
                    char var14 = arg0.charAt(var13);
                    boolean var15;
                    if (Character.isISOControl(var14)) {
                        var15 = false;
                    } else if (class301.method589(var14)) {
                        var15 = true;
                    } else {
                        char[] var16 = class349.field4063;
                        int var17 = 0;
                        label90: while (true) {
                            if (var17 >= var16.length) {
                                char[] var19 = class349.field4064;
                                for (int var20 = 0; var20 < var19.length; var20++) {
                                    char var21 = var19[var20];
                                    if (var14 == var21) {
                                        var15 = true;
                                        break label90;
                                    }
                                }
                                var15 = false;
                                break;
                            }
                            char var18 = var16[var17];
                            if (var14 == var18) {
                                var15 = true;
                                break;
                            }
                            var17++;
                        }
                    }
                    if (var15) {
                        char var22;
                        switch(var14) {
                            case ' ':
                            case '-':
                            case '_':
                            case ' ':
                                var22 = '_';
                                break;
                            case '#':
                            case '[':
                            case ']':
                                var22 = var14;
                                break;
                            case 'À':
                            case 'Á':
                            case 'Â':
                            case 'Ã':
                            case 'Ä':
                            case 'à':
                            case 'á':
                            case 'â':
                            case 'ã':
                            case 'ä':
                                var22 = 'a';
                                break;
                            case 'Ç':
                            case 'ç':
                                var22 = 'c';
                                break;
                            case 'È':
                            case 'É':
                            case 'Ê':
                            case 'Ë':
                            case 'è':
                            case 'é':
                            case 'ê':
                            case 'ë':
                                var22 = 'e';
                                break;
                            case 'Í':
                            case 'Î':
                            case 'Ï':
                            case 'í':
                            case 'î':
                            case 'ï':
                                var22 = 'i';
                                break;
                            case 'Ñ':
                            case 'ñ':
                                var22 = 'n';
                                break;
                            case 'Ò':
                            case 'Ó':
                            case 'Ô':
                            case 'Õ':
                            case 'Ö':
                            case 'ò':
                            case 'ó':
                            case 'ô':
                            case 'õ':
                            case 'ö':
                                var22 = 'o';
                                break;
                            case 'Ù':
                            case 'Ú':
                            case 'Û':
                            case 'Ü':
                            case 'ù':
                            case 'ú':
                            case 'û':
                            case 'ü':
                                var22 = 'u';
                                break;
                            case 'ß':
                                var22 = 'b';
                                break;
                            case 'ÿ':
                            case 'Ÿ':
                                var22 = 'y';
                                break;
                            default:
                                var22 = Character.toLowerCase(var14);
                        }
                        if (var22 != 0) {
                            var12.append(var22);
                        }
                    }
                }
                if (var12.length() == 0) {
                    var4 = null;
                } else {
                    var4 = var12.toString();
                }
            } else {
                var4 = null;
            }
        }
        this.field3623 = var4;
    }

    @ObfuscatedName("ku.x(I)Ljava/lang/String;")
    public String method4845() {
        return this.field3622;
    }

    @ObfuscatedName("ku.m(I)Z")
    public boolean method4846() {
        return this.field3623 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class293) {
            return false;
        }
        class293 var2 = (class293) arg0;
        if (this.field3623 == null) {
            return var2.field3623 == null;
        } else if (var2.field3623 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3623.equals(var2.field3623);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3623 == null ? 0 : this.field3623.hashCode();
    }

    public String toString() {
        return this.method4845();
    }

    @ObfuscatedName("ku.k(Lku;B)I")
    public int method4847(class293 arg0) {
        if (this.field3623 == null) {
            return arg0.field3623 == null ? 0 : 1;
        } else if (arg0.field3623 == null) {
            return -1;
        } else {
            return this.field3623.compareTo(arg0.field3623);
        }
    }

    public int compareTo(Object arg0) {
        return this.method4847((class293) arg0);
    }
}
