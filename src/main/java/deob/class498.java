package deob;

@ObfuscatedName("ti")
public class class498 {

    @ObfuscatedName("ti.at")
    public final Object field4997;

    @ObfuscatedName("ti.ah")
    public final Object field4998;

    public class498(Object arg0, Object arg1) {
        this.field4997 = arg0;
        this.field4998 = arg1;
    }

    public String toString() {
        return this.field4997 + ", " + this.field4998;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class498) {
            return false;
        }
        class498 var2 = (class498) arg0;
        if (this.field4997 == null) {
            if (var2.field4997 != null) {
                return false;
            }
        } else if (!this.field4997.equals(var2.field4997)) {
            return false;
        }
        if (this.field4998 == null) {
            if (var2.field4998 != null) {
                return false;
            }
        } else if (!this.field4998.equals(var2.field4998)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field4997 != null) {
            var1 += this.field4997.hashCode();
        }
        if (this.field4998 != null) {
            var1 += 31 * this.field4998.hashCode();
        }
        return var1;
    }
}
