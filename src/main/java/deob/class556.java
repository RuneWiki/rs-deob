package deob;

@ObfuscatedName("vt")
public class class556 {

    @ObfuscatedName("vt.aq")
    public final int field5429;

    @ObfuscatedName("vt.ad")
    public Object field5430;

    public class556(int arg0) {
        this.field5429 = arg0;
    }

    public class556(int arg0, Object arg1) {
        this.field5429 = arg0;
        this.field5430 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class556)) {
            return false;
        }
        class556 var2 = (class556) arg0;
        if (var2.field5430 == null && this.field5430 != null) {
            return false;
        } else if (this.field5430 == null && var2.field5430 != null) {
            return false;
        } else {
            return this.field5429 == var2.field5429 && var2.field5430.equals(this.field5430);
        }
    }
}
