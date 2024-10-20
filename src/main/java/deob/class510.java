package deob;

@ObfuscatedName("ts")
public class class510 {

    @ObfuscatedName("ts.at")
    public final int field5085;

    @ObfuscatedName("ts.an")
    public Object field5084;

    public class510(int arg0) {
        this.field5085 = arg0;
    }

    public class510(int arg0, Object arg1) {
        this.field5085 = arg0;
        this.field5084 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class510)) {
            return false;
        }
        class510 var2 = (class510) arg0;
        if (var2.field5084 == null && this.field5084 != null) {
            return false;
        } else if (this.field5084 == null && var2.field5084 != null) {
            return false;
        } else {
            return this.field5085 == var2.field5085 && var2.field5084.equals(this.field5084);
        }
    }
}
