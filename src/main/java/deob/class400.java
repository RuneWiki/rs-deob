package deob;

@ObfuscatedName("pj")
public final class class400 implements Comparable {

    @ObfuscatedName("pj.af")
    public Object field4543;

    @ObfuscatedName("pj.an")
    public Object field4544;

    @ObfuscatedName("pj.aw")
    public long field4545;

    @ObfuscatedName("pj.ac")
    public long field4546;

    public class400(Object arg0, Object arg1) {
        this.field4543 = arg0;
        this.field4544 = arg1;
    }

    @ObfuscatedName("pj.af(Lpj;I)I")
    public int method7071(class400 arg0) {
        if (this.field4546 < arg0.field4546) {
            return -1;
        } else if (this.field4546 > arg0.field4546) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class400) {
            throw new IllegalArgumentException();
        }
        return this.field4544.equals(((class400) arg0).field4544);
    }

    public int hashCode() {
        return this.field4544.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method7071((class400) arg0);
    }
}
