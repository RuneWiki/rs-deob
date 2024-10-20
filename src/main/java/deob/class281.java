package deob;

@ObfuscatedName("ja")
public class class281 implements Comparable {

    @ObfuscatedName("ja.s")
    public String field3728;

    @ObfuscatedName("ja.g")
    public String field3727;

    public class281(String arg0, class314 arg1) {
        this.field3728 = arg0;
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
            while (var6 > var5 && class291.method2952(arg0.charAt(var6 - 1))) {
                var6--;
            }
            int var9 = var6 - var5;
            if (var9 >= 1 && var9 <= class291.method3952(arg1)) {
                StringBuilder var10 = new StringBuilder(var9);
                for (int var11 = var5; var11 < var6; var11++) {
                    char var12 = arg0.charAt(var11);
                    if (Statics.method12(var12)) {
                        char var13 = class291.method44(var12);
                        if (var13 != 0) {
                            var10.append(var13);
                        }
                    }
                }
                if (var10.length() == 0) {
                    var4 = null;
                } else {
                    var4 = var10.toString();
                }
            } else {
                var4 = null;
            }
        }
        this.field3727 = var4;
    }

    @ObfuscatedName("ja.s(I)Ljava/lang/String;")
    public String method4922() {
        return this.field3728;
    }

    @ObfuscatedName("ja.g(I)Z")
    public boolean method4923() {
        return this.field3727 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class281) {
            return false;
        }
        class281 var2 = (class281) arg0;
        if (this.field3727 == null) {
            return var2.field3727 == null;
        } else if (var2.field3727 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3727.equals(var2.field3727);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3727 == null ? 0 : this.field3727.hashCode();
    }

    public String toString() {
        return this.method4922();
    }

    @ObfuscatedName("ja.m(Lja;S)I")
    public int method4925(class281 arg0) {
        if (this.field3727 == null) {
            return arg0.field3727 == null ? 0 : 1;
        } else if (arg0.field3727 == null) {
            return -1;
        } else {
            return this.field3727.compareTo(arg0.field3727);
        }
    }

    public int compareTo(Object arg0) {
        return this.method4925((class281) arg0);
    }
}
