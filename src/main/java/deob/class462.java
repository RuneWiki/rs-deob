package deob;

@ObfuscatedName("rp")
public final class class462 implements Comparable {

    @ObfuscatedName("rp.ak")
    public Object field4893;

    @ObfuscatedName("rp.al")
    public Object field4891;

    @ObfuscatedName("rp.aj")
    public long field4892;

    @ObfuscatedName("rp.az")
    public long field4890;

    public class462(Object arg0, Object arg1) {
        this.field4893 = arg0;
        this.field4891 = arg1;
    }

    @ObfuscatedName("rp.ak(Lrp;I)I")
    public int method7786(class462 arg0) {
        if (this.field4890 < arg0.field4890) {
            return -1;
        } else if (this.field4890 > arg0.field4890) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class462) {
            throw new IllegalArgumentException();
        }
        return this.field4891.equals(((class462) arg0).field4891);
    }

    public int hashCode() {
        return this.field4891.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method7786((class462) arg0);
    }
}
