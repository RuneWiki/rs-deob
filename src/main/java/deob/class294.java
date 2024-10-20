package deob;

@ObfuscatedName("kz")
public class class294 implements Comparable {

    @ObfuscatedName("kz.c")
    public String field3690;

    @ObfuscatedName("kz.q")
    public String field3691;

    public class294(String arg0, class331 arg1) {
        this.field3690 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label96: {
                int var5 = 0;
                int var6 = arg0.length();
                while (var5 < var6 && class305.method299(arg0.charAt(var5))) {
                    var5++;
                }
                while (var6 > var5) {
                    char var7 = arg0.charAt(var6 - 1);
                    boolean var8 = var7 == 160 || var7 == ' ' || var7 == '_' || var7 == '-';
                    if (!var8) {
                        break;
                    }
                    var6--;
                }
                int var9 = var6 - var5;
                if (var9 >= 1) {
                    byte var11;
                    if (arg1 == null) {
                        var11 = 12;
                    } else {
                        switch(arg1.field3978) {
                            case 2:
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
                            if (class305.method4169(var14)) {
                                char var15;
                                switch(var14) {
                                    case ' ':
                                    case '-':
                                    case '_':
                                    case ' ':
                                        var15 = '_';
                                        break;
                                    case '#':
                                    case '[':
                                    case ']':
                                        var15 = var14;
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
                                        var15 = 'a';
                                        break;
                                    case 'Ç':
                                    case 'ç':
                                        var15 = 'c';
                                        break;
                                    case 'È':
                                    case 'É':
                                    case 'Ê':
                                    case 'Ë':
                                    case 'è':
                                    case 'é':
                                    case 'ê':
                                    case 'ë':
                                        var15 = 'e';
                                        break;
                                    case 'Í':
                                    case 'Î':
                                    case 'Ï':
                                    case 'í':
                                    case 'î':
                                    case 'ï':
                                        var15 = 'i';
                                        break;
                                    case 'Ñ':
                                    case 'ñ':
                                        var15 = 'n';
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
                                        var15 = 'o';
                                        break;
                                    case 'Ù':
                                    case 'Ú':
                                    case 'Û':
                                    case 'Ü':
                                    case 'ù':
                                    case 'ú':
                                    case 'û':
                                    case 'ü':
                                        var15 = 'u';
                                        break;
                                    case 'ß':
                                        var15 = 'b';
                                        break;
                                    case 'ÿ':
                                    case 'Ÿ':
                                        var15 = 'y';
                                        break;
                                    default:
                                        var15 = Character.toLowerCase(var14);
                                }
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
                        break label96;
                    }
                }
                var4 = null;
            }
        }
        this.field3691 = var4;
    }

    @ObfuscatedName("kz.c(I)Ljava/lang/String;")
    public String method5075() {
        return this.field3690;
    }

    @ObfuscatedName("kz.q(B)Z")
    public boolean method5076() {
        return this.field3691 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class294) {
            return false;
        }
        class294 var2 = (class294) arg0;
        if (this.field3691 == null) {
            return var2.field3691 == null;
        } else if (var2.field3691 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3691.equals(var2.field3691);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3691 == null ? 0 : this.field3691.hashCode();
    }

    public String toString() {
        return this.method5075();
    }

    @ObfuscatedName("kz.m(Lkz;B)I")
    public int method5077(class294 arg0) {
        if (this.field3691 == null) {
            return arg0.field3691 == null ? 0 : 1;
        } else if (arg0.field3691 == null) {
            return -1;
        } else {
            return this.field3691.compareTo(arg0.field3691);
        }
    }

    public int compareTo(Object arg0) {
        return this.method5077((class294) arg0);
    }
}
