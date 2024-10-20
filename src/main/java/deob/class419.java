package deob;

@ObfuscatedName("qe")
public class class419 {

    @ObfuscatedName("qe.aq")
    public class424 field4682 = new class424();

    @ObfuscatedName("qe.ad")
    public class423 field4683 = new class423();

    @ObfuscatedName("qe.ag")
    public class423 field4685 = new class423(1.0F, 1.0F, 1.0F);

    public String toString() {
        return "[" + this.field4682.toString() + "|" + this.field4683.toString() + "|" + this.field4685.toString() + "]";
    }

    public boolean equals(Object arg0) {
        if (arg0 == null) {
            return false;
        } else if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class419)) {
            class419 var2 = (class419) arg0;
            return this.field4682.equals(var2.field4682) && this.field4683.method7069(var2.field4683) && this.field4685.method7069(var2.field4685);
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        byte var2 = 1;
        int var3 = var2 * 31 + this.field4682.hashCode();
        int var4 = var3 * 31 + this.field4683.hashCode();
        return var4 * 31 + this.field4685.hashCode();
    }
}
