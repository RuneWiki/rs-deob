package deob;

@ObfuscatedName("rx")
public class class452 {

    @ObfuscatedName("rx.ac")
    public int field4854;

    @ObfuscatedName("rx.ae")
    public int field4853;

    @ObfuscatedName("rx.ag")
    public int field4855;

    @ObfuscatedName("rx.am")
    public int field4856;

    public class452() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4854).length();
        int var3 = 10 - Integer.toString(this.field4855).length();
        int var4 = 10 - Integer.toString(this.field4853).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4854 + var5 + "Created: " + this.field4853 + var7 + "Total used: " + this.field4855 + var6 + "Max-In-Use: " + this.field4856;
    }
}
