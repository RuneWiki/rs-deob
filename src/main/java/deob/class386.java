package deob;

@ObfuscatedName("nz")
public final class class386 implements Comparable {

    @ObfuscatedName("nz.h")
    public Object field4499;

    @ObfuscatedName("nz.e")
    public Object field4498;

    @ObfuscatedName("nz.v")
    public long field4497;

    @ObfuscatedName("nz.x")
    public long field4500;

    public class386(Object arg0, Object arg1) {
        this.field4499 = arg0;
        this.field4498 = arg1;
    }

    @ObfuscatedName("nz.h(Lnz;I)I")
    public int method6753(class386 arg0) {
        if (this.field4500 < arg0.field4500) {
            return -1;
        } else if (this.field4500 > arg0.field4500) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class386) {
            throw new IllegalArgumentException();
        }
        return this.field4498.equals(((class386) arg0).field4498);
    }

    public int hashCode() {
        return this.field4498.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method6753((class386) arg0);
    }
}
