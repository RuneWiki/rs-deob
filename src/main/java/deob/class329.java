package deob;

@ObfuscatedName("lc")
public class class329 implements Comparable {

    @ObfuscatedName("lc.f")
    public String field3855;

    @ObfuscatedName("lc.e")
    public String field3856;

    public class329(String arg0, class366 arg1) {
        this.field3855 = arg0;
        String var4;
        if (arg0 == null) {
            var4 = null;
        } else {
            int var5 = 0;
            int var6 = arg0.length();
            while (var5 < var6 && class367.method4246(arg0.charAt(var5))) {
                var5++;
            }
            while (var6 > var5 && class367.method4246(arg0.charAt(var6 - 1))) {
                var6--;
            }
            int var7 = var6 - var5;
            if (var7 >= 1 && var7 <= class367.method5156(arg1)) {
                StringBuilder var8 = new StringBuilder(var7);
                for (int var9 = var5; var9 < var6; var9++) {
                    char var10 = arg0.charAt(var9);
                    if (class367.method1489(var10)) {
                        char var11 = class367.method2429(var10);
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
        this.field3856 = var4;
    }

    @ObfuscatedName("lc.f(B)Ljava/lang/String;")
    public String method5264() {
        return this.field3855;
    }

    @ObfuscatedName("lc.e(B)Z")
    public boolean method5265() {
        return this.field3856 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class329) {
            return false;
        }
        class329 var2 = (class329) arg0;
        if (this.field3856 == null) {
            return var2.field3856 == null;
        } else if (var2.field3856 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3856.equals(var2.field3856);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3856 == null ? 0 : this.field3856.hashCode();
    }

    public String toString() {
        return this.method5264();
    }

    @ObfuscatedName("lc.v(Llc;I)I")
    public int method5266(class329 arg0) {
        if (this.field3856 == null) {
            return arg0.field3856 == null ? 0 : 1;
        } else if (arg0.field3856 == null) {
            return -1;
        } else {
            return this.field3856.compareTo(arg0.field3856);
        }
    }

    public int compareTo(Object arg0) {
        return this.method5266((class329) arg0);
    }
}
