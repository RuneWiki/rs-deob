package deob;

@ObfuscatedName("uz")
public class class544 {

    @ObfuscatedName("uz.az")
    public final int field5300;

    @ObfuscatedName("uz.ah")
    public Object field5301;

    public class544(int arg0) {
        this.field5300 = arg0;
    }

    public class544(int arg0, Object arg1) {
        this.field5300 = arg0;
        this.field5301 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class544)) {
            return false;
        }
        class544 var2 = (class544) arg0;
        if (var2.field5301 == null && this.field5301 != null) {
            return false;
        } else if (this.field5301 == null && var2.field5301 != null) {
            return false;
        } else {
            return this.field5300 == var2.field5300 && var2.field5301.equals(this.field5301);
        }
    }
}
