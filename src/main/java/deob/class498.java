package deob;

@ObfuscatedName("te")
public class class498 {

    @ObfuscatedName("te.af")
    public final int field5059;

    @ObfuscatedName("te.an")
    public Object field5058;

    public class498(int arg0) {
        this.field5059 = arg0;
    }

    public class498(int arg0, Object arg1) {
        this.field5059 = arg0;
        this.field5058 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class498)) {
            return false;
        }
        class498 var2 = (class498) arg0;
        if (var2.field5058 == null && this.field5058 != null) {
            return false;
        } else if (this.field5058 == null && var2.field5058 != null) {
            return false;
        } else {
            return this.field5059 == var2.field5059 && var2.field5058.equals(this.field5058);
        }
    }
}
