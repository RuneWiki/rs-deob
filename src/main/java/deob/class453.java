package deob;

@ObfuscatedName("rh")
public class class453 {

    @ObfuscatedName("rh.ap")
    public int field4896;

    @ObfuscatedName("rh.aw")
    public int field4895;

    @ObfuscatedName("rh.ak")
    public int field4894;

    @ObfuscatedName("rh.aj")
    public int field4897;

    public class453() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4896).length();
        int var3 = 10 - Integer.toString(this.field4894).length();
        int var4 = 10 - Integer.toString(this.field4895).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4896 + var5 + "Created: " + this.field4895 + var7 + "Total used: " + this.field4894 + var6 + "Max-In-Use: " + this.field4897;
    }
}
