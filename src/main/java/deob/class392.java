package deob;

@ObfuscatedName("oo")
public class class392 {

    @ObfuscatedName("oo.f")
    public final int field4227;

    @ObfuscatedName("oo.e")
    public Object field4228;

    public class392(int arg0) {
        this.field4227 = arg0;
    }

    public class392(int arg0, Object arg1) {
        this.field4227 = arg0;
        this.field4228 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class392)) {
            return false;
        }
        class392 var2 = (class392) arg0;
        if (var2.field4228 == null && this.field4228 != null) {
            return false;
        } else if (this.field4228 == null && var2.field4228 != null) {
            return false;
        } else {
            return this.field4227 == var2.field4227 && var2.field4228.equals(this.field4228);
        }
    }
}
