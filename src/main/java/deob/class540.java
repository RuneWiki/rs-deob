package deob;

@ObfuscatedName("ur")
public class class540 {

    @ObfuscatedName("ur.am")
    public final int field5247;

    @ObfuscatedName("ur.ap")
    public Object field5245;

    public class540(int arg0) {
        this.field5247 = arg0;
    }

    public class540(int arg0, Object arg1) {
        this.field5247 = arg0;
        this.field5245 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class540)) {
            return false;
        }
        class540 var2 = (class540) arg0;
        if (var2.field5245 == null && this.field5245 != null) {
            return false;
        } else if (this.field5245 == null && var2.field5245 != null) {
            return false;
        } else {
            return this.field5247 == var2.field5247 && var2.field5245.equals(this.field5245);
        }
    }
}
