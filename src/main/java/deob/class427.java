package deob;

@ObfuscatedName("qi")
public class class427 {

    @ObfuscatedName("qi.am")
    public int field4608;

    @ObfuscatedName("qi.ap")
    public int field4611;

    @ObfuscatedName("qi.af")
    public int field4607;

    @ObfuscatedName("qi.aj")
    public int field4610;

    public class427() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4608).length();
        int var3 = 10 - Integer.toString(this.field4607).length();
        int var4 = 10 - Integer.toString(this.field4611).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4608 + var5 + "Created: " + this.field4611 + var7 + "Total used: " + this.field4607 + var6 + "Max-In-Use: " + this.field4610;
    }
}
