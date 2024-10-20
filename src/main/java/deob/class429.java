package deob;

@ObfuscatedName("po")
public class class429 {

    @ObfuscatedName("po.c")
    public final int field4577;

    @ObfuscatedName("po.l")
    public Object field4576;

    public class429(int arg0) {
        this.field4577 = arg0;
    }

    public class429(int arg0, Object arg1) {
        this.field4577 = arg0;
        this.field4576 = arg1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class429)) {
            return false;
        }
        class429 var2 = (class429) arg0;
        if (var2.field4576 == null && this.field4576 != null) {
            return false;
        } else if (this.field4576 == null && var2.field4576 != null) {
            return false;
        } else {
            return this.field4577 == var2.field4577 && var2.field4576.equals(this.field4576);
        }
    }
}
