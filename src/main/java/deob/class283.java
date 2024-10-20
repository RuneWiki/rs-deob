package deob;

@ObfuscatedName("ju")
public class class283 implements Comparable {

    @ObfuscatedName("ju.a")
    public String field3610;

    @ObfuscatedName("ju.t")
    public String field3609;

    public class283(String arg0, class338 arg1) {
        this.field3610 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            int var5 = 0;
            int var6 = arg0.length();
            while (var5 < var6 && class339.method168(arg0.charAt(var5))) {
                var5++;
            }
            while (var6 > var5 && class339.method168(arg0.charAt(var6 - 1))) {
                var6--;
            }
            int var7 = var6 - var5;
            if (var7 >= 1 && var7 <= class339.method309(arg1)) {
                StringBuilder var8 = new StringBuilder(var7);
                for (int var9 = var5; var9 < var6; var9++) {
                    char var10 = arg0.charAt(var9);
                    if (Statics.method3102(var10)) {
                        char var11 = class339.method4826(var10);
                        if (var11 != 0) {
                            var8.append(var11);
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
        this.field3609 = var4;
    }

    @ObfuscatedName("ju.a(I)Ljava/lang/String;")
    public String method4851() {
        return this.field3610;
    }

    @ObfuscatedName("ju.t(B)Z")
    public boolean method4854() {
        return this.field3609 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class283) {
            return false;
        }
        class283 var2 = (class283) arg0;
        if (this.field3609 == null) {
            return var2.field3609 == null;
        } else if (var2.field3609 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3609.equals(var2.field3609);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3609 == null ? 0 : this.field3609.hashCode();
    }

    public String toString() {
        return this.method4851();
    }

    @ObfuscatedName("ju.n(Lju;S)I")
    public int method4860(class283 arg0) {
        if (this.field3609 == null) {
            return arg0.field3609 == null ? 0 : 1;
        } else if (arg0.field3609 == null) {
            return -1;
        } else {
            return this.field3609.compareTo(arg0.field3609);
        }
    }

    public int compareTo(Object arg0) {
        return this.method4860((class283) arg0);
    }
}
