package deob;

@ObfuscatedName("mv")
public final class class363 implements Comparable {

    @ObfuscatedName("mv.v")
    public Object field4222;

    @ObfuscatedName("mv.c")
    public Object field4225;

    @ObfuscatedName("mv.i")
    public long field4223;

    @ObfuscatedName("mv.f")
    public long field4224;

    public class363(Object arg0, Object arg1) {
        this.field4222 = arg0;
        this.field4225 = arg1;
    }

    @ObfuscatedName("mv.v(Lmv;I)I")
    public int method6021(class363 arg0) {
        if (this.field4224 < arg0.field4224) {
            return -1;
        } else if (this.field4224 > arg0.field4224) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class363) {
            throw new IllegalArgumentException();
        }
        return this.field4225.equals(((class363) arg0).field4225);
    }

    public int hashCode() {
        return this.field4225.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method6021((class363) arg0);
    }
}
