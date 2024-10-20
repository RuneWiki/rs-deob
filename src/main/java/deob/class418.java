package deob;

@ObfuscatedName("qd")
public class class418 {

    @ObfuscatedName("qd.ak")
    public class423 field4668 = new class423();

    @ObfuscatedName("qd.al")
    public class422 field4669 = new class422();

    @ObfuscatedName("qd.aj")
    public class422 field4670 = new class422(1.0F, 1.0F, 1.0F);

    public String toString() {
        return "[" + this.field4668.toString() + "|" + this.field4669.toString() + "|" + this.field4670.toString() + "]";
    }

    public boolean equals(Object arg0) {
        if (arg0 == null) {
            return false;
        } else if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class418)) {
            class418 var2 = (class418) arg0;
            return this.field4668.equals(var2.field4668) && this.field4669.method7124(var2.field4669) && this.field4670.method7124(var2.field4670);
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        byte var2 = 1;
        int var3 = var2 * 31 + this.field4668.hashCode();
        int var4 = var3 * 31 + this.field4669.hashCode();
        return var4 * 31 + this.field4670.hashCode();
    }
}
