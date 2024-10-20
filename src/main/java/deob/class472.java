package deob;

@ObfuscatedName("rj")
public class class472 {

    @ObfuscatedName("rj.a")
    public final int field4933;

    @ObfuscatedName("rj.f")
    public Object field4931;

    public class472(int arg0) {
        this.field4933 = arg0;
    }

    public class472(int arg0, Object arg1) {
        this.field4933 = arg0;
        this.field4931 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class472)) {
            return false;
        }
        class472 var2 = (class472) arg0;
        if (var2.field4931 == null && this.field4931 != null) {
            return false;
        } else if (this.field4931 == null && var2.field4931 != null) {
            return false;
        } else {
            return this.field4933 == var2.field4933 && var2.field4931.equals(this.field4931);
        }
    }
}
