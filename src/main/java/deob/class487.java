package deob;

@ObfuscatedName("sj")
public class class487 {

    @ObfuscatedName("sj.aj")
    public final int field4968;

    @ObfuscatedName("sj.al")
    public Object field4967;

    public class487(int arg0) {
        this.field4968 = arg0;
    }

    public class487(int arg0, Object arg1) {
        this.field4968 = arg0;
        this.field4967 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class487)) {
            return false;
        }
        class487 var2 = (class487) arg0;
        if (var2.field4967 == null && this.field4967 != null) {
            return false;
        } else if (this.field4967 == null && var2.field4967 != null) {
            return false;
        } else {
            return this.field4968 == var2.field4968 && var2.field4967.equals(this.field4967);
        }
    }
}
