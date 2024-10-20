package deob;

@ObfuscatedName("pl")
public final class class413 implements Comparable {

    @ObfuscatedName("pl.at")
    public Object field4569;

    @ObfuscatedName("pl.an")
    public Object field4566;

    @ObfuscatedName("pl.av")
    public long field4567;

    @ObfuscatedName("pl.as")
    public long field4568;

    public class413(Object arg0, Object arg1) {
        this.field4569 = arg0;
        this.field4566 = arg1;
    }

    @ObfuscatedName("pl.at(Lpl;I)I")
    public int method7061(class413 arg0) {
        if (this.field4568 < arg0.field4568) {
            return -1;
        } else if (this.field4568 > arg0.field4568) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class413) {
            throw new IllegalArgumentException();
        }
        return this.field4566.equals(((class413) arg0).field4566);
    }

    public int hashCode() {
        return this.field4566.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method7061((class413) arg0);
    }
}
