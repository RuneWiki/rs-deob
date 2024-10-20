package deob;

@ObfuscatedName("oh")
public final class class393 implements Comparable {

    @ObfuscatedName("oh.f")
    public Object field4532;

    @ObfuscatedName("oh.w")
    public Object field4530;

    @ObfuscatedName("oh.v")
    public long field4531;

    @ObfuscatedName("oh.s")
    public long field4529;

    public class393(Object arg0, Object arg1) {
        this.field4532 = arg0;
        this.field4530 = arg1;
    }

    @ObfuscatedName("oh.f(Loh;I)I")
    public int method6934(class393 arg0) {
        if (this.field4529 < arg0.field4529) {
            return -1;
        } else if (this.field4529 > arg0.field4529) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class393) {
            throw new IllegalArgumentException();
        }
        return this.field4530.equals(((class393) arg0).field4530);
    }

    public int hashCode() {
        return this.field4530.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method6934((class393) arg0);
    }
}
