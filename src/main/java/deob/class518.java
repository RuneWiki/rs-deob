package deob;

@ObfuscatedName("tu")
public class class518 {

    @ObfuscatedName("tu.aq")
    public final Object field5226;

    @ObfuscatedName("tu.ad")
    public final Object field5223;

    public class518(Object arg0, Object arg1) {
        this.field5226 = arg0;
        this.field5223 = arg1;
    }

    public String toString() {
        return this.field5226 + ", " + this.field5223;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class518) {
            return false;
        }
        class518 var2 = (class518) arg0;
        if (this.field5226 == null) {
            if (var2.field5226 != null) {
                return false;
            }
        } else if (!this.field5226.equals(var2.field5226)) {
            return false;
        }
        if (this.field5223 == null) {
            if (var2.field5223 != null) {
                return false;
            }
        } else if (!this.field5223.equals(var2.field5223)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field5226 != null) {
            var1 += this.field5226.hashCode();
        }
        if (this.field5223 != null) {
            var1 += 31 * this.field5223.hashCode();
        }
        return var1;
    }
}
