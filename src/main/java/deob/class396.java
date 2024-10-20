package deob;

@ObfuscatedName("pn")
public final class class396 implements Comparable {

    @ObfuscatedName("pn.aj")
    public Object field4492;

    @ObfuscatedName("pn.al")
    public Object field4490;

    @ObfuscatedName("pn.ac")
    public long field4489;

    @ObfuscatedName("pn.ab")
    public long field4491;

    public class396(Object arg0, Object arg1) {
        this.field4492 = arg0;
        this.field4490 = arg1;
    }

    @ObfuscatedName("pn.aj(Lpn;B)I")
    public int method6830(class396 arg0) {
        if (this.field4491 < arg0.field4491) {
            return -1;
        } else if (this.field4491 > arg0.field4491) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class396) {
            throw new IllegalArgumentException();
        }
        return this.field4490.equals(((class396) arg0).field4490);
    }

    public int hashCode() {
        return this.field4490.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method6830((class396) arg0);
    }
}
