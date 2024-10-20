package deob;

@ObfuscatedName("rx")
public class class450 {

    @ObfuscatedName("rx.ab")
    public int field4812;

    @ObfuscatedName("rx.ay")
    public int field4809;

    @ObfuscatedName("rx.an")
    public int field4808;

    @ObfuscatedName("rx.au")
    public int field4810;

    public class450() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4812).length();
        int var3 = 10 - Integer.toString(this.field4808).length();
        int var4 = 10 - Integer.toString(this.field4809).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4812 + var5 + "Created: " + this.field4809 + var7 + "Total used: " + this.field4808 + var6 + "Max-In-Use: " + this.field4810;
    }
}
