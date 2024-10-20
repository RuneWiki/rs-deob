package deob;

@ObfuscatedName("kp")
public class class292 implements Comparable {

    @ObfuscatedName("kp.b")
    public String field3734;

    @ObfuscatedName("kp.q")
    public String field3735;

    public class292(String arg0, class327 arg1) {
        this.field3734 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label128: {
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
                        switch(arg1.field3983) {
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
                            boolean var17;
                            if (Character.isISOControl(var16)) {
                                var17 = false;
                            } else if (class305.method4452(var16)) {
                                var17 = true;
                            } else {
                                char[] var18 = class302.field3791;
                                int var19 = 0;
                                label81: while (true) {
                                    if (var19 >= var18.length) {
                                        char[] var21 = class302.field3792;
                                        for (int var22 = 0; var22 < var21.length; var22++) {
                                            char var23 = var21[var22];
                                            if (var16 == var23) {
                                                var17 = true;
                                                break label81;
                                            }
                                        }
                                        var17 = false;
                                        break;
                                    }
                                    char var20 = var18[var19];
                                    if (var16 == var20) {
                                        var17 = true;
                                        break;
                                    }
                                    var19++;
                                }
                            }
                            if (var17) {
                                char var24 = class302.method223(var16);
                                if (var24 != 0) {
                                    var14.append(var24);
                                }
                            }
                        }
                        if (var14.length() == 0) {
                            var4 = null;
                        } else {
                            var4 = var14.toString();
                        }
                        break label128;
                    }
                }
                var4 = null;
            }
        }
        this.field3735 = var4;
    }

    @ObfuscatedName("kp.b(B)Ljava/lang/String;")
    public String method4926() {
        return this.field3734;
    }

    @ObfuscatedName("kp.q(I)Z")
    public boolean method4927() {
        return this.field3735 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class292) {
            return false;
        }
        class292 var2 = (class292) arg0;
        if (this.field3735 == null) {
            return var2.field3735 == null;
        } else if (var2.field3735 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3735.equals(var2.field3735);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3735 == null ? 0 : this.field3735.hashCode();
    }

    public String toString() {
        return this.method4926();
    }

    @ObfuscatedName("kp.o(Lkp;B)I")
    public int method4928(class292 arg0) {
        if (this.field3735 == null) {
            return arg0.field3735 == null ? 0 : 1;
        } else if (arg0.field3735 == null) {
            return -1;
        } else {
            return this.field3735.compareTo(arg0.field3735);
        }
    }

    public int compareTo(Object arg0) {
        return this.method4928((class292) arg0);
    }
}
