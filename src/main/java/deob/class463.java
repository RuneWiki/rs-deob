package deob;

@ObfuscatedName("re")
public final class class463 implements Comparable {

    @ObfuscatedName("re.aq")
    public Object field4911;

    @ObfuscatedName("re.ad")
    public Object field4909;

    @ObfuscatedName("re.ag")
    public long field4908;

    @ObfuscatedName("re.ak")
    public long field4910;

    public class463(Object arg0, Object arg1) {
        this.field4911 = arg0;
        this.field4909 = arg1;
    }

    @ObfuscatedName("re.aq(Lre;I)I")
    public int method7750(class463 arg0) {
        if (this.field4910 < arg0.field4910) {
            return -1;
        } else if (this.field4910 > arg0.field4910) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class463) {
            throw new IllegalArgumentException();
        }
        return this.field4909.equals(((class463) arg0).field4909);
    }

    public int hashCode() {
        return this.field4909.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method7750((class463) arg0);
    }
}
