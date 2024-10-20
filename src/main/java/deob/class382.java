package deob;

@ObfuscatedName("oc")
public class class382 {

    @ObfuscatedName("oc.aj")
    public int field4412;

    @ObfuscatedName("oc.al")
    public int field4410;

    @ObfuscatedName("oc.ac")
    public int field4409;

    @ObfuscatedName("oc.ab")
    public int field4411;

    public class382() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4412).length();
        int var3 = 10 - Integer.toString(this.field4409).length();
        int var4 = 10 - Integer.toString(this.field4410).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4412 + var5 + "Created: " + this.field4410 + var7 + "Total used: " + this.field4409 + var6 + "Max-In-Use: " + this.field4411;
    }
}
