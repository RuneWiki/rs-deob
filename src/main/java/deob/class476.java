package deob;

@ObfuscatedName("rz")
public class class476 {

    @ObfuscatedName("rz.h")
    public final int field4981;

    @ObfuscatedName("rz.e")
    public Object field4982;

    public class476(int arg0) {
        this.field4981 = arg0;
    }

    public class476(int arg0, Object arg1) {
        this.field4981 = arg0;
        this.field4982 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class476)) {
            return false;
        }
        class476 var2 = (class476) arg0;
        if (var2.field4982 == null && this.field4982 != null) {
            return false;
        } else if (this.field4982 == null && var2.field4982 != null) {
            return false;
        } else {
            return this.field4981 == var2.field4981 && var2.field4982.equals(this.field4982);
        }
    }
}
