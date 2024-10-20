package deob;

@ObfuscatedName("pv")
public class class438 {

    @ObfuscatedName("pv.a")
    public final Object field4765;

    @ObfuscatedName("pv.f")
    public final Object field4766;

    public class438(Object arg0, Object arg1) {
        this.field4765 = arg0;
        this.field4766 = arg1;
    }

    public String toString() {
        return this.field4765 + ", " + this.field4766;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class438) {
            return false;
        }
        class438 var2 = (class438) arg0;
        if (this.field4765 == null) {
            if (var2.field4765 != null) {
                return false;
            }
        } else if (!this.field4765.equals(var2.field4765)) {
            return false;
        }
        if (this.field4766 == null) {
            if (var2.field4766 != null) {
                return false;
            }
        } else if (!this.field4766.equals(var2.field4766)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field4765 != null) {
            var1 += this.field4765.hashCode();
        }
        if (this.field4766 != null) {
            var1 += 31 * this.field4766.hashCode();
        }
        return var1;
    }
}
