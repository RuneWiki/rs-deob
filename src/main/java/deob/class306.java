package deob;

@ObfuscatedName("ko")
public class class306 implements Comparable {

    @ObfuscatedName("ko.d")
    public String field3854;

    @ObfuscatedName("ko.z")
    public String field3853;

    public class306(String arg0, class336 arg1) {
        this.field3854 = arg0;
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
            if (var11 >= 1 && var11 <= class316.method3078(arg1)) {
                StringBuilder var12 = new StringBuilder(var11);
                for (int var13 = var5; var13 < var6; var13++) {
                    char var14 = arg0.charAt(var13);
                    boolean var15;
                    if (Character.isISOControl(var14)) {
                        var15 = false;
                    } else if (class319.method3512(var14)) {
                        var15 = true;
                    } else {
                        char[] var16 = class316.field3910;
                        int var17 = 0;
                        label75: while (true) {
                            if (var17 >= var16.length) {
                                char[] var19 = class316.field3913;
                                for (int var20 = 0; var20 < var19.length; var20++) {
                                    char var21 = var19[var20];
                                    if (var14 == var21) {
                                        var15 = true;
                                        break label75;
                                    }
                                }
                                var15 = false;
                                break;
                            }
                            char var18 = var16[var17];
                            if (var14 == var18) {
                                var15 = true;
                                break;
                            }
                            var17++;
                        }
                    }
                    if (var15) {
                        char var22 = class316.method2889(var14);
                        if (var22 != 0) {
                            var12.append(var22);
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

    @ObfuscatedName("ko.d(I)Ljava/lang/String;")
    public String method5095() {
        return this.field3854;
    }

    @ObfuscatedName("ko.z(I)Z")
    public boolean method5096() {
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
        return this.method5095();
    }

    @ObfuscatedName("ko.n(Lko;I)I")
    public int method5099(class306 arg0) {
        if (this.field3853 == null) {
            return arg0.field3853 == null ? 0 : 1;
        } else if (arg0.field3853 == null) {
            return -1;
        } else {
            return this.field3853.compareTo(arg0.field3853);
        }
    }

    public int compareTo(Object arg0) {
        return this.method5099((class306) arg0);
    }
}
