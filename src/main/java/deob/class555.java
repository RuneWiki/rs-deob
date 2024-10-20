package deob;

@ObfuscatedName("vf")
public class class555 {

    @ObfuscatedName("vf.ak")
    public final int field5409;

    @ObfuscatedName("vf.al")
    public Object field5411;

    public class555(int arg0) {
        this.field5409 = arg0;
    }

    public class555(int arg0, Object arg1) {
        this.field5409 = arg0;
        this.field5411 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class555)) {
            return false;
        }
        class555 var2 = (class555) arg0;
        if (var2.field5411 == null && this.field5411 != null) {
            return false;
        } else if (this.field5411 == null && var2.field5411 != null) {
            return false;
        } else {
            return this.field5409 == var2.field5409 && var2.field5411.equals(this.field5411);
        }
    }
}
