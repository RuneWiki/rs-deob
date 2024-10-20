package deob;

@ObfuscatedName("pg")
public class class441 {

    @ObfuscatedName("pg.h")
    public final Object field4812;

    @ObfuscatedName("pg.e")
    public final Object field4810;

    public class441(Object arg0, Object arg1) {
        this.field4812 = arg0;
        this.field4810 = arg1;
    }

    public String toString() {
        return this.field4812 + ", " + this.field4810;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class441) {
            return false;
        }
        class441 var2 = (class441) arg0;
        if (this.field4812 == null) {
            if (var2.field4812 != null) {
                return false;
            }
        } else if (!this.field4812.equals(var2.field4812)) {
            return false;
        }
        if (this.field4810 == null) {
            if (var2.field4810 != null) {
                return false;
            }
        } else if (!this.field4810.equals(var2.field4810)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field4812 != null) {
            var1 += this.field4812.hashCode();
        }
        if (this.field4810 != null) {
            var1 += 31 * this.field4810.hashCode();
        }
        return var1;
    }
}
