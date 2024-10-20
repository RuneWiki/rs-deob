package deob;

@ObfuscatedName("kb")
public class class306 implements Comparable {

    @ObfuscatedName("kb.g")
    public String field3866;

    @ObfuscatedName("kb.e")
    public String field3867;

    public class306(String arg0, class336 arg1) {
        this.field3866 = arg0;
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
            if (var11 >= 1 && var11 <= class316.method3033(arg1)) {
                StringBuilder var12 = new StringBuilder(var11);
                for (int var13 = var5; var13 < var6; var13++) {
                    char var14 = arg0.charAt(var13);
                    if (class316.method1832(var14)) {
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
            } else {
                var4 = null;
            }
        }
        this.field3867 = var4;
    }

    @ObfuscatedName("kb.g(I)Ljava/lang/String;")
    public String method5060() {
        return this.field3866;
    }

    @ObfuscatedName("kb.e(B)Z")
    public boolean method5061() {
        return this.field3867 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class306) {
            return false;
        }
        class306 var2 = (class306) arg0;
        if (this.field3867 == null) {
            return var2.field3867 == null;
        } else if (var2.field3867 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3867.equals(var2.field3867);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3867 == null ? 0 : this.field3867.hashCode();
    }

    public String toString() {
        return this.method5060();
    }

    @ObfuscatedName("kb.b(Lkb;I)I")
    public int method5062(class306 arg0) {
        if (this.field3867 == null) {
            return arg0.field3867 == null ? 0 : 1;
        } else if (arg0.field3867 == null) {
            return -1;
        } else {
            return this.field3867.compareTo(arg0.field3867);
        }
    }

    public int compareTo(Object arg0) {
        return this.method5062((class306) arg0);
    }
}
