package deob;

@ObfuscatedName("qd")
public class class446 {

    @ObfuscatedName("qd.v")
    public final int field4684;

    @ObfuscatedName("qd.c")
    public Object field4682;

    public class446(int arg0) {
        this.field4684 = arg0;
    }

    public class446(int arg0, Object arg1) {
        this.field4684 = arg0;
        this.field4682 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class446)) {
            return false;
        }
        class446 var2 = (class446) arg0;
        if (var2.field4682 == null && this.field4682 != null) {
            return false;
        } else if (this.field4682 == null && var2.field4682 != null) {
            return false;
        } else {
            return this.field4684 == var2.field4684 && var2.field4682.equals(this.field4682);
        }
    }
}
