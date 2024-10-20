package deob;

@ObfuscatedName("qr")
public final class class426 implements Comparable {

    @ObfuscatedName("qr.aw")
    public Object field4625;

    @ObfuscatedName("qr.ay")
    public Object field4627;

    @ObfuscatedName("qr.ar")
    public long field4626;

    @ObfuscatedName("qr.am")
    public long field4624;

    public class426(Object arg0, Object arg1) {
        this.field4625 = arg0;
        this.field4627 = arg1;
    }

    @ObfuscatedName("qr.aw(Lqr;I)I")
    public int method7155(class426 arg0) {
        if (this.field4624 < arg0.field4624) {
            return -1;
        } else if (this.field4624 > arg0.field4624) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class426) {
            throw new IllegalArgumentException();
        }
        return this.field4627.equals(((class426) arg0).field4627);
    }

    public int hashCode() {
        return this.field4627.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method7155((class426) arg0);
    }
}
