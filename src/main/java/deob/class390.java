package deob;

@ObfuscatedName("nl")
public class class390 {

    @ObfuscatedName("nl.f")
    public final int field4216;

    @ObfuscatedName("nl.o")
    public Object field4217;

    public class390(int arg0) {
        this.field4216 = arg0;
    }

    public class390(int arg0, Object arg1) {
        this.field4216 = arg0;
        this.field4217 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class390)) {
            return false;
        }
        class390 var2 = (class390) arg0;
        if (var2.field4217 == null && this.field4217 != null) {
            return false;
        } else if (this.field4217 == null && var2.field4217 != null) {
            return false;
        } else {
            return this.field4216 == var2.field4216 && var2.field4217.equals(this.field4217);
        }
    }
}
