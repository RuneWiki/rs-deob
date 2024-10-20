package deob;

@ObfuscatedName("uh")
public class class523 {

    @ObfuscatedName("uh.aw")
    public final int field5136;

    @ObfuscatedName("uh.ay")
    public Object field5135;

    public class523(int arg0) {
        this.field5136 = arg0;
    }

    public class523(int arg0, Object arg1) {
        this.field5136 = arg0;
        this.field5135 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class523)) {
            return false;
        }
        class523 var2 = (class523) arg0;
        if (var2.field5135 == null && this.field5135 != null) {
            return false;
        } else if (this.field5135 == null && var2.field5135 != null) {
            return false;
        } else {
            return this.field5136 == var2.field5136 && var2.field5135.equals(this.field5135);
        }
    }
}
