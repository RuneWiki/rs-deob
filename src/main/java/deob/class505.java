package deob;

@ObfuscatedName("th")
public class class505 {

    @ObfuscatedName("th.aq")
    public final Object field5064;

    @ObfuscatedName("th.aw")
    public final Object field5065;

    public class505(Object arg0, Object arg1) {
        this.field5064 = arg0;
        this.field5065 = arg1;
    }

    public String toString() {
        return this.field5064 + ", " + this.field5065;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class505) {
            return false;
        }
        class505 var2 = (class505) arg0;
        if (this.field5064 == null) {
            if (var2.field5064 != null) {
                return false;
            }
        } else if (!this.field5064.equals(var2.field5064)) {
            return false;
        }
        if (this.field5065 == null) {
            if (var2.field5065 != null) {
                return false;
            }
        } else if (!this.field5065.equals(var2.field5065)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field5064 != null) {
            var1 += this.field5064.hashCode();
        }
        if (this.field5065 != null) {
            var1 += 31 * this.field5065.hashCode();
        }
        return var1;
    }
}
