package deob;

@ObfuscatedName("uy")
public class class528 {

    @ObfuscatedName("uy.ap")
    public final Object field5317;

    @ObfuscatedName("uy.aw")
    public final Object field5318;

    public class528(Object arg0, Object arg1) {
        this.field5317 = arg0;
        this.field5318 = arg1;
    }

    public String toString() {
        return this.field5317 + ", " + this.field5318;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class528) {
            return false;
        }
        class528 var2 = (class528) arg0;
        if (this.field5317 == null) {
            if (var2.field5317 != null) {
                return false;
            }
        } else if (!this.field5317.equals(var2.field5317)) {
            return false;
        }
        if (this.field5318 == null) {
            if (var2.field5318 != null) {
                return false;
            }
        } else if (!this.field5318.equals(var2.field5318)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field5317 != null) {
            var1 += this.field5317.hashCode();
        }
        if (this.field5318 != null) {
            var1 += 31 * this.field5318.hashCode();
        }
        return var1;
    }
}
