package deob;

@ObfuscatedName("to")
public class class517 {

    @ObfuscatedName("to.ak")
    public final Object field5200;

    @ObfuscatedName("to.al")
    public final Object field5199;

    public class517(Object arg0, Object arg1) {
        this.field5200 = arg0;
        this.field5199 = arg1;
    }

    public String toString() {
        return this.field5200 + ", " + this.field5199;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class517) {
            return false;
        }
        class517 var2 = (class517) arg0;
        if (this.field5200 == null) {
            if (var2.field5200 != null) {
                return false;
            }
        } else if (!this.field5200.equals(var2.field5200)) {
            return false;
        }
        if (this.field5199 == null) {
            if (var2.field5199 != null) {
                return false;
            }
        } else if (!this.field5199.equals(var2.field5199)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field5200 != null) {
            var1 += this.field5200.hashCode();
        }
        if (this.field5199 != null) {
            var1 += 31 * this.field5199.hashCode();
        }
        return var1;
    }
}
