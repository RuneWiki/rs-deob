package deob;

@ObfuscatedName("kk")
public class class294 implements Comparable {

    @ObfuscatedName("kk.n")
    public String field3660;

    @ObfuscatedName("kk.v")
    public String field3659;

    public class294(String arg0, class349 arg1) {
        this.field3660 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label115: {
                int var5 = 0;
                int var6 = arg0.length();
                while (var5 < var6 && class350.method4794(arg0.charAt(var5))) {
                    var5++;
                }
                while (var6 > var5 && class350.method4794(arg0.charAt(var6 - 1))) {
                    var6--;
                }
                int var7 = var6 - var5;
                if (var7 >= 1) {
                    byte var9;
                    if (arg1 == null) {
                        var9 = 12;
                    } else {
                        switch(arg1.field4074) {
                            case 0:
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
                            } else if (class302.method3875(var12)) {
                                var13 = true;
                            } else {
                                char[] var14 = class350.field4081;
                                int var15 = 0;
                                label82: while (true) {
                                    if (var15 >= var14.length) {
                                        char[] var17 = class350.field4079;
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
        this.field3659 = var4;
    }

    @ObfuscatedName("kk.n(I)Ljava/lang/String;")
    public String method4963() {
        return this.field3660;
    }

    @ObfuscatedName("kk.v(I)Z")
    public boolean method4966() {
        return this.field3659 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class294) {
            return false;
        }
        class294 var2 = (class294) arg0;
        if (this.field3659 == null) {
            return var2.field3659 == null;
        } else if (var2.field3659 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3659.equals(var2.field3659);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3659 == null ? 0 : this.field3659.hashCode();
    }

    public String toString() {
        return this.method4963();
    }

    @ObfuscatedName("kk.d(Lkk;B)I")
    public int method4967(class294 arg0) {
        if (this.field3659 == null) {
            return arg0.field3659 == null ? 0 : 1;
        } else if (arg0.field3659 == null) {
            return -1;
        } else {
            return this.field3659.compareTo(arg0.field3659);
        }
    }

    public int compareTo(Object arg0) {
        return this.method4967((class294) arg0);
    }
}
