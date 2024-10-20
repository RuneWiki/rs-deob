package deob;

@ObfuscatedName("pp")
public class class421 implements Comparable {

    @ObfuscatedName("pp.n")
    public String field4407;

    @ObfuscatedName("pp.c")
    public String field4406;

    public class421(String arg0) {
        this.field4407 = arg0;
        class382 var3 = class382.field4206;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            int var5 = 0;
            int var6 = arg0.length();
            while (var5 < var6 && class383.method3035(arg0.charAt(var5))) {
                var5++;
            }
            while (var6 > var5 && class383.method3035(arg0.charAt(var6 - 1))) {
                var6--;
            }
            int var7 = var6 - var5;
            if (var7 >= 1 && var7 <= class383.method3510(var3)) {
                StringBuilder var8 = new StringBuilder(var7);
                for (int var9 = var5; var9 < var6; var9++) {
                    char var10 = arg0.charAt(var9);
                    boolean var11;
                    if (Character.isISOControl(var10)) {
                        var11 = false;
                    } else if (class319.method2274(var10)) {
                        var11 = true;
                    } else {
                        char[] var12 = class383.field4210;
                        int var13 = 0;
                        label61: while (true) {
                            if (var13 >= var12.length) {
                                char[] var15 = class383.field4209;
                                for (int var16 = 0; var16 < var15.length; var16++) {
                                    char var17 = var15[var16];
                                    if (var10 == var17) {
                                        var11 = true;
                                        break label61;
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
                        char var18 = class383.method2459(var10);
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
        this.field4406 = var4;
    }

    public class421(String arg0, class382 arg1) {
        this.field4407 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            int var5 = 0;
            int var6 = arg0.length();
            while (var5 < var6 && class383.method3035(arg0.charAt(var5))) {
                var5++;
            }
            while (var6 > var5 && class383.method3035(arg0.charAt(var6 - 1))) {
                var6--;
            }
            int var7 = var6 - var5;
            if (var7 >= 1 && var7 <= class383.method3510(arg1)) {
                StringBuilder var8 = new StringBuilder(var7);
                for (int var9 = var5; var9 < var6; var9++) {
                    char var10 = arg0.charAt(var9);
                    boolean var11;
                    if (Character.isISOControl(var10)) {
                        var11 = false;
                    } else if (class319.method2274(var10)) {
                        var11 = true;
                    } else {
                        char[] var12 = class383.field4210;
                        int var13 = 0;
                        label61: while (true) {
                            if (var13 >= var12.length) {
                                char[] var15 = class383.field4209;
                                for (int var16 = 0; var16 < var15.length; var16++) {
                                    char var17 = var15[var16];
                                    if (var10 == var17) {
                                        var11 = true;
                                        break label61;
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
                        char var18 = class383.method2459(var10);
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
        this.field4406 = var4;
    }

    @ObfuscatedName("pp.n(I)Ljava/lang/String;")
    public String method6800() {
        return this.field4407;
    }

    @ObfuscatedName("pp.c(S)Ljava/lang/String;")
    public String method6783() {
        return this.field4406;
    }

    @ObfuscatedName("pp.m(I)Z")
    public boolean method6781() {
        return this.field4406 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class421) {
            return false;
        }
        class421 var2 = (class421) arg0;
        if (this.field4406 == null) {
            return var2.field4406 == null;
        } else if (var2.field4406 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field4406.equals(var2.field4406);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field4406 == null ? 0 : this.field4406.hashCode();
    }

    public String toString() {
        return this.method6800();
    }

    @ObfuscatedName("pp.k(Lpp;B)I")
    public int method6784(class421 arg0) {
        if (this.field4406 == null) {
            return arg0.field4406 == null ? 0 : 1;
        } else if (arg0.field4406 == null) {
            return -1;
        } else {
            return this.field4406.compareTo(arg0.field4406);
        }
    }

    public int compareTo(Object arg0) {
        return this.method6784((class421) arg0);
    }
}
