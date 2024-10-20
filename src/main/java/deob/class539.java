package deob;

@ObfuscatedName("ut")
public class class539 {

    @ObfuscatedName("ut.ac")
    public final int field5206;

    @ObfuscatedName("ut.al")
    public Object field5205;

    public class539(int arg0) {
        this.field5206 = arg0;
    }

    public class539(int arg0, Object arg1) {
        this.field5206 = arg0;
        this.field5205 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class539)) {
            return false;
        }
        class539 var2 = (class539) arg0;
        if (var2.field5205 == null && this.field5205 != null) {
            return false;
        } else if (this.field5205 == null && var2.field5205 != null) {
            return false;
        } else {
            return this.field5206 == var2.field5206 && var2.field5205.equals(this.field5205);
        }
    }
}
