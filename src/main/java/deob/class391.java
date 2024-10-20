package deob;

@ObfuscatedName("oc")
public class class391 {

    @ObfuscatedName("oc.v")
    public final int field4220;

    @ObfuscatedName("oc.n")
    public Object field4219;

    public class391(int arg0) {
        this.field4220 = arg0;
    }

    public class391(int arg0, Object arg1) {
        this.field4220 = arg0;
        this.field4219 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class391)) {
            return false;
        }
        class391 var2 = (class391) arg0;
        if (var2.field4219 == null && this.field4219 != null) {
            return false;
        } else if (this.field4219 == null && var2.field4219 != null) {
            return false;
        } else {
            return this.field4220 == var2.field4220 && var2.field4219.equals(this.field4219);
        }
    }
}
