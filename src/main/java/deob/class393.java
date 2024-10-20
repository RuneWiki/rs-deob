package deob;

@ObfuscatedName("ok")
public class class393 {

    @ObfuscatedName("ok.s")
    public final int field4241;

    @ObfuscatedName("ok.t")
    public Object field4242;

    public class393(int arg0) {
        this.field4241 = arg0;
    }

    public class393(int arg0, Object arg1) {
        this.field4241 = arg0;
        this.field4242 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class393)) {
            return false;
        }
        class393 var2 = (class393) arg0;
        if (var2.field4242 == null && this.field4242 != null) {
            return false;
        } else if (this.field4242 == null && var2.field4242 != null) {
            return false;
        } else {
            return this.field4241 == var2.field4241 && var2.field4242.equals(this.field4242);
        }
    }
}
