package deob;

@ObfuscatedName("rv")
public class class452 {

    @ObfuscatedName("rv.aj")
    public final Object field4799;

    @ObfuscatedName("rv.al")
    public final Object field4800;

    public class452(Object arg0, Object arg1) {
        this.field4799 = arg0;
        this.field4800 = arg1;
    }

    public String toString() {
        return this.field4799 + ", " + this.field4800;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class452) {
            return false;
        }
        class452 var2 = (class452) arg0;
        if (this.field4799 == null) {
            if (var2.field4799 != null) {
                return false;
            }
        } else if (!this.field4799.equals(var2.field4799)) {
            return false;
        }
        if (this.field4800 == null) {
            if (var2.field4800 != null) {
                return false;
            }
        } else if (!this.field4800.equals(var2.field4800)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field4799 != null) {
            var1 += this.field4799.hashCode();
        }
        if (this.field4800 != null) {
            var1 += 31 * this.field4800.hashCode();
        }
        return var1;
    }
}
