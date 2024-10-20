package deob;

@ObfuscatedName("pz")
public class class427 {

    @ObfuscatedName("pz.c")
    public final int field4540;

    @ObfuscatedName("pz.b")
    public Object field4538;

    public class427(int arg0) {
        this.field4540 = arg0;
    }

    public class427(int arg0, Object arg1) {
        this.field4540 = arg0;
        this.field4538 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class427)) {
            return false;
        }
        class427 var2 = (class427) arg0;
        if (var2.field4538 == null && this.field4538 != null) {
            return false;
        } else if (this.field4538 == null && var2.field4538 != null) {
            return false;
        } else {
            return this.field4540 == var2.field4540 && var2.field4538.equals(this.field4538);
        }
    }
}
