package deob;

@ObfuscatedName("ko")
public class class306 implements Comparable {

    @ObfuscatedName("ko.c")
    public String field3851;

    @ObfuscatedName("ko.i")
    public String field3853;

    public class306(String arg0, class336 arg1) {
        this.field3851 = arg0;
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
            if (var11 >= 1 && var11 <= class316.method5081(arg1)) {
                StringBuilder var12 = new StringBuilder(var11);
                for (int var13 = var5; var13 < var6; var13++) {
                    char var14 = arg0.charAt(var13);
                    boolean var15;
                    if (Character.isISOControl(var14)) {
                        var15 = false;
                    } else {
                        boolean var16 = var14 >= '0' && var14 <= '9' || var14 >= 'A' && var14 <= 'Z' || var14 >= 'a' && var14 <= 'z';
                        if (var16) {
                            var15 = true;
                        } else {
                            char[] var17 = class316.field3918;
                            int var18 = 0;
                            label83: while (true) {
                                if (var18 >= var17.length) {
                                    char[] var20 = class316.field3915;
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        char var22 = var20[var21];
                                        if (var14 == var22) {
                                            var15 = true;
                                            break label83;
                                        }
                                    }
                                    var15 = false;
                                    break;
                                }
                                char var19 = var17[var18];
                                if (var14 == var19) {
                                    var15 = true;
                                    break;
                                }
                                var18++;
                            }
                        }
                    }
                    if (var15) {
                        char var23 = class316.method4181(var14);
                        if (var23 != 0) {
                            var12.append(var23);
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
        this.field3853 = var4;
    }

    @ObfuscatedName("ko.c(I)Ljava/lang/String;")
    public String method5038() {
        return this.field3851;
    }

    @ObfuscatedName("ko.i(B)Z")
    public boolean method5052() {
        return this.field3853 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class306) {
            return false;
        }
        class306 var2 = (class306) arg0;
        if (this.field3853 == null) {
            return var2.field3853 == null;
        } else if (var2.field3853 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3853.equals(var2.field3853);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3853 == null ? 0 : this.field3853.hashCode();
    }

    public String toString() {
        return this.method5038();
    }

    @ObfuscatedName("ko.o(Lko;B)I")
    public int method5043(class306 arg0) {
        if (this.field3853 == null) {
            return arg0.field3853 == null ? 0 : 1;
        } else if (arg0.field3853 == null) {
            return -1;
        } else {
            return this.field3853.compareTo(arg0.field3853);
        }
    }

    public int compareTo(Object arg0) {
        return this.method5043((class306) arg0);
    }
}
