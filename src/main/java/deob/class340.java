package deob;

@ObfuscatedName("mt")
public class class340 {

    @ObfuscatedName("mt.c")
    public int field4067;

    @ObfuscatedName("mt.l")
    public int field4066;

    @ObfuscatedName("mt.s")
    public int field4064;

    @ObfuscatedName("mt.e")
    public int field4065;

    public class340() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4067).length();
        int var3 = 10 - Integer.toString(this.field4064).length();
        int var4 = 10 - Integer.toString(this.field4066).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4067 + var5 + "Created: " + this.field4066 + var7 + "Total used: " + this.field4064 + var6 + "Max-In-Use: " + this.field4065;
    }
}
