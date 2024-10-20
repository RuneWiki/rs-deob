package deob;

@ObfuscatedName("qp")
public class class452 {

    @ObfuscatedName("qp.s")
    public final int field4770;

    @ObfuscatedName("qp.h")
    public Object field4769;

    public class452(int arg0) {
        this.field4770 = arg0;
    }

    public class452(int arg0, Object arg1) {
        this.field4770 = arg0;
        this.field4769 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class452)) {
            return false;
        }
        class452 var2 = (class452) arg0;
        if (var2.field4769 == null && this.field4769 != null) {
            return false;
        } else if (this.field4769 == null && var2.field4769 != null) {
            return false;
        } else {
            return this.field4770 == var2.field4770 && var2.field4769.equals(this.field4769);
        }
    }
}
