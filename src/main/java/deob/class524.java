package deob;

@ObfuscatedName("ud")
public class class524 {

    @ObfuscatedName("ud.au")
    public final int field5179;

    @ObfuscatedName("ud.ae")
    public Object field5178;

    public class524(int arg0) {
        this.field5179 = arg0;
    }

    public class524(int arg0, Object arg1) {
        this.field5179 = arg0;
        this.field5178 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class524)) {
            return false;
        }
        class524 var2 = (class524) arg0;
        if (var2.field5178 == null && this.field5178 != null) {
            return false;
        } else if (this.field5178 == null && var2.field5178 != null) {
            return false;
        } else {
            return this.field5179 == var2.field5179 && var2.field5178.equals(this.field5178);
        }
    }
}
