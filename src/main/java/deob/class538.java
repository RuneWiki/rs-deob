package deob;

@ObfuscatedName("uc")
public class class538 implements Comparable {

    @ObfuscatedName("uc.au")
    public String field5260;

    @ObfuscatedName("uc.ae")
    public String field5259;

    public class538(String arg0) {
        this.field5260 = arg0;
        class493 var3 = class493.field4997;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label67: {
                int var5 = 0;
                int var6 = arg0.length();
                while (var5 < var6 && class494.method6073(arg0.charAt(var5))) {
                    var5++;
                }
                while (var6 > var5 && class494.method6073(arg0.charAt(var6 - 1))) {
                    var6--;
                }
                int var7 = var6 - var5;
                if (var7 >= 1) {
                    byte var9;
                    if (var3 == null) {
                        var9 = 12;
                    } else {
                        switch(var3.field4989) {
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
                            if (class494.method2450(var12)) {
                                char var13 = class494.method372(var12);
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
                        break label67;
                    }
                }
                var4 = null;
            }
        }
        this.field5259 = var4;
    }

    public class538(String arg0, class493 arg1) {
        this.field5260 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label67: {
                int var5 = 0;
                int var6 = arg0.length();
                while (var5 < var6 && class494.method6073(arg0.charAt(var5))) {
                    var5++;
                }
                while (var6 > var5 && class494.method6073(arg0.charAt(var6 - 1))) {
                    var6--;
                }
                int var7 = var6 - var5;
                if (var7 >= 1) {
                    byte var9;
                    if (arg1 == null) {
                        var9 = 12;
                    } else {
                        switch(arg1.field4989) {
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
                            if (class494.method2450(var12)) {
                                char var13 = class494.method372(var12);
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
                        break label67;
                    }
                }
                var4 = null;
            }
        }
        this.field5259 = var4;
    }

    @ObfuscatedName("uc.au(I)Ljava/lang/String;")
    public String method8917() {
        return this.field5260;
    }

    @ObfuscatedName("uc.ae(B)Ljava/lang/String;")
    public String method8910() {
        return this.field5259;
    }

    @ObfuscatedName("uc.ao(I)Z")
    public boolean method8930() {
        return this.field5259 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class538) {
            return false;
        }
        class538 var2 = (class538) arg0;
        if (this.field5259 == null) {
            return var2.field5259 == null;
        } else if (var2.field5259 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5259.equals(var2.field5259);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5259 == null ? 0 : this.field5259.hashCode();
    }

    public String toString() {
        return this.method8917();
    }

    @ObfuscatedName("uc.at(Luc;I)I")
    public int method8912(class538 arg0) {
        if (this.field5259 == null) {
            return arg0.field5259 == null ? 0 : 1;
        } else if (arg0.field5259 == null) {
            return -1;
        } else {
            return this.field5259.compareTo(arg0.field5259);
        }
    }

    public int compareTo(Object arg0) {
        return this.method8912((class538) arg0);
    }
}
