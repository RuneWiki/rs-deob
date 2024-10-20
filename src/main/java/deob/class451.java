package deob;

@ObfuscatedName("qr")
public class class451 {

    @ObfuscatedName("qr.c")
    public final int field4766;

    @ObfuscatedName("qr.v")
    public Object field4767;

    public class451(int arg0) {
        this.field4766 = arg0;
    }

    public class451(int arg0, Object arg1) {
        this.field4766 = arg0;
        this.field4767 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class451)) {
            return false;
        }
        class451 var2 = (class451) arg0;
        if (var2.field4767 == null && this.field4767 != null) {
            return false;
        } else if (this.field4767 == null && var2.field4767 != null) {
            return false;
        } else {
            return this.field4766 == var2.field4766 && var2.field4767.equals(this.field4767);
        }
    }
}
