package deob;

@ObfuscatedName("rc")
public final class class464 implements Comparable {

    @ObfuscatedName("rc.ab")
    public Object field4890;

    @ObfuscatedName("rc.ay")
    public Object field4888;

    @ObfuscatedName("rc.an")
    public long field4889;

    @ObfuscatedName("rc.au")
    public long field4887;

    public class464(Object arg0, Object arg1) {
        this.field4890 = arg0;
        this.field4888 = arg1;
    }

    @ObfuscatedName("rc.ab(Lrc;B)I")
    public int method7854(class464 arg0) {
        if (this.field4887 < arg0.field4887) {
            return -1;
        } else if (this.field4887 > arg0.field4887) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class464) {
            throw new IllegalArgumentException();
        }
        return this.field4888.equals(((class464) arg0).field4888);
    }

    public int hashCode() {
        return this.field4888.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method7854((class464) arg0);
    }
}
