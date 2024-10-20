package deob;

@ObfuscatedName("rt")
public final class class466 implements Comparable {

    @ObfuscatedName("rt.ac")
    public Object field4948;

    @ObfuscatedName("rt.ae")
    public Object field4949;

    @ObfuscatedName("rt.ag")
    public long field4950;

    @ObfuscatedName("rt.am")
    public long field4951;

    public class466(Object arg0, Object arg1) {
        this.field4948 = arg0;
        this.field4949 = arg1;
    }

    @ObfuscatedName("rt.ac(Lrt;B)I")
    public int method7978(class466 arg0) {
        if (this.field4951 < arg0.field4951) {
            return -1;
        } else if (this.field4951 > arg0.field4951) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class466) {
            throw new IllegalArgumentException();
        }
        return this.field4949.equals(((class466) arg0).field4949);
    }

    public int hashCode() {
        return this.field4949.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method7978((class466) arg0);
    }
}
