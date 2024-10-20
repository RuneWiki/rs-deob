package deob;

@ObfuscatedName("rg")
public class class448 {

    @ObfuscatedName("rg.ak")
    public int field4808;

    @ObfuscatedName("rg.al")
    public int field4807;

    @ObfuscatedName("rg.aj")
    public int field4806;

    @ObfuscatedName("rg.az")
    public int field4809;

    public class448() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4808).length();
        int var3 = 10 - Integer.toString(this.field4806).length();
        int var4 = 10 - Integer.toString(this.field4807).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4808 + var5 + "Created: " + this.field4807 + var7 + "Total used: " + this.field4806 + var6 + "Max-In-Use: " + this.field4809;
    }
}
