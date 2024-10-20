package deob;

@ObfuscatedName("td")
public class class506 {

    @ObfuscatedName("td.az")
    public final Object field5091;

    @ObfuscatedName("td.ah")
    public final Object field5090;

    public class506(Object arg0, Object arg1) {
        this.field5091 = arg0;
        this.field5090 = arg1;
    }

    public String toString() {
        return this.field5091 + ", " + this.field5090;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class506) {
            return false;
        }
        class506 var2 = (class506) arg0;
        if (this.field5091 == null) {
            if (var2.field5091 != null) {
                return false;
            }
        } else if (!this.field5091.equals(var2.field5091)) {
            return false;
        }
        if (this.field5090 == null) {
            if (var2.field5090 != null) {
                return false;
            }
        } else if (!this.field5090.equals(var2.field5090)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field5091 != null) {
            var1 += this.field5091.hashCode();
        }
        if (this.field5090 != null) {
            var1 += 31 * this.field5090.hashCode();
        }
        return var1;
    }
}
