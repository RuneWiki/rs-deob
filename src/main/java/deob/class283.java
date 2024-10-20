package deob;

@ObfuscatedName("jc")
public class class283 implements Comparable {

    @ObfuscatedName("jc.f")
    public String field3607;

    @ObfuscatedName("jc.i")
    public String field3606;

    public class283(String arg0, class338 arg1) {
        this.field3607 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label143: {
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
                        switch(arg1.field4030) {
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
                            boolean var17;
                            if (Character.isISOControl(var16)) {
                                var17 = false;
                            } else if (class291.method3330(var16)) {
                                var17 = true;
                            } else {
                                char[] var18 = class339.field4038;
                                int var19 = 0;
                                label96: while (true) {
                                    if (var19 >= var18.length) {
                                        char[] var21 = class339.field4036;
                                        for (int var22 = 0; var22 < var21.length; var22++) {
                                            char var23 = var21[var22];
                                            if (var16 == var23) {
                                                var17 = true;
                                                break label96;
                                            }
                                        }
                                        var17 = false;
                                        break;
                                    }
                                    char var20 = var18[var19];
                                    if (var16 == var20) {
                                        var17 = true;
                                        break;
                                    }
                                    var19++;
                                }
                            }
                            if (var17) {
                                char var24;
                                switch(var16) {
                                    case ' ':
                                    case '-':
                                    case '_':
                                    case ' ':
                                        var24 = '_';
                                        break;
                                    case '#':
                                    case '[':
                                    case ']':
                                        var24 = var16;
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
                                        var24 = 'a';
                                        break;
                                    case 'Ç':
                                    case 'ç':
                                        var24 = 'c';
                                        break;
                                    case 'È':
                                    case 'É':
                                    case 'Ê':
                                    case 'Ë':
                                    case 'è':
                                    case 'é':
                                    case 'ê':
                                    case 'ë':
                                        var24 = 'e';
                                        break;
                                    case 'Í':
                                    case 'Î':
                                    case 'Ï':
                                    case 'í':
                                    case 'î':
                                    case 'ï':
                                        var24 = 'i';
                                        break;
                                    case 'Ñ':
                                    case 'ñ':
                                        var24 = 'n';
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
                                        var24 = 'o';
                                        break;
                                    case 'Ù':
                                    case 'Ú':
                                    case 'Û':
                                    case 'Ü':
                                    case 'ù':
                                    case 'ú':
                                    case 'û':
                                    case 'ü':
                                        var24 = 'u';
                                        break;
                                    case 'ß':
                                        var24 = 'b';
                                        break;
                                    case 'ÿ':
                                    case 'Ÿ':
                                        var24 = 'y';
                                        break;
                                    default:
                                        var24 = Character.toLowerCase(var16);
                                }
                                if (var24 != 0) {
                                    var14.append(var24);
                                }
                            }
                        }
                        if (var14.length() == 0) {
                            var4 = null;
                        } else {
                            var4 = var14.toString();
                        }
                        break label143;
                    }
                }
                var4 = null;
            }
        }
        this.field3606 = var4;
    }

    @ObfuscatedName("jc.f(I)Ljava/lang/String;")
    public String method4822() {
        return this.field3607;
    }

    @ObfuscatedName("jc.i(I)Z")
    public boolean method4823() {
        return this.field3606 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class283) {
            return false;
        }
        class283 var2 = (class283) arg0;
        if (this.field3606 == null) {
            return var2.field3606 == null;
        } else if (var2.field3606 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3606.equals(var2.field3606);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3606 == null ? 0 : this.field3606.hashCode();
    }

    public String toString() {
        return this.method4822();
    }

    @ObfuscatedName("jc.y(Ljc;I)I")
    public int method4825(class283 arg0) {
        if (this.field3606 == null) {
            return arg0.field3606 == null ? 0 : 1;
        } else if (arg0.field3606 == null) {
            return -1;
        } else {
            return this.field3606.compareTo(arg0.field3606);
        }
    }

    public int compareTo(Object arg0) {
        return this.method4825((class283) arg0);
    }
}
