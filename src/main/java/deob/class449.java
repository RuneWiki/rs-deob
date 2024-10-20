package deob;

@ObfuscatedName("rh")
public class class449 {

    @ObfuscatedName("rh.aq")
    public int field4826;

    @ObfuscatedName("rh.ad")
    public int field4824;

    @ObfuscatedName("rh.ag")
    public int field4825;

    @ObfuscatedName("rh.ak")
    public int field4823;

    public class449() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4826).length();
        int var3 = 10 - Integer.toString(this.field4825).length();
        int var4 = 10 - Integer.toString(this.field4824).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4826 + var5 + "Created: " + this.field4824 + var7 + "Total used: " + this.field4825 + var6 + "Max-In-Use: " + this.field4823;
    }
}
