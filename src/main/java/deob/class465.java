package deob;

@ObfuscatedName("qy")
public class class465 implements Comparable {

    @ObfuscatedName("qy.s")
    public String field4837;

    @ObfuscatedName("qy.h")
    public String field4838;

    public class465(String arg0) {
        this.field4837 = arg0;
        class424 var3 = class424.field4609;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label82: {
                int var5 = 0;
                int var6 = arg0.length();
                while (var5 < var6 && class425.method4067(arg0.charAt(var5))) {
                    var5++;
                }
                while (var6 > var5 && class425.method4067(arg0.charAt(var6 - 1))) {
                    var6--;
                }
                int var7 = var6 - var5;
                if (var7 >= 1) {
                    byte var9;
                    if (var3 == null) {
                        var9 = 12;
                    } else {
                        switch(var3.field4617) {
                            case 1:
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
                            if (class425.method6388(var12)) {
                                char var13;
                                switch(var12) {
                                    case ' ':
                                    case '-':
                                    case '_':
                                    case ' ':
                                        var13 = '_';
                                        break;
                                    case '#':
                                    case '[':
                                    case ']':
                                        var13 = var12;
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
                                        var13 = 'a';
                                        break;
                                    case 'Ç':
                                    case 'ç':
                                        var13 = 'c';
                                        break;
                                    case 'È':
                                    case 'É':
                                    case 'Ê':
                                    case 'Ë':
                                    case 'è':
                                    case 'é':
                                    case 'ê':
                                    case 'ë':
                                        var13 = 'e';
                                        break;
                                    case 'Í':
                                    case 'Î':
                                    case 'Ï':
                                    case 'í':
                                    case 'î':
                                    case 'ï':
                                        var13 = 'i';
                                        break;
                                    case 'Ñ':
                                    case 'ñ':
                                        var13 = 'n';
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
                                        var13 = 'o';
                                        break;
                                    case 'Ù':
                                    case 'Ú':
                                    case 'Û':
                                    case 'Ü':
                                    case 'ù':
                                    case 'ú':
                                    case 'û':
                                    case 'ü':
                                        var13 = 'u';
                                        break;
                                    case 'ß':
                                        var13 = 'b';
                                        break;
                                    case 'ÿ':
                                    case 'Ÿ':
                                        var13 = 'y';
                                        break;
                                    default:
                                        var13 = Character.toLowerCase(var12);
                                }
                                if (var13 != 0) {
                                    var10.append(var13);
                                }
                            }
                        }
                        if (var10.length() == 0) {
                            var4 = null;
                        } else {
                            var4 = var10.toString();
                        }
                        break label82;
                    }
                }
                var4 = null;
            }
        }
        this.field4838 = var4;
    }

    public class465(String arg0, class424 arg1) {
        this.field4837 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label82: {
                int var5 = 0;
                int var6 = arg0.length();
                while (var5 < var6 && class425.method4067(arg0.charAt(var5))) {
                    var5++;
                }
                while (var6 > var5 && class425.method4067(arg0.charAt(var6 - 1))) {
                    var6--;
                }
                int var7 = var6 - var5;
                if (var7 >= 1) {
                    byte var9;
                    if (arg1 == null) {
                        var9 = 12;
                    } else {
                        switch(arg1.field4617) {
                            case 1:
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
                            if (class425.method6388(var12)) {
                                char var13;
                                switch(var12) {
                                    case ' ':
                                    case '-':
                                    case '_':
                                    case ' ':
                                        var13 = '_';
                                        break;
                                    case '#':
                                    case '[':
                                    case ']':
                                        var13 = var12;
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
                                        var13 = 'a';
                                        break;
                                    case 'Ç':
                                    case 'ç':
                                        var13 = 'c';
                                        break;
                                    case 'È':
                                    case 'É':
                                    case 'Ê':
                                    case 'Ë':
                                    case 'è':
                                    case 'é':
                                    case 'ê':
                                    case 'ë':
                                        var13 = 'e';
                                        break;
                                    case 'Í':
                                    case 'Î':
                                    case 'Ï':
                                    case 'í':
                                    case 'î':
                                    case 'ï':
                                        var13 = 'i';
                                        break;
                                    case 'Ñ':
                                    case 'ñ':
                                        var13 = 'n';
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
                                        var13 = 'o';
                                        break;
                                    case 'Ù':
                                    case 'Ú':
                                    case 'Û':
                                    case 'Ü':
                                    case 'ù':
                                    case 'ú':
                                    case 'û':
                                    case 'ü':
                                        var13 = 'u';
                                        break;
                                    case 'ß':
                                        var13 = 'b';
                                        break;
                                    case 'ÿ':
                                    case 'Ÿ':
                                        var13 = 'y';
                                        break;
                                    default:
                                        var13 = Character.toLowerCase(var12);
                                }
                                if (var13 != 0) {
                                    var10.append(var13);
                                }
                            }
                        }
                        if (var10.length() == 0) {
                            var4 = null;
                        } else {
                            var4 = var10.toString();
                        }
                        break label82;
                    }
                }
                var4 = null;
            }
        }
        this.field4838 = var4;
    }

    @ObfuscatedName("qy.s(B)Ljava/lang/String;")
    public String method7491() {
        return this.field4837;
    }

    @ObfuscatedName("qy.h(I)Ljava/lang/String;")
    public String method7492() {
        return this.field4838;
    }

    @ObfuscatedName("qy.w(B)Z")
    public boolean method7489() {
        return this.field4838 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class465) {
            return false;
        }
        class465 var2 = (class465) arg0;
        if (this.field4838 == null) {
            return var2.field4838 == null;
        } else if (var2.field4838 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field4838.equals(var2.field4838);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field4838 == null ? 0 : this.field4838.hashCode();
    }

    public String toString() {
        return this.method7491();
    }

    @ObfuscatedName("qy.i(Lqy;I)I")
    public int method7490(class465 arg0) {
        if (this.field4838 == null) {
            return arg0.field4838 == null ? 0 : 1;
        } else if (arg0.field4838 == null) {
            return -1;
        } else {
            return this.field4838.compareTo(arg0.field4838);
        }
    }

    public int compareTo(Object arg0) {
        return this.method7490((class465) arg0);
    }
}
