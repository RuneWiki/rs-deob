package deob;

@ObfuscatedName("tg")
public class class502 {

    @ObfuscatedName("tg.am")
    public final Object field5042;

    @ObfuscatedName("tg.ap")
    public final Object field5043;

    public class502(Object arg0, Object arg1) {
        this.field5042 = arg0;
        this.field5043 = arg1;
    }

    public String toString() {
        return this.field5042 + ", " + this.field5043;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class502) {
            return false;
        }
        class502 var2 = (class502) arg0;
        if (this.field5042 == null) {
            if (var2.field5042 != null) {
                return false;
            }
        } else if (!this.field5042.equals(var2.field5042)) {
            return false;
        }
        if (this.field5043 == null) {
            if (var2.field5043 != null) {
                return false;
            }
        } else if (!this.field5043.equals(var2.field5043)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field5042 != null) {
            var1 += this.field5042.hashCode();
        }
        if (this.field5043 != null) {
            var1 += 31 * this.field5043.hashCode();
        }
        return var1;
    }
}
