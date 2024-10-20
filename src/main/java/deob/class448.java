package deob;

@ObfuscatedName("qd")
public class class448 {

    @ObfuscatedName("qd.f")
    public final Object field4833;

    @ObfuscatedName("qd.w")
    public final Object field4834;

    public class448(Object arg0, Object arg1) {
        this.field4833 = arg0;
        this.field4834 = arg1;
    }

    public String toString() {
        return this.field4833 + ", " + this.field4834;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class448) {
            return false;
        }
        class448 var2 = (class448) arg0;
        if (this.field4833 == null) {
            if (var2.field4833 != null) {
                return false;
            }
        } else if (!this.field4833.equals(var2.field4833)) {
            return false;
        }
        if (this.field4834 == null) {
            if (var2.field4834 != null) {
                return false;
            }
        } else if (!this.field4834.equals(var2.field4834)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field4833 != null) {
            var1 += this.field4833.hashCode();
        }
        if (this.field4834 != null) {
            var1 += 31 * this.field4834.hashCode();
        }
        return var1;
    }
}
