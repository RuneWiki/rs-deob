package deob;

@ObfuscatedName("uk")
public class class543 {

    @ObfuscatedName("uk.aq")
    public final int field5268;

    @ObfuscatedName("uk.aw")
    public Object field5269;

    public class543(int arg0) {
        this.field5268 = arg0;
    }

    public class543(int arg0, Object arg1) {
        this.field5268 = arg0;
        this.field5269 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class543)) {
            return false;
        }
        class543 var2 = (class543) arg0;
        if (var2.field5269 == null && this.field5269 != null) {
            return false;
        } else if (this.field5269 == null && var2.field5269 != null) {
            return false;
        } else {
            return this.field5268 == var2.field5268 && var2.field5269.equals(this.field5269);
        }
    }
}
