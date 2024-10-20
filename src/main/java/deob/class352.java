package deob;

@ObfuscatedName("ma")
public class class352 {

    @ObfuscatedName("ma.c")
    public int field4198;

    @ObfuscatedName("ma.v")
    public int field4194;

    @ObfuscatedName("ma.q")
    public int field4196;

    @ObfuscatedName("ma.f")
    public int field4197;

    public class352() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4198).length();
        int var3 = 10 - Integer.toString(this.field4196).length();
        int var4 = 10 - Integer.toString(this.field4194).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4198 + var5 + "Created: " + this.field4194 + var7 + "Total used: " + this.field4196 + var6 + "Max-In-Use: " + this.field4197;
    }
}
