package deob;

@ObfuscatedName("qo")
public class class466 implements Comparable {

    @ObfuscatedName("qo.c")
    public String field4865;

    @ObfuscatedName("qo.p")
    public String field4864;

    public class466(String arg0) {
        this.field4865 = arg0;
        class425 var3 = class425.field4649;
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
                        switch(var3.field4643) {
                            case 7:
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
                            } else if (class345.method3148(var16)) {
                                var17 = true;
                            } else {
                                char[] var18 = class426.field4656;
                                int var19 = 0;
                                label81: while (true) {
                                    if (var19 >= var18.length) {
                                        char[] var21 = class426.field4660;
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
                                char var24 = class426.method5553(var16);
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
        this.field4864 = var4;
    }

    public class466(String arg0, class425 arg1) {
        this.field4865 = arg0;
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
                        switch(arg1.field4643) {
                            case 7:
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
                            } else if (class345.method3148(var16)) {
                                var17 = true;
                            } else {
                                char[] var18 = class426.field4656;
                                int var19 = 0;
                                label81: while (true) {
                                    if (var19 >= var18.length) {
                                        char[] var21 = class426.field4660;
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
                                char var24 = class426.method5553(var16);
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
        this.field4864 = var4;
    }

    @ObfuscatedName("qo.c(I)Ljava/lang/String;")
    public String method7774() {
        return this.field4865;
    }

    @ObfuscatedName("qo.p(I)Ljava/lang/String;")
    public String method7789() {
        return this.field4864;
    }

    @ObfuscatedName("qo.f(I)Z")
    public boolean method7784() {
        return this.field4864 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class466) {
            return false;
        }
        class466 var2 = (class466) arg0;
        if (this.field4864 == null) {
            return var2.field4864 == null;
        } else if (var2.field4864 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field4864.equals(var2.field4864);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field4864 == null ? 0 : this.field4864.hashCode();
    }

    public String toString() {
        return this.method7774();
    }

    @ObfuscatedName("qo.k(Lqo;I)I")
    public int method7777(class466 arg0) {
        if (this.field4864 == null) {
            return arg0.field4864 == null ? 0 : 1;
        } else if (arg0.field4864 == null) {
            return -1;
        } else {
            return this.field4864.compareTo(arg0.field4864);
        }
    }

    public int compareTo(Object arg0) {
        return this.method7777((class466) arg0);
    }
}
