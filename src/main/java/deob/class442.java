package deob;

@ObfuscatedName("pb")
public class class442 implements Comparable {

    @ObfuscatedName("pb.c")
    public String field4650;

    @ObfuscatedName("pb.l")
    public String field4649;

    public class442(String arg0) {
        this.field4650 = arg0;
        class405 var3 = class405.field4448;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            int var5 = 0;
            int var6 = arg0.length();
            while (var5 < var6 && class406.method5583(arg0.charAt(var5))) {
                var5++;
            }
            while (var6 > var5 && class406.method5583(arg0.charAt(var6 - 1))) {
                var6--;
            }
            int var7 = var6 - var5;
            if (var7 >= 1 && var7 <= class406.method5737(var3)) {
                StringBuilder var8 = new StringBuilder(var7);
                for (int var9 = var5; var9 < var6; var9++) {
                    char var10 = arg0.charAt(var9);
                    boolean var11;
                    if (Character.isISOControl(var10)) {
                        var11 = false;
                    } else if (class336.method2587(var10)) {
                        var11 = true;
                    } else {
                        char[] var12 = class406.field4461;
                        int var13 = 0;
                        label76: while (true) {
                            if (var13 >= var12.length) {
                                char[] var15 = class406.field4462;
                                for (int var16 = 0; var16 < var15.length; var16++) {
                                    char var17 = var15[var16];
                                    if (var10 == var17) {
                                        var11 = true;
                                        break label76;
                                    }
                                }
                                var11 = false;
                                break;
                            }
                            char var14 = var12[var13];
                            if (var10 == var14) {
                                var11 = true;
                                break;
                            }
                            var13++;
                        }
                    }
                    if (var11) {
                        char var18;
                        switch(var10) {
                            case ' ':
                            case '-':
                            case '_':
                            case ' ':
                                var18 = '_';
                                break;
                            case '#':
                            case '[':
                            case ']':
                                var18 = var10;
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
                                var18 = 'a';
                                break;
                            case 'Ç':
                            case 'ç':
                                var18 = 'c';
                                break;
                            case 'È':
                            case 'É':
                            case 'Ê':
                            case 'Ë':
                            case 'è':
                            case 'é':
                            case 'ê':
                            case 'ë':
                                var18 = 'e';
                                break;
                            case 'Í':
                            case 'Î':
                            case 'Ï':
                            case 'í':
                            case 'î':
                            case 'ï':
                                var18 = 'i';
                                break;
                            case 'Ñ':
                            case 'ñ':
                                var18 = 'n';
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
                                var18 = 'o';
                                break;
                            case 'Ù':
                            case 'Ú':
                            case 'Û':
                            case 'Ü':
                            case 'ù':
                            case 'ú':
                            case 'û':
                            case 'ü':
                                var18 = 'u';
                                break;
                            case 'ß':
                                var18 = 'b';
                                break;
                            case 'ÿ':
                            case 'Ÿ':
                                var18 = 'y';
                                break;
                            default:
                                var18 = Character.toLowerCase(var10);
                        }
                        if (var18 != 0) {
                            var8.append(var18);
                        }
                    }
                }
                if (var8.length() == 0) {
                    var4 = null;
                } else {
                    var4 = var8.toString();
                }
            } else {
                var4 = null;
            }
        }
        this.field4649 = var4;
    }

    public class442(String arg0, class405 arg1) {
        this.field4650 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            int var5 = 0;
            int var6 = arg0.length();
            while (var5 < var6 && class406.method5583(arg0.charAt(var5))) {
                var5++;
            }
            while (var6 > var5 && class406.method5583(arg0.charAt(var6 - 1))) {
                var6--;
            }
            int var7 = var6 - var5;
            if (var7 >= 1 && var7 <= class406.method5737(arg1)) {
                StringBuilder var8 = new StringBuilder(var7);
                for (int var9 = var5; var9 < var6; var9++) {
                    char var10 = arg0.charAt(var9);
                    boolean var11;
                    if (Character.isISOControl(var10)) {
                        var11 = false;
                    } else if (class336.method2587(var10)) {
                        var11 = true;
                    } else {
                        char[] var12 = class406.field4461;
                        int var13 = 0;
                        label76: while (true) {
                            if (var13 >= var12.length) {
                                char[] var15 = class406.field4462;
                                for (int var16 = 0; var16 < var15.length; var16++) {
                                    char var17 = var15[var16];
                                    if (var10 == var17) {
                                        var11 = true;
                                        break label76;
                                    }
                                }
                                var11 = false;
                                break;
                            }
                            char var14 = var12[var13];
                            if (var10 == var14) {
                                var11 = true;
                                break;
                            }
                            var13++;
                        }
                    }
                    if (var11) {
                        char var18;
                        switch(var10) {
                            case ' ':
                            case '-':
                            case '_':
                            case ' ':
                                var18 = '_';
                                break;
                            case '#':
                            case '[':
                            case ']':
                                var18 = var10;
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
                                var18 = 'a';
                                break;
                            case 'Ç':
                            case 'ç':
                                var18 = 'c';
                                break;
                            case 'È':
                            case 'É':
                            case 'Ê':
                            case 'Ë':
                            case 'è':
                            case 'é':
                            case 'ê':
                            case 'ë':
                                var18 = 'e';
                                break;
                            case 'Í':
                            case 'Î':
                            case 'Ï':
                            case 'í':
                            case 'î':
                            case 'ï':
                                var18 = 'i';
                                break;
                            case 'Ñ':
                            case 'ñ':
                                var18 = 'n';
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
                                var18 = 'o';
                                break;
                            case 'Ù':
                            case 'Ú':
                            case 'Û':
                            case 'Ü':
                            case 'ù':
                            case 'ú':
                            case 'û':
                            case 'ü':
                                var18 = 'u';
                                break;
                            case 'ß':
                                var18 = 'b';
                                break;
                            case 'ÿ':
                            case 'Ÿ':
                                var18 = 'y';
                                break;
                            default:
                                var18 = Character.toLowerCase(var10);
                        }
                        if (var18 != 0) {
                            var8.append(var18);
                        }
                    }
                }
                if (var8.length() == 0) {
                    var4 = null;
                } else {
                    var4 = var8.toString();
                }
            } else {
                var4 = null;
            }
        }
        this.field4649 = var4;
    }

    @ObfuscatedName("pb.c(I)Ljava/lang/String;")
    public String method7231() {
        return this.field4650;
    }

    @ObfuscatedName("pb.l(S)Ljava/lang/String;")
    public String method7232() {
        return this.field4649;
    }

    @ObfuscatedName("pb.s(I)Z")
    public boolean method7230() {
        return this.field4649 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class442) {
            return false;
        }
        class442 var2 = (class442) arg0;
        if (this.field4649 == null) {
            return var2.field4649 == null;
        } else if (var2.field4649 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field4649.equals(var2.field4649);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field4649 == null ? 0 : this.field4649.hashCode();
    }

    public String toString() {
        return this.method7231();
    }

    @ObfuscatedName("pb.e(Lpb;I)I")
    public int method7234(class442 arg0) {
        if (this.field4649 == null) {
            return arg0.field4649 == null ? 0 : 1;
        } else if (arg0.field4649 == null) {
            return -1;
        } else {
            return this.field4649.compareTo(arg0.field4649);
        }
    }

    public int compareTo(Object arg0) {
        return this.method7234((class442) arg0);
    }
}
