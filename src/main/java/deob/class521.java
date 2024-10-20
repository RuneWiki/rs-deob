package deob;

@ObfuscatedName("ue")
public class class521 {

    @ObfuscatedName("ue.ac")
    public final Object field5265;

    @ObfuscatedName("ue.ae")
    public final Object field5266;

    public class521(Object arg0, Object arg1) {
        this.field5265 = arg0;
        this.field5266 = arg1;
    }

    public String toString() {
        return this.field5265 + ", " + this.field5266;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class521) {
            return false;
        }
        class521 var2 = (class521) arg0;
        if (this.field5265 == null) {
            if (var2.field5265 != null) {
                return false;
            }
        } else if (!this.field5265.equals(var2.field5265)) {
            return false;
        }
        if (this.field5266 == null) {
            if (var2.field5266 != null) {
                return false;
            }
        } else if (!this.field5266.equals(var2.field5266)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field5265 != null) {
            var1 += this.field5265.hashCode();
        }
        if (this.field5266 != null) {
            var1 += 31 * this.field5266.hashCode();
        }
        return var1;
    }
}
