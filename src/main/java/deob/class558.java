package deob;

@ObfuscatedName("vy")
public class class558 {

    @ObfuscatedName("vy.ab")
    public final int field5445;

    @ObfuscatedName("vy.ay")
    public Object field5446;

    public class558(int arg0) {
        this.field5445 = arg0;
    }

    public class558(int arg0, Object arg1) {
        this.field5445 = arg0;
        this.field5446 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class558)) {
            return false;
        }
        class558 var2 = (class558) arg0;
        if (var2.field5446 == null && this.field5446 != null) {
            return false;
        } else if (this.field5446 == null && var2.field5446 != null) {
            return false;
        } else {
            return this.field5445 == var2.field5445 && var2.field5446.equals(this.field5446);
        }
    }
}
