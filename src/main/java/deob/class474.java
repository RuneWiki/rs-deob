package deob;

@ObfuscatedName("sf")
public class class474 {

    @ObfuscatedName("sf.at")
    public final Object field4904;

    @ObfuscatedName("sf.an")
    public final Object field4905;

    public class474(Object arg0, Object arg1) {
        this.field4904 = arg0;
        this.field4905 = arg1;
    }

    public String toString() {
        return this.field4904 + ", " + this.field4905;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !arg0 instanceof class474) {
            return false;
        }
        class474 var2 = (class474) arg0;
        if (this.field4904 == null) {
            if (var2.field4904 != null) {
                return false;
            }
        } else if (!this.field4904.equals(var2.field4904)) {
            return false;
        }
        if (this.field4905 == null) {
            if (var2.field4905 != null) {
                return false;
            }
        } else if (!this.field4905.equals(var2.field4905)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.field4904 != null) {
            var1 += this.field4904.hashCode();
        }
        if (this.field4905 != null) {
            var1 += 31 * this.field4905.hashCode();
        }
        return var1;
    }
}
