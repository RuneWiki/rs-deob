package deob;

@ObfuscatedName("oj")
public class class409 {

    @ObfuscatedName("oj.l")
    public final int field4355;

    @ObfuscatedName("oj.q")
    public Object field4354;

    public class409(int arg0) {
        this.field4355 = arg0;
    }

    public class409(int arg0, Object arg1) {
        this.field4355 = arg0;
        this.field4354 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class409)) {
            return false;
        }
        class409 var2 = (class409) arg0;
        if (var2.field4354 == null && this.field4354 != null) {
            return false;
        } else if (this.field4354 == null && var2.field4354 != null) {
            return false;
        } else {
            return this.field4355 == var2.field4355 && var2.field4354.equals(this.field4354);
        }
    }
}
