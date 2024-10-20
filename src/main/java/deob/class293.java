package deob;

@ObfuscatedName("ku")
public class class293 implements Comparable {

    @ObfuscatedName("ku.z")
    public String field3650;

    @ObfuscatedName("ku.k")
    public String field3647;

    public class293(String arg0, class348 arg1) {
        this.field3650 = arg0;
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
            if (var11 >= 1 && var11 <= Statics.method177(arg1)) {
                StringBuilder var12 = new StringBuilder(var11);
                for (int var13 = var5; var13 < var6; var13++) {
                    char var14 = arg0.charAt(var13);
                    if (class349.method422(var14)) {
                        char var15 = class349.method5131(var14);
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
        this.field3647 = var4;
    }

    @ObfuscatedName("ku.z(I)Ljava/lang/String;")
    public String method4889() {
        return this.field3650;
    }

    @ObfuscatedName("ku.k(B)Z")
    public boolean method4886() {
        return this.field3647 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class293) {
            return false;
        }
        class293 var2 = (class293) arg0;
        if (this.field3647 == null) {
            return var2.field3647 == null;
        } else if (var2.field3647 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3647.equals(var2.field3647);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3647 == null ? 0 : this.field3647.hashCode();
    }

    public String toString() {
        return this.method4889();
    }

    @ObfuscatedName("ku.s(Lku;I)I")
    public int method4890(class293 arg0) {
        if (this.field3647 == null) {
            return arg0.field3647 == null ? 0 : 1;
        } else if (arg0.field3647 == null) {
            return -1;
        } else {
            return this.field3647.compareTo(arg0.field3647);
        }
    }

    public int compareTo(Object arg0) {
        return this.method4890((class293) arg0);
    }
}
