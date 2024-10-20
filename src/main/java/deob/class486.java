package deob;

@ObfuscatedName("rg")
public class class486 implements Comparable {

    @ObfuscatedName("rg.a")
    public String field5014;

    @ObfuscatedName("rg.f")
    public String field5015;

    public class486(String arg0) {
        this.field5014 = arg0;
        class444 var3 = class444.field4787;
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
                    if (var3 == null) {
                        var13 = 12;
                    } else {
                        switch(var3.field4783) {
                            case 3:
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
                            } else if (class358.method2894(var16)) {
                                var17 = true;
                            } else {
                                char[] var18 = class445.field4795;
                                int var19 = 0;
                                label81: while (true) {
                                    if (var19 >= var18.length) {
                                        char[] var21 = class445.field4796;
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
                                char var24 = class445.method364(var16);
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
        this.field5015 = var4;
    }

    public class486(String arg0, class444 arg1) {
        this.field5014 = arg0;
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
                        switch(arg1.field4783) {
                            case 3:
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
                            } else if (class358.method2894(var16)) {
                                var17 = true;
                            } else {
                                char[] var18 = class445.field4795;
                                int var19 = 0;
                                label81: while (true) {
                                    if (var19 >= var18.length) {
                                        char[] var21 = class445.field4796;
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
                                char var24 = class445.method364(var16);
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
        this.field5015 = var4;
    }

    @ObfuscatedName("rg.a(I)Ljava/lang/String;")
    public String method8298() {
        return this.field5014;
    }

    @ObfuscatedName("rg.f(B)Ljava/lang/String;")
    public String method8295() {
        return this.field5015;
    }

    @ObfuscatedName("rg.c(I)Z")
    public boolean method8296() {
        return this.field5015 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class486) {
            return false;
        }
        class486 var2 = (class486) arg0;
        if (this.field5015 == null) {
            return var2.field5015 == null;
        } else if (var2.field5015 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5015.equals(var2.field5015);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5015 == null ? 0 : this.field5015.hashCode();
    }

    public String toString() {
        return this.method8298();
    }

    @ObfuscatedName("rg.x(Lrg;I)I")
    public int method8304(class486 arg0) {
        if (this.field5015 == null) {
            return arg0.field5015 == null ? 0 : 1;
        } else if (arg0.field5015 == null) {
            return -1;
        } else {
            return this.field5015.compareTo(arg0.field5015);
        }
    }

    public int compareTo(Object arg0) {
        return this.method8304((class486) arg0);
    }
}
