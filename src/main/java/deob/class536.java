package deob;

@ObfuscatedName("ux")
public class class536 {

    @ObfuscatedName("ux.at")
    public final int field5205;

    @ObfuscatedName("ux.ah")
    public Object field5206;

    public class536(int arg0) {
        this.field5205 = arg0;
    }

    public class536(int arg0, Object arg1) {
        this.field5205 = arg0;
        this.field5206 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class536)) {
            return false;
        }
        class536 var2 = (class536) arg0;
        if (var2.field5206 == null && this.field5206 != null) {
            return false;
        } else if (this.field5206 == null && var2.field5206 != null) {
            return false;
        } else {
            return this.field5205 == var2.field5205 && var2.field5206.equals(this.field5206);
        }
    }
}
