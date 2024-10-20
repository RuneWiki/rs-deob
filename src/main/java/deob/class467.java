package deob;

@ObfuscatedName("rw")
public final class class467 implements Comparable {

    @ObfuscatedName("rw.ap")
    public Object field4971;

    @ObfuscatedName("rw.aw")
    public Object field4972;

    @ObfuscatedName("rw.ak")
    public long field4975;

    @ObfuscatedName("rw.aj")
    public long field4974;

    public class467(Object arg0, Object arg1) {
        this.field4971 = arg0;
        this.field4972 = arg1;
    }

    @ObfuscatedName("rw.ap(Lrw;I)I")
    public int method8245(class467 arg0) {
        if (this.field4974 < arg0.field4974) {
            return -1;
        } else if (this.field4974 > arg0.field4974) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class467) {
            throw new IllegalArgumentException();
        }
        return this.field4972.equals(((class467) arg0).field4972);
    }

    public int hashCode() {
        return this.field4972.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method8245((class467) arg0);
    }
}
