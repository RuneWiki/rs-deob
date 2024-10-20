package deob;

@ObfuscatedName("qm")
public final class class441 implements Comparable {

    @ObfuscatedName("qm.am")
    public Object field4694;

    @ObfuscatedName("qm.ap")
    public Object field4693;

    @ObfuscatedName("qm.af")
    public long field4695;

    @ObfuscatedName("qm.aj")
    public long field4692;

    public class441(Object arg0, Object arg1) {
        this.field4694 = arg0;
        this.field4693 = arg1;
    }

    @ObfuscatedName("qm.am(Lqm;I)I")
    public int method7456(class441 arg0) {
        if (this.field4692 < arg0.field4692) {
            return -1;
        } else if (this.field4692 > arg0.field4692) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class441) {
            throw new IllegalArgumentException();
        }
        return this.field4693.equals(((class441) arg0).field4693);
    }

    public int hashCode() {
        return this.field4693.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method7456((class441) arg0);
    }
}
