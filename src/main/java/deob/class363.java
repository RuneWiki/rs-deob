package deob;

@ObfuscatedName("mv")
public final class class363 implements Comparable {

    @ObfuscatedName("mv.c")
    public Object field4277;

    @ObfuscatedName("mv.v")
    public Object field4276;

    @ObfuscatedName("mv.q")
    public long field4278;

    @ObfuscatedName("mv.f")
    public long field4279;

    public class363(Object arg0, Object arg1) {
        this.field4277 = arg0;
        this.field4276 = arg1;
    }

    @ObfuscatedName("mv.c(Lmv;I)I")
    public int method5982(class363 arg0) {
        if (this.field4279 < arg0.field4279) {
            return -1;
        } else if (this.field4279 > arg0.field4279) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class363) {
            throw new IllegalArgumentException();
        }
        return this.field4276.equals(((class363) arg0).field4276);
    }

    public int hashCode() {
        return this.field4276.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method5982((class363) arg0);
    }
}
