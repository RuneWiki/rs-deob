package deob;

@ObfuscatedName("vx")
public class class558 implements Comparable {

    @ObfuscatedName("vx.az")
    public String field5384;

    @ObfuscatedName("vx.ah")
    public String field5385;

    public class558(String arg0) {
        this.field5384 = arg0;
        class513 var3 = class513.field5111;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label100: {
                int var5 = 0;
                int var6 = arg0.length();
                while (var5 < var6 && class514.method3966(arg0.charAt(var5))) {
                    var5++;
                }
                while (var6 > var5 && class514.method3966(arg0.charAt(var6 - 1))) {
                    var6--;
                }
                int var7 = var6 - var5;
                if (var7 >= 1) {
                    byte var9;
                    if (var3 == null) {
                        var9 = 12;
                    } else {
                        switch(var3.field5115) {
                            case 4:
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
                            } else if (Statics.method3599(var12)) {
                                var13 = true;
                            } else {
                                char[] var14 = class514.field5126;
                                int var15 = 0;
                                label67: while (true) {
                                    if (var15 >= var14.length) {
                                        char[] var17 = class514.field5123;
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
                                char var20 = class514.method8224(var12);
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
        this.field5385 = var4;
    }

    public class558(String arg0, class513 arg1) {
        this.field5384 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            label100: {
                int var5 = 0;
                int var6 = arg0.length();
                while (var5 < var6 && class514.method3966(arg0.charAt(var5))) {
                    var5++;
                }
                while (var6 > var5 && class514.method3966(arg0.charAt(var6 - 1))) {
                    var6--;
                }
                int var7 = var6 - var5;
                if (var7 >= 1) {
                    byte var9;
                    if (arg1 == null) {
                        var9 = 12;
                    } else {
                        switch(arg1.field5115) {
                            case 4:
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
                            } else if (Statics.method3599(var12)) {
                                var13 = true;
                            } else {
                                char[] var14 = class514.field5126;
                                int var15 = 0;
                                label67: while (true) {
                                    if (var15 >= var14.length) {
                                        char[] var17 = class514.field5123;
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
                                char var20 = class514.method8224(var12);
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
        this.field5385 = var4;
    }

    @ObfuscatedName("vx.az(I)Ljava/lang/String;")
    public String method9077() {
        return this.field5384;
    }

    @ObfuscatedName("vx.ah(I)Ljava/lang/String;")
    public String method9078() {
        return this.field5385;
    }

    @ObfuscatedName("vx.af(I)Z")
    public boolean method9076() {
        return this.field5385 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class558) {
            return false;
        }
        class558 var2 = (class558) arg0;
        if (this.field5385 == null) {
            return var2.field5385 == null;
        } else if (var2.field5385 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5385.equals(var2.field5385);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5385 == null ? 0 : this.field5385.hashCode();
    }

    public String toString() {
        return this.method9077();
    }

    @ObfuscatedName("vx.at(Lvx;I)I")
    public int method9080(class558 arg0) {
        if (this.field5385 == null) {
            return arg0.field5385 == null ? 0 : 1;
        } else if (arg0.field5385 == null) {
            return -1;
        } else {
            return this.field5385.compareTo(arg0.field5385);
        }
    }

    public int compareTo(Object arg0) {
        return this.method9080((class558) arg0);
    }
}
