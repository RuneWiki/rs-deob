package deob;

@ObfuscatedName("un")
public class class525 implements Comparable {

    @ObfuscatedName("un.at")
    public String field5172;

    @ObfuscatedName("un.an")
    public String field5173;

    public class525(String arg0) {
        this.field5172 = arg0;
        this.field5173 = class482.method6981(arg0, class481.field4935);
    }

    public class525(String arg0, class481 arg1) {
        this.field5172 = arg0;
        this.field5173 = class482.method6981(arg0, arg1);
    }

    @ObfuscatedName("un.at(I)Ljava/lang/String;")
    public String method8756() {
        return this.field5172;
    }

    @ObfuscatedName("un.an(B)Ljava/lang/String;")
    public String method8758() {
        return this.field5173;
    }

    @ObfuscatedName("un.ax(I)Z")
    public boolean method8772() {
        return this.field5173 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class525) {
            return false;
        }
        class525 var2 = (class525) arg0;
        if (this.field5173 == null) {
            return var2.field5173 == null;
        } else if (var2.field5173 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5173.equals(var2.field5173);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5173 == null ? 0 : this.field5173.hashCode();
    }

    public String toString() {
        return this.method8756();
    }

    @ObfuscatedName("un.ap(Lun;B)I")
    public int method8760(class525 arg0) {
        if (this.field5173 == null) {
            return arg0.field5173 == null ? 0 : 1;
        } else if (arg0.field5173 == null) {
            return -1;
        } else {
            return this.field5173.compareTo(arg0.field5173);
        }
    }

    public int compareTo(Object arg0) {
        return this.method8760((class525) arg0);
    }
}
