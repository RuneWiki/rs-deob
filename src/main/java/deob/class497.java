package deob;

@ObfuscatedName("si")
public class class497 implements Comparable {

    @ObfuscatedName("si.f")
    public String field5086;

    @ObfuscatedName("si.w")
    public String field5087;

    public class497(String arg0) {
        this.field5086 = arg0;
        class454 var3 = class454.field4852;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label115: {
                int var5 = 0;
                int var6 = arg0.length();
                while (var5 < var6 && class455.method1994(arg0.charAt(var5))) {
                    var5++;
                }
                while (var6 > var5 && class455.method1994(arg0.charAt(var6 - 1))) {
                    var6--;
                }
                int var7 = var6 - var5;
                if (var7 >= 1) {
                    byte var9;
                    if (var3 == null) {
                        var9 = 12;
                    } else {
                        switch(var3.field4860) {
                            case 5:
                                var9 = 20;
                                break;
                            default:
                                var9 = 12;
                        }
                    }
                    if (var7 <= var9) {
                        StringBuilder var10 = new StringBuilder(var7);
                        for (int var11 = var5; var11 < var6; var11++) {
                            char var12 = arg0.charAt(var11);
                            boolean var13;
                            if (Character.isISOControl(var12)) {
                                var13 = false;
                            } else if (class365.method2577(var12)) {
                                var13 = true;
                            } else {
                                char[] var14 = class455.field4865;
                                int var15 = 0;
                                label82: while (true) {
                                    if (var15 >= var14.length) {
                                        char[] var17 = class455.field4866;
                                        for (int var18 = 0; var18 < var17.length; var18++) {
                                            char var19 = var17[var18];
                                            if (var12 == var19) {
                                                var13 = true;
                                                break label82;
                                            }
                                        }
                                        var13 = false;
                                        break;
                                    }
                                    char var16 = var14[var15];
                                    if (var12 == var16) {
                                        var13 = true;
                                        break;
                                    }
                                    var15++;
                                }
                            }
                            if (var13) {
                                char var20;
                                switch(var12) {
                                    case ' ':
                                    case '-':
                                    case '_':
                                    case ' ':
                                        var20 = '_';
                                        break;
                                    case '#':
                                    case '[':
                                    case ']':
                                        var20 = var12;
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
                                        var20 = 'a';
                                        break;
                                    case 'Ç':
                                    case 'ç':
                                        var20 = 'c';
                                        break;
                                    case 'È':
                                    case 'É':
                                    case 'Ê':
                                    case 'Ë':
                                    case 'è':
                                    case 'é':
                                    case 'ê':
                                    case 'ë':
                                        var20 = 'e';
                                        break;
                                    case 'Í':
                                    case 'Î':
                                    case 'Ï':
                                    case 'í':
                                    case 'î':
                                    case 'ï':
                                        var20 = 'i';
                                        break;
                                    case 'Ñ':
                                    case 'ñ':
                                        var20 = 'n';
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
                                        var20 = 'o';
                                        break;
                                    case 'Ù':
                                    case 'Ú':
                                    case 'Û':
                                    case 'Ü':
                                    case 'ù':
                                    case 'ú':
                                    case 'û':
                                    case 'ü':
                                        var20 = 'u';
                                        break;
                                    case 'ß':
                                        var20 = 'b';
                                        break;
                                    case 'ÿ':
                                    case 'Ÿ':
                                        var20 = 'y';
                                        break;
                                    default:
                                        var20 = Character.toLowerCase(var12);
                                }
                                if (var20 != 0) {
                                    var10.append(var20);
                                }
                            }
                        }
                        if (var10.length() == 0) {
                            var4 = null;
                        } else {
                            var4 = var10.toString();
                        }
                        break label115;
                    }
                }
                var4 = null;
            }
        }
        this.field5087 = var4;
    }

    public class497(String arg0, class454 arg1) {
        this.field5086 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label115: {
                int var5 = 0;
                int var6 = arg0.length();
                while (var5 < var6 && class455.method1994(arg0.charAt(var5))) {
                    var5++;
                }
                while (var6 > var5 && class455.method1994(arg0.charAt(var6 - 1))) {
                    var6--;
                }
                int var7 = var6 - var5;
                if (var7 >= 1) {
                    byte var9;
                    if (arg1 == null) {
                        var9 = 12;
                    } else {
                        switch(arg1.field4860) {
                            case 5:
                                var9 = 20;
                                break;
                            default:
                                var9 = 12;
                        }
                    }
                    if (var7 <= var9) {
                        StringBuilder var10 = new StringBuilder(var7);
                        for (int var11 = var5; var11 < var6; var11++) {
                            char var12 = arg0.charAt(var11);
                            boolean var13;
                            if (Character.isISOControl(var12)) {
                                var13 = false;
                            } else if (class365.method2577(var12)) {
                                var13 = true;
                            } else {
                                char[] var14 = class455.field4865;
                                int var15 = 0;
                                label82: while (true) {
                                    if (var15 >= var14.length) {
                                        char[] var17 = class455.field4866;
                                        for (int var18 = 0; var18 < var17.length; var18++) {
                                            char var19 = var17[var18];
                                            if (var12 == var19) {
                                                var13 = true;
                                                break label82;
                                            }
                                        }
                                        var13 = false;
                                        break;
                                    }
                                    char var16 = var14[var15];
                                    if (var12 == var16) {
                                        var13 = true;
                                        break;
                                    }
                                    var15++;
                                }
                            }
                            if (var13) {
                                char var20;
                                switch(var12) {
                                    case ' ':
                                    case '-':
                                    case '_':
                                    case ' ':
                                        var20 = '_';
                                        break;
                                    case '#':
                                    case '[':
                                    case ']':
                                        var20 = var12;
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
                                        var20 = 'a';
                                        break;
                                    case 'Ç':
                                    case 'ç':
                                        var20 = 'c';
                                        break;
                                    case 'È':
                                    case 'É':
                                    case 'Ê':
                                    case 'Ë':
                                    case 'è':
                                    case 'é':
                                    case 'ê':
                                    case 'ë':
                                        var20 = 'e';
                                        break;
                                    case 'Í':
                                    case 'Î':
                                    case 'Ï':
                                    case 'í':
                                    case 'î':
                                    case 'ï':
                                        var20 = 'i';
                                        break;
                                    case 'Ñ':
                                    case 'ñ':
                                        var20 = 'n';
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
                                        var20 = 'o';
                                        break;
                                    case 'Ù':
                                    case 'Ú':
                                    case 'Û':
                                    case 'Ü':
                                    case 'ù':
                                    case 'ú':
                                    case 'û':
                                    case 'ü':
                                        var20 = 'u';
                                        break;
                                    case 'ß':
                                        var20 = 'b';
                                        break;
                                    case 'ÿ':
                                    case 'Ÿ':
                                        var20 = 'y';
                                        break;
                                    default:
                                        var20 = Character.toLowerCase(var12);
                                }
                                if (var20 != 0) {
                                    var10.append(var20);
                                }
                            }
                        }
                        if (var10.length() == 0) {
                            var4 = null;
                        } else {
                            var4 = var10.toString();
                        }
                        break label115;
                    }
                }
                var4 = null;
            }
        }
        this.field5087 = var4;
    }

    @ObfuscatedName("si.f(S)Ljava/lang/String;")
    public String method8556() {
        return this.field5086;
    }

    @ObfuscatedName("si.w(B)Ljava/lang/String;")
    public String method8572() {
        return this.field5087;
    }

    @ObfuscatedName("si.v(B)Z")
    public boolean method8558() {
        return this.field5087 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class497) {
            return false;
        }
        class497 var2 = (class497) arg0;
        if (this.field5087 == null) {
            return var2.field5087 == null;
        } else if (var2.field5087 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5087.equals(var2.field5087);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5087 == null ? 0 : this.field5087.hashCode();
    }

    public String toString() {
        return this.method8556();
    }

    @ObfuscatedName("si.s(Lsi;B)I")
    public int method8561(class497 arg0) {
        if (this.field5087 == null) {
            return arg0.field5087 == null ? 0 : 1;
        } else if (arg0.field5087 == null) {
            return -1;
        } else {
            return this.field5087.compareTo(arg0.field5087);
        }
    }

    public int compareTo(Object arg0) {
        return this.method8561((class497) arg0);
    }
}
