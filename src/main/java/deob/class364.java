package deob;

@ObfuscatedName("mw")
public final class class364 implements Comparable {

    @ObfuscatedName("mw.o")
    public Object field4290;

    @ObfuscatedName("mw.q")
    public Object field4289;

    @ObfuscatedName("mw.l")
    public long field4291;

    @ObfuscatedName("mw.k")
    public long field4292;

    public class364(Object arg0, Object arg1) {
        this.field4290 = arg0;
        this.field4289 = arg1;
    }

    @ObfuscatedName("mw.o(Lmw;I)I")
    public int method5919(class364 arg0) {
        if (this.field4292 < arg0.field4292) {
            return -1;
        } else if (this.field4292 > arg0.field4292) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class364) {
            throw new IllegalArgumentException();
        }
        return this.field4289.equals(((class364) arg0).field4289);
    }

    public int hashCode() {
        return this.field4289.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method5919((class364) arg0);
    }
}
