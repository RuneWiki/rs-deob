package deob;

@ObfuscatedName("qx")
public class class448 {

    @ObfuscatedName("qx.o")
    public final int field4742;

    @ObfuscatedName("qx.q")
    public Object field4743;

    public class448(int arg0) {
        this.field4742 = arg0;
    }

    public class448(int arg0, Object arg1) {
        this.field4742 = arg0;
        this.field4743 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class448)) {
            return false;
        }
        class448 var2 = (class448) arg0;
        if (var2.field4743 == null && this.field4743 != null) {
            return false;
        } else if (this.field4743 == null && var2.field4743 != null) {
            return false;
        } else {
            return this.field4742 == var2.field4742 && var2.field4743.equals(this.field4743);
        }
    }
}
