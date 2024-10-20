package deob;

@ObfuscatedName("vu")
public class class560 {

    @ObfuscatedName("vu.ac")
    public final int field5480;

    @ObfuscatedName("vu.ae")
    public Object field5481;

    public class560(int arg0) {
        this.field5480 = arg0;
    }

    public class560(int arg0, Object arg1) {
        this.field5480 = arg0;
        this.field5481 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class560)) {
            return false;
        }
        class560 var2 = (class560) arg0;
        if (var2.field5481 == null && this.field5481 != null) {
            return false;
        } else if (this.field5481 == null && var2.field5481 != null) {
            return false;
        } else {
            return this.field5480 == var2.field5480 && var2.field5481.equals(this.field5481);
        }
    }
}
