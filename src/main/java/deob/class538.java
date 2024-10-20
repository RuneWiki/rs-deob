package deob;

@ObfuscatedName("ui")
public class class538 implements Comparable {

    @ObfuscatedName("ui.aw")
    public String field5227;

    @ObfuscatedName("ui.ay")
    public String field5228;

    public class538(String arg0) {
        this.field5227 = arg0;
        this.field5228 = class495.method7195(arg0, class494.field4989);
    }

    public class538(String arg0, class494 arg1) {
        this.field5227 = arg0;
        this.field5228 = class495.method7195(arg0, arg1);
    }

    @ObfuscatedName("ui.aw(I)Ljava/lang/String;")
    public String method8881() {
        return this.field5227;
    }

    @ObfuscatedName("ui.ay(I)Ljava/lang/String;")
    public String method8882() {
        return this.field5228;
    }

    @ObfuscatedName("ui.ar(B)Z")
    public boolean method8883() {
        return this.field5228 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class538) {
            return false;
        }
        class538 var2 = (class538) arg0;
        if (this.field5228 == null) {
            return var2.field5228 == null;
        } else if (var2.field5228 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5228.equals(var2.field5228);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5228 == null ? 0 : this.field5228.hashCode();
    }

    public String toString() {
        return this.method8881();
    }

    @ObfuscatedName("ui.az(Lui;I)I")
    public int method8880(class538 arg0) {
        if (this.field5228 == null) {
            return arg0.field5228 == null ? 0 : 1;
        } else if (arg0.field5228 == null) {
            return -1;
        } else {
            return this.field5228.compareTo(arg0.field5228);
        }
    }

    public int compareTo(Object arg0) {
        return this.method8880((class538) arg0);
    }
}
