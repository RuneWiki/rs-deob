package deob;

@ObfuscatedName("kb")
public class class306 implements Comparable {

    @ObfuscatedName("kb.t")
    public String field3860;

    @ObfuscatedName("kb.q")
    public String field3857;

    public class306(String arg0, class336 arg1) {
        this.field3860 = arg0;
        this.field3857 = class316.method335(arg0, arg1);
    }

    @ObfuscatedName("kb.t(I)Ljava/lang/String;")
    public String method5022() {
        return this.field3860;
    }

    @ObfuscatedName("kb.q(B)Z")
    public boolean method5005() {
        return this.field3857 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class306) {
            return false;
        }
        class306 var2 = (class306) arg0;
        if (this.field3857 == null) {
            return var2.field3857 == null;
        } else if (var2.field3857 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3857.equals(var2.field3857);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3857 == null ? 0 : this.field3857.hashCode();
    }

    public String toString() {
        return this.method5022();
    }

    @ObfuscatedName("kb.i(Lkb;I)I")
    public int method5007(class306 arg0) {
        if (this.field3857 == null) {
            return arg0.field3857 == null ? 0 : 1;
        } else if (arg0.field3857 == null) {
            return -1;
        } else {
            return this.field3857.compareTo(arg0.field3857);
        }
    }

    public int compareTo(Object arg0) {
        return this.method5007((class306) arg0);
    }
}
