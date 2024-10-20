package deob;

@ObfuscatedName("tm")
public class class513 implements Comparable {

    @ObfuscatedName("tm.af")
    public String field5149;

    @ObfuscatedName("tm.an")
    public String field5148;

    public class513(String arg0) {
        this.field5149 = arg0;
        this.field5148 = class470.method461(arg0, class469.field4909);
    }

    public class513(String arg0, class469 arg1) {
        this.field5149 = arg0;
        this.field5148 = class470.method461(arg0, arg1);
    }

    @ObfuscatedName("tm.af(I)Ljava/lang/String;")
    public String method8841() {
        return this.field5149;
    }

    @ObfuscatedName("tm.an(I)Ljava/lang/String;")
    public String method8842() {
        return this.field5148;
    }

    @ObfuscatedName("tm.aw(I)Z")
    public boolean method8843() {
        return this.field5148 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class513) {
            return false;
        }
        class513 var2 = (class513) arg0;
        if (this.field5148 == null) {
            return var2.field5148 == null;
        } else if (var2.field5148 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5148.equals(var2.field5148);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5148 == null ? 0 : this.field5148.hashCode();
    }

    public String toString() {
        return this.method8841();
    }

    @ObfuscatedName("tm.aq(Ltm;B)I")
    public int method8845(class513 arg0) {
        if (this.field5148 == null) {
            return arg0.field5148 == null ? 0 : 1;
        } else if (arg0.field5148 == null) {
            return -1;
        } else {
            return this.field5148.compareTo(arg0.field5148);
        }
    }

    public int compareTo(Object arg0) {
        return this.method8845((class513) arg0);
    }
}
