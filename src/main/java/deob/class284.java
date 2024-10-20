package deob;

@ObfuscatedName("jz")
public class class284 implements Comparable {

    @ObfuscatedName("jz.c")
    public String field3616;

    @ObfuscatedName("jz.t")
    public String field3614;

    public class284(String arg0, class339 arg1) {
        this.field3616 = arg0;
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
            if (var11 >= 1 && var11 <= class340.method3233(arg1)) {
                StringBuilder var12 = new StringBuilder(var11);
                for (int var13 = var5; var13 < var6; var13++) {
                    char var14 = arg0.charAt(var13);
                    if (class340.method1972(var14)) {
                        char var15 = class340.method2375(var14);
                        if (var15 != 0) {
                            var12.append(var15);
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
        this.field3614 = var4;
    }

    @ObfuscatedName("jz.c(B)Ljava/lang/String;")
    public String method4829() {
        return this.field3616;
    }

    @ObfuscatedName("jz.t(I)Z")
    public boolean method4830() {
        return this.field3614 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class284) {
            return false;
        }
        class284 var2 = (class284) arg0;
        if (this.field3614 == null) {
            return var2.field3614 == null;
        } else if (var2.field3614 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3614.equals(var2.field3614);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3614 == null ? 0 : this.field3614.hashCode();
    }

    public String toString() {
        return this.method4829();
    }

    @ObfuscatedName("jz.o(Ljz;B)I")
    public int method4832(class284 arg0) {
        if (this.field3614 == null) {
            return arg0.field3614 == null ? 0 : 1;
        } else if (arg0.field3614 == null) {
            return -1;
        } else {
            return this.field3614.compareTo(arg0.field3614);
        }
    }

    public int compareTo(Object arg0) {
        return this.method4832((class284) arg0);
    }
}
