package deob;

@ObfuscatedName("ng")
public final class class383 implements Comparable {

    @ObfuscatedName("ng.a")
    public Object field4455;

    @ObfuscatedName("ng.f")
    public Object field4451;

    @ObfuscatedName("ng.c")
    public long field4452;

    @ObfuscatedName("ng.x")
    public long field4454;

    public class383(Object arg0, Object arg1) {
        this.field4455 = arg0;
        this.field4451 = arg1;
    }

    @ObfuscatedName("ng.a(Lng;B)I")
    public int method6638(class383 arg0) {
        if (this.field4454 < arg0.field4454) {
            return -1;
        } else if (this.field4454 > arg0.field4454) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class383) {
            throw new IllegalArgumentException();
        }
        return this.field4451.equals(((class383) arg0).field4451);
    }

    public int hashCode() {
        return this.field4451.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method6638((class383) arg0);
    }
}
