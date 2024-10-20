package deob;

@ObfuscatedName("qe")
public final class class437 implements Comparable {

    @ObfuscatedName("qe.at")
    public Object field4656;

    @ObfuscatedName("qe.ah")
    public Object field4659;

    @ObfuscatedName("qe.ar")
    public long field4658;

    @ObfuscatedName("qe.ao")
    public long field4657;

    public class437(Object arg0, Object arg1) {
        this.field4656 = arg0;
        this.field4659 = arg1;
    }

    @ObfuscatedName("qe.at(Lqe;I)I")
    public int method7323(class437 arg0) {
        if (this.field4657 < arg0.field4657) {
            return -1;
        } else if (this.field4657 > arg0.field4657) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class437) {
            throw new IllegalArgumentException();
        }
        return this.field4659.equals(((class437) arg0).field4659);
    }

    public int hashCode() {
        return this.field4659.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method7323((class437) arg0);
    }
}
