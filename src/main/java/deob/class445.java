package deob;

@ObfuscatedName("rv")
public final class class445 implements Comparable {

    @ObfuscatedName("rv.az")
    public Object field4763;

    @ObfuscatedName("rv.ah")
    public Object field4762;

    @ObfuscatedName("rv.af")
    public long field4761;

    @ObfuscatedName("rv.at")
    public long field4764;

    public class445(Object arg0, Object arg1) {
        this.field4763 = arg0;
        this.field4762 = arg1;
    }

    @ObfuscatedName("rv.az(Lrv;I)I")
    public int method7345(class445 arg0) {
        if (this.field4764 < arg0.field4764) {
            return -1;
        } else if (this.field4764 > arg0.field4764) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class445) {
            throw new IllegalArgumentException();
        }
        return this.field4762.equals(((class445) arg0).field4762);
    }

    public int hashCode() {
        return this.field4762.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method7345((class445) arg0);
    }
}
