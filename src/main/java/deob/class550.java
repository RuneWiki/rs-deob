package deob;

@ObfuscatedName("vj")
public class class550 implements Comparable {

    @ObfuscatedName("vj.at")
    public String field5292;

    @ObfuscatedName("vj.ah")
    public String field5294;

    public class550(String arg0) {
        this.field5292 = arg0;
        class505 var3 = class505.field5029;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label100: {
                int var5 = 0;
                int var6 = arg0.length();
                while (var5 < var6 && class506.method7861(arg0.charAt(var5))) {
                    var5++;
                }
                while (var6 > var5 && class506.method7861(arg0.charAt(var6 - 1))) {
                    var6--;
                }
                int var7 = var6 - var5;
                if (var7 >= 1) {
                    byte var9;
                    if (var3 == null) {
                        var9 = 12;
                    } else {
                        switch(var3.field5023) {
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
                            boolean var13;
                            if (Character.isISOControl(var12)) {
                                var13 = false;
                            } else if (class399.method386(var12)) {
                                var13 = true;
                            } else {
                                char[] var14 = class506.field5031;
                                int var15 = 0;
                                label67: while (true) {
                                    if (var15 >= var14.length) {
                                        char[] var17 = class506.field5032;
                                        for (int var18 = 0; var18 < var17.length; var18++) {
                                            char var19 = var17[var18];
                                            if (var12 == var19) {
                                                var13 = true;
                                                break label67;
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
                                char var20 = class506.method7379(var12);
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
                        break label100;
                    }
                }
                var4 = null;
            }
        }
        this.field5294 = var4;
    }

    public class550(String arg0, class505 arg1) {
        this.field5292 = arg0;
        this.field5294 = class506.method174(arg0, arg1);
    }

    @ObfuscatedName("vj.at(B)Ljava/lang/String;")
    public String method9073() {
        return this.field5292;
    }

    @ObfuscatedName("vj.ah(I)Ljava/lang/String;")
    public String method9074() {
        return this.field5294;
    }

    @ObfuscatedName("vj.ar(B)Z")
    public boolean method9075() {
        return this.field5294 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class550) {
            return false;
        }
        class550 var2 = (class550) arg0;
        if (this.field5294 == null) {
            return var2.field5294 == null;
        } else if (var2.field5294 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5294.equals(var2.field5294);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5294 == null ? 0 : this.field5294.hashCode();
    }

    public String toString() {
        return this.method9073();
    }

    @ObfuscatedName("vj.ao(Lvj;I)I")
    public int method9089(class550 arg0) {
        if (this.field5294 == null) {
            return arg0.field5294 == null ? 0 : 1;
        } else if (arg0.field5294 == null) {
            return -1;
        } else {
            return this.field5294.compareTo(arg0.field5294);
        }
    }

    public int compareTo(Object arg0) {
        return this.method9089((class550) arg0);
    }
}
