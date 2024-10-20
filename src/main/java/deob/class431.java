package deob;

@ObfuscatedName("qv")
public class class431 {

    @ObfuscatedName("qv.az")
    public int field4665;

    @ObfuscatedName("qv.ah")
    public int field4669;

    @ObfuscatedName("qv.af")
    public int field4667;

    @ObfuscatedName("qv.at")
    public int field4668;

    public class431() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4665).length();
        int var3 = 10 - Integer.toString(this.field4667).length();
        int var4 = 10 - Integer.toString(this.field4669).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4665 + var5 + "Created: " + this.field4669 + var7 + "Total used: " + this.field4667 + var6 + "Max-In-Use: " + this.field4668;
    }
}
