package deob;

@ObfuscatedName("ql")
public class class453 {

    @ObfuscatedName("ql.c")
    public final int field4797;

    @ObfuscatedName("ql.p")
    public Object field4798;

    public class453(int arg0) {
        this.field4797 = arg0;
    }

    public class453(int arg0, Object arg1) {
        this.field4797 = arg0;
        this.field4798 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class453)) {
            return false;
        }
        class453 var2 = (class453) arg0;
        if (var2.field4798 == null && this.field4798 != null) {
            return false;
        } else if (this.field4798 == null && var2.field4798 != null) {
            return false;
        } else {
            return this.field4797 == var2.field4797 && var2.field4798.equals(this.field4798);
        }
    }
}
