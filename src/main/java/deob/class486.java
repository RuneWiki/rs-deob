package deob;

@ObfuscatedName("ss")
public class class486 {

    @ObfuscatedName("ss.au")
    public final Object field4967;

    @ObfuscatedName("ss.ae")
    public final Object field4966;

    public class486(Object arg0, Object arg1) {
        this.field4967 = arg0;
        this.field4966 = arg1;
    }

    public String toString() {
        return this.field4967 + ", " + this.field4966;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class486) {
            return false;
        }
        class486 var2 = (class486) arg0;
        if (this.field4967 == null) {
            if (var2.field4967 != null) {
                return false;
            }
        } else if (!this.field4967.equals(var2.field4967)) {
            return false;
        }
        if (this.field4966 == null) {
            if (var2.field4966 != null) {
                return false;
            }
        } else if (!this.field4966.equals(var2.field4966)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field4967 != null) {
            var1 += this.field4967.hashCode();
        }
        if (this.field4966 != null) {
            var1 += 31 * this.field4966.hashCode();
        }
        return var1;
    }
}
