package deob;

@ObfuscatedName("rm")
public class class483 {

    @ObfuscatedName("rm.f")
    public final int field5004;

    @ObfuscatedName("rm.w")
    public Object field5005;

    public class483(int arg0) {
        this.field5004 = arg0;
    }

    public class483(int arg0, Object arg1) {
        this.field5004 = arg0;
        this.field5005 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class483)) {
            return false;
        }
        class483 var2 = (class483) arg0;
        if (var2.field5005 == null && this.field5005 != null) {
            return false;
        } else if (this.field5005 == null && var2.field5005 != null) {
            return false;
        } else {
            return this.field5004 == var2.field5004 && var2.field5005.equals(this.field5005);
        }
    }
}
