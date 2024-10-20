package deob;

@ObfuscatedName("oo")
public class class386 {

    @ObfuscatedName("oo.af")
    public int field4460;

    @ObfuscatedName("oo.an")
    public int field4462;

    @ObfuscatedName("oo.aw")
    public int field4461;

    @ObfuscatedName("oo.ac")
    public int field4459;

    public class386() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4460).length();
        int var3 = 10 - Integer.toString(this.field4461).length();
        int var4 = 10 - Integer.toString(this.field4462).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4460 + var5 + "Created: " + this.field4462 + var7 + "Total used: " + this.field4461 + var6 + "Max-In-Use: " + this.field4459;
    }
}
