package deob;

@ObfuscatedName("tj")
public class class519 {

    @ObfuscatedName("tj.ab")
    public final Object field5230;

    @ObfuscatedName("tj.ay")
    public final Object field5228;

    public class519(Object arg0, Object arg1) {
        this.field5230 = arg0;
        this.field5228 = arg1;
    }

    public String toString() {
        return this.field5230 + ", " + this.field5228;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class519) {
            return false;
        }
        class519 var2 = (class519) arg0;
        if (this.field5230 == null) {
            if (var2.field5230 != null) {
                return false;
            }
        } else if (!this.field5230.equals(var2.field5230)) {
            return false;
        }
        if (this.field5228 == null) {
            if (var2.field5228 != null) {
                return false;
            }
        } else if (!this.field5228.equals(var2.field5228)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field5230 != null) {
            var1 += this.field5230.hashCode();
        }
        if (this.field5228 != null) {
            var1 += 31 * this.field5228.hashCode();
        }
        return var1;
    }
}
