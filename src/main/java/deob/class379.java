package deob;

@ObfuscatedName("na")
public class class379 {

    @ObfuscatedName("na.f")
    public int field4443;

    @ObfuscatedName("na.w")
    public int field4439;

    @ObfuscatedName("na.v")
    public int field4440;

    @ObfuscatedName("na.s")
    public int field4442;

    public class379() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4443).length();
        int var3 = 10 - Integer.toString(this.field4440).length();
        int var4 = 10 - Integer.toString(this.field4439).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4443 + var5 + "Created: " + this.field4439 + var7 + "Total used: " + this.field4440 + var6 + "Max-In-Use: " + this.field4442;
    }
}
