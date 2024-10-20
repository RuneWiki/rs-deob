package deob;

@ObfuscatedName("qj")
public final class class425 implements Comparable {

    @ObfuscatedName("qj.au")
    public Object field4621;

    @ObfuscatedName("qj.ae")
    public Object field4622;

    @ObfuscatedName("qj.ao")
    public long field4623;

    @ObfuscatedName("qj.at")
    public long field4624;

    public class425(Object arg0, Object arg1) {
        this.field4621 = arg0;
        this.field4622 = arg1;
    }

    @ObfuscatedName("qj.au(Lqj;B)I")
    public int method7176(class425 arg0) {
        if (this.field4624 < arg0.field4624) {
            return -1;
        } else if (this.field4624 > arg0.field4624) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class425) {
            throw new IllegalArgumentException();
        }
        return this.field4622.equals(((class425) arg0).field4622);
    }

    public int hashCode() {
        return this.field4622.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method7176((class425) arg0);
    }
}
