package deob;

@ObfuscatedName("vf")
public class class553 implements Comparable {

    @ObfuscatedName("vf.ac")
    public String field5286;

    @ObfuscatedName("vf.al")
    public String field5287;

    public class553(String arg0) {
        this.field5286 = arg0;
        this.field5287 = Statics.method7156(arg0, class508.field5030);
    }

    public class553(String arg0, class508 arg1) {
        this.field5286 = arg0;
        this.field5287 = Statics.method7156(arg0, arg1);
    }

    @ObfuscatedName("vf.ac(I)Ljava/lang/String;")
    public String method8985() {
        return this.field5286;
    }

    @ObfuscatedName("vf.al(I)Ljava/lang/String;")
    public String method8986() {
        return this.field5287;
    }

    @ObfuscatedName("vf.ak(B)Z")
    public boolean method8994() {
        return this.field5287 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class553) {
            return false;
        }
        class553 var2 = (class553) arg0;
        if (this.field5287 == null) {
            return var2.field5287 == null;
        } else if (var2.field5287 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5287.equals(var2.field5287);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5287 == null ? 0 : this.field5287.hashCode();
    }

    public String toString() {
        return this.method8985();
    }

    @ObfuscatedName("vf.ah(Lvf;I)I")
    public int method8989(class553 arg0) {
        if (this.field5287 == null) {
            return arg0.field5287 == null ? 0 : 1;
        } else if (arg0.field5287 == null) {
            return -1;
        } else {
            return this.field5287.compareTo(arg0.field5287);
        }
    }

    public int compareTo(Object arg0) {
        return this.method8989((class553) arg0);
    }
}
