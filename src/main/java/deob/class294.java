package deob;

@ObfuscatedName("kk")
public class class294 implements Comparable {

    @ObfuscatedName("kk.v")
    public String field3678;

    @ObfuscatedName("kk.s")
    public String field3679;

    public class294(String arg0, class326 arg1) {
        this.field3678 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label110: {
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
                        switch(arg1.field3918) {
                            case 6:
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
                            if (class305.method462(var16)) {
                                char var17;
                                switch(var16) {
                                    case ' ':
                                    case '-':
                                    case '_':
                                    case ' ':
                                        var17 = '_';
                                        break;
                                    case '#':
                                    case '[':
                                    case ']':
                                        var17 = var16;
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
                                        var17 = 'a';
                                        break;
                                    case 'Ç':
                                    case 'ç':
                                        var17 = 'c';
                                        break;
                                    case 'È':
                                    case 'É':
                                    case 'Ê':
                                    case 'Ë':
                                    case 'è':
                                    case 'é':
                                    case 'ê':
                                    case 'ë':
                                        var17 = 'e';
                                        break;
                                    case 'Í':
                                    case 'Î':
                                    case 'Ï':
                                    case 'í':
                                    case 'î':
                                    case 'ï':
                                        var17 = 'i';
                                        break;
                                    case 'Ñ':
                                    case 'ñ':
                                        var17 = 'n';
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
                                        var17 = 'o';
                                        break;
                                    case 'Ù':
                                    case 'Ú':
                                    case 'Û':
                                    case 'Ü':
                                    case 'ù':
                                    case 'ú':
                                    case 'û':
                                    case 'ü':
                                        var17 = 'u';
                                        break;
                                    case 'ß':
                                        var17 = 'b';
                                        break;
                                    case 'ÿ':
                                    case 'Ÿ':
                                        var17 = 'y';
                                        break;
                                    default:
                                        var17 = Character.toLowerCase(var16);
                                }
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
                        break label110;
                    }
                }
                var4 = null;
            }
        }
        this.field3679 = var4;
    }

    @ObfuscatedName("kk.v(I)Ljava/lang/String;")
    public String method5082() {
        return this.field3678;
    }

    @ObfuscatedName("kk.s(B)Z")
    public boolean method5084() {
        return this.field3679 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class294) {
            return false;
        }
        class294 var2 = (class294) arg0;
        if (this.field3679 == null) {
            return var2.field3679 == null;
        } else if (var2.field3679 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3679.equals(var2.field3679);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3679 == null ? 0 : this.field3679.hashCode();
    }

    public String toString() {
        return this.method5082();
    }

    @ObfuscatedName("kk.o(Lkk;I)I")
    public int method5086(class294 arg0) {
        if (this.field3679 == null) {
            return arg0.field3679 == null ? 0 : 1;
        } else if (arg0.field3679 == null) {
            return -1;
        } else {
            return this.field3679.compareTo(arg0.field3679);
        }
    }

    public int compareTo(Object arg0) {
        return this.method5086((class294) arg0);
    }
}
