package deob;

@ObfuscatedName("ns")
public final class class365 implements Comparable {

    @ObfuscatedName("ns.c")
    public Object field4320;

    @ObfuscatedName("ns.p")
    public Object field4317;

    @ObfuscatedName("ns.f")
    public long field4318;

    @ObfuscatedName("ns.n")
    public long field4319;

    public class365(Object arg0, Object arg1) {
        this.field4320 = arg0;
        this.field4317 = arg1;
    }

    @ObfuscatedName("ns.c(Lns;B)I")
    public int method6149(class365 arg0) {
        if (this.field4319 < arg0.field4319) {
            return -1;
        } else if (this.field4319 > arg0.field4319) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class365) {
            throw new IllegalArgumentException();
        }
        return this.field4317.equals(((class365) arg0).field4317);
    }

    public int hashCode() {
        return this.field4317.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method6149((class365) arg0);
    }
}
