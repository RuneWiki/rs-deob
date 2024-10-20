package deob;

@ObfuscatedName("rg")
public class class462 {

    @ObfuscatedName("rg.af")
    public final Object field4887;

    @ObfuscatedName("rg.an")
    public final Object field4888;

    public class462(Object arg0, Object arg1) {
        this.field4887 = arg0;
        this.field4888 = arg1;
    }

    public String toString() {
        return this.field4887 + ", " + this.field4888;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class462) {
            return false;
        }
        class462 var2 = (class462) arg0;
        if (this.field4887 == null) {
            if (var2.field4887 != null) {
                return false;
            }
        } else if (!this.field4887.equals(var2.field4887)) {
            return false;
        }
        if (this.field4888 == null) {
            if (var2.field4888 != null) {
                return false;
            }
        } else if (!this.field4888.equals(var2.field4888)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field4887 != null) {
            var1 += this.field4887.hashCode();
        }
        if (this.field4888 != null) {
            var1 += 31 * this.field4888.hashCode();
        }
        return var1;
    }
}
