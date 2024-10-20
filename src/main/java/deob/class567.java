package deob;

@ObfuscatedName("va")
public class class567 {

    @ObfuscatedName("va.ap")
    public final int field5529;

    @ObfuscatedName("va.aw")
    public Object field5530;

    public class567(int arg0) {
        this.field5529 = arg0;
    }

    public class567(int arg0, Object arg1) {
        this.field5529 = arg0;
        this.field5530 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class567)) {
            return false;
        }
        class567 var2 = (class567) arg0;
        if (var2.field5530 == null && this.field5530 != null) {
            return false;
        } else if (this.field5530 == null && var2.field5530 != null) {
            return false;
        } else {
            return this.field5529 == var2.field5529 && var2.field5530.equals(this.field5530);
        }
    }
}
