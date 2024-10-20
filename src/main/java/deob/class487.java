package deob;

@ObfuscatedName("sf")
public class class487 {

    @ObfuscatedName("sf.aw")
    public final Object field4965;

    @ObfuscatedName("sf.ay")
    public final Object field4963;

    public class487(Object arg0, Object arg1) {
        this.field4965 = arg0;
        this.field4963 = arg1;
    }

    public String toString() {
        return this.field4965 + ", " + this.field4963;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class487) {
            return false;
        }
        class487 var2 = (class487) arg0;
        if (this.field4965 == null) {
            if (var2.field4965 != null) {
                return false;
            }
        } else if (!this.field4965.equals(var2.field4965)) {
            return false;
        }
        if (this.field4963 == null) {
            if (var2.field4963 != null) {
                return false;
            }
        } else if (!this.field4963.equals(var2.field4963)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field4965 != null) {
            var1 += this.field4965.hashCode();
        }
        if (this.field4963 != null) {
            var1 += 31 * this.field4963.hashCode();
        }
        return var1;
    }
}
