package deob;

@ObfuscatedName("kq")
public class class293 implements Comparable {

    @ObfuscatedName("kq.m")
    public String field3653;

    @ObfuscatedName("kq.o")
    public String field3654;

    public class293(String arg0, class348 arg1) {
        this.field3653 = arg0;
        this.field3654 = class349.method4724(arg0, arg1);
    }

    @ObfuscatedName("kq.m(I)Ljava/lang/String;")
    public String method4925() {
        return this.field3653;
    }

    @ObfuscatedName("kq.o(B)Z")
    public boolean method4926() {
        return this.field3654 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class293) {
            return false;
        }
        class293 var2 = (class293) arg0;
        if (this.field3654 == null) {
            return var2.field3654 == null;
        } else if (var2.field3654 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3654.equals(var2.field3654);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3654 == null ? 0 : this.field3654.hashCode();
    }

    public String toString() {
        return this.method4925();
    }

    @ObfuscatedName("kq.q(Lkq;I)I")
    public int method4927(class293 arg0) {
        if (this.field3654 == null) {
            return arg0.field3654 == null ? 0 : 1;
        } else if (arg0.field3654 == null) {
            return -1;
        } else {
            return this.field3654.compareTo(arg0.field3654);
        }
    }

    public int compareTo(Object arg0) {
        return this.method4927((class293) arg0);
    }
}
