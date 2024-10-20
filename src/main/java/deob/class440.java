package deob;

@ObfuscatedName("qd")
public final class class440 implements Comparable {

    @ObfuscatedName("qd.ac")
    public Object field4667;

    @ObfuscatedName("qd.al")
    public Object field4665;

    @ObfuscatedName("qd.ak")
    public long field4666;

    @ObfuscatedName("qd.ax")
    public long field4664;

    public class440(Object arg0, Object arg1) {
        this.field4667 = arg0;
        this.field4665 = arg1;
    }

    @ObfuscatedName("qd.ac(Lqd;I)I")
    public int method7247(class440 arg0) {
        if (this.field4664 < arg0.field4664) {
            return -1;
        } else if (this.field4664 > arg0.field4664) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class440) {
            throw new IllegalArgumentException();
        }
        return this.field4665.equals(((class440) arg0).field4665);
    }

    public int hashCode() {
        return this.field4665.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method7247((class440) arg0);
    }
}
