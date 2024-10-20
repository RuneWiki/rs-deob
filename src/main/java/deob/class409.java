package deob;

@ObfuscatedName("ov")
public class class409 {

    @ObfuscatedName("ov.i")
    public final int field4364;

    @ObfuscatedName("ov.w")
    public Object field4362;

    public class409(int arg0) {
        this.field4364 = arg0;
    }

    public class409(int arg0, Object arg1) {
        this.field4364 = arg0;
        this.field4362 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class409)) {
            return false;
        }
        class409 var2 = (class409) arg0;
        if (var2.field4362 == null && this.field4362 != null) {
            return false;
        } else if (this.field4362 == null && var2.field4362 != null) {
            return false;
        } else {
            return this.field4364 == var2.field4364 && var2.field4362.equals(this.field4362);
        }
    }
}
