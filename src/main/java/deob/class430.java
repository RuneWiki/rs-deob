package deob;

@ObfuscatedName("qc")
public class class430 {

    @ObfuscatedName("qc.aq")
    public int field4638;

    @ObfuscatedName("qc.aw")
    public int field4643;

    @ObfuscatedName("qc.al")
    public int field4640;

    @ObfuscatedName("qc.ai")
    public int field4641;

    public class430() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4638).length();
        int var3 = 10 - Integer.toString(this.field4640).length();
        int var4 = 10 - Integer.toString(this.field4643).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4638 + var5 + "Created: " + this.field4643 + var7 + "Total used: " + this.field4640 + var6 + "Max-In-Use: " + this.field4641;
    }
}
