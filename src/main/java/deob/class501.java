package deob;

@ObfuscatedName("tw")
public class class501 {

    @ObfuscatedName("tw.ac")
    public final Object field5004;

    @ObfuscatedName("tw.al")
    public final Object field5005;

    public class501(Object arg0, Object arg1) {
        this.field5004 = arg0;
        this.field5005 = arg1;
    }

    public String toString() {
        return this.field5004 + ", " + this.field5005;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class501) {
            return false;
        }
        class501 var2 = (class501) arg0;
        if (this.field5004 == null) {
            if (var2.field5004 != null) {
                return false;
            }
        } else if (!this.field5004.equals(var2.field5004)) {
            return false;
        }
        if (this.field5005 == null) {
            if (var2.field5005 != null) {
                return false;
            }
        } else if (!this.field5005.equals(var2.field5005)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field5004 != null) {
            var1 += this.field5004.hashCode();
        }
        if (this.field5005 != null) {
            var1 += 31 * this.field5005.hashCode();
        }
        return var1;
    }
}
