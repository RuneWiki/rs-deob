package deob;

@ObfuscatedName("rq")
public final class class444 implements Comparable {

    @ObfuscatedName("rq.aq")
    public Object field4723;

    @ObfuscatedName("rq.aw")
    public Object field4722;

    @ObfuscatedName("rq.al")
    public long field4724;

    @ObfuscatedName("rq.ai")
    public long field4725;

    public class444(Object arg0, Object arg1) {
        this.field4723 = arg0;
        this.field4722 = arg1;
    }

    @ObfuscatedName("rq.aq(Lrq;B)I")
    public int method7473(class444 arg0) {
        if (this.field4725 < arg0.field4725) {
            return -1;
        } else if (this.field4725 > arg0.field4725) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class444) {
            throw new IllegalArgumentException();
        }
        return this.field4722.equals(((class444) arg0).field4722);
    }

    public int hashCode() {
        return this.field4722.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method7473((class444) arg0);
    }
}
