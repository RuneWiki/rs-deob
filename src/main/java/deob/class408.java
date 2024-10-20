package deob;

@ObfuscatedName("og")
public class class408 {

    @ObfuscatedName("og.n")
    public final int field4340;

    @ObfuscatedName("og.c")
    public Object field4341;

    public class408(int arg0) {
        this.field4340 = arg0;
    }

    public class408(int arg0, Object arg1) {
        this.field4340 = arg0;
        this.field4341 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class408)) {
            return false;
        }
        class408 var2 = (class408) arg0;
        if (var2.field4341 == null && this.field4341 != null) {
            return false;
        } else if (this.field4341 == null && var2.field4341 != null) {
            return false;
        } else {
            return this.field4340 == var2.field4340 && var2.field4341.equals(this.field4341);
        }
    }
}
